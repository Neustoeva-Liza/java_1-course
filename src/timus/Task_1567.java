package timus;

import java.util.*;

public class Task_1567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine().toLowerCase();

        Map<Character, Integer> costMap = new HashMap<>();

        String[] keys = {
                ".,!1", "abc2", "def3", "ghi4", "jkl5",
                "mno6", "pqr7", "stu8", "vwx9", "yz10"
        };

        for (String key : keys) {
            for (int i = 0; i < key.length(); i++) {
                costMap.put(key.charAt(i), i + 1);
            }
        }

        int cost = 0;
        for (char c : str.toCharArray()) {
            cost += costMap.getOrDefault(c, 1);
        }

        System.out.println(cost);
        in.close();
    }
}
