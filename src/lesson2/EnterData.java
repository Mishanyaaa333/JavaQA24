package lesson2;

import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("введите второе число");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);


    }
}
