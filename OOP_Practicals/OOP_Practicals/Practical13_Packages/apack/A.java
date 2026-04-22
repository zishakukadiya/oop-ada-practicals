package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A(int pub, int prot, int priv) {
        this.pubVar = pub;
        this.protVar = prot;
        this.privVar = priv;
    }

    public void showAll() {
        System.out.println("  pubVar  = " + pubVar + " (accessible everywhere)");
        System.out.println("  protVar = " + protVar + " (accessible in subclass / same package)");
        System.out.println("  privVar = " + privVar + " (accessible only inside class A)");
    }
}
