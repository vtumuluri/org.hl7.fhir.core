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
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

public class ValueSetExpansionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
     */
    protected UriType identifier;

    /**
     * The time at which the expansion was produced by the expanding system.
     */
    protected DateTimeType timestamp;

    /**
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
     */
    protected IntegerType total;

    /**
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
     */
    protected IntegerType offset;

    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
     */
    protected List<ValueSetExpansionParameterComponent> parameter;

    /**
     * The codes that are contained in the value set expansion.
     */
    protected List<ValueSetExpansionContainsComponent> contains;

    private static final long serialVersionUID = -43471993L;

    /*
     * Constructor
     */
    public ValueSetExpansionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ValueSetExpansionComponent(UriType identifier, DateTimeType timestamp) {
        super();
        this.identifier = identifier;
        this.timestamp = timestamp;
    }

    /**
     * @return {@link #identifier} (An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.). This is the underlying object with id, value and extensions. The accessor "getIdentifier" gives direct access to the value
     */
    public UriType getIdentifierElement() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionComponent.identifier");
            else if (Configuration.doAutoCreate())
                // bb
                this.identifier = new UriType();
        return this.identifier;
    }

    public boolean hasIdentifierElement() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.). This is the underlying object with id, value and extensions. The accessor "getIdentifier" gives direct access to the value
     */
    public ValueSetExpansionComponent setIdentifierElement(UriType value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
     */
    public String getIdentifier() {
        return this.identifier == null ? null : this.identifier.getValue();
    }

    /**
     * @param value An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
     */
    public ValueSetExpansionComponent setIdentifier(String value) {
        if (this.identifier == null)
            this.identifier = new UriType();
        this.identifier.setValue(value);
        return this;
    }

    /**
     * @return {@link #timestamp} (The time at which the expansion was produced by the expanding system.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public DateTimeType getTimestampElement() {
        if (this.timestamp == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionComponent.timestamp");
            else if (Configuration.doAutoCreate())
                // bb
                this.timestamp = new DateTimeType();
        return this.timestamp;
    }

    public boolean hasTimestampElement() {
        return this.timestamp != null && !this.timestamp.isEmpty();
    }

    public boolean hasTimestamp() {
        return this.timestamp != null && !this.timestamp.isEmpty();
    }

    /**
     * @param value {@link #timestamp} (The time at which the expansion was produced by the expanding system.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public ValueSetExpansionComponent setTimestampElement(DateTimeType value) {
        this.timestamp = value;
        return this;
    }

    /**
     * @return The time at which the expansion was produced by the expanding system.
     */
    public Date getTimestamp() {
        return this.timestamp == null ? null : this.timestamp.getValue();
    }

    /**
     * @param value The time at which the expansion was produced by the expanding system.
     */
    public ValueSetExpansionComponent setTimestamp(Date value) {
        if (this.timestamp == null)
            this.timestamp = new DateTimeType();
        this.timestamp.setValue(value);
        return this;
    }

    /**
     * @return {@link #total} (The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public IntegerType getTotalElement() {
        if (this.total == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionComponent.total");
            else if (Configuration.doAutoCreate())
                // bb
                this.total = new IntegerType();
        return this.total;
    }

    public boolean hasTotalElement() {
        return this.total != null && !this.total.isEmpty();
    }

    public boolean hasTotal() {
        return this.total != null && !this.total.isEmpty();
    }

    /**
     * @param value {@link #total} (The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public ValueSetExpansionComponent setTotalElement(IntegerType value) {
        this.total = value;
        return this;
    }

    /**
     * @return The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
     */
    public int getTotal() {
        return this.total == null || this.total.isEmpty() ? 0 : this.total.getValue();
    }

    /**
     * @param value The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
     */
    public ValueSetExpansionComponent setTotal(int value) {
        if (this.total == null)
            this.total = new IntegerType();
        this.total.setValue(value);
        return this;
    }

    /**
     * @return {@link #offset} (If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.). This is the underlying object with id, value and extensions. The accessor "getOffset" gives direct access to the value
     */
    public IntegerType getOffsetElement() {
        if (this.offset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionComponent.offset");
            else if (Configuration.doAutoCreate())
                // bb
                this.offset = new IntegerType();
        return this.offset;
    }

    public boolean hasOffsetElement() {
        return this.offset != null && !this.offset.isEmpty();
    }

    public boolean hasOffset() {
        return this.offset != null && !this.offset.isEmpty();
    }

    /**
     * @param value {@link #offset} (If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.). This is the underlying object with id, value and extensions. The accessor "getOffset" gives direct access to the value
     */
    public ValueSetExpansionComponent setOffsetElement(IntegerType value) {
        this.offset = value;
        return this;
    }

    /**
     * @return If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
     */
    public int getOffset() {
        return this.offset == null || this.offset.isEmpty() ? 0 : this.offset.getValue();
    }

    /**
     * @param value If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
     */
    public ValueSetExpansionComponent setOffset(int value) {
        if (this.offset == null)
            this.offset = new IntegerType();
        this.offset.setValue(value);
        return this;
    }

    /**
     * @return {@link #parameter} (A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.)
     */
    public List<ValueSetExpansionParameterComponent> getParameter() {
        if (this.parameter == null)
            this.parameter = new ArrayList<ValueSetExpansionParameterComponent>();
        return this.parameter;
    }

    public boolean hasParameter() {
        if (this.parameter == null)
            return false;
        for (ValueSetExpansionParameterComponent item : this.parameter) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ValueSetExpansionParameterComponent addParameter() {
        // 3
        ValueSetExpansionParameterComponent t = new ValueSetExpansionParameterComponent();
        if (this.parameter == null)
            this.parameter = new ArrayList<ValueSetExpansionParameterComponent>();
        this.parameter.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetExpansionComponent addParameter(ValueSetExpansionParameterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.parameter == null)
            this.parameter = new ArrayList<ValueSetExpansionParameterComponent>();
        this.parameter.add(t);
        return this;
    }

    /**
     * @return {@link #contains} (The codes that are contained in the value set expansion.)
     */
    public List<ValueSetExpansionContainsComponent> getContains() {
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        return this.contains;
    }

    public boolean hasContains() {
        if (this.contains == null)
            return false;
        for (ValueSetExpansionContainsComponent item : this.contains) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ValueSetExpansionContainsComponent addContains() {
        // 3
        ValueSetExpansionContainsComponent t = new ValueSetExpansionContainsComponent();
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        this.contains.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetExpansionComponent addContains(ValueSetExpansionContainsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contains == null)
            this.contains = new ArrayList<ValueSetExpansionContainsComponent>();
        this.contains.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "uri", "An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("timestamp", "dateTime", "The time at which the expansion was produced by the expanding system.", 0, java.lang.Integer.MAX_VALUE, timestamp));
        childrenList.add(new Property("total", "integer", "The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.", 0, java.lang.Integer.MAX_VALUE, total));
        childrenList.add(new Property("offset", "integer", "If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.", 0, java.lang.Integer.MAX_VALUE, offset));
        childrenList.add(new Property("parameter", "", "A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.", 0, java.lang.Integer.MAX_VALUE, parameter));
        childrenList.add(new Property("contains", "", "The codes that are contained in the value set expansion.", 0, java.lang.Integer.MAX_VALUE, contains));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // UriType
            this.identifier = castToUri(value);
        else if (name.equals("timestamp"))
            // DateTimeType
            this.timestamp = castToDateTime(value);
        else if (name.equals("total"))
            // IntegerType
            this.total = castToInteger(value);
        else if (name.equals("offset"))
            // IntegerType
            this.offset = castToInteger(value);
        else if (name.equals("parameter"))
            this.getParameter().add((ValueSetExpansionParameterComponent) value);
        else if (name.equals("contains"))
            this.getContains().add((ValueSetExpansionContainsComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.identifier");
        } else if (name.equals("timestamp")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.timestamp");
        } else if (name.equals("total")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.total");
        } else if (name.equals("offset")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.offset");
        } else if (name.equals("parameter")) {
            return addParameter();
        } else if (name.equals("contains")) {
            return addContains();
        } else
            return super.addChild(name);
    }

    public ValueSetExpansionComponent copy() {
        ValueSetExpansionComponent dst = new ValueSetExpansionComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.timestamp = timestamp == null ? null : timestamp.copy();
        dst.total = total == null ? null : total.copy();
        dst.offset = offset == null ? null : offset.copy();
        if (parameter != null) {
            dst.parameter = new ArrayList<ValueSetExpansionParameterComponent>();
            for (ValueSetExpansionParameterComponent i : parameter) dst.parameter.add(i.copy());
        }
        ;
        if (contains != null) {
            dst.contains = new ArrayList<ValueSetExpansionContainsComponent>();
            for (ValueSetExpansionContainsComponent i : contains) dst.contains.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSetExpansionComponent))
            return false;
        ValueSetExpansionComponent o = (ValueSetExpansionComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(timestamp, o.timestamp, true) && compareDeep(total, o.total, true) && compareDeep(offset, o.offset, true) && compareDeep(parameter, o.parameter, true) && compareDeep(contains, o.contains, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSetExpansionComponent))
            return false;
        ValueSetExpansionComponent o = (ValueSetExpansionComponent) other;
        return compareValues(identifier, o.identifier, true) && compareValues(timestamp, o.timestamp, true) && compareValues(total, o.total, true) && compareValues(offset, o.offset, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (timestamp == null || timestamp.isEmpty()) && (total == null || total.isEmpty()) && (offset == null || offset.isEmpty()) && (parameter == null || parameter.isEmpty()) && (contains == null || contains.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.expansion";
    }
}
