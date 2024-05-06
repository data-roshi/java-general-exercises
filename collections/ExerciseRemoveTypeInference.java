package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExerciseRemoveTypeInference {
    public static void main(String[] args) {
        removeFromCollectionExplicitType();
        removeFromArrayListInferedType();
    }

    private static void removeFromCollectionExplicitType() {
        Collection<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(nums); //[1,2,3]
        nums.remove(1);
        System.out.println(nums); //[2,3]
    }

    private static void removeFromArrayListInferedType() {
        var nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(nums); //[1,2,3]
        nums.remove(1); // infered type ArrayList, refernce type known at compile time
        System.out.println(nums); //[1,3]
    }

    /**
     *  Collection<T>   remove(T)
     *  List<T>         remove(T)
     *  List<T>         remove(int index) overload,
     */
}
