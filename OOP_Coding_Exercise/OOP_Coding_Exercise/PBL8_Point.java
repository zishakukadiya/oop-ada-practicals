import java.util.Scanner;

class Point {
    double x;
    double y;

    // Default constructor
    Point() {
        this.x = 5;
        this.y = 5;
    }

    // Parameterized constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    void display(String label) {
        System.out.printf("%s -> (%,.2f, %,.2f)%n", label, x, y);
    }
}

public class PBL8_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Point p1 = new Point();
        p1.display("Default Point (x=5, y=5)");

        // Parameterized constructor
        System.out.print("\nEnter x for custom point: ");
        double px = sc.nextDouble();
        System.out.print("Enter y for custom point: ");
        double py = sc.nextDouble();
        Point p2 = new Point(px, py);
        p2.display("Parameterized Point");

        // Copy constructor
        Point p3 = new Point(p2);
        p3.display("Copy of Parameterized Point");

        // Confirm independence
        p3.x = 99;
        p2.display("Original (unchanged after copy modified)");
        p3.display("Copy (modified)");

        sc.close();
    }
}
