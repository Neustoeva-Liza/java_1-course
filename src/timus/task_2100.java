package timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int totalGuests = 2;

        for (int i = 0; i < n; i++) {
            String response = in.nextLine();

            if (response.contains("+one")) {
                totalGuests += 2;
            } else {
                totalGuests += 1;
            }
        }

        if (totalGuests == 13) {
            totalGuests += 1;
        }

        int cost = totalGuests * 100;
        System.out.println();

        System.out.println(cost);

        in.close();
    }
}
