package timus.second_semester;

import java.util.Scanner;

public class Task_1126 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int[] arr = new int[25000];
        int size = 0;

        int value;
        while ((value = in.nextInt()) != -1) {
            arr[size] = value;
            size++;
        }

        for (int i = 0; i <= size - M; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + M; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }
}
