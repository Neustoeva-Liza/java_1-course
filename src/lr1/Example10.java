package lr1;

import java.util.Scanner;

//Напишите программу, в которой по году рождения определяется возраст пользователя.

public class Example10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int nowYear = 2025;

        System.out.println("Введите ваш год рождения: ");
        int yourYear = in.nextInt();

        int age = nowYear - yourYear;

        System.out.print("Ваш возраст: " + age + " лет");

        in.close();
    }

}
