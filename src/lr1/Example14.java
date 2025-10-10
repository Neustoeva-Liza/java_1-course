package lr1;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит число, а программой отображается
//последовательность из четырех чисел: число, на единицу меньше введённого, введенное число и
//число, на единицу больше введенного.
//Четвертое число должно быть квадратом суммы первых трех чисел.

public class Example14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int numb = in.nextInt();

        int prevNumb = numb - 1;
        int nextNumb = numb + 1;
        int sum = numb + prevNumb + nextNumb;
        int squareSum = sum * sum;

        System.out.println("Последовательность из четырех чисел: " + prevNumb + "; "  + numb +
                "; "  + nextNumb + "; "  + squareSum);
        in.close();
    }

}
