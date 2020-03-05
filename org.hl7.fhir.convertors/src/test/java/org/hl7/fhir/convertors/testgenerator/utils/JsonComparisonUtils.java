package org.hl7.fhir.convertors.testgenerator.utils;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.Map;

public class JsonComparisonUtils {

    public static MapDifference<String, Object> compareJson(Map<String, Object> leftMap, Map<String, Object> rightMap) {
        Map<String, Object> leftFlatMap = FlatMapUtil.flatten(leftMap);
        Map<String, Object> rightFlatMap = FlatMapUtil.flatten(rightMap);
        MapDifference<String, Object> difference = Maps.difference(leftFlatMap, rightFlatMap);
        return difference;
    }

    public static String getPrettyPrintOutput(MapDifference<String, Object> difference) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Entries existing only before conversion\n--------------------------");
        difference.entriesOnlyOnLeft().forEach((key, value) -> sb.append("\n" + key + ": " + value));

        sb.append("\n\nEntries existing only after conversion\n--------------------------");
        difference.entriesOnlyOnRight().forEach((key, value) -> sb.append("\n" + key + ": " + value));

        sb.append("\n\nEntries differing\n--------------------------");
        difference.entriesDiffering().forEach((key, value) -> sb.append("\n" + key + ": " + value));

        return sb.toString();
    }

    public static int getTotalDifferenceCount(MapDifference<String, Object> difference) {
        return difference.entriesOnlyOnLeft().size() + difference.entriesOnlyOnRight().size() + difference.entriesDiffering().size();
    }
}
