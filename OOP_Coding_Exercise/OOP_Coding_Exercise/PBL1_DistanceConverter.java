import java.util.Scanner;

class DistanceConverter {
    private double meters;

    void setMeters(double meters) {
        this.meters = meters;
    }

    double toFeet() {
        return meters * 3.28084;
    }

    void display() {
        System.out.printf("%.2f meters = %.2f feet%n", meters, toFeet());
    }
}

public class PBL1_DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        DistanceConverter dc = new DistanceConverter();
        dc.setMeters(meters);
        dc.display();

        sc.close();
    }
}
