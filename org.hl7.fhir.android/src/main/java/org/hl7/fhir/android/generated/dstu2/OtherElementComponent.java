package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConceptMapEquivalence;
import org.hl7.fhir.dstu2.model.Enumerations.ConceptMapEquivalenceEnumFactory;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class OtherElementComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.
     */
    protected UriType element;

    /**
     * An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
     */
    protected UriType codeSystem;

    /**
     * Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
     */
    protected StringType code;

    private static final long serialVersionUID = 1488522448L;

    /*
     * Constructor
     */
    public OtherElementComponent() {
        super();
    }

    /*
     * Constructor
     */
    public OtherElementComponent(UriType element, UriType codeSystem, StringType code) {
        super();
        this.element = element;
        this.codeSystem = codeSystem;
        this.code = code;
    }

    /**
     * @return {@link #element} (A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.). This is the underlying object with id, value and extensions. The accessor "getElement" gives direct access to the value
     */
    public UriType getElementElement() {
        if (this.element == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OtherElementComponent.element");
            else if (Configuration.doAutoCreate())
                // bb
                this.element = new UriType();
        return this.element;
    }

    public boolean hasElementElement() {
        return this.element != null && !this.element.isEmpty();
    }

    public boolean hasElement() {
        return this.element != null && !this.element.isEmpty();
    }

    /**
     * @param value {@link #element} (A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.). This is the underlying object with id, value and extensions. The accessor "getElement" gives direct access to the value
     */
    public OtherElementComponent setElementElement(UriType value) {
        this.element = value;
        return this;
    }

    /**
     * @return A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.
     */
    public String getElement() {
        return this.element == null ? null : this.element.getValue();
    }

    /**
     * @param value A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.
     */
    public OtherElementComponent setElement(String value) {
        if (this.element == null)
            this.element = new UriType();
        this.element.setValue(value);
        return this;
    }

    /**
     * @return {@link #codeSystem} (An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public UriType getCodeSystemElement() {
        if (this.codeSystem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OtherElementComponent.codeSystem");
            else if (Configuration.doAutoCreate())
                // bb
                this.codeSystem = new UriType();
        return this.codeSystem;
    }

    public boolean hasCodeSystemElement() {
        return this.codeSystem != null && !this.codeSystem.isEmpty();
    }

    public boolean hasCodeSystem() {
        return this.codeSystem != null && !this.codeSystem.isEmpty();
    }

    /**
     * @param value {@link #codeSystem} (An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public OtherElementComponent setCodeSystemElement(UriType value) {
        this.codeSystem = value;
        return this;
    }

    /**
     * @return An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
     */
    public String getCodeSystem() {
        return this.codeSystem == null ? null : this.codeSystem.getValue();
    }

    /**
     * @param value An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
     */
    public OtherElementComponent setCodeSystem(String value) {
        if (this.codeSystem == null)
            this.codeSystem = new UriType();
        this.codeSystem.setValue(value);
        return this;
    }

    /**
     * @return {@link #code} (Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public StringType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OtherElementComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new StringType();
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public OtherElementComponent setCodeElement(StringType value) {
        this.code = value;
        return this;
    }

    /**
     * @return Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
     */
    public OtherElementComponent setCode(String value) {
        if (this.code == null)
            this.code = new StringType();
        this.code.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("element", "uri", "A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.", 0, java.lang.Integer.MAX_VALUE, element));
        childrenList.add(new Property("codeSystem", "uri", "An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).", 0, java.lang.Integer.MAX_VALUE, codeSystem));
        childrenList.add(new Property("code", "string", "Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.", 0, java.lang.Integer.MAX_VALUE, code));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("element"))
            // UriType
            this.element = castToUri(value);
        else if (name.equals("codeSystem"))
            // UriType
            this.codeSystem = castToUri(value);
        else if (name.equals("code"))
            // StringType
            this.code = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("element")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.element");
        } else if (name.equals("codeSystem")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.codeSystem");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.code");
        } else
            return super.addChild(name);
    }

    public OtherElementComponent copy() {
        OtherElementComponent dst = new OtherElementComponent();
        copyValues(dst);
        dst.element = element == null ? null : element.copy();
        dst.codeSystem = codeSystem == null ? null : codeSystem.copy();
        dst.code = code == null ? null : code.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OtherElementComponent))
            return false;
        OtherElementComponent o = (OtherElementComponent) other;
        return compareDeep(element, o.element, true) && compareDeep(codeSystem, o.codeSystem, true) && compareDeep(code, o.code, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OtherElementComponent))
            return false;
        OtherElementComponent o = (OtherElementComponent) other;
        return compareValues(element, o.element, true) && compareValues(codeSystem, o.codeSystem, true) && compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (element == null || element.isEmpty()) && (codeSystem == null || codeSystem.isEmpty()) && (code == null || code.isEmpty());
    }

    public String fhirType() {
        return "ConceptMap.element.target.dependsOn";
    }
}
