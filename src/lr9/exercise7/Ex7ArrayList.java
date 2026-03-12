package lr9.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Ex7ArrayList {
    public static void main(String[] args) {
        int n = 1000000;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        long start = System.currentTimeMillis();
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("Остался: " + list.get(0));
        System.out.println("Время ArrayList: " + (end - start) + " мс");
    }
}
