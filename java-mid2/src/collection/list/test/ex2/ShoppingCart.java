package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {

    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        items.forEach(item -> System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice()));
        System.out.println("전체 가격 합:" + items.stream().mapToInt(Item::getTotalPrice).sum());
    }

}
