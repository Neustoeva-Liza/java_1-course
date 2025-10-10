package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и
//отображается сумма и разность этих чисел.

public class Example15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int sum = a + b;
        int diff = a - b;

        System.out.println("Сумма: " + sum + "; Разность: "  + diff);
        in.close();
    }

}
