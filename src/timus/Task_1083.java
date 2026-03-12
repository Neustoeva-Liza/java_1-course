package timus;

import java.util.Scanner;

public class Task_1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = parts[1].length();

        long result = 1;
        int current = n;
        while (current > 0) {
            result *= current;
            current -= k;
        }
        System.out.println(result);
    }
}
