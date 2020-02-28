package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatusEnumFactory;

public class QuestionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     */
    protected StringType linkId;

    /**
     * The actual question as shown to the user to prompt them for an answer.
     */
    protected StringType text;

    /**
     * The respondent's answer(s) to the question.
     */
    protected List<QuestionAnswerComponent> answer;

    private static final long serialVersionUID = -265263901L;

    /*
     * Constructor
     */
    public QuestionComponent() {
        super();
    }

    /**
     * @return {@link #linkId} (Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
     */
    public StringType getLinkIdElement() {
        if (this.linkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionComponent.linkId");
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
     * @param value {@link #linkId} (Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
     */
    public QuestionComponent setLinkIdElement(StringType value) {
        this.linkId = value;
        return this;
    }

    /**
     * @return Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     */
    public String getLinkId() {
        return this.linkId == null ? null : this.linkId.getValue();
    }

    /**
     * @param value Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     */
    public QuestionComponent setLinkId(String value) {
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
     * @return {@link #text} (The actual question as shown to the user to prompt them for an answer.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionComponent.text");
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
     * @param value {@link #text} (The actual question as shown to the user to prompt them for an answer.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public QuestionComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return The actual question as shown to the user to prompt them for an answer.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value The actual question as shown to the user to prompt them for an answer.
     */
    public QuestionComponent setText(String value) {
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
     * @return {@link #answer} (The respondent's answer(s) to the question.)
     */
    public List<QuestionAnswerComponent> getAnswer() {
        if (this.answer == null)
            this.answer = new ArrayList<QuestionAnswerComponent>();
        return this.answer;
    }

    public boolean hasAnswer() {
        if (this.answer == null)
            return false;
        for (QuestionAnswerComponent item : this.answer) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public QuestionAnswerComponent addAnswer() {
        // 3
        QuestionAnswerComponent t = new QuestionAnswerComponent();
        if (this.answer == null)
            this.answer = new ArrayList<QuestionAnswerComponent>();
        this.answer.add(t);
        return t;
    }

    // syntactic sugar
    public QuestionComponent addAnswer(QuestionAnswerComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.answer == null)
            this.answer = new ArrayList<QuestionAnswerComponent>();
        this.answer.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("linkId", "string", "Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.", 0, java.lang.Integer.MAX_VALUE, linkId));
        childrenList.add(new Property("text", "string", "The actual question as shown to the user to prompt them for an answer.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("answer", "", "The respondent's answer(s) to the question.", 0, java.lang.Integer.MAX_VALUE, answer));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("linkId"))
            // StringType
            this.linkId = castToString(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("answer"))
            this.getAnswer().add((QuestionAnswerComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("linkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.linkId");
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.text");
        } else if (name.equals("answer")) {
            return addAnswer();
        } else
            return super.addChild(name);
    }

    public QuestionComponent copy() {
        QuestionComponent dst = new QuestionComponent();
        copyValues(dst);
        dst.linkId = linkId == null ? null : linkId.copy();
        dst.text = text == null ? null : text.copy();
        if (answer != null) {
            dst.answer = new ArrayList<QuestionAnswerComponent>();
            for (QuestionAnswerComponent i : answer) dst.answer.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof QuestionComponent))
            return false;
        QuestionComponent o = (QuestionComponent) other;
        return compareDeep(linkId, o.linkId, true) && compareDeep(text, o.text, true) && compareDeep(answer, o.answer, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof QuestionComponent))
            return false;
        QuestionComponent o = (QuestionComponent) other;
        return compareValues(linkId, o.linkId, true) && compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (linkId == null || linkId.isEmpty()) && (text == null || text.isEmpty()) && (answer == null || answer.isEmpty());
    }

    public String fhirType() {
        return "QuestionnaireResponse.group.question";
    }
}
