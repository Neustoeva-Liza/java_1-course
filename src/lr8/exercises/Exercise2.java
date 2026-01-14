package lr8.exercises;

//Создать проект, позволяющий из одного, предварительно созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double. В результирующий
//файл переписать вторую строку и положительные числа.

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            File source = new File("D:\\My\\source.txt");
            DataOutputStream out = new DataOutputStream(new FileOutputStream(source));

            out.writeUTF("First string");
            out.writeUTF("Second string");
            out.writeDouble(-3.6);
            out.writeDouble(2.6);
            out.writeDouble(-3.7);
            out.writeDouble(1.2);
            out.writeDouble(0.0);
            out.close();

            File result = new File("D:\\My\\result.txt");
            DataInputStream in = new DataInputStream(new FileInputStream(source));
            DataOutputStream resOut = new DataOutputStream(new FileOutputStream(result));

            in.readUTF();
            resOut.writeUTF(in.readUTF());

            for (int i = 0; i<5; i++) {
                double num = in.readDouble();
                if (num>0) {
                    resOut.writeDouble(num);
                }
            }
            in.close();
            resOut.close();

        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        }

    }

}
