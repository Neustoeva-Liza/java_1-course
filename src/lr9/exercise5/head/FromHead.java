package lr9.exercise5.head;

public class FromHead {
    public static void main(String[] args) {
        Node head = null;

        for (int i = 0; i < 5; i++) {
            head = new Node(i, head);
        }

        Node ref = head;
        while (ref != null) {
            System.out.println(ref.value + " ");
            ref = ref.next;
        }
    }
}
