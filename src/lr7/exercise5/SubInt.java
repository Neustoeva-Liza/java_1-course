package lr7.exercise5;

//На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса.

public class SubInt extends SuperClass5{
    protected int number;

    public SubInt(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void show() {
        String classTwoText;
        classTwoText = getClass().getSimpleName() + "; number = " + number;
        System.out.println(classTwoText);

        super.show();
    }
}
