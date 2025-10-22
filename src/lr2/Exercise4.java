package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно.

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        if (num<=10 && num>=5) System.out.println("Число удовлетворяет условиям!");
        else System.out.println("Число не удовлетворяет условиям!");

    }
}
