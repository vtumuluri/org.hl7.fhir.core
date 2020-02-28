package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationMode;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatus;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatusEnumFactory;

public class CompositionAttesterComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of attestation the authenticator offers.
     */
    protected List<Enumeration<CompositionAttestationMode>> mode;

    /**
     * When composition was attested by the party.
     */
    protected DateTimeType time;

    /**
     * Who attested the composition in the specified way.
     */
    protected Reference party;

    /**
     * The actual object that is the target of the reference (Who attested the composition in the specified way.)
     */
    protected Resource partyTarget;

    private static final long serialVersionUID = -436604745L;

    /*
     * Constructor
     */
    public CompositionAttesterComponent() {
        super();
    }

    /**
     * @return {@link #mode} (The type of attestation the authenticator offers.)
     */
    public List<Enumeration<CompositionAttestationMode>> getMode() {
        if (this.mode == null)
            this.mode = new ArrayList<Enumeration<CompositionAttestationMode>>();
        return this.mode;
    }

    public boolean hasMode() {
        if (this.mode == null)
            return false;
        for (Enumeration<CompositionAttestationMode> item : this.mode) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CompositionAttesterComponent setMode(List<Enumeration<CompositionAttestationMode>> mode) {
        this.mode = mode;
        return this;
    }

    // syntactic sugar
    public Enumeration<CompositionAttestationMode> addModeElement() {
        // 2
        Enumeration<CompositionAttestationMode> t = new Enumeration<CompositionAttestationMode>(new CompositionAttestationModeEnumFactory());
        if (this.mode == null)
            this.mode = new ArrayList<Enumeration<CompositionAttestationMode>>();
        this.mode.add(t);
        return t;
    }

    /**
     * @param value {@link #mode} (The type of attestation the authenticator offers.)
     */
    public CompositionAttesterComponent addMode(CompositionAttestationMode value) {
        // 1
        Enumeration<CompositionAttestationMode> t = new Enumeration<CompositionAttestationMode>(new CompositionAttestationModeEnumFactory());
        t.setValue(value);
        if (this.mode == null)
            this.mode = new ArrayList<Enumeration<CompositionAttestationMode>>();
        this.mode.add(t);
        return this;
    }

    /**
     * @param value {@link #mode} (The type of attestation the authenticator offers.)
     */
    public boolean hasMode(CompositionAttestationMode value) {
        if (this.mode == null)
            return false;
        for (Enumeration<CompositionAttestationMode> v : this.mode) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #time} (When composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public DateTimeType getTimeElement() {
        if (this.time == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CompositionAttesterComponent.time");
            else if (Configuration.doAutoCreate())
                // bb
                this.time = new DateTimeType();
        return this.time;
    }

    public boolean hasTimeElement() {
        return this.time != null && !this.time.isEmpty();
    }

    public boolean hasTime() {
        return this.time != null && !this.time.isEmpty();
    }

    /**
     * @param value {@link #time} (When composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public CompositionAttesterComponent setTimeElement(DateTimeType value) {
        this.time = value;
        return this;
    }

    /**
     * @return When composition was attested by the party.
     */
    public Date getTime() {
        return this.time == null ? null : this.time.getValue();
    }

    /**
     * @param value When composition was attested by the party.
     */
    public CompositionAttesterComponent setTime(Date value) {
        if (value == null)
            this.time = null;
        else {
            if (this.time == null)
                this.time = new DateTimeType();
            this.time.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #party} (Who attested the composition in the specified way.)
     */
    public Reference getParty() {
        if (this.party == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CompositionAttesterComponent.party");
            else if (Configuration.doAutoCreate())
                // cc
                this.party = new Reference();
        return this.party;
    }

    public boolean hasParty() {
        return this.party != null && !this.party.isEmpty();
    }

    /**
     * @param value {@link #party} (Who attested the composition in the specified way.)
     */
    public CompositionAttesterComponent setParty(Reference value) {
        this.party = value;
        return this;
    }

    /**
     * @return {@link #party} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who attested the composition in the specified way.)
     */
    public Resource getPartyTarget() {
        return this.partyTarget;
    }

    /**
     * @param value {@link #party} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who attested the composition in the specified way.)
     */
    public CompositionAttesterComponent setPartyTarget(Resource value) {
        this.partyTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("mode", "code", "The type of attestation the authenticator offers.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("time", "dateTime", "When composition was attested by the party.", 0, java.lang.Integer.MAX_VALUE, time));
        childrenList.add(new Property("party", "Reference(Patient|Practitioner|Organization)", "Who attested the composition in the specified way.", 0, java.lang.Integer.MAX_VALUE, party));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode"))
            this.getMode().add(new CompositionAttestationModeEnumFactory().fromType(value));
        else if (name.equals("time"))
            // DateTimeType
            this.time = castToDateTime(value);
        else if (name.equals("party"))
            // Reference
            this.party = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.mode");
        } else if (name.equals("time")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.time");
        } else if (name.equals("party")) {
            this.party = new Reference();
            return this.party;
        } else
            return super.addChild(name);
    }

    public CompositionAttesterComponent copy() {
        CompositionAttesterComponent dst = new CompositionAttesterComponent();
        copyValues(dst);
        if (mode != null) {
            dst.mode = new ArrayList<Enumeration<CompositionAttestationMode>>();
            for (Enumeration<CompositionAttestationMode> i : mode) dst.mode.add(i.copy());
        }
        ;
        dst.time = time == null ? null : time.copy();
        dst.party = party == null ? null : party.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CompositionAttesterComponent))
            return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(time, o.time, true) && compareDeep(party, o.party, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CompositionAttesterComponent))
            return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(time, o.time, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (time == null || time.isEmpty()) && (party == null || party.isEmpty());
    }

    public String fhirType() {
        return "Composition.attester";
    }
}
