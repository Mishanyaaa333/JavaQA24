package Hw7;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String[] words = str.split("[\\s:]+");

        int count = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }

        System.out.println("Количество слов с четным количеством букв: " + count);
    }
}
