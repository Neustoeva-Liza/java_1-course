package lr4;

import java.util.Scanner;

//Напишите программу, в которой создается двумерный
//числовой массив и этот массив заполняется «змейкой»: сначала
//первая строка (слева направо), затем последний столбец (сверху
//вниз), вторая строка (справа налево) и так далее.

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите высоту и ширину массива через пробел!");
        int height = in.nextInt(), width = in.nextInt();
        int[][] arr = new int[height][width];

        int value = 1;
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    arr[i][j] = value++;
                }
            } else {
                for (int j = width - 1; j >= 0; j--) {
                    arr[i][j] = value++;
                }
            }
        }

        System.out.println("Массив, заполненный змейкой:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }

        in.close();
    }
}
