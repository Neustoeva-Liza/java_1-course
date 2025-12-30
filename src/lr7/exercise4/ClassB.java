package lr7.exercise4;

//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.

public class ClassB extends ClassA{
    public String text;

    public ClassB(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public ClassB(ClassB other) {
        super(other.symbol);
        this.text = other.text;
    }

    @Override
    public String toString() {
        String classBText;
        classBText = "Sub string: symbol = " + symbol + ", text = " + text;
        return classBText;
    }

}
