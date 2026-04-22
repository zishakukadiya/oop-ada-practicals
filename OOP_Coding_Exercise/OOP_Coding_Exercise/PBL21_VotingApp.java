import java.util.Scanner;

class VotingApp {
    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Age " + age + ": Eligible to vote.");
    }
}

public class PBL21_VotingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp app = new VotingApp();

        System.out.print("How many age values to test? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            int age = sc.nextInt();
            try {
                app.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
            System.out.println();
        }

        sc.close();
    }
}
