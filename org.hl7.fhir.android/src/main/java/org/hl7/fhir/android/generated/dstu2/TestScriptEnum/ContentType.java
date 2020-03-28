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

public enum ContentType {

    /**
     * XML content-type corresponding to the application/xml+fhir mime-type.
     */
    XML,
    /**
     * JSON content-type corresponding to the application/json+fhir mime-type.
     */
    JSON,
    /**
     * added to help the parsers
     */
    NULL;

    public static ContentType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("xml".equals(codeString))
            return XML;
        if ("json".equals(codeString))
            return JSON;
        throw new FHIRException("Unknown ContentType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case XML:
                return "xml";
            case JSON:
                return "json";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case XML:
                return "http://hl7.org/fhir/content-type";
            case JSON:
                return "http://hl7.org/fhir/content-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case XML:
                return "XML content-type corresponding to the application/xml+fhir mime-type.";
            case JSON:
                return "JSON content-type corresponding to the application/json+fhir mime-type.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case XML:
                return "xml";
            case JSON:
                return "json";
            default:
                return "?";
        }
    }
}
