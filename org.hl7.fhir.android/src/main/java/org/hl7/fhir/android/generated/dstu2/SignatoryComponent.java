package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SignatoryComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Role of this Contract signer, e.g. notary, grantee.
     */
    protected Coding type;

    /**
     * Party which is a signator to this Contract.
     */
    protected Reference party;

    /**
     * The actual object that is the target of the reference (Party which is a signator to this Contract.)
     */
    protected Resource partyTarget;

    /**
     * Legally binding Contract DSIG signature contents in Base64.
     */
    protected StringType signature;

    private static final long serialVersionUID = -1870392043L;

    /*
     * Constructor
     */
    public SignatoryComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SignatoryComponent(Coding type, Reference party, StringType signature) {
        super();
        this.type = type;
        this.party = party;
        this.signature = signature;
    }

    /**
     * @return {@link #type} (Role of this Contract signer, e.g. notary, grantee.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SignatoryComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Role of this Contract signer, e.g. notary, grantee.)
     */
    public SignatoryComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #party} (Party which is a signator to this Contract.)
     */
    public Reference getParty() {
        if (this.party == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SignatoryComponent.party");
            else if (Configuration.doAutoCreate())
                // cc
                this.party = new Reference();
        return this.party;
    }

    public boolean hasParty() {
        return this.party != null && !this.party.isEmpty();
    }

    /**
     * @param value {@link #party} (Party which is a signator to this Contract.)
     */
    public SignatoryComponent setParty(Reference value) {
        this.party = value;
        return this;
    }

    /**
     * @return {@link #party} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Party which is a signator to this Contract.)
     */
    public Resource getPartyTarget() {
        return this.partyTarget;
    }

    /**
     * @param value {@link #party} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Party which is a signator to this Contract.)
     */
    public SignatoryComponent setPartyTarget(Resource value) {
        this.partyTarget = value;
        return this;
    }

    /**
     * @return {@link #signature} (Legally binding Contract DSIG signature contents in Base64.). This is the underlying object with id, value and extensions. The accessor "getSignature" gives direct access to the value
     */
    public StringType getSignatureElement() {
        if (this.signature == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SignatoryComponent.signature");
            else if (Configuration.doAutoCreate())
                // bb
                this.signature = new StringType();
        return this.signature;
    }

    public boolean hasSignatureElement() {
        return this.signature != null && !this.signature.isEmpty();
    }

    public boolean hasSignature() {
        return this.signature != null && !this.signature.isEmpty();
    }

    /**
     * @param value {@link #signature} (Legally binding Contract DSIG signature contents in Base64.). This is the underlying object with id, value and extensions. The accessor "getSignature" gives direct access to the value
     */
    public SignatoryComponent setSignatureElement(StringType value) {
        this.signature = value;
        return this;
    }

    /**
     * @return Legally binding Contract DSIG signature contents in Base64.
     */
    public String getSignature() {
        return this.signature == null ? null : this.signature.getValue();
    }

    /**
     * @param value Legally binding Contract DSIG signature contents in Base64.
     */
    public SignatoryComponent setSignature(String value) {
        if (this.signature == null)
            this.signature = new StringType();
        this.signature.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "Role of this Contract signer, e.g. notary, grantee.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("party", "Reference(Organization|Patient|Practitioner|RelatedPerson)", "Party which is a signator to this Contract.", 0, java.lang.Integer.MAX_VALUE, party));
        childrenList.add(new Property("signature", "string", "Legally binding Contract DSIG signature contents in Base64.", 0, java.lang.Integer.MAX_VALUE, signature));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("party"))
            // Reference
            this.party = castToReference(value);
        else if (name.equals("signature"))
            // StringType
            this.signature = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("party")) {
            this.party = new Reference();
            return this.party;
        } else if (name.equals("signature")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.signature");
        } else
            return super.addChild(name);
    }

    public SignatoryComponent copy() {
        SignatoryComponent dst = new SignatoryComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.party = party == null ? null : party.copy();
        dst.signature = signature == null ? null : signature.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SignatoryComponent))
            return false;
        SignatoryComponent o = (SignatoryComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(party, o.party, true) && compareDeep(signature, o.signature, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SignatoryComponent))
            return false;
        SignatoryComponent o = (SignatoryComponent) other;
        return compareValues(signature, o.signature, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (party == null || party.isEmpty()) && (signature == null || signature.isEmpty());
    }

    public String fhirType() {
        return "Contract.signer";
    }
}
