package lr9.exercise8;

public class Cycle {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    // Создание списка добавлением элементов в начало (голову)
    public void createHead(int[] values) {
        head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            Node newNode = new Node(values[i]);
            newNode.next = head;
            head = newNode;
        }
    }

    // Создание списка добавлением элементов в конец (хвост)
    public void createTail(int[] values) {
        head = null;
        Node tail = null;
        for (int val : values) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    // Вывод списка в строку (цикл)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return  sb.toString().trim();
    }

    // Добавление в начало
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Добавление в конец
    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Вставка по позиции (нумерация с 0)
    public void Insert(int pos, int data) {
        if (pos < 0) return;
        if (pos == 0) {
            AddFirst(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current == null) return;
            current = current.next;
        }
        if (current == null) return;
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление первого элемента
    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Удаление последнего элемента
    public void RemoveLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Удаление элемента по позиции
    public void Remove(int pos) {
        if (pos < 0 || head == null) return;
        if (pos == 0) {
            RemoveFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current == null || current.next == null) return;
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // -------------------- Демонстрация работы --------------------
    public static void main(String[] args) {
        Cycle list = new Cycle();

        System.out.println("Создание списка через createHead (цикл):");
        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println("Список: " + list.toString());

        System.out.println("\nСоздание списка через createTail (цикл):");
        list.createTail(new int[]{10, 20, 30, 40});
        System.out.println("Список: " + list.toString());

        System.out.println("\nДобавление в начало (AddFirst): 99");
        list.AddFirst(99);
        System.out.println("Список: " + list.toString());

        System.out.println("Добавление в конец (AddLast): 77");
        list.AddLast(77);
        System.out.println("Список: " + list.toString());

        System.out.println("Вставка на позицию 2 (Insert): 55");
        list.Insert(2, 55);
        System.out.println("Список: " + list.toString());

        System.out.println("Удаление первого (RemoveFirst):");
        list.RemoveFirst();
        System.out.println("Список: " + list.toString());

        System.out.println("Удаление последнего (RemoveLast):");
        list.RemoveLast();
        System.out.println("Список: " + list.toString());

        System.out.println("Удаление с позиции 3 (Remove):");
        list.Remove(3);
        System.out.println("Список: " + list.toString());
    }
}
