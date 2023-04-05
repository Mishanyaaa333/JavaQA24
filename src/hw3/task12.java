package hw3;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите номер билета: ");
        int number = read.nextInt();

        int step = 1;
        int count = 0;
        int sum = 0;
        while (number != 0) {
            sum += step * (number % 10);
            number /= 10;
            if (++count == 3) {
                step = -step;
            }
        }
        if (count == 6 && sum == 0) {
            System.out.println("Билет счастливый;");
        } else if (count != 6) {
            System.out.println("Вы ввели неверный билет;");
        } else {
            System.out.println("Несчастливый билет;");
        }
    }
}
