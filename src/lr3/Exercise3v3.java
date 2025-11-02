package lr3;

import java.util.Scanner;

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается
//последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество
//чисел в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.

public class Exercise3v3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int num = in.nextInt();
        int[] fibonach = new int[num];

        if (num<=0){
            System.out.println("Количество чисел должно быть положительным!");
            return;
        }

        for (int i = 0; i<num; i++){
            if (i<2) fibonach[i] = 1;
            else fibonach[i] = fibonach[i-1] + fibonach[i-2];
        }

        for (int i = 0; i<num; i++){
            System.out.print(fibonach[i]);
            if (i<num-1) System.out.print(", ");
        }
        in.close();
    }
}
