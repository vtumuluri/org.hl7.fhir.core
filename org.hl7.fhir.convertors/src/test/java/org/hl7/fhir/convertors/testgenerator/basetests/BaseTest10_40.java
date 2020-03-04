package org.hl7.fhir.convertors.testgenerator.basetests;

import org.hl7.fhir.convertors.VersionConvertor_10_40;

public abstract class BaseTest10_40 extends BaseTest {

    protected static org.hl7.fhir.dstu2.model.Resource roundTrip(org.hl7.fhir.dstu2.model.Resource src) {
        org.hl7.fhir.r4.model.Resource r4 = VersionConvertor_10_40.convertResource(src);
        return VersionConvertor_10_40.convertResource(r4);
    }

    protected static org.hl7.fhir.r4.model.Resource roundTrip(org.hl7.fhir.r4.model.Resource src) {
        org.hl7.fhir.dstu2.model.Resource dstu2 = VersionConvertor_10_40.convertResource(src);
        return VersionConvertor_10_40.convertResource(dstu2);
    }
}
