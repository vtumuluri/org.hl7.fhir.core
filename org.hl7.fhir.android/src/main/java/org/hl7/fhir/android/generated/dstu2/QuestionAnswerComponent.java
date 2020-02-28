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

public class QuestionAnswerComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The answer (or one of the answers) provided by the respondent to the question.
     */
    protected Type value;

    /**
     * Nested group, containing nested question for this question. The order of groups within the question is relevant.
     */
    protected List<GroupComponent> group;

    private static final long serialVersionUID = -1223680118L;

    /*
     * Constructor
     */
    public QuestionAnswerComponent() {
        super();
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public Type getValue() {
        return this.value;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public BooleanType getValueBooleanType() throws FHIRException {
        if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (BooleanType) this.value;
    }

    public boolean hasValueBooleanType() {
        return this.value instanceof BooleanType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public DecimalType getValueDecimalType() throws FHIRException {
        if (!(this.value instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DecimalType) this.value;
    }

    public boolean hasValueDecimalType() {
        return this.value instanceof DecimalType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public IntegerType getValueIntegerType() throws FHIRException {
        if (!(this.value instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (IntegerType) this.value;
    }

    public boolean hasValueIntegerType() {
        return this.value instanceof IntegerType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public DateType getValueDateType() throws FHIRException {
        if (!(this.value instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DateType) this.value;
    }

    public boolean hasValueDateType() {
        return this.value instanceof DateType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public DateTimeType getValueDateTimeType() throws FHIRException {
        if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DateTimeType) this.value;
    }

    public boolean hasValueDateTimeType() {
        return this.value instanceof DateTimeType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public InstantType getValueInstantType() throws FHIRException {
        if (!(this.value instanceof InstantType))
            throw new FHIRException("Type mismatch: the type InstantType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (InstantType) this.value;
    }

    public boolean hasValueInstantType() {
        return this.value instanceof InstantType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public TimeType getValueTimeType() throws FHIRException {
        if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (TimeType) this.value;
    }

    public boolean hasValueTimeType() {
        return this.value instanceof TimeType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public StringType getValueStringType() throws FHIRException {
        if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (StringType) this.value;
    }

    public boolean hasValueStringType() {
        return this.value instanceof StringType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public UriType getValueUriType() throws FHIRException {
        if (!(this.value instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (UriType) this.value;
    }

    public boolean hasValueUriType() {
        return this.value instanceof UriType;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public Attachment getValueAttachment() throws FHIRException {
        if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Attachment) this.value;
    }

    public boolean hasValueAttachment() {
        return this.value instanceof Attachment;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public Coding getValueCoding() throws FHIRException {
        if (!(this.value instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Coding) this.value;
    }

    public boolean hasValueCoding() {
        return this.value instanceof Coding;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public Quantity getValueQuantity() throws FHIRException {
        if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Quantity) this.value;
    }

    public boolean hasValueQuantity() {
        return this.value instanceof Quantity;
    }

    /**
     * @return {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public Reference getValueReference() throws FHIRException {
        if (!(this.value instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Reference) this.value;
    }

    public boolean hasValueReference() {
        return this.value instanceof Reference;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The answer (or one of the answers) provided by the respondent to the question.)
     */
    public QuestionAnswerComponent setValue(Type value) {
        this.value = value;
        return this;
    }

    /**
     * @return {@link #group} (Nested group, containing nested question for this question. The order of groups within the question is relevant.)
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
    public QuestionAnswerComponent addGroup(GroupComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.group == null)
            this.group = new ArrayList<GroupComponent>();
        this.group.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("value[x]", "boolean|decimal|integer|date|dateTime|instant|time|string|uri|Attachment|Coding|Quantity|Reference(Any)", "The answer (or one of the answers) provided by the respondent to the question.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("group", "@QuestionnaireResponse.group", "Nested group, containing nested question for this question. The order of groups within the question is relevant.", 0, java.lang.Integer.MAX_VALUE, group));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("value[x]"))
            // Type
            this.value = (Type) value;
        else if (name.equals("group"))
            this.getGroup().add((GroupComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("valueBoolean")) {
            this.value = new BooleanType();
            return this.value;
        } else if (name.equals("valueDecimal")) {
            this.value = new DecimalType();
            return this.value;
        } else if (name.equals("valueInteger")) {
            this.value = new IntegerType();
            return this.value;
        } else if (name.equals("valueDate")) {
            this.value = new DateType();
            return this.value;
        } else if (name.equals("valueDateTime")) {
            this.value = new DateTimeType();
            return this.value;
        } else if (name.equals("valueInstant")) {
            this.value = new InstantType();
            return this.value;
        } else if (name.equals("valueTime")) {
            this.value = new TimeType();
            return this.value;
        } else if (name.equals("valueString")) {
            this.value = new StringType();
            return this.value;
        } else if (name.equals("valueUri")) {
            this.value = new UriType();
            return this.value;
        } else if (name.equals("valueAttachment")) {
            this.value = new Attachment();
            return this.value;
        } else if (name.equals("valueCoding")) {
            this.value = new Coding();
            return this.value;
        } else if (name.equals("valueQuantity")) {
            this.value = new Quantity();
            return this.value;
        } else if (name.equals("valueReference")) {
            this.value = new Reference();
            return this.value;
        } else if (name.equals("group")) {
            return addGroup();
        } else
            return super.addChild(name);
    }

    public QuestionAnswerComponent copy() {
        QuestionAnswerComponent dst = new QuestionAnswerComponent();
        copyValues(dst);
        dst.value = value == null ? null : value.copy();
        if (group != null) {
            dst.group = new ArrayList<GroupComponent>();
            for (GroupComponent i : group) dst.group.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof QuestionAnswerComponent))
            return false;
        QuestionAnswerComponent o = (QuestionAnswerComponent) other;
        return compareDeep(value, o.value, true) && compareDeep(group, o.group, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof QuestionAnswerComponent))
            return false;
        QuestionAnswerComponent o = (QuestionAnswerComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (value == null || value.isEmpty()) && (group == null || group.isEmpty());
    }

    public String fhirType() {
        return "QuestionnaireResponse.group.question.answer";
    }
}
