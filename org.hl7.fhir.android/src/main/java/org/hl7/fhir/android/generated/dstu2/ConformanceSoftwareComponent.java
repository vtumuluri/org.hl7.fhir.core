package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;

public class ConformanceSoftwareComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Name software is known by.
     */
    protected StringType name;

    /**
     * The version identifier for the software covered by this statement.
     */
    protected StringType version;

    /**
     * Date this version of the software released.
     */
    protected DateTimeType releaseDate;

    private static final long serialVersionUID = 1819769027L;

    /*
     * Constructor
     */
    public ConformanceSoftwareComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceSoftwareComponent(StringType name) {
        super();
        this.name = name;
    }

    /**
     * @return {@link #name} (Name software is known by.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceSoftwareComponent.name");
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
     * @param value {@link #name} (Name software is known by.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ConformanceSoftwareComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Name software is known by.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Name software is known by.
     */
    public ConformanceSoftwareComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The version identifier for the software covered by this statement.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceSoftwareComponent.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version identifier for the software covered by this statement.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ConformanceSoftwareComponent setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version identifier for the software covered by this statement.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version identifier for the software covered by this statement.
     */
    public ConformanceSoftwareComponent setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #releaseDate} (Date this version of the software released.). This is the underlying object with id, value and extensions. The accessor "getReleaseDate" gives direct access to the value
     */
    public DateTimeType getReleaseDateElement() {
        if (this.releaseDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceSoftwareComponent.releaseDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.releaseDate = new DateTimeType();
        return this.releaseDate;
    }

    public boolean hasReleaseDateElement() {
        return this.releaseDate != null && !this.releaseDate.isEmpty();
    }

    public boolean hasReleaseDate() {
        return this.releaseDate != null && !this.releaseDate.isEmpty();
    }

    /**
     * @param value {@link #releaseDate} (Date this version of the software released.). This is the underlying object with id, value and extensions. The accessor "getReleaseDate" gives direct access to the value
     */
    public ConformanceSoftwareComponent setReleaseDateElement(DateTimeType value) {
        this.releaseDate = value;
        return this;
    }

    /**
     * @return Date this version of the software released.
     */
    public Date getReleaseDate() {
        return this.releaseDate == null ? null : this.releaseDate.getValue();
    }

    /**
     * @param value Date this version of the software released.
     */
    public ConformanceSoftwareComponent setReleaseDate(Date value) {
        if (value == null)
            this.releaseDate = null;
        else {
            if (this.releaseDate == null)
                this.releaseDate = new DateTimeType();
            this.releaseDate.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "Name software is known by.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("version", "string", "The version identifier for the software covered by this statement.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("releaseDate", "dateTime", "Date this version of the software released.", 0, java.lang.Integer.MAX_VALUE, releaseDate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("releaseDate"))
            // DateTimeType
            this.releaseDate = castToDateTime(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.name");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.version");
        } else if (name.equals("releaseDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.releaseDate");
        } else
            return super.addChild(name);
    }

    public ConformanceSoftwareComponent copy() {
        ConformanceSoftwareComponent dst = new ConformanceSoftwareComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.version = version == null ? null : version.copy();
        dst.releaseDate = releaseDate == null ? null : releaseDate.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceSoftwareComponent))
            return false;
        ConformanceSoftwareComponent o = (ConformanceSoftwareComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(version, o.version, true) && compareDeep(releaseDate, o.releaseDate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceSoftwareComponent))
            return false;
        ConformanceSoftwareComponent o = (ConformanceSoftwareComponent) other;
        return compareValues(name, o.name, true) && compareValues(version, o.version, true) && compareValues(releaseDate, o.releaseDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (version == null || version.isEmpty()) && (releaseDate == null || releaseDate.isEmpty());
    }

    public String fhirType() {
        return "Conformance.software";
    }
}
