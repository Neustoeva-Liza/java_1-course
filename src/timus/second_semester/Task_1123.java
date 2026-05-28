package timus.second_semester;

import java.util.Scanner;

public class Task_1123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n / 2; i++) a[n - 1 - i] = a[i];
        if (new String(a).compareTo(s) < 0) {
            for (int i = (n - 1) / 2; i >= 0; i--) {
                if (a[i] == '9') a[i] = a[n - 1 - i] = '0';
                else { a[i]++; a[n - 1 - i] = a[i]; break; }
            }
        }
        System.out.println(new String(a));
    }
}
