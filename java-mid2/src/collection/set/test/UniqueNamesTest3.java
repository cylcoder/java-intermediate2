package collection.set.test;

import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        new TreeSet<>(List.of(inputArr)).forEach(System.out::println);
    }

}
