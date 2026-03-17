package timus.second_semester;

import java.util.Scanner;

public class Task_1457 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }
        double result = sum / N;
        System.out.printf("%.6f\n", result);
        scanner.close();
    }
}
