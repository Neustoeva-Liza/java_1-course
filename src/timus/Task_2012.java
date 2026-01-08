package timus;

import java.util.Scanner;

public class Task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int difference = 12 - f;
        int time = difference * 45;
        if(time<=240) System.out.println("YES");
        else System.out.println("NO");
    }
}
