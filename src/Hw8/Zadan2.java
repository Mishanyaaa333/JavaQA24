package Hw8;

public class Zadan2 {
    public static int max(int[] arr) {
        int max = arr[0]; // Инициализируем переменную максимума первым элементом массива
        for (int i = 1; i < arr.length; i++) { // Проходим по всем элементам массива, начиная со второго
            if (arr[i] > max) { // Если текущий элемент больше текущего максимума,
                max = arr[i]; // то обновляем максимум
            }
        }
        return max; // Возвращаем найденный максимум
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; // Создаем массив и заполняем его значениями
        int result = max(arr); // Вызываем метод max с массивом в качестве аргумента
        System.out.println("Максимальное значение в массиве: " + result); // Выводим результат в консоль
    }
    }