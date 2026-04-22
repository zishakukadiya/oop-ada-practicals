import java.util.*;

class GenericSearcher {
    <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
}

public class PBL32_GenericSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericSearcher gs = new GenericSearcher();

        // Integer LinkedList
        System.out.print("How many roll numbers? ");
        int n1 = sc.nextInt();
        LinkedList<Integer> rollList = new LinkedList<>();
        for (int i = 0; i < n1; i++) {
            System.out.print("Roll " + (i + 1) + ": ");
            rollList.add(sc.nextInt());
        }
        System.out.print("Search roll number: ");
        int searchRoll = sc.nextInt();
        System.out.println("Roll " + searchRoll + " found: " + gs.searchElement(rollList, searchRoll));

        System.out.println();

        // String LinkedList
        System.out.print("How many names? ");
        int n2 = sc.nextInt();
        sc.nextLine();
        LinkedList<String> nameList = new LinkedList<>();
        for (int i = 0; i < n2; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            nameList.add(sc.nextLine());
        }
        System.out.print("Search name: ");
        String searchName = sc.nextLine();
        System.out.println("Name '" + searchName + "' found: " + gs.searchElement(nameList, searchName));

        sc.close();
    }
}
