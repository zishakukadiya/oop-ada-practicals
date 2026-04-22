import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.printf("Width: %.2f | Height: %.2f | Area: %.2f | Perimeter: %.2f%n",
                width, height, getArea(), getPerimeter());
    }
}

public class PBL6_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Default Rectangle ---");
        Rectangle r1 = new Rectangle();
        r1.display();

        System.out.println("\n--- Custom Rectangle ---");
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        Rectangle r2 = new Rectangle(w, h);
        r2.display();

        sc.close();
    }
}
