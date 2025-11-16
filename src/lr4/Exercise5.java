package lr4;

//Напишите программу, в которой создается двумерный
//целочисленный массив. Он заполняется случайными числами. Затем
//в этом массиве строки и столбцы меняются местами: первая строка
//становится первым столбцом, вторая строка становиться вторым
//столбцом и так далее. Например, если исходный массив состоял из 3
//строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3
//столбцов.

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите высоту и ширину прямоугольника через пробел!");
        int height = in.nextInt(), width = in.nextInt();
        int[][] arr = new int[height][width];
        System.out.println("Изначальный массив: ");
        for (int i = 0; i<height; i++){
            for (int j = 0; j<width; j++){
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспортированный массив: ");
        int[][] tranArr = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tranArr[i][j] = arr[j][i];
                System.out.print(tranArr[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
