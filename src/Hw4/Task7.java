package Hw4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
