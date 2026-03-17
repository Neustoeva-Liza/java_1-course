package timus.second_semester;

import java.util.Scanner;

public class Task_1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        String[] A = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = buildA(i);
        }

        String result = A[1] + "+" + N;
        for (int i = 2; i <= N; i++) {
            result = "(" + result + ")" + A[i] + "+" + (N - i + 1);
        }

        System.out.println(result);
    }

    private static String buildA(int n) {
        return buildAHelper(n, 1);
    }

    private static String buildAHelper(int n, int i) {
        if (i == n) {
            return "sin(" + i + ")";
        }
        String sign = (i % 2 == 1) ? "-" : "+";
        return "sin(" + i + sign + buildAHelper(n, i + 1) + ")";
    }
}
