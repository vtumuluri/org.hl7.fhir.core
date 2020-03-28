package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;

public enum AssertionResponseTypes {

    /**
     * Response code is 200.
     */
    OKAY,
    /**
     * Response code is 201.
     */
    CREATED,
    /**
     * Response code is 204.
     */
    NOCONTENT,
    /**
     * Response code is 304.
     */
    NOTMODIFIED,
    /**
     * Response code is 400.
     */
    BAD,
    /**
     * Response code is 403.
     */
    FORBIDDEN,
    /**
     * Response code is 404.
     */
    NOTFOUND,
    /**
     * Response code is 405.
     */
    METHODNOTALLOWED,
    /**
     * Response code is 409.
     */
    CONFLICT,
    /**
     * Response code is 410.
     */
    GONE,
    /**
     * Response code is 412.
     */
    PRECONDITIONFAILED,
    /**
     * Response code is 422.
     */
    UNPROCESSABLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static AssertionResponseTypes fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("okay".equals(codeString))
            return OKAY;
        if ("created".equals(codeString))
            return CREATED;
        if ("noContent".equals(codeString))
            return NOCONTENT;
        if ("notModified".equals(codeString))
            return NOTMODIFIED;
        if ("bad".equals(codeString))
            return BAD;
        if ("forbidden".equals(codeString))
            return FORBIDDEN;
        if ("notFound".equals(codeString))
            return NOTFOUND;
        if ("methodNotAllowed".equals(codeString))
            return METHODNOTALLOWED;
        if ("conflict".equals(codeString))
            return CONFLICT;
        if ("gone".equals(codeString))
            return GONE;
        if ("preconditionFailed".equals(codeString))
            return PRECONDITIONFAILED;
        if ("unprocessable".equals(codeString))
            return UNPROCESSABLE;
        throw new FHIRException("Unknown AssertionResponseTypes code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case OKAY:
                return "okay";
            case CREATED:
                return "created";
            case NOCONTENT:
                return "noContent";
            case NOTMODIFIED:
                return "notModified";
            case BAD:
                return "bad";
            case FORBIDDEN:
                return "forbidden";
            case NOTFOUND:
                return "notFound";
            case METHODNOTALLOWED:
                return "methodNotAllowed";
            case CONFLICT:
                return "conflict";
            case GONE:
                return "gone";
            case PRECONDITIONFAILED:
                return "preconditionFailed";
            case UNPROCESSABLE:
                return "unprocessable";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case OKAY:
                return "http://hl7.org/fhir/assert-response-code-types";
            case CREATED:
                return "http://hl7.org/fhir/assert-response-code-types";
            case NOCONTENT:
                return "http://hl7.org/fhir/assert-response-code-types";
            case NOTMODIFIED:
                return "http://hl7.org/fhir/assert-response-code-types";
            case BAD:
                return "http://hl7.org/fhir/assert-response-code-types";
            case FORBIDDEN:
                return "http://hl7.org/fhir/assert-response-code-types";
            case NOTFOUND:
                return "http://hl7.org/fhir/assert-response-code-types";
            case METHODNOTALLOWED:
                return "http://hl7.org/fhir/assert-response-code-types";
            case CONFLICT:
                return "http://hl7.org/fhir/assert-response-code-types";
            case GONE:
                return "http://hl7.org/fhir/assert-response-code-types";
            case PRECONDITIONFAILED:
                return "http://hl7.org/fhir/assert-response-code-types";
            case UNPROCESSABLE:
                return "http://hl7.org/fhir/assert-response-code-types";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case OKAY:
                return "Response code is 200.";
            case CREATED:
                return "Response code is 201.";
            case NOCONTENT:
                return "Response code is 204.";
            case NOTMODIFIED:
                return "Response code is 304.";
            case BAD:
                return "Response code is 400.";
            case FORBIDDEN:
                return "Response code is 403.";
            case NOTFOUND:
                return "Response code is 404.";
            case METHODNOTALLOWED:
                return "Response code is 405.";
            case CONFLICT:
                return "Response code is 409.";
            case GONE:
                return "Response code is 410.";
            case PRECONDITIONFAILED:
                return "Response code is 412.";
            case UNPROCESSABLE:
                return "Response code is 422.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case OKAY:
                return "okay";
            case CREATED:
                return "created";
            case NOCONTENT:
                return "noContent";
            case NOTMODIFIED:
                return "notModified";
            case BAD:
                return "bad";
            case FORBIDDEN:
                return "forbidden";
            case NOTFOUND:
                return "notFound";
            case METHODNOTALLOWED:
                return "methodNotAllowed";
            case CONFLICT:
                return "conflict";
            case GONE:
                return "gone";
            case PRECONDITIONFAILED:
                return "preconditionFailed";
            case UNPROCESSABLE:
                return "unprocessable";
            default:
                return "?";
        }
    }
}
