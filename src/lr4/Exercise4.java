package lr4;

//Напишите программу, в которой создается двумерный массив,
//который выводит прямоугольный треугольник;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите высоту прямоугольного треугольника!");
        int height = in.nextInt();
        System.out.println("Прямоугольный треугольник с высотой: " + height);
        char[][] arr = new char[height][];
        char symbol = '+';
        for (int i = 0; i<height; i++){
            arr[i]= new char[i+1];
            for(int j = 0; j<=i; j++){
                arr[i][j] = symbol;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
