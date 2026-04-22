import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class GenericSorter {
    <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    <T> void display(String label, List<T> list) {
        System.out.println(label + ": " + list);
    }
}

public class Practical19_GenericSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericSorter sorter = new GenericSorter();

        // Integer list
        System.out.print("How many integers to sort? ");
        int n1 = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n1 + " integers:");
        for (int i = 0; i < n1; i++) {
            System.out.print("  [" + (i + 1) + "]: ");
            numbers.add(sc.nextInt());
        }
        sorter.display("Before (Numbers)", numbers);
        sorter.sortList(numbers);
        sorter.display("After  (Numbers)", numbers);

        System.out.println();

        // String list
        System.out.print("How many names to sort? ");
        int n2 = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter " + n2 + " names:");
        for (int i = 0; i < n2; i++) {
            System.out.print("  [" + (i + 1) + "]: ");
            names.add(sc.next());
        }
        sorter.display("Before (Names)", names);
        sorter.sortList(names);
        sorter.display("After  (Names)", names);

        sc.close();
    }
}
