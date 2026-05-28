package timus.second_semester;

import java.util.Scanner;

public class Task_1079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MAX = 100000;
        int[] a = new int[MAX + 1];
        int[] best = new int[MAX + 1];

        a[0] = 0;
        a[1] = 1;
        best[0] = 0;
        best[1] = 1;

        for (int i = 2; i <= MAX; i++) {
            if (i % 2 == 0) {
                a[i] = a[i / 2];
            } else {
                a[i] = a[i / 2] + a[i / 2 + 1];
            }
            best[i] = Math.max(best[i - 1], a[i]);
        }

        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            System.out.println(best[n]);
        }
    }
}
