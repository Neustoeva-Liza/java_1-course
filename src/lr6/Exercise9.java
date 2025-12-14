package lr6;

import java.util.Scanner;

//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый - с последним, второй - с предпоследним и так далее.

public class Exercise9 {
    static void reversePairs(char[] array){
        int n = array.length;
        for (int i = 0; i < n/2; i++){
            char temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = in.nextLine();

        char[] array = input.toCharArray();

        reversePairs(array);

        System.out.println("\nРезультат перестановки:");
        for (char c : array) {
            System.out.print(c);
        }

        in.close();
    }
}
