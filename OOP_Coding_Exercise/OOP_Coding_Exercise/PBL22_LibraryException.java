import java.util.Scanner;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    private int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
        System.out.println("Library initialized with " + availableBooks + " books.");
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully. Remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available. Available: " + availableBooks);
        }
    }
}

public class PBL22_LibraryException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initialize library with how many books? ");
        int total = sc.nextInt();
        Library lib = new Library(total);

        System.out.print("How many issue requests to process? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Books to issue (request " + (i + 1) + "): ");
            int req = sc.nextInt();
            try {
                lib.issueBook(req);
            } catch (BookNotAvailableException e) {
                System.out.println("BookNotAvailableException: " + e.getMessage());
            }
        }

        sc.close();
    }
}
