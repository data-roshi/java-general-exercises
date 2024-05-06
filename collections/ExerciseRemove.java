package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExerciseRemove {
    public static void main(String[] args) {
        removeFromList();
        removeFromCollection();
    }

    private static void removeFromList() {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(nums); //[1,2,3]
        nums.remove(1);
        System.out.println(nums); //[1,3] removed index-based from list and kept order
    }

    private static void removeFromCollection() {
        Collection<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(nums); //[1,2,3]
        nums.remove(1);
        System.out.println(nums); //[2,3] removed object from collection and kept order
    }

    /**
     *  Collection<T>   remove(T)
     *  List<T>         remove(T)
     *  List<T>         remove(int index) overload,
     */
}
