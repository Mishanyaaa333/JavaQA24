package Examenation;

//2. Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98

public class Exam2 {
    public static void main(String[] args) {
        int num = 7; // начальное число
        while (num <= 98) { // пока число не превышает 98
            System.out.print(num + " "); // выводим число
            num += 7; // увеличиваем число на 7

        }
    }
}
