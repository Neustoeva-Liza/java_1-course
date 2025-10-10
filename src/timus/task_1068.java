package timus;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();
        int res = 0;

        if (n >= 1) {
            res = n * (n + 1) / 2;
        } else {
            res = (n + 1) * (2 - n) / 2;
        }
        System.out.println(res);
    }
}
