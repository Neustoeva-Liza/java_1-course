package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений.

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен: " + size);
        Integer[] nums = new Integer[size];
        Random random = new Random();

        for (int i = 0; i<nums.length; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Произведена сорттировка массива");
        for (int i = 0; i<nums.length; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }

    }
}
