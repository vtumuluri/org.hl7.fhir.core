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
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;

public class TestScriptSetupActionOperationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Server interaction or operation type.
     */
    protected Coding type;

    /**
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     */
    protected CodeType resource;

    /**
     * The label would be used for tracking/logging purposes by test engines.
     */
    protected StringType label;

    /**
     * The description would be used by test engines for tracking and reporting purposes.
     */
    protected StringType description;

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     */
    protected Enumeration<ContentType> accept;

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     */
    protected Enumeration<ContentType> contentType;

    /**
     * Which server to perform the operation on.
     */
    protected IntegerType destination;

    /**
     * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     */
    protected BooleanType encodeRequestUrl;

    /**
     * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     */
    protected StringType params;

    /**
     * Header elements would be used to set HTTP headers.
     */
    protected List<TestScriptSetupActionOperationRequestHeaderComponent> requestHeader;

    /**
     * The fixture id (maybe new) to map to the response.
     */
    protected IdType responseId;

    /**
     * The id of the fixture used as the body of a PUT or POST request.
     */
    protected IdType sourceId;

    /**
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
     */
    protected IdType targetId;

    /**
     * Complete request URL.
     */
    protected StringType url;

    private static final long serialVersionUID = -590188078L;

    /*
     * Constructor
     */
    public TestScriptSetupActionOperationComponent() {
        super();
    }

    /**
     * @return {@link #type} (Server interaction or operation type.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Server interaction or operation type.)
     */
    public TestScriptSetupActionOperationComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #resource} (The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.). This is the underlying object with id, value and extensions. The accessor "getResource" gives direct access to the value
     */
    public CodeType getResourceElement() {
        if (this.resource == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.resource");
            else if (Configuration.doAutoCreate())
                // bb
                this.resource = new CodeType();
        return this.resource;
    }

    public boolean hasResourceElement() {
        return this.resource != null && !this.resource.isEmpty();
    }

    public boolean hasResource() {
        return this.resource != null && !this.resource.isEmpty();
    }

    /**
     * @param value {@link #resource} (The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.). This is the underlying object with id, value and extensions. The accessor "getResource" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setResourceElement(CodeType value) {
        this.resource = value;
        return this;
    }

    /**
     * @return The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     */
    public String getResource() {
        return this.resource == null ? null : this.resource.getValue();
    }

    /**
     * @param value The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     */
    public TestScriptSetupActionOperationComponent setResource(String value) {
        if (Utilities.noString(value))
            this.resource = null;
        else {
            if (this.resource == null)
                this.resource = new CodeType();
            this.resource.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #label} (The label would be used for tracking/logging purposes by test engines.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public StringType getLabelElement() {
        if (this.label == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.label");
            else if (Configuration.doAutoCreate())
                // bb
                this.label = new StringType();
        return this.label;
    }

    public boolean hasLabelElement() {
        return this.label != null && !this.label.isEmpty();
    }

    public boolean hasLabel() {
        return this.label != null && !this.label.isEmpty();
    }

    /**
     * @param value {@link #label} (The label would be used for tracking/logging purposes by test engines.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setLabelElement(StringType value) {
        this.label = value;
        return this;
    }

    /**
     * @return The label would be used for tracking/logging purposes by test engines.
     */
    public String getLabel() {
        return this.label == null ? null : this.label.getValue();
    }

    /**
     * @param value The label would be used for tracking/logging purposes by test engines.
     */
    public TestScriptSetupActionOperationComponent setLabel(String value) {
        if (Utilities.noString(value))
            this.label = null;
        else {
            if (this.label == null)
                this.label = new StringType();
            this.label.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #description} (The description would be used by test engines for tracking and reporting purposes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (The description would be used by test engines for tracking and reporting purposes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return The description would be used by test engines for tracking and reporting purposes.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value The description would be used by test engines for tracking and reporting purposes.
     */
    public TestScriptSetupActionOperationComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #accept} (The content-type or mime-type to use for RESTful operation in the 'Accept' header.). This is the underlying object with id, value and extensions. The accessor "getAccept" gives direct access to the value
     */
    public Enumeration<ContentType> getAcceptElement() {
        if (this.accept == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.accept");
            else if (Configuration.doAutoCreate())
                // bb
                this.accept = new Enumeration<ContentType>(new ContentTypeEnumFactory());
        return this.accept;
    }

    public boolean hasAcceptElement() {
        return this.accept != null && !this.accept.isEmpty();
    }

    public boolean hasAccept() {
        return this.accept != null && !this.accept.isEmpty();
    }

    /**
     * @param value {@link #accept} (The content-type or mime-type to use for RESTful operation in the 'Accept' header.). This is the underlying object with id, value and extensions. The accessor "getAccept" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setAcceptElement(Enumeration<ContentType> value) {
        this.accept = value;
        return this;
    }

    /**
     * @return The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     */
    public ContentType getAccept() {
        return this.accept == null ? null : this.accept.getValue();
    }

    /**
     * @param value The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     */
    public TestScriptSetupActionOperationComponent setAccept(ContentType value) {
        if (value == null)
            this.accept = null;
        else {
            if (this.accept == null)
                this.accept = new Enumeration<ContentType>(new ContentTypeEnumFactory());
            this.accept.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contentType} (The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.). This is the underlying object with id, value and extensions. The accessor "getContentType" gives direct access to the value
     */
    public Enumeration<ContentType> getContentTypeElement() {
        if (this.contentType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.contentType");
            else if (Configuration.doAutoCreate())
                // bb
                this.contentType = new Enumeration<ContentType>(new ContentTypeEnumFactory());
        return this.contentType;
    }

    public boolean hasContentTypeElement() {
        return this.contentType != null && !this.contentType.isEmpty();
    }

    public boolean hasContentType() {
        return this.contentType != null && !this.contentType.isEmpty();
    }

    /**
     * @param value {@link #contentType} (The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.). This is the underlying object with id, value and extensions. The accessor "getContentType" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setContentTypeElement(Enumeration<ContentType> value) {
        this.contentType = value;
        return this;
    }

    /**
     * @return The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     */
    public ContentType getContentType() {
        return this.contentType == null ? null : this.contentType.getValue();
    }

    /**
     * @param value The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     */
    public TestScriptSetupActionOperationComponent setContentType(ContentType value) {
        if (value == null)
            this.contentType = null;
        else {
            if (this.contentType == null)
                this.contentType = new Enumeration<ContentType>(new ContentTypeEnumFactory());
            this.contentType.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #destination} (Which server to perform the operation on.). This is the underlying object with id, value and extensions. The accessor "getDestination" gives direct access to the value
     */
    public IntegerType getDestinationElement() {
        if (this.destination == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.destination");
            else if (Configuration.doAutoCreate())
                // bb
                this.destination = new IntegerType();
        return this.destination;
    }

    public boolean hasDestinationElement() {
        return this.destination != null && !this.destination.isEmpty();
    }

    public boolean hasDestination() {
        return this.destination != null && !this.destination.isEmpty();
    }

    /**
     * @param value {@link #destination} (Which server to perform the operation on.). This is the underlying object with id, value and extensions. The accessor "getDestination" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setDestinationElement(IntegerType value) {
        this.destination = value;
        return this;
    }

    /**
     * @return Which server to perform the operation on.
     */
    public int getDestination() {
        return this.destination == null || this.destination.isEmpty() ? 0 : this.destination.getValue();
    }

    /**
     * @param value Which server to perform the operation on.
     */
    public TestScriptSetupActionOperationComponent setDestination(int value) {
        if (this.destination == null)
            this.destination = new IntegerType();
        this.destination.setValue(value);
        return this;
    }

    /**
     * @return {@link #encodeRequestUrl} (Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.). This is the underlying object with id, value and extensions. The accessor "getEncodeRequestUrl" gives direct access to the value
     */
    public BooleanType getEncodeRequestUrlElement() {
        if (this.encodeRequestUrl == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.encodeRequestUrl");
            else if (Configuration.doAutoCreate())
                // bb
                this.encodeRequestUrl = new BooleanType();
        return this.encodeRequestUrl;
    }

    public boolean hasEncodeRequestUrlElement() {
        return this.encodeRequestUrl != null && !this.encodeRequestUrl.isEmpty();
    }

    public boolean hasEncodeRequestUrl() {
        return this.encodeRequestUrl != null && !this.encodeRequestUrl.isEmpty();
    }

    /**
     * @param value {@link #encodeRequestUrl} (Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.). This is the underlying object with id, value and extensions. The accessor "getEncodeRequestUrl" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setEncodeRequestUrlElement(BooleanType value) {
        this.encodeRequestUrl = value;
        return this;
    }

    /**
     * @return Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     */
    public boolean getEncodeRequestUrl() {
        return this.encodeRequestUrl == null || this.encodeRequestUrl.isEmpty() ? false : this.encodeRequestUrl.getValue();
    }

    /**
     * @param value Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     */
    public TestScriptSetupActionOperationComponent setEncodeRequestUrl(boolean value) {
        if (this.encodeRequestUrl == null)
            this.encodeRequestUrl = new BooleanType();
        this.encodeRequestUrl.setValue(value);
        return this;
    }

    /**
     * @return {@link #params} (Path plus parameters after [type].  Used to set parts of the request URL explicitly.). This is the underlying object with id, value and extensions. The accessor "getParams" gives direct access to the value
     */
    public StringType getParamsElement() {
        if (this.params == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.params");
            else if (Configuration.doAutoCreate())
                // bb
                this.params = new StringType();
        return this.params;
    }

    public boolean hasParamsElement() {
        return this.params != null && !this.params.isEmpty();
    }

    public boolean hasParams() {
        return this.params != null && !this.params.isEmpty();
    }

    /**
     * @param value {@link #params} (Path plus parameters after [type].  Used to set parts of the request URL explicitly.). This is the underlying object with id, value and extensions. The accessor "getParams" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setParamsElement(StringType value) {
        this.params = value;
        return this;
    }

    /**
     * @return Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     */
    public String getParams() {
        return this.params == null ? null : this.params.getValue();
    }

    /**
     * @param value Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     */
    public TestScriptSetupActionOperationComponent setParams(String value) {
        if (Utilities.noString(value))
            this.params = null;
        else {
            if (this.params == null)
                this.params = new StringType();
            this.params.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #requestHeader} (Header elements would be used to set HTTP headers.)
     */
    public List<TestScriptSetupActionOperationRequestHeaderComponent> getRequestHeader() {
        if (this.requestHeader == null)
            this.requestHeader = new ArrayList<TestScriptSetupActionOperationRequestHeaderComponent>();
        return this.requestHeader;
    }

    public boolean hasRequestHeader() {
        if (this.requestHeader == null)
            return false;
        for (TestScriptSetupActionOperationRequestHeaderComponent item : this.requestHeader) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptSetupActionOperationRequestHeaderComponent addRequestHeader() {
        // 3
        TestScriptSetupActionOperationRequestHeaderComponent t = new TestScriptSetupActionOperationRequestHeaderComponent();
        if (this.requestHeader == null)
            this.requestHeader = new ArrayList<TestScriptSetupActionOperationRequestHeaderComponent>();
        this.requestHeader.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptSetupActionOperationComponent addRequestHeader(TestScriptSetupActionOperationRequestHeaderComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.requestHeader == null)
            this.requestHeader = new ArrayList<TestScriptSetupActionOperationRequestHeaderComponent>();
        this.requestHeader.add(t);
        return this;
    }

    /**
     * @return {@link #responseId} (The fixture id (maybe new) to map to the response.). This is the underlying object with id, value and extensions. The accessor "getResponseId" gives direct access to the value
     */
    public IdType getResponseIdElement() {
        if (this.responseId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.responseId");
            else if (Configuration.doAutoCreate())
                // bb
                this.responseId = new IdType();
        return this.responseId;
    }

    public boolean hasResponseIdElement() {
        return this.responseId != null && !this.responseId.isEmpty();
    }

    public boolean hasResponseId() {
        return this.responseId != null && !this.responseId.isEmpty();
    }

    /**
     * @param value {@link #responseId} (The fixture id (maybe new) to map to the response.). This is the underlying object with id, value and extensions. The accessor "getResponseId" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setResponseIdElement(IdType value) {
        this.responseId = value;
        return this;
    }

    /**
     * @return The fixture id (maybe new) to map to the response.
     */
    public String getResponseId() {
        return this.responseId == null ? null : this.responseId.getValue();
    }

    /**
     * @param value The fixture id (maybe new) to map to the response.
     */
    public TestScriptSetupActionOperationComponent setResponseId(String value) {
        if (Utilities.noString(value))
            this.responseId = null;
        else {
            if (this.responseId == null)
                this.responseId = new IdType();
            this.responseId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #sourceId} (The id of the fixture used as the body of a PUT or POST request.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public IdType getSourceIdElement() {
        if (this.sourceId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.sourceId");
            else if (Configuration.doAutoCreate())
                // bb
                this.sourceId = new IdType();
        return this.sourceId;
    }

    public boolean hasSourceIdElement() {
        return this.sourceId != null && !this.sourceId.isEmpty();
    }

    public boolean hasSourceId() {
        return this.sourceId != null && !this.sourceId.isEmpty();
    }

    /**
     * @param value {@link #sourceId} (The id of the fixture used as the body of a PUT or POST request.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setSourceIdElement(IdType value) {
        this.sourceId = value;
        return this;
    }

    /**
     * @return The id of the fixture used as the body of a PUT or POST request.
     */
    public String getSourceId() {
        return this.sourceId == null ? null : this.sourceId.getValue();
    }

    /**
     * @param value The id of the fixture used as the body of a PUT or POST request.
     */
    public TestScriptSetupActionOperationComponent setSourceId(String value) {
        if (Utilities.noString(value))
            this.sourceId = null;
        else {
            if (this.sourceId == null)
                this.sourceId = new IdType();
            this.sourceId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #targetId} (Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.). This is the underlying object with id, value and extensions. The accessor "getTargetId" gives direct access to the value
     */
    public IdType getTargetIdElement() {
        if (this.targetId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.targetId");
            else if (Configuration.doAutoCreate())
                // bb
                this.targetId = new IdType();
        return this.targetId;
    }

    public boolean hasTargetIdElement() {
        return this.targetId != null && !this.targetId.isEmpty();
    }

    public boolean hasTargetId() {
        return this.targetId != null && !this.targetId.isEmpty();
    }

    /**
     * @param value {@link #targetId} (Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.). This is the underlying object with id, value and extensions. The accessor "getTargetId" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setTargetIdElement(IdType value) {
        this.targetId = value;
        return this;
    }

    /**
     * @return Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
     */
    public String getTargetId() {
        return this.targetId == null ? null : this.targetId.getValue();
    }

    /**
     * @param value Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
     */
    public TestScriptSetupActionOperationComponent setTargetId(String value) {
        if (Utilities.noString(value))
            this.targetId = null;
        else {
            if (this.targetId == null)
                this.targetId = new IdType();
            this.targetId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #url} (Complete request URL.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public StringType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionOperationComponent.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new StringType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (Complete request URL.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public TestScriptSetupActionOperationComponent setUrlElement(StringType value) {
        this.url = value;
        return this;
    }

    /**
     * @return Complete request URL.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value Complete request URL.
     */
    public TestScriptSetupActionOperationComponent setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new StringType();
            this.url.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "Server interaction or operation type.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("resource", "code", "The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.", 0, java.lang.Integer.MAX_VALUE, resource));
        childrenList.add(new Property("label", "string", "The label would be used for tracking/logging purposes by test engines.", 0, java.lang.Integer.MAX_VALUE, label));
        childrenList.add(new Property("description", "string", "The description would be used by test engines for tracking and reporting purposes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("accept", "code", "The content-type or mime-type to use for RESTful operation in the 'Accept' header.", 0, java.lang.Integer.MAX_VALUE, accept));
        childrenList.add(new Property("contentType", "code", "The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.", 0, java.lang.Integer.MAX_VALUE, contentType));
        childrenList.add(new Property("destination", "integer", "Which server to perform the operation on.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("encodeRequestUrl", "boolean", "Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.", 0, java.lang.Integer.MAX_VALUE, encodeRequestUrl));
        childrenList.add(new Property("params", "string", "Path plus parameters after [type].  Used to set parts of the request URL explicitly.", 0, java.lang.Integer.MAX_VALUE, params));
        childrenList.add(new Property("requestHeader", "", "Header elements would be used to set HTTP headers.", 0, java.lang.Integer.MAX_VALUE, requestHeader));
        childrenList.add(new Property("responseId", "id", "The fixture id (maybe new) to map to the response.", 0, java.lang.Integer.MAX_VALUE, responseId));
        childrenList.add(new Property("sourceId", "id", "The id of the fixture used as the body of a PUT or POST request.", 0, java.lang.Integer.MAX_VALUE, sourceId));
        childrenList.add(new Property("targetId", "id", "Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.", 0, java.lang.Integer.MAX_VALUE, targetId));
        childrenList.add(new Property("url", "string", "Complete request URL.", 0, java.lang.Integer.MAX_VALUE, url));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("resource"))
            // CodeType
            this.resource = castToCode(value);
        else if (name.equals("label"))
            // StringType
            this.label = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("accept"))
            // Enumeration<ContentType>
            this.accept = new ContentTypeEnumFactory().fromType(value);
        else if (name.equals("contentType"))
            // Enumeration<ContentType>
            this.contentType = new ContentTypeEnumFactory().fromType(value);
        else if (name.equals("destination"))
            // IntegerType
            this.destination = castToInteger(value);
        else if (name.equals("encodeRequestUrl"))
            // BooleanType
            this.encodeRequestUrl = castToBoolean(value);
        else if (name.equals("params"))
            // StringType
            this.params = castToString(value);
        else if (name.equals("requestHeader"))
            this.getRequestHeader().add((TestScriptSetupActionOperationRequestHeaderComponent) value);
        else if (name.equals("responseId"))
            // IdType
            this.responseId = castToId(value);
        else if (name.equals("sourceId"))
            // IdType
            this.sourceId = castToId(value);
        else if (name.equals("targetId"))
            // IdType
            this.targetId = castToId(value);
        else if (name.equals("url"))
            // StringType
            this.url = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("resource")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.resource");
        } else if (name.equals("label")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.label");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.description");
        } else if (name.equals("accept")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.accept");
        } else if (name.equals("contentType")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.contentType");
        } else if (name.equals("destination")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.destination");
        } else if (name.equals("encodeRequestUrl")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.encodeRequestUrl");
        } else if (name.equals("params")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.params");
        } else if (name.equals("requestHeader")) {
            return addRequestHeader();
        } else if (name.equals("responseId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.responseId");
        } else if (name.equals("sourceId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.sourceId");
        } else if (name.equals("targetId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.targetId");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.url");
        } else
            return super.addChild(name);
    }

    public TestScriptSetupActionOperationComponent copy() {
        TestScriptSetupActionOperationComponent dst = new TestScriptSetupActionOperationComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.resource = resource == null ? null : resource.copy();
        dst.label = label == null ? null : label.copy();
        dst.description = description == null ? null : description.copy();
        dst.accept = accept == null ? null : accept.copy();
        dst.contentType = contentType == null ? null : contentType.copy();
        dst.destination = destination == null ? null : destination.copy();
        dst.encodeRequestUrl = encodeRequestUrl == null ? null : encodeRequestUrl.copy();
        dst.params = params == null ? null : params.copy();
        if (requestHeader != null) {
            dst.requestHeader = new ArrayList<TestScriptSetupActionOperationRequestHeaderComponent>();
            for (TestScriptSetupActionOperationRequestHeaderComponent i : requestHeader) dst.requestHeader.add(i.copy());
        }
        ;
        dst.responseId = responseId == null ? null : responseId.copy();
        dst.sourceId = sourceId == null ? null : sourceId.copy();
        dst.targetId = targetId == null ? null : targetId.copy();
        dst.url = url == null ? null : url.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptSetupActionOperationComponent))
            return false;
        TestScriptSetupActionOperationComponent o = (TestScriptSetupActionOperationComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(resource, o.resource, true) && compareDeep(label, o.label, true) && compareDeep(description, o.description, true) && compareDeep(accept, o.accept, true) && compareDeep(contentType, o.contentType, true) && compareDeep(destination, o.destination, true) && compareDeep(encodeRequestUrl, o.encodeRequestUrl, true) && compareDeep(params, o.params, true) && compareDeep(requestHeader, o.requestHeader, true) && compareDeep(responseId, o.responseId, true) && compareDeep(sourceId, o.sourceId, true) && compareDeep(targetId, o.targetId, true) && compareDeep(url, o.url, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptSetupActionOperationComponent))
            return false;
        TestScriptSetupActionOperationComponent o = (TestScriptSetupActionOperationComponent) other;
        return compareValues(resource, o.resource, true) && compareValues(label, o.label, true) && compareValues(description, o.description, true) && compareValues(accept, o.accept, true) && compareValues(contentType, o.contentType, true) && compareValues(destination, o.destination, true) && compareValues(encodeRequestUrl, o.encodeRequestUrl, true) && compareValues(params, o.params, true) && compareValues(responseId, o.responseId, true) && compareValues(sourceId, o.sourceId, true) && compareValues(targetId, o.targetId, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (resource == null || resource.isEmpty()) && (label == null || label.isEmpty()) && (description == null || description.isEmpty()) && (accept == null || accept.isEmpty()) && (contentType == null || contentType.isEmpty()) && (destination == null || destination.isEmpty()) && (encodeRequestUrl == null || encodeRequestUrl.isEmpty()) && (params == null || params.isEmpty()) && (requestHeader == null || requestHeader.isEmpty()) && (responseId == null || responseId.isEmpty()) && (sourceId == null || sourceId.isEmpty()) && (targetId == null || targetId.isEmpty()) && (url == null || url.isEmpty());
    }

    public String fhirType() {
        return "TestScript.setup.action.operation";
    }
}
