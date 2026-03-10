package lr9;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему счисления: ");
        int num = in.nextInt();
        System.out.print("Результат:");
        System.out.println(second(num));
    }

    public static String second(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        return second(n / 2) + (n % 2);
    }
}
