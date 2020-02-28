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

public class TestScriptFixtureComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     */
    protected BooleanType autocreate;

    /**
     * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     */
    protected BooleanType autodelete;

    /**
     * Reference to the resource (containing the contents of the resource needed for operations).
     */
    protected Reference resource;

    /**
     * The actual object that is the target of the reference (Reference to the resource (containing the contents of the resource needed for operations).)
     */
    protected Resource resourceTarget;

    private static final long serialVersionUID = 1110683307L;

    /*
     * Constructor
     */
    public TestScriptFixtureComponent() {
        super();
    }

    /**
     * @return {@link #autocreate} (Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.). This is the underlying object with id, value and extensions. The accessor "getAutocreate" gives direct access to the value
     */
    public BooleanType getAutocreateElement() {
        if (this.autocreate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptFixtureComponent.autocreate");
            else if (Configuration.doAutoCreate())
                // bb
                this.autocreate = new BooleanType();
        return this.autocreate;
    }

    public boolean hasAutocreateElement() {
        return this.autocreate != null && !this.autocreate.isEmpty();
    }

    public boolean hasAutocreate() {
        return this.autocreate != null && !this.autocreate.isEmpty();
    }

    /**
     * @param value {@link #autocreate} (Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.). This is the underlying object with id, value and extensions. The accessor "getAutocreate" gives direct access to the value
     */
    public TestScriptFixtureComponent setAutocreateElement(BooleanType value) {
        this.autocreate = value;
        return this;
    }

    /**
     * @return Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     */
    public boolean getAutocreate() {
        return this.autocreate == null || this.autocreate.isEmpty() ? false : this.autocreate.getValue();
    }

    /**
     * @param value Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     */
    public TestScriptFixtureComponent setAutocreate(boolean value) {
        if (this.autocreate == null)
            this.autocreate = new BooleanType();
        this.autocreate.setValue(value);
        return this;
    }

    /**
     * @return {@link #autodelete} (Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.). This is the underlying object with id, value and extensions. The accessor "getAutodelete" gives direct access to the value
     */
    public BooleanType getAutodeleteElement() {
        if (this.autodelete == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptFixtureComponent.autodelete");
            else if (Configuration.doAutoCreate())
                // bb
                this.autodelete = new BooleanType();
        return this.autodelete;
    }

    public boolean hasAutodeleteElement() {
        return this.autodelete != null && !this.autodelete.isEmpty();
    }

    public boolean hasAutodelete() {
        return this.autodelete != null && !this.autodelete.isEmpty();
    }

    /**
     * @param value {@link #autodelete} (Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.). This is the underlying object with id, value and extensions. The accessor "getAutodelete" gives direct access to the value
     */
    public TestScriptFixtureComponent setAutodeleteElement(BooleanType value) {
        this.autodelete = value;
        return this;
    }

    /**
     * @return Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     */
    public boolean getAutodelete() {
        return this.autodelete == null || this.autodelete.isEmpty() ? false : this.autodelete.getValue();
    }

    /**
     * @param value Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     */
    public TestScriptFixtureComponent setAutodelete(boolean value) {
        if (this.autodelete == null)
            this.autodelete = new BooleanType();
        this.autodelete.setValue(value);
        return this;
    }

    /**
     * @return {@link #resource} (Reference to the resource (containing the contents of the resource needed for operations).)
     */
    public Reference getResource() {
        if (this.resource == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptFixtureComponent.resource");
            else if (Configuration.doAutoCreate())
                // cc
                this.resource = new Reference();
        return this.resource;
    }

    public boolean hasResource() {
        return this.resource != null && !this.resource.isEmpty();
    }

    /**
     * @param value {@link #resource} (Reference to the resource (containing the contents of the resource needed for operations).)
     */
    public TestScriptFixtureComponent setResource(Reference value) {
        this.resource = value;
        return this;
    }

    /**
     * @return {@link #resource} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the resource (containing the contents of the resource needed for operations).)
     */
    public Resource getResourceTarget() {
        return this.resourceTarget;
    }

    /**
     * @param value {@link #resource} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the resource (containing the contents of the resource needed for operations).)
     */
    public TestScriptFixtureComponent setResourceTarget(Resource value) {
        this.resourceTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("autocreate", "boolean", "Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.", 0, java.lang.Integer.MAX_VALUE, autocreate));
        childrenList.add(new Property("autodelete", "boolean", "Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.", 0, java.lang.Integer.MAX_VALUE, autodelete));
        childrenList.add(new Property("resource", "Reference(Any)", "Reference to the resource (containing the contents of the resource needed for operations).", 0, java.lang.Integer.MAX_VALUE, resource));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("autocreate"))
            // BooleanType
            this.autocreate = castToBoolean(value);
        else if (name.equals("autodelete"))
            // BooleanType
            this.autodelete = castToBoolean(value);
        else if (name.equals("resource"))
            // Reference
            this.resource = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("autocreate")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.autocreate");
        } else if (name.equals("autodelete")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.autodelete");
        } else if (name.equals("resource")) {
            this.resource = new Reference();
            return this.resource;
        } else
            return super.addChild(name);
    }

    public TestScriptFixtureComponent copy() {
        TestScriptFixtureComponent dst = new TestScriptFixtureComponent();
        copyValues(dst);
        dst.autocreate = autocreate == null ? null : autocreate.copy();
        dst.autodelete = autodelete == null ? null : autodelete.copy();
        dst.resource = resource == null ? null : resource.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptFixtureComponent))
            return false;
        TestScriptFixtureComponent o = (TestScriptFixtureComponent) other;
        return compareDeep(autocreate, o.autocreate, true) && compareDeep(autodelete, o.autodelete, true) && compareDeep(resource, o.resource, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptFixtureComponent))
            return false;
        TestScriptFixtureComponent o = (TestScriptFixtureComponent) other;
        return compareValues(autocreate, o.autocreate, true) && compareValues(autodelete, o.autodelete, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (autocreate == null || autocreate.isEmpty()) && (autodelete == null || autodelete.isEmpty()) && (resource == null || resource.isEmpty());
    }

    public String fhirType() {
        return "TestScript.fixture";
    }
}
