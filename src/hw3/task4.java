package hw3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt ();
        int y = sc.nextInt();

        boolean one = (x > 0 && y >0);
        boolean two = (x < 0 && y > 0);
        boolean three = (x < 0 && y < 0);
        boolean four = (x > 0 && y < 0);

        int w = 1;
        int w2 = 2;
        int w3 = 3;
        int w4 = 4;

        if (one){
            System.out.println(w);
        }if (two){
            System.out.println (w2);
        } if (three){
            System.out.println (w3);
        } if (four){
            System.out.println (w4);
        }
    }


}
