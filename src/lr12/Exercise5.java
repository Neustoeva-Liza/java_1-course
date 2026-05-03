package lr12;

//Напишите функцию, которая находит максимальный элемент в массиве целых
// чисел при помощи многопоточности. Количество потоков должно быть равно
// количеству ядер процессора.

public class Exercise5 {
    public static int findMax(int[] array) {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] partialMax = new int[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];
        int chunkSize = array.length / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = (i == numberOfThreads - 1) ? array.length :
                    (i + 1) * chunkSize;

            threads[i] = new Thread(() -> {
                int max = array[start];
                for (int j = start + 1; j < end; j++) {
                    if (array[j] > max) max = array[j];
                }
                partialMax[threadIndex] = max;
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int globalMax = partialMax[0];
        for (int i = 1; i < numberOfThreads; i++) {
            if (partialMax[i] > globalMax) globalMax = partialMax[i];
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7, 9, 12, 2, 6, 3, 9};
        int max = findMax(numbers);
        System.out.println("Максимальный элемент: " + max);
    }
}
