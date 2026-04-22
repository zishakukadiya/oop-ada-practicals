import java.util.Scanner;

class ATM {
    int amount;

    void setAmount(int amount) {
        this.amount = amount;
    }

    void dispense() {
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int remaining = amount;
        System.out.println("\nCurrency breakdown for Rs." + amount + ":");
        for (int den : denominations) {
            int count = remaining / den;
            if (count > 0) {
                System.out.println("  Rs." + den + " x " + count + " = Rs." + (den * count));
            }
            remaining %= den;
        }
    }
}

public class Practical1_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to dispense: ");
        int amount = sc.nextInt();

        ATM atm = new ATM();
        atm.setAmount(amount);
        atm.dispense();

        sc.close();
    }
}
