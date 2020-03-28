package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;

public class ConformanceRestSecurityComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
     */
    protected BooleanType cors;

    /**
     * Types of security services are supported/required by the system.
     */
    protected List<CodeableConcept> service;

    /**
     * General description of how security works.
     */
    protected StringType description;

    /**
     * Certificates associated with security profiles.
     */
    protected List<ConformanceRestSecurityCertificateComponent> certificate;

    private static final long serialVersionUID = 391663952L;

    /*
     * Constructor
     */
    public ConformanceRestSecurityComponent() {
        super();
    }

    /**
     * @return {@link #cors} (Server adds CORS headers when responding to requests - this enables javascript applications to use the server.). This is the underlying object with id, value and extensions. The accessor "getCors" gives direct access to the value
     */
    public BooleanType getCorsElement() {
        if (this.cors == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestSecurityComponent.cors");
            else if (Configuration.doAutoCreate())
                // bb
                this.cors = new BooleanType();
        return this.cors;
    }

    public boolean hasCorsElement() {
        return this.cors != null && !this.cors.isEmpty();
    }

    public boolean hasCors() {
        return this.cors != null && !this.cors.isEmpty();
    }

    /**
     * @param value {@link #cors} (Server adds CORS headers when responding to requests - this enables javascript applications to use the server.). This is the underlying object with id, value and extensions. The accessor "getCors" gives direct access to the value
     */
    public ConformanceRestSecurityComponent setCorsElement(BooleanType value) {
        this.cors = value;
        return this;
    }

    /**
     * @return Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
     */
    public boolean getCors() {
        return this.cors == null || this.cors.isEmpty() ? false : this.cors.getValue();
    }

    /**
     * @param value Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
     */
    public ConformanceRestSecurityComponent setCors(boolean value) {
        if (this.cors == null)
            this.cors = new BooleanType();
        this.cors.setValue(value);
        return this;
    }

    /**
     * @return {@link #service} (Types of security services are supported/required by the system.)
     */
    public List<CodeableConcept> getService() {
        if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
        return this.service;
    }

    public boolean hasService() {
        if (this.service == null)
            return false;
        for (CodeableConcept item : this.service) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addService() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
        this.service.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestSecurityComponent addService(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
        this.service.add(t);
        return this;
    }

    /**
     * @return {@link #description} (General description of how security works.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestSecurityComponent.description");
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
     * @param value {@link #description} (General description of how security works.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ConformanceRestSecurityComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return General description of how security works.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value General description of how security works.
     */
    public ConformanceRestSecurityComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #certificate} (Certificates associated with security profiles.)
     */
    public List<ConformanceRestSecurityCertificateComponent> getCertificate() {
        if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
        return this.certificate;
    }

    public boolean hasCertificate() {
        if (this.certificate == null)
            return false;
        for (ConformanceRestSecurityCertificateComponent item : this.certificate) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceRestSecurityCertificateComponent addCertificate() {
        // 3
        ConformanceRestSecurityCertificateComponent t = new ConformanceRestSecurityCertificateComponent();
        if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
        this.certificate.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestSecurityComponent addCertificate(ConformanceRestSecurityCertificateComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
        this.certificate.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("cors", "boolean", "Server adds CORS headers when responding to requests - this enables javascript applications to use the server.", 0, java.lang.Integer.MAX_VALUE, cors));
        childrenList.add(new Property("service", "CodeableConcept", "Types of security services are supported/required by the system.", 0, java.lang.Integer.MAX_VALUE, service));
        childrenList.add(new Property("description", "string", "General description of how security works.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("certificate", "", "Certificates associated with security profiles.", 0, java.lang.Integer.MAX_VALUE, certificate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("cors"))
            // BooleanType
            this.cors = castToBoolean(value);
        else if (name.equals("service"))
            this.getService().add(castToCodeableConcept(value));
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("certificate"))
            this.getCertificate().add((ConformanceRestSecurityCertificateComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("cors")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.cors");
        } else if (name.equals("service")) {
            return addService();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.description");
        } else if (name.equals("certificate")) {
            return addCertificate();
        } else
            return super.addChild(name);
    }

    public ConformanceRestSecurityComponent copy() {
        ConformanceRestSecurityComponent dst = new ConformanceRestSecurityComponent();
        copyValues(dst);
        dst.cors = cors == null ? null : cors.copy();
        if (service != null) {
            dst.service = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : service) dst.service.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        if (certificate != null) {
            dst.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
            for (ConformanceRestSecurityCertificateComponent i : certificate) dst.certificate.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceRestSecurityComponent))
            return false;
        ConformanceRestSecurityComponent o = (ConformanceRestSecurityComponent) other;
        return compareDeep(cors, o.cors, true) && compareDeep(service, o.service, true) && compareDeep(description, o.description, true) && compareDeep(certificate, o.certificate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceRestSecurityComponent))
            return false;
        ConformanceRestSecurityComponent o = (ConformanceRestSecurityComponent) other;
        return compareValues(cors, o.cors, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (cors == null || cors.isEmpty()) && (service == null || service.isEmpty()) && (description == null || description.isEmpty()) && (certificate == null || certificate.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest.security";
    }
}
