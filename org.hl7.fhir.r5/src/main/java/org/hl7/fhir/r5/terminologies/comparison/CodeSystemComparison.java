package org.hl7.fhir.r5.terminologies.comparison;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.r5.utilities.StructuralMatch;

public class CodeSystemComparison {

  private CodeSystem left;
  private CodeSystem right;
  private String error;
  private StructuralMatch<ConceptDefinitionComponent> combined;
  private CodeSystem union;
  private CodeSystem intersection;
  private Map<String, String> propMap = new HashMap<>(); // right to left; left retains it's name 
  
  public CodeSystemComparison(CodeSystem left, CodeSystem right) {
    super();
    this.left = left;
    this.right = right;
    combined = new StructuralMatch<CodeSystem.ConceptDefinitionComponent>(); // base 
  }


  public Map<String, String> getPropMap() {
    return propMap;
  }


  public CodeSystem getLeft() {
    return left;
  }

  public CodeSystem getRight() {
    return right;
  }

  public String getError() {
    return error;
  }

  public StructuralMatch<ConceptDefinitionComponent> getCombined() {
    return combined;
  }

  public CodeSystem getUnion() {
    return union;
  }

  public CodeSystem getIntersection() {
    return intersection;
  }


  public void setError(String error) {
    this.error = error;
  }


  public void setUnion(CodeSystem union) {
    this.union = union;
  }


  public void setIntersection(CodeSystem intersection) {
    this.intersection = intersection;
  }
  
  
}
