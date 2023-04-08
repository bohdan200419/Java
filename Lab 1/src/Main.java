import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start;
        int end;
        float step;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        double x = input.nextDouble();
        if (x < 6 || x >= 6) {
            start = 5;
            end = 7;
            step = (float) 0.15F;
        } else {
            start = -2;
            end = 3;
            step = (float) 0.2F;
        }
        System.out.println("x\tf(x)");
        System.out.println("-------------------");

        for (float i = start; i <= end; i += step) {
            float y = (float) Function(i);
            System.out.println(i + "\t" + y);
        }
    }

    public static double Function(double x) {
        if (x < 6) {

            return x * Math.sqrt(x * x + 4);
        } else if (x >= 6) {

            return Math.pow(Math.sin(x + 1), 3);
        } else {

            return Math.sqrt(3 * x * x + x);
        }
    }
}