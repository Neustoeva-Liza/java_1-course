package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Программа определяет день недели по числу. Введите целое число: ");
        int num = in.nextInt();
        String day = "";
        switch (num) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Введеное значение не допустимо";
                break;
        }
        System.out.println(day);
        in.close();
    }
}
