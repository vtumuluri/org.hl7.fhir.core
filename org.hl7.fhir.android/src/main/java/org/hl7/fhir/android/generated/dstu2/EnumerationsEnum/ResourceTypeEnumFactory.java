package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ResourceTypeEnumFactory implements EnumFactory<ResourceType> {

    public ResourceType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Account".equals(codeString))
            return ResourceType.ACCOUNT;
        if ("AllergyIntolerance".equals(codeString))
            return ResourceType.ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
            return ResourceType.APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
            return ResourceType.APPOINTMENTRESPONSE;
        if ("AuditEvent".equals(codeString))
            return ResourceType.AUDITEVENT;
        if ("Basic".equals(codeString))
            return ResourceType.BASIC;
        if ("Binary".equals(codeString))
            return ResourceType.BINARY;
        if ("BodySite".equals(codeString))
            return ResourceType.BODYSITE;
        if ("Bundle".equals(codeString))
            return ResourceType.BUNDLE;
        if ("CarePlan".equals(codeString))
            return ResourceType.CAREPLAN;
        if ("Claim".equals(codeString))
            return ResourceType.CLAIM;
        if ("ClaimResponse".equals(codeString))
            return ResourceType.CLAIMRESPONSE;
        if ("ClinicalImpression".equals(codeString))
            return ResourceType.CLINICALIMPRESSION;
        if ("Communication".equals(codeString))
            return ResourceType.COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
            return ResourceType.COMMUNICATIONREQUEST;
        if ("Composition".equals(codeString))
            return ResourceType.COMPOSITION;
        if ("ConceptMap".equals(codeString))
            return ResourceType.CONCEPTMAP;
        if ("Condition".equals(codeString))
            return ResourceType.CONDITION;
        if ("Conformance".equals(codeString))
            return ResourceType.CONFORMANCE;
        if ("Contract".equals(codeString))
            return ResourceType.CONTRACT;
        if ("Coverage".equals(codeString))
            return ResourceType.COVERAGE;
        if ("DataElement".equals(codeString))
            return ResourceType.DATAELEMENT;
        if ("DetectedIssue".equals(codeString))
            return ResourceType.DETECTEDISSUE;
        if ("Device".equals(codeString))
            return ResourceType.DEVICE;
        if ("DeviceComponent".equals(codeString))
            return ResourceType.DEVICECOMPONENT;
        if ("DeviceMetric".equals(codeString))
            return ResourceType.DEVICEMETRIC;
        if ("DeviceUseRequest".equals(codeString))
            return ResourceType.DEVICEUSEREQUEST;
        if ("DeviceUseStatement".equals(codeString))
            return ResourceType.DEVICEUSESTATEMENT;
        if ("DiagnosticOrder".equals(codeString))
            return ResourceType.DIAGNOSTICORDER;
        if ("DiagnosticReport".equals(codeString))
            return ResourceType.DIAGNOSTICREPORT;
        if ("DocumentManifest".equals(codeString))
            return ResourceType.DOCUMENTMANIFEST;
        if ("DocumentReference".equals(codeString))
            return ResourceType.DOCUMENTREFERENCE;
        if ("DomainResource".equals(codeString))
            return ResourceType.DOMAINRESOURCE;
        if ("EligibilityRequest".equals(codeString))
            return ResourceType.ELIGIBILITYREQUEST;
        if ("EligibilityResponse".equals(codeString))
            return ResourceType.ELIGIBILITYRESPONSE;
        if ("Encounter".equals(codeString))
            return ResourceType.ENCOUNTER;
        if ("EnrollmentRequest".equals(codeString))
            return ResourceType.ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
            return ResourceType.ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
            return ResourceType.EPISODEOFCARE;
        if ("ExplanationOfBenefit".equals(codeString))
            return ResourceType.EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
            return ResourceType.FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
            return ResourceType.FLAG;
        if ("Goal".equals(codeString))
            return ResourceType.GOAL;
        if ("Group".equals(codeString))
            return ResourceType.GROUP;
        if ("HealthcareService".equals(codeString))
            return ResourceType.HEALTHCARESERVICE;
        if ("ImagingObjectSelection".equals(codeString))
            return ResourceType.IMAGINGOBJECTSELECTION;
        if ("ImagingStudy".equals(codeString))
            return ResourceType.IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
            return ResourceType.IMMUNIZATION;
        if ("ImmunizationRecommendation".equals(codeString))
            return ResourceType.IMMUNIZATIONRECOMMENDATION;
        if ("ImplementationGuide".equals(codeString))
            return ResourceType.IMPLEMENTATIONGUIDE;
        if ("List".equals(codeString))
            return ResourceType.LIST;
        if ("Location".equals(codeString))
            return ResourceType.LOCATION;
        if ("Media".equals(codeString))
            return ResourceType.MEDIA;
        if ("Medication".equals(codeString))
            return ResourceType.MEDICATION;
        if ("MedicationAdministration".equals(codeString))
            return ResourceType.MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
            return ResourceType.MEDICATIONDISPENSE;
        if ("MedicationOrder".equals(codeString))
            return ResourceType.MEDICATIONORDER;
        if ("MedicationStatement".equals(codeString))
            return ResourceType.MEDICATIONSTATEMENT;
        if ("MessageHeader".equals(codeString))
            return ResourceType.MESSAGEHEADER;
        if ("NamingSystem".equals(codeString))
            return ResourceType.NAMINGSYSTEM;
        if ("NutritionOrder".equals(codeString))
            return ResourceType.NUTRITIONORDER;
        if ("Observation".equals(codeString))
            return ResourceType.OBSERVATION;
        if ("OperationDefinition".equals(codeString))
            return ResourceType.OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
            return ResourceType.OPERATIONOUTCOME;
        if ("Order".equals(codeString))
            return ResourceType.ORDER;
        if ("OrderResponse".equals(codeString))
            return ResourceType.ORDERRESPONSE;
        if ("Organization".equals(codeString))
            return ResourceType.ORGANIZATION;
        if ("Parameters".equals(codeString))
            return ResourceType.PARAMETERS;
        if ("Patient".equals(codeString))
            return ResourceType.PATIENT;
        if ("PaymentNotice".equals(codeString))
            return ResourceType.PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
            return ResourceType.PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
            return ResourceType.PERSON;
        if ("Practitioner".equals(codeString))
            return ResourceType.PRACTITIONER;
        if ("Procedure".equals(codeString))
            return ResourceType.PROCEDURE;
        if ("ProcedureRequest".equals(codeString))
            return ResourceType.PROCEDUREREQUEST;
        if ("ProcessRequest".equals(codeString))
            return ResourceType.PROCESSREQUEST;
        if ("ProcessResponse".equals(codeString))
            return ResourceType.PROCESSRESPONSE;
        if ("Provenance".equals(codeString))
            return ResourceType.PROVENANCE;
        if ("Questionnaire".equals(codeString))
            return ResourceType.QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
            return ResourceType.QUESTIONNAIRERESPONSE;
        if ("ReferralRequest".equals(codeString))
            return ResourceType.REFERRALREQUEST;
        if ("RelatedPerson".equals(codeString))
            return ResourceType.RELATEDPERSON;
        if ("Resource".equals(codeString))
            return ResourceType.RESOURCE;
        if ("RiskAssessment".equals(codeString))
            return ResourceType.RISKASSESSMENT;
        if ("Schedule".equals(codeString))
            return ResourceType.SCHEDULE;
        if ("SearchParameter".equals(codeString))
            return ResourceType.SEARCHPARAMETER;
        if ("Slot".equals(codeString))
            return ResourceType.SLOT;
        if ("Specimen".equals(codeString))
            return ResourceType.SPECIMEN;
        if ("StructureDefinition".equals(codeString))
            return ResourceType.STRUCTUREDEFINITION;
        if ("Subscription".equals(codeString))
            return ResourceType.SUBSCRIPTION;
        if ("Substance".equals(codeString))
            return ResourceType.SUBSTANCE;
        if ("SupplyDelivery".equals(codeString))
            return ResourceType.SUPPLYDELIVERY;
        if ("SupplyRequest".equals(codeString))
            return ResourceType.SUPPLYREQUEST;
        if ("TestScript".equals(codeString))
            return ResourceType.TESTSCRIPT;
        if ("ValueSet".equals(codeString))
            return ResourceType.VALUESET;
        if ("VisionPrescription".equals(codeString))
            return ResourceType.VISIONPRESCRIPTION;
        throw new IllegalArgumentException("Unknown ResourceType code '" + codeString + "'");
    }

    public Enumeration<ResourceType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Account".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ACCOUNT);
        if ("AllergyIntolerance".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ALLERGYINTOLERANCE);
        if ("Appointment".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.APPOINTMENT);
        if ("AppointmentResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.APPOINTMENTRESPONSE);
        if ("AuditEvent".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.AUDITEVENT);
        if ("Basic".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.BASIC);
        if ("Binary".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.BINARY);
        if ("BodySite".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.BODYSITE);
        if ("Bundle".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.BUNDLE);
        if ("CarePlan".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CAREPLAN);
        if ("Claim".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CLAIM);
        if ("ClaimResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CLAIMRESPONSE);
        if ("ClinicalImpression".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CLINICALIMPRESSION);
        if ("Communication".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.COMMUNICATION);
        if ("CommunicationRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.COMMUNICATIONREQUEST);
        if ("Composition".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.COMPOSITION);
        if ("ConceptMap".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CONCEPTMAP);
        if ("Condition".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CONDITION);
        if ("Conformance".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CONFORMANCE);
        if ("Contract".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.CONTRACT);
        if ("Coverage".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.COVERAGE);
        if ("DataElement".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DATAELEMENT);
        if ("DetectedIssue".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DETECTEDISSUE);
        if ("Device".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DEVICE);
        if ("DeviceComponent".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DEVICECOMPONENT);
        if ("DeviceMetric".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DEVICEMETRIC);
        if ("DeviceUseRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DEVICEUSEREQUEST);
        if ("DeviceUseStatement".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DEVICEUSESTATEMENT);
        if ("DiagnosticOrder".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DIAGNOSTICORDER);
        if ("DiagnosticReport".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DIAGNOSTICREPORT);
        if ("DocumentManifest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DOCUMENTMANIFEST);
        if ("DocumentReference".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DOCUMENTREFERENCE);
        if ("DomainResource".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.DOMAINRESOURCE);
        if ("EligibilityRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ELIGIBILITYREQUEST);
        if ("EligibilityResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ELIGIBILITYRESPONSE);
        if ("Encounter".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ENCOUNTER);
        if ("EnrollmentRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ENROLLMENTREQUEST);
        if ("EnrollmentResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ENROLLMENTRESPONSE);
        if ("EpisodeOfCare".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.EPISODEOFCARE);
        if ("ExplanationOfBenefit".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.EXPLANATIONOFBENEFIT);
        if ("FamilyMemberHistory".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.FAMILYMEMBERHISTORY);
        if ("Flag".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.FLAG);
        if ("Goal".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.GOAL);
        if ("Group".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.GROUP);
        if ("HealthcareService".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.HEALTHCARESERVICE);
        if ("ImagingObjectSelection".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.IMAGINGOBJECTSELECTION);
        if ("ImagingStudy".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.IMAGINGSTUDY);
        if ("Immunization".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.IMMUNIZATION);
        if ("ImmunizationRecommendation".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.IMMUNIZATIONRECOMMENDATION);
        if ("ImplementationGuide".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.IMPLEMENTATIONGUIDE);
        if ("List".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.LIST);
        if ("Location".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.LOCATION);
        if ("Media".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDIA);
        if ("Medication".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDICATION);
        if ("MedicationAdministration".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONADMINISTRATION);
        if ("MedicationDispense".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONDISPENSE);
        if ("MedicationOrder".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONORDER);
        if ("MedicationStatement".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONSTATEMENT);
        if ("MessageHeader".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.MESSAGEHEADER);
        if ("NamingSystem".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.NAMINGSYSTEM);
        if ("NutritionOrder".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.NUTRITIONORDER);
        if ("Observation".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.OBSERVATION);
        if ("OperationDefinition".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.OPERATIONDEFINITION);
        if ("OperationOutcome".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.OPERATIONOUTCOME);
        if ("Order".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ORDER);
        if ("OrderResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ORDERRESPONSE);
        if ("Organization".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.ORGANIZATION);
        if ("Parameters".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PARAMETERS);
        if ("Patient".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PATIENT);
        if ("PaymentNotice".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PAYMENTNOTICE);
        if ("PaymentReconciliation".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PAYMENTRECONCILIATION);
        if ("Person".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PERSON);
        if ("Practitioner".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PRACTITIONER);
        if ("Procedure".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PROCEDURE);
        if ("ProcedureRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PROCEDUREREQUEST);
        if ("ProcessRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PROCESSREQUEST);
        if ("ProcessResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PROCESSRESPONSE);
        if ("Provenance".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.PROVENANCE);
        if ("Questionnaire".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.QUESTIONNAIRE);
        if ("QuestionnaireResponse".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.QUESTIONNAIRERESPONSE);
        if ("ReferralRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.REFERRALREQUEST);
        if ("RelatedPerson".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.RELATEDPERSON);
        if ("Resource".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.RESOURCE);
        if ("RiskAssessment".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.RISKASSESSMENT);
        if ("Schedule".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SCHEDULE);
        if ("SearchParameter".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SEARCHPARAMETER);
        if ("Slot".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SLOT);
        if ("Specimen".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SPECIMEN);
        if ("StructureDefinition".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.STRUCTUREDEFINITION);
        if ("Subscription".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SUBSCRIPTION);
        if ("Substance".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCE);
        if ("SupplyDelivery".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SUPPLYDELIVERY);
        if ("SupplyRequest".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.SUPPLYREQUEST);
        if ("TestScript".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.TESTSCRIPT);
        if ("ValueSet".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.VALUESET);
        if ("VisionPrescription".equals(codeString))
            return new Enumeration<ResourceType>(this, ResourceType.VISIONPRESCRIPTION);
        throw new FHIRException("Unknown ResourceType code '" + codeString + "'");
    }

    public String toCode(ResourceType code) {
        if (code == ResourceType.ACCOUNT)
            return "Account";
        if (code == ResourceType.ALLERGYINTOLERANCE)
            return "AllergyIntolerance";
        if (code == ResourceType.APPOINTMENT)
            return "Appointment";
        if (code == ResourceType.APPOINTMENTRESPONSE)
            return "AppointmentResponse";
        if (code == ResourceType.AUDITEVENT)
            return "AuditEvent";
        if (code == ResourceType.BASIC)
            return "Basic";
        if (code == ResourceType.BINARY)
            return "Binary";
        if (code == ResourceType.BODYSITE)
            return "BodySite";
        if (code == ResourceType.BUNDLE)
            return "Bundle";
        if (code == ResourceType.CAREPLAN)
            return "CarePlan";
        if (code == ResourceType.CLAIM)
            return "Claim";
        if (code == ResourceType.CLAIMRESPONSE)
            return "ClaimResponse";
        if (code == ResourceType.CLINICALIMPRESSION)
            return "ClinicalImpression";
        if (code == ResourceType.COMMUNICATION)
            return "Communication";
        if (code == ResourceType.COMMUNICATIONREQUEST)
            return "CommunicationRequest";
        if (code == ResourceType.COMPOSITION)
            return "Composition";
        if (code == ResourceType.CONCEPTMAP)
            return "ConceptMap";
        if (code == ResourceType.CONDITION)
            return "Condition";
        if (code == ResourceType.CONFORMANCE)
            return "Conformance";
        if (code == ResourceType.CONTRACT)
            return "Contract";
        if (code == ResourceType.COVERAGE)
            return "Coverage";
        if (code == ResourceType.DATAELEMENT)
            return "DataElement";
        if (code == ResourceType.DETECTEDISSUE)
            return "DetectedIssue";
        if (code == ResourceType.DEVICE)
            return "Device";
        if (code == ResourceType.DEVICECOMPONENT)
            return "DeviceComponent";
        if (code == ResourceType.DEVICEMETRIC)
            return "DeviceMetric";
        if (code == ResourceType.DEVICEUSEREQUEST)
            return "DeviceUseRequest";
        if (code == ResourceType.DEVICEUSESTATEMENT)
            return "DeviceUseStatement";
        if (code == ResourceType.DIAGNOSTICORDER)
            return "DiagnosticOrder";
        if (code == ResourceType.DIAGNOSTICREPORT)
            return "DiagnosticReport";
        if (code == ResourceType.DOCUMENTMANIFEST)
            return "DocumentManifest";
        if (code == ResourceType.DOCUMENTREFERENCE)
            return "DocumentReference";
        if (code == ResourceType.DOMAINRESOURCE)
            return "DomainResource";
        if (code == ResourceType.ELIGIBILITYREQUEST)
            return "EligibilityRequest";
        if (code == ResourceType.ELIGIBILITYRESPONSE)
            return "EligibilityResponse";
        if (code == ResourceType.ENCOUNTER)
            return "Encounter";
        if (code == ResourceType.ENROLLMENTREQUEST)
            return "EnrollmentRequest";
        if (code == ResourceType.ENROLLMENTRESPONSE)
            return "EnrollmentResponse";
        if (code == ResourceType.EPISODEOFCARE)
            return "EpisodeOfCare";
        if (code == ResourceType.EXPLANATIONOFBENEFIT)
            return "ExplanationOfBenefit";
        if (code == ResourceType.FAMILYMEMBERHISTORY)
            return "FamilyMemberHistory";
        if (code == ResourceType.FLAG)
            return "Flag";
        if (code == ResourceType.GOAL)
            return "Goal";
        if (code == ResourceType.GROUP)
            return "Group";
        if (code == ResourceType.HEALTHCARESERVICE)
            return "HealthcareService";
        if (code == ResourceType.IMAGINGOBJECTSELECTION)
            return "ImagingObjectSelection";
        if (code == ResourceType.IMAGINGSTUDY)
            return "ImagingStudy";
        if (code == ResourceType.IMMUNIZATION)
            return "Immunization";
        if (code == ResourceType.IMMUNIZATIONRECOMMENDATION)
            return "ImmunizationRecommendation";
        if (code == ResourceType.IMPLEMENTATIONGUIDE)
            return "ImplementationGuide";
        if (code == ResourceType.LIST)
            return "List";
        if (code == ResourceType.LOCATION)
            return "Location";
        if (code == ResourceType.MEDIA)
            return "Media";
        if (code == ResourceType.MEDICATION)
            return "Medication";
        if (code == ResourceType.MEDICATIONADMINISTRATION)
            return "MedicationAdministration";
        if (code == ResourceType.MEDICATIONDISPENSE)
            return "MedicationDispense";
        if (code == ResourceType.MEDICATIONORDER)
            return "MedicationOrder";
        if (code == ResourceType.MEDICATIONSTATEMENT)
            return "MedicationStatement";
        if (code == ResourceType.MESSAGEHEADER)
            return "MessageHeader";
        if (code == ResourceType.NAMINGSYSTEM)
            return "NamingSystem";
        if (code == ResourceType.NUTRITIONORDER)
            return "NutritionOrder";
        if (code == ResourceType.OBSERVATION)
            return "Observation";
        if (code == ResourceType.OPERATIONDEFINITION)
            return "OperationDefinition";
        if (code == ResourceType.OPERATIONOUTCOME)
            return "OperationOutcome";
        if (code == ResourceType.ORDER)
            return "Order";
        if (code == ResourceType.ORDERRESPONSE)
            return "OrderResponse";
        if (code == ResourceType.ORGANIZATION)
            return "Organization";
        if (code == ResourceType.PARAMETERS)
            return "Parameters";
        if (code == ResourceType.PATIENT)
            return "Patient";
        if (code == ResourceType.PAYMENTNOTICE)
            return "PaymentNotice";
        if (code == ResourceType.PAYMENTRECONCILIATION)
            return "PaymentReconciliation";
        if (code == ResourceType.PERSON)
            return "Person";
        if (code == ResourceType.PRACTITIONER)
            return "Practitioner";
        if (code == ResourceType.PROCEDURE)
            return "Procedure";
        if (code == ResourceType.PROCEDUREREQUEST)
            return "ProcedureRequest";
        if (code == ResourceType.PROCESSREQUEST)
            return "ProcessRequest";
        if (code == ResourceType.PROCESSRESPONSE)
            return "ProcessResponse";
        if (code == ResourceType.PROVENANCE)
            return "Provenance";
        if (code == ResourceType.QUESTIONNAIRE)
            return "Questionnaire";
        if (code == ResourceType.QUESTIONNAIRERESPONSE)
            return "QuestionnaireResponse";
        if (code == ResourceType.REFERRALREQUEST)
            return "ReferralRequest";
        if (code == ResourceType.RELATEDPERSON)
            return "RelatedPerson";
        if (code == ResourceType.RESOURCE)
            return "Resource";
        if (code == ResourceType.RISKASSESSMENT)
            return "RiskAssessment";
        if (code == ResourceType.SCHEDULE)
            return "Schedule";
        if (code == ResourceType.SEARCHPARAMETER)
            return "SearchParameter";
        if (code == ResourceType.SLOT)
            return "Slot";
        if (code == ResourceType.SPECIMEN)
            return "Specimen";
        if (code == ResourceType.STRUCTUREDEFINITION)
            return "StructureDefinition";
        if (code == ResourceType.SUBSCRIPTION)
            return "Subscription";
        if (code == ResourceType.SUBSTANCE)
            return "Substance";
        if (code == ResourceType.SUPPLYDELIVERY)
            return "SupplyDelivery";
        if (code == ResourceType.SUPPLYREQUEST)
            return "SupplyRequest";
        if (code == ResourceType.TESTSCRIPT)
            return "TestScript";
        if (code == ResourceType.VALUESET)
            return "ValueSet";
        if (code == ResourceType.VISIONPRESCRIPTION)
            return "VisionPrescription";
        return "?";
    }
}
