package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hl7.fhir.dstu2.utils.IWorkerContext;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Kind;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.KindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Operation;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.OperationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.CollectionStatus;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.CollectionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.Function;
import org.hl7.fhir.android.generated.dstu2.ExpressionNodeEnum.FunctionEnumFactory;

public class SourceLocation {

    private int line;

    private int column;

    public SourceLocation(int line, int column) {
        super();
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String toString() {
        return Integer.toString(line) + ", " + Integer.toString(column);
    }
}
