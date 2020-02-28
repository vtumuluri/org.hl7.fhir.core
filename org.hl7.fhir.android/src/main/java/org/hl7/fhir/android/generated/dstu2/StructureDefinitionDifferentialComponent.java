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

public class StructureDefinitionDifferentialComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Captures constraints on each element within the resource.
     */
    protected List<ElementDefinition> element;

    private static final long serialVersionUID = 53896641L;

    /*
     * Constructor
     */
    public StructureDefinitionDifferentialComponent() {
        super();
    }

    /**
     * @return {@link #element} (Captures constraints on each element within the resource.)
     */
    public List<ElementDefinition> getElement() {
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        return this.element;
    }

    public boolean hasElement() {
        if (this.element == null)
            return false;
        for (ElementDefinition item : this.element) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ElementDefinition addElement() {
        // 3
        ElementDefinition t = new ElementDefinition();
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        this.element.add(t);
        return t;
    }

    // syntactic sugar
    public StructureDefinitionDifferentialComponent addElement(ElementDefinition t) {
        // 3
        if (t == null)
            return this;
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        this.element.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("element", "ElementDefinition", "Captures constraints on each element within the resource.", 0, java.lang.Integer.MAX_VALUE, element));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("element"))
            this.getElement().add(castToElementDefinition(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("element")) {
            return addElement();
        } else
            return super.addChild(name);
    }

    public StructureDefinitionDifferentialComponent copy() {
        StructureDefinitionDifferentialComponent dst = new StructureDefinitionDifferentialComponent();
        copyValues(dst);
        if (element != null) {
            dst.element = new ArrayList<ElementDefinition>();
            for (ElementDefinition i : element) dst.element.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof StructureDefinitionDifferentialComponent))
            return false;
        StructureDefinitionDifferentialComponent o = (StructureDefinitionDifferentialComponent) other;
        return compareDeep(element, o.element, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof StructureDefinitionDifferentialComponent))
            return false;
        StructureDefinitionDifferentialComponent o = (StructureDefinitionDifferentialComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (element == null || element.isEmpty());
    }

    public String fhirType() {
        return "StructureDefinition.differential";
    }
}
