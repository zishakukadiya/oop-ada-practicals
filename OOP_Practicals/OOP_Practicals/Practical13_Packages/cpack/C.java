package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A(10, 20, 30);
        System.out.println("[Class C - different package, NOT a subclass of A]");
        System.out.println("  pubVar  = " + obj.pubVar + " -> Accessible (public)");
        System.out.println("  protVar -> NOT Accessible (protected, non-subclass in diff package)");
        System.out.println("  privVar -> NOT Accessible (private)");
    }
}
