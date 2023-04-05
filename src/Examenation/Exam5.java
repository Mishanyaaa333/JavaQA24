package Examenation;


//Найти периметр фигуры по заданным сторонам AB, AС, и CD (см. рисунок)
//Используйте формулу для расчета гипотенузы прямоугольного треугольника по его катетам. Квадрат гипотенузы равен сумме квадратов катетов.

public class Exam5 {
    public static void main(String[] args) {
        double AB = 10;
        double AC = 10;
        double CD = 10;

        double BC = Math.pow(AB, 2) + Math.pow(AC, 2);

        double hypotenuse = Math.sqrt(BC + Math.pow(CD, 2));

        double perimeter = AB + AC + CD + hypotenuse;

        System.out.println("Периметр фигуры: " + perimeter);
    }
}
