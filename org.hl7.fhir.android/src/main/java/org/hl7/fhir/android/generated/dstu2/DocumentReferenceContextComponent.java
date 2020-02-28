package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;

public class DocumentReferenceContextComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes the clinical encounter or type of care that the document content is associated with.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (Describes the clinical encounter or type of care that the document content is associated with.)
     */
    protected Encounter encounterTarget;

    /**
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
     */
    protected List<CodeableConcept> event;

    /**
     * The time period over which the service that is described by the document was provided.
     */
    protected Period period;

    /**
     * The kind of facility where the patient was seen.
     */
    protected CodeableConcept facilityType;

    /**
     * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
     */
    protected CodeableConcept practiceSetting;

    /**
     * The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
     */
    protected Reference sourcePatientInfo;

    /**
     * The actual object that is the target of the reference (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
     */
    protected Patient sourcePatientInfoTarget;

    /**
     * Related identifiers or resources associated with the DocumentReference.
     */
    protected List<DocumentReferenceContextRelatedComponent> related;

    private static final long serialVersionUID = 994799273L;

    /*
     * Constructor
     */
    public DocumentReferenceContextComponent() {
        super();
    }

    /**
     * @return {@link #encounter} (Describes the clinical encounter or type of care that the document content is associated with.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Describes the clinical encounter or type of care that the document content is associated with.)
     */
    public DocumentReferenceContextComponent setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care that the document content is associated with.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care that the document content is associated with.)
     */
    public DocumentReferenceContextComponent setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #event} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
     */
    public List<CodeableConcept> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<CodeableConcept>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (CodeableConcept item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addEvent() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.event == null)
            this.event = new ArrayList<CodeableConcept>();
        this.event.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReferenceContextComponent addEvent(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.event == null)
            this.event = new ArrayList<CodeableConcept>();
        this.event.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The time period over which the service that is described by the document was provided.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The time period over which the service that is described by the document was provided.)
     */
    public DocumentReferenceContextComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #facilityType} (The kind of facility where the patient was seen.)
     */
    public CodeableConcept getFacilityType() {
        if (this.facilityType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.facilityType");
            else if (Configuration.doAutoCreate())
                // cc
                this.facilityType = new CodeableConcept();
        return this.facilityType;
    }

    public boolean hasFacilityType() {
        return this.facilityType != null && !this.facilityType.isEmpty();
    }

    /**
     * @param value {@link #facilityType} (The kind of facility where the patient was seen.)
     */
    public DocumentReferenceContextComponent setFacilityType(CodeableConcept value) {
        this.facilityType = value;
        return this;
    }

    /**
     * @return {@link #practiceSetting} (This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.)
     */
    public CodeableConcept getPracticeSetting() {
        if (this.practiceSetting == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.practiceSetting");
            else if (Configuration.doAutoCreate())
                // cc
                this.practiceSetting = new CodeableConcept();
        return this.practiceSetting;
    }

    public boolean hasPracticeSetting() {
        return this.practiceSetting != null && !this.practiceSetting.isEmpty();
    }

    /**
     * @param value {@link #practiceSetting} (This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.)
     */
    public DocumentReferenceContextComponent setPracticeSetting(CodeableConcept value) {
        this.practiceSetting = value;
        return this;
    }

    /**
     * @return {@link #sourcePatientInfo} (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
     */
    public Reference getSourcePatientInfo() {
        if (this.sourcePatientInfo == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.sourcePatientInfo");
            else if (Configuration.doAutoCreate())
                // cc
                this.sourcePatientInfo = new Reference();
        return this.sourcePatientInfo;
    }

    public boolean hasSourcePatientInfo() {
        return this.sourcePatientInfo != null && !this.sourcePatientInfo.isEmpty();
    }

    /**
     * @param value {@link #sourcePatientInfo} (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
     */
    public DocumentReferenceContextComponent setSourcePatientInfo(Reference value) {
        this.sourcePatientInfo = value;
        return this;
    }

    /**
     * @return {@link #sourcePatientInfo} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
     */
    public Patient getSourcePatientInfoTarget() {
        if (this.sourcePatientInfoTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextComponent.sourcePatientInfo");
            else if (Configuration.doAutoCreate())
                // aa
                this.sourcePatientInfoTarget = new Patient();
        return this.sourcePatientInfoTarget;
    }

    /**
     * @param value {@link #sourcePatientInfo} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
     */
    public DocumentReferenceContextComponent setSourcePatientInfoTarget(Patient value) {
        this.sourcePatientInfoTarget = value;
        return this;
    }

    /**
     * @return {@link #related} (Related identifiers or resources associated with the DocumentReference.)
     */
    public List<DocumentReferenceContextRelatedComponent> getRelated() {
        if (this.related == null)
            this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
        return this.related;
    }

    public boolean hasRelated() {
        if (this.related == null)
            return false;
        for (DocumentReferenceContextRelatedComponent item : this.related) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public DocumentReferenceContextRelatedComponent addRelated() {
        // 3
        DocumentReferenceContextRelatedComponent t = new DocumentReferenceContextRelatedComponent();
        if (this.related == null)
            this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
        this.related.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReferenceContextComponent addRelated(DocumentReferenceContextRelatedComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.related == null)
            this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
        this.related.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care that the document content is associated with.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("event", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("period", "Period", "The time period over which the service that is described by the document was provided.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("facilityType", "CodeableConcept", "The kind of facility where the patient was seen.", 0, java.lang.Integer.MAX_VALUE, facilityType));
        childrenList.add(new Property("practiceSetting", "CodeableConcept", "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.", 0, java.lang.Integer.MAX_VALUE, practiceSetting));
        childrenList.add(new Property("sourcePatientInfo", "Reference(Patient)", "The Patient Information as known when the document was published. May be a reference to a version specific, or contained.", 0, java.lang.Integer.MAX_VALUE, sourcePatientInfo));
        childrenList.add(new Property("related", "", "Related identifiers or resources associated with the DocumentReference.", 0, java.lang.Integer.MAX_VALUE, related));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("event"))
            this.getEvent().add(castToCodeableConcept(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("facilityType"))
            // CodeableConcept
            this.facilityType = castToCodeableConcept(value);
        else if (name.equals("practiceSetting"))
            // CodeableConcept
            this.practiceSetting = castToCodeableConcept(value);
        else if (name.equals("sourcePatientInfo"))
            // Reference
            this.sourcePatientInfo = castToReference(value);
        else if (name.equals("related"))
            this.getRelated().add((DocumentReferenceContextRelatedComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("event")) {
            return addEvent();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("facilityType")) {
            this.facilityType = new CodeableConcept();
            return this.facilityType;
        } else if (name.equals("practiceSetting")) {
            this.practiceSetting = new CodeableConcept();
            return this.practiceSetting;
        } else if (name.equals("sourcePatientInfo")) {
            this.sourcePatientInfo = new Reference();
            return this.sourcePatientInfo;
        } else if (name.equals("related")) {
            return addRelated();
        } else
            return super.addChild(name);
    }

    public DocumentReferenceContextComponent copy() {
        DocumentReferenceContextComponent dst = new DocumentReferenceContextComponent();
        copyValues(dst);
        dst.encounter = encounter == null ? null : encounter.copy();
        if (event != null) {
            dst.event = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : event) dst.event.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        dst.facilityType = facilityType == null ? null : facilityType.copy();
        dst.practiceSetting = practiceSetting == null ? null : practiceSetting.copy();
        dst.sourcePatientInfo = sourcePatientInfo == null ? null : sourcePatientInfo.copy();
        if (related != null) {
            dst.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
            for (DocumentReferenceContextRelatedComponent i : related) dst.related.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReferenceContextComponent))
            return false;
        DocumentReferenceContextComponent o = (DocumentReferenceContextComponent) other;
        return compareDeep(encounter, o.encounter, true) && compareDeep(event, o.event, true) && compareDeep(period, o.period, true) && compareDeep(facilityType, o.facilityType, true) && compareDeep(practiceSetting, o.practiceSetting, true) && compareDeep(sourcePatientInfo, o.sourcePatientInfo, true) && compareDeep(related, o.related, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReferenceContextComponent))
            return false;
        DocumentReferenceContextComponent o = (DocumentReferenceContextComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (encounter == null || encounter.isEmpty()) && (event == null || event.isEmpty()) && (period == null || period.isEmpty()) && (facilityType == null || facilityType.isEmpty()) && (practiceSetting == null || practiceSetting.isEmpty()) && (sourcePatientInfo == null || sourcePatientInfo.isEmpty()) && (related == null || related.isEmpty());
    }

    public String fhirType() {
        return "DocumentReference.context";
    }
}
