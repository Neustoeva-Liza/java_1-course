package lr12;

//Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи
// многопоточности. Количество потоков должно быть равно количеству ядер процессора.

import java.util.Random;

public class Exercise6 {
    public static long sumWithThreads(int[] array) {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер процессора: " + numberOfThreads);

        long[] partialSums = new long[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];
        int chunkSize = array.length / numberOfThreads;

        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numberOfThreads; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = (i == numberOfThreads - 1) ? array.length : (i + 1) * chunkSize;

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[threadIndex] = sum;
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

        long totalSum = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            totalSum += partialSums[i];
        }

        System.out.println("Общая сумма: " + totalSum);
        return totalSum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        sumWithThreads(numbers);
    }
}
