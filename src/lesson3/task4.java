package lesson3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int value = scanner.nextInt();
        System.out.println("Enter percent");
        int percent = scanner.nextInt();

        double res = (double)value/100 * percent;
        System.out.println("res = " + Math.round(res));

    }
}
