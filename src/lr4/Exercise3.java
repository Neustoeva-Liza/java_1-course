package lr4;

//Напишите программу, в которой создается двумерный массив,
//который выводи прямоугольник из цифр 2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ширину и высоту прямоугольника через пробел!");
        int width = in.nextInt(), height = in.nextInt();
        System.out.println("Прямоугосульник, ширина которого равна: " + width + "; высота: " + height);
        int[][] arr = new int[height][width];
        for (int i = 0; i<height; i++){
            for(int j = 0; j< width; j++){
                arr[i][j] = 2;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
