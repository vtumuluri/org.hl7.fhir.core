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

public class ConformanceMessagingEventComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A coded identifier of a supported messaging event.
     */
    protected Coding code;

    /**
     * The impact of the content of the message.
     */
    protected Enumeration<MessageSignificanceCategory> category;

    /**
     * The mode of this event declaration - whether application is sender or receiver.
     */
    protected Enumeration<ConformanceEventMode> mode;

    /**
     * A resource associated with the event.  This is the resource that defines the event.
     */
    protected CodeType focus;

    /**
     * Information about the request for this event.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (Information about the request for this event.)
     */
    protected StructureDefinition requestTarget;

    /**
     * Information about the response for this event.
     */
    protected Reference response;

    /**
     * The actual object that is the target of the reference (Information about the response for this event.)
     */
    protected StructureDefinition responseTarget;

    /**
     * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
     */
    protected StringType documentation;

    private static final long serialVersionUID = -47031390L;

    /*
     * Constructor
     */
    public ConformanceMessagingEventComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceMessagingEventComponent(Coding code, Enumeration<ConformanceEventMode> mode, CodeType focus, Reference request, Reference response) {
        super();
        this.code = code;
        this.mode = mode;
        this.focus = focus;
        this.request = request;
        this.response = response;
    }

    /**
     * @return {@link #code} (A coded identifier of a supported messaging event.)
     */
    public Coding getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new Coding();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A coded identifier of a supported messaging event.)
     */
    public ConformanceMessagingEventComponent setCode(Coding value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #category} (The impact of the content of the message.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public Enumeration<MessageSignificanceCategory> getCategoryElement() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.category");
            else if (Configuration.doAutoCreate())
                // bb
                this.category = new Enumeration<MessageSignificanceCategory>(new MessageSignificanceCategoryEnumFactory());
        return this.category;
    }

    public boolean hasCategoryElement() {
        return this.category != null && !this.category.isEmpty();
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (The impact of the content of the message.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public ConformanceMessagingEventComponent setCategoryElement(Enumeration<MessageSignificanceCategory> value) {
        this.category = value;
        return this;
    }

    /**
     * @return The impact of the content of the message.
     */
    public MessageSignificanceCategory getCategory() {
        return this.category == null ? null : this.category.getValue();
    }

    /**
     * @param value The impact of the content of the message.
     */
    public ConformanceMessagingEventComponent setCategory(MessageSignificanceCategory value) {
        if (value == null)
            this.category = null;
        else {
            if (this.category == null)
                this.category = new Enumeration<MessageSignificanceCategory>(new MessageSignificanceCategoryEnumFactory());
            this.category.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #mode} (The mode of this event declaration - whether application is sender or receiver.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<ConformanceEventMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<ConformanceEventMode>(new ConformanceEventModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (The mode of this event declaration - whether application is sender or receiver.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public ConformanceMessagingEventComponent setModeElement(Enumeration<ConformanceEventMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return The mode of this event declaration - whether application is sender or receiver.
     */
    public ConformanceEventMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value The mode of this event declaration - whether application is sender or receiver.
     */
    public ConformanceMessagingEventComponent setMode(ConformanceEventMode value) {
        if (this.mode == null)
            this.mode = new Enumeration<ConformanceEventMode>(new ConformanceEventModeEnumFactory());
        this.mode.setValue(value);
        return this;
    }

    /**
     * @return {@link #focus} (A resource associated with the event.  This is the resource that defines the event.). This is the underlying object with id, value and extensions. The accessor "getFocus" gives direct access to the value
     */
    public CodeType getFocusElement() {
        if (this.focus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.focus");
            else if (Configuration.doAutoCreate())
                // bb
                this.focus = new CodeType();
        return this.focus;
    }

    public boolean hasFocusElement() {
        return this.focus != null && !this.focus.isEmpty();
    }

    public boolean hasFocus() {
        return this.focus != null && !this.focus.isEmpty();
    }

    /**
     * @param value {@link #focus} (A resource associated with the event.  This is the resource that defines the event.). This is the underlying object with id, value and extensions. The accessor "getFocus" gives direct access to the value
     */
    public ConformanceMessagingEventComponent setFocusElement(CodeType value) {
        this.focus = value;
        return this;
    }

    /**
     * @return A resource associated with the event.  This is the resource that defines the event.
     */
    public String getFocus() {
        return this.focus == null ? null : this.focus.getValue();
    }

    /**
     * @param value A resource associated with the event.  This is the resource that defines the event.
     */
    public ConformanceMessagingEventComponent setFocus(String value) {
        if (this.focus == null)
            this.focus = new CodeType();
        this.focus.setValue(value);
        return this;
    }

    /**
     * @return {@link #request} (Information about the request for this event.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Information about the request for this event.)
     */
    public ConformanceMessagingEventComponent setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Information about the request for this event.)
     */
    public StructureDefinition getRequestTarget() {
        if (this.requestTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.request");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestTarget = new StructureDefinition();
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Information about the request for this event.)
     */
    public ConformanceMessagingEventComponent setRequestTarget(StructureDefinition value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #response} (Information about the response for this event.)
     */
    public Reference getResponse() {
        if (this.response == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.response");
            else if (Configuration.doAutoCreate())
                // cc
                this.response = new Reference();
        return this.response;
    }

    public boolean hasResponse() {
        return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (Information about the response for this event.)
     */
    public ConformanceMessagingEventComponent setResponse(Reference value) {
        this.response = value;
        return this;
    }

    /**
     * @return {@link #response} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Information about the response for this event.)
     */
    public StructureDefinition getResponseTarget() {
        if (this.responseTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.response");
            else if (Configuration.doAutoCreate())
                // aa
                this.responseTarget = new StructureDefinition();
        return this.responseTarget;
    }

    /**
     * @param value {@link #response} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Information about the response for this event.)
     */
    public ConformanceMessagingEventComponent setResponseTarget(StructureDefinition value) {
        this.responseTarget = value;
        return this;
    }

    /**
     * @return {@link #documentation} (Guidance on how this event is handled, such as internal system trigger points, business rules, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.documentation");
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
     * @param value {@link #documentation} (Guidance on how this event is handled, such as internal system trigger points, business rules, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public ConformanceMessagingEventComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
     */
    public ConformanceMessagingEventComponent setDocumentation(String value) {
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
        childrenList.add(new Property("code", "Coding", "A coded identifier of a supported messaging event.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("category", "code", "The impact of the content of the message.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("mode", "code", "The mode of this event declaration - whether application is sender or receiver.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("focus", "code", "A resource associated with the event.  This is the resource that defines the event.", 0, java.lang.Integer.MAX_VALUE, focus));
        childrenList.add(new Property("request", "Reference(StructureDefinition)", "Information about the request for this event.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("response", "Reference(StructureDefinition)", "Information about the response for this event.", 0, java.lang.Integer.MAX_VALUE, response));
        childrenList.add(new Property("documentation", "string", "Guidance on how this event is handled, such as internal system trigger points, business rules, etc.", 0, java.lang.Integer.MAX_VALUE, documentation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // Coding
            this.code = castToCoding(value);
        else if (name.equals("category"))
            // Enumeration<MessageSignificanceCategory>
            this.category = new MessageSignificanceCategoryEnumFactory().fromType(value);
        else if (name.equals("mode"))
            // Enumeration<ConformanceEventMode>
            this.mode = new ConformanceEventModeEnumFactory().fromType(value);
        else if (name.equals("focus"))
            // CodeType
            this.focus = castToCode(value);
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("response"))
            // Reference
            this.response = castToReference(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new Coding();
            return this.code;
        } else if (name.equals("category")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.category");
        } else if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.mode");
        } else if (name.equals("focus")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.focus");
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("response")) {
            this.response = new Reference();
            return this.response;
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else
            return super.addChild(name);
    }

    public ConformanceMessagingEventComponent copy() {
        ConformanceMessagingEventComponent dst = new ConformanceMessagingEventComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.category = category == null ? null : category.copy();
        dst.mode = mode == null ? null : mode.copy();
        dst.focus = focus == null ? null : focus.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceMessagingEventComponent))
            return false;
        ConformanceMessagingEventComponent o = (ConformanceMessagingEventComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(category, o.category, true) && compareDeep(mode, o.mode, true) && compareDeep(focus, o.focus, true) && compareDeep(request, o.request, true) && compareDeep(response, o.response, true) && compareDeep(documentation, o.documentation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceMessagingEventComponent))
            return false;
        ConformanceMessagingEventComponent o = (ConformanceMessagingEventComponent) other;
        return compareValues(category, o.category, true) && compareValues(mode, o.mode, true) && compareValues(focus, o.focus, true) && compareValues(documentation, o.documentation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (category == null || category.isEmpty()) && (mode == null || mode.isEmpty()) && (focus == null || focus.isEmpty()) && (request == null || request.isEmpty()) && (response == null || response.isEmpty()) && (documentation == null || documentation.isEmpty());
    }

    public String fhirType() {
        return "Conformance.messaging.event";
    }
}
