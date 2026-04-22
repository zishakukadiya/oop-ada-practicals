package dpack;

import bpack.B;
import cpack.C;
import java.util.Scanner;

public class ProtectedDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Access Specifier Demo ---");
        System.out.print("Enter 3 values for class A (pub prot priv): ");
        int pub  = sc.nextInt();
        int prot = sc.nextInt();
        int priv = sc.nextInt();

        System.out.println("\n=== B extends A (Inheritance) ===");
        B b = new B(pub, prot, priv);
        b.display();

        System.out.println("\n=== C uses object of A (Composition) ===");
        C c = new C();
        c.display();

        sc.close();
    }
}
