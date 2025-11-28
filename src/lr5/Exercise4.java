package lr5;

//Напишите программу с классом,у которого есть символьное и
//целочисленное поле. В классе должны быть описаны версии конструктора с
//двумя аргументами (целое число и символ – определяют значения полей), а
//также с одним аргументом типа double. В последнем случае действительная
//часть аргумента определяет код символа (значение символьного поля), а
//дробная часть (с учетом десятых и сотых) определяет значение
//целочисленного поля. Например, если аргументом передается число 65.1267,
//то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//поле получит значение 12 (в дробной части учитываются только десятые и
//сотые).

public class Exercise4 {
    private char firstField;
    private int secondField;

    public Exercise4(char ch, int num) {
        this.firstField = ch;
        this.secondField = num;
    }

    public Exercise4(double value) {
        this.firstField = (char)((int)value);
        double fractional = value - (int)value;
        this.secondField = (int)(fractional * 100);
    }

    public void display() {
        System.out.println("Символ: '" + firstField + "' (код: " + (int)firstField + ")");
        System.out.println("Целое число: " + secondField);
    }

    @Override
    public String toString() {
        return "Символ: '" + firstField + "' (код: " + (int)firstField + "), Целое число: " + secondField;
    }

    public static void main(String[] args) {
        System.out.println("Создание объектов");

        Exercise4 obj1 = new Exercise4('K', 24);
        obj1.display();

        System.out.println();

        Exercise4 obj2 = new Exercise4(12.1967);
        obj2.display();

        System.out.println();

        Exercise4 obj3 = new Exercise4(90.6656);
        obj3.display();
    }
}
