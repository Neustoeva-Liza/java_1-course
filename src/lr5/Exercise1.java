package lr5;

import java.util.Scanner;

//Напишите программу с классом, в котором есть закрытое символьное поле и
//три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.

public class Exercise1 {
    private char symbol;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Exercise1 container = new Exercise1();

        System.out.print("Введите символ: ");
        String input = in.nextLine();

        if (input.length() > 0) {
            char userChar = input.charAt(0);
            container.firstFunction(userChar);
            container.thirdFunction();
        } else {
            System.out.println("Вы не ввели ни одного символа!");
        }

        in.close();
    }

    public void firstFunction(char ch) {
        symbol = ch;
    }

    public int secondFunction(){
        return (int) symbol;
    }

    public void thirdFunction(){
        System.out.println("Символ: " + symbol + "; Его код: " + secondFunction());
    }
}
