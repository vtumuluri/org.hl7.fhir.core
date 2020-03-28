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

public class ConformanceRestSecurityCertificateComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Mime type for certificate.
     */
    protected CodeType type;

    /**
     * Actual certificate.
     */
    protected Base64BinaryType blob;

    private static final long serialVersionUID = 2092655854L;

    /*
     * Constructor
     */
    public ConformanceRestSecurityCertificateComponent() {
        super();
    }

    /**
     * @return {@link #type} (Mime type for certificate.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestSecurityCertificateComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new CodeType();
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Mime type for certificate.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ConformanceRestSecurityCertificateComponent setTypeElement(CodeType value) {
        this.type = value;
        return this;
    }

    /**
     * @return Mime type for certificate.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Mime type for certificate.
     */
    public ConformanceRestSecurityCertificateComponent setType(String value) {
        if (Utilities.noString(value))
            this.type = null;
        else {
            if (this.type == null)
                this.type = new CodeType();
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #blob} (Actual certificate.). This is the underlying object with id, value and extensions. The accessor "getBlob" gives direct access to the value
     */
    public Base64BinaryType getBlobElement() {
        if (this.blob == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestSecurityCertificateComponent.blob");
            else if (Configuration.doAutoCreate())
                // bb
                this.blob = new Base64BinaryType();
        return this.blob;
    }

    public boolean hasBlobElement() {
        return this.blob != null && !this.blob.isEmpty();
    }

    public boolean hasBlob() {
        return this.blob != null && !this.blob.isEmpty();
    }

    /**
     * @param value {@link #blob} (Actual certificate.). This is the underlying object with id, value and extensions. The accessor "getBlob" gives direct access to the value
     */
    public ConformanceRestSecurityCertificateComponent setBlobElement(Base64BinaryType value) {
        this.blob = value;
        return this;
    }

    /**
     * @return Actual certificate.
     */
    public byte[] getBlob() {
        return this.blob == null ? null : this.blob.getValue();
    }

    /**
     * @param value Actual certificate.
     */
    public ConformanceRestSecurityCertificateComponent setBlob(byte[] value) {
        if (value == null)
            this.blob = null;
        else {
            if (this.blob == null)
                this.blob = new Base64BinaryType();
            this.blob.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "Mime type for certificate.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("blob", "base64Binary", "Actual certificate.", 0, java.lang.Integer.MAX_VALUE, blob));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeType
            this.type = castToCode(value);
        else if (name.equals("blob"))
            // Base64BinaryType
            this.blob = castToBase64Binary(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.type");
        } else if (name.equals("blob")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.blob");
        } else
            return super.addChild(name);
    }

    public ConformanceRestSecurityCertificateComponent copy() {
        ConformanceRestSecurityCertificateComponent dst = new ConformanceRestSecurityCertificateComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.blob = blob == null ? null : blob.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceRestSecurityCertificateComponent))
            return false;
        ConformanceRestSecurityCertificateComponent o = (ConformanceRestSecurityCertificateComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(blob, o.blob, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceRestSecurityCertificateComponent))
            return false;
        ConformanceRestSecurityCertificateComponent o = (ConformanceRestSecurityCertificateComponent) other;
        return compareValues(type, o.type, true) && compareValues(blob, o.blob, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (blob == null || blob.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest.security.certificate";
    }
}
