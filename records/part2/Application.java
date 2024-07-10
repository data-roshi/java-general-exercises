package records.part2;

public class Application {

    public static void main(String[] args) {
        // rounding
        var latitude = 35.0116;
        var kyoto = new Location(latitude, 135.7681);

        System.out.println(kyoto); // rounded the latitude to 38
        System.out.println(latitude); // unchanged, cfr. latitude = ... in compact constructor

        // bad longitude ex
        try {
            new Location(35.0116, 235.7681);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // non-canonical constuctor
        var kyotoFromText = new Location("35.0116:135.7681");
        System.out.println(kyotoFromText); // uses compact constuctor also for rounding
    }
}

record Location(double latitude, double longitude) {
    // compact constructor instead of canonical constructor, this "constructor" takes no params
    // no a "real" constructor, similar to transformer/mapfunction
    public Location {
        if (latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("invalid coordinates");
        }

        latitude = Math.round(latitude * 100.0) / 100.0; //not use this.latitude, but you are also not changing the passed in param itself only the "data"

        /*
        latitude --> transformed --> latitude
        longitude                --> longitude
         */

        // constructor call --> compact constructor --> canonical constructor
    }

    // non-canonical constructor
    public Location(String location) {
        this(Double.parseDouble(location.split(":")[0]),
                Double.parseDouble(location.split(":")[1]));
        // non-canoncial constructor call --> compact constructor --> canonical constructor
    }
}

