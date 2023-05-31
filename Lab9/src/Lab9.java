import java.io.*;
import java.util.*;

public class Lab9 {
    public static void main(String[] args) {
        try {

            Scanner size = new Scanner(System.in);

            System.out.print("Введіть розмір першого потоку: ");
            int size1 = size.nextInt();

            byte[] buf1 = new byte[size1];
            System.out.println("Перший потік");
            for (int i = 0; i < buf1.length; i++) {
                buf1[i] = (byte) (Math.random() * 10);
                System.out.println(buf1[i]);
            }

            System.out.print("Введіть розмір другого потоку: ");
            int size2 = size.nextInt();

            byte[] buf2 = new byte[size2];
            System.out.println("Другий потік");
            for (int i = 0; i < buf2.length; i++) {
                buf2[i] = (byte) (Math.random() * 35);
                System.out.println(buf2[i]);
            }

            System.out.print("Введіть розмір третього потоку: ");
            int size3 = size.nextInt();

            byte[] buf3 = new byte[size3];
            System.out.println("Третій потік");
            for (int i = 0; i < buf3.length; i++) {
                buf3[i] = (byte) (Math.random() * 50);
                System.out.println(buf3[i]);
            }

            InputStream in1 = new ByteArrayInputStream(buf1);
            InputStream in2 = new ByteArrayInputStream(buf2);
            InputStream in3 = new ByteArrayInputStream(buf3);

            Vector<InputStream> myVector = new Vector<>();
            myVector.add(in1);
            myVector.add(in2);
            myVector.add(in3);

            Enumeration<InputStream> enumStreams = myVector.elements();

            SequenceInputStream inAll = new SequenceInputStream(enumStreams);

            int countAll = 0;

            System.out.println("Створений потік при об'єднанні трьох потоків: ");

            int x;
            while ((x = inAll.read()) != -1) {
                System.out.print(x + " ");
                countAll++;
            }

            System.out.println("\nЗагальна кількість елементів: " + countAll);

            in1.close();
            in2.close();
            in3.close();
            inAll.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}