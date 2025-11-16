package lr4;

//Напишите программу «Шифр Цезаря»,
//в которой необходимо реализовать собственный алфавит, остальные условия идентичны 8 задаче

import java.util.Scanner;

public class Exercise9 {
    private static final String CUSTOM_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя .,!?";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();

        System.out.println("Введите ключ:");
        int shift = in.nextInt();
        in.nextLine();

        String encryptedText = encrypt(text, shift);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                String decryptedText = encrypt(encryptedText, -shift);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        in.close();
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        int alphabetLength = CUSTOM_ALPHABET.length();

        shift = ((shift % alphabetLength) + alphabetLength) % alphabetLength;

        for (char character : text.toCharArray()) {
            int index = CUSTOM_ALPHABET.indexOf(character);

            if (index != -1) {
                int newIndex = (index + shift) % alphabetLength;
                result.append(CUSTOM_ALPHABET.charAt(newIndex));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
