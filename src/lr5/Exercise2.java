package lr5;

//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.

import java.util.Scanner;

public class Exercise2 {
    private char startChar;
    private char endChar;

    public Exercise2(char start, char end) {
        this.startChar = start;
        this.endChar = end;
    }
    public void printCharRange() {
        char first = startChar < endChar ? startChar : endChar;
        char last = startChar > endChar ? startChar : endChar;

        System.out.println("Символы от '" + first + "' до '" + last + "':");

        for (char c = first; c <= last; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первый символ: ");
        char firstChar = in.nextLine().charAt(0);

        System.out.print("Введите второй символ: ");
        char secondChar = in.nextLine().charAt(0);

        Exercise2 range = new Exercise2(firstChar, secondChar);
        range.printCharRange();

        in.close();
    }
}
