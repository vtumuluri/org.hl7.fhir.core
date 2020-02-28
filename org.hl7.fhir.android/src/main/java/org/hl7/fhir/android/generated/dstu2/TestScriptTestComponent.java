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

public class TestScriptTestComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of this test used for tracking/logging purposes by test engines.
     */
    protected StringType name;

    /**
     * A short description of the test used by test engines for tracking and reporting purposes.
     */
    protected StringType description;

    /**
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     */
    protected TestScriptMetadataComponent metadata;

    /**
     * Action would contain either an operation or an assertion.
     */
    protected List<TestScriptTestActionComponent> action;

    private static final long serialVersionUID = 408339297L;

    /*
     * Constructor
     */
    public TestScriptTestComponent() {
        super();
    }

    /**
     * @return {@link #name} (The name of this test used for tracking/logging purposes by test engines.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptTestComponent.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The name of this test used for tracking/logging purposes by test engines.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public TestScriptTestComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of this test used for tracking/logging purposes by test engines.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of this test used for tracking/logging purposes by test engines.
     */
    public TestScriptTestComponent setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #description} (A short description of the test used by test engines for tracking and reporting purposes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptTestComponent.description");
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
     * @param value {@link #description} (A short description of the test used by test engines for tracking and reporting purposes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public TestScriptTestComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A short description of the test used by test engines for tracking and reporting purposes.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A short description of the test used by test engines for tracking and reporting purposes.
     */
    public TestScriptTestComponent setDescription(String value) {
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
     * @return {@link #metadata} (Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public TestScriptMetadataComponent getMetadata() {
        if (this.metadata == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptTestComponent.metadata");
            else if (Configuration.doAutoCreate())
                // cc
                this.metadata = new TestScriptMetadataComponent();
        return this.metadata;
    }

    public boolean hasMetadata() {
        return this.metadata != null && !this.metadata.isEmpty();
    }

    /**
     * @param value {@link #metadata} (Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public TestScriptTestComponent setMetadata(TestScriptMetadataComponent value) {
        this.metadata = value;
        return this;
    }

    /**
     * @return {@link #action} (Action would contain either an operation or an assertion.)
     */
    public List<TestScriptTestActionComponent> getAction() {
        if (this.action == null)
            this.action = new ArrayList<TestScriptTestActionComponent>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (TestScriptTestActionComponent item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptTestActionComponent addAction() {
        // 3
        TestScriptTestActionComponent t = new TestScriptTestActionComponent();
        if (this.action == null)
            this.action = new ArrayList<TestScriptTestActionComponent>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptTestComponent addAction(TestScriptTestActionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<TestScriptTestActionComponent>();
        this.action.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name of this test used for tracking/logging purposes by test engines.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("description", "string", "A short description of the test used by test engines for tracking and reporting purposes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("metadata", "@TestScript.metadata", "Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.", 0, java.lang.Integer.MAX_VALUE, metadata));
        childrenList.add(new Property("action", "", "Action would contain either an operation or an assertion.", 0, java.lang.Integer.MAX_VALUE, action));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("metadata"))
            // TestScriptMetadataComponent
            this.metadata = (TestScriptMetadataComponent) value;
        else if (name.equals("action"))
            this.getAction().add((TestScriptTestActionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.name");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.description");
        } else if (name.equals("metadata")) {
            this.metadata = new TestScriptMetadataComponent();
            return this.metadata;
        } else if (name.equals("action")) {
            return addAction();
        } else
            return super.addChild(name);
    }

    public TestScriptTestComponent copy() {
        TestScriptTestComponent dst = new TestScriptTestComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        dst.metadata = metadata == null ? null : metadata.copy();
        if (action != null) {
            dst.action = new ArrayList<TestScriptTestActionComponent>();
            for (TestScriptTestActionComponent i : action) dst.action.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptTestComponent))
            return false;
        TestScriptTestComponent o = (TestScriptTestComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(metadata, o.metadata, true) && compareDeep(action, o.action, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptTestComponent))
            return false;
        TestScriptTestComponent o = (TestScriptTestComponent) other;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (description == null || description.isEmpty()) && (metadata == null || metadata.isEmpty()) && (action == null || action.isEmpty());
    }

    public String fhirType() {
        return "TestScript.test";
    }
}
