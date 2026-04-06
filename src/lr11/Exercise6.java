package lr11;

//Напишите функцию, которая принимает на вход список целых чисел и
//возвращает новый список, содержащий только те числа, которые делятся на
//заданное число без остатка.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> newIntegers = divisionByNumber(integers, 4);
        System.out.println("\n" + "Список после деления без остатка на 4: " + "\n");
        for (Integer i : newIntegers) {
            System.out.println(i);
        }
    }
    public static List<Integer> divisionByNumber(List<Integer> list, int num) {
        return list.stream()
                .filter(x -> x % num == 0)
                .collect(Collectors.toList());
    }
}
