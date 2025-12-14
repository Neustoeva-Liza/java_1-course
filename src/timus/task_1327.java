package timus;

import java.util.Scanner;

public class task_1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int count = 0;

        for (int day = A; day <= B; day++) {
            if (day % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);

        in.close();
    }
}
