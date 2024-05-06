package collections;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSharedMutability {

    public static final List<String> LANGUAGES = List.of("Java", "Go", "JavaScript", "Rust", "Haskell");
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        List<String> uppercased = new ArrayList<>();

        LANGUAGES.stream()
                .map(String::toUpperCase)
                .forEach(lang -> uppercased.add(lang)); // bad, what if later you change to parallel stream and don't change this

        System.out.println(LANGUAGES.size()); // 5
        System.out.println(uppercased.size()); // 5
    }
    private static void test2() {
        List<String> uppercased = new ArrayList<>();

        LANGUAGES.parallelStream()
                .map(String::toUpperCase)
                .forEach(lang -> uppercased.add(lang)); // bad in combo with mutation and parallel stream, becomes unstable behaviour

        System.out.println(LANGUAGES.size()); // 5
        System.out.println(uppercased.size()); // will often be 5, but not always, will be more problematic with larger datasets also
    }
    private static void test3() {
        List<String> uppercased = LANGUAGES.parallelStream()
                .map(String::toUpperCase)
                .toList(); // of course this is the best way for these cases and the above is rare, but seen in other instances

        System.out.println(LANGUAGES.size()); // 5
        System.out.println(uppercased.size()); // 5
    }
}

