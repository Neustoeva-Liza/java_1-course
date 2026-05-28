package timus.second_semester;

import java.util.Scanner;

public class Task_2068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long totalK = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            totalK += (m - 1) / 2;
        }
        if (totalK % 2 == 1) {
            System.out.println("Daenerys");
        } else {
            System.out.println("Stannis");
        }
    }
}
