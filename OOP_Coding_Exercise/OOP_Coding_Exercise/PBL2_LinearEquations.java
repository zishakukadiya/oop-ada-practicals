import java.util.Scanner;

class LinearEquationSolver {
    private double a, b, c, d, e, f;

    void setCoefficients(double a, double b, double c, double d, double e, double f) {
        this.a = a; this.b = b; this.c = c;
        this.d = d; this.e = e; this.f = f;
    }

    void solve() {
        double D  = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - c * e;

        System.out.println("Equations: " + a + "x + " + b + "y = " + e);
        System.out.println("           " + c + "x + " + d + "y = " + f);

        if (D == 0) {
            System.out.println("Error: Denominator D = 0. No unique solution exists.");
            return;
        }

        double x = Dx / D;
        double y = Dy / D;
        System.out.printf("D = %.2f | Dx = %.2f | Dy = %.2f%n", D, Dx, Dy);
        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);
    }
}

public class PBL2_LinearEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients for: ax + by = e and cx + dy = f");
        System.out.print("a: "); double a = sc.nextDouble();
        System.out.print("b: "); double b = sc.nextDouble();
        System.out.print("c: "); double c = sc.nextDouble();
        System.out.print("d: "); double d = sc.nextDouble();
        System.out.print("e: "); double e = sc.nextDouble();
        System.out.print("f: "); double f = sc.nextDouble();

        LinearEquationSolver solver = new LinearEquationSolver();
        solver.setCoefficients(a, b, c, d, e, f);
        solver.solve();

        sc.close();
    }
}
