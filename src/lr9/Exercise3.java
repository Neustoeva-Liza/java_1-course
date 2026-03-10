package lr9;

import java.util.Scanner;

public class Exercise3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int lengthMassive = in.nextInt();

        int[] arr = new int[lengthMassive];

        System.out.println("Введите " + lengthMassive + " числа(ел):");
        input(arr, 0);

        System.out.println("Введенные числа:");
        output(arr, 0);
    }

    static void input(int[] arr, int i) {
        if (i < arr.length) {
            System.out.print("Элемент " + i + ": ");
            arr[i] = in.nextInt();
            input(arr, i + 1);
        }
    }

    static void output(int[] arr, int i) {
        if (i < arr.length) {
            System.out.print(arr[i] + " ");
            output(arr, i + 1);
        }
    }
}
