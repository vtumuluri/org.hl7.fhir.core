package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeek;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeekEnumFactory;

public class HealthcareServiceNotAvailableComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The reason that can be presented to the user as to why this time is not available.
     */
    protected StringType description;

    /**
     * Service is not available (seasonally or for a public holiday) from this date.
     */
    protected Period during;

    private static final long serialVersionUID = 310849929L;

    /*
     * Constructor
     */
    public HealthcareServiceNotAvailableComponent() {
        super();
    }

    /*
     * Constructor
     */
    public HealthcareServiceNotAvailableComponent(StringType description) {
        super();
        this.description = description;
    }

    /**
     * @return {@link #description} (The reason that can be presented to the user as to why this time is not available.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareServiceNotAvailableComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (The reason that can be presented to the user as to why this time is not available.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public HealthcareServiceNotAvailableComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return The reason that can be presented to the user as to why this time is not available.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value The reason that can be presented to the user as to why this time is not available.
     */
    public HealthcareServiceNotAvailableComponent setDescription(String value) {
        if (this.description == null)
            this.description = new StringType();
        this.description.setValue(value);
        return this;
    }

    /**
     * @return {@link #during} (Service is not available (seasonally or for a public holiday) from this date.)
     */
    public Period getDuring() {
        if (this.during == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareServiceNotAvailableComponent.during");
            else if (Configuration.doAutoCreate())
                // cc
                this.during = new Period();
        return this.during;
    }

    public boolean hasDuring() {
        return this.during != null && !this.during.isEmpty();
    }

    /**
     * @param value {@link #during} (Service is not available (seasonally or for a public holiday) from this date.)
     */
    public HealthcareServiceNotAvailableComponent setDuring(Period value) {
        this.during = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("description", "string", "The reason that can be presented to the user as to why this time is not available.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("during", "Period", "Service is not available (seasonally or for a public holiday) from this date.", 0, java.lang.Integer.MAX_VALUE, during));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("during"))
            // Period
            this.during = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.description");
        } else if (name.equals("during")) {
            this.during = new Period();
            return this.during;
        } else
            return super.addChild(name);
    }

    public HealthcareServiceNotAvailableComponent copy() {
        HealthcareServiceNotAvailableComponent dst = new HealthcareServiceNotAvailableComponent();
        copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.during = during == null ? null : during.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof HealthcareServiceNotAvailableComponent))
            return false;
        HealthcareServiceNotAvailableComponent o = (HealthcareServiceNotAvailableComponent) other;
        return compareDeep(description, o.description, true) && compareDeep(during, o.during, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof HealthcareServiceNotAvailableComponent))
            return false;
        HealthcareServiceNotAvailableComponent o = (HealthcareServiceNotAvailableComponent) other;
        return compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (description == null || description.isEmpty()) && (during == null || during.isEmpty());
    }

    public String fhirType() {
        return "HealthcareService.notAvailable";
    }
}
