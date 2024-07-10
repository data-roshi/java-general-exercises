package records;

public class Application {

    public static void main(String[] args) {
        // class version
        var locationC = new LocationClass(13.2, 12.86, "blah");
        System.out.println(locationC);

        // record version
        // immutable , final by definition, can't extend or update fields (assuming field type/object is itself not mutable of course)
        // constructor
        // getters
        // equals
        // hashcode
        var location1 = new Location(35.6764, 139.65, "Tokyo");
        var location2 = new Location(35.6764, 139.65, "Tokyo");
        var location3 = new Location(35.0116, 135.7681, "Kyoto");
        System.out.println(location1);
        System.out.println(location1.latitude());
        System.out.println(location1.city());

        System.out.println(location1.equals(location2)); // true
        System.out.println(location1.equals(location3)); // false
        System.out.println(location1.hashCode());


        // implement interface
        var locationToJSON = new LocationToJSON(35.6764, 139.65, "Tokyo");
        System.out.println(locationToJSON.generateJSON());
    }
}
