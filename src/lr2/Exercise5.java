package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();
        System.out.println(num/1000 + " тысяч во введенном числе");
    }
}
