package lr3;

import java.util.Scanner;

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается
//последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество
//чисел в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.

public class Exercise3v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int num = in.nextInt();
        int current;

        if (num<=0){
            System.out.println("Количество чисел должно быть положительным!");
            return;
        }

        if (num>=1) System.out.print("1");
        if (num>=2) System.out.print(", 1");

        int prev1 = 1, prev2 = 1;
        int i = 3;
        while(i<=num){
            current = prev1 + prev2;
            System.out.print(", " + current);
            prev2 = prev1;
            prev1 = current;
            i++;
        }
        in.close();
    }
}
