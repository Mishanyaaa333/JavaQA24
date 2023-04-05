package Hw6;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        int wordCount = words.length;
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        double averageLength = (double) totalLength / wordCount;

        System.out.println("Предложение: " + sentence);
        System.out.printf("Средняя длина слова: %.2f", averageLength);
    }

}
