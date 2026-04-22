import java.util.Scanner;

class Divider {
    int numerator;
    int denominator;

    void setValues(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    void divide() {
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            double result = (double) numerator / denominator;
            System.out.printf("Result: %d / %d = %.4f%n", numerator, denominator, result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Division operation complete.");
        }
    }
}

public class PBL20_DivisionException {
    public static void main(String[] args) {
        int num, den;

        // Supports both CLI args and user input
        if (args.length >= 2) {
            try {
                num = Integer.parseInt(args[0]);
                den = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid command-line arguments. Use integers.");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numerator: ");
            num = sc.nextInt();
            System.out.print("Enter denominator: ");
            den = sc.nextInt();
            sc.close();
        }

        Divider d = new Divider();
        d.setValues(num, den);
        d.divide();
    }
}
