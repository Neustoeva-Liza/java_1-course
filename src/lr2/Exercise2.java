package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        if ((num%5==2)&&(num%7==1)) System.out.println("Число удовлетворяет условиям");
        else System.out.println("Число не удовлетворяет условиям");

    }
}
