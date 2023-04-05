package lesson1;

public class Application {
    public static void main(String[]args){
        //println() делает перевод на новую строку
        //print() не делает перевод на новую строку
        System.out.println("My name is Misha");//вывод информации на консоль
        System.out.println("My name is Jack");
        System.out.print("\n - новая строка");
        System.out.println("\tтабуляция");
        System.out.print("The end");


        //==== Переменные ====
        System.out.println("\nЖеня,как дела?");
        System.out.println("Женя,ты вынес мусор?");
        System.out.println("Тебя точно зовут Женя?");

        // тип название = значение
        String name = "Женя";//инициализация переменной
        System.out.println(name + " теперь переменная");// + это конкатенация строк - склеивание

        System.out.println(10 + 20);

        // ==== типы данных ====
        //целые числа
        byte age = -128; // 2^8 = 256
        short sh = 9999; //2^16 = -2^15 до -2^15-1
        int degrees = 15; //2^32
        long large = 25; //2^64

        //дробные числа
        float f = 2.59F;
        double d = 2.698;

        //символы
        char ch = 'A';

        //логический тип
        boolean answer = true; //false

        System.out.println("Моей бабушке " + age + " лет");


    }
}




