package records;

public class Application {

    public static void main(String[] args) {
        // class verion
        var locationC = new LocationClass(13.2, 12.86);
        System.out.println(locationC);

        // record version
        var location1 = new Location(35.6764, 139.65);
        var location2 = new Location(35.6764, 139.65);
        var location3 = new Location(35.6764, 111.11);
        System.out.println(location1);
        System.out.println(location1.latitude());

        System.out.println(location1.equals(location2)); // true
        System.out.println(location1.equals(location3)); // false
        System.out.println(location1.hashCode());

        // immutable
        // constructor
        // getters
        // equals
        // hashcode
    }
}
