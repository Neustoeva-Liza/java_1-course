package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, аргументом которому передается
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.


public class Exercise7 {
    static int[] charCodes(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = in.nextLine();

        char[] charArray = input.toCharArray();

        int[] codeArray = charCodes(charArray);

        System.out.println("\nКоды символов:");
        for (int code : codeArray) {
            System.out.print(code + " ");
        }

        in.close();
    }
}
