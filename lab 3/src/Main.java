import java.util.Scanner;


abstract class Shape {
    public abstract double getArea();
}

class Parallelogram extends Shape {
    private double a;
    private double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}

class Trapezium extends Shape {
    private double c;
    private double d;
    private double h;

    public Trapezium(double c, double d, double h) {
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * (c + d) * h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть основу паралелограма: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть висоту паралелограма: ");
        double h = scanner.nextDouble();
        Parallelogram parallelogram = new Parallelogram(a, h);


        System.out.print("Введіть першу основу трапеції: ");
        double c = scanner.nextDouble();
        System.out.print("Введіть другу основу трапеції: ");
        double d = scanner.nextDouble();
        System.out.print("Введіть висоту трапеції: ");
        double h2 = scanner.nextDouble();
        Trapezium trapezium = new Trapezium(c, d, h2);


        System.out.println("Площа паралелограма: " + parallelogram.getArea());
        System.out.println("Площа трапеції: " + trapezium.getArea());
    }
}
