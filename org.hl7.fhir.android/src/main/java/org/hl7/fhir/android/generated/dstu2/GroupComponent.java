package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatusEnumFactory;

public class GroupComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     */
    protected StringType linkId;

    /**
     * Text that is displayed above the contents of the group.
     */
    protected StringType title;

    /**
     * Additional text for the group, used for display purposes.
     */
    protected StringType text;

    /**
     * More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.)
     */
    protected Resource subjectTarget;

    /**
     * A sub-group within a group. The ordering of groups within this group is relevant.
     */
    protected List<GroupComponent> group;

    /**
     * Set of questions within this group. The order of questions within the group is relevant.
     */
    protected List<QuestionComponent> question;

    private static final long serialVersionUID = -1045990435L;

    /*
     * Constructor
     */
    public GroupComponent() {
        super();
    }

    /**
     * @return {@link #linkId} (Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
     */
    public StringType getLinkIdElement() {
        if (this.linkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupComponent.linkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.linkId = new StringType();
        return this.linkId;
    }

    public boolean hasLinkIdElement() {
        return this.linkId != null && !this.linkId.isEmpty();
    }

    public boolean hasLinkId() {
        return this.linkId != null && !this.linkId.isEmpty();
    }

    /**
     * @param value {@link #linkId} (Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
     */
    public GroupComponent setLinkIdElement(StringType value) {
        this.linkId = value;
        return this;
    }

    /**
     * @return Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     */
    public String getLinkId() {
        return this.linkId == null ? null : this.linkId.getValue();
    }

    /**
     * @param value Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     */
    public GroupComponent setLinkId(String value) {
        if (Utilities.noString(value))
            this.linkId = null;
        else {
            if (this.linkId == null)
                this.linkId = new StringType();
            this.linkId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #title} (Text that is displayed above the contents of the group.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupComponent.title");
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
     * @param value {@link #title} (Text that is displayed above the contents of the group.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public GroupComponent setTitleElement(StringType value) {
        this.title = value;
        return this;
    }

    /**
     * @return Text that is displayed above the contents of the group.
     */
    public String getTitle() {
        return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Text that is displayed above the contents of the group.
     */
    public GroupComponent setTitle(String value) {
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
     * @return {@link #text} (Additional text for the group, used for display purposes.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupComponent.text");
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
     * @param value {@link #text} (Additional text for the group, used for display purposes.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public GroupComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return Additional text for the group, used for display purposes.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value Additional text for the group, used for display purposes.
     */
    public GroupComponent setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #subject} (More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupComponent.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.)
     */
    public GroupComponent setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.)
     */
    public GroupComponent setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #group} (A sub-group within a group. The ordering of groups within this group is relevant.)
     */
    public List<GroupComponent> getGroup() {
        if (this.group == null)
            this.group = new ArrayList<GroupComponent>();
        return this.group;
    }

    public boolean hasGroup() {
        if (this.group == null)
            return false;
        for (GroupComponent item : this.group) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public GroupComponent addGroup() {
        // 3
        GroupComponent t = new GroupComponent();
        if (this.group == null)
            this.group = new ArrayList<GroupComponent>();
        this.group.add(t);
        return t;
    }

    // syntactic sugar
    public GroupComponent addGroup(GroupComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.group == null)
            this.group = new ArrayList<GroupComponent>();
        this.group.add(t);
        return this;
    }

    /**
     * @return {@link #question} (Set of questions within this group. The order of questions within the group is relevant.)
     */
    public List<QuestionComponent> getQuestion() {
        if (this.question == null)
            this.question = new ArrayList<QuestionComponent>();
        return this.question;
    }

    public boolean hasQuestion() {
        if (this.question == null)
            return false;
        for (QuestionComponent item : this.question) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public QuestionComponent addQuestion() {
        // 3
        QuestionComponent t = new QuestionComponent();
        if (this.question == null)
            this.question = new ArrayList<QuestionComponent>();
        this.question.add(t);
        return t;
    }

    // syntactic sugar
    public GroupComponent addQuestion(QuestionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.question == null)
            this.question = new ArrayList<QuestionComponent>();
        this.question.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("linkId", "string", "Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.", 0, java.lang.Integer.MAX_VALUE, linkId));
        childrenList.add(new Property("title", "string", "Text that is displayed above the contents of the group.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("text", "string", "Additional text for the group, used for display purposes.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("subject", "Reference(Any)", "More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("group", "@QuestionnaireResponse.group", "A sub-group within a group. The ordering of groups within this group is relevant.", 0, java.lang.Integer.MAX_VALUE, group));
        childrenList.add(new Property("question", "", "Set of questions within this group. The order of questions within the group is relevant.", 0, java.lang.Integer.MAX_VALUE, question));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("linkId"))
            // StringType
            this.linkId = castToString(value);
        else if (name.equals("title"))
            // StringType
            this.title = castToString(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("group"))
            this.getGroup().add((GroupComponent) value);
        else if (name.equals("question"))
            this.getQuestion().add((QuestionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("linkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.linkId");
        } else if (name.equals("title")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.title");
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.text");
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("group")) {
            return addGroup();
        } else if (name.equals("question")) {
            return addQuestion();
        } else
            return super.addChild(name);
    }

    public GroupComponent copy() {
        GroupComponent dst = new GroupComponent();
        copyValues(dst);
        dst.linkId = linkId == null ? null : linkId.copy();
        dst.title = title == null ? null : title.copy();
        dst.text = text == null ? null : text.copy();
        dst.subject = subject == null ? null : subject.copy();
        if (group != null) {
            dst.group = new ArrayList<GroupComponent>();
            for (GroupComponent i : group) dst.group.add(i.copy());
        }
        ;
        if (question != null) {
            dst.question = new ArrayList<QuestionComponent>();
            for (QuestionComponent i : question) dst.question.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof GroupComponent))
            return false;
        GroupComponent o = (GroupComponent) other;
        return compareDeep(linkId, o.linkId, true) && compareDeep(title, o.title, true) && compareDeep(text, o.text, true) && compareDeep(subject, o.subject, true) && compareDeep(group, o.group, true) && compareDeep(question, o.question, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof GroupComponent))
            return false;
        GroupComponent o = (GroupComponent) other;
        return compareValues(linkId, o.linkId, true) && compareValues(title, o.title, true) && compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (linkId == null || linkId.isEmpty()) && (title == null || title.isEmpty()) && (text == null || text.isEmpty()) && (subject == null || subject.isEmpty()) && (group == null || group.isEmpty()) && (question == null || question.isEmpty());
    }

    public String fhirType() {
        return "QuestionnaireResponse.group";
    }
}
