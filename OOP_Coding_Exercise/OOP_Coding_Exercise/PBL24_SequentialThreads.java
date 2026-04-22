import java.util.Scanner;

class SequentialPrinter extends Thread {
    private int start;
    private int end;

    SequentialPrinter(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class PBL24_SequentialThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("T1: 1-100 | T2: 101-200 | T3: 201-300 (sequential)");
        System.out.println("Press Enter to start...");
        sc.nextLine();

        SequentialPrinter t1 = new SequentialPrinter("T1", 1, 100);
        SequentialPrinter t2 = new SequentialPrinter("T2", 101, 200);
        SequentialPrinter t3 = new SequentialPrinter("T3", 201, 300);

        t1.start();
        t1.join(); // wait for T1 before T2 starts

        t2.start();
        t2.join(); // wait for T2 before T3 starts

        t3.start();
        t3.join();

        System.out.println("All threads completed sequentially.");
        sc.close();
    }
}
