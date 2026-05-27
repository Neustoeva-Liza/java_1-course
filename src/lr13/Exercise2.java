package lr13;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            int[][] matrix = {
                    {3, 2, 1},
                    {6, 5, 4},
                    {9, 10, 7}
            };

            System.out.println("Матрица:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Введите номер столбца для вывода (нумерация с 0): ");
            int columnNumber = Integer.parseInt(in.nextLine());

            if (columnNumber < 0) {
                throw new IllegalArgumentException("Номер столбца не может быть отрицательным");
            }

            System.out.println("Столбец №" + columnNumber + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][columnNumber]);
            }

        } catch(NumberFormatException e){
            System.out.println("Ошибка: введено не число или некорректное число");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером не существует");
        } catch(IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        } finally{
            System.out.println("Завершение работы");
            in.close();
        }
    }
}