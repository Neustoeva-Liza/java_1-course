package lr7.exercise3;

//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта.

public class SubClass32 extends SubClass31{
    public String text;

    public SubClass32(int number, char symbol, String text){
        super(number, symbol);
        this.text = text;
    }

    public void setText(int number, char symbol, String text) {
        super.setSymbol(number, symbol);
        this.text = text;
    }

    @Override
    public String toString() {
        String classThreeText;
        classThreeText = "SubClass2: number = " + number +
                ", symbol = " + symbol + ", text = " + text;
        return classThreeText;
    }
}
