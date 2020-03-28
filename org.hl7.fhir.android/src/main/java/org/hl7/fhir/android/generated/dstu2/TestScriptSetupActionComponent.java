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

public class TestScriptSetupActionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The operation to perform.
     */
    protected TestScriptSetupActionOperationComponent operation;

    /**
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     */
    protected TestScriptSetupActionAssertComponent assert_;

    private static final long serialVersionUID = 1411550037L;

    /*
     * Constructor
     */
    public TestScriptSetupActionComponent() {
        super();
    }

    /**
     * @return {@link #operation} (The operation to perform.)
     */
    public TestScriptSetupActionOperationComponent getOperation() {
        if (this.operation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionComponent.operation");
            else if (Configuration.doAutoCreate())
                // cc
                this.operation = new TestScriptSetupActionOperationComponent();
        return this.operation;
    }

    public boolean hasOperation() {
        return this.operation != null && !this.operation.isEmpty();
    }

    /**
     * @param value {@link #operation} (The operation to perform.)
     */
    public TestScriptSetupActionComponent setOperation(TestScriptSetupActionOperationComponent value) {
        this.operation = value;
        return this;
    }

    /**
     * @return {@link #assert_} (Evaluates the results of previous operations to determine if the server under test behaves appropriately.)
     */
    public TestScriptSetupActionAssertComponent getAssert() {
        if (this.assert_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionComponent.assert_");
            else if (Configuration.doAutoCreate())
                // cc
                this.assert_ = new TestScriptSetupActionAssertComponent();
        return this.assert_;
    }

    public boolean hasAssert() {
        return this.assert_ != null && !this.assert_.isEmpty();
    }

    /**
     * @param value {@link #assert_} (Evaluates the results of previous operations to determine if the server under test behaves appropriately.)
     */
    public TestScriptSetupActionComponent setAssert(TestScriptSetupActionAssertComponent value) {
        this.assert_ = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("operation", "", "The operation to perform.", 0, java.lang.Integer.MAX_VALUE, operation));
        childrenList.add(new Property("assert", "", "Evaluates the results of previous operations to determine if the server under test behaves appropriately.", 0, java.lang.Integer.MAX_VALUE, assert_));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("operation"))
            // TestScriptSetupActionOperationComponent
            this.operation = (TestScriptSetupActionOperationComponent) value;
        else if (name.equals("assert"))
            // TestScriptSetupActionAssertComponent
            this.assert_ = (TestScriptSetupActionAssertComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("operation")) {
            this.operation = new TestScriptSetupActionOperationComponent();
            return this.operation;
        } else if (name.equals("assert")) {
            this.assert_ = new TestScriptSetupActionAssertComponent();
            return this.assert_;
        } else
            return super.addChild(name);
    }

    public TestScriptSetupActionComponent copy() {
        TestScriptSetupActionComponent dst = new TestScriptSetupActionComponent();
        copyValues(dst);
        dst.operation = operation == null ? null : operation.copy();
        dst.assert_ = assert_ == null ? null : assert_.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptSetupActionComponent))
            return false;
        TestScriptSetupActionComponent o = (TestScriptSetupActionComponent) other;
        return compareDeep(operation, o.operation, true) && compareDeep(assert_, o.assert_, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptSetupActionComponent))
            return false;
        TestScriptSetupActionComponent o = (TestScriptSetupActionComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (operation == null || operation.isEmpty()) && (assert_ == null || assert_.isEmpty());
    }

    public String fhirType() {
        return "TestScript.setup.action";
    }
}
