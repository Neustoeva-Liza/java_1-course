package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).


public class Exercise8 {
    static double average(int[] array){
        int sum = 0;
        for (int n : array){
            sum +=n;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        double avg = average(array);
        System.out.println("\nСреднее значение элементов массива: " + avg);

        in.close();
    }
}
