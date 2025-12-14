package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, которому аргументом передается
//целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//массив, который получается из исходного массива (переданного первым аргументом
//методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//аргумент метода больше длины массива, переданного первым аргументом, то методом
//создается копия исходного массива и возвращается ссылка на эту копию.

public class Exercise6 {
    static int[] takeFirst(int[] array, int k) {
        if (k >= array.length) {
            int[] copy = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            return copy;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        System.out.print("Сколько первых элементов взять: ");
        int k = in.nextInt();

        int[] newArray = takeFirst(array, k);

        System.out.println("\nНовый массив:");
        for (int x : newArray) {
            System.out.print(x + " ");
        }

        in.close();
    }
}
