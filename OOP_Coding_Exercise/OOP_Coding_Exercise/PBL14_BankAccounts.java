import java.util.Scanner;

class BankAccountBase {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    void openAccount(String accNo, String name, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialBalance;
        System.out.println("Account opened. ID: " + accountNumber + " | Name: " + accountHolderName);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited Rs.%.2f | Balance: Rs.%.2f%n", amount, balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn Rs.%.2f | Balance: Rs.%.2f%n", amount, balance);
        }
    }

    void checkBalance() {
        System.out.printf("Account: %s | Balance: Rs.%.2f%n", accountNumber, balance);
    }
}

class SavingAccount extends BankAccountBase {
    private double interestRate;

    SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.printf("Savings Interest (%.1f%%): Rs.%.2f%n", interestRate, interest);
    }
}

class FixedDepositAccount extends BankAccountBase {
    private double fdRate;
    private int termYears;

    FixedDepositAccount(double fdRate, int termYears) {
        this.fdRate = fdRate;
        this.termYears = termYears;
    }

    void maturityAmount() {
        double maturity = balance * Math.pow(1 + fdRate / 100, termYears);
        System.out.printf("FD Maturity (%.1f%% for %d yrs): Rs.%.2f%n", fdRate, termYears, maturity);
    }
}

public class PBL14_BankAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Saving Account ===");
        System.out.print("Account No: "); String sAccNo = sc.next();
        System.out.print("Name: "); String sName = sc.next();
        System.out.print("Initial Balance: "); double sBal = sc.nextDouble();
        System.out.print("Interest Rate (%): "); double sRate = sc.nextDouble();

        SavingAccount sa = new SavingAccount(sRate);
        sa.openAccount(sAccNo, sName, sBal);
        System.out.print("Deposit amount: "); sa.deposit(sc.nextDouble());
        System.out.print("Withdraw amount: "); sa.withdraw(sc.nextDouble());
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n=== Fixed Deposit Account ===");
        System.out.print("Account No: "); String fAccNo = sc.next();
        System.out.print("Name: "); String fName = sc.next();
        System.out.print("Initial Balance: "); double fBal = sc.nextDouble();
        System.out.print("FD Rate (%): "); double fRate = sc.nextDouble();
        System.out.print("Term (years): "); int fYears = sc.nextInt();

        FixedDepositAccount fd = new FixedDepositAccount(fRate, fYears);
        fd.openAccount(fAccNo, fName, fBal);
        fd.checkBalance();
        fd.maturityAmount();

        sc.close();
    }
}
