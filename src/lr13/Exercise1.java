package lr13;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите размер массива: ");
            int n = Integer.parseInt(in.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }
            int[] arr = new int[n];

            System.out.println("Введите элементы массива (целые числа):");
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = Integer.parseInt(in.nextLine());
            }

            int sum = 0;
            int count = 0;

            for (int num : arr) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Положительные элементы отсутствуют");
            }

            double average = (double) sum / count;
            System.out.println("Среднее арифмитическое = " + average);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число или некорректное число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершено!");
            in.close();
        }
    }
}