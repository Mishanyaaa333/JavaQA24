package lesson3;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first");
        int first = sc.nextInt();
        System.out.println("Enter second");
        int second = sc.nextInt();
        System.out.println("Enter third");
        int third = sc.nextInt();

        System.out.println("Максимум нажми a");
        System.out.println("Минимум нажми b");
        System.out.println("Среднее арифметическое нажми c");
        Scanner sc1 = new Scanner(System.in);
        String choice = sc1.nextLine();
        if(choice.equals("a")){
            System.out.println("Max");
        } else if (choice.equals("b")) {
            System.out.println("Min");
        } else if (choice.equals("c")) {
            System.out.println("Avg");
        }else {
            System.out.println("Не вводи ерунду!");
        }
    }
}
