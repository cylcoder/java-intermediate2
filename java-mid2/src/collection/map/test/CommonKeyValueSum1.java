package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        HashMap<String, Integer> result = new HashMap<>();

        /*map1.keySet().forEach(key -> {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        });*/

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);
    }

}
