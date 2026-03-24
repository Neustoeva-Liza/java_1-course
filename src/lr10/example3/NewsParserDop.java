package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewsParserDop {
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Document doc = connect();
        if (doc != null) {
            parseAndSave(doc);
        }
    }

    private static Document connect() {
        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
            try {
                System.out.println("Попытка " + i);
                return Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page")
                        .get();
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                if (i == MAX_ATTEMPTS) return null;
                try { Thread.sleep(2000); } catch (InterruptedException ie) {}
            }
        }
        return null;
    }

    private static void parseAndSave(Document doc) {
        try (PrintWriter out = new PrintWriter(new FileWriter("src/lr10/example3/news.txt"))) {
            Elements items = doc.select("#mp-itn a");

            int count = 0;
            for (Element item : items) {
                if (count >= 10) break;
                String title = item.text();
                String link = item.absUrl("href");

                if (!title.isEmpty() && title.length() > 5) {
                    out.println(count + 1 + ". " + title);
                    out.println("   " + link + "\n");
                    System.out.println((count + 1) + ". " + title);
                    count++;
                }
            }
            System.out.println("Сохранено в news.txt");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}