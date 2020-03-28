package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;

public enum TypeRestfulInteraction {

    /**
     * null
     */
    READ,
    /**
     * null
     */
    VREAD,
    /**
     * null
     */
    UPDATE,
    /**
     * null
     */
    DELETE,
    /**
     * null
     */
    HISTORYINSTANCE,
    /**
     * null
     */
    VALIDATE,
    /**
     * null
     */
    HISTORYTYPE,
    /**
     * null
     */
    CREATE,
    /**
     * null
     */
    SEARCHTYPE,
    /**
     * added to help the parsers
     */
    NULL;

    public static TypeRestfulInteraction fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("read".equals(codeString))
            return READ;
        if ("vread".equals(codeString))
            return VREAD;
        if ("update".equals(codeString))
            return UPDATE;
        if ("delete".equals(codeString))
            return DELETE;
        if ("history-instance".equals(codeString))
            return HISTORYINSTANCE;
        if ("validate".equals(codeString))
            return VALIDATE;
        if ("history-type".equals(codeString))
            return HISTORYTYPE;
        if ("create".equals(codeString))
            return CREATE;
        if ("search-type".equals(codeString))
            return SEARCHTYPE;
        throw new FHIRException("Unknown TypeRestfulInteraction code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case READ:
                return "read";
            case VREAD:
                return "vread";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            case HISTORYINSTANCE:
                return "history-instance";
            case VALIDATE:
                return "validate";
            case HISTORYTYPE:
                return "history-type";
            case CREATE:
                return "create";
            case SEARCHTYPE:
                return "search-type";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case READ:
                return "http://hl7.org/fhir/restful-interaction";
            case VREAD:
                return "http://hl7.org/fhir/restful-interaction";
            case UPDATE:
                return "http://hl7.org/fhir/restful-interaction";
            case DELETE:
                return "http://hl7.org/fhir/restful-interaction";
            case HISTORYINSTANCE:
                return "http://hl7.org/fhir/restful-interaction";
            case VALIDATE:
                return "http://hl7.org/fhir/restful-interaction";
            case HISTORYTYPE:
                return "http://hl7.org/fhir/restful-interaction";
            case CREATE:
                return "http://hl7.org/fhir/restful-interaction";
            case SEARCHTYPE:
                return "http://hl7.org/fhir/restful-interaction";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case READ:
                return "";
            case VREAD:
                return "";
            case UPDATE:
                return "";
            case DELETE:
                return "";
            case HISTORYINSTANCE:
                return "";
            case VALIDATE:
                return "";
            case HISTORYTYPE:
                return "";
            case CREATE:
                return "";
            case SEARCHTYPE:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case READ:
                return "read";
            case VREAD:
                return "vread";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            case HISTORYINSTANCE:
                return "history-instance";
            case VALIDATE:
                return "validate";
            case HISTORYTYPE:
                return "history-type";
            case CREATE:
                return "create";
            case SEARCHTYPE:
                return "search-type";
            default:
                return "?";
        }
    }
}
