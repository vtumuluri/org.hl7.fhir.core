package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseType;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseTypeEnumFactory;

public class MessageHeaderResponseComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The id of the message that this message is a response to.
     */
    protected IdType identifier;

    /**
     * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
     */
    protected Enumeration<ResponseType> code;

    /**
     * Full details of any issues found in the message.
     */
    protected Reference details;

    /**
     * The actual object that is the target of the reference (Full details of any issues found in the message.)
     */
    protected OperationOutcome detailsTarget;

    private static final long serialVersionUID = -1008716838L;

    /*
     * Constructor
     */
    public MessageHeaderResponseComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MessageHeaderResponseComponent(IdType identifier, Enumeration<ResponseType> code) {
        super();
        this.identifier = identifier;
        this.code = code;
    }

    /**
     * @return {@link #identifier} (The id of the message that this message is a response to.). This is the underlying object with id, value and extensions. The accessor "getIdentifier" gives direct access to the value
     */
    public IdType getIdentifierElement() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeaderResponseComponent.identifier");
            else if (Configuration.doAutoCreate())
                // bb
                this.identifier = new IdType();
        return this.identifier;
    }

    public boolean hasIdentifierElement() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (The id of the message that this message is a response to.). This is the underlying object with id, value and extensions. The accessor "getIdentifier" gives direct access to the value
     */
    public MessageHeaderResponseComponent setIdentifierElement(IdType value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return The id of the message that this message is a response to.
     */
    public String getIdentifier() {
        return this.identifier == null ? null : this.identifier.getValue();
    }

    /**
     * @param value The id of the message that this message is a response to.
     */
    public MessageHeaderResponseComponent setIdentifier(String value) {
        if (this.identifier == null)
            this.identifier = new IdType();
        this.identifier.setValue(value);
        return this;
    }

    /**
     * @return {@link #code} (Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Enumeration<ResponseType> getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeaderResponseComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new Enumeration<ResponseType>(new ResponseTypeEnumFactory());
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public MessageHeaderResponseComponent setCodeElement(Enumeration<ResponseType> value) {
        this.code = value;
        return this;
    }

    /**
     * @return Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
     */
    public ResponseType getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
     */
    public MessageHeaderResponseComponent setCode(ResponseType value) {
        if (this.code == null)
            this.code = new Enumeration<ResponseType>(new ResponseTypeEnumFactory());
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #details} (Full details of any issues found in the message.)
     */
    public Reference getDetails() {
        if (this.details == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeaderResponseComponent.details");
            else if (Configuration.doAutoCreate())
                // cc
                this.details = new Reference();
        return this.details;
    }

    public boolean hasDetails() {
        return this.details != null && !this.details.isEmpty();
    }

    /**
     * @param value {@link #details} (Full details of any issues found in the message.)
     */
    public MessageHeaderResponseComponent setDetails(Reference value) {
        this.details = value;
        return this;
    }

    /**
     * @return {@link #details} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Full details of any issues found in the message.)
     */
    public OperationOutcome getDetailsTarget() {
        if (this.detailsTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeaderResponseComponent.details");
            else if (Configuration.doAutoCreate())
                // aa
                this.detailsTarget = new OperationOutcome();
        return this.detailsTarget;
    }

    /**
     * @param value {@link #details} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Full details of any issues found in the message.)
     */
    public MessageHeaderResponseComponent setDetailsTarget(OperationOutcome value) {
        this.detailsTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "id", "The id of the message that this message is a response to.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("code", "code", "Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("details", "Reference(OperationOutcome)", "Full details of any issues found in the message.", 0, java.lang.Integer.MAX_VALUE, details));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // IdType
            this.identifier = castToId(value);
        else if (name.equals("code"))
            // Enumeration<ResponseType>
            this.code = new ResponseTypeEnumFactory().fromType(value);
        else if (name.equals("details"))
            // Reference
            this.details = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.identifier");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.code");
        } else if (name.equals("details")) {
            this.details = new Reference();
            return this.details;
        } else
            return super.addChild(name);
    }

    public MessageHeaderResponseComponent copy() {
        MessageHeaderResponseComponent dst = new MessageHeaderResponseComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.code = code == null ? null : code.copy();
        dst.details = details == null ? null : details.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MessageHeaderResponseComponent))
            return false;
        MessageHeaderResponseComponent o = (MessageHeaderResponseComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(code, o.code, true) && compareDeep(details, o.details, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MessageHeaderResponseComponent))
            return false;
        MessageHeaderResponseComponent o = (MessageHeaderResponseComponent) other;
        return compareValues(identifier, o.identifier, true) && compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (code == null || code.isEmpty()) && (details == null || details.isEmpty());
    }

    public String fhirType() {
        return "MessageHeader.response";
    }
}
