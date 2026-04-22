import java.util.*;

class MarksManager {
    private ArrayList<Integer> marks = new ArrayList<>();

    void addMark(int mark) {
        marks.add(mark);
    }

    void displayAll() {
        System.out.println("All Marks: " + marks);
    }

    void displayStats() {
        System.out.println("Highest Mark : " + Collections.max(marks));
        System.out.println("Lowest Mark  : " + Collections.min(marks));
    }
}

public class PBL29_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MarksManager mm = new MarksManager();

        System.out.print("How many student marks to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            mm.addMark(sc.nextInt());
        }

        mm.displayAll();
        mm.displayStats();

        sc.close();
    }
}
