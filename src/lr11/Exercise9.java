package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "(java)", "ok", "exercise", "a22", "h#");

        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> afterStrings = filterOnlyLetters(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : afterStrings) {
            System.out.println(e);
        }
    }
    public static List<String> filterOnlyLetters(List<String> strings){
        return strings.stream()
                .filter(s -> s != null && s.matches("^[a-zA-Zа-яА-Я]+$"))
                .collect(Collectors.toList());
    }
}
