package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationType;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColor;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationState;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatus;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategory;

public class DeviceMetricCalibrationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes the type of the calibration method.
     */
    protected Enumeration<DeviceMetricCalibrationType> type;

    /**
     * Describes the state of the calibration.
     */
    protected Enumeration<DeviceMetricCalibrationState> state;

    /**
     * Describes the time last calibration has been performed.
     */
    protected InstantType time;

    private static final long serialVersionUID = 1163986578L;

    /*
     * Constructor
     */
    public DeviceMetricCalibrationComponent() {
        super();
    }

    /**
     * @return {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<DeviceMetricCalibrationType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<DeviceMetricCalibrationType>(new DeviceMetricCalibrationTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public DeviceMetricCalibrationComponent setTypeElement(Enumeration<DeviceMetricCalibrationType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Describes the type of the calibration method.
     */
    public DeviceMetricCalibrationType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Describes the type of the calibration method.
     */
    public DeviceMetricCalibrationComponent setType(DeviceMetricCalibrationType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<DeviceMetricCalibrationType>(new DeviceMetricCalibrationTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
     */
    public Enumeration<DeviceMetricCalibrationState> getStateElement() {
        if (this.state == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.state");
            else if (Configuration.doAutoCreate())
                // bb
                this.state = new Enumeration<DeviceMetricCalibrationState>(new DeviceMetricCalibrationStateEnumFactory());
        return this.state;
    }

    public boolean hasStateElement() {
        return this.state != null && !this.state.isEmpty();
    }

    public boolean hasState() {
        return this.state != null && !this.state.isEmpty();
    }

    /**
     * @param value {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
     */
    public DeviceMetricCalibrationComponent setStateElement(Enumeration<DeviceMetricCalibrationState> value) {
        this.state = value;
        return this;
    }

    /**
     * @return Describes the state of the calibration.
     */
    public DeviceMetricCalibrationState getState() {
        return this.state == null ? null : this.state.getValue();
    }

    /**
     * @param value Describes the state of the calibration.
     */
    public DeviceMetricCalibrationComponent setState(DeviceMetricCalibrationState value) {
        if (value == null)
            this.state = null;
        else {
            if (this.state == null)
                this.state = new Enumeration<DeviceMetricCalibrationState>(new DeviceMetricCalibrationStateEnumFactory());
            this.state.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public InstantType getTimeElement() {
        if (this.time == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.time");
            else if (Configuration.doAutoCreate())
                // bb
                this.time = new InstantType();
        return this.time;
    }

    public boolean hasTimeElement() {
        return this.time != null && !this.time.isEmpty();
    }

    public boolean hasTime() {
        return this.time != null && !this.time.isEmpty();
    }

    /**
     * @param value {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
     */
    public DeviceMetricCalibrationComponent setTimeElement(InstantType value) {
        this.time = value;
        return this;
    }

    /**
     * @return Describes the time last calibration has been performed.
     */
    public Date getTime() {
        return this.time == null ? null : this.time.getValue();
    }

    /**
     * @param value Describes the time last calibration has been performed.
     */
    public DeviceMetricCalibrationComponent setTime(Date value) {
        if (value == null)
            this.time = null;
        else {
            if (this.time == null)
                this.time = new InstantType();
            this.time.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "Describes the type of the calibration method.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("state", "code", "Describes the state of the calibration.", 0, java.lang.Integer.MAX_VALUE, state));
        childrenList.add(new Property("time", "instant", "Describes the time last calibration has been performed.", 0, java.lang.Integer.MAX_VALUE, time));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<DeviceMetricCalibrationType>
            this.type = new DeviceMetricCalibrationTypeEnumFactory().fromType(value);
        else if (name.equals("state"))
            // Enumeration<DeviceMetricCalibrationState>
            this.state = new DeviceMetricCalibrationStateEnumFactory().fromType(value);
        else if (name.equals("time"))
            // InstantType
            this.time = castToInstant(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.type");
        } else if (name.equals("state")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.state");
        } else if (name.equals("time")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.time");
        } else
            return super.addChild(name);
    }

    public DeviceMetricCalibrationComponent copy() {
        DeviceMetricCalibrationComponent dst = new DeviceMetricCalibrationComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.state = state == null ? null : state.copy();
        dst.time = time == null ? null : time.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DeviceMetricCalibrationComponent))
            return false;
        DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(state, o.state, true) && compareDeep(time, o.time, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DeviceMetricCalibrationComponent))
            return false;
        DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
        return compareValues(type, o.type, true) && compareValues(state, o.state, true) && compareValues(time, o.time, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (state == null || state.isEmpty()) && (time == null || time.isEmpty());
    }

    public String fhirType() {
        return "DeviceMetric.calibration";
    }
}
