package Hw4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        double average = (double) sum / (second - first + 1);

        System.out.println("Сумма чисел в диапазоне [" + first + ", " + second + "] = " + sum);
        System.out.println("Среднее арифметическое чисел в диапазоне [" + first + ", " + second + "] = " + average);
    }


}
