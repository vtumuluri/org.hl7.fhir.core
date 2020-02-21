package org.hl7.fhir.r5.validation.parser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.hl7.fhir.r5.validation.parser.parserutils.ParserUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class LocalizationParser {
    public static final String RULE = "rule";
    public static final String TXRULE = "txrule";
    public static final String WARNING = "warning";
    public static final String TXWARNING = "txwarning";
    public static final String HINT = "hint";
    public static final String TXHINT = "txhint";
    public static final String FAIL = "fail";

    private static final List<String> METHOD_NAMES = Arrays.asList(RULE, TXRULE, WARNING, TXWARNING, HINT, TXHINT, FAIL);

    public static int count = 0;

    public static void main(String[] args) {
        pullStringsFromMethodCalls("/org.hl7.fhir.validation/src/main/java/org/hl7/fhir/r5/validation/", "InstanceValidator", ".java");
    }

    public static void pullStringsFromMethodCalls(String srcdirectory, String filename, String extension) {
        String projectDirectory = new File("").getAbsolutePath();
        String filePathWithExtension = projectDirectory + srcdirectory + filename + extension;
        CompilationUnit compilationUnit = ParserUtils.getCompilationUnit(filePathWithExtension);
        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = ParserUtils.initializeTypeSovlerAndParser(compilationUnit,
                projectDirectory, filename);

        classOrInterfaceDeclaration.getMethods().forEach(md -> {
            md.accept(new VoidVisitorAdapter<Void>() {
                @Override
                public void visit(MethodCallExpr n, Void arg) {
                    super.visit(n, arg);
                    if (n.getNameAsString().equals(RULE)){
                        count();
                        System.out.println(n.toString());
                    }
                }
            }, null);
        });
        System.out.println("rule uses -> " + count);
    }

    public static void count() {
        count++;
    }
}
