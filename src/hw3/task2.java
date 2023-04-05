package hw3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время");
        int time = in.nextInt();
        if (time==6||time==7||time==8||time==9||time==10) {
            System.out.println("Доброе утро!");
        }
        else if (time==17||time==18||time==19||time==20||time==21||time==22||time==23||time==24) {
            System.out.println("Добрый вечер!");
        } else if (time==1||time==2||time==3||time==4||time==5) {
            System.out.println("Доброй ночи!");
        } else if (time==11||time==12||time==13||time==14||time==15||time==16) {
            System.out.println("Добрый день!");
        } else
        System.out.println("Такого времени не существует");




    }
}
