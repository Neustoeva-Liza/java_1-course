package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int res = ((a * b) * n) * 2;

        out.println(res);
        out.flush();
    }

}
