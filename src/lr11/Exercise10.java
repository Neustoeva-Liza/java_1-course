package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(20));
            System.out.println(integers.get(i));
        }

        System.out.println("\n" + "Введите число для фильтрации: ");
        int num = in.nextInt();

        List<Integer> newIntegers = lessTheNumber(integers, num);
        System.out.println("\n" + "Список чисел меньше : " + num + "\n");
        for (Integer i : newIntegers) {
            System.out.println(i);
        }
    }
    public static List<Integer> lessTheNumber(List<Integer> list, int num) {
        return list.stream()
                .filter(x -> x < num)
                .collect(Collectors.toList());
    }
}
