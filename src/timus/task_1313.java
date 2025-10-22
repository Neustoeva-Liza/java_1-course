package timus;

import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            for (int i = n - 1; i >= 0; i--) {
                int j = sum - i;
                if (i >= 0 && i < n && j >= 0 && j < n) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
