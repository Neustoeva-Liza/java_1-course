package timus.second_semester;

import java.util.Scanner;

public class Task_1510 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int candidate = -1;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int value = in.nextInt();

            if (count == 0) {
                candidate = value;
                count = 1;
            } else if (candidate == value) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
