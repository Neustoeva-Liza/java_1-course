package lr8.exercises;

//Создать проект, позволяющий из одного текстового файла, содержащего несколько строк
//(тип String) заранее подготовленного текста на русском языке (Пушкин, Лермонтов или другой
//российский классик на Ваш вкус), построчно переписать в другой текстовый файл слова начинающиеся с согласных букв.

import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\My\\classica.txt"), "cp1251"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\My\\result.txt")));

            String line;
            int lineCount = 0;
            String consonants = "бвгджзйклмнпрстфхцчшщ";

            while ((line = br.readLine()) != null){
                lineCount++;
                String[] words = line.split("[\\s,.;:!?+]");
                int count = 0;
                StringBuilder sb = new StringBuilder();

                for(String word : words) {
                    if (!word.isEmpty()) {
                        char firstChar = Character.toLowerCase(word.charAt(0));
                        if (consonants.indexOf(firstChar) >= 0) {
                            sb.append(word).append(" ");
                            count++;
                        }
                    }
                }

                if (count >0) {
                    bw.write("" + lineCount +": " + sb.toString().trim() + " " + count + ")");
                    bw.newLine();
                }
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println("Ошибка работы с файлами");
        }

    }
}
