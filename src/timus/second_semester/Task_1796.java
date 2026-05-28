package timus.second_semester;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1796 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[6];
        int[] denom = {10, 50, 100, 500, 1000, 5000};
        long total = 0;
        int minDenom = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            count[i] = in.nextInt();
            total += (long) count[i] * denom[i];
            if (count[i] > 0 && denom[i] < minDenom) {
                minDenom = denom[i];
            }
        }

        int price = in.nextInt();
        ArrayList<Integer> answers = new ArrayList<>();

        for (int m = 1; m <= total / price; m++) {
            if (total - minDenom < (long) m * price) {
                answers.add(m);
            }
        }

        System.out.println(answers.size());
        for (int i = 0; i < answers.size(); i++) {
            System.out.print(answers.get(i) + (i == answers.size() - 1 ? "\n" : " "));
        }
    }
}
