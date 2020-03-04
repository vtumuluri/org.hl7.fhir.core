package org.hl7.fhir.convertors.testgenerator.utils;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.convertors.VersionConvertor_14_40;
import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.convertors.VersionConvertor_40_50;
import org.hl7.fhir.instance.model.api.IBaseResource;

public class VersionUtils {

    public static org.hl7.fhir.dstu2.model.Resource convertTo_dstu2(org.hl7.fhir.r4.model.Resource resource) {
        return VersionConvertor_10_40.convertResource(resource);
    }

    public static org.hl7.fhir.dstu2016may.model.Resource convertTo_dstu2016may(org.hl7.fhir.r4.model.Resource resource) {
        return VersionConvertor_14_40.convertResource(resource);
    }

    public static org.hl7.fhir.dstu3.model.Resource convertTo_dstu3(org.hl7.fhir.r4.model.Resource resource) {
        return VersionConvertor_30_40.convertResource(resource, true);
    }

    public static org.hl7.fhir.r4.model.Resource convertTo_r4(org.hl7.fhir.r4.model.Resource resource) {
        return resource;
    }

    public static org.hl7.fhir.r5.model.Resource convertTo_r5(org.hl7.fhir.r4.model.Resource resource) {
        return VersionConvertor_40_50.convertResource(resource);
    }

}
