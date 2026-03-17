package timus.second_semester;

import java.util.Scanner;

public class Task_2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i=0; i<T; i++){
            int n = in.nextInt();
            int k = in.nextInt();

            long result = 0;

            for (int m = 2; m<=k; m++){
                int q = n / m;
                int r = n % m;

                long sumSquares = (long)r * (q + 1) * (q + 1) + (long)(m - r) * q * q;
                long fights = ( (long)n * n - sumSquares ) / 2;

                if (fights > result) {
                    result = fights;
                }
            }

            System.out.println(result);
        }

        in.close();
    }
}
