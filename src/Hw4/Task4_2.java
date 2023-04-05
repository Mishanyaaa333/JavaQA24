package Hw4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчета факториала: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + result);
    }


}
