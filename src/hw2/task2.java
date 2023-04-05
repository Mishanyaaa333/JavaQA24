package hw2;

public class task2 {
    public static void main(String[] args) {
        int n = 243;
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int zS = z % 10;
        int nS = x + y + zS;
        System.out.println("Result=" + nS);
    }
}
