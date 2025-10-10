package lr1;

import java.util.Scanner;

//Напишите программу, в которой по возрасту определяется год рождения.

public class Example12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int nowYear = 2025;

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int yourYear = nowYear - age;

        System.out.println("Ваш год рождения: "  + yourYear);

        in.close();
    }

}
