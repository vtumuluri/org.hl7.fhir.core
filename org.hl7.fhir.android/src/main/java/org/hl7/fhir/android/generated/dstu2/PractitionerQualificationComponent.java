package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;

public class PractitionerQualificationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An identifier that applies to this person's qualification in this role.
     */
    protected List<Identifier> identifier;

    /**
     * Coded representation of the qualification.
     */
    protected CodeableConcept code;

    /**
     * Period during which the qualification is valid.
     */
    protected Period period;

    /**
     * Organization that regulates and issues the qualification.
     */
    protected Reference issuer;

    /**
     * The actual object that is the target of the reference (Organization that regulates and issues the qualification.)
     */
    protected Organization issuerTarget;

    private static final long serialVersionUID = 1095219071L;

    /*
     * Constructor
     */
    public PractitionerQualificationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public PractitionerQualificationComponent(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #identifier} (An identifier that applies to this person's qualification in this role.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public PractitionerQualificationComponent addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #code} (Coded representation of the qualification.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerQualificationComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Coded representation of the qualification.)
     */
    public PractitionerQualificationComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #period} (Period during which the qualification is valid.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerQualificationComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Period during which the qualification is valid.)
     */
    public PractitionerQualificationComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #issuer} (Organization that regulates and issues the qualification.)
     */
    public Reference getIssuer() {
        if (this.issuer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerQualificationComponent.issuer");
            else if (Configuration.doAutoCreate())
                // cc
                this.issuer = new Reference();
        return this.issuer;
    }

    public boolean hasIssuer() {
        return this.issuer != null && !this.issuer.isEmpty();
    }

    /**
     * @param value {@link #issuer} (Organization that regulates and issues the qualification.)
     */
    public PractitionerQualificationComponent setIssuer(Reference value) {
        this.issuer = value;
        return this;
    }

    /**
     * @return {@link #issuer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Organization that regulates and issues the qualification.)
     */
    public Organization getIssuerTarget() {
        if (this.issuerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerQualificationComponent.issuer");
            else if (Configuration.doAutoCreate())
                // aa
                this.issuerTarget = new Organization();
        return this.issuerTarget;
    }

    /**
     * @param value {@link #issuer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Organization that regulates and issues the qualification.)
     */
    public PractitionerQualificationComponent setIssuerTarget(Organization value) {
        this.issuerTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "An identifier that applies to this person's qualification in this role.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("code", "CodeableConcept", "Coded representation of the qualification.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("period", "Period", "Period during which the qualification is valid.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("issuer", "Reference(Organization)", "Organization that regulates and issues the qualification.", 0, java.lang.Integer.MAX_VALUE, issuer));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("issuer"))
            // Reference
            this.issuer = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("issuer")) {
            this.issuer = new Reference();
            return this.issuer;
        } else
            return super.addChild(name);
    }

    public PractitionerQualificationComponent copy() {
        PractitionerQualificationComponent dst = new PractitionerQualificationComponent();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.code = code == null ? null : code.copy();
        dst.period = period == null ? null : period.copy();
        dst.issuer = issuer == null ? null : issuer.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PractitionerQualificationComponent))
            return false;
        PractitionerQualificationComponent o = (PractitionerQualificationComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(code, o.code, true) && compareDeep(period, o.period, true) && compareDeep(issuer, o.issuer, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PractitionerQualificationComponent))
            return false;
        PractitionerQualificationComponent o = (PractitionerQualificationComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (code == null || code.isEmpty()) && (period == null || period.isEmpty()) && (issuer == null || issuer.isEmpty());
    }

    public String fhirType() {
        return "Practitioner.qualification";
    }
}
