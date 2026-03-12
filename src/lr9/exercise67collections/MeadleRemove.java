package lr9.exercise67collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.TreeSet;

public class MeadleRemove {

    private static final int SIZE = 13_000_000;
    private static final int MIDDLE = SIZE / 2;

    public static void main(String[] args) {
        System.out.println("ИЗМЕРЕНИЕ времени выполнения\n");

        measureArrayDeque();
        measureLinkedList();
        measureTreeSet();
    }

    private static void measureArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>(SIZE);
        for (int i = 0; i < SIZE; i++) deque.add(i);

        long start = System.nanoTime();
        deque.remove(MIDDLE);
        long end = System.nanoTime();

        System.out.printf("ArrayDeque: %.3f мс %n",
                (end - start) / 1_000_000.0);
    }

    private static void measureLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);

        long start = System.nanoTime();
        list.remove(MIDDLE);
        long end = System.nanoTime();

        System.out.printf("LinkedList: %.3f мс %n",
                (end - start) / 1_000_000.0);
    }

    private static void measureTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < SIZE; i++) set.add(i);

        long start = System.nanoTime();
        set.remove(MIDDLE);
        long end = System.nanoTime();

        System.out.printf("TreeSet: %.3f мс %n",
                (end - start) / 1_000_000.0);
    }
}
