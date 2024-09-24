package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // Java 5
        List<Integer> list4 = List.of(); // Java 9

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);

        arrList.set(0, 100);

        /*
        * arrList는 리스트이고 리스트는 배열로 구현된다.
        * Arrays.asList()의 경우 그 배열을 asList() 메서드의 인자값으로 넘어오는 객체를 참조한다.
        * 따라서 arrList의 값을 수정하는 경우 원본 배열인 arr의 값도 변경된다.
        * 결과적으로 Array -> List로 변환할 때 배열의 사이즈가 매우 큰 경우 생성 비용이 적다.
        * */

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
    }

}
