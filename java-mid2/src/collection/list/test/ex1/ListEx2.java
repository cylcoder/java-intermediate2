package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        String number = scanner.nextLine();
        while (!number.equals("0")) {
            numbers.add(number);
            number = scanner.nextLine();
        }

        System.out.println("출력");
        System.out.println(String.join(", ", numbers));
    }

}
