package org.hl7.fhir.r5.validation.parser.parserutils;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.model.resolution.TypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

public class ParserUtils {

    /**
     * Loads a class using the {@link CompilationUnit} passed in and returns the resulting declaration for parsing. This
     * class must exist within the directory parsed originally in {@link #initializeParser(String)}
     *
     * @param cu        {@link CompilationUnit}
     * @param classname {@link String} The name of the class to load.
     * @return {@link ClassOrInterfaceDeclaration} for the named class.
     */
    protected static ClassOrInterfaceDeclaration loadClass(CompilationUnit cu, String classname) {
        Optional<ClassOrInterfaceDeclaration> classByName = cu.getClassByName(classname);
        if (classByName.isPresent()) {
            return classByName.get();
        } else {
            return null;
        }
    }

    /**
     * Initializes and returns the {@link CompilationUnit} for the file located at the passed in fully qualified path.
     *
     * @param filePathWithExtension the fully qualified path the file.
     * @return {@link CompilationUnit}
     */
    public static CompilationUnit getCompilationUnit(String filePathWithExtension) {
        Optional<CompilationUnit> compilationUnit = initializeParser(filePathWithExtension);
        if (!compilationUnit.isPresent()) {
            System.out.println("\nNo compilation unit generated during class parsing...aborting.");
            System.exit(0);
        }
        return compilationUnit.get();
    }

    /**
     * Initializes the parser and runs it against the file located at the passed in path.
     *
     * @param path {@link String} path to the file.
     * @return {@link Optional <CompilationUnit>}
     */
    private static Optional<CompilationUnit> initializeParser(String path) {
        CompilationUnit compilationUnit = null;
        try {
            compilationUnit = StaticJavaParser.parse(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(compilationUnit);
    }

    public static ClassOrInterfaceDeclaration initializeTypeSovlerAndParser(CompilationUnit compilationUnit,
                                                                             String projectDirectory,
                                                                             String filename) {
        try {
            initializeResolver(projectDirectory);
        } catch (IOException e) {
            System.out.println("Error initializing typesolver, exiting process...");
            e.printStackTrace();
            System.exit(0);
        }

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = loadClass(compilationUnit, filename);
        if (classOrInterfaceDeclaration == null) {
            System.out.println("\nNo class or interface declaration loaded during parsing...aborting.");
            System.exit(0);
        }
        return classOrInterfaceDeclaration;
    }

    /**
     * The parser works by listing method calls within the individual resource conversion methods as
     * {@link MethodCallExpr}. To extract the information we need to refactor the code,
     * such as method body, references, signature, etc, we rely on the javaparser {@link TypeSolver} to parse the code
     * library and convert the expressions to concrete {@link MethodDeclaration}.
     * <p>
     * NB. The more source files in the directory you pass in (this will search recursively), the longer the
     * MethodDeclaration lookups will take. Be smart, choose S-Mart.
     *
     * @param rootProjectDirectory
     * @param projectDirectory     {@link String} path to the directory that contains the souce files we want to be available for
     */
    public static void initializeResolver(String rootProjectDirectory) throws IOException {
        TypeSolver myTypeSolver = new CombinedTypeSolver(
                new ReflectionTypeSolver(),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.convertors/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.utilities/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.dstu2/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.dstu3/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.dstu2016may/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.r4/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.r5/src/main/java/")),
                new JavaParserTypeSolver(new File(rootProjectDirectory + "/org.hl7.fhir.validation/src/main/java/")),
                new JarTypeSolver("/Users/markiantorno/.m2/repository/ca/uhn/hapi/fhir/hapi-fhir-structures-r4/4.1.0/hapi-fhir-structures-r4-4.1.0.jar"),
                new JarTypeSolver("/Users/markiantorno/.m2/repository/ca/uhn/hapi/fhir/hapi-fhir-base/4.1.0/hapi-fhir-base-4.1.0.jar")
        );

        JavaSymbolSolver symbolSolver = new JavaSymbolSolver(myTypeSolver);
        StaticJavaParser.getConfiguration().setSymbolResolver(symbolSolver);
    }

}
