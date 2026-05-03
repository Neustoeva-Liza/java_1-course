package lr12;

//Напишите программу, которая создает 10 потоков и
// каждый поток выводит на экран свой номер.

public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Поток " + threadNumber);
            });
            thread.start();
        }
    }
}
