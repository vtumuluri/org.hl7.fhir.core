package org.hl7.fhir.r5.validation.parser.parserutils;

public class FhirUtils {

    /**
     * Returns the String representing the FHIR version from the import statement.
     * @param importStatement The full import statment for the given dependency, as a {@link String}
     * @return String representation of FHIR version, ie: "dtsu2"
     */
    public static String getVersionIdString(String importStatement) {
        String placeholder = null;
        if (importStatement.contains("dstu2016may")) {
            placeholder = "dstu2016may";
        } else if (importStatement.contains("dstu2")) {
            placeholder = "dstu2";
        } else if (importStatement.contains("dstu3")) {
            placeholder = "dstu3";
        } else if (importStatement.contains("r4")) {
            placeholder = "r4";
        } else if (importStatement.contains("r5")) {
            placeholder = "r5";
        }

        return placeholder;
    }

}
