package lr9;

import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Апельсин");
        map.put(2, "Арбуз");
        map.put(3, "Ананас");
        map.put(4, "Банан");
        map.put(5, "Груша");
        map.put(6, "Киви");
        map.put(7, "Мандарин");
        map.put(8, "Персик");
        map.put(9, "Яблоко");
        map.put(0, "Вишня,Черешня,Клубника");

        System.out.println("Ключ 5: " + map.get(5));

        if (map.containsKey(0)) {
            System.out.println("Ключ 0:");
            String[] items = map.get(0).split(",");
            for (String s : items) {
                System.out.println("  - " + s.trim());
            }
        }

        int product = 1;
        for (Integer key : map.keySet()) {
            if (map.get(key).length() > 5) {
                product *= key;
                System.out.println("Ключ " + key + " (строка длиной " + map.get(key).length() + ")");

            }
        }
        System.out.println("Произведение ключей: " + product);
    }
}
