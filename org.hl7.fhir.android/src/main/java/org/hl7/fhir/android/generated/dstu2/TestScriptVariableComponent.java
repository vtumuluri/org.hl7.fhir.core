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

public class TestScriptVariableComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Descriptive name for this variable.
     */
    protected StringType name;

    /**
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     */
    protected StringType headerField;

    /**
     * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     */
    protected StringType path;

    /**
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     */
    protected IdType sourceId;

    private static final long serialVersionUID = 1128806685L;

    /*
     * Constructor
     */
    public TestScriptVariableComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TestScriptVariableComponent(StringType name) {
        super();
        this.name = name;
    }

    /**
     * @return {@link #name} (Descriptive name for this variable.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptVariableComponent.name");
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
     * @param value {@link #name} (Descriptive name for this variable.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public TestScriptVariableComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Descriptive name for this variable.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Descriptive name for this variable.
     */
    public TestScriptVariableComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #headerField} (Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.). This is the underlying object with id, value and extensions. The accessor "getHeaderField" gives direct access to the value
     */
    public StringType getHeaderFieldElement() {
        if (this.headerField == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptVariableComponent.headerField");
            else if (Configuration.doAutoCreate())
                // bb
                this.headerField = new StringType();
        return this.headerField;
    }

    public boolean hasHeaderFieldElement() {
        return this.headerField != null && !this.headerField.isEmpty();
    }

    public boolean hasHeaderField() {
        return this.headerField != null && !this.headerField.isEmpty();
    }

    /**
     * @param value {@link #headerField} (Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.). This is the underlying object with id, value and extensions. The accessor "getHeaderField" gives direct access to the value
     */
    public TestScriptVariableComponent setHeaderFieldElement(StringType value) {
        this.headerField = value;
        return this;
    }

    /**
     * @return Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     */
    public String getHeaderField() {
        return this.headerField == null ? null : this.headerField.getValue();
    }

    /**
     * @param value Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     */
    public TestScriptVariableComponent setHeaderField(String value) {
        if (Utilities.noString(value))
            this.headerField = null;
        else {
            if (this.headerField == null)
                this.headerField = new StringType();
            this.headerField.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #path} (XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public StringType getPathElement() {
        if (this.path == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptVariableComponent.path");
            else if (Configuration.doAutoCreate())
                // bb
                this.path = new StringType();
        return this.path;
    }

    public boolean hasPathElement() {
        return this.path != null && !this.path.isEmpty();
    }

    public boolean hasPath() {
        return this.path != null && !this.path.isEmpty();
    }

    /**
     * @param value {@link #path} (XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public TestScriptVariableComponent setPathElement(StringType value) {
        this.path = value;
        return this;
    }

    /**
     * @return XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     */
    public String getPath() {
        return this.path == null ? null : this.path.getValue();
    }

    /**
     * @param value XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     */
    public TestScriptVariableComponent setPath(String value) {
        if (Utilities.noString(value))
            this.path = null;
        else {
            if (this.path == null)
                this.path = new StringType();
            this.path.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #sourceId} (Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public IdType getSourceIdElement() {
        if (this.sourceId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptVariableComponent.sourceId");
            else if (Configuration.doAutoCreate())
                // bb
                this.sourceId = new IdType();
        return this.sourceId;
    }

    public boolean hasSourceIdElement() {
        return this.sourceId != null && !this.sourceId.isEmpty();
    }

    public boolean hasSourceId() {
        return this.sourceId != null && !this.sourceId.isEmpty();
    }

    /**
     * @param value {@link #sourceId} (Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public TestScriptVariableComponent setSourceIdElement(IdType value) {
        this.sourceId = value;
        return this;
    }

    /**
     * @return Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     */
    public String getSourceId() {
        return this.sourceId == null ? null : this.sourceId.getValue();
    }

    /**
     * @param value Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     */
    public TestScriptVariableComponent setSourceId(String value) {
        if (Utilities.noString(value))
            this.sourceId = null;
        else {
            if (this.sourceId == null)
                this.sourceId = new IdType();
            this.sourceId.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "Descriptive name for this variable.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("headerField", "string", "Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.", 0, java.lang.Integer.MAX_VALUE, headerField));
        childrenList.add(new Property("path", "string", "XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.", 0, java.lang.Integer.MAX_VALUE, path));
        childrenList.add(new Property("sourceId", "id", "Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.", 0, java.lang.Integer.MAX_VALUE, sourceId));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("headerField"))
            // StringType
            this.headerField = castToString(value);
        else if (name.equals("path"))
            // StringType
            this.path = castToString(value);
        else if (name.equals("sourceId"))
            // IdType
            this.sourceId = castToId(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.name");
        } else if (name.equals("headerField")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.headerField");
        } else if (name.equals("path")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.path");
        } else if (name.equals("sourceId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.sourceId");
        } else
            return super.addChild(name);
    }

    public TestScriptVariableComponent copy() {
        TestScriptVariableComponent dst = new TestScriptVariableComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.headerField = headerField == null ? null : headerField.copy();
        dst.path = path == null ? null : path.copy();
        dst.sourceId = sourceId == null ? null : sourceId.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptVariableComponent))
            return false;
        TestScriptVariableComponent o = (TestScriptVariableComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(headerField, o.headerField, true) && compareDeep(path, o.path, true) && compareDeep(sourceId, o.sourceId, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptVariableComponent))
            return false;
        TestScriptVariableComponent o = (TestScriptVariableComponent) other;
        return compareValues(name, o.name, true) && compareValues(headerField, o.headerField, true) && compareValues(path, o.path, true) && compareValues(sourceId, o.sourceId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (headerField == null || headerField.isEmpty()) && (path == null || path.isEmpty()) && (sourceId == null || sourceId.isEmpty());
    }

    public String fhirType() {
        return "TestScript.variable";
    }
}
