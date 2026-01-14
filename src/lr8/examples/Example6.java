package lr8.examples;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("D:\\MyFile1.txt");
            out = new FileWriter("D:\\MyFile2.txt");

            int oneByte;
            while ((oneByte = in.read()) != -1){
                // out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
