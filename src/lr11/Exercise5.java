package lr11;

//Напишите функцию, которая принимает на вход список строк и
//возвращает новый список, содержащий только те строки, которые содержат
//заданную подстроку.

import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и\n" +
                "возвращает новый список, содержащий только те строки, которые содержат\n" +
                "заданную подстроку. ";
        List<String> strings = List.of(string.split(" "));

        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> afterStrings = containsString(strings, "ок");

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : afterStrings) {
            System.out.println(e);
        }
    }
    public static List<String> containsString(List<String> list, String substring){
        return list.stream().filter(str -> str != null && str.contains(substring))
                .collect(Collectors.toList());
    }
}
