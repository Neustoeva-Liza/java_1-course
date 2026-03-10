package lr9.exercise1;

public class Example5 {
    private static int callCounter = 0;
    private static int depth = 0;

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Дерево вызовов для fib(" + n + "):\n");
        int result = fib(n);
        System.out.println("\nРезультат: " + result);
        System.out.println("Всего вызовов: " + callCounter);
    }

    public static int fib(int n) {
        callCounter++;
        for (int i = 0; i < depth; i++) System.out.print("  ");
        System.out.println("fib(" + n + ")");
        if (n == 0) return 0;
        if (n == 1) return 1;

        depth++;
        int first = fib(n - 2);
        depth--;

        depth++;
        int second = fib(n - 1);
        depth--;

        int result = first + second;
        for (int i = 0; i < depth; i++) System.out.print("  ");

        System.out.println("  возвращаем " + result + " = " + first + " + " + second);

        return result;
    }
}
