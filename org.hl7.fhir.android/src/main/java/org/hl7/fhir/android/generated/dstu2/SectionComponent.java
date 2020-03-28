package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatus;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationMode;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationModeEnumFactory;

public class SectionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
     */
    protected StringType title;

    /**
     * A code identifying the kind of content contained within the section. This must be consistent with the section title.
     */
    protected CodeableConcept code;

    /**
     * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
     */
    protected Narrative text;

    /**
     * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    protected CodeType mode;

    /**
     * Specifies the order applied to the items in the section entries.
     */
    protected CodeableConcept orderedBy;

    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     */
    protected List<Reference> entry;

    /**
     * The actual objects that are the target of the reference (A reference to the actual resource from which the narrative in the section is derived.)
     */
    protected List<Resource> entryTarget;

    /**
     * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
     */
    protected CodeableConcept emptyReason;

    /**
     * A nested sub-section within this section.
     */
    protected List<SectionComponent> section;

    private static final long serialVersionUID = -726390626L;

    /*
     * Constructor
     */
    public SectionComponent() {
        super();
    }

    /**
     * @return {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.title");
            else if (Configuration.doAutoCreate())
                // bb
                this.title = new StringType();
        return this.title;
    }

    public boolean hasTitleElement() {
        return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
        return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public SectionComponent setTitleElement(StringType value) {
        this.title = value;
        return this;
    }

    /**
     * @return The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
     */
    public String getTitle() {
        return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
     */
    public SectionComponent setTitle(String value) {
        if (Utilities.noString(value))
            this.title = null;
        else {
            if (this.title == null)
                this.title = new StringType();
            this.title.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
     */
    public SectionComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
     */
    public Narrative getText() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.text");
            else if (Configuration.doAutoCreate())
                // cc
                this.text = new Narrative();
        return this.text;
    }

    public boolean hasText() {
        return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
     */
    public SectionComponent setText(Narrative value) {
        this.text = value;
        return this;
    }

    /**
     * @return {@link #mode} (How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public CodeType getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new CodeType();
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public SectionComponent setModeElement(CodeType value) {
        this.mode = value;
        return this;
    }

    /**
     * @return How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    public String getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    public SectionComponent setMode(String value) {
        if (Utilities.noString(value))
            this.mode = null;
        else {
            if (this.mode == null)
                this.mode = new CodeType();
            this.mode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
     */
    public CodeableConcept getOrderedBy() {
        if (this.orderedBy == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.orderedBy");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderedBy = new CodeableConcept();
        return this.orderedBy;
    }

    public boolean hasOrderedBy() {
        return this.orderedBy != null && !this.orderedBy.isEmpty();
    }

    /**
     * @param value {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
     */
    public SectionComponent setOrderedBy(CodeableConcept value) {
        this.orderedBy = value;
        return this;
    }

    /**
     * @return {@link #entry} (A reference to the actual resource from which the narrative in the section is derived.)
     */
    public List<Reference> getEntry() {
        if (this.entry == null)
            this.entry = new ArrayList<Reference>();
        return this.entry;
    }

    public boolean hasEntry() {
        if (this.entry == null)
            return false;
        for (Reference item : this.entry) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addEntry() {
        // 3
        Reference t = new Reference();
        if (this.entry == null)
            this.entry = new ArrayList<Reference>();
        this.entry.add(t);
        return t;
    }

    // syntactic sugar
    public SectionComponent addEntry(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.entry == null)
            this.entry = new ArrayList<Reference>();
        this.entry.add(t);
        return this;
    }

    /**
     * @return {@link #entry} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A reference to the actual resource from which the narrative in the section is derived.)
     */
    public List<Resource> getEntryTarget() {
        if (this.entryTarget == null)
            this.entryTarget = new ArrayList<Resource>();
        return this.entryTarget;
    }

    /**
     * @return {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
     */
    public CodeableConcept getEmptyReason() {
        if (this.emptyReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SectionComponent.emptyReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.emptyReason = new CodeableConcept();
        return this.emptyReason;
    }

    public boolean hasEmptyReason() {
        return this.emptyReason != null && !this.emptyReason.isEmpty();
    }

    /**
     * @param value {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
     */
    public SectionComponent setEmptyReason(CodeableConcept value) {
        this.emptyReason = value;
        return this;
    }

    /**
     * @return {@link #section} (A nested sub-section within this section.)
     */
    public List<SectionComponent> getSection() {
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        return this.section;
    }

    public boolean hasSection() {
        if (this.section == null)
            return false;
        for (SectionComponent item : this.section) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SectionComponent addSection() {
        // 3
        SectionComponent t = new SectionComponent();
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        this.section.add(t);
        return t;
    }

    // syntactic sugar
    public SectionComponent addSection(SectionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        this.section.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("title", "string", "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("code", "CodeableConcept", "A code identifying the kind of content contained within the section. This must be consistent with the section title.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("text", "Narrative", "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("mode", "code", "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("orderedBy", "CodeableConcept", "Specifies the order applied to the items in the section entries.", 0, java.lang.Integer.MAX_VALUE, orderedBy));
        childrenList.add(new Property("entry", "Reference(Any)", "A reference to the actual resource from which the narrative in the section is derived.", 0, java.lang.Integer.MAX_VALUE, entry));
        childrenList.add(new Property("emptyReason", "CodeableConcept", "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.", 0, java.lang.Integer.MAX_VALUE, emptyReason));
        childrenList.add(new Property("section", "@Composition.section", "A nested sub-section within this section.", 0, java.lang.Integer.MAX_VALUE, section));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("title"))
            // StringType
            this.title = castToString(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("text"))
            // Narrative
            this.text = castToNarrative(value);
        else if (name.equals("mode"))
            // CodeType
            this.mode = castToCode(value);
        else if (name.equals("orderedBy"))
            // CodeableConcept
            this.orderedBy = castToCodeableConcept(value);
        else if (name.equals("entry"))
            this.getEntry().add(castToReference(value));
        else if (name.equals("emptyReason"))
            // CodeableConcept
            this.emptyReason = castToCodeableConcept(value);
        else if (name.equals("section"))
            this.getSection().add((SectionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("title")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.title");
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("text")) {
            this.text = new Narrative();
            return this.text;
        } else if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.mode");
        } else if (name.equals("orderedBy")) {
            this.orderedBy = new CodeableConcept();
            return this.orderedBy;
        } else if (name.equals("entry")) {
            return addEntry();
        } else if (name.equals("emptyReason")) {
            this.emptyReason = new CodeableConcept();
            return this.emptyReason;
        } else if (name.equals("section")) {
            return addSection();
        } else
            return super.addChild(name);
    }

    public SectionComponent copy() {
        SectionComponent dst = new SectionComponent();
        copyValues(dst);
        dst.title = title == null ? null : title.copy();
        dst.code = code == null ? null : code.copy();
        dst.text = text == null ? null : text.copy();
        dst.mode = mode == null ? null : mode.copy();
        dst.orderedBy = orderedBy == null ? null : orderedBy.copy();
        if (entry != null) {
            dst.entry = new ArrayList<Reference>();
            for (Reference i : entry) dst.entry.add(i.copy());
        }
        ;
        dst.emptyReason = emptyReason == null ? null : emptyReason.copy();
        if (section != null) {
            dst.section = new ArrayList<SectionComponent>();
            for (SectionComponent i : section) dst.section.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SectionComponent))
            return false;
        SectionComponent o = (SectionComponent) other;
        return compareDeep(title, o.title, true) && compareDeep(code, o.code, true) && compareDeep(text, o.text, true) && compareDeep(mode, o.mode, true) && compareDeep(orderedBy, o.orderedBy, true) && compareDeep(entry, o.entry, true) && compareDeep(emptyReason, o.emptyReason, true) && compareDeep(section, o.section, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SectionComponent))
            return false;
        SectionComponent o = (SectionComponent) other;
        return compareValues(title, o.title, true) && compareValues(mode, o.mode, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (title == null || title.isEmpty()) && (code == null || code.isEmpty()) && (text == null || text.isEmpty()) && (mode == null || mode.isEmpty()) && (orderedBy == null || orderedBy.isEmpty()) && (entry == null || entry.isEmpty()) && (emptyReason == null || emptyReason.isEmpty()) && (section == null || section.isEmpty());
    }

    public String fhirType() {
        return "Composition.section";
    }
}
