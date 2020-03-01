package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum FHIRDefinedType {

    /**
     * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.
     */
    ADDRESS,
    /**
     * null
     */
    AGE,
    /**
     * A  text note which also  contains information about who made the statement and when.
     */
    ANNOTATION,
    /**
     * For referring to data content defined in other formats.
     */
    ATTACHMENT,
    /**
     * Base definition for all elements that are defined inside a resource - but not those in a data type.
     */
    BACKBONEELEMENT,
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     */
    CODEABLECONCEPT,
    /**
     * A reference to a code defined by a terminology system.
     */
    CODING,
    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     */
    CONTACTPOINT,
    /**
     * null
     */
    COUNT,
    /**
     * null
     */
    DISTANCE,
    /**
     * null
     */
    DURATION,
    /**
     * Base definition for all elements in a resource.
     */
    ELEMENT,
    /**
     * Captures constraints on each element within the resource, profile, or extension.
     */
    ELEMENTDEFINITION,
    /**
     * Optional Extensions Element - found in all resources.
     */
    EXTENSION,
    /**
     * A human's name with the ability to identify parts and usage.
     */
    HUMANNAME,
    /**
     * A technical identifier - identifies some entity uniquely and unambiguously.
     */
    IDENTIFIER,
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
     */
    META,
    /**
     * null
     */
    MONEY,
    /**
     * A human-readable formatted text, including images.
     */
    NARRATIVE,
    /**
     * A time period defined by a start and end date and optionally time.
     */
    PERIOD,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     */
    QUANTITY,
    /**
     * A set of ordered Quantities defined by a low and high limit.
     */
    RANGE,
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     */
    RATIO,
    /**
     * A reference from one resource to another.
     */
    REFERENCE,
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     */
    SAMPLEDDATA,
    /**
     * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different Signature approaches have different utilities.
     */
    SIGNATURE,
    /**
     * null
     */
    SIMPLEQUANTITY,
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.
     */
    TIMING,
    /**
     * A stream of bytes
     */
    BASE64BINARY,
    /**
     * Value of "true" or "false"
     */
    BOOLEAN,
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     */
    CODE,
    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     */
    DATE,
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     */
    DATETIME,
    /**
     * A rational number with implicit precision
     */
    DECIMAL,
    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     */
    ID,
    /**
     * An instant in time - known at least to the second
     */
    INSTANT,
    /**
     * A whole number
     */
    INTEGER,
    /**
     * A string that may contain markdown syntax for optional processing by a mark down presentation engine
     */
    MARKDOWN,
    /**
     * An oid represented as a URI
     */
    OID,
    /**
     * An integer with a value that is positive (e.g. >0)
     */
    POSITIVEINT,
    /**
     * A sequence of Unicode characters
     */
    STRING,
    /**
     * A time during the day, with no date specified
     */
    TIME,
    /**
     * An integer with a value that is not negative (e.g. >= 0)
     */
    UNSIGNEDINT,
    /**
     * String of characters used to identify a name or a resource
     */
    URI,
    /**
     * A UUID, represented as a URI
     */
    UUID,
    /**
     * XHTML format, as defined by W3C, but restricted usage (mainly, no active content)
     */
    XHTML,
    /**
     * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centres, etc.
     */
    ACCOUNT,
    /**
     * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
     */
    ALLERGYINTOLERANCE,
    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
     */
    APPOINTMENT,
    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
     */
    APPOINTMENTRESPONSE,
    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     */
    AUDITEVENT,
    /**
     * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
     */
    BASIC,
    /**
     * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
     */
    BINARY,
    /**
     * Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
     */
    BODYSITE,
    /**
     * A container for a collection of resources.
     */
    BUNDLE,
    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
     */
    CAREPLAN,
    /**
     * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
     */
    CLAIM,
    /**
     * This resource provides the adjudication details from the processing of a Claim resource.
     */
    CLAIMRESPONSE,
    /**
     * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
     */
    CLINICALIMPRESSION,
    /**
     * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
     */
    COMMUNICATION,
    /**
     * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
     */
    COMMUNICATIONREQUEST,
    /**
     * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
     */
    COMPOSITION,
    /**
     * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
     */
    CONCEPTMAP,
    /**
     * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a diagnosis during an encounter; populating a problem list or a summary statement, such as a discharge summary.
     */
    CONDITION,
    /**
     * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     */
    CONFORMANCE,
    /**
     * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
     */
    CONTRACT,
    /**
     * Financial instrument which may be used to pay for or reimburse health care products and services.
     */
    COVERAGE,
    /**
     * The formal description of a single piece of information that can be gathered and reported.
     */
    DATAELEMENT,
    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
     */
    DETECTEDISSUE,
    /**
     * This resource identifies an instance of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices includes durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
     */
    DEVICE,
    /**
     * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
     */
    DEVICECOMPONENT,
    /**
     * Describes a measurement, calculation or setting capability of a medical device.
     */
    DEVICEMETRIC,
    /**
     * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
     */
    DEVICEUSEREQUEST,
    /**
     * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
     */
    DEVICEUSESTATEMENT,
    /**
     * A record of a request for a diagnostic investigation service to be performed.
     */
    DIAGNOSTICORDER,
    /**
     * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
     */
    DIAGNOSTICREPORT,
    /**
     * A manifest that defines a set of documents.
     */
    DOCUMENTMANIFEST,
    /**
     * A reference to a document .
     */
    DOCUMENTREFERENCE,
    /**
     * --- Abstract Type! ---A resource that includes narrative, extensions, and contained resources.
     */
    DOMAINRESOURCE,
    /**
     * This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.
     */
    ELIGIBILITYREQUEST,
    /**
     * This resource provides eligibility and plan details from the processing of an Eligibility resource.
     */
    ELIGIBILITYRESPONSE,
    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     */
    ENCOUNTER,
    /**
     * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
     */
    ENROLLMENTREQUEST,
    /**
     * This resource provides enrollment and plan details from the processing of an Enrollment resource.
     */
    ENROLLMENTRESPONSE,
    /**
     * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
     */
    EPISODEOFCARE,
    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     */
    EXPLANATIONOFBENEFIT,
    /**
     * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
     */
    FAMILYMEMBERHISTORY,
    /**
     * Prospective warnings of potential issues when providing care to the patient.
     */
    FLAG,
    /**
     * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
     */
    GOAL,
    /**
     * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
     */
    GROUP,
    /**
     * The details of a healthcare service available at a location.
     */
    HEALTHCARESERVICE,
    /**
     * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
     */
    IMAGINGOBJECTSELECTION,
    /**
     * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
     */
    IMAGINGSTUDY,
    /**
     * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
     */
    IMMUNIZATION,
    /**
     * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
     */
    IMMUNIZATIONRECOMMENDATION,
    /**
     * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
     */
    IMPLEMENTATIONGUIDE,
    /**
     * A set of information summarized from a list of other resources.
     */
    LIST,
    /**
     * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
     */
    LOCATION,
    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
     */
    MEDIA,
    /**
     * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
     */
    MEDICATION,
    /**
     * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     */
    MEDICATIONADMINISTRATION,
    /**
     * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
     */
    MEDICATIONDISPENSE,
    /**
     * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
     */
    MEDICATIONORDER,
    /**
     *  A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains
     *
     * The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
     */
    MEDICATIONSTATEMENT,
    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     */
    MESSAGEHEADER,
    /**
     * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
     */
    NAMINGSYSTEM,
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     */
    NUTRITIONORDER,
    /**
     * Measurements and simple assertions made about a patient, device or other subject.
     */
    OBSERVATION,
    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     */
    OPERATIONDEFINITION,
    /**
     * A collection of error, warning or information messages that result from a system action.
     */
    OPERATIONOUTCOME,
    /**
     * A request to perform an action.
     */
    ORDER,
    /**
     * A response to an order.
     */
    ORDERRESPONSE,
    /**
     * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
     */
    ORGANIZATION,
    /**
     * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
     */
    PARAMETERS,
    /**
     * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
     */
    PATIENT,
    /**
     * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
     */
    PAYMENTNOTICE,
    /**
     * This resource provides payment details and claim references supporting a bulk payment.
     */
    PAYMENTRECONCILIATION,
    /**
     * Demographics and administrative information about a person independent of a specific health-related context.
     */
    PERSON,
    /**
     * A person who is directly or indirectly involved in the provisioning of healthcare.
     */
    PRACTITIONER,
    /**
     * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
     */
    PROCEDURE,
    /**
     * A request for a procedure to be performed. May be a proposal or an order.
     */
    PROCEDUREREQUEST,
    /**
     * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
     */
    PROCESSREQUEST,
    /**
     * This resource provides processing status, errors and notes from the processing of a resource.
     */
    PROCESSRESPONSE,
    /**
     * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
     */
    PROVENANCE,
    /**
     * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
     */
    QUESTIONNAIRE,
    /**
     * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
     */
    QUESTIONNAIRERESPONSE,
    /**
     * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
     */
    REFERRALREQUEST,
    /**
     * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
     */
    RELATEDPERSON,
    /**
     * --- Abstract Type! ---This is the base resource type for everything.
     */
    RESOURCE,
    /**
     * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
     */
    RISKASSESSMENT,
    /**
     * A container for slot(s) of time that may be available for booking appointments.
     */
    SCHEDULE,
    /**
     * A search parameter that defines a named search item that can be used to search/filter on a resource.
     */
    SEARCHPARAMETER,
    /**
     * A slot of time on a schedule that may be available for booking appointments.
     */
    SLOT,
    /**
     * A sample to be used for analysis.
     */
    SPECIMEN,
    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.
     */
    STRUCTUREDEFINITION,
    /**
     * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
     */
    SUBSCRIPTION,
    /**
     * A homogeneous material with a definite composition.
     */
    SUBSTANCE,
    /**
     * Record of delivery of what is supplied.
     */
    SUPPLYDELIVERY,
    /**
     * A record of a request for a medication, substance or device used in the healthcare setting.
     */
    SUPPLYREQUEST,
    /**
     * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
     */
    TESTSCRIPT,
    /**
     * A value set specifies a set of codes drawn from one or more code systems.
     */
    VALUESET,
    /**
     * An authorization for the supply of glasses and/or contact lenses to a patient.
     */
    VISIONPRESCRIPTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static FHIRDefinedType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Address".equals(codeString))
            return ADDRESS;
        if ("Age".equals(codeString))
            return AGE;
        if ("Annotation".equals(codeString))
            return ANNOTATION;
        if ("Attachment".equals(codeString))
            return ATTACHMENT;
        if ("BackboneElement".equals(codeString))
            return BACKBONEELEMENT;
        if ("CodeableConcept".equals(codeString))
            return CODEABLECONCEPT;
        if ("Coding".equals(codeString))
            return CODING;
        if ("ContactPoint".equals(codeString))
            return CONTACTPOINT;
        if ("Count".equals(codeString))
            return COUNT;
        if ("Distance".equals(codeString))
            return DISTANCE;
        if ("Duration".equals(codeString))
            return DURATION;
        if ("Element".equals(codeString))
            return ELEMENT;
        if ("ElementDefinition".equals(codeString))
            return ELEMENTDEFINITION;
        if ("Extension".equals(codeString))
            return EXTENSION;
        if ("HumanName".equals(codeString))
            return HUMANNAME;
        if ("Identifier".equals(codeString))
            return IDENTIFIER;
        if ("Meta".equals(codeString))
            return META;
        if ("Money".equals(codeString))
            return MONEY;
        if ("Narrative".equals(codeString))
            return NARRATIVE;
        if ("Period".equals(codeString))
            return PERIOD;
        if ("Quantity".equals(codeString))
            return QUANTITY;
        if ("Range".equals(codeString))
            return RANGE;
        if ("Ratio".equals(codeString))
            return RATIO;
        if ("Reference".equals(codeString))
            return REFERENCE;
        if ("SampledData".equals(codeString))
            return SAMPLEDDATA;
        if ("Signature".equals(codeString))
            return SIGNATURE;
        if ("SimpleQuantity".equals(codeString))
            return SIMPLEQUANTITY;
        if ("Timing".equals(codeString))
            return TIMING;
        if ("base64Binary".equals(codeString))
            return BASE64BINARY;
        if ("boolean".equals(codeString))
            return BOOLEAN;
        if ("code".equals(codeString))
            return CODE;
        if ("date".equals(codeString))
            return DATE;
        if ("dateTime".equals(codeString))
            return DATETIME;
        if ("decimal".equals(codeString))
            return DECIMAL;
        if ("id".equals(codeString))
            return ID;
        if ("instant".equals(codeString))
            return INSTANT;
        if ("integer".equals(codeString))
            return INTEGER;
        if ("markdown".equals(codeString))
            return MARKDOWN;
        if ("oid".equals(codeString))
            return OID;
        if ("positiveInt".equals(codeString))
            return POSITIVEINT;
        if ("string".equals(codeString))
            return STRING;
        if ("time".equals(codeString))
            return TIME;
        if ("unsignedInt".equals(codeString))
            return UNSIGNEDINT;
        if ("uri".equals(codeString))
            return URI;
        if ("uuid".equals(codeString))
            return UUID;
        if ("xhtml".equals(codeString))
            return XHTML;
        if ("Account".equals(codeString))
            return ACCOUNT;
        if ("AllergyIntolerance".equals(codeString))
            return ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
            return APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
            return APPOINTMENTRESPONSE;
        if ("AuditEvent".equals(codeString))
            return AUDITEVENT;
        if ("Basic".equals(codeString))
            return BASIC;
        if ("Binary".equals(codeString))
            return BINARY;
        if ("BodySite".equals(codeString))
            return BODYSITE;
        if ("Bundle".equals(codeString))
            return BUNDLE;
        if ("CarePlan".equals(codeString))
            return CAREPLAN;
        if ("Claim".equals(codeString))
            return CLAIM;
        if ("ClaimResponse".equals(codeString))
            return CLAIMRESPONSE;
        if ("ClinicalImpression".equals(codeString))
            return CLINICALIMPRESSION;
        if ("Communication".equals(codeString))
            return COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
            return COMMUNICATIONREQUEST;
        if ("Composition".equals(codeString))
            return COMPOSITION;
        if ("ConceptMap".equals(codeString))
            return CONCEPTMAP;
        if ("Condition".equals(codeString))
            return CONDITION;
        if ("Conformance".equals(codeString))
            return CONFORMANCE;
        if ("Contract".equals(codeString))
            return CONTRACT;
        if ("Coverage".equals(codeString))
            return COVERAGE;
        if ("DataElement".equals(codeString))
            return DATAELEMENT;
        if ("DetectedIssue".equals(codeString))
            return DETECTEDISSUE;
        if ("Device".equals(codeString))
            return DEVICE;
        if ("DeviceComponent".equals(codeString))
            return DEVICECOMPONENT;
        if ("DeviceMetric".equals(codeString))
            return DEVICEMETRIC;
        if ("DeviceUseRequest".equals(codeString))
            return DEVICEUSEREQUEST;
        if ("DeviceUseStatement".equals(codeString))
            return DEVICEUSESTATEMENT;
        if ("DiagnosticOrder".equals(codeString))
            return DIAGNOSTICORDER;
        if ("DiagnosticReport".equals(codeString))
            return DIAGNOSTICREPORT;
        if ("DocumentManifest".equals(codeString))
            return DOCUMENTMANIFEST;
        if ("DocumentReference".equals(codeString))
            return DOCUMENTREFERENCE;
        if ("DomainResource".equals(codeString))
            return DOMAINRESOURCE;
        if ("EligibilityRequest".equals(codeString))
            return ELIGIBILITYREQUEST;
        if ("EligibilityResponse".equals(codeString))
            return ELIGIBILITYRESPONSE;
        if ("Encounter".equals(codeString))
            return ENCOUNTER;
        if ("EnrollmentRequest".equals(codeString))
            return ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
            return ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
            return EPISODEOFCARE;
        if ("ExplanationOfBenefit".equals(codeString))
            return EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
            return FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
            return FLAG;
        if ("Goal".equals(codeString))
            return GOAL;
        if ("Group".equals(codeString))
            return GROUP;
        if ("HealthcareService".equals(codeString))
            return HEALTHCARESERVICE;
        if ("ImagingObjectSelection".equals(codeString))
            return IMAGINGOBJECTSELECTION;
        if ("ImagingStudy".equals(codeString))
            return IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
            return IMMUNIZATION;
        if ("ImmunizationRecommendation".equals(codeString))
            return IMMUNIZATIONRECOMMENDATION;
        if ("ImplementationGuide".equals(codeString))
            return IMPLEMENTATIONGUIDE;
        if ("List".equals(codeString))
            return LIST;
        if ("Location".equals(codeString))
            return LOCATION;
        if ("Media".equals(codeString))
            return MEDIA;
        if ("Medication".equals(codeString))
            return MEDICATION;
        if ("MedicationAdministration".equals(codeString))
            return MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
            return MEDICATIONDISPENSE;
        if ("MedicationOrder".equals(codeString))
            return MEDICATIONORDER;
        if ("MedicationStatement".equals(codeString))
            return MEDICATIONSTATEMENT;
        if ("MessageHeader".equals(codeString))
            return MESSAGEHEADER;
        if ("NamingSystem".equals(codeString))
            return NAMINGSYSTEM;
        if ("NutritionOrder".equals(codeString))
            return NUTRITIONORDER;
        if ("Observation".equals(codeString))
            return OBSERVATION;
        if ("OperationDefinition".equals(codeString))
            return OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
            return OPERATIONOUTCOME;
        if ("Order".equals(codeString))
            return ORDER;
        if ("OrderResponse".equals(codeString))
            return ORDERRESPONSE;
        if ("Organization".equals(codeString))
            return ORGANIZATION;
        if ("Parameters".equals(codeString))
            return PARAMETERS;
        if ("Patient".equals(codeString))
            return PATIENT;
        if ("PaymentNotice".equals(codeString))
            return PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
            return PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
            return PERSON;
        if ("Practitioner".equals(codeString))
            return PRACTITIONER;
        if ("Procedure".equals(codeString))
            return PROCEDURE;
        if ("ProcedureRequest".equals(codeString))
            return PROCEDUREREQUEST;
        if ("ProcessRequest".equals(codeString))
            return PROCESSREQUEST;
        if ("ProcessResponse".equals(codeString))
            return PROCESSRESPONSE;
        if ("Provenance".equals(codeString))
            return PROVENANCE;
        if ("Questionnaire".equals(codeString))
            return QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
            return QUESTIONNAIRERESPONSE;
        if ("ReferralRequest".equals(codeString))
            return REFERRALREQUEST;
        if ("RelatedPerson".equals(codeString))
            return RELATEDPERSON;
        if ("Resource".equals(codeString))
            return RESOURCE;
        if ("RiskAssessment".equals(codeString))
            return RISKASSESSMENT;
        if ("Schedule".equals(codeString))
            return SCHEDULE;
        if ("SearchParameter".equals(codeString))
            return SEARCHPARAMETER;
        if ("Slot".equals(codeString))
            return SLOT;
        if ("Specimen".equals(codeString))
            return SPECIMEN;
        if ("StructureDefinition".equals(codeString))
            return STRUCTUREDEFINITION;
        if ("Subscription".equals(codeString))
            return SUBSCRIPTION;
        if ("Substance".equals(codeString))
            return SUBSTANCE;
        if ("SupplyDelivery".equals(codeString))
            return SUPPLYDELIVERY;
        if ("SupplyRequest".equals(codeString))
            return SUPPLYREQUEST;
        if ("TestScript".equals(codeString))
            return TESTSCRIPT;
        if ("ValueSet".equals(codeString))
            return VALUESET;
        if ("VisionPrescription".equals(codeString))
            return VISIONPRESCRIPTION;
        throw new FHIRException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ADDRESS:
                return "Address";
            case AGE:
                return "Age";
            case ANNOTATION:
                return "Annotation";
            case ATTACHMENT:
                return "Attachment";
            case BACKBONEELEMENT:
                return "BackboneElement";
            case CODEABLECONCEPT:
                return "CodeableConcept";
            case CODING:
                return "Coding";
            case CONTACTPOINT:
                return "ContactPoint";
            case COUNT:
                return "Count";
            case DISTANCE:
                return "Distance";
            case DURATION:
                return "Duration";
            case ELEMENT:
                return "Element";
            case ELEMENTDEFINITION:
                return "ElementDefinition";
            case EXTENSION:
                return "Extension";
            case HUMANNAME:
                return "HumanName";
            case IDENTIFIER:
                return "Identifier";
            case META:
                return "Meta";
            case MONEY:
                return "Money";
            case NARRATIVE:
                return "Narrative";
            case PERIOD:
                return "Period";
            case QUANTITY:
                return "Quantity";
            case RANGE:
                return "Range";
            case RATIO:
                return "Ratio";
            case REFERENCE:
                return "Reference";
            case SAMPLEDDATA:
                return "SampledData";
            case SIGNATURE:
                return "Signature";
            case SIMPLEQUANTITY:
                return "SimpleQuantity";
            case TIMING:
                return "Timing";
            case BASE64BINARY:
                return "base64Binary";
            case BOOLEAN:
                return "boolean";
            case CODE:
                return "code";
            case DATE:
                return "date";
            case DATETIME:
                return "dateTime";
            case DECIMAL:
                return "decimal";
            case ID:
                return "id";
            case INSTANT:
                return "instant";
            case INTEGER:
                return "integer";
            case MARKDOWN:
                return "markdown";
            case OID:
                return "oid";
            case POSITIVEINT:
                return "positiveInt";
            case STRING:
                return "string";
            case TIME:
                return "time";
            case UNSIGNEDINT:
                return "unsignedInt";
            case URI:
                return "uri";
            case UUID:
                return "uuid";
            case XHTML:
                return "xhtml";
            case ACCOUNT:
                return "Account";
            case ALLERGYINTOLERANCE:
                return "AllergyIntolerance";
            case APPOINTMENT:
                return "Appointment";
            case APPOINTMENTRESPONSE:
                return "AppointmentResponse";
            case AUDITEVENT:
                return "AuditEvent";
            case BASIC:
                return "Basic";
            case BINARY:
                return "Binary";
            case BODYSITE:
                return "BodySite";
            case BUNDLE:
                return "Bundle";
            case CAREPLAN:
                return "CarePlan";
            case CLAIM:
                return "Claim";
            case CLAIMRESPONSE:
                return "ClaimResponse";
            case CLINICALIMPRESSION:
                return "ClinicalImpression";
            case COMMUNICATION:
                return "Communication";
            case COMMUNICATIONREQUEST:
                return "CommunicationRequest";
            case COMPOSITION:
                return "Composition";
            case CONCEPTMAP:
                return "ConceptMap";
            case CONDITION:
                return "Condition";
            case CONFORMANCE:
                return "Conformance";
            case CONTRACT:
                return "Contract";
            case COVERAGE:
                return "Coverage";
            case DATAELEMENT:
                return "DataElement";
            case DETECTEDISSUE:
                return "DetectedIssue";
            case DEVICE:
                return "Device";
            case DEVICECOMPONENT:
                return "DeviceComponent";
            case DEVICEMETRIC:
                return "DeviceMetric";
            case DEVICEUSEREQUEST:
                return "DeviceUseRequest";
            case DEVICEUSESTATEMENT:
                return "DeviceUseStatement";
            case DIAGNOSTICORDER:
                return "DiagnosticOrder";
            case DIAGNOSTICREPORT:
                return "DiagnosticReport";
            case DOCUMENTMANIFEST:
                return "DocumentManifest";
            case DOCUMENTREFERENCE:
                return "DocumentReference";
            case DOMAINRESOURCE:
                return "DomainResource";
            case ELIGIBILITYREQUEST:
                return "EligibilityRequest";
            case ELIGIBILITYRESPONSE:
                return "EligibilityResponse";
            case ENCOUNTER:
                return "Encounter";
            case ENROLLMENTREQUEST:
                return "EnrollmentRequest";
            case ENROLLMENTRESPONSE:
                return "EnrollmentResponse";
            case EPISODEOFCARE:
                return "EpisodeOfCare";
            case EXPLANATIONOFBENEFIT:
                return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY:
                return "FamilyMemberHistory";
            case FLAG:
                return "Flag";
            case GOAL:
                return "Goal";
            case GROUP:
                return "Group";
            case HEALTHCARESERVICE:
                return "HealthcareService";
            case IMAGINGOBJECTSELECTION:
                return "ImagingObjectSelection";
            case IMAGINGSTUDY:
                return "ImagingStudy";
            case IMMUNIZATION:
                return "Immunization";
            case IMMUNIZATIONRECOMMENDATION:
                return "ImmunizationRecommendation";
            case IMPLEMENTATIONGUIDE:
                return "ImplementationGuide";
            case LIST:
                return "List";
            case LOCATION:
                return "Location";
            case MEDIA:
                return "Media";
            case MEDICATION:
                return "Medication";
            case MEDICATIONADMINISTRATION:
                return "MedicationAdministration";
            case MEDICATIONDISPENSE:
                return "MedicationDispense";
            case MEDICATIONORDER:
                return "MedicationOrder";
            case MEDICATIONSTATEMENT:
                return "MedicationStatement";
            case MESSAGEHEADER:
                return "MessageHeader";
            case NAMINGSYSTEM:
                return "NamingSystem";
            case NUTRITIONORDER:
                return "NutritionOrder";
            case OBSERVATION:
                return "Observation";
            case OPERATIONDEFINITION:
                return "OperationDefinition";
            case OPERATIONOUTCOME:
                return "OperationOutcome";
            case ORDER:
                return "Order";
            case ORDERRESPONSE:
                return "OrderResponse";
            case ORGANIZATION:
                return "Organization";
            case PARAMETERS:
                return "Parameters";
            case PATIENT:
                return "Patient";
            case PAYMENTNOTICE:
                return "PaymentNotice";
            case PAYMENTRECONCILIATION:
                return "PaymentReconciliation";
            case PERSON:
                return "Person";
            case PRACTITIONER:
                return "Practitioner";
            case PROCEDURE:
                return "Procedure";
            case PROCEDUREREQUEST:
                return "ProcedureRequest";
            case PROCESSREQUEST:
                return "ProcessRequest";
            case PROCESSRESPONSE:
                return "ProcessResponse";
            case PROVENANCE:
                return "Provenance";
            case QUESTIONNAIRE:
                return "Questionnaire";
            case QUESTIONNAIRERESPONSE:
                return "QuestionnaireResponse";
            case REFERRALREQUEST:
                return "ReferralRequest";
            case RELATEDPERSON:
                return "RelatedPerson";
            case RESOURCE:
                return "Resource";
            case RISKASSESSMENT:
                return "RiskAssessment";
            case SCHEDULE:
                return "Schedule";
            case SEARCHPARAMETER:
                return "SearchParameter";
            case SLOT:
                return "Slot";
            case SPECIMEN:
                return "Specimen";
            case STRUCTUREDEFINITION:
                return "StructureDefinition";
            case SUBSCRIPTION:
                return "Subscription";
            case SUBSTANCE:
                return "Substance";
            case SUPPLYDELIVERY:
                return "SupplyDelivery";
            case SUPPLYREQUEST:
                return "SupplyRequest";
            case TESTSCRIPT:
                return "TestScript";
            case VALUESET:
                return "ValueSet";
            case VISIONPRESCRIPTION:
                return "VisionPrescription";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ADDRESS:
                return "http://hl7.org/fhir/data-types";
            case AGE:
                return "http://hl7.org/fhir/data-types";
            case ANNOTATION:
                return "http://hl7.org/fhir/data-types";
            case ATTACHMENT:
                return "http://hl7.org/fhir/data-types";
            case BACKBONEELEMENT:
                return "http://hl7.org/fhir/data-types";
            case CODEABLECONCEPT:
                return "http://hl7.org/fhir/data-types";
            case CODING:
                return "http://hl7.org/fhir/data-types";
            case CONTACTPOINT:
                return "http://hl7.org/fhir/data-types";
            case COUNT:
                return "http://hl7.org/fhir/data-types";
            case DISTANCE:
                return "http://hl7.org/fhir/data-types";
            case DURATION:
                return "http://hl7.org/fhir/data-types";
            case ELEMENT:
                return "http://hl7.org/fhir/data-types";
            case ELEMENTDEFINITION:
                return "http://hl7.org/fhir/data-types";
            case EXTENSION:
                return "http://hl7.org/fhir/data-types";
            case HUMANNAME:
                return "http://hl7.org/fhir/data-types";
            case IDENTIFIER:
                return "http://hl7.org/fhir/data-types";
            case META:
                return "http://hl7.org/fhir/data-types";
            case MONEY:
                return "http://hl7.org/fhir/data-types";
            case NARRATIVE:
                return "http://hl7.org/fhir/data-types";
            case PERIOD:
                return "http://hl7.org/fhir/data-types";
            case QUANTITY:
                return "http://hl7.org/fhir/data-types";
            case RANGE:
                return "http://hl7.org/fhir/data-types";
            case RATIO:
                return "http://hl7.org/fhir/data-types";
            case REFERENCE:
                return "http://hl7.org/fhir/data-types";
            case SAMPLEDDATA:
                return "http://hl7.org/fhir/data-types";
            case SIGNATURE:
                return "http://hl7.org/fhir/data-types";
            case SIMPLEQUANTITY:
                return "http://hl7.org/fhir/data-types";
            case TIMING:
                return "http://hl7.org/fhir/data-types";
            case BASE64BINARY:
                return "http://hl7.org/fhir/data-types";
            case BOOLEAN:
                return "http://hl7.org/fhir/data-types";
            case CODE:
                return "http://hl7.org/fhir/data-types";
            case DATE:
                return "http://hl7.org/fhir/data-types";
            case DATETIME:
                return "http://hl7.org/fhir/data-types";
            case DECIMAL:
                return "http://hl7.org/fhir/data-types";
            case ID:
                return "http://hl7.org/fhir/data-types";
            case INSTANT:
                return "http://hl7.org/fhir/data-types";
            case INTEGER:
                return "http://hl7.org/fhir/data-types";
            case MARKDOWN:
                return "http://hl7.org/fhir/data-types";
            case OID:
                return "http://hl7.org/fhir/data-types";
            case POSITIVEINT:
                return "http://hl7.org/fhir/data-types";
            case STRING:
                return "http://hl7.org/fhir/data-types";
            case TIME:
                return "http://hl7.org/fhir/data-types";
            case UNSIGNEDINT:
                return "http://hl7.org/fhir/data-types";
            case URI:
                return "http://hl7.org/fhir/data-types";
            case UUID:
                return "http://hl7.org/fhir/data-types";
            case XHTML:
                return "http://hl7.org/fhir/data-types";
            case ACCOUNT:
                return "http://hl7.org/fhir/resource-types";
            case ALLERGYINTOLERANCE:
                return "http://hl7.org/fhir/resource-types";
            case APPOINTMENT:
                return "http://hl7.org/fhir/resource-types";
            case APPOINTMENTRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case AUDITEVENT:
                return "http://hl7.org/fhir/resource-types";
            case BASIC:
                return "http://hl7.org/fhir/resource-types";
            case BINARY:
                return "http://hl7.org/fhir/resource-types";
            case BODYSITE:
                return "http://hl7.org/fhir/resource-types";
            case BUNDLE:
                return "http://hl7.org/fhir/resource-types";
            case CAREPLAN:
                return "http://hl7.org/fhir/resource-types";
            case CLAIM:
                return "http://hl7.org/fhir/resource-types";
            case CLAIMRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case CLINICALIMPRESSION:
                return "http://hl7.org/fhir/resource-types";
            case COMMUNICATION:
                return "http://hl7.org/fhir/resource-types";
            case COMMUNICATIONREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case COMPOSITION:
                return "http://hl7.org/fhir/resource-types";
            case CONCEPTMAP:
                return "http://hl7.org/fhir/resource-types";
            case CONDITION:
                return "http://hl7.org/fhir/resource-types";
            case CONFORMANCE:
                return "http://hl7.org/fhir/resource-types";
            case CONTRACT:
                return "http://hl7.org/fhir/resource-types";
            case COVERAGE:
                return "http://hl7.org/fhir/resource-types";
            case DATAELEMENT:
                return "http://hl7.org/fhir/resource-types";
            case DETECTEDISSUE:
                return "http://hl7.org/fhir/resource-types";
            case DEVICE:
                return "http://hl7.org/fhir/resource-types";
            case DEVICECOMPONENT:
                return "http://hl7.org/fhir/resource-types";
            case DEVICEMETRIC:
                return "http://hl7.org/fhir/resource-types";
            case DEVICEUSEREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case DEVICEUSESTATEMENT:
                return "http://hl7.org/fhir/resource-types";
            case DIAGNOSTICORDER:
                return "http://hl7.org/fhir/resource-types";
            case DIAGNOSTICREPORT:
                return "http://hl7.org/fhir/resource-types";
            case DOCUMENTMANIFEST:
                return "http://hl7.org/fhir/resource-types";
            case DOCUMENTREFERENCE:
                return "http://hl7.org/fhir/resource-types";
            case DOMAINRESOURCE:
                return "http://hl7.org/fhir/resource-types";
            case ELIGIBILITYREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case ELIGIBILITYRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case ENCOUNTER:
                return "http://hl7.org/fhir/resource-types";
            case ENROLLMENTREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case ENROLLMENTRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case EPISODEOFCARE:
                return "http://hl7.org/fhir/resource-types";
            case EXPLANATIONOFBENEFIT:
                return "http://hl7.org/fhir/resource-types";
            case FAMILYMEMBERHISTORY:
                return "http://hl7.org/fhir/resource-types";
            case FLAG:
                return "http://hl7.org/fhir/resource-types";
            case GOAL:
                return "http://hl7.org/fhir/resource-types";
            case GROUP:
                return "http://hl7.org/fhir/resource-types";
            case HEALTHCARESERVICE:
                return "http://hl7.org/fhir/resource-types";
            case IMAGINGOBJECTSELECTION:
                return "http://hl7.org/fhir/resource-types";
            case IMAGINGSTUDY:
                return "http://hl7.org/fhir/resource-types";
            case IMMUNIZATION:
                return "http://hl7.org/fhir/resource-types";
            case IMMUNIZATIONRECOMMENDATION:
                return "http://hl7.org/fhir/resource-types";
            case IMPLEMENTATIONGUIDE:
                return "http://hl7.org/fhir/resource-types";
            case LIST:
                return "http://hl7.org/fhir/resource-types";
            case LOCATION:
                return "http://hl7.org/fhir/resource-types";
            case MEDIA:
                return "http://hl7.org/fhir/resource-types";
            case MEDICATION:
                return "http://hl7.org/fhir/resource-types";
            case MEDICATIONADMINISTRATION:
                return "http://hl7.org/fhir/resource-types";
            case MEDICATIONDISPENSE:
                return "http://hl7.org/fhir/resource-types";
            case MEDICATIONORDER:
                return "http://hl7.org/fhir/resource-types";
            case MEDICATIONSTATEMENT:
                return "http://hl7.org/fhir/resource-types";
            case MESSAGEHEADER:
                return "http://hl7.org/fhir/resource-types";
            case NAMINGSYSTEM:
                return "http://hl7.org/fhir/resource-types";
            case NUTRITIONORDER:
                return "http://hl7.org/fhir/resource-types";
            case OBSERVATION:
                return "http://hl7.org/fhir/resource-types";
            case OPERATIONDEFINITION:
                return "http://hl7.org/fhir/resource-types";
            case OPERATIONOUTCOME:
                return "http://hl7.org/fhir/resource-types";
            case ORDER:
                return "http://hl7.org/fhir/resource-types";
            case ORDERRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case ORGANIZATION:
                return "http://hl7.org/fhir/resource-types";
            case PARAMETERS:
                return "http://hl7.org/fhir/resource-types";
            case PATIENT:
                return "http://hl7.org/fhir/resource-types";
            case PAYMENTNOTICE:
                return "http://hl7.org/fhir/resource-types";
            case PAYMENTRECONCILIATION:
                return "http://hl7.org/fhir/resource-types";
            case PERSON:
                return "http://hl7.org/fhir/resource-types";
            case PRACTITIONER:
                return "http://hl7.org/fhir/resource-types";
            case PROCEDURE:
                return "http://hl7.org/fhir/resource-types";
            case PROCEDUREREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case PROCESSREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case PROCESSRESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case PROVENANCE:
                return "http://hl7.org/fhir/resource-types";
            case QUESTIONNAIRE:
                return "http://hl7.org/fhir/resource-types";
            case QUESTIONNAIRERESPONSE:
                return "http://hl7.org/fhir/resource-types";
            case REFERRALREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case RELATEDPERSON:
                return "http://hl7.org/fhir/resource-types";
            case RESOURCE:
                return "http://hl7.org/fhir/resource-types";
            case RISKASSESSMENT:
                return "http://hl7.org/fhir/resource-types";
            case SCHEDULE:
                return "http://hl7.org/fhir/resource-types";
            case SEARCHPARAMETER:
                return "http://hl7.org/fhir/resource-types";
            case SLOT:
                return "http://hl7.org/fhir/resource-types";
            case SPECIMEN:
                return "http://hl7.org/fhir/resource-types";
            case STRUCTUREDEFINITION:
                return "http://hl7.org/fhir/resource-types";
            case SUBSCRIPTION:
                return "http://hl7.org/fhir/resource-types";
            case SUBSTANCE:
                return "http://hl7.org/fhir/resource-types";
            case SUPPLYDELIVERY:
                return "http://hl7.org/fhir/resource-types";
            case SUPPLYREQUEST:
                return "http://hl7.org/fhir/resource-types";
            case TESTSCRIPT:
                return "http://hl7.org/fhir/resource-types";
            case VALUESET:
                return "http://hl7.org/fhir/resource-types";
            case VISIONPRESCRIPTION:
                return "http://hl7.org/fhir/resource-types";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ADDRESS:
                return "There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.";
            case AGE:
                return "";
            case ANNOTATION:
                return "A  text note which also  contains information about who made the statement and when.";
            case ATTACHMENT:
                return "For referring to data content defined in other formats.";
            case BACKBONEELEMENT:
                return "Base definition for all elements that are defined inside a resource - but not those in a data type.";
            case CODEABLECONCEPT:
                return "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.";
            case CODING:
                return "A reference to a code defined by a terminology system.";
            case CONTACTPOINT:
                return "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.";
            case COUNT:
                return "";
            case DISTANCE:
                return "";
            case DURATION:
                return "";
            case ELEMENT:
                return "Base definition for all elements in a resource.";
            case ELEMENTDEFINITION:
                return "Captures constraints on each element within the resource, profile, or extension.";
            case EXTENSION:
                return "Optional Extensions Element - found in all resources.";
            case HUMANNAME:
                return "A human's name with the ability to identify parts and usage.";
            case IDENTIFIER:
                return "A technical identifier - identifies some entity uniquely and unambiguously.";
            case META:
                return "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.";
            case MONEY:
                return "";
            case NARRATIVE:
                return "A human-readable formatted text, including images.";
            case PERIOD:
                return "A time period defined by a start and end date and optionally time.";
            case QUANTITY:
                return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
            case RANGE:
                return "A set of ordered Quantities defined by a low and high limit.";
            case RATIO:
                return "A relationship of two Quantity values - expressed as a numerator and a denominator.";
            case REFERENCE:
                return "A reference from one resource to another.";
            case SAMPLEDDATA:
                return "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.";
            case SIGNATURE:
                return "A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different Signature approaches have different utilities.";
            case SIMPLEQUANTITY:
                return "";
            case TIMING:
                return "Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.";
            case BASE64BINARY:
                return "A stream of bytes";
            case BOOLEAN:
                return "Value of \"true\" or \"false\"";
            case CODE:
                return "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents";
            case DATE:
                return "A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.";
            case DATETIME:
                return "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.";
            case DECIMAL:
                return "A rational number with implicit precision";
            case ID:
                return "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.";
            case INSTANT:
                return "An instant in time - known at least to the second";
            case INTEGER:
                return "A whole number";
            case MARKDOWN:
                return "A string that may contain markdown syntax for optional processing by a mark down presentation engine";
            case OID:
                return "An oid represented as a URI";
            case POSITIVEINT:
                return "An integer with a value that is positive (e.g. >0)";
            case STRING:
                return "A sequence of Unicode characters";
            case TIME:
                return "A time during the day, with no date specified";
            case UNSIGNEDINT:
                return "An integer with a value that is not negative (e.g. >= 0)";
            case URI:
                return "String of characters used to identify a name or a resource";
            case UUID:
                return "A UUID, represented as a URI";
            case XHTML:
                return "XHTML format, as defined by W3C, but restricted usage (mainly, no active content)";
            case ACCOUNT:
                return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centres, etc.";
            case ALLERGYINTOLERANCE:
                return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
            case APPOINTMENT:
                return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
            case APPOINTMENTRESPONSE:
                return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
            case AUDITEVENT:
                return "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.";
            case BASIC:
                return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
            case BINARY:
                return "A binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
            case BODYSITE:
                return "Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
            case BUNDLE:
                return "A container for a collection of resources.";
            case CAREPLAN:
                return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
            case CLAIM:
                return "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.";
            case CLAIMRESPONSE:
                return "This resource provides the adjudication details from the processing of a Claim resource.";
            case CLINICALIMPRESSION:
                return "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.";
            case COMMUNICATION:
                return "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.";
            case COMMUNICATIONREQUEST:
                return "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.";
            case COMPOSITION:
                return "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.";
            case CONCEPTMAP:
                return "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.";
            case CONDITION:
                return "Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a diagnosis during an encounter; populating a problem list or a summary statement, such as a discharge summary.";
            case CONFORMANCE:
                return "A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
            case CONTRACT:
                return "A formal agreement between parties regarding the conduct of business, exchange of information or other matters.";
            case COVERAGE:
                return "Financial instrument which may be used to pay for or reimburse health care products and services.";
            case DATAELEMENT:
                return "The formal description of a single piece of information that can be gathered and reported.";
            case DETECTEDISSUE:
                return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.";
            case DEVICE:
                return "This resource identifies an instance of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices includes durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.";
            case DEVICECOMPONENT:
                return "Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.";
            case DEVICEMETRIC:
                return "Describes a measurement, calculation or setting capability of a medical device.";
            case DEVICEUSEREQUEST:
                return "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.";
            case DEVICEUSESTATEMENT:
                return "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.";
            case DIAGNOSTICORDER:
                return "A record of a request for a diagnostic investigation service to be performed.";
            case DIAGNOSTICREPORT:
                return "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.";
            case DOCUMENTMANIFEST:
                return "A manifest that defines a set of documents.";
            case DOCUMENTREFERENCE:
                return "A reference to a document .";
            case DOMAINRESOURCE:
                return "--- Abstract Type! ---A resource that includes narrative, extensions, and contained resources.";
            case ELIGIBILITYREQUEST:
                return "This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.";
            case ELIGIBILITYRESPONSE:
                return "This resource provides eligibility and plan details from the processing of an Eligibility resource.";
            case ENCOUNTER:
                return "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.";
            case ENROLLMENTREQUEST:
                return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
            case ENROLLMENTRESPONSE:
                return "This resource provides enrollment and plan details from the processing of an Enrollment resource.";
            case EPISODEOFCARE:
                return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
            case EXPLANATIONOFBENEFIT:
                return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
            case FAMILYMEMBERHISTORY:
                return "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.";
            case FLAG:
                return "Prospective warnings of potential issues when providing care to the patient.";
            case GOAL:
                return "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.";
            case GROUP:
                return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.";
            case HEALTHCARESERVICE:
                return "The details of a healthcare service available at a location.";
            case IMAGINGOBJECTSELECTION:
                return "A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance (\"cine\" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.";
            case IMAGINGSTUDY:
                return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.";
            case IMMUNIZATION:
                return "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.";
            case IMMUNIZATIONRECOMMENDATION:
                return "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.";
            case IMPLEMENTATIONGUIDE:
                return "A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.";
            case LIST:
                return "A set of information summarized from a list of other resources.";
            case LOCATION:
                return "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.";
            case MEDIA:
                return "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.";
            case MEDICATION:
                return "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.";
            case MEDICATIONADMINISTRATION:
                return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.";
            case MEDICATIONDISPENSE:
                return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
            case MEDICATIONORDER:
                return "An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationOrder\" rather than \"MedicationPrescription\" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.";
            case MEDICATIONSTATEMENT:
                return "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains \r\rThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.";
            case MESSAGEHEADER:
                return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
            case NAMINGSYSTEM:
                return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
            case NUTRITIONORDER:
                return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.";
            case OBSERVATION:
                return "Measurements and simple assertions made about a patient, device or other subject.";
            case OPERATIONDEFINITION:
                return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
            case OPERATIONOUTCOME:
                return "A collection of error, warning or information messages that result from a system action.";
            case ORDER:
                return "A request to perform an action.";
            case ORDERRESPONSE:
                return "A response to an order.";
            case ORGANIZATION:
                return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.";
            case PARAMETERS:
                return "This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.";
            case PATIENT:
                return "Demographics and other administrative information about an individual or animal receiving care or other health-related services.";
            case PAYMENTNOTICE:
                return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
            case PAYMENTRECONCILIATION:
                return "This resource provides payment details and claim references supporting a bulk payment.";
            case PERSON:
                return "Demographics and administrative information about a person independent of a specific health-related context.";
            case PRACTITIONER:
                return "A person who is directly or indirectly involved in the provisioning of healthcare.";
            case PROCEDURE:
                return "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.";
            case PROCEDUREREQUEST:
                return "A request for a procedure to be performed. May be a proposal or an order.";
            case PROCESSREQUEST:
                return "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.";
            case PROCESSRESPONSE:
                return "This resource provides processing status, errors and notes from the processing of a resource.";
            case PROVENANCE:
                return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.";
            case QUESTIONNAIRE:
                return "A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.";
            case QUESTIONNAIRERESPONSE:
                return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.";
            case REFERRALREQUEST:
                return "Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.";
            case RELATEDPERSON:
                return "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.";
            case RESOURCE:
                return "--- Abstract Type! ---This is the base resource type for everything.";
            case RISKASSESSMENT:
                return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
            case SCHEDULE:
                return "A container for slot(s) of time that may be available for booking appointments.";
            case SEARCHPARAMETER:
                return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
            case SLOT:
                return "A slot of time on a schedule that may be available for booking appointments.";
            case SPECIMEN:
                return "A sample to be used for analysis.";
            case STRUCTUREDEFINITION:
                return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.";
            case SUBSCRIPTION:
                return "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action.";
            case SUBSTANCE:
                return "A homogeneous material with a definite composition.";
            case SUPPLYDELIVERY:
                return "Record of delivery of what is supplied.";
            case SUPPLYREQUEST:
                return "A record of a request for a medication, substance or device used in the healthcare setting.";
            case TESTSCRIPT:
                return "TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.";
            case VALUESET:
                return "A value set specifies a set of codes drawn from one or more code systems.";
            case VISIONPRESCRIPTION:
                return "An authorization for the supply of glasses and/or contact lenses to a patient.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ADDRESS:
                return "Address";
            case AGE:
                return "Age";
            case ANNOTATION:
                return "Annotation";
            case ATTACHMENT:
                return "Attachment";
            case BACKBONEELEMENT:
                return "BackboneElement";
            case CODEABLECONCEPT:
                return "CodeableConcept";
            case CODING:
                return "Coding";
            case CONTACTPOINT:
                return "ContactPoint";
            case COUNT:
                return "Count";
            case DISTANCE:
                return "Distance";
            case DURATION:
                return "Duration";
            case ELEMENT:
                return "Element";
            case ELEMENTDEFINITION:
                return "ElementDefinition";
            case EXTENSION:
                return "Extension";
            case HUMANNAME:
                return "HumanName";
            case IDENTIFIER:
                return "Identifier";
            case META:
                return "Meta";
            case MONEY:
                return "Money";
            case NARRATIVE:
                return "Narrative";
            case PERIOD:
                return "Period";
            case QUANTITY:
                return "Quantity";
            case RANGE:
                return "Range";
            case RATIO:
                return "Ratio";
            case REFERENCE:
                return "Reference";
            case SAMPLEDDATA:
                return "SampledData";
            case SIGNATURE:
                return "Signature";
            case SIMPLEQUANTITY:
                return "SimpleQuantity";
            case TIMING:
                return "Timing";
            case BASE64BINARY:
                return "base64Binary";
            case BOOLEAN:
                return "boolean";
            case CODE:
                return "code";
            case DATE:
                return "date";
            case DATETIME:
                return "dateTime";
            case DECIMAL:
                return "decimal";
            case ID:
                return "id";
            case INSTANT:
                return "instant";
            case INTEGER:
                return "integer";
            case MARKDOWN:
                return "markdown";
            case OID:
                return "oid";
            case POSITIVEINT:
                return "positiveInt";
            case STRING:
                return "string";
            case TIME:
                return "time";
            case UNSIGNEDINT:
                return "unsignedInt";
            case URI:
                return "uri";
            case UUID:
                return "uuid";
            case XHTML:
                return "XHTML";
            case ACCOUNT:
                return "Account";
            case ALLERGYINTOLERANCE:
                return "AllergyIntolerance";
            case APPOINTMENT:
                return "Appointment";
            case APPOINTMENTRESPONSE:
                return "AppointmentResponse";
            case AUDITEVENT:
                return "AuditEvent";
            case BASIC:
                return "Basic";
            case BINARY:
                return "Binary";
            case BODYSITE:
                return "BodySite";
            case BUNDLE:
                return "Bundle";
            case CAREPLAN:
                return "CarePlan";
            case CLAIM:
                return "Claim";
            case CLAIMRESPONSE:
                return "ClaimResponse";
            case CLINICALIMPRESSION:
                return "ClinicalImpression";
            case COMMUNICATION:
                return "Communication";
            case COMMUNICATIONREQUEST:
                return "CommunicationRequest";
            case COMPOSITION:
                return "Composition";
            case CONCEPTMAP:
                return "ConceptMap";
            case CONDITION:
                return "Condition";
            case CONFORMANCE:
                return "Conformance";
            case CONTRACT:
                return "Contract";
            case COVERAGE:
                return "Coverage";
            case DATAELEMENT:
                return "DataElement";
            case DETECTEDISSUE:
                return "DetectedIssue";
            case DEVICE:
                return "Device";
            case DEVICECOMPONENT:
                return "DeviceComponent";
            case DEVICEMETRIC:
                return "DeviceMetric";
            case DEVICEUSEREQUEST:
                return "DeviceUseRequest";
            case DEVICEUSESTATEMENT:
                return "DeviceUseStatement";
            case DIAGNOSTICORDER:
                return "DiagnosticOrder";
            case DIAGNOSTICREPORT:
                return "DiagnosticReport";
            case DOCUMENTMANIFEST:
                return "DocumentManifest";
            case DOCUMENTREFERENCE:
                return "DocumentReference";
            case DOMAINRESOURCE:
                return "DomainResource";
            case ELIGIBILITYREQUEST:
                return "EligibilityRequest";
            case ELIGIBILITYRESPONSE:
                return "EligibilityResponse";
            case ENCOUNTER:
                return "Encounter";
            case ENROLLMENTREQUEST:
                return "EnrollmentRequest";
            case ENROLLMENTRESPONSE:
                return "EnrollmentResponse";
            case EPISODEOFCARE:
                return "EpisodeOfCare";
            case EXPLANATIONOFBENEFIT:
                return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY:
                return "FamilyMemberHistory";
            case FLAG:
                return "Flag";
            case GOAL:
                return "Goal";
            case GROUP:
                return "Group";
            case HEALTHCARESERVICE:
                return "HealthcareService";
            case IMAGINGOBJECTSELECTION:
                return "ImagingObjectSelection";
            case IMAGINGSTUDY:
                return "ImagingStudy";
            case IMMUNIZATION:
                return "Immunization";
            case IMMUNIZATIONRECOMMENDATION:
                return "ImmunizationRecommendation";
            case IMPLEMENTATIONGUIDE:
                return "ImplementationGuide";
            case LIST:
                return "List";
            case LOCATION:
                return "Location";
            case MEDIA:
                return "Media";
            case MEDICATION:
                return "Medication";
            case MEDICATIONADMINISTRATION:
                return "MedicationAdministration";
            case MEDICATIONDISPENSE:
                return "MedicationDispense";
            case MEDICATIONORDER:
                return "MedicationOrder";
            case MEDICATIONSTATEMENT:
                return "MedicationStatement";
            case MESSAGEHEADER:
                return "MessageHeader";
            case NAMINGSYSTEM:
                return "NamingSystem";
            case NUTRITIONORDER:
                return "NutritionOrder";
            case OBSERVATION:
                return "Observation";
            case OPERATIONDEFINITION:
                return "OperationDefinition";
            case OPERATIONOUTCOME:
                return "OperationOutcome";
            case ORDER:
                return "Order";
            case ORDERRESPONSE:
                return "OrderResponse";
            case ORGANIZATION:
                return "Organization";
            case PARAMETERS:
                return "Parameters";
            case PATIENT:
                return "Patient";
            case PAYMENTNOTICE:
                return "PaymentNotice";
            case PAYMENTRECONCILIATION:
                return "PaymentReconciliation";
            case PERSON:
                return "Person";
            case PRACTITIONER:
                return "Practitioner";
            case PROCEDURE:
                return "Procedure";
            case PROCEDUREREQUEST:
                return "ProcedureRequest";
            case PROCESSREQUEST:
                return "ProcessRequest";
            case PROCESSRESPONSE:
                return "ProcessResponse";
            case PROVENANCE:
                return "Provenance";
            case QUESTIONNAIRE:
                return "Questionnaire";
            case QUESTIONNAIRERESPONSE:
                return "QuestionnaireResponse";
            case REFERRALREQUEST:
                return "ReferralRequest";
            case RELATEDPERSON:
                return "RelatedPerson";
            case RESOURCE:
                return "Resource";
            case RISKASSESSMENT:
                return "RiskAssessment";
            case SCHEDULE:
                return "Schedule";
            case SEARCHPARAMETER:
                return "SearchParameter";
            case SLOT:
                return "Slot";
            case SPECIMEN:
                return "Specimen";
            case STRUCTUREDEFINITION:
                return "StructureDefinition";
            case SUBSCRIPTION:
                return "Subscription";
            case SUBSTANCE:
                return "Substance";
            case SUPPLYDELIVERY:
                return "SupplyDelivery";
            case SUPPLYREQUEST:
                return "SupplyRequest";
            case TESTSCRIPT:
                return "TestScript";
            case VALUESET:
                return "ValueSet";
            case VISIONPRESCRIPTION:
                return "VisionPrescription";
            default:
                return "?";
        }
    }
}
