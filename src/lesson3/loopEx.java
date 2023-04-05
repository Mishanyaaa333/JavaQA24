package lesson3;

import java.util.Scanner;
public class loopEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователю ввести два числа
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Отображаем все четные числа в заданном диапазоне
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
