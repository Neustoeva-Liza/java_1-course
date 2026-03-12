package lr9.exercise8;

public class Recursion {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    // Рекурсивное создание списка с головы
    private  Node createHeadRecHelper(int[] values, int index) {
        if (index < 0) return null;
        Node node = new Node(values[index]);
        node.next = createHeadRecHelper(values, index - 1);
        return node;
    }

    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, values.length - 1);
    }

    // Рекурсивное создание списка с хвоста
    private Node  createTailRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        Node node = new Node(values[index]);
        node.next = createTailRecHelper(values, index + 1);
        return node;
    }

    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    // Рекурсивный вывод списка в строку
    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        String rest = toStringRecHelper(node.next);
        return (rest.isEmpty() ? String.valueOf(node.data) : node.data + " " + rest);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    // -------------------- Демонстрация работы --------------------
    public static void main(String[] args) {
        Recursion listRec = new Recursion();

        System.out.println("createHeadRec (массив 9,8,7):");
        listRec.createHeadRec(new int[]{9, 8, 7});
        System.out.println("toStringRec: " + listRec.toStringRec());

        System.out.println("createTailRec (массив 1,2,3,4):");
        listRec.createTailRec(new int[]{1, 2, 3, 4});
        System.out.println("toStringRec: " + listRec.toStringRec());
    }
}
