import java.util.Scanner;

class TablePrinter {
    synchronized void printTable(int number, String threadName) {
        System.out.println("--- " + threadName + ": Table of " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    private TablePrinter printer;
    private int number;

    TableThread(String name, TablePrinter printer, int number) {
        super(name);
        this.printer = printer;
        this.number = number;
    }

    @Override
    public void run() {
        printer.printTable(number, getName());
    }
}

public class PBL25_SynchronizedTables {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        TablePrinter printer = new TablePrinter();

        System.out.print("Enter first table number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second table number: ");
        int n2 = sc.nextInt();

        TableThread t1 = new TableThread("Thread-1", printer, n1);
        TableThread t2 = new TableThread("Thread-2", printer, n2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Tables printed without mixing (synchronized).");
        sc.close();
    }
}
