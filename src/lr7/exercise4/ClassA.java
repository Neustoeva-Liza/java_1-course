package lr7.exercise4;

//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.

public class ClassA {
    public char symbol;

    public ClassA(char symbol){
        this.symbol = symbol;
    }

    public ClassA(ClassA other){
        this.symbol = other.symbol;
    }

    @Override
    public String toString(){
        String classAText;
        classAText = "Base char: symbol = " + symbol;
        return classAText;
    }
}
