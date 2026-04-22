import java.util.Scanner;

class Shape {
    double d1;
    double d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class TriangleShape extends Shape {
    double calculateArea() {
        // d1 = base, d2 = height
        return 0.5 * d1 * d2;
    }

    void display() {
        System.out.printf("Triangle -> Base: %.2f | Height: %.2f | Area: %.4f%n", d1, d2, calculateArea());
    }
}

class RectangleShape extends Shape {
    double calculateArea() {
        return d1 * d2;
    }

    void display() {
        System.out.printf("Rectangle -> Width: %.2f | Height: %.2f | Area: %.4f%n", d1, d2, calculateArea());
    }
}

public class PBL13_ShapeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Triangle ---");
        System.out.print("Enter base: ");
        double tb = sc.nextDouble();
        System.out.print("Enter height: ");
        double th = sc.nextDouble();
        TriangleShape t = new TriangleShape();
        t.getData(tb, th);
        t.display();

        System.out.println("\n--- Rectangle ---");
        System.out.print("Enter width: ");
        double rw = sc.nextDouble();
        System.out.print("Enter height: ");
        double rh = sc.nextDouble();
        RectangleShape r = new RectangleShape();
        r.getData(rw, rh);
        r.display();

        sc.close();
    }
}
