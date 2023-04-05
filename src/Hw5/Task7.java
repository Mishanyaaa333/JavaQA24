package Hw5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ввод размера массива и элементов
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.printf("Введите %d элементов массива: ", size);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // ввод числа, которое нужно найти в массиве
        System.out.print("Введите число для поиска: ");
        int searchNumber = scanner.nextInt();
        // поиск количества вхождений числа в массиве
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchNumber) {
                count++;
            }
        }
        // вывод результата
        System.out.printf("Число %d встречается в массиве %d раз(а)", searchNumber, count);

    }
}
