package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;

public class TestScriptTeardownActionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An operation would involve a REST request to a server.
     */
    protected TestScriptSetupActionOperationComponent operation;

    private static final long serialVersionUID = 1684092023L;

    /*
     * Constructor
     */
    public TestScriptTeardownActionComponent() {
        super();
    }

    /**
     * @return {@link #operation} (An operation would involve a REST request to a server.)
     */
    public TestScriptSetupActionOperationComponent getOperation() {
        if (this.operation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptTeardownActionComponent.operation");
            else if (Configuration.doAutoCreate())
                // cc
                this.operation = new TestScriptSetupActionOperationComponent();
        return this.operation;
    }

    public boolean hasOperation() {
        return this.operation != null && !this.operation.isEmpty();
    }

    /**
     * @param value {@link #operation} (An operation would involve a REST request to a server.)
     */
    public TestScriptTeardownActionComponent setOperation(TestScriptSetupActionOperationComponent value) {
        this.operation = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("operation", "@TestScript.setup.action.operation", "An operation would involve a REST request to a server.", 0, java.lang.Integer.MAX_VALUE, operation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("operation"))
            // TestScriptSetupActionOperationComponent
            this.operation = (TestScriptSetupActionOperationComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("operation")) {
            this.operation = new TestScriptSetupActionOperationComponent();
            return this.operation;
        } else
            return super.addChild(name);
    }

    public TestScriptTeardownActionComponent copy() {
        TestScriptTeardownActionComponent dst = new TestScriptTeardownActionComponent();
        copyValues(dst);
        dst.operation = operation == null ? null : operation.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptTeardownActionComponent))
            return false;
        TestScriptTeardownActionComponent o = (TestScriptTeardownActionComponent) other;
        return compareDeep(operation, o.operation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptTeardownActionComponent))
            return false;
        TestScriptTeardownActionComponent o = (TestScriptTeardownActionComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (operation == null || operation.isEmpty());
    }

    public String fhirType() {
        return "TestScript.teardown.action";
    }
}
