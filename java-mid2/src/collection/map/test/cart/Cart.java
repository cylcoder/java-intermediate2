package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
//        cartMap.merge(product, quantity, Integer::sum);

        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        cartMap.forEach((product, count) -> System.out.println("상품: " + product + " 수량: " + count));
    }

    public void minus(Product product, int quantity) {
        Integer currentQuantity = cartMap.getOrDefault(product, 0);

        if (currentQuantity > quantity) {
            cartMap.put(product, currentQuantity - quantity);
        } else {
            cartMap.remove(product);
        }
    }
}
