package lr8.examples;

import java.io.*;
import java.net.URL;

public class Example8 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("D:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rURL = new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rURL);
            System.out.println("\n\n\n");
            inUrl.close();
            rFile.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.println("\n\n\n");
            inArray.close();
            rArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
