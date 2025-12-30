package lr7.exercise1;

public class SubClass extends SuperClass {
    private String text2;

    private String text3;

    SubClass(String text){
        super(text);
    }

    SubClass(String textEx2, String textEx3) {
        this.text2 = textEx2;
        this.text3 = textEx3;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " text 1 = " + this.getText1() + "\n" +
                " text 2 = " + this.text2 + "\n" +
                " text 3 = " + this.text3;
        return ClassNameAndFieldValue;
    }

    public String getText2(){
        return  text2;
    }

    public void setText2(String str2) {
        this.text2 = text2;
    }
    public String getText3(){
        return  text3;
    }

    public void setText3(String str3) {
        this.text3 = text3;
    }

}
