package lr10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateXMLFileTask {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("tasks");
            doc.appendChild(rootElement);

            Element task1 = doc.createElement("task");
            rootElement.appendChild(task1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Уборка"));
            task1.appendChild(title1);

            Element date1 = doc.createElement("date");
            date1.appendChild(doc.createTextNode("24.03.2026"));
            task1.appendChild(date1);

            Element description1 = doc.createElement("description");
            description1.appendChild(doc.createTextNode("Влажная уборка"));
            task1.appendChild(description1);

            Element task2 = doc.createElement("task");
            rootElement.appendChild(task2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Домашняя работа"));
            task2.appendChild(title2);

            Element date2 = doc.createElement("date");
            date2.appendChild(doc.createTextNode("26.03.2026"));
            task2.appendChild(date2);

            Element description2 = doc.createElement("description");
            description2.appendChild(doc.createTextNode("Английский, математика"));
            task2.appendChild(description2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.
                    StreamResult(new File("src/lr10/example1/task.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл с задачами успешно создан!");
        } catch (Exception pce){
            pce.printStackTrace();
        }
    }
}
