package lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println("Введите слово которое будем менять");
        String target = in.nextLine();
        System.out.println("Введите слово НА которое будем менять ");
        String replacement = in.nextLine();
        System.out.println("replace = " + str.replace(target,replacement));

    }
}
