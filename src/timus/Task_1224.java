package timus;

import java.util.Scanner;

public class Task_1224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        long turns;
        if (N < M) {
            turns = 2 * N - 2;
        } else if (N > M) {
            turns = 2 * M - 1;
        } else {
            turns = 2 * N - 2;
        }

        System.out.println(turns);
        sc.close();
    }
}
