package org.hl7.fhir.r5.terminologies.comparison;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.r5.model.CodeSystem.ConceptPropertyComponent;
import org.hl7.fhir.r5.utilities.StructuralMatch;

public class CodeSystemVersionComparer {

  private IWorkerContext context;
  private CodeSystem left;
  private CodeSystem right;
  
  public CodeSystemVersionComparer(IWorkerContext context) {
    super();
    this.context = context;
  }

  public CodeSystemVersionComparison compare(CodeSystem left, CodeSystem right) {
    if (!left.getUrl().equals(right.getUrl())) {
      throw new FHIRException("Only able to compare different versions of the same code system");
    }
    this.left = left;
    this.right = right;
    
    CodeSystemVersionComparison res = new CodeSystemVersionComparison(left, right);
    CodeSystem cs = new CodeSystem();
    res.setUnion(cs);
    cs.setId(UUID.randomUUID().toString().toLowerCase());
    cs.setUrl("urn:uuid:"+cs.getId());
    cs.setName("XVersionUnion"+left.getName());
    cs.setTitle("Union of Versions for "+left.getTitle());
    cs.setStatus(left.getStatus());
    cs.setDate(new Date());
    
    cs = new CodeSystem();
    res.setIntersection(cs);
    cs.setId(UUID.randomUUID().toString().toLowerCase());
    cs.setUrl("urn:uuid:"+cs.getId());
    cs.setName("XVersionIntersection"+left.getName());
    cs.setTitle("Intersections of Versions for "+left.getTitle());
    cs.setStatus(left.getStatus());
    cs.setDate(new Date());
    
    compareConcepts(left.getConcept(), right.getConcept(), res.getCombined(), res.getUnion().getConcept(), res.getIntersection().getConcept());
    return res;
  }

  private void compareConcepts(List<ConceptDefinitionComponent> left, List<ConceptDefinitionComponent> right, StructuralMatch<ConceptDefinitionComponent> combined, List<ConceptDefinitionComponent> union, List<ConceptDefinitionComponent> intersection) {
    List<ConceptDefinitionComponent> matchR = new ArrayList<>();
    for (ConceptDefinitionComponent l : left) {
      ConceptDefinitionComponent r = findInList(right, l);
      if (r == null) {
        union.add(l);
        combined.getChildren().add(new StructuralMatch<CodeSystem.ConceptDefinitionComponent>(l, "no Match Found"));
      } else {
        matchR.add(r);
        union.add(merge(l, r));
//        intersection.add(intersect(l, r));
//        combined.getChildren().add(new StructuralMatch<CodeSystem.ConceptDefinitionComponent>(l, r, compare(l, r)));        
      }
    }
    for (ConceptDefinitionComponent r : right) {
      if (!matchR.contains(r)) {
        
      }
    }
  }

  private ConceptDefinitionComponent merge(ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
    ConceptDefinitionComponent cd = l.copy();
    if (!l.hasDisplay() && r.hasDisplay()) {
      cd.setDisplay(r.getDisplay());
    }
    if (!l.hasDefinition() && r.hasDefinition()) {
      cd.setDefinition(r.getDefinition());
    }
    mergeProps(cd, l, r);
//    mergeDesignations(cd, l, r);
    return cd;
  }

  private void mergeProps(ConceptDefinitionComponent cd, ConceptDefinitionComponent l, ConceptDefinitionComponent r) {
//    List<ConceptPropertyComponent> matchR = new ArrayList<>();
//    for (ConceptPropertyComponent lp : l.getProperty()) {
//      ConceptPropertyComponent rp = findPropInList(r.getProperty(), lp);
//      if (rp == null) {
//        cd.getProperty().add(lp.setCode(findPropCode(lp)));
//      } else {
//        matchR.add(rp);
//        cd.getProperty().add(lp.setCode(findPropCode(lp)));
//        if (lp.getValue().equalsDeep(rp.getValue())) {
//          cd.getProperty().add(rp.setCode(findPropCode(rp)));
//        }
//      }
//    }
//    for (ConceptPropertyComponent rp : r.getProperty()) {
//      if (!matchR.contains(rp)) {
//        cd.getProperty().add(rp.setCode(findPropCode(rp)));        
//      }
//    }
  }

  private String findPropCode(ConceptPropertyComponent lp) {
//    for (S)
    return null;
  }

  private ConceptDefinitionComponent findInList(List<ConceptDefinitionComponent> list, ConceptDefinitionComponent item) {
    for (ConceptDefinitionComponent t : list) {
      if (t.getCode().equals(item.getCode())) {
        return t;
      }
    }
    return null;
  }
  

}