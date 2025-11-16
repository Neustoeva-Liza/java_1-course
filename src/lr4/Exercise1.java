package lr4;

//Напишите программу, которая выводить в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки,
//высота: 11 строк;

public class Exercise1 {
    public static void main(String[] args) {

        int width = 23, height = 11;
        System.out.println("Прямоугольник " + width + "x" + height + ":");
        for (int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

}
