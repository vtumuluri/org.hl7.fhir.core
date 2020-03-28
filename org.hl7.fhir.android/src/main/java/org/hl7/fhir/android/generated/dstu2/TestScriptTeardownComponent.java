package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;

public class TestScriptTeardownComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The teardown action will only contain an operation.
     */
    protected List<TestScriptTeardownActionComponent> action;

    private static final long serialVersionUID = 1850225254L;

    /*
     * Constructor
     */
    public TestScriptTeardownComponent() {
        super();
    }

    /**
     * @return {@link #action} (The teardown action will only contain an operation.)
     */
    public List<TestScriptTeardownActionComponent> getAction() {
        if (this.action == null)
            this.action = new ArrayList<TestScriptTeardownActionComponent>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (TestScriptTeardownActionComponent item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptTeardownActionComponent addAction() {
        // 3
        TestScriptTeardownActionComponent t = new TestScriptTeardownActionComponent();
        if (this.action == null)
            this.action = new ArrayList<TestScriptTeardownActionComponent>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptTeardownComponent addAction(TestScriptTeardownActionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<TestScriptTeardownActionComponent>();
        this.action.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("action", "", "The teardown action will only contain an operation.", 0, java.lang.Integer.MAX_VALUE, action));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("action"))
            this.getAction().add((TestScriptTeardownActionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("action")) {
            return addAction();
        } else
            return super.addChild(name);
    }

    public TestScriptTeardownComponent copy() {
        TestScriptTeardownComponent dst = new TestScriptTeardownComponent();
        copyValues(dst);
        if (action != null) {
            dst.action = new ArrayList<TestScriptTeardownActionComponent>();
            for (TestScriptTeardownActionComponent i : action) dst.action.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptTeardownComponent))
            return false;
        TestScriptTeardownComponent o = (TestScriptTeardownComponent) other;
        return compareDeep(action, o.action, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptTeardownComponent))
            return false;
        TestScriptTeardownComponent o = (TestScriptTeardownComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (action == null || action.isEmpty());
    }

    public String fhirType() {
        return "TestScript.teardown";
    }
}
