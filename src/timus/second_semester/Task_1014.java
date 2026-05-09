package timus.second_semester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int result = -1;

        if (n == 0) {
            result = 10;
        } else if (n == 1) {
            result = 1;
        } else {
            ArrayList<Integer> digits = new ArrayList<>();
            int temp = n;

            for (int d = 9; d >= 2; d--) {
                while (temp % d == 0) {
                    digits.add(d);
                    temp = temp / d;
                }
            }

            if (temp == 1) {
                Collections.sort(digits);
                long number = 0;
                for (int digit : digits) {
                    number = number * 10 + digit;
                }
                System.out.println(number);
                return;
            } else {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(result);
    }
}
