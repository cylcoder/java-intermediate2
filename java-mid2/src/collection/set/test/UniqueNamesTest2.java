package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        new LinkedHashSet<>(List.of(inputArr)).forEach(System.out::println);
    }

}
