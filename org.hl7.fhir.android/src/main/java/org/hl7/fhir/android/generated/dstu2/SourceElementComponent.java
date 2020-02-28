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

public class SourceElementComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
     */
    protected UriType codeSystem;

    /**
     * Identity (code or path) or the element/item being mapped.
     */
    protected CodeType code;

    /**
     * A concept from the target value set that this concept maps to.
     */
    protected List<TargetElementComponent> target;

    private static final long serialVersionUID = -458143877L;

    /*
     * Constructor
     */
    public SourceElementComponent() {
        super();
    }

    /**
     * @return {@link #codeSystem} (An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public UriType getCodeSystemElement() {
        if (this.codeSystem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SourceElementComponent.codeSystem");
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
     * @param value {@link #codeSystem} (An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public SourceElementComponent setCodeSystemElement(UriType value) {
        this.codeSystem = value;
        return this;
    }

    /**
     * @return An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
     */
    public String getCodeSystem() {
        return this.codeSystem == null ? null : this.codeSystem.getValue();
    }

    /**
     * @param value An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
     */
    public SourceElementComponent setCodeSystem(String value) {
        if (Utilities.noString(value))
            this.codeSystem = null;
        else {
            if (this.codeSystem == null)
                this.codeSystem = new UriType();
            this.codeSystem.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (Identity (code or path) or the element/item being mapped.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SourceElementComponent.code");
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
     * @param value {@link #code} (Identity (code or path) or the element/item being mapped.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public SourceElementComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return Identity (code or path) or the element/item being mapped.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Identity (code or path) or the element/item being mapped.
     */
    public SourceElementComponent setCode(String value) {
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
     * @return {@link #target} (A concept from the target value set that this concept maps to.)
     */
    public List<TargetElementComponent> getTarget() {
        if (this.target == null)
            this.target = new ArrayList<TargetElementComponent>();
        return this.target;
    }

    public boolean hasTarget() {
        if (this.target == null)
            return false;
        for (TargetElementComponent item : this.target) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TargetElementComponent addTarget() {
        // 3
        TargetElementComponent t = new TargetElementComponent();
        if (this.target == null)
            this.target = new ArrayList<TargetElementComponent>();
        this.target.add(t);
        return t;
    }

    // syntactic sugar
    public SourceElementComponent addTarget(TargetElementComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.target == null)
            this.target = new ArrayList<TargetElementComponent>();
        this.target.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("codeSystem", "uri", "An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).", 0, java.lang.Integer.MAX_VALUE, codeSystem));
        childrenList.add(new Property("code", "code", "Identity (code or path) or the element/item being mapped.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("target", "", "A concept from the target value set that this concept maps to.", 0, java.lang.Integer.MAX_VALUE, target));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("codeSystem"))
            // UriType
            this.codeSystem = castToUri(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("target"))
            this.getTarget().add((TargetElementComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("codeSystem")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.codeSystem");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.code");
        } else if (name.equals("target")) {
            return addTarget();
        } else
            return super.addChild(name);
    }

    public SourceElementComponent copy() {
        SourceElementComponent dst = new SourceElementComponent();
        copyValues(dst);
        dst.codeSystem = codeSystem == null ? null : codeSystem.copy();
        dst.code = code == null ? null : code.copy();
        if (target != null) {
            dst.target = new ArrayList<TargetElementComponent>();
            for (TargetElementComponent i : target) dst.target.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SourceElementComponent))
            return false;
        SourceElementComponent o = (SourceElementComponent) other;
        return compareDeep(codeSystem, o.codeSystem, true) && compareDeep(code, o.code, true) && compareDeep(target, o.target, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SourceElementComponent))
            return false;
        SourceElementComponent o = (SourceElementComponent) other;
        return compareValues(codeSystem, o.codeSystem, true) && compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (codeSystem == null || codeSystem.isEmpty()) && (code == null || code.isEmpty()) && (target == null || target.isEmpty());
    }

    public String fhirType() {
        return "ConceptMap.element";
    }
}
