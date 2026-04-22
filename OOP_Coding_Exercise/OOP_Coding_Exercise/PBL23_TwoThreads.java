import java.util.Scanner;

class NumberPrinter extends Thread {
    private int start;
    private int end;
    private int delayMs;

    NumberPrinter(String name, int start, int end, int delayMs) {
        super(name);
        this.start = start;
        this.end = end;
        this.delayMs = delayMs;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class PBL23_TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Thread 1 prints 1-10 at 1000ms interval.");
        System.out.println("Thread 2 prints 11-20 at 500ms interval.");
        System.out.println("Press Enter to start...");
        sc.nextLine();

        NumberPrinter t1 = new NumberPrinter("Thread-1", 1, 10, 1000);
        NumberPrinter t2 = new NumberPrinter("Thread-2", 11, 20, 500);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished.");
        sc.close();
    }
}
