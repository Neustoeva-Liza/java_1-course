package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.

public class Exercise2v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String dayName = in.nextLine().toLowerCase().trim();
        int dayNumb;

        if (dayName.equals("понедельник")) dayNumb = 1;
        else if (dayName.equals("вторник")) dayNumb = 2;
        else if (dayName.equals("среда")) dayNumb = 3;
        else if (dayName.equals("четверг")) dayNumb = 4;
        else if (dayName.equals("пятница")) dayNumb = 5;
        else if (dayName.equals("суббота")) dayNumb = 6;
        else if (dayName.equals("воскресенье")) dayNumb = 7;
        else dayNumb = 8;

        if (dayNumb != 8) System.out.println("Это " + dayNumb + "-й день недели!");
        else System.out.println("Такого дня нет!");

        in.close();
    }
}
