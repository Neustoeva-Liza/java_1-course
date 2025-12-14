package lr6;

import java.util.Scanner;

//Напишите программу с классом, в котором есть два поля: символьное и текстовое. В
//классе должен быть перегруженный метод для присваивания значений полям. Если метод
//вызывается с символьным аргументом, то соответствующее значение присваивается
//символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//значение текстового ноля. Методу аргументом также может передаваться символьный
//массив. Если массив состоит из одного элемента, то он определяет значение символьного
//поля. В противном случае (если в массиве больше одного элемента) из символов массива
//формируется текстовая строка и присваивается значением текстовому полю.

public class Exercise1 {
    static class DataHolder {
        char symbol;
        String text;

        void setValue(char c) {
            symbol = c;
        }
        void setValue(String s) {
            text = s;
        }
        void setValue(char[] arr) {
            if (arr.length == 1) {
                symbol = arr[0];
            } else {
                text = new String(arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataHolder obj = new DataHolder();

        System.out.print("Введите символ: ");
        char c = in.next().charAt(0);
        obj.setValue(c);

        in.nextLine();
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        obj.setValue(s);

        System.out.print("Введите набор символов: ");
        String input = in.nextLine();
        char[] arr = input.toCharArray();
        obj.setValue(arr);

        System.out.println("\nРезультат:");
        System.out.println("Символьное поле: " + obj.symbol);
        System.out.println("Текстовое поле: " + obj.text);

        in.close();
    }
}