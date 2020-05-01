package org.hl7.fhir.convertors;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.r5.formats.IParser.OutputStyle;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.terminologies.comparison.CodeSystemComparer;
import org.hl7.fhir.r5.terminologies.comparison.CodeSystemComparison;
import org.hl7.fhir.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class ComparisonTests {
  
  public static void main(String[] args) throws FHIRFormatError, IOException {
    new ComparisonTests().testCodeSystemComparison();
  }
  
  private static final String CODE_SYSTEM_LEFT = "{\"resourceType\" : \"CodeSystem\",\"id\" : \"medication-admin-status\",\"meta\" : {\"lastUpdated\" : \"2019-10-24T11:53:00+11:00\"},\"extension\" : [{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status\",\"valueString\" : \"Informative\"},{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm\",\"valueInteger\" : 2},{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-wg\",\"valueCode\" : \"phx\"}],\"url\" : \"http://hl7.org/fhir/medication-admin-status\",\"identifier\" : {\"system\" : \"urn:ietf:rfc:3986\",\"value\" : \"urn:oid:2.16.840.1.113883.4.642.1.331\"},\"version\" : \"3.0.2\",\"name\" : \"MedicationAdministrationStatus\",\"status\" : \"draft\",\"experimental\" : false,\"date\" : \"2019-10-24T11:53:00+11:00\",\"publisher\" : \"HL7 (FHIR Project)\",\"contact\" : [{\"telecom\" : [{\"system\" : \"url\",\"value\" : \"http://hl7.org/fhir\"},{\"system\" : \"email\",\"value\" : \"fhir@lists.hl7.org\"}]}],\"description\" : \"A set of codes indicating the current status of a MedicationAdministration.\",\"caseSensitive\" : true,\"valueSet\" : \"http://hl7.org/fhir/ValueSet/medication-admin-status\",\"content\" : \"complete\",\"concept\" : [{\"code\" : \"in-progress\",\"display\" : \"In Progress\",\"definition\" : \"The administration has started but has not yet completed.\"},{\"code\" : \"on-hold\",\"display\" : \"On Hold\",\"definition\" : \"Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called \\\"suspended\\\".\"},{\"code\" : \"completed\",\"display\" : \"Completed\",\"definition\" : \"All actions that are implied by the administration have occurred.\"},{\"code\" : \"entered-in-error\",\"display\" : \"Entered in Error\",\"definition\" : \"The administration was entered in error and therefore nullified.\"},{\"code\" : \"stopped\",\"display\" : \"Stopped\",\"definition\" : \"Actions implied by the administration have been permanently halted, before all of them occurred.\"},{\"code\" : \"unknown\",\"display\" : \"Unknown\",\"definition\" : \"The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for \\\"other\\\" - one of the listed statuses is presumed to apply, it's just not known which one.\"}]}";
  private static final String CODE_SYSTEM_RIGHT = "{\"resourceType\" : \"CodeSystem\",\"id\" : \"medication-admin-status\",\"meta\" : {\"lastUpdated\" : \"2019-11-01T09:29:23.356+11:00\",\"profile\" : [\"http://hl7.org/fhir/StructureDefinition/shareablecodesystem\"]},\"text\" : {\"status\" : \"generated\",\"div\" : \"<div>!-- Snipped for Brevity --></div>\"},\"extension\" : [{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-wg\",\"valueCode\" : \"phx\"},{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status\",\"valueCode\" : \"trial-use\"},{\"url\" : \"http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm\",\"valueInteger\" : 2}],\"url\" : \"http://terminology.hl7.org/CodeSystem/medication-admin-status\",\"identifier\" : [{\"system\" : \"urn:ietf:rfc:3986\",\"value\" : \"urn:oid:2.16.840.1.113883.4.642.4.1311\"}],\"version\" : \"4.0.1\",\"name\" : \"MedicationAdministration Status Codes\",\"title\" : \"Medication administration  status  codes\",\"status\" : \"draft\",\"experimental\" : false,\"publisher\" : \"FHIR Project team\",\"contact\" : [{\"telecom\" : [{\"system\" : \"url\",\"value\" : \"http://hl7.org/fhir\"}]}],\"description\" : \"MedicationAdministration Status Codes\",\"caseSensitive\" : true,\"valueSet\" : \"http://hl7.org/fhir/ValueSet/medication-admin-status\",\"content\" : \"complete\",\"concept\" : [{\"code\" : \"in-progress\",\"display\" : \"In Progress\",\"definition\" : \"The administration has started but has not yet completed.\"},{\"code\" : \"not-done\",\"display\" : \"Not Done\",\"definition\" : \"The administration was terminated prior to any impact on the subject (though preparatory actions may have been taken)\"},{\"code\" : \"on-hold\",\"display\" : \"On Hold\",\"definition\" : \"Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called 'suspended'.\"},{\"code\" : \"completed\",\"display\" : \"Completed\",\"definition\" : \"All actions that are implied by the administration have occurred.\"},{\"code\" : \"entered-in-error\",\"display\" : \"Entered in Error\",\"definition\" : \"The administration was entered in error and therefore nullified.\"},{\"code\" : \"stopped\",\"display\" : \"Stopped\",\"definition\" : \"Actions implied by the administration have been permanently halted, before all of them occurred.\"},{\"code\" : \"unknown\",\"display\" : \"Unknown\",\"definition\" : \"The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, it's just not known which one.\"}]}";

  @Test
  public void testCodeSystemComparison() throws FHIRFormatError, IOException {
    CodeSystem csl = (CodeSystem) VersionConvertor_30_50.convertResource(new org.hl7.fhir.dstu3.formats.JsonParser().parse(CODE_SYSTEM_LEFT), false);  
    CodeSystem csr = (CodeSystem) new org.hl7.fhir.r5.formats.JsonParser().parse(CODE_SYSTEM_RIGHT);
    CodeSystemComparer cs = new CodeSystemComparer(null);
    CodeSystemComparison csc = cs.compare(csl, csr);
    Assertions.assertTrue(csc.getUnion().getConcept().size() > csc.getIntersection().getConcept().size());
    new org.hl7.fhir.r5.formats.JsonParser().setOutputStyle(OutputStyle.PRETTY).compose(new FileOutputStream(Utilities.path("[tmp]", "cs-union.json")), csc.getUnion());
    new org.hl7.fhir.r5.formats.JsonParser().setOutputStyle(OutputStyle.PRETTY).compose(new FileOutputStream(Utilities.path("[tmp]", "cs-intersection.json")), csc.getIntersection());
    
    cs.renderTree(csc);
  }

}
