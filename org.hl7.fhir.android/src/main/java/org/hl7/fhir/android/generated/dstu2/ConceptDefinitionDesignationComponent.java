package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

public class ConceptDefinitionDesignationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The language this designation is defined for.
     */
    protected CodeType language;

    /**
     * A code that details how this designation would be used.
     */
    protected Coding use;

    /**
     * The text value for this designation.
     */
    protected StringType value;

    private static final long serialVersionUID = 1515662414L;

    /*
     * Constructor
     */
    public ConceptDefinitionDesignationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConceptDefinitionDesignationComponent(StringType value) {
        super();
        this.value = value;
    }

    /**
     * @return {@link #language} (The language this designation is defined for.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
     */
    public CodeType getLanguageElement() {
        if (this.language == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionDesignationComponent.language");
            else if (Configuration.doAutoCreate())
                // bb
                this.language = new CodeType();
        return this.language;
    }

    public boolean hasLanguageElement() {
        return this.language != null && !this.language.isEmpty();
    }

    public boolean hasLanguage() {
        return this.language != null && !this.language.isEmpty();
    }

    /**
     * @param value {@link #language} (The language this designation is defined for.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
     */
    public ConceptDefinitionDesignationComponent setLanguageElement(CodeType value) {
        this.language = value;
        return this;
    }

    /**
     * @return The language this designation is defined for.
     */
    public String getLanguage() {
        return this.language == null ? null : this.language.getValue();
    }

    /**
     * @param value The language this designation is defined for.
     */
    public ConceptDefinitionDesignationComponent setLanguage(String value) {
        if (Utilities.noString(value))
            this.language = null;
        else {
            if (this.language == null)
                this.language = new CodeType();
            this.language.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #use} (A code that details how this designation would be used.)
     */
    public Coding getUse() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionDesignationComponent.use");
            else if (Configuration.doAutoCreate())
                // cc
                this.use = new Coding();
        return this.use;
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (A code that details how this designation would be used.)
     */
    public ConceptDefinitionDesignationComponent setUse(Coding value) {
        this.use = value;
        return this;
    }

    /**
     * @return {@link #value} (The text value for this designation.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionDesignationComponent.value");
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
     * @param value {@link #value} (The text value for this designation.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public ConceptDefinitionDesignationComponent setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The text value for this designation.
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The text value for this designation.
     */
    public ConceptDefinitionDesignationComponent setValue(String value) {
        if (this.value == null)
            this.value = new StringType();
        this.value.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("language", "code", "The language this designation is defined for.", 0, java.lang.Integer.MAX_VALUE, language));
        childrenList.add(new Property("use", "Coding", "A code that details how this designation would be used.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("value", "string", "The text value for this designation.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("language"))
            // CodeType
            this.language = castToCode(value);
        else if (name.equals("use"))
            // Coding
            this.use = castToCoding(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("language")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.language");
        } else if (name.equals("use")) {
            this.use = new Coding();
            return this.use;
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.value");
        } else
            return super.addChild(name);
    }

    public ConceptDefinitionDesignationComponent copy() {
        ConceptDefinitionDesignationComponent dst = new ConceptDefinitionDesignationComponent();
        copyValues(dst);
        dst.language = language == null ? null : language.copy();
        dst.use = use == null ? null : use.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConceptDefinitionDesignationComponent))
            return false;
        ConceptDefinitionDesignationComponent o = (ConceptDefinitionDesignationComponent) other;
        return compareDeep(language, o.language, true) && compareDeep(use, o.use, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptDefinitionDesignationComponent))
            return false;
        ConceptDefinitionDesignationComponent o = (ConceptDefinitionDesignationComponent) other;
        return compareValues(language, o.language, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (language == null || language.isEmpty()) && (use == null || use.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.codeSystem.concept.designation";
    }
}
