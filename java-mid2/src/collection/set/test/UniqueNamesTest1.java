package collection.set.test;

import java.util.HashSet;
import java.util.List;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        new HashSet<>(List.of(inputArr)).forEach(System.out::println);
    }

}
