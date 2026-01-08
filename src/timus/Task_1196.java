package timus;

import java.util.*;

public class Task_1196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> teacherSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            teacherSet.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int count = 0;

        for (int i = 0; i < m; i++) {
            int year = sc.nextInt();
            if (teacherSet.contains(year)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();

    }
}



