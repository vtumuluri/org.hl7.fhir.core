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
import org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum.StructureDefinitionKind;
import org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum.StructureDefinitionKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum.ExtensionContext;
import org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum.ExtensionContextEnumFactory;

public class StructureDefinitionContactComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of an individual to contact regarding the structure definition.
     */
    protected StringType name;

    /**
     * Contact details for individual (if a name was provided) or the publisher.
     */
    protected List<ContactPoint> telecom;

    private static final long serialVersionUID = -1179697803L;

    /*
     * Constructor
     */
    public StructureDefinitionContactComponent() {
        super();
    }

    /**
     * @return {@link #name} (The name of an individual to contact regarding the structure definition.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create StructureDefinitionContactComponent.name");
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
     * @param value {@link #name} (The name of an individual to contact regarding the structure definition.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StructureDefinitionContactComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of an individual to contact regarding the structure definition.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of an individual to contact regarding the structure definition.
     */
    public StructureDefinitionContactComponent setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #telecom} (Contact details for individual (if a name was provided) or the publisher.)
     */
    public List<ContactPoint> getTelecom() {
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        return this.telecom;
    }

    public boolean hasTelecom() {
        if (this.telecom == null)
            return false;
        for (ContactPoint item : this.telecom) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ContactPoint addTelecom() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return t;
    }

    // syntactic sugar
    public StructureDefinitionContactComponent addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name of an individual to contact regarding the structure definition.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "Contact details for individual (if a name was provided) or the publisher.", 0, java.lang.Integer.MAX_VALUE, telecom));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type StructureDefinition.name");
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else
            return super.addChild(name);
    }

    public StructureDefinitionContactComponent copy() {
        StructureDefinitionContactComponent dst = new StructureDefinitionContactComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof StructureDefinitionContactComponent))
            return false;
        StructureDefinitionContactComponent o = (StructureDefinitionContactComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof StructureDefinitionContactComponent))
            return false;
        StructureDefinitionContactComponent o = (StructureDefinitionContactComponent) other;
        return compareValues(name, o.name, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty());
    }

    public String fhirType() {
        return "StructureDefinition.contact";
    }
}
