package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hl7.fhir.dstu2.utils.IWorkerContext;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.CollectionStatus;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.CollectionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Kind;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.KindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Function;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.FunctionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Operation;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.OperationEnumFactory;

public class TypeDetails {

    public String toString() {
        return (collectionStatus == null ? "" : collectionStatus.toString()) + (types == null ? "[]" : types.toString());
    }

    private Set<String> types = new HashSet<String>();

    private CollectionStatus collectionStatus;

    public TypeDetails(CollectionStatus collectionStatus, String... names) {
        super();
        this.collectionStatus = collectionStatus;
        for (String n : names) this.types.add(n);
    }

    public TypeDetails(CollectionStatus collectionStatus, Set<String> names) {
        super();
        this.collectionStatus = collectionStatus;
        for (String n : names) this.types.add(n);
    }

    public void addType(String n) {
        this.types.add(n);
    }

    public void addTypes(Collection<String> n) {
        this.types.addAll(n);
    }

    public boolean hasType(IWorkerContext context, String... tn) {
        for (String t : tn) if (types.contains(t))
            return true;
        for (String t : tn) {
            StructureDefinition sd = context.fetchTypeDefinition(t);
            while (sd != null) {
                if (types.contains(sd.getId()))
                    return true;
                if (sd.hasBase())
                    sd = context.fetchResource(StructureDefinition.class, sd.getBase());
                else
                    sd = null;
            }
        }
        return false;
    }

    public void update(TypeDetails source) {
        types.addAll(source.types);
        if (collectionStatus == null)
            collectionStatus = source.collectionStatus;
        else if (source.collectionStatus == CollectionStatus.UNORDERED)
            collectionStatus = source.collectionStatus;
        else
            collectionStatus = CollectionStatus.ORDERED;
    }

    public TypeDetails union(TypeDetails right) {
        TypeDetails result = new TypeDetails(null);
        if (right.collectionStatus == CollectionStatus.UNORDERED || collectionStatus == CollectionStatus.UNORDERED)
            result.collectionStatus = CollectionStatus.UNORDERED;
        else
            result.collectionStatus = CollectionStatus.ORDERED;
        result.types.addAll(types);
        result.types.addAll(right.types);
        return result;
    }

    public boolean hasNoTypes() {
        return types.isEmpty();
    }

    public Set<String> getTypes() {
        return types;
    }

    public TypeDetails toSingleton() {
        TypeDetails result = new TypeDetails(CollectionStatus.SINGLETON);
        result.types.addAll(types);
        return result;
    }

    public CollectionStatus getCollectionStatus() {
        return collectionStatus;
    }

    public boolean hasType(Set<String> tn) {
        for (String t : tn) if (types.contains(t))
            return true;
        return false;
    }

    public String describe() {
        return types.toString();
    }

    public String getType() {
        for (String t : types) return t;
        return null;
    }
}
