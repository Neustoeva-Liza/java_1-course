package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователем вводится два
//целых числа. Программа выводит все целые числа — начиная с наименьшего
//(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//чисел). Предложите разные версии программы (с использованием разных
//операторов цикла).

public class Exercise4v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a = in.nextInt(), b = in.nextInt();
        in.close();

        int max= Math.max(a,b);
        int min = Math.min(a,b);

        if (min == max) {
            System.out.println(min + " (числа одинаковые)");
        } else {
            int i = min;
            while (i<=max){
                System.out.print(i + " ");
                i++;
            }
        }

    }
}
