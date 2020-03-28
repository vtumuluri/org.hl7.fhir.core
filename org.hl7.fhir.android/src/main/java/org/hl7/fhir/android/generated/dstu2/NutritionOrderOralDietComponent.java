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

public class NutritionOrderOralDietComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     */
    protected List<CodeableConcept> type;

    /**
     * The time period and frequency at which the diet should be given.
     */
    protected List<Timing> schedule;

    /**
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     */
    protected List<NutritionOrderOralDietNutrientComponent> nutrient;

    /**
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     */
    protected List<NutritionOrderOralDietTextureComponent> texture;

    /**
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     */
    protected List<CodeableConcept> fluidConsistencyType;

    /**
     * Free text or additional instructions or information pertaining to the oral diet.
     */
    protected StringType instruction;

    private static final long serialVersionUID = 973058412L;

    /*
     * Constructor
     */
    public NutritionOrderOralDietComponent() {
        super();
    }

    /**
     * @return {@link #type} (The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.)
     */
    public List<CodeableConcept> getType() {
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (CodeableConcept item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderOralDietComponent addType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #schedule} (The time period and frequency at which the diet should be given.)
     */
    public List<Timing> getSchedule() {
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        return this.schedule;
    }

    public boolean hasSchedule() {
        if (this.schedule == null)
            return false;
        for (Timing item : this.schedule) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Timing addSchedule() {
        // 3
        Timing t = new Timing();
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        this.schedule.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderOralDietComponent addSchedule(Timing t) {
        // 3
        if (t == null)
            return this;
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        this.schedule.add(t);
        return this;
    }

    /**
     * @return {@link #nutrient} (Class that defines the quantity and type of nutrient modifications required for the oral diet.)
     */
    public List<NutritionOrderOralDietNutrientComponent> getNutrient() {
        if (this.nutrient == null)
            this.nutrient = new ArrayList<NutritionOrderOralDietNutrientComponent>();
        return this.nutrient;
    }

    public boolean hasNutrient() {
        if (this.nutrient == null)
            return false;
        for (NutritionOrderOralDietNutrientComponent item : this.nutrient) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public NutritionOrderOralDietNutrientComponent addNutrient() {
        // 3
        NutritionOrderOralDietNutrientComponent t = new NutritionOrderOralDietNutrientComponent();
        if (this.nutrient == null)
            this.nutrient = new ArrayList<NutritionOrderOralDietNutrientComponent>();
        this.nutrient.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderOralDietComponent addNutrient(NutritionOrderOralDietNutrientComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.nutrient == null)
            this.nutrient = new ArrayList<NutritionOrderOralDietNutrientComponent>();
        this.nutrient.add(t);
        return this;
    }

    /**
     * @return {@link #texture} (Class that describes any texture modifications required for the patient to safely consume various types of solid foods.)
     */
    public List<NutritionOrderOralDietTextureComponent> getTexture() {
        if (this.texture == null)
            this.texture = new ArrayList<NutritionOrderOralDietTextureComponent>();
        return this.texture;
    }

    public boolean hasTexture() {
        if (this.texture == null)
            return false;
        for (NutritionOrderOralDietTextureComponent item : this.texture) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public NutritionOrderOralDietTextureComponent addTexture() {
        // 3
        NutritionOrderOralDietTextureComponent t = new NutritionOrderOralDietTextureComponent();
        if (this.texture == null)
            this.texture = new ArrayList<NutritionOrderOralDietTextureComponent>();
        this.texture.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderOralDietComponent addTexture(NutritionOrderOralDietTextureComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.texture == null)
            this.texture = new ArrayList<NutritionOrderOralDietTextureComponent>();
        this.texture.add(t);
        return this;
    }

    /**
     * @return {@link #fluidConsistencyType} (The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.)
     */
    public List<CodeableConcept> getFluidConsistencyType() {
        if (this.fluidConsistencyType == null)
            this.fluidConsistencyType = new ArrayList<CodeableConcept>();
        return this.fluidConsistencyType;
    }

    public boolean hasFluidConsistencyType() {
        if (this.fluidConsistencyType == null)
            return false;
        for (CodeableConcept item : this.fluidConsistencyType) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addFluidConsistencyType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.fluidConsistencyType == null)
            this.fluidConsistencyType = new ArrayList<CodeableConcept>();
        this.fluidConsistencyType.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderOralDietComponent addFluidConsistencyType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.fluidConsistencyType == null)
            this.fluidConsistencyType = new ArrayList<CodeableConcept>();
        this.fluidConsistencyType.add(t);
        return this;
    }

    /**
     * @return {@link #instruction} (Free text or additional instructions or information pertaining to the oral diet.). This is the underlying object with id, value and extensions. The accessor "getInstruction" gives direct access to the value
     */
    public StringType getInstructionElement() {
        if (this.instruction == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderOralDietComponent.instruction");
            else if (Configuration.doAutoCreate())
                // bb
                this.instruction = new StringType();
        return this.instruction;
    }

    public boolean hasInstructionElement() {
        return this.instruction != null && !this.instruction.isEmpty();
    }

    public boolean hasInstruction() {
        return this.instruction != null && !this.instruction.isEmpty();
    }

    /**
     * @param value {@link #instruction} (Free text or additional instructions or information pertaining to the oral diet.). This is the underlying object with id, value and extensions. The accessor "getInstruction" gives direct access to the value
     */
    public NutritionOrderOralDietComponent setInstructionElement(StringType value) {
        this.instruction = value;
        return this;
    }

    /**
     * @return Free text or additional instructions or information pertaining to the oral diet.
     */
    public String getInstruction() {
        return this.instruction == null ? null : this.instruction.getValue();
    }

    /**
     * @param value Free text or additional instructions or information pertaining to the oral diet.
     */
    public NutritionOrderOralDietComponent setInstruction(String value) {
        if (Utilities.noString(value))
            this.instruction = null;
        else {
            if (this.instruction == null)
                this.instruction = new StringType();
            this.instruction.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("schedule", "Timing", "The time period and frequency at which the diet should be given.", 0, java.lang.Integer.MAX_VALUE, schedule));
        childrenList.add(new Property("nutrient", "", "Class that defines the quantity and type of nutrient modifications required for the oral diet.", 0, java.lang.Integer.MAX_VALUE, nutrient));
        childrenList.add(new Property("texture", "", "Class that describes any texture modifications required for the patient to safely consume various types of solid foods.", 0, java.lang.Integer.MAX_VALUE, texture));
        childrenList.add(new Property("fluidConsistencyType", "CodeableConcept", "The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.", 0, java.lang.Integer.MAX_VALUE, fluidConsistencyType));
        childrenList.add(new Property("instruction", "string", "Free text or additional instructions or information pertaining to the oral diet.", 0, java.lang.Integer.MAX_VALUE, instruction));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            this.getType().add(castToCodeableConcept(value));
        else if (name.equals("schedule"))
            this.getSchedule().add(castToTiming(value));
        else if (name.equals("nutrient"))
            this.getNutrient().add((NutritionOrderOralDietNutrientComponent) value);
        else if (name.equals("texture"))
            this.getTexture().add((NutritionOrderOralDietTextureComponent) value);
        else if (name.equals("fluidConsistencyType"))
            this.getFluidConsistencyType().add(castToCodeableConcept(value));
        else if (name.equals("instruction"))
            // StringType
            this.instruction = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            return addType();
        } else if (name.equals("schedule")) {
            return addSchedule();
        } else if (name.equals("nutrient")) {
            return addNutrient();
        } else if (name.equals("texture")) {
            return addTexture();
        } else if (name.equals("fluidConsistencyType")) {
            return addFluidConsistencyType();
        } else if (name.equals("instruction")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.instruction");
        } else
            return super.addChild(name);
    }

    public NutritionOrderOralDietComponent copy() {
        NutritionOrderOralDietComponent dst = new NutritionOrderOralDietComponent();
        copyValues(dst);
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type) dst.type.add(i.copy());
        }
        ;
        if (schedule != null) {
            dst.schedule = new ArrayList<Timing>();
            for (Timing i : schedule) dst.schedule.add(i.copy());
        }
        ;
        if (nutrient != null) {
            dst.nutrient = new ArrayList<NutritionOrderOralDietNutrientComponent>();
            for (NutritionOrderOralDietNutrientComponent i : nutrient) dst.nutrient.add(i.copy());
        }
        ;
        if (texture != null) {
            dst.texture = new ArrayList<NutritionOrderOralDietTextureComponent>();
            for (NutritionOrderOralDietTextureComponent i : texture) dst.texture.add(i.copy());
        }
        ;
        if (fluidConsistencyType != null) {
            dst.fluidConsistencyType = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : fluidConsistencyType) dst.fluidConsistencyType.add(i.copy());
        }
        ;
        dst.instruction = instruction == null ? null : instruction.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietComponent))
            return false;
        NutritionOrderOralDietComponent o = (NutritionOrderOralDietComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(schedule, o.schedule, true) && compareDeep(nutrient, o.nutrient, true) && compareDeep(texture, o.texture, true) && compareDeep(fluidConsistencyType, o.fluidConsistencyType, true) && compareDeep(instruction, o.instruction, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietComponent))
            return false;
        NutritionOrderOralDietComponent o = (NutritionOrderOralDietComponent) other;
        return compareValues(instruction, o.instruction, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (schedule == null || schedule.isEmpty()) && (nutrient == null || nutrient.isEmpty()) && (texture == null || texture.isEmpty()) && (fluidConsistencyType == null || fluidConsistencyType.isEmpty()) && (instruction == null || instruction.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.oralDiet";
    }
}
