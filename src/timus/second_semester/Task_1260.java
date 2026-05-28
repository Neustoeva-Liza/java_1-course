package timus.second_semester;

import java.util.Scanner;

public class Task_1260 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] dp = new long[56];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + 1;
        }
        System.out.println(dp[n]);
    }
}
