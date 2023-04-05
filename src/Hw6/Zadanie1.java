package Hw6;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите символ: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("Совпадение найдено на индексе " + i);
                count++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Совпадений не найдено");
        } else {
            System.out.println("Количество совпадений: " + count);
        }

    }
}
