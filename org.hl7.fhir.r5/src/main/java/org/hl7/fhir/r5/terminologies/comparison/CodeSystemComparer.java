package org.hl7.fhir.r5.terminologies.comparison;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionDesignationComponent;
import org.hl7.fhir.r5.model.CodeSystem.ConceptPropertyComponent;
import org.hl7.fhir.r5.model.CodeSystem.PropertyComponent;
import org.hl7.fhir.r5.utilities.StructuralMatch;
import org.hl7.fhir.utilities.CommaSeparatedStringBuilder;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.xhtml.HierarchicalTableGenerator;
import org.hl7.fhir.utilities.xhtml.XhtmlNode;
import org.hl7.fhir.utilities.xhtml.HierarchicalTableGenerator.TableModel;
import org.hl7.fhir.utilities.xhtml.HierarchicalTableGenerator.Title;

public class CodeSystemComparer {

  private IWorkerContext context;
  private Map<String, String> propMap = new HashMap<>(); // right to left; left retains it's name 
  private CodeSystem right;
  
  public CodeSystemComparer(IWorkerContext context) {
    super();
    this.context = context;
  }

  public CodeSystemComparison compare(CodeSystem left, CodeSystem right) {    
    CodeSystemComparison res = new CodeSystemComparison(left, right);
    CodeSystem cs = new CodeSystem();
    res.setUnion(cs);
    cs.setId(UUID.randomUUID().toString().toLowerCase());
    cs.setUrl("urn:uuid:"+cs.getId());
    cs.setName("Union"+left.getName()+"And"+right.getName());
    cs.setTitle("Union of "+left.getTitle()+" And "+right.getTitle());
    cs.setStatus(left.getStatus());
    cs.setDate(new Date());
    for (PropertyComponent pL : left.getProperty()) {
      cs.addProperty(pL.copy());
    }
    for (PropertyComponent pR : left.getProperty()) {
      PropertyComponent pL = findProperty(left, pR);
      if (pL == null) {
        String code = getUniqued(pR.getCode(), cs.getProperty());
        cs.addProperty(pR.copy().setCode(code));
      } else {
        propMap.put(pR.getCode(), pL.getCode());
      }
    }
    
    CodeSystem cs1 = new CodeSystem();
    res.setIntersection(cs1);
    cs1.setId(UUID.randomUUID().toString().toLowerCase());
    cs1.setUrl("urn:uuid:"+cs1.getId());
    cs1.setName("Intersection"+left.getName()+"And"+right.getName());
    cs1.setTitle("Intersection of "+left.getTitle()+" And "+right.getTitle());
    cs1.setStatus(left.getStatus());
    cs1.setDate(new Date());
    cs1.getProperty().addAll(cs.getProperty());
    
    compareConcepts(left.getConcept(), right.getConcept(), res.getCombined(), res.getUnion().getConcept(), res.getIntersection().getConcept(), res.getUnion(), res.getIntersection());
    return res;
  }
  
  private String getUniqued(String code, List<PropertyComponent> list) {
    int i = 0;
    while (true) {
      boolean ok = true;
      String res = code+(i == 0 ? "" : i);
      for (PropertyComponent t : list) {
        if (res.equals(t.getCode())) {
          ok = false;
        }
      }
      if (ok) {
        return res;
      }
    }
  }

  private PropertyComponent findProperty(CodeSystem left, PropertyComponent p) {
    for (PropertyComponent t : left.getProperty()) {
      if (p.hasUri() && t.hasUri() && p.getUri().equals(t.getUri())) {
        return t;
      } else if (!p.hasUri() && !t.hasUri() && p.getCode().equals(t.getCode())) {
        return t;
      }
    }
    return null;
  }

  
  private void compareConcepts(List<ConceptDefinitionComponent> left, List<ConceptDefinitionComponent> right, StructuralMatch<ConceptDefinitionComponent> combined, 
      List<ConceptDefinitionComponent> union, List<ConceptDefinitionComponent> intersection, CodeSystem csU, CodeSystem csI) {
    List<ConceptDefinitionComponent> matchR = new ArrayList<>();
    for (ConceptDefinitionComponent l : left) {
      ConceptDefinitionComponent r = findInList(right, l);
      if (r == null) {
        union.add(l);
        combined.getChildren().add(new StructuralMatch<CodeSystem.ConceptDefinitionComponent>(l, "no Match Found"));
      } else {
        matchR.add(r);
        ConceptDefinitionComponent cdM = merge(l, r, csU.getProperty());
        ConceptDefinitionComponent cdI = intersect(l, r);
        union.add(cdM);
        intersection.add(cdI);
        StructuralMatch<ConceptDefinitionComponent> sm = new StructuralMatch<CodeSystem.ConceptDefinitionComponent>(l, r, compare(l, r));
        combined.getChildren().add(sm);
        compareConcepts(l.getConcept(), r.getConcept(), sm, cdM.getConcept(), cdI.getConcept(), csU, csI);
      }
    }
    for (ConceptDefinitionComponent r : right) {
      if (!matchR.contains(r)) {
        union.add(r);
        combined.getChildren().add(new StructuralMatch<CodeSystem.ConceptDefinitionComponent>("no Match Found", r));        
      }
    }
  }

  private ConceptDefinitionComponent findInList(List<ConceptDefinitionComponent> list, ConceptDefinitionComponent item) {
    for (ConceptDefinitionComponent t : list) {
      if (t.getCode().equals(item.getCode())) {
        return t;
      }
    }
    return null;
  }
  
  private String compare(ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
    CommaSeparatedStringBuilder b = new CommaSeparatedStringBuilder();
    compareStrings(b, l.getDisplay(), r.getDisplay(), "display");
    compareStrings(b, l.getDefinition(), r.getDefinition(), "definition");    
    return b.toString();
  }

  private void compareStrings(CommaSeparatedStringBuilder b, String left, String right, String name) {
    if (!Utilities.noString(right)) {
      if (Utilities.noString(left)) {
        b.append("No "+name+" on left side");
      } else if (!left.equals(right)) {
        b.append("Values for "+name+" differ");
      }
    } else if (!Utilities.noString(left)) {
      b.append("No "+name+" on right side");
    }
  }

  private ConceptDefinitionComponent merge(ConceptDefinitionComponent l, ConceptDefinitionComponent r, List<PropertyComponent> destProps) {
    ConceptDefinitionComponent cd = l.copy();
    if (!l.hasDisplay() && r.hasDisplay()) {
      cd.setDisplay(r.getDisplay());
    }
    if (!l.hasDefinition() && r.hasDefinition()) {
      cd.setDefinition(r.getDefinition());
    }
    mergeProps(cd, l, r, destProps);
    mergeDesignations(cd, l, r);
    return cd;
  }

  private ConceptDefinitionComponent intersect(ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
    ConceptDefinitionComponent cd = l.copy();
    if (l.hasDisplay() && !r.hasDisplay()) {
      cd.setDisplay(null);
    }
    if (l.hasDefinition() && !r.hasDefinition()) {
      cd.setDefinition(null);
    }
    intersectProps(cd, l, r);
//    mergeDesignations(cd, l, r);
    return cd;
  }

  private void mergeDesignations(ConceptDefinitionComponent cd, ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
    for (ConceptDefinitionDesignationComponent td : l.getDesignation()) {
      if (hasDesignation(td, r.getDesignation())) {
        cd.getDesignation().add(td);
      }
    }
    for (ConceptDefinitionDesignationComponent td : r.getDesignation()) {
      if (hasDesignation(td, l.getDesignation())) {
        cd.getDesignation().add(td);
      }
    }
  }
  
  
  private boolean hasDesignation(ConceptDefinitionDesignationComponent td, List<ConceptDefinitionDesignationComponent> designation) {
    for (ConceptDefinitionDesignationComponent t : designation) {
      if (designationsMatch(td, t)) {
        return true;
      }
    }
    return false;
  }

  private boolean designationsMatch(ConceptDefinitionDesignationComponent l, ConceptDefinitionDesignationComponent r) {
    if (l.hasUse() != r.hasUse()) {
      return false;
    }
    if (l.hasLanguage() != r.hasLanguage()) {
      return false;
    }
    if (l.hasValue() != r.hasValue()) {
      return false;
    }
    if (l.hasUse()) {
      if (l.getUse().equalsDeep(r.getUse())) {
        return false;
      }
    }
    if (l.hasLanguage()) {
      if (l.getLanguageElement().equalsDeep(r.getLanguageElement())) {
        return false;
      }
    }
    if (l.hasValue()) {
      if (l.getValueElement().equalsDeep(r.getValueElement())) {
        return false;
      }
    }
    return true;
  }

  private void mergeProps(ConceptDefinitionComponent cd, ConceptDefinitionComponent l, ConceptDefinitionComponent r, List<PropertyComponent> destProps) {
    List<ConceptPropertyComponent> matchR = new ArrayList<>();
    for (ConceptPropertyComponent lp : l.getProperty()) {
      ConceptPropertyComponent rp = findRightProp(r.getProperty(), lp);
      if (rp == null) {
        cd.getProperty().add(lp);
      } else {
        matchR.add(rp);
        cd.getProperty().add(lp);
        if (lp.getValue().equalsDeep(rp.getValue())) {
          cd.getProperty().add(rp.setCode(propMap.get(rp.getCode())));
        }
      }
    }
    for (ConceptPropertyComponent rp : r.getProperty()) {
      if (!matchR.contains(rp)) {
        cd.getProperty().add(rp.setCode(propMap.get(rp.getCode())));        
      }
    }
  }

  private void intersectProps(ConceptDefinitionComponent cd, ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
    for (ConceptPropertyComponent lp : l.getProperty()) {
      ConceptPropertyComponent rp = findRightProp(r.getProperty(), lp);
      if (rp != null) {
        cd.getProperty().add(lp);
      }
    }
  }

  private ConceptPropertyComponent findRightProp(List<ConceptPropertyComponent> rightProperties, ConceptPropertyComponent lp) {
    for (ConceptPropertyComponent p : rightProperties) {
      if (propMap.get(p.getCode()).equals(lp.getCode())) {
        return p;
      }
    }
    return null;
  }


  public XhtmlNode renderTree(CodeSystemComparison comparison, String id, String prefix) {
    // columns: code, display (left|right), properties (left|right)
    HierarchicalTableGenerator gen = new HierarchicalTableGenerator(Utilities.path("[tmp]", "compare"), false);
    TableModel model = new TableModel(id, true);
    model.setAlternating(true);
      model.getTitles().add(new Title(null, model.getDocoRef(), translate("sd.head", "Name"), translate("sd.hint", "The logical name of the element"), null, 0));
      model.getTitles().add(new Title(null, model.getDocoRef(), translate("sd.head", "Flags"), translate("sd.hint", "Information about the use of the element"), null, 0));
      model.getTitles().add(new Title(null, model.getDocoRef(), translate("sd.head", "Card."), translate("sd.hint", "Minimum and Maximum # of times the the element can appear in the instance"), null, 0));
      model.getTitles().add(new Title(null, model.getDocoRef(), translate("sd.head", "Type"), translate("sd.hint", "Reference to the type of the element"), null, 100));
      model.getTitles().add(new Title(null, model.getDocoRef(), translate("sd.head", "Description & Constraints"), translate("sd.hint", "Additional information about the element"), null, 0));
      if (isLogical) {
        model.getTitles().add(new Title(null, prefix+"structuredefinition.html#logical", "Implemented As", "How this logical data item is implemented in a concrete resource", null, 0));
      }
      return model;
    }



    TableModel model = gen.initNormalTable(corePath, false, true, profile.getId()+(diff ? "d" : "s"), active);

  }

}