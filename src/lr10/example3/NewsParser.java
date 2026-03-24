package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;


public class NewsParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
            Elements newsParent = doc.select("#mp-itn");

            for (int i = 0; i < 20; i++) {
                if (newsParent.isEmpty()) break;

                List<Node> nodes = newsParent.get(0).childNodes();

                if (i < nodes.size() && nodes.get(i) instanceof Element) {
                    Element element = (Element) nodes.get(i);

                    Elements titleElem = element.getElementsByTag("a");
                    if (!titleElem.isEmpty()) {
                        System.out.println("Заголовок: " +
                                titleElem.get(0).text());
                        System.out.println("Ссылка: " +
                                titleElem.get(0).absUrl("href"));
                    }

                    Elements dateElem = element.getElementsByTag("i");
                    if (!dateElem.isEmpty()) {
                        System.out.println("Дата: " +
                                dateElem.get(0).text());
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
