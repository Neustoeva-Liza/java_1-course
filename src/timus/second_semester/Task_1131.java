package timus.second_semester;

import java.util.Scanner;

public class Task_1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int time = 0;
        int computers = 1;

        while(computers < K && computers < N) {
            computers *= 2;
            time++;
        }

        if (computers < N) {
            int remaining = N - computers;
            time += (remaining + K - 1) / K;
        }

        System.out.println(time);
    }
}
