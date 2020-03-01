package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DataTypeEnumFactory implements EnumFactory<DataType> {

    public DataType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Address".equals(codeString))
            return DataType.ADDRESS;
        if ("Age".equals(codeString))
            return DataType.AGE;
        if ("Annotation".equals(codeString))
            return DataType.ANNOTATION;
        if ("Attachment".equals(codeString))
            return DataType.ATTACHMENT;
        if ("BackboneElement".equals(codeString))
            return DataType.BACKBONEELEMENT;
        if ("CodeableConcept".equals(codeString))
            return DataType.CODEABLECONCEPT;
        if ("Coding".equals(codeString))
            return DataType.CODING;
        if ("ContactPoint".equals(codeString))
            return DataType.CONTACTPOINT;
        if ("Count".equals(codeString))
            return DataType.COUNT;
        if ("Distance".equals(codeString))
            return DataType.DISTANCE;
        if ("Duration".equals(codeString))
            return DataType.DURATION;
        if ("Element".equals(codeString))
            return DataType.ELEMENT;
        if ("ElementDefinition".equals(codeString))
            return DataType.ELEMENTDEFINITION;
        if ("Extension".equals(codeString))
            return DataType.EXTENSION;
        if ("HumanName".equals(codeString))
            return DataType.HUMANNAME;
        if ("Identifier".equals(codeString))
            return DataType.IDENTIFIER;
        if ("Meta".equals(codeString))
            return DataType.META;
        if ("Money".equals(codeString))
            return DataType.MONEY;
        if ("Narrative".equals(codeString))
            return DataType.NARRATIVE;
        if ("Period".equals(codeString))
            return DataType.PERIOD;
        if ("Quantity".equals(codeString))
            return DataType.QUANTITY;
        if ("Range".equals(codeString))
            return DataType.RANGE;
        if ("Ratio".equals(codeString))
            return DataType.RATIO;
        if ("Reference".equals(codeString))
            return DataType.REFERENCE;
        if ("SampledData".equals(codeString))
            return DataType.SAMPLEDDATA;
        if ("Signature".equals(codeString))
            return DataType.SIGNATURE;
        if ("SimpleQuantity".equals(codeString))
            return DataType.SIMPLEQUANTITY;
        if ("Timing".equals(codeString))
            return DataType.TIMING;
        if ("base64Binary".equals(codeString))
            return DataType.BASE64BINARY;
        if ("boolean".equals(codeString))
            return DataType.BOOLEAN;
        if ("code".equals(codeString))
            return DataType.CODE;
        if ("date".equals(codeString))
            return DataType.DATE;
        if ("dateTime".equals(codeString))
            return DataType.DATETIME;
        if ("decimal".equals(codeString))
            return DataType.DECIMAL;
        if ("id".equals(codeString))
            return DataType.ID;
        if ("instant".equals(codeString))
            return DataType.INSTANT;
        if ("integer".equals(codeString))
            return DataType.INTEGER;
        if ("markdown".equals(codeString))
            return DataType.MARKDOWN;
        if ("oid".equals(codeString))
            return DataType.OID;
        if ("positiveInt".equals(codeString))
            return DataType.POSITIVEINT;
        if ("string".equals(codeString))
            return DataType.STRING;
        if ("time".equals(codeString))
            return DataType.TIME;
        if ("unsignedInt".equals(codeString))
            return DataType.UNSIGNEDINT;
        if ("uri".equals(codeString))
            return DataType.URI;
        if ("uuid".equals(codeString))
            return DataType.UUID;
        if ("xhtml".equals(codeString))
            return DataType.XHTML;
        throw new IllegalArgumentException("Unknown DataType code '" + codeString + "'");
    }

    public Enumeration<DataType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Address".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ADDRESS);
        if ("Age".equals(codeString))
            return new Enumeration<DataType>(this, DataType.AGE);
        if ("Annotation".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ANNOTATION);
        if ("Attachment".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ATTACHMENT);
        if ("BackboneElement".equals(codeString))
            return new Enumeration<DataType>(this, DataType.BACKBONEELEMENT);
        if ("CodeableConcept".equals(codeString))
            return new Enumeration<DataType>(this, DataType.CODEABLECONCEPT);
        if ("Coding".equals(codeString))
            return new Enumeration<DataType>(this, DataType.CODING);
        if ("ContactPoint".equals(codeString))
            return new Enumeration<DataType>(this, DataType.CONTACTPOINT);
        if ("Count".equals(codeString))
            return new Enumeration<DataType>(this, DataType.COUNT);
        if ("Distance".equals(codeString))
            return new Enumeration<DataType>(this, DataType.DISTANCE);
        if ("Duration".equals(codeString))
            return new Enumeration<DataType>(this, DataType.DURATION);
        if ("Element".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ELEMENT);
        if ("ElementDefinition".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ELEMENTDEFINITION);
        if ("Extension".equals(codeString))
            return new Enumeration<DataType>(this, DataType.EXTENSION);
        if ("HumanName".equals(codeString))
            return new Enumeration<DataType>(this, DataType.HUMANNAME);
        if ("Identifier".equals(codeString))
            return new Enumeration<DataType>(this, DataType.IDENTIFIER);
        if ("Meta".equals(codeString))
            return new Enumeration<DataType>(this, DataType.META);
        if ("Money".equals(codeString))
            return new Enumeration<DataType>(this, DataType.MONEY);
        if ("Narrative".equals(codeString))
            return new Enumeration<DataType>(this, DataType.NARRATIVE);
        if ("Period".equals(codeString))
            return new Enumeration<DataType>(this, DataType.PERIOD);
        if ("Quantity".equals(codeString))
            return new Enumeration<DataType>(this, DataType.QUANTITY);
        if ("Range".equals(codeString))
            return new Enumeration<DataType>(this, DataType.RANGE);
        if ("Ratio".equals(codeString))
            return new Enumeration<DataType>(this, DataType.RATIO);
        if ("Reference".equals(codeString))
            return new Enumeration<DataType>(this, DataType.REFERENCE);
        if ("SampledData".equals(codeString))
            return new Enumeration<DataType>(this, DataType.SAMPLEDDATA);
        if ("Signature".equals(codeString))
            return new Enumeration<DataType>(this, DataType.SIGNATURE);
        if ("SimpleQuantity".equals(codeString))
            return new Enumeration<DataType>(this, DataType.SIMPLEQUANTITY);
        if ("Timing".equals(codeString))
            return new Enumeration<DataType>(this, DataType.TIMING);
        if ("base64Binary".equals(codeString))
            return new Enumeration<DataType>(this, DataType.BASE64BINARY);
        if ("boolean".equals(codeString))
            return new Enumeration<DataType>(this, DataType.BOOLEAN);
        if ("code".equals(codeString))
            return new Enumeration<DataType>(this, DataType.CODE);
        if ("date".equals(codeString))
            return new Enumeration<DataType>(this, DataType.DATE);
        if ("dateTime".equals(codeString))
            return new Enumeration<DataType>(this, DataType.DATETIME);
        if ("decimal".equals(codeString))
            return new Enumeration<DataType>(this, DataType.DECIMAL);
        if ("id".equals(codeString))
            return new Enumeration<DataType>(this, DataType.ID);
        if ("instant".equals(codeString))
            return new Enumeration<DataType>(this, DataType.INSTANT);
        if ("integer".equals(codeString))
            return new Enumeration<DataType>(this, DataType.INTEGER);
        if ("markdown".equals(codeString))
            return new Enumeration<DataType>(this, DataType.MARKDOWN);
        if ("oid".equals(codeString))
            return new Enumeration<DataType>(this, DataType.OID);
        if ("positiveInt".equals(codeString))
            return new Enumeration<DataType>(this, DataType.POSITIVEINT);
        if ("string".equals(codeString))
            return new Enumeration<DataType>(this, DataType.STRING);
        if ("time".equals(codeString))
            return new Enumeration<DataType>(this, DataType.TIME);
        if ("unsignedInt".equals(codeString))
            return new Enumeration<DataType>(this, DataType.UNSIGNEDINT);
        if ("uri".equals(codeString))
            return new Enumeration<DataType>(this, DataType.URI);
        if ("uuid".equals(codeString))
            return new Enumeration<DataType>(this, DataType.UUID);
        if ("xhtml".equals(codeString))
            return new Enumeration<DataType>(this, DataType.XHTML);
        throw new FHIRException("Unknown DataType code '" + codeString + "'");
    }

    public String toCode(DataType code) {
        if (code == DataType.ADDRESS)
            return "Address";
        if (code == DataType.AGE)
            return "Age";
        if (code == DataType.ANNOTATION)
            return "Annotation";
        if (code == DataType.ATTACHMENT)
            return "Attachment";
        if (code == DataType.BACKBONEELEMENT)
            return "BackboneElement";
        if (code == DataType.CODEABLECONCEPT)
            return "CodeableConcept";
        if (code == DataType.CODING)
            return "Coding";
        if (code == DataType.CONTACTPOINT)
            return "ContactPoint";
        if (code == DataType.COUNT)
            return "Count";
        if (code == DataType.DISTANCE)
            return "Distance";
        if (code == DataType.DURATION)
            return "Duration";
        if (code == DataType.ELEMENT)
            return "Element";
        if (code == DataType.ELEMENTDEFINITION)
            return "ElementDefinition";
        if (code == DataType.EXTENSION)
            return "Extension";
        if (code == DataType.HUMANNAME)
            return "HumanName";
        if (code == DataType.IDENTIFIER)
            return "Identifier";
        if (code == DataType.META)
            return "Meta";
        if (code == DataType.MONEY)
            return "Money";
        if (code == DataType.NARRATIVE)
            return "Narrative";
        if (code == DataType.PERIOD)
            return "Period";
        if (code == DataType.QUANTITY)
            return "Quantity";
        if (code == DataType.RANGE)
            return "Range";
        if (code == DataType.RATIO)
            return "Ratio";
        if (code == DataType.REFERENCE)
            return "Reference";
        if (code == DataType.SAMPLEDDATA)
            return "SampledData";
        if (code == DataType.SIGNATURE)
            return "Signature";
        if (code == DataType.SIMPLEQUANTITY)
            return "SimpleQuantity";
        if (code == DataType.TIMING)
            return "Timing";
        if (code == DataType.BASE64BINARY)
            return "base64Binary";
        if (code == DataType.BOOLEAN)
            return "boolean";
        if (code == DataType.CODE)
            return "code";
        if (code == DataType.DATE)
            return "date";
        if (code == DataType.DATETIME)
            return "dateTime";
        if (code == DataType.DECIMAL)
            return "decimal";
        if (code == DataType.ID)
            return "id";
        if (code == DataType.INSTANT)
            return "instant";
        if (code == DataType.INTEGER)
            return "integer";
        if (code == DataType.MARKDOWN)
            return "markdown";
        if (code == DataType.OID)
            return "oid";
        if (code == DataType.POSITIVEINT)
            return "positiveInt";
        if (code == DataType.STRING)
            return "string";
        if (code == DataType.TIME)
            return "time";
        if (code == DataType.UNSIGNEDINT)
            return "unsignedInt";
        if (code == DataType.URI)
            return "uri";
        if (code == DataType.UUID)
            return "uuid";
        if (code == DataType.XHTML)
            return "xhtml";
        return "?";
    }
}
