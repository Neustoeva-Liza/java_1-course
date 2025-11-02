package lr3;

//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' g ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.

public class Exercise7 {
    public static void main(String[] args) {
        int n = 10;
        char[] letters = new char[n];

        char current = 'a';

        for (int i = 0; i<n; i++){
            letters[i] = current;
            current +=2;
        }

        System.out.println("Массив в прямом порядке: ");
        for (int i = 0; i<n; i++){
            System.out.print(letters[i]+ " ");
        }
        System.out.println();

        System.out.println("Массив в обратном порядке: ");
        for (int i = n-1; i>=0; i--){
            System.out.print(letters[i]+ " ");
        }
    }
}
