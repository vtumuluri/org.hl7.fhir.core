package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;

public class TestScriptMetadataCapabilityComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     */
    protected BooleanType required;

    /**
     * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     */
    protected BooleanType validated;

    /**
     * Description of the capabilities that this test script is requiring the server to support.
     */
    protected StringType description;

    /**
     * Which server these requirements apply to.
     */
    protected IntegerType destination;

    /**
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     */
    protected List<UriType> link;

    /**
     * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
     */
    protected Reference conformance;

    /**
     * The actual object that is the target of the reference (Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.)
     */
    protected Conformance conformanceTarget;

    private static final long serialVersionUID = 1318523355L;

    /*
     * Constructor
     */
    public TestScriptMetadataCapabilityComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TestScriptMetadataCapabilityComponent(Reference conformance) {
        super();
        this.conformance = conformance;
    }

    /**
     * @return {@link #required} (Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
     */
    public BooleanType getRequiredElement() {
        if (this.required == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.required");
            else if (Configuration.doAutoCreate())
                // bb
                this.required = new BooleanType();
        return this.required;
    }

    public boolean hasRequiredElement() {
        return this.required != null && !this.required.isEmpty();
    }

    public boolean hasRequired() {
        return this.required != null && !this.required.isEmpty();
    }

    /**
     * @param value {@link #required} (Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
     */
    public TestScriptMetadataCapabilityComponent setRequiredElement(BooleanType value) {
        this.required = value;
        return this;
    }

    /**
     * @return Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     */
    public boolean getRequired() {
        return this.required == null || this.required.isEmpty() ? false : this.required.getValue();
    }

    /**
     * @param value Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     */
    public TestScriptMetadataCapabilityComponent setRequired(boolean value) {
        if (this.required == null)
            this.required = new BooleanType();
        this.required.setValue(value);
        return this;
    }

    /**
     * @return {@link #validated} (Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.). This is the underlying object with id, value and extensions. The accessor "getValidated" gives direct access to the value
     */
    public BooleanType getValidatedElement() {
        if (this.validated == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.validated");
            else if (Configuration.doAutoCreate())
                // bb
                this.validated = new BooleanType();
        return this.validated;
    }

    public boolean hasValidatedElement() {
        return this.validated != null && !this.validated.isEmpty();
    }

    public boolean hasValidated() {
        return this.validated != null && !this.validated.isEmpty();
    }

    /**
     * @param value {@link #validated} (Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.). This is the underlying object with id, value and extensions. The accessor "getValidated" gives direct access to the value
     */
    public TestScriptMetadataCapabilityComponent setValidatedElement(BooleanType value) {
        this.validated = value;
        return this;
    }

    /**
     * @return Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     */
    public boolean getValidated() {
        return this.validated == null || this.validated.isEmpty() ? false : this.validated.getValue();
    }

    /**
     * @param value Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     */
    public TestScriptMetadataCapabilityComponent setValidated(boolean value) {
        if (this.validated == null)
            this.validated = new BooleanType();
        this.validated.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Description of the capabilities that this test script is requiring the server to support.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Description of the capabilities that this test script is requiring the server to support.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public TestScriptMetadataCapabilityComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Description of the capabilities that this test script is requiring the server to support.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Description of the capabilities that this test script is requiring the server to support.
     */
    public TestScriptMetadataCapabilityComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #destination} (Which server these requirements apply to.). This is the underlying object with id, value and extensions. The accessor "getDestination" gives direct access to the value
     */
    public IntegerType getDestinationElement() {
        if (this.destination == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.destination");
            else if (Configuration.doAutoCreate())
                // bb
                this.destination = new IntegerType();
        return this.destination;
    }

    public boolean hasDestinationElement() {
        return this.destination != null && !this.destination.isEmpty();
    }

    public boolean hasDestination() {
        return this.destination != null && !this.destination.isEmpty();
    }

    /**
     * @param value {@link #destination} (Which server these requirements apply to.). This is the underlying object with id, value and extensions. The accessor "getDestination" gives direct access to the value
     */
    public TestScriptMetadataCapabilityComponent setDestinationElement(IntegerType value) {
        this.destination = value;
        return this;
    }

    /**
     * @return Which server these requirements apply to.
     */
    public int getDestination() {
        return this.destination == null || this.destination.isEmpty() ? 0 : this.destination.getValue();
    }

    /**
     * @param value Which server these requirements apply to.
     */
    public TestScriptMetadataCapabilityComponent setDestination(int value) {
        if (this.destination == null)
            this.destination = new IntegerType();
        this.destination.setValue(value);
        return this;
    }

    /**
     * @return {@link #link} (Links to the FHIR specification that describes this interaction and the resources involved in more detail.)
     */
    public List<UriType> getLink() {
        if (this.link == null)
            this.link = new ArrayList<UriType>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (UriType item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UriType addLinkElement() {
        // 2
        UriType t = new UriType();
        if (this.link == null)
            this.link = new ArrayList<UriType>();
        this.link.add(t);
        return t;
    }

    /**
     * @param value {@link #link} (Links to the FHIR specification that describes this interaction and the resources involved in more detail.)
     */
    public TestScriptMetadataCapabilityComponent addLink(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.link == null)
            this.link = new ArrayList<UriType>();
        this.link.add(t);
        return this;
    }

    /**
     * @param value {@link #link} (Links to the FHIR specification that describes this interaction and the resources involved in more detail.)
     */
    public boolean hasLink(String value) {
        if (this.link == null)
            return false;
        for (UriType v : this.link) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #conformance} (Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.)
     */
    public Reference getConformance() {
        if (this.conformance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.conformance");
            else if (Configuration.doAutoCreate())
                // cc
                this.conformance = new Reference();
        return this.conformance;
    }

    public boolean hasConformance() {
        return this.conformance != null && !this.conformance.isEmpty();
    }

    /**
     * @param value {@link #conformance} (Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.)
     */
    public TestScriptMetadataCapabilityComponent setConformance(Reference value) {
        this.conformance = value;
        return this;
    }

    /**
     * @return {@link #conformance} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.)
     */
    public Conformance getConformanceTarget() {
        if (this.conformanceTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptMetadataCapabilityComponent.conformance");
            else if (Configuration.doAutoCreate())
                // aa
                this.conformanceTarget = new Conformance();
        return this.conformanceTarget;
    }

    /**
     * @param value {@link #conformance} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.)
     */
    public TestScriptMetadataCapabilityComponent setConformanceTarget(Conformance value) {
        this.conformanceTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("required", "boolean", "Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.", 0, java.lang.Integer.MAX_VALUE, required));
        childrenList.add(new Property("validated", "boolean", "Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.", 0, java.lang.Integer.MAX_VALUE, validated));
        childrenList.add(new Property("description", "string", "Description of the capabilities that this test script is requiring the server to support.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("destination", "integer", "Which server these requirements apply to.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("link", "uri", "Links to the FHIR specification that describes this interaction and the resources involved in more detail.", 0, java.lang.Integer.MAX_VALUE, link));
        childrenList.add(new Property("conformance", "Reference(Conformance)", "Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.", 0, java.lang.Integer.MAX_VALUE, conformance));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("required"))
            // BooleanType
            this.required = castToBoolean(value);
        else if (name.equals("validated"))
            // BooleanType
            this.validated = castToBoolean(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("destination"))
            // IntegerType
            this.destination = castToInteger(value);
        else if (name.equals("link"))
            this.getLink().add(castToUri(value));
        else if (name.equals("conformance"))
            // Reference
            this.conformance = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("required")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.required");
        } else if (name.equals("validated")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.validated");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.description");
        } else if (name.equals("destination")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.destination");
        } else if (name.equals("link")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.link");
        } else if (name.equals("conformance")) {
            this.conformance = new Reference();
            return this.conformance;
        } else
            return super.addChild(name);
    }

    public TestScriptMetadataCapabilityComponent copy() {
        TestScriptMetadataCapabilityComponent dst = new TestScriptMetadataCapabilityComponent();
        copyValues(dst);
        dst.required = required == null ? null : required.copy();
        dst.validated = validated == null ? null : validated.copy();
        dst.description = description == null ? null : description.copy();
        dst.destination = destination == null ? null : destination.copy();
        if (link != null) {
            dst.link = new ArrayList<UriType>();
            for (UriType i : link) dst.link.add(i.copy());
        }
        ;
        dst.conformance = conformance == null ? null : conformance.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptMetadataCapabilityComponent))
            return false;
        TestScriptMetadataCapabilityComponent o = (TestScriptMetadataCapabilityComponent) other;
        return compareDeep(required, o.required, true) && compareDeep(validated, o.validated, true) && compareDeep(description, o.description, true) && compareDeep(destination, o.destination, true) && compareDeep(link, o.link, true) && compareDeep(conformance, o.conformance, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptMetadataCapabilityComponent))
            return false;
        TestScriptMetadataCapabilityComponent o = (TestScriptMetadataCapabilityComponent) other;
        return compareValues(required, o.required, true) && compareValues(validated, o.validated, true) && compareValues(description, o.description, true) && compareValues(destination, o.destination, true) && compareValues(link, o.link, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (required == null || required.isEmpty()) && (validated == null || validated.isEmpty()) && (description == null || description.isEmpty()) && (destination == null || destination.isEmpty()) && (link == null || link.isEmpty()) && (conformance == null || conformance.isEmpty());
    }

    public String fhirType() {
        return "TestScript.metadata.capability";
    }
}
