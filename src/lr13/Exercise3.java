package lr13;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(in.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            byte[] arr = new byte[n];

            System.out.println("Введите элементы массива (от -128 до 127):");
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                int input = Integer.parseInt(in.nextLine());

                if (input < -128 || input > 127) {
                    throw new IllegalArgumentException("Значение " + input + " выходит за пределы типа byte");
                }
                arr[i] = (byte) input;
            }

            int sum = 0;
            for (byte num : arr) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);

            if (sum >= -128 && sum <= 127) {
                System.out.println("Сумма помещается в тип byte: " + (byte) sum);
            } else {
                System.out.println("Сумма не помещается в тип byte (выходит за пределы -128..127)");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число или некорректное число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение работы");
            in.close();
        }
    }
}





