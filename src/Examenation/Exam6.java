package Examenation;

import java.util.Scanner;

//6.Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
//- 0 – 250: нет скидки
//- 251 – 500: скидка 5%
//- 501 – 1000: скидка 10%
// - 1001 и более: скидка 15%

public class Exam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость покупок в магазине: ");
        double cost = scanner.nextDouble();

        double discount;
        if (cost >= 1001) {
            discount = 0.15;
        } else if (cost >= 501) {
            discount = 0.1;
        } else if (cost >= 251) {
            discount = 0.05;
        } else {
            discount = 0;
        }
        double totalCost = cost * (1 - discount);
        System.out.println("Сумма к оплате с учетом скидки: " + totalCost);

    }
}
