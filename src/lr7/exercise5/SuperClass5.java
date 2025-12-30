package lr7.exercise5;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса).

public class SuperClass5 {
    private String text;

    public SuperClass5(String text){
        this.text = text;
    }

    public void show() {
        String classOneText;
        classOneText = getClass().getSimpleName() + "; text = " + text;
        System.out.println(classOneText);
    }
}
