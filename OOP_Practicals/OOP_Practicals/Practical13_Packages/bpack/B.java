package bpack;

import apack.A;

public class B extends A {
    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }

    public void display() {
        System.out.println("[Class B extends A - different package, using inheritance]");
        System.out.println("  pubVar  = " + pubVar  + " -> Accessible (public)");
        System.out.println("  protVar = " + protVar + " -> Accessible (protected, subclass)");
        System.out.println("  privVar -> NOT Accessible (private)");
    }
}
