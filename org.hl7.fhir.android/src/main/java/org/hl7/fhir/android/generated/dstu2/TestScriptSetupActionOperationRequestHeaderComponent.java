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

public class TestScriptSetupActionOperationRequestHeaderComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The HTTP header field e.g. "Accept".
     */
    protected StringType field;

    /**
     * The value of the header e.g. "application/xml".
     */
    protected StringType value;

    private static final long serialVersionUID = 274395337L;

    /*
     * Constructor
     */
    public TestScriptSetupActionOperationRequestHeaderComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TestScriptSetupActionOperationRequestHeaderComponent(StringType field, StringType value) {
        super();
        this.field = field;
        this.value = value;
    }

    /**
     * @return {@link #field} (The HTTP header field e.g. "Accept".). This is the underlying object with id, value and extensions. The accessor "getField" gives direct access to the value
     */
    public StringType getFieldElement() {
        if (this.field == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationRequestHeaderComponent.field");
            else if (Configuration.doAutoCreate())
                // bb
                this.field = new StringType();
        return this.field;
    }

    public boolean hasFieldElement() {
        return this.field != null && !this.field.isEmpty();
    }

    public boolean hasField() {
        return this.field != null && !this.field.isEmpty();
    }

    /**
     * @param value {@link #field} (The HTTP header field e.g. "Accept".). This is the underlying object with id, value and extensions. The accessor "getField" gives direct access to the value
     */
    public TestScriptSetupActionOperationRequestHeaderComponent setFieldElement(StringType value) {
        this.field = value;
        return this;
    }

    /**
     * @return The HTTP header field e.g. "Accept".
     */
    public String getField() {
        return this.field == null ? null : this.field.getValue();
    }

    /**
     * @param value The HTTP header field e.g. "Accept".
     */
    public TestScriptSetupActionOperationRequestHeaderComponent setField(String value) {
        if (this.field == null)
            this.field = new StringType();
        this.field.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (The value of the header e.g. "application/xml".). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationRequestHeaderComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new StringType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The value of the header e.g. "application/xml".). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public TestScriptSetupActionOperationRequestHeaderComponent setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The value of the header e.g. "application/xml".
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The value of the header e.g. "application/xml".
     */
    public TestScriptSetupActionOperationRequestHeaderComponent setValue(String value) {
        if (this.value == null)
            this.value = new StringType();
        this.value.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("field", "string", "The HTTP header field e.g. \"Accept\".", 0, java.lang.Integer.MAX_VALUE, field));
        childrenList.add(new Property("value", "string", "The value of the header e.g. \"application/xml\".", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("field"))
            // StringType
            this.field = castToString(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("field")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.field");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.value");
        } else
            return super.addChild(name);
    }

    public TestScriptSetupActionOperationRequestHeaderComponent copy() {
        TestScriptSetupActionOperationRequestHeaderComponent dst = new TestScriptSetupActionOperationRequestHeaderComponent();
        copyValues(dst);
        dst.field = field == null ? null : field.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptSetupActionOperationRequestHeaderComponent))
            return false;
        TestScriptSetupActionOperationRequestHeaderComponent o = (TestScriptSetupActionOperationRequestHeaderComponent) other;
        return compareDeep(field, o.field, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptSetupActionOperationRequestHeaderComponent))
            return false;
        TestScriptSetupActionOperationRequestHeaderComponent o = (TestScriptSetupActionOperationRequestHeaderComponent) other;
        return compareValues(field, o.field, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (field == null || field.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "TestScript.setup.action.operation.requestHeader";
    }
}
