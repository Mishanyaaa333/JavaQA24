package Hw5;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int count0 =0; //переменная для подсчета количества 0
        int countp =0; //переменная для подсчета положительных элементов
        int countm =0; //переменная для подсчета отрицательных элементов

        int[] arr = new int[5]; //создали массив с размером 5
        Random random = new Random(); //создаем класс Random для ввода рандомных знач
        for (int i = 0; i < arr.length; i++) { //запускаем цикл чтобы все значения заполнились рандомно
            arr[i] = random.nextInt(-10, 50); //вводим диапозон значений от -10 до 50
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < 0){
                countm++;
            }
            if (arr[i] >0){
                countp++;
            }
            if (arr[i] ==0){
                count0++;
            }

        }
        System.out.println("Минимальное значение элемента в массиве = " +min);
        System.out.println("Максимальное значение элемента в массиве = " + max);
        System.out.println("Количество отрицательных элементов в массиве = " + countm);
        System.out.println("Количество положительных элементов в массиве = " + countp);
        System.out.println("Количество нулевых элементов в массиве = " + count0);

    }
}
