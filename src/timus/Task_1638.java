package timus;

import java.util.Scanner;

public class Task_1638 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pages = sc.nextInt();
        int cover = sc.nextInt();
        int from = sc.nextInt();
        int to = sc.nextInt();

        int cnt = to - from;
        int distance = Math.abs(2 * cover + (cnt - 1) * (pages + 2 * cover));

        System.out.println(distance);
        sc.close();
    }
}
