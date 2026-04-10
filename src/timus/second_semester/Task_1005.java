package timus.second_semester;

import java.util.Scanner;

public class Task_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int total = 0;

        int[] numb = new int[n];

        for (int i = 0; i < n; i++){
            numb[i] = in.nextInt();
            total += numb[i];
        }

        int difference = total;

        for (int i = 0; i < (1 << n); i++) {
            int sumFirst = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sumFirst += numb[j];
                }
            }
            int sumSecond = total - sumFirst;
            int dif = Math.abs(sumFirst-sumSecond);
            if (dif < difference) {
                difference = dif;
            }
        }

        System.out.println(difference);
    }
}
