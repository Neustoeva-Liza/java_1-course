package lr4;

//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольного треугольника!");
        int size = in.nextInt();

        System.out.println("Прямоугольный треугольник:");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
