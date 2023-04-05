package Hw4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("=");
        }
    }

}
