package lr4;

//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с
// исходным удалена одна строка и один столбец). Индекс удаляемой
//строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите высоту и ширину прямоугольника через пробел!");
        int height = in.nextInt(), width = in.nextInt();
        int[][] arr = new int[height][width];

        System.out.println("Изначальный массив: ");
        for (int i = 0; i<height; i++){
            for (int j = 0; j<width; j++){
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowToRemove = random.nextInt(height);
        int colToRemove = random.nextInt(width);

        System.out.println("\nУдаляем строку " + rowToRemove + " и столбец " + colToRemove);

        System.out.println("\nМассив после удаления строки " + rowToRemove + " и столбца " + colToRemove + ":");

        int[][] newArr = new int[height - 1][width - 1];

        int newI = 0;
        for (int i = 0; i<height; i++){
            if (i == rowToRemove) continue;

            int newJ = 0;
            for (int j = 0; j<width; j++){
                if (j == colToRemove) continue;

                newArr[newI][newJ] = arr[i][j];
                System.out.print(newArr[newI][newJ] + " ");
                newJ++;
            }
            newI++;
            System.out.println();
        }
        in.close();
    }
}
