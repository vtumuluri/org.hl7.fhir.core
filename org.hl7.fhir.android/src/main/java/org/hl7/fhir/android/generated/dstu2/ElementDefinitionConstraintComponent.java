package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrength;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;

public class ElementDefinitionConstraintComponent extends Element implements IBaseDatatypeElement {

    /**
     * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
     */
    protected IdType key;

    /**
     * Description of why this constraint is necessary or appropriate.
     */
    protected StringType requirements;

    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     */
    protected Enumeration<ConstraintSeverity> severity;

    /**
     * Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
     */
    protected StringType human;

    /**
     * An XPath expression of constraint that can be executed to see if this constraint is met.
     */
    protected StringType xpath;

    private static final long serialVersionUID = 854521265L;

    /*
     * Constructor
     */
    public ElementDefinitionConstraintComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ElementDefinitionConstraintComponent(IdType key, Enumeration<ConstraintSeverity> severity, StringType human, StringType xpath) {
        super();
        this.key = key;
        this.severity = severity;
        this.human = human;
        this.xpath = xpath;
    }

    /**
     * @return {@link #key} (Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.). This is the underlying object with id, value and extensions. The accessor "getKey" gives direct access to the value
     */
    public IdType getKeyElement() {
        if (this.key == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionConstraintComponent.key");
            else if (Configuration.doAutoCreate())
                // bb
                this.key = new IdType();
        return this.key;
    }

    public boolean hasKeyElement() {
        return this.key != null && !this.key.isEmpty();
    }

    public boolean hasKey() {
        return this.key != null && !this.key.isEmpty();
    }

    /**
     * @param value {@link #key} (Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.). This is the underlying object with id, value and extensions. The accessor "getKey" gives direct access to the value
     */
    public ElementDefinitionConstraintComponent setKeyElement(IdType value) {
        this.key = value;
        return this;
    }

    /**
     * @return Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
     */
    public String getKey() {
        return this.key == null ? null : this.key.getValue();
    }

    /**
     * @param value Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
     */
    public ElementDefinitionConstraintComponent setKey(String value) {
        if (this.key == null)
            this.key = new IdType();
        this.key.setValue(value);
        return this;
    }

    /**
     * @return {@link #requirements} (Description of why this constraint is necessary or appropriate.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionConstraintComponent.requirements");
            else if (Configuration.doAutoCreate())
                // bb
                this.requirements = new StringType();
        return this.requirements;
    }

    public boolean hasRequirementsElement() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    public boolean hasRequirements() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    /**
     * @param value {@link #requirements} (Description of why this constraint is necessary or appropriate.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public ElementDefinitionConstraintComponent setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Description of why this constraint is necessary or appropriate.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Description of why this constraint is necessary or appropriate.
     */
    public ElementDefinitionConstraintComponent setRequirements(String value) {
        if (Utilities.noString(value))
            this.requirements = null;
        else {
            if (this.requirements == null)
                this.requirements = new StringType();
            this.requirements.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #severity} (Identifies the impact constraint violation has on the conformance of the instance.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public Enumeration<ConstraintSeverity> getSeverityElement() {
        if (this.severity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionConstraintComponent.severity");
            else if (Configuration.doAutoCreate())
                // bb
                this.severity = new Enumeration<ConstraintSeverity>(new ConstraintSeverityEnumFactory());
        return this.severity;
    }

    public boolean hasSeverityElement() {
        return this.severity != null && !this.severity.isEmpty();
    }

    public boolean hasSeverity() {
        return this.severity != null && !this.severity.isEmpty();
    }

    /**
     * @param value {@link #severity} (Identifies the impact constraint violation has on the conformance of the instance.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public ElementDefinitionConstraintComponent setSeverityElement(Enumeration<ConstraintSeverity> value) {
        this.severity = value;
        return this;
    }

    /**
     * @return Identifies the impact constraint violation has on the conformance of the instance.
     */
    public ConstraintSeverity getSeverity() {
        return this.severity == null ? null : this.severity.getValue();
    }

    /**
     * @param value Identifies the impact constraint violation has on the conformance of the instance.
     */
    public ElementDefinitionConstraintComponent setSeverity(ConstraintSeverity value) {
        if (this.severity == null)
            this.severity = new Enumeration<ConstraintSeverity>(new ConstraintSeverityEnumFactory());
        this.severity.setValue(value);
        return this;
    }

    /**
     * @return {@link #human} (Text that can be used to describe the constraint in messages identifying that the constraint has been violated.). This is the underlying object with id, value and extensions. The accessor "getHuman" gives direct access to the value
     */
    public StringType getHumanElement() {
        if (this.human == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionConstraintComponent.human");
            else if (Configuration.doAutoCreate())
                // bb
                this.human = new StringType();
        return this.human;
    }

    public boolean hasHumanElement() {
        return this.human != null && !this.human.isEmpty();
    }

    public boolean hasHuman() {
        return this.human != null && !this.human.isEmpty();
    }

    /**
     * @param value {@link #human} (Text that can be used to describe the constraint in messages identifying that the constraint has been violated.). This is the underlying object with id, value and extensions. The accessor "getHuman" gives direct access to the value
     */
    public ElementDefinitionConstraintComponent setHumanElement(StringType value) {
        this.human = value;
        return this;
    }

    /**
     * @return Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
     */
    public String getHuman() {
        return this.human == null ? null : this.human.getValue();
    }

    /**
     * @param value Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
     */
    public ElementDefinitionConstraintComponent setHuman(String value) {
        if (this.human == null)
            this.human = new StringType();
        this.human.setValue(value);
        return this;
    }

    /**
     * @return {@link #xpath} (An XPath expression of constraint that can be executed to see if this constraint is met.). This is the underlying object with id, value and extensions. The accessor "getXpath" gives direct access to the value
     */
    public StringType getXpathElement() {
        if (this.xpath == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionConstraintComponent.xpath");
            else if (Configuration.doAutoCreate())
                // bb
                this.xpath = new StringType();
        return this.xpath;
    }

    public boolean hasXpathElement() {
        return this.xpath != null && !this.xpath.isEmpty();
    }

    public boolean hasXpath() {
        return this.xpath != null && !this.xpath.isEmpty();
    }

    /**
     * @param value {@link #xpath} (An XPath expression of constraint that can be executed to see if this constraint is met.). This is the underlying object with id, value and extensions. The accessor "getXpath" gives direct access to the value
     */
    public ElementDefinitionConstraintComponent setXpathElement(StringType value) {
        this.xpath = value;
        return this;
    }

    /**
     * @return An XPath expression of constraint that can be executed to see if this constraint is met.
     */
    public String getXpath() {
        return this.xpath == null ? null : this.xpath.getValue();
    }

    /**
     * @param value An XPath expression of constraint that can be executed to see if this constraint is met.
     */
    public ElementDefinitionConstraintComponent setXpath(String value) {
        if (this.xpath == null)
            this.xpath = new StringType();
        this.xpath.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("key", "id", "Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.", 0, java.lang.Integer.MAX_VALUE, key));
        childrenList.add(new Property("requirements", "string", "Description of why this constraint is necessary or appropriate.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("severity", "code", "Identifies the impact constraint violation has on the conformance of the instance.", 0, java.lang.Integer.MAX_VALUE, severity));
        childrenList.add(new Property("human", "string", "Text that can be used to describe the constraint in messages identifying that the constraint has been violated.", 0, java.lang.Integer.MAX_VALUE, human));
        childrenList.add(new Property("xpath", "string", "An XPath expression of constraint that can be executed to see if this constraint is met.", 0, java.lang.Integer.MAX_VALUE, xpath));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("key"))
            // IdType
            this.key = castToId(value);
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("severity"))
            // Enumeration<ConstraintSeverity>
            this.severity = new ConstraintSeverityEnumFactory().fromType(value);
        else if (name.equals("human"))
            // StringType
            this.human = castToString(value);
        else if (name.equals("xpath"))
            // StringType
            this.xpath = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("key")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.key");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.requirements");
        } else if (name.equals("severity")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.severity");
        } else if (name.equals("human")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.human");
        } else if (name.equals("xpath")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.xpath");
        } else
            return super.addChild(name);
    }

    public ElementDefinitionConstraintComponent copy() {
        ElementDefinitionConstraintComponent dst = new ElementDefinitionConstraintComponent();
        copyValues(dst);
        dst.key = key == null ? null : key.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.severity = severity == null ? null : severity.copy();
        dst.human = human == null ? null : human.copy();
        dst.xpath = xpath == null ? null : xpath.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinitionConstraintComponent))
            return false;
        ElementDefinitionConstraintComponent o = (ElementDefinitionConstraintComponent) other;
        return compareDeep(key, o.key, true) && compareDeep(requirements, o.requirements, true) && compareDeep(severity, o.severity, true) && compareDeep(human, o.human, true) && compareDeep(xpath, o.xpath, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinitionConstraintComponent))
            return false;
        ElementDefinitionConstraintComponent o = (ElementDefinitionConstraintComponent) other;
        return compareValues(key, o.key, true) && compareValues(requirements, o.requirements, true) && compareValues(severity, o.severity, true) && compareValues(human, o.human, true) && compareValues(xpath, o.xpath, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (key == null || key.isEmpty()) && (requirements == null || requirements.isEmpty()) && (severity == null || severity.isEmpty()) && (human == null || human.isEmpty()) && (xpath == null || xpath.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.constraint";
    }
}
