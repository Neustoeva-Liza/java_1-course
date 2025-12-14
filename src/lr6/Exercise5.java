package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 12 + 22 +32+…+n2 =(n+l) (2n + 1)/6

public class Exercise5 {
    static long sumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите n: ");
        int n = in.nextInt();

        long sum = sumOfSquares(n);
        long formula = (long) n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("Сумма квадратов: " + sum);
        System.out.println("По формуле:      " + formula);
        in.close();
    }
}
