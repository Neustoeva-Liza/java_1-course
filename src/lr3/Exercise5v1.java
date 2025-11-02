package lr3;

import java.util.Scanner;

//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке
//получается 2, или при делении на 3 в остатке получается 1 Количество чисел в
//сумме вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.

public class Exercise5v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");

        int count = in.nextInt();

        if (count<=0) {
            System.out.println("Число должно быть положительным!");
            return;
        }

        int sum = 0;
        int number = 1;

        for (int i = 0; i < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number);
                sum += number;
                i++;

                if (i < count) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.println(" = " + sum);
        in.close();
    }
}
