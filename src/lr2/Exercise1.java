package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, делится ли введенное
//Пользователем число на 3

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        if (num%3==0) System.out.println("Число делится на 3");
        else System.out.println("Число не делится на 3");
    }
}
