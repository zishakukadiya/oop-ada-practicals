import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData() {
        System.out.println("Employee Name   : " + employeeName);
        System.out.printf("Employee Salary : Rs.%.2f%n", employeeSalary);
    }
}

public class PBL7_Employee {
    public static void main(String[] args) {
        System.out.print("How many employees? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            employees[i] = new Employee();
            employees[i].readEmployeeData();
        }

        System.out.println("\n====== Employee Records ======");
        for (int i = 0; i < n; i++) {
            System.out.println("--- Record " + (i + 1) + " ---");
            employees[i].displayEmployeeData();
        }

        sc.close();
    }
}
