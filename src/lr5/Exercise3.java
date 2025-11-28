package lr5;

//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать объекты
//без передачи аргументов, с передачей одного аргумента и с передачей двух
//аргументов.

public class Exercise3 {
    private int firstNumber;
    private int secondNumber;

    public Exercise3() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }
    public Exercise3(int number) { this(number, number); }
    public Exercise3(int first, int second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }

    public String toString() {
        return String.format("Первое число: %d, Второе число: %d", firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        System.out.println(new Exercise3());
        System.out.println(new Exercise3(5));
        System.out.println(new Exercise3(3, 7));
    }
}
