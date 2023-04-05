package hw3;

public class task6 {
    public static void main(String[] args) {
        int a = 0;
        if (a %100==0 && a %400 ==0 )
            System.out.println("количество дней в году: 366");

        else if (a % 4 == 0 && a % 100 > 0)
            System.out.println("количество дней в году: 366");

        else if (a % 100 == 0)
            System.out.println("количество дней в году: 365");

        else
            System.out.println("количество дней в году: 365");
    }
}
