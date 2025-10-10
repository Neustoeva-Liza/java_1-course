package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит имя и год рождения, в программа
//отображает сообщение содержащее имя пользователя и его возраст.

public class Example11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите текущий год: ");
        int nowYear = in.nextInt();

        System.out.print("Введите год рождения: ");
        int yourYear = in.nextInt();

        int age = nowYear - yourYear;

        System.out.println("Имя пользователя: " + name + "; Ваш возраст: " + age + " лет");

        in.close();
    }

}
