package timus.second_semester;

import java.util.Scanner;

public class Task_1283 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gold = in.nextDouble();
        double limit = in.nextDouble();
        int percent = in.nextInt();

        int years = 0;
        while (gold > limit) {
            gold -= gold * percent / 100.0;
            years++;
        }
        System.out.println(years);
    }
}