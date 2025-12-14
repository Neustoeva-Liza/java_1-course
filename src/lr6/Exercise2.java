package lr6;

//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.

public class Exercise2 {
    static class Counter {
        private static int value = 0;

        public static void showAndIncrement() {
            System.out.println(value);
            value++;
        }
    }

    public static void main(String[] args) {
        Counter.showAndIncrement();
        Counter.showAndIncrement();
        Counter.showAndIncrement();
    }
}
