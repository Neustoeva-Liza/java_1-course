package lr3;

import java.util.Scanner;

//Напишите программу, в которой создается одномерный числовой
//массив и заполняется числами, которые при делении на 5 дают в остатке 2
//(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного
//значения.

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        if (in.hasNextInt()) {
            int num = in.nextInt();

            if (num>0) {
                int[] arr = new int[num];


                for (int i = 0; i < num; i++) {
                    arr[i] = 2 + i*5;

                }
                for (int number : arr) {
                    System.out.print(number + " ");
                }
            } else {
                System.out.println("Ошибка: размер массива должен быть положительным!");
            }
        } else {
            System.out.println("Ошибка: нужно ввести целое число!");
        }
        in.close();
    }
}
