package timus.second_semester;

import java.util.Scanner;
import java.math.BigInteger;

public class Task_1402 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger total = BigInteger.ZERO;
        BigInteger perm = BigInteger.ONE;
        for (int k = 1; k <= n; k++) {
            perm = perm.multiply(BigInteger.valueOf(n - k + 1));
            if (k >= 2) total = total.add(perm);
        }
        System.out.println(total);
    }
}