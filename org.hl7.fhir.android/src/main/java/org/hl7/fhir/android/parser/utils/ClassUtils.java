package org.hl7.fhir.android.parser.utils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassUtils {

    public static final String PACKAGE_DECLARATION_BASE_CLASS = "org.hl7.fhir.android.generated.%1$s";
    public static final String OLD_EXPLICIT_PACKAGE_DEC = "org.hl7.fhir.%1$s.model.";
    public static final String NEW_EXPLICIT_PACKAGE_DEC = "org.hl7.fhir.android.generated.%1$s.";


    /**
     * Searched the passed in {@link ClassOrInterfaceDeclaration} for all Enum classes and extracts them into a new java
     * file. In addition to extracting the found enum files, we also search for the associated EnumFactoryClass
     *
     * @param c The {@link ClassOrInterfaceDeclaration} to search
     */
    public static void extractInnerClasses(CompilationUnit baseCompilationUnit, ClassOrInterfaceDeclaration c, String destinationDirectory, String fhirVersion) throws IOException {

        String projectDirectory = new File("").getAbsolutePath();

        Set<ClassOrInterfaceDeclaration> foundClasses = getClassDeclarations(c);
        final String targetDirectory = projectDirectory + destinationDirectory;
        String fileContent = baseCompilationUnit.toString();

        removeExplicitEnumerationClassRef(baseCompilationUnit, fhirVersion);

        if (!foundClasses.isEmpty()) {
            // Enums exist within this class, we need to extract them, and their corresponding EnumFactories to separate files
            for (ClassOrInterfaceDeclaration dec : foundClasses) {
                fileContent = generateClassString(baseCompilationUnit, fhirVersion, targetDirectory, dec);
                baseCompilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
                String contentsWithOldPackageRefsRemoved = removeExplicitPackageReferences(fileContent, fhirVersion);
                FileUtils.writeStringToFile(contentsWithOldPackageRefsRemoved, targetDirectory + dec.getNameAsString() + ".java");
            }
        }
    }

    private static void removeExplicitEnumerationClassRef(CompilationUnit baseCompilationUnit, String fhirVersion) {
        NodeList<ImportDeclaration> imports = new NodeList<>();
        for (ImportDeclaration i : baseCompilationUnit.getImports()) {
            if (i.getNameAsString().contains(".Enumerations.")) {
                String replace = i.getNameAsString().replace(".Enumerations.", ".EnumerationsEnum.");
                imports.add(new ImportDeclaration(replace, false, false));
            } else {
                imports.add(i);
            }
        }
        baseCompilationUnit.setImports(imports);
    }

    /**
     * Generates the new class, and removes the current {@link ClassOrInterfaceDeclaration} from the containing
     * {@link ClassOrInterfaceDeclaration}
     *
     * @param baseCompilationUnit
     * @param fhirVersion
     * @param targetDirectory
     * @param c
     * @throws IOException
     */
    public static String generateClassString(CompilationUnit baseCompilationUnit, String fhirVersion, String targetDirectory, ClassOrInterfaceDeclaration c) throws IOException {
        CompilationUnit compilationUnit = new CompilationUnit();
        ClassOrInterfaceDeclaration generatedClass = compilationUnit.addClass(c.getNameAsString());
        ParserUtils.copyClassOrInterfaceDeclaration(c, generatedClass);
        baseCompilationUnit.getImports().forEach(compilationUnit::addImport);
        compilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
        generatedClass.setModifier(Modifier.Keyword.STATIC, false);
        c.remove();
        return compilationUnit.toString();
    }

    /**
     * Searches the passes in compilation unit for explicit package references to the old version of the FHIR Model files,
     * and then removes them. (We shouldn't need to keep them in, as we've flattened the folder structure.
     *
     * @param fileContents       {@link String} to search.
     * @param currentFhirVersion {@link String} the current fhir version string we will use to construct the search string. ie
     *                           "dstu2" -> org.hl7.fhir.dstu2.model.
     * @return The resulting String body of the parsed {@link CompilationUnit}
     */
    public static String removeExplicitPackageReferences(String fileContents, String currentFhirVersion) {
        return fileContents.replaceAll(String.format(OLD_EXPLICIT_PACKAGE_DEC, currentFhirVersion), String.format(NEW_EXPLICIT_PACKAGE_DEC, currentFhirVersion));
    }

    /**
     * Searches the passed in {@link ClassOrInterfaceDeclaration} for all {@link ClassOrInterfaceDeclaration} and returns
     * them in a {@link List}
     *
     * @param c {@link ClassOrInterfaceDeclaration} to search within
     * @return {@link List<ClassOrInterfaceDeclaration>}
     */
    public static Set<ClassOrInterfaceDeclaration> getClassDeclarations(ClassOrInterfaceDeclaration c) {
        Set<ClassOrInterfaceDeclaration> foundClasses = new HashSet<>();

        c.accept(new ModifierVisitor<Void>() {
            @Override
            public Visitable visit(ClassOrInterfaceDeclaration classDec, Void arg) {
                super.visit(classDec, arg);
                // We don't want to pull the containing class as one of our declarations
                if (!classDec.getNameAsString().equals(c.getNameAsString())) {
                    foundClasses.add(classDec);
                }
                System.out.println(classDec.getNameAsString());
                return classDec;
            }
        }, null);

        return foundClasses;
    }

}
