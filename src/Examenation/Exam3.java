package Examenation;

import java.util.Scanner;

//На ввод в программу натурального числа из диапазона [1..25] программа выводит это число и согласованное с ним слово «книга».
//Например, на ввод числа 1 программа выводит «1 книга», на ввод числа 2 — «2 книги» и т. д.


public class Exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число от 1 до 25: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("1 книга");
        } else if (number >= 2 && number <= 4) {
            System.out.println(number + " книги");
        } else if (number >= 5 && number <= 20) {
            System.out.println(number + " книг");
        } else if (number >= 21 && number <= 24) {
            System.out.println(number + " книги");
        } else if (number == 25) {
            System.out.println("25 книг");
        } else {
            System.out.println("Вы ввели некорректное число.");
        }

    }
}
