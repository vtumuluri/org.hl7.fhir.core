package org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUse;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKind;

public enum OperationParameterUse {

    /**
     * This is an input parameter.
     */
    IN,
    /**
     * This is an output parameter.
     */
    OUT,
    /**
     * added to help the parsers
     */
    NULL;

    public static OperationParameterUse fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in".equals(codeString))
            return IN;
        if ("out".equals(codeString))
            return OUT;
        throw new FHIRException("Unknown OperationParameterUse code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case IN:
                return "in";
            case OUT:
                return "out";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case IN:
                return "http://hl7.org/fhir/operation-parameter-use";
            case OUT:
                return "http://hl7.org/fhir/operation-parameter-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case IN:
                return "This is an input parameter.";
            case OUT:
                return "This is an output parameter.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case IN:
                return "In";
            case OUT:
                return "Out";
            default:
                return "?";
        }
    }
}
