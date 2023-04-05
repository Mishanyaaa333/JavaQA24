package Hw6;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        String num1 = "";
        for (int i = 1; i <= 1000; i++) {
            num1 += Integer.toString(i);
            if (num1.length() >= 1000) {
                break;
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер цифры: ");
        int n = scanner.nextInt();
        System.out.println(num1.charAt(n - 1));
    }
}
