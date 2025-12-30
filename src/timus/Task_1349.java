package timus;

import java.util.Scanner;

public class Task_1349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("-1");
            return;
        }

        if (n == 1) {
            System.out.println("1 2 3");
            return;
        }

        if (n >= 3) {
            System.out.println("-1");
            return;
        }

        int max = 100;
        for (int a = 1; a <= max; a++) {
            for (int b = a + 1; b <= max; b++) {
                int csq = a * a + b * b;
                int c = (int) Math.sqrt(csq);
                if (c * c == csq && c <= max && c != a && c != b) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }

        System.out.println("-1");

        in.close();
    }
}
