package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationMode;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatus;

public class LocationPositionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
     */
    protected DecimalType longitude;

    /**
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
     */
    protected DecimalType latitude;

    /**
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
     */
    protected DecimalType altitude;

    private static final long serialVersionUID = -74276134L;

    /*
     * Constructor
     */
    public LocationPositionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public LocationPositionComponent(DecimalType longitude, DecimalType latitude) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * @return {@link #longitude} (Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getLongitude" gives direct access to the value
     */
    public DecimalType getLongitudeElement() {
        if (this.longitude == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create LocationPositionComponent.longitude");
            else if (Configuration.doAutoCreate())
                // bb
                this.longitude = new DecimalType();
        return this.longitude;
    }

    public boolean hasLongitudeElement() {
        return this.longitude != null && !this.longitude.isEmpty();
    }

    public boolean hasLongitude() {
        return this.longitude != null && !this.longitude.isEmpty();
    }

    /**
     * @param value {@link #longitude} (Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getLongitude" gives direct access to the value
     */
    public LocationPositionComponent setLongitudeElement(DecimalType value) {
        this.longitude = value;
        return this;
    }

    /**
     * @return Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
     */
    public BigDecimal getLongitude() {
        return this.longitude == null ? null : this.longitude.getValue();
    }

    /**
     * @param value Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
     */
    public LocationPositionComponent setLongitude(BigDecimal value) {
        if (this.longitude == null)
            this.longitude = new DecimalType();
        this.longitude.setValue(value);
        return this;
    }

    /**
     * @return {@link #latitude} (Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getLatitude" gives direct access to the value
     */
    public DecimalType getLatitudeElement() {
        if (this.latitude == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create LocationPositionComponent.latitude");
            else if (Configuration.doAutoCreate())
                // bb
                this.latitude = new DecimalType();
        return this.latitude;
    }

    public boolean hasLatitudeElement() {
        return this.latitude != null && !this.latitude.isEmpty();
    }

    public boolean hasLatitude() {
        return this.latitude != null && !this.latitude.isEmpty();
    }

    /**
     * @param value {@link #latitude} (Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getLatitude" gives direct access to the value
     */
    public LocationPositionComponent setLatitudeElement(DecimalType value) {
        this.latitude = value;
        return this;
    }

    /**
     * @return Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
     */
    public BigDecimal getLatitude() {
        return this.latitude == null ? null : this.latitude.getValue();
    }

    /**
     * @param value Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
     */
    public LocationPositionComponent setLatitude(BigDecimal value) {
        if (this.latitude == null)
            this.latitude = new DecimalType();
        this.latitude.setValue(value);
        return this;
    }

    /**
     * @return {@link #altitude} (Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getAltitude" gives direct access to the value
     */
    public DecimalType getAltitudeElement() {
        if (this.altitude == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create LocationPositionComponent.altitude");
            else if (Configuration.doAutoCreate())
                // bb
                this.altitude = new DecimalType();
        return this.altitude;
    }

    public boolean hasAltitudeElement() {
        return this.altitude != null && !this.altitude.isEmpty();
    }

    public boolean hasAltitude() {
        return this.altitude != null && !this.altitude.isEmpty();
    }

    /**
     * @param value {@link #altitude} (Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).). This is the underlying object with id, value and extensions. The accessor "getAltitude" gives direct access to the value
     */
    public LocationPositionComponent setAltitudeElement(DecimalType value) {
        this.altitude = value;
        return this;
    }

    /**
     * @return Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
     */
    public BigDecimal getAltitude() {
        return this.altitude == null ? null : this.altitude.getValue();
    }

    /**
     * @param value Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
     */
    public LocationPositionComponent setAltitude(BigDecimal value) {
        if (value == null)
            this.altitude = null;
        else {
            if (this.altitude == null)
                this.altitude = new DecimalType();
            this.altitude.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("longitude", "decimal", "Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).", 0, java.lang.Integer.MAX_VALUE, longitude));
        childrenList.add(new Property("latitude", "decimal", "Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).", 0, java.lang.Integer.MAX_VALUE, latitude));
        childrenList.add(new Property("altitude", "decimal", "Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).", 0, java.lang.Integer.MAX_VALUE, altitude));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("longitude"))
            // DecimalType
            this.longitude = castToDecimal(value);
        else if (name.equals("latitude"))
            // DecimalType
            this.latitude = castToDecimal(value);
        else if (name.equals("altitude"))
            // DecimalType
            this.altitude = castToDecimal(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("longitude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.longitude");
        } else if (name.equals("latitude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.latitude");
        } else if (name.equals("altitude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.altitude");
        } else
            return super.addChild(name);
    }

    public LocationPositionComponent copy() {
        LocationPositionComponent dst = new LocationPositionComponent();
        copyValues(dst);
        dst.longitude = longitude == null ? null : longitude.copy();
        dst.latitude = latitude == null ? null : latitude.copy();
        dst.altitude = altitude == null ? null : altitude.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof LocationPositionComponent))
            return false;
        LocationPositionComponent o = (LocationPositionComponent) other;
        return compareDeep(longitude, o.longitude, true) && compareDeep(latitude, o.latitude, true) && compareDeep(altitude, o.altitude, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof LocationPositionComponent))
            return false;
        LocationPositionComponent o = (LocationPositionComponent) other;
        return compareValues(longitude, o.longitude, true) && compareValues(latitude, o.latitude, true) && compareValues(altitude, o.altitude, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (longitude == null || longitude.isEmpty()) && (latitude == null || latitude.isEmpty()) && (altitude == null || altitude.isEmpty());
    }

    public String fhirType() {
        return "Location.position";
    }
}
