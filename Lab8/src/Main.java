import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // Кодування
            Reader input = new FileReader("input.txt");
            Writer output = new FileWriter("coded.txt");

            // Введення ключа
            Scanner scan = new Scanner(System.in);

            System.out.println("Введіть ключ: ");
            String key = scan.next();
            int index = 0;
            int x;
            while(input.ready()){
                x = key.charAt(index);
                index++;

                if(index == key.length()){
                    index = 0;
                }

                output.write(input.read() ^ x);
            }

            input.close();
            output.flush();
            output.close();


            // Декодування
            Reader inputDecoded = new FileReader("coded.txt");
            Writer outputDecoded = new FileWriter("decoded.txt");

            int x1;
            int index1 = 0;
            while(inputDecoded.ready()){
                x1 = key.charAt(index1);
                index1++;

                if(index1 == key.length()){
                    index1 = 0;
                }

                outputDecoded.write(inputDecoded.read() ^ x1);
            }


            inputDecoded.close();
            outputDecoded.flush();
            outputDecoded.close();

            scan.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}