package timus.second_semester;

import java.util.Scanner;

public class Task_2011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x == 1) a++;
            else if (x == 2) b++;
            else c++;
        }

        if (n >= 6 && (a != n && b != n && c != n)) {
            System.out.println("Yes");
        } else if (n == 3 && a == 1 && b == 1 && c == 1) {
            System.out.println("Yes");
        } else if (n == 4 && (a == 2 && b == 2 || a == 2 && c == 2 || b == 2 && c == 2 ||
                a == 2 && b == 1 && c == 1 || a == 1 && b == 2 && c == 1 ||
                a == 1 && b == 1 && c == 2)) {
            System.out.println("Yes");
        } else if (n == 5 && !(a == 5 || b == 5 || c == 5 || a == 4 || b == 4 || c == 4)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
