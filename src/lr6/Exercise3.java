package lr6;

import java.util.Scanner;

//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.

public class Exercise3 {
    static class MathUtils{
        static int max(int[] numbers){
            int max = numbers[0];
            for (int n : numbers) {
                if (n > max) {
                    max = n;
                }
            }
            return max;
        }
        static int min(int[] numbers){
            int min = numbers[0];
            for (int n : numbers) {
                if (n < min) {
                    min = n;
                }
            }
            return min;
        }
        static double average(int[] numbers){
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return (double) sum / numbers.length;
        }

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

        System.out.println("\nРезультат:");
        System.out.println("Максимум: " + MathUtils.max(array));
        System.out.println("Минимум: " + MathUtils.min(array));
        System.out.println("Среднее: " + MathUtils.average(array));

        in.close();
    }
}
