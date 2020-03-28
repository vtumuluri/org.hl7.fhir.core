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

public class SystemInteractionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A coded identifier of the operation, supported by the system.
     */
    protected Enumeration<SystemRestfulInteraction> code;

    /**
     * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
     */
    protected StringType documentation;

    private static final long serialVersionUID = 510675287L;

    /*
     * Constructor
     */
    public SystemInteractionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SystemInteractionComponent(Enumeration<SystemRestfulInteraction> code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (A coded identifier of the operation, supported by the system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Enumeration<SystemRestfulInteraction> getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SystemInteractionComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new Enumeration<SystemRestfulInteraction>(new SystemRestfulInteractionEnumFactory());
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A coded identifier of the operation, supported by the system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public SystemInteractionComponent setCodeElement(Enumeration<SystemRestfulInteraction> value) {
        this.code = value;
        return this;
    }

    /**
     * @return A coded identifier of the operation, supported by the system.
     */
    public SystemRestfulInteraction getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value A coded identifier of the operation, supported by the system.
     */
    public SystemInteractionComponent setCode(SystemRestfulInteraction value) {
        if (this.code == null)
            this.code = new Enumeration<SystemRestfulInteraction>(new SystemRestfulInteractionEnumFactory());
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SystemInteractionComponent.documentation");
            else if (Configuration.doAutoCreate())
                // bb
                this.documentation = new StringType();
        return this.documentation;
    }

    public boolean hasDocumentationElement() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    public boolean hasDocumentation() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    /**
     * @param value {@link #documentation} (Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public SystemInteractionComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
     */
    public SystemInteractionComponent setDocumentation(String value) {
        if (Utilities.noString(value))
            this.documentation = null;
        else {
            if (this.documentation == null)
                this.documentation = new StringType();
            this.documentation.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "code", "A coded identifier of the operation, supported by the system.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("documentation", "string", "Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.", 0, java.lang.Integer.MAX_VALUE, documentation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // Enumeration<SystemRestfulInteraction>
            this.code = new SystemRestfulInteractionEnumFactory().fromType(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.code");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else
            return super.addChild(name);
    }

    public SystemInteractionComponent copy() {
        SystemInteractionComponent dst = new SystemInteractionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SystemInteractionComponent))
            return false;
        SystemInteractionComponent o = (SystemInteractionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(documentation, o.documentation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SystemInteractionComponent))
            return false;
        SystemInteractionComponent o = (SystemInteractionComponent) other;
        return compareValues(code, o.code, true) && compareValues(documentation, o.documentation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (documentation == null || documentation.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest.interaction";
    }
}
