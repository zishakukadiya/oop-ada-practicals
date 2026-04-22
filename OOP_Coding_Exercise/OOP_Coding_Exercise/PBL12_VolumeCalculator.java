import java.util.Scanner;

class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class PBL12_VolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("--- Volume Calculator ---");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Box");
        System.out.println("3. Sphere");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                System.out.printf("Volume of Cube = %.4f%n", vc.calculateVolume(side));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                System.out.printf("Volume of Rectangular Box = %.4f%n", vc.calculateVolume(l, w, h));
                break;

            case 3:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.printf("Volume of Sphere = %.4f%n", vc.calculateVolume(r, true));
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
