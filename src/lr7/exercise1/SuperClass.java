package lr7.exercise1;

public class SuperClass {
    private String text1;

    SuperClass(String text){
        this.text1 = text;
    }

    SuperClass() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" + " Class name: " +
                this.getClass().getSimpleName() + "\n" + " text 1 = " + this.getText1();

        return superClassNameAndFieldValue;
    }

    public String getText1(){
        return  text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
}
