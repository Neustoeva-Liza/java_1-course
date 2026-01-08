package timus;

import java.util.Scanner;

public class Task_1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int Count;
        if (n % 2 == 0) {
            Count = n / 2;
        } else {
            Count = (n + 1) / 2;
        }

        if (Count % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
    }
}
