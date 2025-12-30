package lr7.exercise4;

//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.

public class ClassC extends ClassB{
    public int numb;

    public ClassC(char symbol, String text, int numb){
        super(symbol, text);
        this.numb = numb;
    }

    public ClassC(ClassC other){
        super(other.symbol, other.text);
        this.numb = other.numb;
    }

    @Override
    public String toString() {
        String classCText;
        classCText = "Sub int: symbol = " + symbol + ", text = " + text + ", int = " + numb;
        return classCText;
    }
}
