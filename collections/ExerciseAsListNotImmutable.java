package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseAsListNotImmutable {
    public static void main(String[] args) {
        testAsList();
        testListOf();
    }

    private static void testAsList() {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        System.out.println(nums.getClass()); // ArrayList, it's not immutable, it's another ArrayList impl that doesn't support add, if need immutable use List.of()
        try {
            nums.add(4); // fails
        } catch (Exception ex) {
            System.out.println("add unsupported"); // prints
        }

        System.out.println(nums); // [1,2,3]

        try {
            nums.set(2, 2); // works
        } catch (Exception ex) {
            System.out.println("set unsupported"); // will not reach here
        }

        System.out.println(nums); // [1,2,2]
    }

    private static void testListOf() {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(nums.getClass()); // ImmutableCollections$ListN, it's immutable
        try {
            nums.add(4); // fails
        } catch (Exception ex) {
            System.out.println("add unsupported"); // prints
        }

        System.out.println(nums); // [1,2,3]

        try {
            nums.set(2, 2); // fails
        } catch (Exception ex) {
            System.out.println("set unsupported"); // prints
        }

        System.out.println(nums);// [1,2,3]
    }
}
