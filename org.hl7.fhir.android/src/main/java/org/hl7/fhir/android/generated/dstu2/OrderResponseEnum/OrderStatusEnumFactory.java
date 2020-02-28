package org.hl7.fhir.android.generated.dstu2.OrderResponseEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class OrderStatusEnumFactory implements EnumFactory<OrderStatus> {

    public OrderStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("pending".equals(codeString))
            return OrderStatus.PENDING;
        if ("review".equals(codeString))
            return OrderStatus.REVIEW;
        if ("rejected".equals(codeString))
            return OrderStatus.REJECTED;
        if ("error".equals(codeString))
            return OrderStatus.ERROR;
        if ("accepted".equals(codeString))
            return OrderStatus.ACCEPTED;
        if ("cancelled".equals(codeString))
            return OrderStatus.CANCELLED;
        if ("replaced".equals(codeString))
            return OrderStatus.REPLACED;
        if ("aborted".equals(codeString))
            return OrderStatus.ABORTED;
        if ("completed".equals(codeString))
            return OrderStatus.COMPLETED;
        throw new IllegalArgumentException("Unknown OrderStatus code '" + codeString + "'");
    }

    public Enumeration<OrderStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("pending".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.PENDING);
        if ("review".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.REVIEW);
        if ("rejected".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.REJECTED);
        if ("error".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.ERROR);
        if ("accepted".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.ACCEPTED);
        if ("cancelled".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.CANCELLED);
        if ("replaced".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.REPLACED);
        if ("aborted".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.ABORTED);
        if ("completed".equals(codeString))
            return new Enumeration<OrderStatus>(this, OrderStatus.COMPLETED);
        throw new FHIRException("Unknown OrderStatus code '" + codeString + "'");
    }

    public String toCode(OrderStatus code) {
        if (code == OrderStatus.PENDING)
            return "pending";
        if (code == OrderStatus.REVIEW)
            return "review";
        if (code == OrderStatus.REJECTED)
            return "rejected";
        if (code == OrderStatus.ERROR)
            return "error";
        if (code == OrderStatus.ACCEPTED)
            return "accepted";
        if (code == OrderStatus.CANCELLED)
            return "cancelled";
        if (code == OrderStatus.REPLACED)
            return "replaced";
        if (code == OrderStatus.ABORTED)
            return "aborted";
        if (code == OrderStatus.COMPLETED)
            return "completed";
        return "?";
    }
}
