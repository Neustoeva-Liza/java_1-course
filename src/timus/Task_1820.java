package timus;

import java.util.Scanner;

public class Task_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();

        int time = n*2/k;;

        if (k>=n) System.out.println(2);
        else {
            if ((n*2)%k==0) System.out.println(time);
            else System.out.println(time+1);
        }
        in.close();
    }
}
