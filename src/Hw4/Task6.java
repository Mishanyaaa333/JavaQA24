package Hw4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();

        System.out.print("Введите символ для заполнения линии: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }

    }
}
