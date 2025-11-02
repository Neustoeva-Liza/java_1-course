package lr3;

//Напишите программу, в которой создается символьный массив из
//10 элементов. Массив заполнить большими (прописными) буквами
//английского алфавита. Буквы берутся подряд, но только согласные (то есть
//гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//нужно пропустить). Отобразите содержимое созданного массива в консольном окне

public class Exercise8 {
    public static void main(String[] args) {
        int n = 10;
        char[] letters = new char[n];

        char current = 'A';
        int count = 0;

        while(count<n){
            if (current != 'A' && current != 'E' && current != 'I' && current != 'O' && current != 'U'){
                letters[count] = current;
                count++;
            }
            current++;
        }

        System.out.println("Массив согласных букв: ");
        for (int i = 0; i < n; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}
