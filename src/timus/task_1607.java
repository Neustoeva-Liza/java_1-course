package timus;

import java.util.Scanner;

//В единственной строке даны 4 целых числа: a — стартовая цена Пети, b — надбавка Пети к своей цене,
//c — стартовая цена таксиста, d — скидка таксиста к своей цене (1 ≤ a, b, c, d ≤ 10000).

public class task_1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

        while (a<c){
            a +=b;
            c -=d;
        }
        System.out.println(a);

        in.close();
    }

}
