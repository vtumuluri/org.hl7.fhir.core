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

public class TestScriptSetupComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     */
    protected TestScriptMetadataComponent metadata;

    /**
     * Action would contain either an operation or an assertion.
     */
    protected List<TestScriptSetupActionComponent> action;

    private static final long serialVersionUID = -1836543723L;

    /*
     * Constructor
     */
    public TestScriptSetupComponent() {
        super();
    }

    /**
     * @return {@link #metadata} (Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public TestScriptMetadataComponent getMetadata() {
        if (this.metadata == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupComponent.metadata");
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
    public TestScriptSetupComponent setMetadata(TestScriptMetadataComponent value) {
        this.metadata = value;
        return this;
    }

    /**
     * @return {@link #action} (Action would contain either an operation or an assertion.)
     */
    public List<TestScriptSetupActionComponent> getAction() {
        if (this.action == null)
            this.action = new ArrayList<TestScriptSetupActionComponent>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (TestScriptSetupActionComponent item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptSetupActionComponent addAction() {
        // 3
        TestScriptSetupActionComponent t = new TestScriptSetupActionComponent();
        if (this.action == null)
            this.action = new ArrayList<TestScriptSetupActionComponent>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptSetupComponent addAction(TestScriptSetupActionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<TestScriptSetupActionComponent>();
        this.action.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("metadata", "@TestScript.metadata", "Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.", 0, java.lang.Integer.MAX_VALUE, metadata));
        childrenList.add(new Property("action", "", "Action would contain either an operation or an assertion.", 0, java.lang.Integer.MAX_VALUE, action));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("metadata"))
            // TestScriptMetadataComponent
            this.metadata = (TestScriptMetadataComponent) value;
        else if (name.equals("action"))
            this.getAction().add((TestScriptSetupActionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("metadata")) {
            this.metadata = new TestScriptMetadataComponent();
            return this.metadata;
        } else if (name.equals("action")) {
            return addAction();
        } else
            return super.addChild(name);
    }

    public TestScriptSetupComponent copy() {
        TestScriptSetupComponent dst = new TestScriptSetupComponent();
        copyValues(dst);
        dst.metadata = metadata == null ? null : metadata.copy();
        if (action != null) {
            dst.action = new ArrayList<TestScriptSetupActionComponent>();
            for (TestScriptSetupActionComponent i : action) dst.action.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptSetupComponent))
            return false;
        TestScriptSetupComponent o = (TestScriptSetupComponent) other;
        return compareDeep(metadata, o.metadata, true) && compareDeep(action, o.action, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptSetupComponent))
            return false;
        TestScriptSetupComponent o = (TestScriptSetupComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (metadata == null || metadata.isEmpty()) && (action == null || action.isEmpty());
    }

    public String fhirType() {
        return "TestScript.setup";
    }
}
