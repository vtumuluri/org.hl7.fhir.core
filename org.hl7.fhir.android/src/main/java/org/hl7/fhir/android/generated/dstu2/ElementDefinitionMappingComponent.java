package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;

public class ElementDefinitionMappingComponent extends Element implements IBaseDatatypeElement {

    /**
     * An internal reference to the definition of a mapping.
     */
    protected IdType identity;

    /**
     * Identifies the computable language in which mapping.map is expressed.
     */
    protected CodeType language;

    /**
     * Expresses what part of the target specification corresponds to this element.
     */
    protected StringType map;

    private static final long serialVersionUID = -669205371L;

    /*
     * Constructor
     */
    public ElementDefinitionMappingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ElementDefinitionMappingComponent(IdType identity, StringType map) {
        super();
        this.identity = identity;
        this.map = map;
    }

    /**
     * @return {@link #identity} (An internal reference to the definition of a mapping.). This is the underlying object with id, value and extensions. The accessor "getIdentity" gives direct access to the value
     */
    public IdType getIdentityElement() {
        if (this.identity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionMappingComponent.identity");
            else if (Configuration.doAutoCreate())
                // bb
                this.identity = new IdType();
        return this.identity;
    }

    public boolean hasIdentityElement() {
        return this.identity != null && !this.identity.isEmpty();
    }

    public boolean hasIdentity() {
        return this.identity != null && !this.identity.isEmpty();
    }

    /**
     * @param value {@link #identity} (An internal reference to the definition of a mapping.). This is the underlying object with id, value and extensions. The accessor "getIdentity" gives direct access to the value
     */
    public ElementDefinitionMappingComponent setIdentityElement(IdType value) {
        this.identity = value;
        return this;
    }

    /**
     * @return An internal reference to the definition of a mapping.
     */
    public String getIdentity() {
        return this.identity == null ? null : this.identity.getValue();
    }

    /**
     * @param value An internal reference to the definition of a mapping.
     */
    public ElementDefinitionMappingComponent setIdentity(String value) {
        if (this.identity == null)
            this.identity = new IdType();
        this.identity.setValue(value);
        return this;
    }

    /**
     * @return {@link #language} (Identifies the computable language in which mapping.map is expressed.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
     */
    public CodeType getLanguageElement() {
        if (this.language == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionMappingComponent.language");
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
     * @param value {@link #language} (Identifies the computable language in which mapping.map is expressed.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
     */
    public ElementDefinitionMappingComponent setLanguageElement(CodeType value) {
        this.language = value;
        return this;
    }

    /**
     * @return Identifies the computable language in which mapping.map is expressed.
     */
    public String getLanguage() {
        return this.language == null ? null : this.language.getValue();
    }

    /**
     * @param value Identifies the computable language in which mapping.map is expressed.
     */
    public ElementDefinitionMappingComponent setLanguage(String value) {
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
     * @return {@link #map} (Expresses what part of the target specification corresponds to this element.). This is the underlying object with id, value and extensions. The accessor "getMap" gives direct access to the value
     */
    public StringType getMapElement() {
        if (this.map == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionMappingComponent.map");
            else if (Configuration.doAutoCreate())
                // bb
                this.map = new StringType();
        return this.map;
    }

    public boolean hasMapElement() {
        return this.map != null && !this.map.isEmpty();
    }

    public boolean hasMap() {
        return this.map != null && !this.map.isEmpty();
    }

    /**
     * @param value {@link #map} (Expresses what part of the target specification corresponds to this element.). This is the underlying object with id, value and extensions. The accessor "getMap" gives direct access to the value
     */
    public ElementDefinitionMappingComponent setMapElement(StringType value) {
        this.map = value;
        return this;
    }

    /**
     * @return Expresses what part of the target specification corresponds to this element.
     */
    public String getMap() {
        return this.map == null ? null : this.map.getValue();
    }

    /**
     * @param value Expresses what part of the target specification corresponds to this element.
     */
    public ElementDefinitionMappingComponent setMap(String value) {
        if (this.map == null)
            this.map = new StringType();
        this.map.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identity", "id", "An internal reference to the definition of a mapping.", 0, java.lang.Integer.MAX_VALUE, identity));
        childrenList.add(new Property("language", "code", "Identifies the computable language in which mapping.map is expressed.", 0, java.lang.Integer.MAX_VALUE, language));
        childrenList.add(new Property("map", "string", "Expresses what part of the target specification corresponds to this element.", 0, java.lang.Integer.MAX_VALUE, map));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identity"))
            // IdType
            this.identity = castToId(value);
        else if (name.equals("language"))
            // CodeType
            this.language = castToCode(value);
        else if (name.equals("map"))
            // StringType
            this.map = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identity")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.identity");
        } else if (name.equals("language")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.language");
        } else if (name.equals("map")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.map");
        } else
            return super.addChild(name);
    }

    public ElementDefinitionMappingComponent copy() {
        ElementDefinitionMappingComponent dst = new ElementDefinitionMappingComponent();
        copyValues(dst);
        dst.identity = identity == null ? null : identity.copy();
        dst.language = language == null ? null : language.copy();
        dst.map = map == null ? null : map.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinitionMappingComponent))
            return false;
        ElementDefinitionMappingComponent o = (ElementDefinitionMappingComponent) other;
        return compareDeep(identity, o.identity, true) && compareDeep(language, o.language, true) && compareDeep(map, o.map, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinitionMappingComponent))
            return false;
        ElementDefinitionMappingComponent o = (ElementDefinitionMappingComponent) other;
        return compareValues(identity, o.identity, true) && compareValues(language, o.language, true) && compareValues(map, o.map, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identity == null || identity.isEmpty()) && (language == null || language.isEmpty()) && (map == null || map.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.mapping";
    }
}
