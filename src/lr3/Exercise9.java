package lr3;

import java.util.Scanner;
import java.util.Random;

//Напишите программу, в которой создается массив и заполняется
//случайными числами. Массив отображается в консольном окне. В этом
//массиве необходимо определить элемент с минимальным значением. В
//частности, программа должна вывести значение элемента с минимальным
//значением и индекс этого элемента. Если элементов с минимальным
//значением несколько, должны быть выведены индексы всех этих элементов.

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным!");
            return;
        }

        System.out.println("Размер массива равен: " + size);
        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i<nums.length; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("\nВсе элементы с минимальным значением " + min + ":");
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.println("Элемент [" + i + "] = " + nums[i]);
                count++;
            }
        }
        System.out.println("Всего элементов с минимальным значением: " + count);

        in.close();
    }

}
