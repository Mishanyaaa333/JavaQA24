package Examenation;

import java.util.Scanner;

//Составить программу вычисления значения функции:
// x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        double x = 3.56 * Math.pow(a + b, 3) - 5.8 * Math.pow(b, 2) + 3.8 * a - 1.5;

        System.out.println("Значение функции: " + x);
    }
}
