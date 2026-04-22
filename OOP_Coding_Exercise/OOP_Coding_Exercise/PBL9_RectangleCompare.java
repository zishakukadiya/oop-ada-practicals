import java.util.Scanner;

class RectangleCompare {
    double width;
    double height;

    RectangleCompare(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display(String label) {
        System.out.println(label + ":");
        System.out.printf("  Width: %.2f | Height: %.2f | Area: %.2f | Perimeter: %.2f%n",
                width, height, getArea(), getPerimeter());
    }
}

public class PBL9_RectangleCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Rectangle 1:");
        System.out.print("  Width: ");
        double w1 = sc.nextDouble();
        System.out.print("  Height: ");
        double h1 = sc.nextDouble();

        System.out.println("Enter details for Rectangle 2:");
        System.out.print("  Width: ");
        double w2 = sc.nextDouble();
        System.out.print("  Height: ");
        double h2 = sc.nextDouble();

        RectangleCompare r1 = new RectangleCompare(w1, h1);
        RectangleCompare r2 = new RectangleCompare(w2, h2);

        r1.display("Rectangle 1");
        r2.display("Rectangle 2");

        System.out.println("\nComparison:");
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area (" + r1.getArea() + " > " + r2.getArea() + ")");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has larger area (" + r2.getArea() + " > " + r1.getArea() + ")");
        } else {
            System.out.println("Both rectangles have equal area: " + r1.getArea());
        }

        sc.close();
    }
}
