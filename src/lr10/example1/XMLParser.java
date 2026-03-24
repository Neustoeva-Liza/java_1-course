package lr10.example1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XMLParser {
    private static Scanner in = new Scanner(System.in);
    private static File inputFile = new File("src/lr10/example1/example.xml");
    private static Document doc;

    public static void main(String[] args) {
        try {
            loadDocument();
            mainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    private static void loadDocument() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("\nМеню библиотеки");
            System.out.println("1. Показать все книги\n2. Добавить книгу\n3. Поиск по автору");
            System.out.println("4. Поиск по году\n5. Поиск по автору и году\n6. Удалить книгу\n7. Выход");
            System.out.print("Выберите действие (1-7): ");

            switch (in.nextLine()) {
                case "1": showAllBooks(); break;
                case "2": addBook(); break;
                case "3": searchBy("author"); break;
                case "4": searchBy("year"); break;
                case "5": searchByAuthorAndYear(); break;
                case "6": deleteBook(); break;
                case "7": System.out.println("До свидания!"); return;
                default: System.out.println("Неверный выбор!");
            }
        }
    }

    private static List<Element> getBooks() {
        return IntStream.range(0, doc.getElementsByTagName("book").getLength())
                .mapToObj(i -> (Element) doc.getElementsByTagName("book").item(i))
                .collect(Collectors.toList());
    }

    private static void showAllBooks() {
        List<Element> books = getBooks();
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
            return;
        }
        System.out.println("\nСписок книг");
        for (int i = 0; i < books.size(); i++) {
            Element book = books.get(i);
            System.out.printf("%d. %s - %s (%s)%n", i + 1,
                    getElementText(book, "title"),
                    getElementText(book, "author"),
                    getElementText(book, "year"));
        }
    }

    private static String getElementText(Element parent, String tag) {
        return parent.getElementsByTagName(tag).item(0).getTextContent();
    }

    private static void addBook() {
        try {
            System.out.println("\nДобавление книги");
            System.out.print("Название: ");
            String title = in.nextLine();
            System.out.print("Автор: ");
            String author = in.nextLine();
            System.out.print("Год: ");
            String year = in.nextLine();

            Element book = doc.createElement("book");
            book.appendChild(createElement("title", title));
            book.appendChild(createElement("author", author));
            book.appendChild(createElement("year", year));
            doc.getDocumentElement().appendChild(book);

            saveDocument();
            System.out.println("Книга \"" + title + "\" добавлена!");
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static Element createElement(String name, String value) {
        Element element = doc.createElement(name);
        element.appendChild(doc.createTextNode(value));
        return element;
    }

    private static void searchBy(String criteria) {
        System.out.print("\nВведите " + (criteria.equals("author") ? "автора" : "год") + ": ");
        String query = in.nextLine();

        List<Element> found = getBooks().stream()
                .filter(book -> {
                    String value = getElementText(book, criteria);
                    return criteria.equals("author") ? value.equalsIgnoreCase(query) : value.equals(query);
                })
                .collect(Collectors.toList());

        displayResults(found, criteria.equals("author") ? "автору \"" + query + "\"" : "году \"" + query + "\"");
    }

    private static void searchByAuthorAndYear() {
        System.out.print("\nВведите автора: ");
        String author = in.nextLine();
        System.out.print("Введите год: ");
        String year = in.nextLine();

        List<Element> found = getBooks().stream()
                .filter(book -> getElementText(book, "author").equalsIgnoreCase(author) &&
                        getElementText(book, "year").equals(year))
                .collect(Collectors.toList());

        displayResults(found, "автору \"" + author + "\" и году \"" + year + "\"");
    }

    private static void displayResults(List<Element> books, String criteria) {
        System.out.println("\nРезультаты поиска по " + criteria);
        if (books.isEmpty()) {
            System.out.println("Книги не найдены.");
            return;
        }
        System.out.println("Найдено: " + books.size());
        for (int i = 0; i < books.size(); i++) {
            Element book = books.get(i);
            System.out.printf("%d. %s - %s (%s)%n", i + 1,
                    getElementText(book, "title"),
                    getElementText(book, "author"),
                    getElementText(book, "year"));
        }
    }

    private static void deleteBook() {
        try {
            List<Element> books = getBooks();
            if (books.isEmpty()) {
                System.out.println("Библиотека пуста.");
                return;
            }

            showAllBooks();
            System.out.print("\nВведите название книги для удаления: ");
            String title = in.nextLine();

            books.stream()
                    .filter(book -> getElementText(book, "title").equalsIgnoreCase(title))
                    .findFirst()
                    .ifPresentOrElse(book -> {
                        book.getParentNode().removeChild(book);
                        try {
                            saveDocument();
                            System.out.println("Книга \"" + title + "\" удалена!");
                        } catch (Exception e) {
                            System.err.println("Ошибка сохранения: " + e.getMessage());
                        }
                    }, () -> System.out.println("Книга \"" + title + "\" не найдена."));

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static void saveDocument() throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(inputFile));
    }
}