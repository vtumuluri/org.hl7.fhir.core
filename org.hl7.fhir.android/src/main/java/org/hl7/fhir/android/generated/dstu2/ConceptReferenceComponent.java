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
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

public class ConceptReferenceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Specifies a code for the concept to be included or excluded.
     */
    protected CodeType code;

    /**
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
     */
    protected StringType display;

    /**
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     */
    protected List<ConceptDefinitionDesignationComponent> designation;

    private static final long serialVersionUID = -1513912691L;

    /*
     * Constructor
     */
    public ConceptReferenceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConceptReferenceComponent(CodeType code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (Specifies a code for the concept to be included or excluded.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptReferenceComponent.code");
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
     * @param value {@link #code} (Specifies a code for the concept to be included or excluded.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public ConceptReferenceComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return Specifies a code for the concept to be included or excluded.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Specifies a code for the concept to be included or excluded.
     */
    public ConceptReferenceComponent setCode(String value) {
        if (this.code == null)
            this.code = new CodeType();
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #display} (The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public StringType getDisplayElement() {
        if (this.display == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptReferenceComponent.display");
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
     * @param value {@link #display} (The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public ConceptReferenceComponent setDisplayElement(StringType value) {
        this.display = value;
        return this;
    }

    /**
     * @return The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
     */
    public String getDisplay() {
        return this.display == null ? null : this.display.getValue();
    }

    /**
     * @param value The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
     */
    public ConceptReferenceComponent setDisplay(String value) {
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
     * @return {@link #designation} (Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.)
     */
    public List<ConceptDefinitionDesignationComponent> getDesignation() {
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        return this.designation;
    }

    public boolean hasDesignation() {
        if (this.designation == null)
            return false;
        for (ConceptDefinitionDesignationComponent item : this.designation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptDefinitionDesignationComponent addDesignation() {
        // 3
        ConceptDefinitionDesignationComponent t = new ConceptDefinitionDesignationComponent();
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        this.designation.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptReferenceComponent addDesignation(ConceptDefinitionDesignationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        this.designation.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "code", "Specifies a code for the concept to be included or excluded.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("display", "string", "The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.", 0, java.lang.Integer.MAX_VALUE, display));
        childrenList.add(new Property("designation", "@ValueSet.codeSystem.concept.designation", "Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.", 0, java.lang.Integer.MAX_VALUE, designation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("display"))
            // StringType
            this.display = castToString(value);
        else if (name.equals("designation"))
            this.getDesignation().add((ConceptDefinitionDesignationComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.code");
        } else if (name.equals("display")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.display");
        } else if (name.equals("designation")) {
            return addDesignation();
        } else
            return super.addChild(name);
    }

    public ConceptReferenceComponent copy() {
        ConceptReferenceComponent dst = new ConceptReferenceComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.display = display == null ? null : display.copy();
        if (designation != null) {
            dst.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
            for (ConceptDefinitionDesignationComponent i : designation) dst.designation.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConceptReferenceComponent))
            return false;
        ConceptReferenceComponent o = (ConceptReferenceComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(display, o.display, true) && compareDeep(designation, o.designation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptReferenceComponent))
            return false;
        ConceptReferenceComponent o = (ConceptReferenceComponent) other;
        return compareValues(code, o.code, true) && compareValues(display, o.display, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (display == null || display.isEmpty()) && (designation == null || designation.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.compose.include.concept";
    }
}
