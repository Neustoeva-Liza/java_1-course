package lr6;

import java.util.Scanner;

//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15

public class Exercise4 {

    static long doubleFactorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = in.nextInt();

        long df = doubleFactorial(n);

        System.out.println(n + "!! = " + df);

        in.close();
    }
}
