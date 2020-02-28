package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatus;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipType;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipTypeEnumFactory;

public class ObservationRelatedComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code specifying the kind of relationship that exists with the target resource.
     */
    protected Enumeration<ObservationRelationshipType> type;

    /**
     * A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.)
     */
    protected Resource targetTarget;

    private static final long serialVersionUID = 1541802577L;

    /*
     * Constructor
     */
    public ObservationRelatedComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ObservationRelatedComponent(Reference target) {
        super();
        this.target = target;
    }

    /**
     * @return {@link #type} (A code specifying the kind of relationship that exists with the target resource.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<ObservationRelationshipType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationRelatedComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<ObservationRelationshipType>(new ObservationRelationshipTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A code specifying the kind of relationship that exists with the target resource.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ObservationRelatedComponent setTypeElement(Enumeration<ObservationRelationshipType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return A code specifying the kind of relationship that exists with the target resource.
     */
    public ObservationRelationshipType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value A code specifying the kind of relationship that exists with the target resource.
     */
    public ObservationRelatedComponent setType(ObservationRelationshipType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<ObservationRelationshipType>(new ObservationRelationshipTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #target} (A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationRelatedComponent.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.)
     */
    public ObservationRelatedComponent setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.)
     */
    public Resource getTargetTarget() {
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.)
     */
    public ObservationRelatedComponent setTargetTarget(Resource value) {
        this.targetTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "A code specifying the kind of relationship that exists with the target resource.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("target", "Reference(Observation|QuestionnaireResponse)", "A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.", 0, java.lang.Integer.MAX_VALUE, target));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<ObservationRelationshipType>
            this.type = new ObservationRelationshipTypeEnumFactory().fromType(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Observation.type");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else
            return super.addChild(name);
    }

    public ObservationRelatedComponent copy() {
        ObservationRelatedComponent dst = new ObservationRelatedComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.target = target == null ? null : target.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ObservationRelatedComponent))
            return false;
        ObservationRelatedComponent o = (ObservationRelatedComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(target, o.target, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ObservationRelatedComponent))
            return false;
        ObservationRelatedComponent o = (ObservationRelatedComponent) other;
        return compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (target == null || target.isEmpty());
    }

    public String fhirType() {
        return "Observation.related";
    }
}
