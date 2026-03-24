package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParserDop {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "src/lr10/example2/example-json.json";
    private static JSONArray books;

    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
        books = (JSONArray) root.get("books");
        menu();
        scanner.close();
    }

    private static void menu() {
        while (true) {
            System.out.println("\n1. Все книги\n2. Добавить\n3. Поиск\n4. Удалить\n5. Выход");
            String choice = scanner.nextLine();
            if (choice.equals("1")) showAll();
            else if (choice.equals("2")) add();
            else if (choice.equals("3")) searchByAuthor();
            else if (choice.equals("4")) delete();
            else if (choice.equals("5")) break;
            else System.out.println("Неверный выбор");
        }
    }

    private static void showAll() {
        if (books.isEmpty()) {
            System.out.println("Книг нет");
            return;
        }
        System.out.println("\nСписок книг:");
        for (int i = 0; i < books.size(); i++) {
            JSONObject b = (JSONObject) books.get(i);
            System.out.printf("%d. %s - %s (%s)%n", i + 1,
                    b.get("title"), b.get("author"), b.get("year"));
        }
    }

    private static void add() {
        try {
            System.out.println("\nНовая книга:");
            System.out.print("Название: ");
            String title = scanner.nextLine();
            System.out.print("Автор: ");
            String author = scanner.nextLine();
            System.out.print("Год: ");
            String year = scanner.nextLine();

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            books.add(newBook);
            save();
            System.out.println("Книга добавлена");
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    private static void searchByAuthor() {
        try {
            System.out.print("\nВведите автора: ");
            String query = scanner.nextLine();

            System.out.println("\nРезультаты:");

            long count = books.stream()
                    .filter(book -> book instanceof JSONObject)
                    .map(book -> (JSONObject) book)
                    .filter(book -> {
                        Object author = ((JSONObject) book).get("author");
                        return author != null && query.equalsIgnoreCase(author.toString());
                    })
                    .peek(book -> {
                        JSONObject b = (JSONObject) book;
                        Object title = b.get("title");
                        Object author = b.get("author");
                        Object year = b.get("year");
                        System.out.printf("%s - %s (%s)%n", title, author, year);
                    })
                    .count();

            System.out.println(count == 0 ? "Не найдено" : "Найдено: " + count);
        } catch (Exception e) {
            System.out.println("Ошибка поиска");
        }
    }

    private static void delete() {
        try {
            if (books.isEmpty()) {
                System.out.println("Книг нет");
                return;
            }
            showAll();
            System.out.print("\nНазвание книги: ");
            String title = scanner.nextLine();

            Iterator iterator = books.iterator();
            boolean deleted = false;
            while (iterator.hasNext()) {
                JSONObject b = (JSONObject) iterator.next();
                if (title.equalsIgnoreCase((String) b.get("title"))) {
                    iterator.remove();
                    deleted = true;
                    break;
                }
            }
            if (deleted) {
                save();
                System.out.println("Книга удалена");
            } else {
                System.out.println("Не найдено");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    private static void save() throws Exception {
        JSONObject root = new JSONObject();
        root.put("books", books);
        FileWriter writer = new FileWriter(FILE_PATH);
        writer.write(root.toJSONString());
        writer.close();
    }
}
