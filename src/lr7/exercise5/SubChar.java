package lr7.exercise5;

//На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). Во
//втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей.

public class SubChar extends SuperClass5 {
    protected char symbol;

    public SubChar(String text, char symbol){
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        String classThreeText;
        classThreeText = getClass().getSimpleName() + "; symbol = " + symbol;
        System.out.println(classThreeText);

        super.show();
    }
}
