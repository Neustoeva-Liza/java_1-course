package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        if (num%4==0 && num>=10) System.out.println("Число удовлетворяет условиям!");
        else System.out.println("Число не удовлетворяет условиям!");

    }
}
