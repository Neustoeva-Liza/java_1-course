package lr7.exercise2;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе (суперклассе) должен быть метод для присваивания значения полю с
//текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки. На
//основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое
//(публичное) целочисленное поле. В классе должны быть такие версии метода для
//присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).

public class SubClass2 extends SuperClass2 {
    public int number;

    public SubClass2(int number, String text){
        super(text);
        this.number = number;
    }

    public void setValues() {
        super.setText("default");
        number = 0;
    }

    public void setValues(String text){
        super.setText(text);
    }

    public void setValues(int number){
        this.number = number;
    }

    public void setValues(String text, int number){
        super.setText(text);
        this.number = number;
    }

    @Override
    public String toString(){
        String subClassText;
        subClassText = "SubClass: number = " + number + ", " + super.toString();
        return subClassText;
    }
}
