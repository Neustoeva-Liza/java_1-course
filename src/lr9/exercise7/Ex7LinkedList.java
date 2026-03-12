package lr9.exercise7;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex7LinkedList {
    public static void main(String[] args) {
        int n = 1000000;
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator();
        long start = System.currentTimeMillis();
        while (list.size() > 1) {
            if (!it.hasNext()) {
                it = list.listIterator();
            }
            it.next();
            if (!it.hasNext()) {
                it = list.listIterator();
            }
            it.next();
            it.remove();
        }
        long end = System.currentTimeMillis();
        System.out.println("Остался: " + list.get(0));
        System.out.println("Время LinkedList: " + (end - start) + " мс");
    }
}
