package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatus;

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
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrder extends DomainResource {

    /**
     * The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.)
     */
    protected Patient patientTarget;

    /**
     * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
     */
    protected Reference orderer;

    /**
     * The actual object that is the target of the reference (The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.)
     */
    protected Practitioner ordererTarget;

    /**
     * Identifiers assigned to this order by the order sender or by the order receiver.
     */
    protected List<Identifier> identifier;

    /**
     * An encounter that provides additional information about the healthcare context in which this request is made.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    protected Encounter encounterTarget;

    /**
     * The date and time that this nutrition order was requested.
     */
    protected DateTimeType dateTime;

    /**
     * The workflow status of the nutrition order/request.
     */
    protected Enumeration<NutritionOrderStatus> status;

    /**
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     */
    protected List<Reference> allergyIntolerance;

    /**
     * The actual objects that are the target of the reference (A link to a record of allergies or intolerances  which should be included in the nutrition order.)
     */
    protected List<AllergyIntolerance> allergyIntoleranceTarget;

    /**
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     */
    protected List<CodeableConcept> foodPreferenceModifier;

    /**
     * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     */
    protected List<CodeableConcept> excludeFoodModifier;

    /**
     * Diet given orally in contrast to enteral (tube) feeding.
     */
    protected NutritionOrderOralDietComponent oralDiet;

    /**
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     */
    protected List<NutritionOrderSupplementComponent> supplement;

    /**
     * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
     */
    protected NutritionOrderEnteralFormulaComponent enteralFormula;

    private static final long serialVersionUID = 1139624085L;

    /*
   * Constructor
   */
    public NutritionOrder() {
        super();
    }

    /*
   * Constructor
   */
    public NutritionOrder(Reference patient, DateTimeType dateTime) {
        super();
        this.patient = patient;
        this.dateTime = dateTime;
    }

    /**
     * @return {@link #patient} (The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.)
     */
    public NutritionOrder setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.)
     */
    public NutritionOrder setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #orderer} (The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.)
     */
    public Reference getOrderer() {
        if (this.orderer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.orderer");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderer = new Reference();
        return this.orderer;
    }

    public boolean hasOrderer() {
        return this.orderer != null && !this.orderer.isEmpty();
    }

    /**
     * @param value {@link #orderer} (The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.)
     */
    public NutritionOrder setOrderer(Reference value) {
        this.orderer = value;
        return this;
    }

    /**
     * @return {@link #orderer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.)
     */
    public Practitioner getOrdererTarget() {
        if (this.ordererTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.orderer");
            else if (Configuration.doAutoCreate())
                // aa
                this.ordererTarget = new Practitioner();
        return this.ordererTarget;
    }

    /**
     * @param value {@link #orderer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.)
     */
    public NutritionOrder setOrdererTarget(Practitioner value) {
        this.ordererTarget = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order by the order sender or by the order receiver.)
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
     * @return {@link #identifier} (Identifiers assigned to this order by the order sender or by the order receiver.)
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
    public NutritionOrder addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #encounter} (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public NutritionOrder setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public NutritionOrder setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #dateTime} (The date and time that this nutrition order was requested.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public DateTimeType getDateTimeElement() {
        if (this.dateTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.dateTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateTime = new DateTimeType();
        return this.dateTime;
    }

    public boolean hasDateTimeElement() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    public boolean hasDateTime() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    /**
     * @param value {@link #dateTime} (The date and time that this nutrition order was requested.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public NutritionOrder setDateTimeElement(DateTimeType value) {
        this.dateTime = value;
        return this;
    }

    /**
     * @return The date and time that this nutrition order was requested.
     */
    public Date getDateTime() {
        return this.dateTime == null ? null : this.dateTime.getValue();
    }

    /**
     * @param value The date and time that this nutrition order was requested.
     */
    public NutritionOrder setDateTime(Date value) {
        if (this.dateTime == null)
            this.dateTime = new DateTimeType();
        this.dateTime.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The workflow status of the nutrition order/request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<NutritionOrderStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<NutritionOrderStatus>(new NutritionOrderStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The workflow status of the nutrition order/request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public NutritionOrder setStatusElement(Enumeration<NutritionOrderStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The workflow status of the nutrition order/request.
     */
    public NutritionOrderStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The workflow status of the nutrition order/request.
     */
    public NutritionOrder setStatus(NutritionOrderStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<NutritionOrderStatus>(new NutritionOrderStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #allergyIntolerance} (A link to a record of allergies or intolerances  which should be included in the nutrition order.)
     */
    public List<Reference> getAllergyIntolerance() {
        if (this.allergyIntolerance == null)
            this.allergyIntolerance = new ArrayList<Reference>();
        return this.allergyIntolerance;
    }

    public boolean hasAllergyIntolerance() {
        if (this.allergyIntolerance == null)
            return false;
        for (Reference item : this.allergyIntolerance) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #allergyIntolerance} (A link to a record of allergies or intolerances  which should be included in the nutrition order.)
     */
    // syntactic sugar
    public Reference addAllergyIntolerance() {
        // 3
        Reference t = new Reference();
        if (this.allergyIntolerance == null)
            this.allergyIntolerance = new ArrayList<Reference>();
        this.allergyIntolerance.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrder addAllergyIntolerance(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.allergyIntolerance == null)
            this.allergyIntolerance = new ArrayList<Reference>();
        this.allergyIntolerance.add(t);
        return this;
    }

    /**
     * @return {@link #allergyIntolerance} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A link to a record of allergies or intolerances  which should be included in the nutrition order.)
     */
    public List<AllergyIntolerance> getAllergyIntoleranceTarget() {
        if (this.allergyIntoleranceTarget == null)
            this.allergyIntoleranceTarget = new ArrayList<AllergyIntolerance>();
        return this.allergyIntoleranceTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #allergyIntolerance} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A link to a record of allergies or intolerances  which should be included in the nutrition order.)
     */
    public AllergyIntolerance addAllergyIntoleranceTarget() {
        AllergyIntolerance r = new AllergyIntolerance();
        if (this.allergyIntoleranceTarget == null)
            this.allergyIntoleranceTarget = new ArrayList<AllergyIntolerance>();
        this.allergyIntoleranceTarget.add(r);
        return r;
    }

    /**
     * @return {@link #foodPreferenceModifier} (This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.)
     */
    public List<CodeableConcept> getFoodPreferenceModifier() {
        if (this.foodPreferenceModifier == null)
            this.foodPreferenceModifier = new ArrayList<CodeableConcept>();
        return this.foodPreferenceModifier;
    }

    public boolean hasFoodPreferenceModifier() {
        if (this.foodPreferenceModifier == null)
            return false;
        for (CodeableConcept item : this.foodPreferenceModifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #foodPreferenceModifier} (This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.)
     */
    // syntactic sugar
    public CodeableConcept addFoodPreferenceModifier() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.foodPreferenceModifier == null)
            this.foodPreferenceModifier = new ArrayList<CodeableConcept>();
        this.foodPreferenceModifier.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrder addFoodPreferenceModifier(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.foodPreferenceModifier == null)
            this.foodPreferenceModifier = new ArrayList<CodeableConcept>();
        this.foodPreferenceModifier.add(t);
        return this;
    }

    /**
     * @return {@link #excludeFoodModifier} (This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.)
     */
    public List<CodeableConcept> getExcludeFoodModifier() {
        if (this.excludeFoodModifier == null)
            this.excludeFoodModifier = new ArrayList<CodeableConcept>();
        return this.excludeFoodModifier;
    }

    public boolean hasExcludeFoodModifier() {
        if (this.excludeFoodModifier == null)
            return false;
        for (CodeableConcept item : this.excludeFoodModifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #excludeFoodModifier} (This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.)
     */
    // syntactic sugar
    public CodeableConcept addExcludeFoodModifier() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.excludeFoodModifier == null)
            this.excludeFoodModifier = new ArrayList<CodeableConcept>();
        this.excludeFoodModifier.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrder addExcludeFoodModifier(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.excludeFoodModifier == null)
            this.excludeFoodModifier = new ArrayList<CodeableConcept>();
        this.excludeFoodModifier.add(t);
        return this;
    }

    /**
     * @return {@link #oralDiet} (Diet given orally in contrast to enteral (tube) feeding.)
     */
    public NutritionOrderOralDietComponent getOralDiet() {
        if (this.oralDiet == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.oralDiet");
            else if (Configuration.doAutoCreate())
                // cc
                this.oralDiet = new NutritionOrderOralDietComponent();
        return this.oralDiet;
    }

    public boolean hasOralDiet() {
        return this.oralDiet != null && !this.oralDiet.isEmpty();
    }

    /**
     * @param value {@link #oralDiet} (Diet given orally in contrast to enteral (tube) feeding.)
     */
    public NutritionOrder setOralDiet(NutritionOrderOralDietComponent value) {
        this.oralDiet = value;
        return this;
    }

    /**
     * @return {@link #supplement} (Oral nutritional products given in order to add further nutritional value to the patient's diet.)
     */
    public List<NutritionOrderSupplementComponent> getSupplement() {
        if (this.supplement == null)
            this.supplement = new ArrayList<NutritionOrderSupplementComponent>();
        return this.supplement;
    }

    public boolean hasSupplement() {
        if (this.supplement == null)
            return false;
        for (NutritionOrderSupplementComponent item : this.supplement) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #supplement} (Oral nutritional products given in order to add further nutritional value to the patient's diet.)
     */
    // syntactic sugar
    public NutritionOrderSupplementComponent addSupplement() {
        // 3
        NutritionOrderSupplementComponent t = new NutritionOrderSupplementComponent();
        if (this.supplement == null)
            this.supplement = new ArrayList<NutritionOrderSupplementComponent>();
        this.supplement.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrder addSupplement(NutritionOrderSupplementComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.supplement == null)
            this.supplement = new ArrayList<NutritionOrderSupplementComponent>();
        this.supplement.add(t);
        return this;
    }

    /**
     * @return {@link #enteralFormula} (Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.)
     */
    public NutritionOrderEnteralFormulaComponent getEnteralFormula() {
        if (this.enteralFormula == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrder.enteralFormula");
            else if (Configuration.doAutoCreate())
                // cc
                this.enteralFormula = new NutritionOrderEnteralFormulaComponent();
        return this.enteralFormula;
    }

    public boolean hasEnteralFormula() {
        return this.enteralFormula != null && !this.enteralFormula.isEmpty();
    }

    /**
     * @param value {@link #enteralFormula} (Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.)
     */
    public NutritionOrder setEnteralFormula(NutritionOrderEnteralFormulaComponent value) {
        this.enteralFormula = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("patient", "Reference(Patient)", "The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("orderer", "Reference(Practitioner)", "The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.", 0, java.lang.Integer.MAX_VALUE, orderer));
        childrenList.add(new Property("identifier", "Identifier", "Identifiers assigned to this order by the order sender or by the order receiver.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "An encounter that provides additional information about the healthcare context in which this request is made.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("dateTime", "dateTime", "The date and time that this nutrition order was requested.", 0, java.lang.Integer.MAX_VALUE, dateTime));
        childrenList.add(new Property("status", "code", "The workflow status of the nutrition order/request.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("allergyIntolerance", "Reference(AllergyIntolerance)", "A link to a record of allergies or intolerances  which should be included in the nutrition order.", 0, java.lang.Integer.MAX_VALUE, allergyIntolerance));
        childrenList.add(new Property("foodPreferenceModifier", "CodeableConcept", "This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.", 0, java.lang.Integer.MAX_VALUE, foodPreferenceModifier));
        childrenList.add(new Property("excludeFoodModifier", "CodeableConcept", "This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.", 0, java.lang.Integer.MAX_VALUE, excludeFoodModifier));
        childrenList.add(new Property("oralDiet", "", "Diet given orally in contrast to enteral (tube) feeding.", 0, java.lang.Integer.MAX_VALUE, oralDiet));
        childrenList.add(new Property("supplement", "", "Oral nutritional products given in order to add further nutritional value to the patient's diet.", 0, java.lang.Integer.MAX_VALUE, supplement));
        childrenList.add(new Property("enteralFormula", "", "Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.", 0, java.lang.Integer.MAX_VALUE, enteralFormula));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("orderer"))
            // Reference
            this.orderer = castToReference(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("dateTime"))
            // DateTimeType
            this.dateTime = castToDateTime(value);
        else if (name.equals("status"))
            // Enumeration<NutritionOrderStatus>
            this.status = new NutritionOrderStatusEnumFactory().fromType(value);
        else if (name.equals("allergyIntolerance"))
            this.getAllergyIntolerance().add(castToReference(value));
        else if (name.equals("foodPreferenceModifier"))
            this.getFoodPreferenceModifier().add(castToCodeableConcept(value));
        else if (name.equals("excludeFoodModifier"))
            this.getExcludeFoodModifier().add(castToCodeableConcept(value));
        else if (name.equals("oralDiet"))
            // NutritionOrderOralDietComponent
            this.oralDiet = (NutritionOrderOralDietComponent) value;
        else if (name.equals("supplement"))
            this.getSupplement().add((NutritionOrderSupplementComponent) value);
        else if (name.equals("enteralFormula"))
            // NutritionOrderEnteralFormulaComponent
            this.enteralFormula = (NutritionOrderEnteralFormulaComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("orderer")) {
            this.orderer = new Reference();
            return this.orderer;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("dateTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.dateTime");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.status");
        } else if (name.equals("allergyIntolerance")) {
            return addAllergyIntolerance();
        } else if (name.equals("foodPreferenceModifier")) {
            return addFoodPreferenceModifier();
        } else if (name.equals("excludeFoodModifier")) {
            return addExcludeFoodModifier();
        } else if (name.equals("oralDiet")) {
            this.oralDiet = new NutritionOrderOralDietComponent();
            return this.oralDiet;
        } else if (name.equals("supplement")) {
            return addSupplement();
        } else if (name.equals("enteralFormula")) {
            this.enteralFormula = new NutritionOrderEnteralFormulaComponent();
            return this.enteralFormula;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "NutritionOrder";
    }

    public NutritionOrder copy() {
        NutritionOrder dst = new NutritionOrder();
        copyValues(dst);
        dst.patient = patient == null ? null : patient.copy();
        dst.orderer = orderer == null ? null : orderer.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.dateTime = dateTime == null ? null : dateTime.copy();
        dst.status = status == null ? null : status.copy();
        if (allergyIntolerance != null) {
            dst.allergyIntolerance = new ArrayList<Reference>();
            for (Reference i : allergyIntolerance) dst.allergyIntolerance.add(i.copy());
        }
        ;
        if (foodPreferenceModifier != null) {
            dst.foodPreferenceModifier = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : foodPreferenceModifier) dst.foodPreferenceModifier.add(i.copy());
        }
        ;
        if (excludeFoodModifier != null) {
            dst.excludeFoodModifier = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : excludeFoodModifier) dst.excludeFoodModifier.add(i.copy());
        }
        ;
        dst.oralDiet = oralDiet == null ? null : oralDiet.copy();
        if (supplement != null) {
            dst.supplement = new ArrayList<NutritionOrderSupplementComponent>();
            for (NutritionOrderSupplementComponent i : supplement) dst.supplement.add(i.copy());
        }
        ;
        dst.enteralFormula = enteralFormula == null ? null : enteralFormula.copy();
        return dst;
    }

    protected NutritionOrder typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrder))
            return false;
        NutritionOrder o = (NutritionOrder) other;
        return compareDeep(patient, o.patient, true) && compareDeep(orderer, o.orderer, true) && compareDeep(identifier, o.identifier, true) && compareDeep(encounter, o.encounter, true) && compareDeep(dateTime, o.dateTime, true) && compareDeep(status, o.status, true) && compareDeep(allergyIntolerance, o.allergyIntolerance, true) && compareDeep(foodPreferenceModifier, o.foodPreferenceModifier, true) && compareDeep(excludeFoodModifier, o.excludeFoodModifier, true) && compareDeep(oralDiet, o.oralDiet, true) && compareDeep(supplement, o.supplement, true) && compareDeep(enteralFormula, o.enteralFormula, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrder))
            return false;
        NutritionOrder o = (NutritionOrder) other;
        return compareValues(dateTime, o.dateTime, true) && compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (patient == null || patient.isEmpty()) && (orderer == null || orderer.isEmpty()) && (identifier == null || identifier.isEmpty()) && (encounter == null || encounter.isEmpty()) && (dateTime == null || dateTime.isEmpty()) && (status == null || status.isEmpty()) && (allergyIntolerance == null || allergyIntolerance.isEmpty()) && (foodPreferenceModifier == null || foodPreferenceModifier.isEmpty()) && (excludeFoodModifier == null || excludeFoodModifier.isEmpty()) && (oralDiet == null || oralDiet.isEmpty()) && (supplement == null || supplement.isEmpty()) && (enteralFormula == null || enteralFormula.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.NutritionOrder;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_DATETIME = "datetime";

    public static final String SP_PROVIDER = "provider";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SUPPLEMENT = "supplement";

    public static final String SP_FORMULA = "formula";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_ORALDIET = "oraldiet";

    public static final String SP_STATUS = "status";

    public static final String SP_ADDITIVE = "additive";
}
