package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.

public class Exercise2v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String dayName = in.nextLine().toLowerCase().trim();
        int dayNumb;

        switch (dayName){
            case "понедельник":
                dayNumb = 1;
                break;
            case "вторник":
                dayNumb = 2;
                break;
            case "среда":
                dayNumb = 3;
                break;
            case "четверг":
                dayNumb = 4;
                break;
            case "пятница":
                dayNumb = 5;
                break;
            case "суббота":
                dayNumb = 6;
                break;
            case "воскресенье":
                dayNumb = 7;
                break;
            default:
                dayNumb = 8;
                break;
        }

        if (dayNumb != 8) System.out.println("Это " + dayNumb + "-й день недели!");
        else System.out.println("Такого дня нет!");

        in.close();
    }
}
