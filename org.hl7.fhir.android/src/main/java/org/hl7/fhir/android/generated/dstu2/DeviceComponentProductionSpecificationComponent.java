package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrincipleEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrinciple;

public class DeviceComponentProductionSpecificationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.
     */
    protected CodeableConcept specType;

    /**
     * Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.
     */
    protected Identifier componentId;

    /**
     * Describes the printable string defining the component.
     */
    protected StringType productionSpec;

    private static final long serialVersionUID = -1476597516L;

    /*
     * Constructor
     */
    public DeviceComponentProductionSpecificationComponent() {
        super();
    }

    /**
     * @return {@link #specType} (Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.)
     */
    public CodeableConcept getSpecType() {
        if (this.specType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponentProductionSpecificationComponent.specType");
            else if (Configuration.doAutoCreate())
                // cc
                this.specType = new CodeableConcept();
        return this.specType;
    }

    public boolean hasSpecType() {
        return this.specType != null && !this.specType.isEmpty();
    }

    /**
     * @param value {@link #specType} (Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.)
     */
    public DeviceComponentProductionSpecificationComponent setSpecType(CodeableConcept value) {
        this.specType = value;
        return this;
    }

    /**
     * @return {@link #componentId} (Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.)
     */
    public Identifier getComponentId() {
        if (this.componentId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponentProductionSpecificationComponent.componentId");
            else if (Configuration.doAutoCreate())
                // cc
                this.componentId = new Identifier();
        return this.componentId;
    }

    public boolean hasComponentId() {
        return this.componentId != null && !this.componentId.isEmpty();
    }

    /**
     * @param value {@link #componentId} (Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.)
     */
    public DeviceComponentProductionSpecificationComponent setComponentId(Identifier value) {
        this.componentId = value;
        return this;
    }

    /**
     * @return {@link #productionSpec} (Describes the printable string defining the component.). This is the underlying object with id, value and extensions. The accessor "getProductionSpec" gives direct access to the value
     */
    public StringType getProductionSpecElement() {
        if (this.productionSpec == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponentProductionSpecificationComponent.productionSpec");
            else if (Configuration.doAutoCreate())
                // bb
                this.productionSpec = new StringType();
        return this.productionSpec;
    }

    public boolean hasProductionSpecElement() {
        return this.productionSpec != null && !this.productionSpec.isEmpty();
    }

    public boolean hasProductionSpec() {
        return this.productionSpec != null && !this.productionSpec.isEmpty();
    }

    /**
     * @param value {@link #productionSpec} (Describes the printable string defining the component.). This is the underlying object with id, value and extensions. The accessor "getProductionSpec" gives direct access to the value
     */
    public DeviceComponentProductionSpecificationComponent setProductionSpecElement(StringType value) {
        this.productionSpec = value;
        return this;
    }

    /**
     * @return Describes the printable string defining the component.
     */
    public String getProductionSpec() {
        return this.productionSpec == null ? null : this.productionSpec.getValue();
    }

    /**
     * @param value Describes the printable string defining the component.
     */
    public DeviceComponentProductionSpecificationComponent setProductionSpec(String value) {
        if (Utilities.noString(value))
            this.productionSpec = null;
        else {
            if (this.productionSpec == null)
                this.productionSpec = new StringType();
            this.productionSpec.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("specType", "CodeableConcept", "Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.", 0, java.lang.Integer.MAX_VALUE, specType));
        childrenList.add(new Property("componentId", "Identifier", "Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.", 0, java.lang.Integer.MAX_VALUE, componentId));
        childrenList.add(new Property("productionSpec", "string", "Describes the printable string defining the component.", 0, java.lang.Integer.MAX_VALUE, productionSpec));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("specType"))
            // CodeableConcept
            this.specType = castToCodeableConcept(value);
        else if (name.equals("componentId"))
            // Identifier
            this.componentId = castToIdentifier(value);
        else if (name.equals("productionSpec"))
            // StringType
            this.productionSpec = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("specType")) {
            this.specType = new CodeableConcept();
            return this.specType;
        } else if (name.equals("componentId")) {
            this.componentId = new Identifier();
            return this.componentId;
        } else if (name.equals("productionSpec")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceComponent.productionSpec");
        } else
            return super.addChild(name);
    }

    public DeviceComponentProductionSpecificationComponent copy() {
        DeviceComponentProductionSpecificationComponent dst = new DeviceComponentProductionSpecificationComponent();
        copyValues(dst);
        dst.specType = specType == null ? null : specType.copy();
        dst.componentId = componentId == null ? null : componentId.copy();
        dst.productionSpec = productionSpec == null ? null : productionSpec.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DeviceComponentProductionSpecificationComponent))
            return false;
        DeviceComponentProductionSpecificationComponent o = (DeviceComponentProductionSpecificationComponent) other;
        return compareDeep(specType, o.specType, true) && compareDeep(componentId, o.componentId, true) && compareDeep(productionSpec, o.productionSpec, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DeviceComponentProductionSpecificationComponent))
            return false;
        DeviceComponentProductionSpecificationComponent o = (DeviceComponentProductionSpecificationComponent) other;
        return compareValues(productionSpec, o.productionSpec, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (specType == null || specType.isEmpty()) && (componentId == null || componentId.isEmpty()) && (productionSpec == null || productionSpec.isEmpty());
    }

    public String fhirType() {
        return "DeviceComponent.productionSpecification";
    }
}
