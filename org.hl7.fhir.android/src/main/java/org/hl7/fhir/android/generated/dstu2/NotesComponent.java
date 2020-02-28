package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class NotesComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The note purpose: Print/Display.
     */
    protected Coding type;

    /**
     * The note text.
     */
    protected StringType text;

    private static final long serialVersionUID = 129959202L;

    /*
     * Constructor
     */
    public NotesComponent() {
        super();
    }

    /**
     * @return {@link #type} (The note purpose: Print/Display.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NotesComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The note purpose: Print/Display.)
     */
    public NotesComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #text} (The note text.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NotesComponent.text");
            else if (Configuration.doAutoCreate())
                // bb
                this.text = new StringType();
        return this.text;
    }

    public boolean hasTextElement() {
        return this.text != null && !this.text.isEmpty();
    }

    public boolean hasText() {
        return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (The note text.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public NotesComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return The note text.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value The note text.
     */
    public NotesComponent setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "The note purpose: Print/Display.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("text", "string", "The note text.", 0, java.lang.Integer.MAX_VALUE, text));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type PaymentReconciliation.text");
        } else
            return super.addChild(name);
    }

    public NotesComponent copy() {
        NotesComponent dst = new NotesComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.text = text == null ? null : text.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NotesComponent))
            return false;
        NotesComponent o = (NotesComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(text, o.text, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NotesComponent))
            return false;
        NotesComponent o = (NotesComponent) other;
        return compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (text == null || text.isEmpty());
    }

    public String fhirType() {
        return "PaymentReconciliation.note";
    }
}
