package hw2;

public class task5 {
    public static void main(String[] args) {
        double res = Math.pow(4, 2);
        System.out.println(res);
        int radius = 4;
        System.out.println(Math.PI * Math.pow(4, 2));
        double area = Math.PI * (radius *radius);
        System.out.println("Площадь круга равна: " + area);
        double circumference= Math.PI * 2*radius;
        System.out.println("Длины окружности равна: " + circumference);
    }
}
