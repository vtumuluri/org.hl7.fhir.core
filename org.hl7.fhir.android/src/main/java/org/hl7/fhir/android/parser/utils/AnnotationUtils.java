package org.hl7.fhir.android.parser.utils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;


public class AnnotationUtils {

  public static final String ANNOTATION_IMPORT = "ca.uhn.fhir.model.api.annotation.";

  public static void sanitizeAllClassAnnotations(CompilationUnit compilationUnit) {
    removeAllClassAnnotations(compilationUnit);
    removeAllMethodAnnotations(compilationUnit);
    removeAllFieldAnnotations(compilationUnit);
    removeFhirAnnotationImports(compilationUnit);
  }

  /**
   * Removes all annotations related to the fhir annotation library from the list of imports of the passed in
   * {@link CompilationUnit}
   *
   * @param compilationUnit {@link CompilationUnit} to remove imports from.
   */
  private static void removeFhirAnnotationImports(CompilationUnit compilationUnit) {
    NodeList<ImportDeclaration> imports = new NodeList<>();

    for (ImportDeclaration importDeclaration : compilationUnit.getImports()) {
      if (!importDeclaration.toString().contains(ANNOTATION_IMPORT)) {
        imports.add(importDeclaration);
      }
    }

    compilationUnit.setImports(imports);
  }

  /**
   * Goes through the given class and removes all annotations from each of it's {@link MethodDeclaration}
   *
   * @param compilationUnit {@link CompilationUnit} to search for {@link MethodDeclaration} to modify.
   */
  private static void removeAllMethodAnnotations(CompilationUnit compilationUnit) {
    compilationUnit.accept(new ModifierVisitor<Void>() {
      @Override
      public Visitable visit(MethodDeclaration m, Void arg) {
        super.visit(m, arg);
        m.setAnnotations(new NodeList<>());
        return m;
      }
    }, null);
  }

  /**
   * Goes through the given class and removes all annotations from each of it's {@link ClassOrInterfaceDeclaration}
   *
   * @param compilationUnit {@link CompilationUnit} to search for {@link ClassOrInterfaceDeclaration} to modify.
   */
  private static void removeAllClassAnnotations(CompilationUnit compilationUnit) {
    compilationUnit.accept(new ModifierVisitor<Void>() {
      @Override
      public Visitable visit(ClassOrInterfaceDeclaration c, Void arg) {
        super.visit(c, arg);
        c.setAnnotations(new NodeList<>());
        return c;
      }
    }, null);
  }

  /**
   * Goes through the given class and removes all annotations from each of it's {@link FieldDeclaration}
   *
   * @param compilationUnit {@link CompilationUnit} to search for {@link ClassOrInterfaceDeclaration} to modify.
   */
  private static void removeAllFieldAnnotations(CompilationUnit compilationUnit) {
    compilationUnit.accept(new ModifierVisitor<Void>() {
      @Override
      public Visitable visit(FieldDeclaration f, Void arg) {
        super.visit(f, arg);
        f.setAnnotations(new NodeList<>());
        return f;
      }
    }, null);
  }

}
