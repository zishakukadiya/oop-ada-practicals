import java.util.Scanner;

class Triangle {
    private double a, b, c;

    void setSides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isValidTriangle() {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    void display() {
        System.out.println("Sides: a=" + a + ", b=" + b + ", c=" + c);
        if (!isValidTriangle()) {
            System.out.println("Invalid triangle: sum of any two sides must be greater than the third.");
            return;
        }
        double s = (a + b + c) / 2.0;
        System.out.printf("Semi-perimeter (s): %.4f%n", s);
        System.out.printf("Area (Heron's): %.4f%n", calculateArea());
    }
}

public class PBL5_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        Triangle t = new Triangle();
        t.setSides(a, b, c);
        t.display();

        sc.close();
    }
}
