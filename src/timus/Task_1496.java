package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) return;

        String[] teams = new String[n];
        for (int i = 0; i<n; i++){
            teams[i] = in.next();
        }

        Arrays.sort(teams);

        for (int i = 0; i<n; i++){
            int cnt = 1;
            while (i + 1 < n && teams[i].equals(teams[i + 1])) {
                cnt++;
                i++;
            }

            if (cnt > 1) {
                System.out.println(teams[i]);
            }
        }

        in.close();
    }
}
