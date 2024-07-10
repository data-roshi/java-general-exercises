package records.part1;

// stupid name, but wanted to have a record and a class for location in this example code...
public class LocationClass {

    private final double latitude;
    private final double longitude;
    private final String city;

    public LocationClass(double latitude, double longitude, String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getCity() {
        return city;
    }
}
