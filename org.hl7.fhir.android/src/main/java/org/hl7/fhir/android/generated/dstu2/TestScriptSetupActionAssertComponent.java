package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;

public class TestScriptSetupActionAssertComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The label would be used for tracking/logging purposes by test engines.
     */
    protected StringType label;

    /**
     * The description would be used by test engines for tracking and reporting purposes.
     */
    protected StringType description;

    /**
     * The direction to use for the assertion.
     */
    protected Enumeration<AssertionDirectionType> direction;

    /**
     * Id of fixture used to compare the "sourceId/path" evaluations to.
     */
    protected StringType compareToSourceId;

    /**
     * XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.
     */
    protected StringType compareToSourcePath;

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     */
    protected Enumeration<ContentType> contentType;

    /**
     * The HTTP header field name e.g. 'Location'.
     */
    protected StringType headerField;

    /**
     * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     */
    protected StringType minimumId;

    /**
     * Whether or not the test execution performs validation on the bundle navigation links.
     */
    protected BooleanType navigationLinks;

    /**
     * The operator type.
     */
    protected Enumeration<AssertionOperatorType> operator;

    /**
     * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     */
    protected StringType path;

    /**
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     */
    protected CodeType resource;

    /**
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     */
    protected Enumeration<AssertionResponseTypes> response;

    /**
     * The value of the HTTP response code to be tested.
     */
    protected StringType responseCode;

    /**
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     */
    protected IdType sourceId;

    /**
     * The ID of the Profile to validate against.
     */
    protected IdType validateProfileId;

    /**
     * The value to compare to.
     */
    protected StringType value;

    /**
     * Whether or not the test execution will produce a warning only on error for this assert.
     */
    protected BooleanType warningOnly;

    private static final long serialVersionUID = -607939856L;

    /*
     * Constructor
     */
    public TestScriptSetupActionAssertComponent() {
        super();
    }

    /**
     * @return {@link #label} (The label would be used for tracking/logging purposes by test engines.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public StringType getLabelElement() {
        if (this.label == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.label");
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
    public TestScriptSetupActionAssertComponent setLabelElement(StringType value) {
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
    public TestScriptSetupActionAssertComponent setLabel(String value) {
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
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.description");
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
    public TestScriptSetupActionAssertComponent setDescriptionElement(StringType value) {
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
    public TestScriptSetupActionAssertComponent setDescription(String value) {
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
     * @return {@link #direction} (The direction to use for the assertion.). This is the underlying object with id, value and extensions. The accessor "getDirection" gives direct access to the value
     */
    public Enumeration<AssertionDirectionType> getDirectionElement() {
        if (this.direction == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.direction");
            else if (Configuration.doAutoCreate())
                // bb
                this.direction = new Enumeration<AssertionDirectionType>(new AssertionDirectionTypeEnumFactory());
        return this.direction;
    }

    public boolean hasDirectionElement() {
        return this.direction != null && !this.direction.isEmpty();
    }

    public boolean hasDirection() {
        return this.direction != null && !this.direction.isEmpty();
    }

    /**
     * @param value {@link #direction} (The direction to use for the assertion.). This is the underlying object with id, value and extensions. The accessor "getDirection" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setDirectionElement(Enumeration<AssertionDirectionType> value) {
        this.direction = value;
        return this;
    }

    /**
     * @return The direction to use for the assertion.
     */
    public AssertionDirectionType getDirection() {
        return this.direction == null ? null : this.direction.getValue();
    }

    /**
     * @param value The direction to use for the assertion.
     */
    public TestScriptSetupActionAssertComponent setDirection(AssertionDirectionType value) {
        if (value == null)
            this.direction = null;
        else {
            if (this.direction == null)
                this.direction = new Enumeration<AssertionDirectionType>(new AssertionDirectionTypeEnumFactory());
            this.direction.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #compareToSourceId} (Id of fixture used to compare the "sourceId/path" evaluations to.). This is the underlying object with id, value and extensions. The accessor "getCompareToSourceId" gives direct access to the value
     */
    public StringType getCompareToSourceIdElement() {
        if (this.compareToSourceId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.compareToSourceId");
            else if (Configuration.doAutoCreate())
                // bb
                this.compareToSourceId = new StringType();
        return this.compareToSourceId;
    }

    public boolean hasCompareToSourceIdElement() {
        return this.compareToSourceId != null && !this.compareToSourceId.isEmpty();
    }

    public boolean hasCompareToSourceId() {
        return this.compareToSourceId != null && !this.compareToSourceId.isEmpty();
    }

    /**
     * @param value {@link #compareToSourceId} (Id of fixture used to compare the "sourceId/path" evaluations to.). This is the underlying object with id, value and extensions. The accessor "getCompareToSourceId" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setCompareToSourceIdElement(StringType value) {
        this.compareToSourceId = value;
        return this;
    }

    /**
     * @return Id of fixture used to compare the "sourceId/path" evaluations to.
     */
    public String getCompareToSourceId() {
        return this.compareToSourceId == null ? null : this.compareToSourceId.getValue();
    }

    /**
     * @param value Id of fixture used to compare the "sourceId/path" evaluations to.
     */
    public TestScriptSetupActionAssertComponent setCompareToSourceId(String value) {
        if (Utilities.noString(value))
            this.compareToSourceId = null;
        else {
            if (this.compareToSourceId == null)
                this.compareToSourceId = new StringType();
            this.compareToSourceId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #compareToSourcePath} (XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.). This is the underlying object with id, value and extensions. The accessor "getCompareToSourcePath" gives direct access to the value
     */
    public StringType getCompareToSourcePathElement() {
        if (this.compareToSourcePath == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.compareToSourcePath");
            else if (Configuration.doAutoCreate())
                // bb
                this.compareToSourcePath = new StringType();
        return this.compareToSourcePath;
    }

    public boolean hasCompareToSourcePathElement() {
        return this.compareToSourcePath != null && !this.compareToSourcePath.isEmpty();
    }

    public boolean hasCompareToSourcePath() {
        return this.compareToSourcePath != null && !this.compareToSourcePath.isEmpty();
    }

    /**
     * @param value {@link #compareToSourcePath} (XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.). This is the underlying object with id, value and extensions. The accessor "getCompareToSourcePath" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setCompareToSourcePathElement(StringType value) {
        this.compareToSourcePath = value;
        return this;
    }

    /**
     * @return XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.
     */
    public String getCompareToSourcePath() {
        return this.compareToSourcePath == null ? null : this.compareToSourcePath.getValue();
    }

    /**
     * @param value XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.
     */
    public TestScriptSetupActionAssertComponent setCompareToSourcePath(String value) {
        if (Utilities.noString(value))
            this.compareToSourcePath = null;
        else {
            if (this.compareToSourcePath == null)
                this.compareToSourcePath = new StringType();
            this.compareToSourcePath.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contentType} (The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.). This is the underlying object with id, value and extensions. The accessor "getContentType" gives direct access to the value
     */
    public Enumeration<ContentType> getContentTypeElement() {
        if (this.contentType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.contentType");
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
    public TestScriptSetupActionAssertComponent setContentTypeElement(Enumeration<ContentType> value) {
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
    public TestScriptSetupActionAssertComponent setContentType(ContentType value) {
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
     * @return {@link #headerField} (The HTTP header field name e.g. 'Location'.). This is the underlying object with id, value and extensions. The accessor "getHeaderField" gives direct access to the value
     */
    public StringType getHeaderFieldElement() {
        if (this.headerField == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.headerField");
            else if (Configuration.doAutoCreate())
                // bb
                this.headerField = new StringType();
        return this.headerField;
    }

    public boolean hasHeaderFieldElement() {
        return this.headerField != null && !this.headerField.isEmpty();
    }

    public boolean hasHeaderField() {
        return this.headerField != null && !this.headerField.isEmpty();
    }

    /**
     * @param value {@link #headerField} (The HTTP header field name e.g. 'Location'.). This is the underlying object with id, value and extensions. The accessor "getHeaderField" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setHeaderFieldElement(StringType value) {
        this.headerField = value;
        return this;
    }

    /**
     * @return The HTTP header field name e.g. 'Location'.
     */
    public String getHeaderField() {
        return this.headerField == null ? null : this.headerField.getValue();
    }

    /**
     * @param value The HTTP header field name e.g. 'Location'.
     */
    public TestScriptSetupActionAssertComponent setHeaderField(String value) {
        if (Utilities.noString(value))
            this.headerField = null;
        else {
            if (this.headerField == null)
                this.headerField = new StringType();
            this.headerField.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #minimumId} (The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.). This is the underlying object with id, value and extensions. The accessor "getMinimumId" gives direct access to the value
     */
    public StringType getMinimumIdElement() {
        if (this.minimumId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.minimumId");
            else if (Configuration.doAutoCreate())
                // bb
                this.minimumId = new StringType();
        return this.minimumId;
    }

    public boolean hasMinimumIdElement() {
        return this.minimumId != null && !this.minimumId.isEmpty();
    }

    public boolean hasMinimumId() {
        return this.minimumId != null && !this.minimumId.isEmpty();
    }

    /**
     * @param value {@link #minimumId} (The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.). This is the underlying object with id, value and extensions. The accessor "getMinimumId" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setMinimumIdElement(StringType value) {
        this.minimumId = value;
        return this;
    }

    /**
     * @return The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     */
    public String getMinimumId() {
        return this.minimumId == null ? null : this.minimumId.getValue();
    }

    /**
     * @param value The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     */
    public TestScriptSetupActionAssertComponent setMinimumId(String value) {
        if (Utilities.noString(value))
            this.minimumId = null;
        else {
            if (this.minimumId == null)
                this.minimumId = new StringType();
            this.minimumId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #navigationLinks} (Whether or not the test execution performs validation on the bundle navigation links.). This is the underlying object with id, value and extensions. The accessor "getNavigationLinks" gives direct access to the value
     */
    public BooleanType getNavigationLinksElement() {
        if (this.navigationLinks == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.navigationLinks");
            else if (Configuration.doAutoCreate())
                // bb
                this.navigationLinks = new BooleanType();
        return this.navigationLinks;
    }

    public boolean hasNavigationLinksElement() {
        return this.navigationLinks != null && !this.navigationLinks.isEmpty();
    }

    public boolean hasNavigationLinks() {
        return this.navigationLinks != null && !this.navigationLinks.isEmpty();
    }

    /**
     * @param value {@link #navigationLinks} (Whether or not the test execution performs validation on the bundle navigation links.). This is the underlying object with id, value and extensions. The accessor "getNavigationLinks" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setNavigationLinksElement(BooleanType value) {
        this.navigationLinks = value;
        return this;
    }

    /**
     * @return Whether or not the test execution performs validation on the bundle navigation links.
     */
    public boolean getNavigationLinks() {
        return this.navigationLinks == null || this.navigationLinks.isEmpty() ? false : this.navigationLinks.getValue();
    }

    /**
     * @param value Whether or not the test execution performs validation on the bundle navigation links.
     */
    public TestScriptSetupActionAssertComponent setNavigationLinks(boolean value) {
        if (this.navigationLinks == null)
            this.navigationLinks = new BooleanType();
        this.navigationLinks.setValue(value);
        return this;
    }

    /**
     * @return {@link #operator} (The operator type.). This is the underlying object with id, value and extensions. The accessor "getOperator" gives direct access to the value
     */
    public Enumeration<AssertionOperatorType> getOperatorElement() {
        if (this.operator == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.operator");
            else if (Configuration.doAutoCreate())
                // bb
                this.operator = new Enumeration<AssertionOperatorType>(new AssertionOperatorTypeEnumFactory());
        return this.operator;
    }

    public boolean hasOperatorElement() {
        return this.operator != null && !this.operator.isEmpty();
    }

    public boolean hasOperator() {
        return this.operator != null && !this.operator.isEmpty();
    }

    /**
     * @param value {@link #operator} (The operator type.). This is the underlying object with id, value and extensions. The accessor "getOperator" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setOperatorElement(Enumeration<AssertionOperatorType> value) {
        this.operator = value;
        return this;
    }

    /**
     * @return The operator type.
     */
    public AssertionOperatorType getOperator() {
        return this.operator == null ? null : this.operator.getValue();
    }

    /**
     * @param value The operator type.
     */
    public TestScriptSetupActionAssertComponent setOperator(AssertionOperatorType value) {
        if (value == null)
            this.operator = null;
        else {
            if (this.operator == null)
                this.operator = new Enumeration<AssertionOperatorType>(new AssertionOperatorTypeEnumFactory());
            this.operator.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #path} (The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public StringType getPathElement() {
        if (this.path == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.path");
            else if (Configuration.doAutoCreate())
                // bb
                this.path = new StringType();
        return this.path;
    }

    public boolean hasPathElement() {
        return this.path != null && !this.path.isEmpty();
    }

    public boolean hasPath() {
        return this.path != null && !this.path.isEmpty();
    }

    /**
     * @param value {@link #path} (The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setPathElement(StringType value) {
        this.path = value;
        return this;
    }

    /**
     * @return The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     */
    public String getPath() {
        return this.path == null ? null : this.path.getValue();
    }

    /**
     * @param value The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     */
    public TestScriptSetupActionAssertComponent setPath(String value) {
        if (Utilities.noString(value))
            this.path = null;
        else {
            if (this.path == null)
                this.path = new StringType();
            this.path.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #resource} (The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.). This is the underlying object with id, value and extensions. The accessor "getResource" gives direct access to the value
     */
    public CodeType getResourceElement() {
        if (this.resource == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.resource");
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
    public TestScriptSetupActionAssertComponent setResourceElement(CodeType value) {
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
    public TestScriptSetupActionAssertComponent setResource(String value) {
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
     * @return {@link #response} (okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.). This is the underlying object with id, value and extensions. The accessor "getResponse" gives direct access to the value
     */
    public Enumeration<AssertionResponseTypes> getResponseElement() {
        if (this.response == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.response");
            else if (Configuration.doAutoCreate())
                // bb
                this.response = new Enumeration<AssertionResponseTypes>(new AssertionResponseTypesEnumFactory());
        return this.response;
    }

    public boolean hasResponseElement() {
        return this.response != null && !this.response.isEmpty();
    }

    public boolean hasResponse() {
        return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.). This is the underlying object with id, value and extensions. The accessor "getResponse" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setResponseElement(Enumeration<AssertionResponseTypes> value) {
        this.response = value;
        return this;
    }

    /**
     * @return okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     */
    public AssertionResponseTypes getResponse() {
        return this.response == null ? null : this.response.getValue();
    }

    /**
     * @param value okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
     */
    public TestScriptSetupActionAssertComponent setResponse(AssertionResponseTypes value) {
        if (value == null)
            this.response = null;
        else {
            if (this.response == null)
                this.response = new Enumeration<AssertionResponseTypes>(new AssertionResponseTypesEnumFactory());
            this.response.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #responseCode} (The value of the HTTP response code to be tested.). This is the underlying object with id, value and extensions. The accessor "getResponseCode" gives direct access to the value
     */
    public StringType getResponseCodeElement() {
        if (this.responseCode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.responseCode");
            else if (Configuration.doAutoCreate())
                // bb
                this.responseCode = new StringType();
        return this.responseCode;
    }

    public boolean hasResponseCodeElement() {
        return this.responseCode != null && !this.responseCode.isEmpty();
    }

    public boolean hasResponseCode() {
        return this.responseCode != null && !this.responseCode.isEmpty();
    }

    /**
     * @param value {@link #responseCode} (The value of the HTTP response code to be tested.). This is the underlying object with id, value and extensions. The accessor "getResponseCode" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setResponseCodeElement(StringType value) {
        this.responseCode = value;
        return this;
    }

    /**
     * @return The value of the HTTP response code to be tested.
     */
    public String getResponseCode() {
        return this.responseCode == null ? null : this.responseCode.getValue();
    }

    /**
     * @param value The value of the HTTP response code to be tested.
     */
    public TestScriptSetupActionAssertComponent setResponseCode(String value) {
        if (Utilities.noString(value))
            this.responseCode = null;
        else {
            if (this.responseCode == null)
                this.responseCode = new StringType();
            this.responseCode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #sourceId} (Fixture to evaluate the XPath/JSONPath expression or the headerField  against.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public IdType getSourceIdElement() {
        if (this.sourceId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.sourceId");
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
     * @param value {@link #sourceId} (Fixture to evaluate the XPath/JSONPath expression or the headerField  against.). This is the underlying object with id, value and extensions. The accessor "getSourceId" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setSourceIdElement(IdType value) {
        this.sourceId = value;
        return this;
    }

    /**
     * @return Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     */
    public String getSourceId() {
        return this.sourceId == null ? null : this.sourceId.getValue();
    }

    /**
     * @param value Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     */
    public TestScriptSetupActionAssertComponent setSourceId(String value) {
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
     * @return {@link #validateProfileId} (The ID of the Profile to validate against.). This is the underlying object with id, value and extensions. The accessor "getValidateProfileId" gives direct access to the value
     */
    public IdType getValidateProfileIdElement() {
        if (this.validateProfileId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.validateProfileId");
            else if (Configuration.doAutoCreate())
                // bb
                this.validateProfileId = new IdType();
        return this.validateProfileId;
    }

    public boolean hasValidateProfileIdElement() {
        return this.validateProfileId != null && !this.validateProfileId.isEmpty();
    }

    public boolean hasValidateProfileId() {
        return this.validateProfileId != null && !this.validateProfileId.isEmpty();
    }

    /**
     * @param value {@link #validateProfileId} (The ID of the Profile to validate against.). This is the underlying object with id, value and extensions. The accessor "getValidateProfileId" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setValidateProfileIdElement(IdType value) {
        this.validateProfileId = value;
        return this;
    }

    /**
     * @return The ID of the Profile to validate against.
     */
    public String getValidateProfileId() {
        return this.validateProfileId == null ? null : this.validateProfileId.getValue();
    }

    /**
     * @param value The ID of the Profile to validate against.
     */
    public TestScriptSetupActionAssertComponent setValidateProfileId(String value) {
        if (Utilities.noString(value))
            this.validateProfileId = null;
        else {
            if (this.validateProfileId == null)
                this.validateProfileId = new IdType();
            this.validateProfileId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #value} (The value to compare to.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new StringType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The value to compare to.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The value to compare to.
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The value to compare to.
     */
    public TestScriptSetupActionAssertComponent setValue(String value) {
        if (Utilities.noString(value))
            this.value = null;
        else {
            if (this.value == null)
                this.value = new StringType();
            this.value.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #warningOnly} (Whether or not the test execution will produce a warning only on error for this assert.). This is the underlying object with id, value and extensions. The accessor "getWarningOnly" gives direct access to the value
     */
    public BooleanType getWarningOnlyElement() {
        if (this.warningOnly == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScriptSetupActionAssertComponent.warningOnly");
            else if (Configuration.doAutoCreate())
                // bb
                this.warningOnly = new BooleanType();
        return this.warningOnly;
    }

    public boolean hasWarningOnlyElement() {
        return this.warningOnly != null && !this.warningOnly.isEmpty();
    }

    public boolean hasWarningOnly() {
        return this.warningOnly != null && !this.warningOnly.isEmpty();
    }

    /**
     * @param value {@link #warningOnly} (Whether or not the test execution will produce a warning only on error for this assert.). This is the underlying object with id, value and extensions. The accessor "getWarningOnly" gives direct access to the value
     */
    public TestScriptSetupActionAssertComponent setWarningOnlyElement(BooleanType value) {
        this.warningOnly = value;
        return this;
    }

    /**
     * @return Whether or not the test execution will produce a warning only on error for this assert.
     */
    public boolean getWarningOnly() {
        return this.warningOnly == null || this.warningOnly.isEmpty() ? false : this.warningOnly.getValue();
    }

    /**
     * @param value Whether or not the test execution will produce a warning only on error for this assert.
     */
    public TestScriptSetupActionAssertComponent setWarningOnly(boolean value) {
        if (this.warningOnly == null)
            this.warningOnly = new BooleanType();
        this.warningOnly.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("label", "string", "The label would be used for tracking/logging purposes by test engines.", 0, java.lang.Integer.MAX_VALUE, label));
        childrenList.add(new Property("description", "string", "The description would be used by test engines for tracking and reporting purposes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("direction", "code", "The direction to use for the assertion.", 0, java.lang.Integer.MAX_VALUE, direction));
        childrenList.add(new Property("compareToSourceId", "string", "Id of fixture used to compare the \"sourceId/path\" evaluations to.", 0, java.lang.Integer.MAX_VALUE, compareToSourceId));
        childrenList.add(new Property("compareToSourcePath", "string", "XPath or JSONPath expression against fixture used to compare the \"sourceId/path\" evaluations to.", 0, java.lang.Integer.MAX_VALUE, compareToSourcePath));
        childrenList.add(new Property("contentType", "code", "The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.", 0, java.lang.Integer.MAX_VALUE, contentType));
        childrenList.add(new Property("headerField", "string", "The HTTP header field name e.g. 'Location'.", 0, java.lang.Integer.MAX_VALUE, headerField));
        childrenList.add(new Property("minimumId", "string", "The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.", 0, java.lang.Integer.MAX_VALUE, minimumId));
        childrenList.add(new Property("navigationLinks", "boolean", "Whether or not the test execution performs validation on the bundle navigation links.", 0, java.lang.Integer.MAX_VALUE, navigationLinks));
        childrenList.add(new Property("operator", "code", "The operator type.", 0, java.lang.Integer.MAX_VALUE, operator));
        childrenList.add(new Property("path", "string", "The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.", 0, java.lang.Integer.MAX_VALUE, path));
        childrenList.add(new Property("resource", "code", "The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.", 0, java.lang.Integer.MAX_VALUE, resource));
        childrenList.add(new Property("response", "code", "okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.", 0, java.lang.Integer.MAX_VALUE, response));
        childrenList.add(new Property("responseCode", "string", "The value of the HTTP response code to be tested.", 0, java.lang.Integer.MAX_VALUE, responseCode));
        childrenList.add(new Property("sourceId", "id", "Fixture to evaluate the XPath/JSONPath expression or the headerField  against.", 0, java.lang.Integer.MAX_VALUE, sourceId));
        childrenList.add(new Property("validateProfileId", "id", "The ID of the Profile to validate against.", 0, java.lang.Integer.MAX_VALUE, validateProfileId));
        childrenList.add(new Property("value", "string", "The value to compare to.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("warningOnly", "boolean", "Whether or not the test execution will produce a warning only on error for this assert.", 0, java.lang.Integer.MAX_VALUE, warningOnly));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("label"))
            // StringType
            this.label = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("direction"))
            // Enumeration<AssertionDirectionType>
            this.direction = new AssertionDirectionTypeEnumFactory().fromType(value);
        else if (name.equals("compareToSourceId"))
            // StringType
            this.compareToSourceId = castToString(value);
        else if (name.equals("compareToSourcePath"))
            // StringType
            this.compareToSourcePath = castToString(value);
        else if (name.equals("contentType"))
            // Enumeration<ContentType>
            this.contentType = new ContentTypeEnumFactory().fromType(value);
        else if (name.equals("headerField"))
            // StringType
            this.headerField = castToString(value);
        else if (name.equals("minimumId"))
            // StringType
            this.minimumId = castToString(value);
        else if (name.equals("navigationLinks"))
            // BooleanType
            this.navigationLinks = castToBoolean(value);
        else if (name.equals("operator"))
            // Enumeration<AssertionOperatorType>
            this.operator = new AssertionOperatorTypeEnumFactory().fromType(value);
        else if (name.equals("path"))
            // StringType
            this.path = castToString(value);
        else if (name.equals("resource"))
            // CodeType
            this.resource = castToCode(value);
        else if (name.equals("response"))
            // Enumeration<AssertionResponseTypes>
            this.response = new AssertionResponseTypesEnumFactory().fromType(value);
        else if (name.equals("responseCode"))
            // StringType
            this.responseCode = castToString(value);
        else if (name.equals("sourceId"))
            // IdType
            this.sourceId = castToId(value);
        else if (name.equals("validateProfileId"))
            // IdType
            this.validateProfileId = castToId(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else if (name.equals("warningOnly"))
            // BooleanType
            this.warningOnly = castToBoolean(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("label")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.label");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.description");
        } else if (name.equals("direction")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.direction");
        } else if (name.equals("compareToSourceId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.compareToSourceId");
        } else if (name.equals("compareToSourcePath")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.compareToSourcePath");
        } else if (name.equals("contentType")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.contentType");
        } else if (name.equals("headerField")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.headerField");
        } else if (name.equals("minimumId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.minimumId");
        } else if (name.equals("navigationLinks")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.navigationLinks");
        } else if (name.equals("operator")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.operator");
        } else if (name.equals("path")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.path");
        } else if (name.equals("resource")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.resource");
        } else if (name.equals("response")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.response");
        } else if (name.equals("responseCode")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.responseCode");
        } else if (name.equals("sourceId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.sourceId");
        } else if (name.equals("validateProfileId")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.validateProfileId");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.value");
        } else if (name.equals("warningOnly")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.warningOnly");
        } else
            return super.addChild(name);
    }

    public TestScriptSetupActionAssertComponent copy() {
        TestScriptSetupActionAssertComponent dst = new TestScriptSetupActionAssertComponent();
        copyValues(dst);
        dst.label = label == null ? null : label.copy();
        dst.description = description == null ? null : description.copy();
        dst.direction = direction == null ? null : direction.copy();
        dst.compareToSourceId = compareToSourceId == null ? null : compareToSourceId.copy();
        dst.compareToSourcePath = compareToSourcePath == null ? null : compareToSourcePath.copy();
        dst.contentType = contentType == null ? null : contentType.copy();
        dst.headerField = headerField == null ? null : headerField.copy();
        dst.minimumId = minimumId == null ? null : minimumId.copy();
        dst.navigationLinks = navigationLinks == null ? null : navigationLinks.copy();
        dst.operator = operator == null ? null : operator.copy();
        dst.path = path == null ? null : path.copy();
        dst.resource = resource == null ? null : resource.copy();
        dst.response = response == null ? null : response.copy();
        dst.responseCode = responseCode == null ? null : responseCode.copy();
        dst.sourceId = sourceId == null ? null : sourceId.copy();
        dst.validateProfileId = validateProfileId == null ? null : validateProfileId.copy();
        dst.value = value == null ? null : value.copy();
        dst.warningOnly = warningOnly == null ? null : warningOnly.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptSetupActionAssertComponent))
            return false;
        TestScriptSetupActionAssertComponent o = (TestScriptSetupActionAssertComponent) other;
        return compareDeep(label, o.label, true) && compareDeep(description, o.description, true) && compareDeep(direction, o.direction, true) && compareDeep(compareToSourceId, o.compareToSourceId, true) && compareDeep(compareToSourcePath, o.compareToSourcePath, true) && compareDeep(contentType, o.contentType, true) && compareDeep(headerField, o.headerField, true) && compareDeep(minimumId, o.minimumId, true) && compareDeep(navigationLinks, o.navigationLinks, true) && compareDeep(operator, o.operator, true) && compareDeep(path, o.path, true) && compareDeep(resource, o.resource, true) && compareDeep(response, o.response, true) && compareDeep(responseCode, o.responseCode, true) && compareDeep(sourceId, o.sourceId, true) && compareDeep(validateProfileId, o.validateProfileId, true) && compareDeep(value, o.value, true) && compareDeep(warningOnly, o.warningOnly, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptSetupActionAssertComponent))
            return false;
        TestScriptSetupActionAssertComponent o = (TestScriptSetupActionAssertComponent) other;
        return compareValues(label, o.label, true) && compareValues(description, o.description, true) && compareValues(direction, o.direction, true) && compareValues(compareToSourceId, o.compareToSourceId, true) && compareValues(compareToSourcePath, o.compareToSourcePath, true) && compareValues(contentType, o.contentType, true) && compareValues(headerField, o.headerField, true) && compareValues(minimumId, o.minimumId, true) && compareValues(navigationLinks, o.navigationLinks, true) && compareValues(operator, o.operator, true) && compareValues(path, o.path, true) && compareValues(resource, o.resource, true) && compareValues(response, o.response, true) && compareValues(responseCode, o.responseCode, true) && compareValues(sourceId, o.sourceId, true) && compareValues(validateProfileId, o.validateProfileId, true) && compareValues(value, o.value, true) && compareValues(warningOnly, o.warningOnly, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (label == null || label.isEmpty()) && (description == null || description.isEmpty()) && (direction == null || direction.isEmpty()) && (compareToSourceId == null || compareToSourceId.isEmpty()) && (compareToSourcePath == null || compareToSourcePath.isEmpty()) && (contentType == null || contentType.isEmpty()) && (headerField == null || headerField.isEmpty()) && (minimumId == null || minimumId.isEmpty()) && (navigationLinks == null || navigationLinks.isEmpty()) && (operator == null || operator.isEmpty()) && (path == null || path.isEmpty()) && (resource == null || resource.isEmpty()) && (response == null || response.isEmpty()) && (responseCode == null || responseCode.isEmpty()) && (sourceId == null || sourceId.isEmpty()) && (validateProfileId == null || validateProfileId.isEmpty()) && (value == null || value.isEmpty()) && (warningOnly == null || warningOnly.isEmpty());
    }

    public String fhirType() {
        return "TestScript.setup.action.assert";
    }
}
