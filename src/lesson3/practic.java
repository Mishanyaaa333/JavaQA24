package lesson3;

import java.util.Scanner;

public class practic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first");
        int first = sc.nextInt();
        System.out.println("Enter second");
        int second = sc.nextInt();
        System.out.println("Enter third");
        int third = sc.nextInt();

        System.out.println("Сумма нажми 1");
        System.out.println("Произведение нажми 2");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println(first + second + third);
        }else if (choice == 2) {
            System.out.println(first * second * third);
        }else {
            System.out.println("Неверный ввод");
        }





    }
}
