package Hw8;


public class Zadan1 {

    public static int sum(int[] arr) {
        int sum = 0; // Инициализируем переменную суммы
        for (int i = 0; i < arr.length; i++) { // Проходим по всем элементам массива
            sum += arr[i]; // Добавляем текущий элемент к сумме
        }
        return sum; // Возвращаем итоговую сумму
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Создаем массив и заполняем его значениями
        int result = sum(arr); // Вызываем метод sum с массивом в качестве аргумента
        System.out.println("Сумма элементов массива: " + result); // Выводим результат в консоль
    }
}
