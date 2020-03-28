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
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;

public class ValueSetExpansionContainsComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An absolute URI which is the code system in which the code for this item in the expansion is defined.
     */
    protected UriType system;

    /**
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
     */
    protected BooleanType abstract_;

    /**
     * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
     */
    protected StringType version;

    /**
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
     */
    protected CodeType code;

    /**
     * The recommended display for this item in the expansion.
     */
    protected StringType display;

    /**
     * Other codes and entries contained under this entry in the hierarchy.
     */
    protected List<ValueSetExpansionContainsComponent> contains;

    private static final long serialVersionUID = -2038349483L;

    /*
     * Constructor
     */
    public ValueSetExpansionContainsComponent() {
        super();
    }

    /**
     * @return {@link #system} (An absolute URI which is the code system in which the code for this item in the expansion is defined.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionContainsComponent.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new UriType();
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (An absolute URI which is the code system in which the code for this item in the expansion is defined.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public ValueSetExpansionContainsComponent setSystemElement(UriType value) {
        this.system = value;
        return this;
    }

    /**
     * @return An absolute URI which is the code system in which the code for this item in the expansion is defined.
     */
    public String getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value An absolute URI which is the code system in which the code for this item in the expansion is defined.
     */
    public ValueSetExpansionContainsComponent setSystem(String value) {
        if (Utilities.noString(value))
            this.system = null;
        else {
            if (this.system == null)
                this.system = new UriType();
            this.system.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #abstract_} (If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.). This is the underlying object with id, value and extensions. The accessor "getAbstract" gives direct access to the value
     */
    public BooleanType getAbstractElement() {
        if (this.abstract_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionContainsComponent.abstract_");
            else if (Configuration.doAutoCreate())
                // bb
                this.abstract_ = new BooleanType();
        return this.abstract_;
    }

    public boolean hasAbstractElement() {
        return this.abstract_ != null && !this.abstract_.isEmpty();
    }

    public boolean hasAbstract() {
        return this.abstract_ != null && !this.abstract_.isEmpty();
    }

    /**
     * @param value {@link #abstract_} (If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.). This is the underlying object with id, value and extensions. The accessor "getAbstract" gives direct access to the value
     */
    public ValueSetExpansionContainsComponent setAbstractElement(BooleanType value) {
        this.abstract_ = value;
        return this;
    }

    /**
     * @return If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
     */
    public boolean getAbstract() {
        return this.abstract_ == null || this.abstract_.isEmpty() ? false : this.abstract_.getValue();
    }

    /**
     * @param value If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
     */
    public ValueSetExpansionContainsComponent setAbstract(boolean value) {
        if (this.abstract_ == null)
            this.abstract_ = new BooleanType();
        this.abstract_.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionContainsComponent.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ValueSetExpansionContainsComponent setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.
     */
    public ValueSetExpansionContainsComponent setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionContainsComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new CodeType();
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public ValueSetExpansionContainsComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
     */
    public ValueSetExpansionContainsComponent setCode(String value) {
        if (Utilities.noString(value))
            this.code = null;
        else {
            if (this.code == null)
                this.code = new CodeType();
            this.code.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #display} (The recommended display for this item in the expansion.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public StringType getDisplayElement() {
        if (this.display == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionContainsComponent.display");
            else if (Configuration.doAutoCreate())
                // bb
                this.display = new StringType();
        return this.display;
    }

    public boolean hasDisplayElement() {
        return this.display != null && !this.display.isEmpty();
    }

    public boolean hasDisplay() {
        return this.display != null && !this.display.isEmpty();
    }

    /**
     * @param value {@link #display} (The recommended display for this item in the expansion.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public ValueSetExpansionContainsComponent setDisplayElement(StringType value) {
        this.display = value;
        return this;
    }

    /**
     * @return The recommended display for this item in the expansion.
     */
    public String getDisplay() {
        return this.display == null ? null : this.display.getValue();
    }

    /**
     * @param value The recommended display for this item in the expansion.
     */
    public ValueSetExpansionContainsComponent setDisplay(String value) {
        if (Utilities.noString(value))
            this.display = null;
        else {
            if (this.display == null)
                this.display = new StringType();
            this.display.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contains} (Other codes and entries contained under this entry in the hierarchy.)
     */
    public List<ValueSetExpansionContainsComponent> getContains() {
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        return this.contains;
    }

    public boolean hasContains() {
        if (this.contains == null)
            return false;
        for (ValueSetExpansionContainsComponent item : this.contains) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ValueSetExpansionContainsComponent addContains() {
        // 3
        ValueSetExpansionContainsComponent t = new ValueSetExpansionContainsComponent();
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        this.contains.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetExpansionContainsComponent addContains(ValueSetExpansionContainsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        this.contains.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("system", "uri", "An absolute URI which is the code system in which the code for this item in the expansion is defined.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("abstract", "boolean", "If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.", 0, java.lang.Integer.MAX_VALUE, abstract_));
        childrenList.add(new Property("version", "string", "The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("code", "code", "The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("display", "string", "The recommended display for this item in the expansion.", 0, java.lang.Integer.MAX_VALUE, display));
        childrenList.add(new Property("contains", "@ValueSet.expansion.contains", "Other codes and entries contained under this entry in the hierarchy.", 0, java.lang.Integer.MAX_VALUE, contains));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("system"))
            // UriType
            this.system = castToUri(value);
        else if (name.equals("abstract"))
            // BooleanType
            this.abstract_ = castToBoolean(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("display"))
            // StringType
            this.display = castToString(value);
        else if (name.equals("contains"))
            this.getContains().add((ValueSetExpansionContainsComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.system");
        } else if (name.equals("abstract")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.abstract");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.version");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.code");
        } else if (name.equals("display")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.display");
        } else if (name.equals("contains")) {
            return addContains();
        } else
            return super.addChild(name);
    }

    public ValueSetExpansionContainsComponent copy() {
        ValueSetExpansionContainsComponent dst = new ValueSetExpansionContainsComponent();
        copyValues(dst);
        dst.system = system == null ? null : system.copy();
        dst.abstract_ = abstract_ == null ? null : abstract_.copy();
        dst.version = version == null ? null : version.copy();
        dst.code = code == null ? null : code.copy();
        dst.display = display == null ? null : display.copy();
        if (contains != null) {
            dst.contains = new ArrayList<ValueSetExpansionContainsComponent>();
            for (ValueSetExpansionContainsComponent i : contains) dst.contains.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSetExpansionContainsComponent))
            return false;
        ValueSetExpansionContainsComponent o = (ValueSetExpansionContainsComponent) other;
        return compareDeep(system, o.system, true) && compareDeep(abstract_, o.abstract_, true) && compareDeep(version, o.version, true) && compareDeep(code, o.code, true) && compareDeep(display, o.display, true) && compareDeep(contains, o.contains, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSetExpansionContainsComponent))
            return false;
        ValueSetExpansionContainsComponent o = (ValueSetExpansionContainsComponent) other;
        return compareValues(system, o.system, true) && compareValues(abstract_, o.abstract_, true) && compareValues(version, o.version, true) && compareValues(code, o.code, true) && compareValues(display, o.display, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (system == null || system.isEmpty()) && (abstract_ == null || abstract_.isEmpty()) && (version == null || version.isEmpty()) && (code == null || code.isEmpty()) && (display == null || display.isEmpty()) && (contains == null || contains.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.expansion.contains";
    }
}
