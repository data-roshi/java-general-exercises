package collections;

import java.util.List;

public class ExerciseCollectionOf {
    public static void main(String[] args) {
        testListOf();
        // add set and map
    }

    private static void testListOf() {

        try {
            List<String> colors = List.of("red", "blue", "green");
            colors.add("yellow"); // fails
        } catch (Exception ex) {
            System.out.println("add unsupported"); // prints
        }

        try {
            List<String> colors = List.of("red", "blue", "green", null); // fails npe
        } catch (Exception ex) {
            System.out.println("no nulls allowed"); // prints
        }
    }
}
