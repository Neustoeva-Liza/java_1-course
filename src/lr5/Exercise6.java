package lr5;

//Напишите программу с классом, в котором есть два закрытых
//целочисленных поля (назовем их max и min). Значение поля max не может
//быть меньше значения поля min. Значения полям присваиваются с помощью
//открытого метода. Метод может вызываться с одним или двумя
//целочисленными аргументами. При вызове метода значения полям
//присваиваются так: сравниваются текущие значения полей и значения
//аргументов, переданных методу. Самое большое из значений присваивается
//полю max, а самое маленькое из значений присваивается полю min.
//Предусмотрите конструктор, который работает по тому же принципу, что и
//метод для присваивания значений полям. В классе также должен быть метод,
//отображающий в консольном окне значения полей объекта.

public class Exercise6 {
    private int max;
    private int min;

    public Exercise6(int num1, int num2) {
        setValues(num1, num2);
    }

    public Exercise6(int num) {
        setValues(num);
    }

    public Exercise6() {
        this.max = 0;
        this.min = 0;
    }

    public void setValues(int num1, int num2) {
        this.max = Math.max(num1, num2);
        this.min = Math.min(num1, num2);
    }

    public void setValues(int num) {
        this.max = Math.max(this.max, num);
        this.min = Math.min(this.min, num);
    }

    public void display() {
        System.out.println("min = " + min + ", max = " + max);
    }

    public static void main(String[] args) {
        Exercise6 obj1 = new Exercise6(10, 20);
        obj1.display();

        Exercise6 obj2 = new Exercise6(50, 30);
        obj2.display();

        Exercise6 obj3 = new Exercise6(100);
        obj3.display();

        obj1.setValues(5, 15);
        obj1.display();

        obj2.setValues(25);
        obj2.display();

        obj3.setValues(80);
        obj3.display();
    }
}
