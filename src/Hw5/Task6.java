package Hw5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        // Создание массива и ввод его элементов
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Вычисление суммы элементов массива
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // Вычисление среднего арифметического
        double avg = (double) sum / n;
        // Вывод элементов массива
        System.out.println("Элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Вывод суммы и среднего арифметического
        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}
