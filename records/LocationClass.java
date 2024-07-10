package records;

public class LocationClass {

    private final double latitude;
    private final double longitude;

    public LocationClass(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
