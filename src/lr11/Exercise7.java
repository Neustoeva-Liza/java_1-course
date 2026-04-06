package lr11;

//Напишите функцию, которая принимает на вход список строк и
//возвращает новый список, содержащий только те строки, которые имеют
//длину больше заданного значения.

import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "ok", "exercise");

        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> afterStrings = filterByLenght(strings, 3);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : afterStrings) {
            System.out.println(e);
        }
    }
    public static List<String> filterByLenght(List<String> strings, int minLenght){
        return strings.stream()
                .filter(s -> s != null && s.length()  > minLenght)
                .collect(Collectors.toList());
    }
}
