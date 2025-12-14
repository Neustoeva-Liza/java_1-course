package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.

public class Exercise10 {
    static int[] minMax(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел ввести? ");
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        int[] result = minMax(array);

        System.out.println("\nМаксимум: " + result[0]);
        System.out.println("Минимум: " + result[1]);

        in.close();
    }
}
