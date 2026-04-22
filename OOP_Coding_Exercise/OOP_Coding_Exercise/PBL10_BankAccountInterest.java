import java.util.Scanner;

class BankAccountInterest {
    String accountHolderName;
    double balance;
    static double interestRate = 4.5; // same for all accounts

    BankAccountInterest(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayInterest() {
        System.out.printf("Account: %-15s | Balance: Rs.%.2f | Rate: %.2f%% | Interest: Rs.%.2f%n",
                accountHolderName, balance, interestRate, calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%");
    }
}

public class PBL10_BankAccountInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many accounts? ");
        int n = sc.nextInt();
        sc.nextLine();

        BankAccountInterest[] accounts = new BankAccountInterest[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Account " + (i + 1) + ":");
            System.out.print("  Name: ");
            String name = sc.nextLine();
            System.out.print("  Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new BankAccountInterest(name, bal);
        }

        System.out.println("\n--- Interest with current rate (" + BankAccountInterest.interestRate + "%) ---");
        for (BankAccountInterest acc : accounts) acc.displayInterest();

        System.out.print("\nEnter new interest rate (%): ");
        double newRate = sc.nextDouble();
        BankAccountInterest.updateInterestRate(newRate);

        System.out.println("\n--- Interest with updated rate ---");
        for (BankAccountInterest acc : accounts) acc.displayInterest();

        sc.close();
    }
}
