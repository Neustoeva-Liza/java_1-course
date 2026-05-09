package timus.second_semester;

import java.util.Scanner;

public class Task_1644 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int maxHungry = 2;
        int minSatisfied = 10;

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            String state = in.next();

            if (state.equals("hungry")) {
                if (k > maxHungry) maxHungry = k;
            } else {
                if (k < minSatisfied) minSatisfied = k;
            }
        }

        if (maxHungry >= minSatisfied) {
            System.out.println("Inconsistent");
        } else {
            System.out.println(minSatisfied);
        }
    }
}
