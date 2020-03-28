package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;

public class AuditEventSourceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
     */
    protected StringType site;

    /**
     * Identifier of the source where the event was detected.
     */
    protected Identifier identifier;

    /**
     * Code specifying the type of source where event originated.
     */
    protected List<Coding> type;

    private static final long serialVersionUID = -1562673890L;

    /*
     * Constructor
     */
    public AuditEventSourceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AuditEventSourceComponent(Identifier identifier) {
        super();
        this.identifier = identifier;
    }

    /**
     * @return {@link #site} (Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.). This is the underlying object with id, value and extensions. The accessor "getSite" gives direct access to the value
     */
    public StringType getSiteElement() {
        if (this.site == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventSourceComponent.site");
            else if (Configuration.doAutoCreate())
                // bb
                this.site = new StringType();
        return this.site;
    }

    public boolean hasSiteElement() {
        return this.site != null && !this.site.isEmpty();
    }

    public boolean hasSite() {
        return this.site != null && !this.site.isEmpty();
    }

    /**
     * @param value {@link #site} (Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.). This is the underlying object with id, value and extensions. The accessor "getSite" gives direct access to the value
     */
    public AuditEventSourceComponent setSiteElement(StringType value) {
        this.site = value;
        return this;
    }

    /**
     * @return Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
     */
    public String getSite() {
        return this.site == null ? null : this.site.getValue();
    }

    /**
     * @param value Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
     */
    public AuditEventSourceComponent setSite(String value) {
        if (Utilities.noString(value))
            this.site = null;
        else {
            if (this.site == null)
                this.site = new StringType();
            this.site.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #identifier} (Identifier of the source where the event was detected.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventSourceComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifier of the source where the event was detected.)
     */
    public AuditEventSourceComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #type} (Code specifying the type of source where event originated.)
     */
    public List<Coding> getType() {
        if (this.type == null)
            this.type = new ArrayList<Coding>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (Coding item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addType() {
        // 3
        Coding t = new Coding();
        if (this.type == null)
            this.type = new ArrayList<Coding>();
        this.type.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventSourceComponent addType(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<Coding>();
        this.type.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("site", "string", "Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.", 0, java.lang.Integer.MAX_VALUE, site));
        childrenList.add(new Property("identifier", "Identifier", "Identifier of the source where the event was detected.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("type", "Coding", "Code specifying the type of source where event originated.", 0, java.lang.Integer.MAX_VALUE, type));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("site"))
            // StringType
            this.site = castToString(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("type"))
            this.getType().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("site")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.site");
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("type")) {
            return addType();
        } else
            return super.addChild(name);
    }

    public AuditEventSourceComponent copy() {
        AuditEventSourceComponent dst = new AuditEventSourceComponent();
        copyValues(dst);
        dst.site = site == null ? null : site.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        if (type != null) {
            dst.type = new ArrayList<Coding>();
            for (Coding i : type) dst.type.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventSourceComponent))
            return false;
        AuditEventSourceComponent o = (AuditEventSourceComponent) other;
        return compareDeep(site, o.site, true) && compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventSourceComponent))
            return false;
        AuditEventSourceComponent o = (AuditEventSourceComponent) other;
        return compareValues(site, o.site, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (site == null || site.isEmpty()) && (identifier == null || identifier.isEmpty()) && (type == null || type.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.source";
    }
}
