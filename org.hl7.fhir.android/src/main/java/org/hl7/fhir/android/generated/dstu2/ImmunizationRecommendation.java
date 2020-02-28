package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
/**
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
public class ImmunizationRecommendation extends DomainResource {

    /**
     * A unique identifier assigned to this particular recommendation record.
     */
    protected List<Identifier> identifier;

    /**
     * The patient for whom the recommendations are for.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient for whom the recommendations are for.)
     */
    protected Patient patientTarget;

    /**
     * Vaccine administration recommendations.
     */
    protected List<ImmunizationRecommendationRecommendationComponent> recommendation;

    private static final long serialVersionUID = 641058495L;

    /*
   * Constructor
   */
    public ImmunizationRecommendation() {
        super();
    }

    /*
   * Constructor
   */
    public ImmunizationRecommendation(Reference patient) {
        super();
        this.patient = patient;
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this particular recommendation record.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this particular recommendation record.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationRecommendation addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (The patient for whom the recommendations are for.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendation.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient for whom the recommendations are for.)
     */
    public ImmunizationRecommendation setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient for whom the recommendations are for.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendation.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient for whom the recommendations are for.)
     */
    public ImmunizationRecommendation setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #recommendation} (Vaccine administration recommendations.)
     */
    public List<ImmunizationRecommendationRecommendationComponent> getRecommendation() {
        if (this.recommendation == null)
            this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
        return this.recommendation;
    }

    public boolean hasRecommendation() {
        if (this.recommendation == null)
            return false;
        for (ImmunizationRecommendationRecommendationComponent item : this.recommendation) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #recommendation} (Vaccine administration recommendations.)
     */
    // syntactic sugar
    public ImmunizationRecommendationRecommendationComponent addRecommendation() {
        // 3
        ImmunizationRecommendationRecommendationComponent t = new ImmunizationRecommendationRecommendationComponent();
        if (this.recommendation == null)
            this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
        this.recommendation.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationRecommendation addRecommendation(ImmunizationRecommendationRecommendationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.recommendation == null)
            this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
        this.recommendation.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A unique identifier assigned to this particular recommendation record.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient for whom the recommendations are for.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("recommendation", "", "Vaccine administration recommendations.", 0, java.lang.Integer.MAX_VALUE, recommendation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("recommendation"))
            this.getRecommendation().add((ImmunizationRecommendationRecommendationComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("recommendation")) {
            return addRecommendation();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ImmunizationRecommendation";
    }

    public ImmunizationRecommendation copy() {
        ImmunizationRecommendation dst = new ImmunizationRecommendation();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        if (recommendation != null) {
            dst.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
            for (ImmunizationRecommendationRecommendationComponent i : recommendation) dst.recommendation.add(i.copy());
        }
        ;
        return dst;
    }

    protected ImmunizationRecommendation typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationRecommendation))
            return false;
        ImmunizationRecommendation o = (ImmunizationRecommendation) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(recommendation, o.recommendation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationRecommendation))
            return false;
        ImmunizationRecommendation o = (ImmunizationRecommendation) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty()) && (recommendation == null || recommendation.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ImmunizationRecommendation;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_DOSESEQUENCE = "dose-sequence";

    public static final String SP_PATIENT = "patient";

    public static final String SP_VACCINETYPE = "vaccine-type";

    public static final String SP_DOSENUMBER = "dose-number";

    public static final String SP_INFORMATION = "information";

    public static final String SP_SUPPORT = "support";

    public static final String SP_STATUS = "status";
}
