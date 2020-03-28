package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class FHIRDefinedTypeEnumFactory implements EnumFactory<FHIRDefinedType> {

    public FHIRDefinedType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Address".equals(codeString))
            return FHIRDefinedType.ADDRESS;
        if ("Age".equals(codeString))
            return FHIRDefinedType.AGE;
        if ("Annotation".equals(codeString))
            return FHIRDefinedType.ANNOTATION;
        if ("Attachment".equals(codeString))
            return FHIRDefinedType.ATTACHMENT;
        if ("BackboneElement".equals(codeString))
            return FHIRDefinedType.BACKBONEELEMENT;
        if ("CodeableConcept".equals(codeString))
            return FHIRDefinedType.CODEABLECONCEPT;
        if ("Coding".equals(codeString))
            return FHIRDefinedType.CODING;
        if ("ContactPoint".equals(codeString))
            return FHIRDefinedType.CONTACTPOINT;
        if ("Count".equals(codeString))
            return FHIRDefinedType.COUNT;
        if ("Distance".equals(codeString))
            return FHIRDefinedType.DISTANCE;
        if ("Duration".equals(codeString))
            return FHIRDefinedType.DURATION;
        if ("Element".equals(codeString))
            return FHIRDefinedType.ELEMENT;
        if ("ElementDefinition".equals(codeString))
            return FHIRDefinedType.ELEMENTDEFINITION;
        if ("Extension".equals(codeString))
            return FHIRDefinedType.EXTENSION;
        if ("HumanName".equals(codeString))
            return FHIRDefinedType.HUMANNAME;
        if ("Identifier".equals(codeString))
            return FHIRDefinedType.IDENTIFIER;
        if ("Meta".equals(codeString))
            return FHIRDefinedType.META;
        if ("Money".equals(codeString))
            return FHIRDefinedType.MONEY;
        if ("Narrative".equals(codeString))
            return FHIRDefinedType.NARRATIVE;
        if ("Period".equals(codeString))
            return FHIRDefinedType.PERIOD;
        if ("Quantity".equals(codeString))
            return FHIRDefinedType.QUANTITY;
        if ("Range".equals(codeString))
            return FHIRDefinedType.RANGE;
        if ("Ratio".equals(codeString))
            return FHIRDefinedType.RATIO;
        if ("Reference".equals(codeString))
            return FHIRDefinedType.REFERENCE;
        if ("SampledData".equals(codeString))
            return FHIRDefinedType.SAMPLEDDATA;
        if ("Signature".equals(codeString))
            return FHIRDefinedType.SIGNATURE;
        if ("SimpleQuantity".equals(codeString))
            return FHIRDefinedType.SIMPLEQUANTITY;
        if ("Timing".equals(codeString))
            return FHIRDefinedType.TIMING;
        if ("base64Binary".equals(codeString))
            return FHIRDefinedType.BASE64BINARY;
        if ("boolean".equals(codeString))
            return FHIRDefinedType.BOOLEAN;
        if ("code".equals(codeString))
            return FHIRDefinedType.CODE;
        if ("date".equals(codeString))
            return FHIRDefinedType.DATE;
        if ("dateTime".equals(codeString))
            return FHIRDefinedType.DATETIME;
        if ("decimal".equals(codeString))
            return FHIRDefinedType.DECIMAL;
        if ("id".equals(codeString))
            return FHIRDefinedType.ID;
        if ("instant".equals(codeString))
            return FHIRDefinedType.INSTANT;
        if ("integer".equals(codeString))
            return FHIRDefinedType.INTEGER;
        if ("markdown".equals(codeString))
            return FHIRDefinedType.MARKDOWN;
        if ("oid".equals(codeString))
            return FHIRDefinedType.OID;
        if ("positiveInt".equals(codeString))
            return FHIRDefinedType.POSITIVEINT;
        if ("string".equals(codeString))
            return FHIRDefinedType.STRING;
        if ("time".equals(codeString))
            return FHIRDefinedType.TIME;
        if ("unsignedInt".equals(codeString))
            return FHIRDefinedType.UNSIGNEDINT;
        if ("uri".equals(codeString))
            return FHIRDefinedType.URI;
        if ("uuid".equals(codeString))
            return FHIRDefinedType.UUID;
        if ("xhtml".equals(codeString))
            return FHIRDefinedType.XHTML;
        if ("Account".equals(codeString))
            return FHIRDefinedType.ACCOUNT;
        if ("AllergyIntolerance".equals(codeString))
            return FHIRDefinedType.ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
            return FHIRDefinedType.APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
            return FHIRDefinedType.APPOINTMENTRESPONSE;
        if ("AuditEvent".equals(codeString))
            return FHIRDefinedType.AUDITEVENT;
        if ("Basic".equals(codeString))
            return FHIRDefinedType.BASIC;
        if ("Binary".equals(codeString))
            return FHIRDefinedType.BINARY;
        if ("BodySite".equals(codeString))
            return FHIRDefinedType.BODYSITE;
        if ("Bundle".equals(codeString))
            return FHIRDefinedType.BUNDLE;
        if ("CarePlan".equals(codeString))
            return FHIRDefinedType.CAREPLAN;
        if ("Claim".equals(codeString))
            return FHIRDefinedType.CLAIM;
        if ("ClaimResponse".equals(codeString))
            return FHIRDefinedType.CLAIMRESPONSE;
        if ("ClinicalImpression".equals(codeString))
            return FHIRDefinedType.CLINICALIMPRESSION;
        if ("Communication".equals(codeString))
            return FHIRDefinedType.COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
            return FHIRDefinedType.COMMUNICATIONREQUEST;
        if ("Composition".equals(codeString))
            return FHIRDefinedType.COMPOSITION;
        if ("ConceptMap".equals(codeString))
            return FHIRDefinedType.CONCEPTMAP;
        if ("Condition".equals(codeString))
            return FHIRDefinedType.CONDITION;
        if ("Conformance".equals(codeString))
            return FHIRDefinedType.CONFORMANCE;
        if ("Contract".equals(codeString))
            return FHIRDefinedType.CONTRACT;
        if ("Coverage".equals(codeString))
            return FHIRDefinedType.COVERAGE;
        if ("DataElement".equals(codeString))
            return FHIRDefinedType.DATAELEMENT;
        if ("DetectedIssue".equals(codeString))
            return FHIRDefinedType.DETECTEDISSUE;
        if ("Device".equals(codeString))
            return FHIRDefinedType.DEVICE;
        if ("DeviceComponent".equals(codeString))
            return FHIRDefinedType.DEVICECOMPONENT;
        if ("DeviceMetric".equals(codeString))
            return FHIRDefinedType.DEVICEMETRIC;
        if ("DeviceUseRequest".equals(codeString))
            return FHIRDefinedType.DEVICEUSEREQUEST;
        if ("DeviceUseStatement".equals(codeString))
            return FHIRDefinedType.DEVICEUSESTATEMENT;
        if ("DiagnosticOrder".equals(codeString))
            return FHIRDefinedType.DIAGNOSTICORDER;
        if ("DiagnosticReport".equals(codeString))
            return FHIRDefinedType.DIAGNOSTICREPORT;
        if ("DocumentManifest".equals(codeString))
            return FHIRDefinedType.DOCUMENTMANIFEST;
        if ("DocumentReference".equals(codeString))
            return FHIRDefinedType.DOCUMENTREFERENCE;
        if ("DomainResource".equals(codeString))
            return FHIRDefinedType.DOMAINRESOURCE;
        if ("EligibilityRequest".equals(codeString))
            return FHIRDefinedType.ELIGIBILITYREQUEST;
        if ("EligibilityResponse".equals(codeString))
            return FHIRDefinedType.ELIGIBILITYRESPONSE;
        if ("Encounter".equals(codeString))
            return FHIRDefinedType.ENCOUNTER;
        if ("EnrollmentRequest".equals(codeString))
            return FHIRDefinedType.ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
            return FHIRDefinedType.ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
            return FHIRDefinedType.EPISODEOFCARE;
        if ("ExplanationOfBenefit".equals(codeString))
            return FHIRDefinedType.EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
            return FHIRDefinedType.FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
            return FHIRDefinedType.FLAG;
        if ("Goal".equals(codeString))
            return FHIRDefinedType.GOAL;
        if ("Group".equals(codeString))
            return FHIRDefinedType.GROUP;
        if ("HealthcareService".equals(codeString))
            return FHIRDefinedType.HEALTHCARESERVICE;
        if ("ImagingObjectSelection".equals(codeString))
            return FHIRDefinedType.IMAGINGOBJECTSELECTION;
        if ("ImagingStudy".equals(codeString))
            return FHIRDefinedType.IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
            return FHIRDefinedType.IMMUNIZATION;
        if ("ImmunizationRecommendation".equals(codeString))
            return FHIRDefinedType.IMMUNIZATIONRECOMMENDATION;
        if ("ImplementationGuide".equals(codeString))
            return FHIRDefinedType.IMPLEMENTATIONGUIDE;
        if ("List".equals(codeString))
            return FHIRDefinedType.LIST;
        if ("Location".equals(codeString))
            return FHIRDefinedType.LOCATION;
        if ("Media".equals(codeString))
            return FHIRDefinedType.MEDIA;
        if ("Medication".equals(codeString))
            return FHIRDefinedType.MEDICATION;
        if ("MedicationAdministration".equals(codeString))
            return FHIRDefinedType.MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
            return FHIRDefinedType.MEDICATIONDISPENSE;
        if ("MedicationOrder".equals(codeString))
            return FHIRDefinedType.MEDICATIONORDER;
        if ("MedicationStatement".equals(codeString))
            return FHIRDefinedType.MEDICATIONSTATEMENT;
        if ("MessageHeader".equals(codeString))
            return FHIRDefinedType.MESSAGEHEADER;
        if ("NamingSystem".equals(codeString))
            return FHIRDefinedType.NAMINGSYSTEM;
        if ("NutritionOrder".equals(codeString))
            return FHIRDefinedType.NUTRITIONORDER;
        if ("Observation".equals(codeString))
            return FHIRDefinedType.OBSERVATION;
        if ("OperationDefinition".equals(codeString))
            return FHIRDefinedType.OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
            return FHIRDefinedType.OPERATIONOUTCOME;
        if ("Order".equals(codeString))
            return FHIRDefinedType.ORDER;
        if ("OrderResponse".equals(codeString))
            return FHIRDefinedType.ORDERRESPONSE;
        if ("Organization".equals(codeString))
            return FHIRDefinedType.ORGANIZATION;
        if ("Parameters".equals(codeString))
            return FHIRDefinedType.PARAMETERS;
        if ("Patient".equals(codeString))
            return FHIRDefinedType.PATIENT;
        if ("PaymentNotice".equals(codeString))
            return FHIRDefinedType.PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
            return FHIRDefinedType.PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
            return FHIRDefinedType.PERSON;
        if ("Practitioner".equals(codeString))
            return FHIRDefinedType.PRACTITIONER;
        if ("Procedure".equals(codeString))
            return FHIRDefinedType.PROCEDURE;
        if ("ProcedureRequest".equals(codeString))
            return FHIRDefinedType.PROCEDUREREQUEST;
        if ("ProcessRequest".equals(codeString))
            return FHIRDefinedType.PROCESSREQUEST;
        if ("ProcessResponse".equals(codeString))
            return FHIRDefinedType.PROCESSRESPONSE;
        if ("Provenance".equals(codeString))
            return FHIRDefinedType.PROVENANCE;
        if ("Questionnaire".equals(codeString))
            return FHIRDefinedType.QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
            return FHIRDefinedType.QUESTIONNAIRERESPONSE;
        if ("ReferralRequest".equals(codeString))
            return FHIRDefinedType.REFERRALREQUEST;
        if ("RelatedPerson".equals(codeString))
            return FHIRDefinedType.RELATEDPERSON;
        if ("Resource".equals(codeString))
            return FHIRDefinedType.RESOURCE;
        if ("RiskAssessment".equals(codeString))
            return FHIRDefinedType.RISKASSESSMENT;
        if ("Schedule".equals(codeString))
            return FHIRDefinedType.SCHEDULE;
        if ("SearchParameter".equals(codeString))
            return FHIRDefinedType.SEARCHPARAMETER;
        if ("Slot".equals(codeString))
            return FHIRDefinedType.SLOT;
        if ("Specimen".equals(codeString))
            return FHIRDefinedType.SPECIMEN;
        if ("StructureDefinition".equals(codeString))
            return FHIRDefinedType.STRUCTUREDEFINITION;
        if ("Subscription".equals(codeString))
            return FHIRDefinedType.SUBSCRIPTION;
        if ("Substance".equals(codeString))
            return FHIRDefinedType.SUBSTANCE;
        if ("SupplyDelivery".equals(codeString))
            return FHIRDefinedType.SUPPLYDELIVERY;
        if ("SupplyRequest".equals(codeString))
            return FHIRDefinedType.SUPPLYREQUEST;
        if ("TestScript".equals(codeString))
            return FHIRDefinedType.TESTSCRIPT;
        if ("ValueSet".equals(codeString))
            return FHIRDefinedType.VALUESET;
        if ("VisionPrescription".equals(codeString))
            return FHIRDefinedType.VISIONPRESCRIPTION;
        throw new IllegalArgumentException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public Enumeration<FHIRDefinedType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Address".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ADDRESS);
        if ("Age".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.AGE);
        if ("Annotation".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ANNOTATION);
        if ("Attachment".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ATTACHMENT);
        if ("BackboneElement".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BACKBONEELEMENT);
        if ("CodeableConcept".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODEABLECONCEPT);
        if ("Coding".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODING);
        if ("ContactPoint".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTACTPOINT);
        if ("Count".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COUNT);
        if ("Distance".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DISTANCE);
        if ("Duration".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DURATION);
        if ("Element".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELEMENT);
        if ("ElementDefinition".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELEMENTDEFINITION);
        if ("Extension".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXTENSION);
        if ("HumanName".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.HUMANNAME);
        if ("Identifier".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IDENTIFIER);
        if ("Meta".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.META);
        if ("Money".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MONEY);
        if ("Narrative".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NARRATIVE);
        if ("Period".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PERIOD);
        if ("Quantity".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUANTITY);
        if ("Range".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RANGE);
        if ("Ratio".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RATIO);
        if ("Reference".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.REFERENCE);
        if ("SampledData".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SAMPLEDDATA);
        if ("Signature".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SIGNATURE);
        if ("SimpleQuantity".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SIMPLEQUANTITY);
        if ("Timing".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TIMING);
        if ("base64Binary".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BASE64BINARY);
        if ("boolean".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BOOLEAN);
        if ("code".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODE);
        if ("date".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATE);
        if ("dateTime".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATETIME);
        if ("decimal".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DECIMAL);
        if ("id".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ID);
        if ("instant".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INSTANT);
        if ("integer".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INTEGER);
        if ("markdown".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MARKDOWN);
        if ("oid".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OID);
        if ("positiveInt".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.POSITIVEINT);
        if ("string".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.STRING);
        if ("time".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TIME);
        if ("unsignedInt".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.UNSIGNEDINT);
        if ("uri".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.URI);
        if ("uuid".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.UUID);
        if ("xhtml".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.XHTML);
        if ("Account".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ACCOUNT);
        if ("AllergyIntolerance".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ALLERGYINTOLERANCE);
        if ("Appointment".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.APPOINTMENT);
        if ("AppointmentResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.APPOINTMENTRESPONSE);
        if ("AuditEvent".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.AUDITEVENT);
        if ("Basic".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BASIC);
        if ("Binary".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BINARY);
        if ("BodySite".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BODYSITE);
        if ("Bundle".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BUNDLE);
        if ("CarePlan".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CAREPLAN);
        if ("Claim".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLAIM);
        if ("ClaimResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLAIMRESPONSE);
        if ("ClinicalImpression".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLINICALIMPRESSION);
        if ("Communication".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMMUNICATION);
        if ("CommunicationRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMMUNICATIONREQUEST);
        if ("Composition".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMPOSITION);
        if ("ConceptMap".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONCEPTMAP);
        if ("Condition".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONDITION);
        if ("Conformance".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONFORMANCE);
        if ("Contract".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTRACT);
        if ("Coverage".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COVERAGE);
        if ("DataElement".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATAELEMENT);
        if ("DetectedIssue".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DETECTEDISSUE);
        if ("Device".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICE);
        if ("DeviceComponent".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICECOMPONENT);
        if ("DeviceMetric".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEMETRIC);
        if ("DeviceUseRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEUSEREQUEST);
        if ("DeviceUseStatement".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEUSESTATEMENT);
        if ("DiagnosticOrder".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DIAGNOSTICORDER);
        if ("DiagnosticReport".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DIAGNOSTICREPORT);
        if ("DocumentManifest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOCUMENTMANIFEST);
        if ("DocumentReference".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOCUMENTREFERENCE);
        if ("DomainResource".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOMAINRESOURCE);
        if ("EligibilityRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELIGIBILITYREQUEST);
        if ("EligibilityResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELIGIBILITYRESPONSE);
        if ("Encounter".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENCOUNTER);
        if ("EnrollmentRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENROLLMENTREQUEST);
        if ("EnrollmentResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENROLLMENTRESPONSE);
        if ("EpisodeOfCare".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EPISODEOFCARE);
        if ("ExplanationOfBenefit".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXPLANATIONOFBENEFIT);
        if ("FamilyMemberHistory".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.FAMILYMEMBERHISTORY);
        if ("Flag".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.FLAG);
        if ("Goal".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GOAL);
        if ("Group".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GROUP);
        if ("HealthcareService".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.HEALTHCARESERVICE);
        if ("ImagingObjectSelection".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMAGINGOBJECTSELECTION);
        if ("ImagingStudy".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMAGINGSTUDY);
        if ("Immunization".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMMUNIZATION);
        if ("ImmunizationRecommendation".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMMUNIZATIONRECOMMENDATION);
        if ("ImplementationGuide".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMPLEMENTATIONGUIDE);
        if ("List".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LIST);
        if ("Location".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LOCATION);
        if ("Media".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDIA);
        if ("Medication".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATION);
        if ("MedicationAdministration".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONADMINISTRATION);
        if ("MedicationDispense".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONDISPENSE);
        if ("MedicationOrder".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONORDER);
        if ("MedicationStatement".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONSTATEMENT);
        if ("MessageHeader".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MESSAGEHEADER);
        if ("NamingSystem".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NAMINGSYSTEM);
        if ("NutritionOrder".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NUTRITIONORDER);
        if ("Observation".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OBSERVATION);
        if ("OperationDefinition".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OPERATIONDEFINITION);
        if ("OperationOutcome".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OPERATIONOUTCOME);
        if ("Order".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ORDER);
        if ("OrderResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ORDERRESPONSE);
        if ("Organization".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ORGANIZATION);
        if ("Parameters".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PARAMETERS);
        if ("Patient".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PATIENT);
        if ("PaymentNotice".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PAYMENTNOTICE);
        if ("PaymentReconciliation".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PAYMENTRECONCILIATION);
        if ("Person".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PERSON);
        if ("Practitioner".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PRACTITIONER);
        if ("Procedure".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROCEDURE);
        if ("ProcedureRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROCEDUREREQUEST);
        if ("ProcessRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROCESSREQUEST);
        if ("ProcessResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROCESSRESPONSE);
        if ("Provenance".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROVENANCE);
        if ("Questionnaire".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUESTIONNAIRE);
        if ("QuestionnaireResponse".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUESTIONNAIRERESPONSE);
        if ("ReferralRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.REFERRALREQUEST);
        if ("RelatedPerson".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RELATEDPERSON);
        if ("Resource".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESOURCE);
        if ("RiskAssessment".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RISKASSESSMENT);
        if ("Schedule".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SCHEDULE);
        if ("SearchParameter".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SEARCHPARAMETER);
        if ("Slot".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SLOT);
        if ("Specimen".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SPECIMEN);
        if ("StructureDefinition".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.STRUCTUREDEFINITION);
        if ("Subscription".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSCRIPTION);
        if ("Substance".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCE);
        if ("SupplyDelivery".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUPPLYDELIVERY);
        if ("SupplyRequest".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUPPLYREQUEST);
        if ("TestScript".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TESTSCRIPT);
        if ("ValueSet".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.VALUESET);
        if ("VisionPrescription".equals(codeString))
            return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.VISIONPRESCRIPTION);
        throw new FHIRException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public String toCode(FHIRDefinedType code) {
        if (code == FHIRDefinedType.ADDRESS)
            return "Address";
        if (code == FHIRDefinedType.AGE)
            return "Age";
        if (code == FHIRDefinedType.ANNOTATION)
            return "Annotation";
        if (code == FHIRDefinedType.ATTACHMENT)
            return "Attachment";
        if (code == FHIRDefinedType.BACKBONEELEMENT)
            return "BackboneElement";
        if (code == FHIRDefinedType.CODEABLECONCEPT)
            return "CodeableConcept";
        if (code == FHIRDefinedType.CODING)
            return "Coding";
        if (code == FHIRDefinedType.CONTACTPOINT)
            return "ContactPoint";
        if (code == FHIRDefinedType.COUNT)
            return "Count";
        if (code == FHIRDefinedType.DISTANCE)
            return "Distance";
        if (code == FHIRDefinedType.DURATION)
            return "Duration";
        if (code == FHIRDefinedType.ELEMENT)
            return "Element";
        if (code == FHIRDefinedType.ELEMENTDEFINITION)
            return "ElementDefinition";
        if (code == FHIRDefinedType.EXTENSION)
            return "Extension";
        if (code == FHIRDefinedType.HUMANNAME)
            return "HumanName";
        if (code == FHIRDefinedType.IDENTIFIER)
            return "Identifier";
        if (code == FHIRDefinedType.META)
            return "Meta";
        if (code == FHIRDefinedType.MONEY)
            return "Money";
        if (code == FHIRDefinedType.NARRATIVE)
            return "Narrative";
        if (code == FHIRDefinedType.PERIOD)
            return "Period";
        if (code == FHIRDefinedType.QUANTITY)
            return "Quantity";
        if (code == FHIRDefinedType.RANGE)
            return "Range";
        if (code == FHIRDefinedType.RATIO)
            return "Ratio";
        if (code == FHIRDefinedType.REFERENCE)
            return "Reference";
        if (code == FHIRDefinedType.SAMPLEDDATA)
            return "SampledData";
        if (code == FHIRDefinedType.SIGNATURE)
            return "Signature";
        if (code == FHIRDefinedType.SIMPLEQUANTITY)
            return "SimpleQuantity";
        if (code == FHIRDefinedType.TIMING)
            return "Timing";
        if (code == FHIRDefinedType.BASE64BINARY)
            return "base64Binary";
        if (code == FHIRDefinedType.BOOLEAN)
            return "boolean";
        if (code == FHIRDefinedType.CODE)
            return "code";
        if (code == FHIRDefinedType.DATE)
            return "date";
        if (code == FHIRDefinedType.DATETIME)
            return "dateTime";
        if (code == FHIRDefinedType.DECIMAL)
            return "decimal";
        if (code == FHIRDefinedType.ID)
            return "id";
        if (code == FHIRDefinedType.INSTANT)
            return "instant";
        if (code == FHIRDefinedType.INTEGER)
            return "integer";
        if (code == FHIRDefinedType.MARKDOWN)
            return "markdown";
        if (code == FHIRDefinedType.OID)
            return "oid";
        if (code == FHIRDefinedType.POSITIVEINT)
            return "positiveInt";
        if (code == FHIRDefinedType.STRING)
            return "string";
        if (code == FHIRDefinedType.TIME)
            return "time";
        if (code == FHIRDefinedType.UNSIGNEDINT)
            return "unsignedInt";
        if (code == FHIRDefinedType.URI)
            return "uri";
        if (code == FHIRDefinedType.UUID)
            return "uuid";
        if (code == FHIRDefinedType.XHTML)
            return "xhtml";
        if (code == FHIRDefinedType.ACCOUNT)
            return "Account";
        if (code == FHIRDefinedType.ALLERGYINTOLERANCE)
            return "AllergyIntolerance";
        if (code == FHIRDefinedType.APPOINTMENT)
            return "Appointment";
        if (code == FHIRDefinedType.APPOINTMENTRESPONSE)
            return "AppointmentResponse";
        if (code == FHIRDefinedType.AUDITEVENT)
            return "AuditEvent";
        if (code == FHIRDefinedType.BASIC)
            return "Basic";
        if (code == FHIRDefinedType.BINARY)
            return "Binary";
        if (code == FHIRDefinedType.BODYSITE)
            return "BodySite";
        if (code == FHIRDefinedType.BUNDLE)
            return "Bundle";
        if (code == FHIRDefinedType.CAREPLAN)
            return "CarePlan";
        if (code == FHIRDefinedType.CLAIM)
            return "Claim";
        if (code == FHIRDefinedType.CLAIMRESPONSE)
            return "ClaimResponse";
        if (code == FHIRDefinedType.CLINICALIMPRESSION)
            return "ClinicalImpression";
        if (code == FHIRDefinedType.COMMUNICATION)
            return "Communication";
        if (code == FHIRDefinedType.COMMUNICATIONREQUEST)
            return "CommunicationRequest";
        if (code == FHIRDefinedType.COMPOSITION)
            return "Composition";
        if (code == FHIRDefinedType.CONCEPTMAP)
            return "ConceptMap";
        if (code == FHIRDefinedType.CONDITION)
            return "Condition";
        if (code == FHIRDefinedType.CONFORMANCE)
            return "Conformance";
        if (code == FHIRDefinedType.CONTRACT)
            return "Contract";
        if (code == FHIRDefinedType.COVERAGE)
            return "Coverage";
        if (code == FHIRDefinedType.DATAELEMENT)
            return "DataElement";
        if (code == FHIRDefinedType.DETECTEDISSUE)
            return "DetectedIssue";
        if (code == FHIRDefinedType.DEVICE)
            return "Device";
        if (code == FHIRDefinedType.DEVICECOMPONENT)
            return "DeviceComponent";
        if (code == FHIRDefinedType.DEVICEMETRIC)
            return "DeviceMetric";
        if (code == FHIRDefinedType.DEVICEUSEREQUEST)
            return "DeviceUseRequest";
        if (code == FHIRDefinedType.DEVICEUSESTATEMENT)
            return "DeviceUseStatement";
        if (code == FHIRDefinedType.DIAGNOSTICORDER)
            return "DiagnosticOrder";
        if (code == FHIRDefinedType.DIAGNOSTICREPORT)
            return "DiagnosticReport";
        if (code == FHIRDefinedType.DOCUMENTMANIFEST)
            return "DocumentManifest";
        if (code == FHIRDefinedType.DOCUMENTREFERENCE)
            return "DocumentReference";
        if (code == FHIRDefinedType.DOMAINRESOURCE)
            return "DomainResource";
        if (code == FHIRDefinedType.ELIGIBILITYREQUEST)
            return "EligibilityRequest";
        if (code == FHIRDefinedType.ELIGIBILITYRESPONSE)
            return "EligibilityResponse";
        if (code == FHIRDefinedType.ENCOUNTER)
            return "Encounter";
        if (code == FHIRDefinedType.ENROLLMENTREQUEST)
            return "EnrollmentRequest";
        if (code == FHIRDefinedType.ENROLLMENTRESPONSE)
            return "EnrollmentResponse";
        if (code == FHIRDefinedType.EPISODEOFCARE)
            return "EpisodeOfCare";
        if (code == FHIRDefinedType.EXPLANATIONOFBENEFIT)
            return "ExplanationOfBenefit";
        if (code == FHIRDefinedType.FAMILYMEMBERHISTORY)
            return "FamilyMemberHistory";
        if (code == FHIRDefinedType.FLAG)
            return "Flag";
        if (code == FHIRDefinedType.GOAL)
            return "Goal";
        if (code == FHIRDefinedType.GROUP)
            return "Group";
        if (code == FHIRDefinedType.HEALTHCARESERVICE)
            return "HealthcareService";
        if (code == FHIRDefinedType.IMAGINGOBJECTSELECTION)
            return "ImagingObjectSelection";
        if (code == FHIRDefinedType.IMAGINGSTUDY)
            return "ImagingStudy";
        if (code == FHIRDefinedType.IMMUNIZATION)
            return "Immunization";
        if (code == FHIRDefinedType.IMMUNIZATIONRECOMMENDATION)
            return "ImmunizationRecommendation";
        if (code == FHIRDefinedType.IMPLEMENTATIONGUIDE)
            return "ImplementationGuide";
        if (code == FHIRDefinedType.LIST)
            return "List";
        if (code == FHIRDefinedType.LOCATION)
            return "Location";
        if (code == FHIRDefinedType.MEDIA)
            return "Media";
        if (code == FHIRDefinedType.MEDICATION)
            return "Medication";
        if (code == FHIRDefinedType.MEDICATIONADMINISTRATION)
            return "MedicationAdministration";
        if (code == FHIRDefinedType.MEDICATIONDISPENSE)
            return "MedicationDispense";
        if (code == FHIRDefinedType.MEDICATIONORDER)
            return "MedicationOrder";
        if (code == FHIRDefinedType.MEDICATIONSTATEMENT)
            return "MedicationStatement";
        if (code == FHIRDefinedType.MESSAGEHEADER)
            return "MessageHeader";
        if (code == FHIRDefinedType.NAMINGSYSTEM)
            return "NamingSystem";
        if (code == FHIRDefinedType.NUTRITIONORDER)
            return "NutritionOrder";
        if (code == FHIRDefinedType.OBSERVATION)
            return "Observation";
        if (code == FHIRDefinedType.OPERATIONDEFINITION)
            return "OperationDefinition";
        if (code == FHIRDefinedType.OPERATIONOUTCOME)
            return "OperationOutcome";
        if (code == FHIRDefinedType.ORDER)
            return "Order";
        if (code == FHIRDefinedType.ORDERRESPONSE)
            return "OrderResponse";
        if (code == FHIRDefinedType.ORGANIZATION)
            return "Organization";
        if (code == FHIRDefinedType.PARAMETERS)
            return "Parameters";
        if (code == FHIRDefinedType.PATIENT)
            return "Patient";
        if (code == FHIRDefinedType.PAYMENTNOTICE)
            return "PaymentNotice";
        if (code == FHIRDefinedType.PAYMENTRECONCILIATION)
            return "PaymentReconciliation";
        if (code == FHIRDefinedType.PERSON)
            return "Person";
        if (code == FHIRDefinedType.PRACTITIONER)
            return "Practitioner";
        if (code == FHIRDefinedType.PROCEDURE)
            return "Procedure";
        if (code == FHIRDefinedType.PROCEDUREREQUEST)
            return "ProcedureRequest";
        if (code == FHIRDefinedType.PROCESSREQUEST)
            return "ProcessRequest";
        if (code == FHIRDefinedType.PROCESSRESPONSE)
            return "ProcessResponse";
        if (code == FHIRDefinedType.PROVENANCE)
            return "Provenance";
        if (code == FHIRDefinedType.QUESTIONNAIRE)
            return "Questionnaire";
        if (code == FHIRDefinedType.QUESTIONNAIRERESPONSE)
            return "QuestionnaireResponse";
        if (code == FHIRDefinedType.REFERRALREQUEST)
            return "ReferralRequest";
        if (code == FHIRDefinedType.RELATEDPERSON)
            return "RelatedPerson";
        if (code == FHIRDefinedType.RESOURCE)
            return "Resource";
        if (code == FHIRDefinedType.RISKASSESSMENT)
            return "RiskAssessment";
        if (code == FHIRDefinedType.SCHEDULE)
            return "Schedule";
        if (code == FHIRDefinedType.SEARCHPARAMETER)
            return "SearchParameter";
        if (code == FHIRDefinedType.SLOT)
            return "Slot";
        if (code == FHIRDefinedType.SPECIMEN)
            return "Specimen";
        if (code == FHIRDefinedType.STRUCTUREDEFINITION)
            return "StructureDefinition";
        if (code == FHIRDefinedType.SUBSCRIPTION)
            return "Subscription";
        if (code == FHIRDefinedType.SUBSTANCE)
            return "Substance";
        if (code == FHIRDefinedType.SUPPLYDELIVERY)
            return "SupplyDelivery";
        if (code == FHIRDefinedType.SUPPLYREQUEST)
            return "SupplyRequest";
        if (code == FHIRDefinedType.TESTSCRIPT)
            return "TestScript";
        if (code == FHIRDefinedType.VALUESET)
            return "ValueSet";
        if (code == FHIRDefinedType.VISIONPRESCRIPTION)
            return "VisionPrescription";
        return "?";
    }
}
