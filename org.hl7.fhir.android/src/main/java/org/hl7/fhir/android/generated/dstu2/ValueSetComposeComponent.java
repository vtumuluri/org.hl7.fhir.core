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

public class ValueSetComposeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.
     */
    protected List<UriType> import_;

    /**
     * Include one or more codes from a code system.
     */
    protected List<ConceptSetComponent> include;

    /**
     * Exclude one or more codes from the value set.
     */
    protected List<ConceptSetComponent> exclude;

    private static final long serialVersionUID = -703166694L;

    /*
     * Constructor
     */
    public ValueSetComposeComponent() {
        super();
    }

    /**
     * @return {@link #import_} (Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.)
     */
    public List<UriType> getImport() {
        if (this.import_ == null)
            this.import_ = new ArrayList<UriType>();
        return this.import_;
    }

    public boolean hasImport() {
        if (this.import_ == null)
            return false;
        for (UriType item : this.import_) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UriType addImportElement() {
        // 2
        UriType t = new UriType();
        if (this.import_ == null)
            this.import_ = new ArrayList<UriType>();
        this.import_.add(t);
        return t;
    }

    /**
     * @param value {@link #import_} (Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.)
     */
    public ValueSetComposeComponent addImport(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.import_ == null)
            this.import_ = new ArrayList<UriType>();
        this.import_.add(t);
        return this;
    }

    /**
     * @param value {@link #import_} (Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.)
     */
    public boolean hasImport(String value) {
        if (this.import_ == null)
            return false;
        for (UriType v : this.import_) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #include} (Include one or more codes from a code system.)
     */
    public List<ConceptSetComponent> getInclude() {
        if (this.include == null)
            this.include = new ArrayList<ConceptSetComponent>();
        return this.include;
    }

    public boolean hasInclude() {
        if (this.include == null)
            return false;
        for (ConceptSetComponent item : this.include) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptSetComponent addInclude() {
        // 3
        ConceptSetComponent t = new ConceptSetComponent();
        if (this.include == null)
            this.include = new ArrayList<ConceptSetComponent>();
        this.include.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetComposeComponent addInclude(ConceptSetComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.include == null)
            this.include = new ArrayList<ConceptSetComponent>();
        this.include.add(t);
        return this;
    }

    /**
     * @return {@link #exclude} (Exclude one or more codes from the value set.)
     */
    public List<ConceptSetComponent> getExclude() {
        if (this.exclude == null)
            this.exclude = new ArrayList<ConceptSetComponent>();
        return this.exclude;
    }

    public boolean hasExclude() {
        if (this.exclude == null)
            return false;
        for (ConceptSetComponent item : this.exclude) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptSetComponent addExclude() {
        // 3
        ConceptSetComponent t = new ConceptSetComponent();
        if (this.exclude == null)
            this.exclude = new ArrayList<ConceptSetComponent>();
        this.exclude.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetComposeComponent addExclude(ConceptSetComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.exclude == null)
            this.exclude = new ArrayList<ConceptSetComponent>();
        this.exclude.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("import", "uri", "Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.", 0, java.lang.Integer.MAX_VALUE, import_));
        childrenList.add(new Property("include", "", "Include one or more codes from a code system.", 0, java.lang.Integer.MAX_VALUE, include));
        childrenList.add(new Property("exclude", "@ValueSet.compose.include", "Exclude one or more codes from the value set.", 0, java.lang.Integer.MAX_VALUE, exclude));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("import"))
            this.getImport().add(castToUri(value));
        else if (name.equals("include"))
            this.getInclude().add((ConceptSetComponent) value);
        else if (name.equals("exclude"))
            this.getExclude().add((ConceptSetComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("import")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.import");
        } else if (name.equals("include")) {
            return addInclude();
        } else if (name.equals("exclude")) {
            return addExclude();
        } else
            return super.addChild(name);
    }

    public ValueSetComposeComponent copy() {
        ValueSetComposeComponent dst = new ValueSetComposeComponent();
        copyValues(dst);
        if (import_ != null) {
            dst.import_ = new ArrayList<UriType>();
            for (UriType i : import_) dst.import_.add(i.copy());
        }
        ;
        if (include != null) {
            dst.include = new ArrayList<ConceptSetComponent>();
            for (ConceptSetComponent i : include) dst.include.add(i.copy());
        }
        ;
        if (exclude != null) {
            dst.exclude = new ArrayList<ConceptSetComponent>();
            for (ConceptSetComponent i : exclude) dst.exclude.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSetComposeComponent))
            return false;
        ValueSetComposeComponent o = (ValueSetComposeComponent) other;
        return compareDeep(import_, o.import_, true) && compareDeep(include, o.include, true) && compareDeep(exclude, o.exclude, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSetComposeComponent))
            return false;
        ValueSetComposeComponent o = (ValueSetComposeComponent) other;
        return compareValues(import_, o.import_, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (import_ == null || import_.isEmpty()) && (include == null || include.isEmpty()) && (exclude == null || exclude.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.compose";
    }
}
