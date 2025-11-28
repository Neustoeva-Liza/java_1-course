package lr5;

//Напишите программу склассом, у которого есть закрытое целочисленное поле.
//Значение полю присваивается с помощью открытого метода. Методу
//аргументом может передаваться целое число, а также метод может вызываться
//без аргументов. Если методы вызывается без аргументов, то поле получает
//нулевое значение. Если метод вызывается с целочисленным аргументом, то
//это значение присваивается полю. Однако если переданное аргументом
//методу значение превышает 100, то значением полю присваивается число 100
//Предусмотрите в классе конструктор, который работает по тому же принципу
//что и метод для присваивания значения полю. Также в классе должен быть
//метод, позволяющий проверить значение поля.

public class Exercise5 {
    private int fieldValue;

    public void setFieldValue() {
        setFieldValue(0);
    }

    public void setFieldValue(int value) {
        this.fieldValue = Math.min(value, 100);
    }

    public Exercise5() {
        this(0);
    }

    public Exercise5(int value) {
        setFieldValue(value);
    }

    public int getFieldValue() {
        return fieldValue;
    }

    public static void main(String[] args) {
        Exercise5 obj1 = new Exercise5();
        System.out.println("Начальное значение поля (конструктор без аргументов): " + obj1.getFieldValue());

        obj1.setFieldValue(50);
        System.out.println("Значение после установки методом (50): " + obj1.getFieldValue());

        obj1.setFieldValue(150);
        System.out.println("Значение после превышения лимита (150 -> ограничено до 100): " + obj1.getFieldValue());

        obj1.setFieldValue();
        System.out.println("Значение после вызова метода без аргументов: " + obj1.getFieldValue());
    }
}
