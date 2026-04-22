import java.util.Scanner;

class EmployeeBase {
    protected String name;
    protected String department;

    EmployeeBase(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}

class Manager extends EmployeeBase {
    private int teamSize;
    private String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size  : " + teamSize);
        System.out.println("Project    : " + projectName);
    }
}

public class PBL15_EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Enter Employee Details ===");
        System.out.print("Name: ");       String eName = sc.next();
        System.out.print("Department: "); String eDept = sc.next();
        EmployeeBase emp = new EmployeeBase(eName, eDept);

        System.out.println("\n=== Enter Manager Details ===");
        System.out.print("Name: ");        String mName = sc.next();
        System.out.print("Department: ");  String mDept = sc.next();
        System.out.print("Team Size: ");   int mTeam = sc.nextInt();
        System.out.print("Project Name: "); String mProj = sc.next();
        Manager mgr = new Manager(mName, mDept, mTeam, mProj);

        System.out.println("\n--- Employee (base method) ---");
        emp.displayDetails();

        System.out.println("\n--- Manager (overridden method) ---");
        mgr.displayDetails();

        // Runtime polymorphism demo
        System.out.println("\n--- Polymorphism: EmployeeBase ref -> Manager object ---");
        EmployeeBase poly = new Manager(mName, mDept, mTeam, mProj);
        poly.displayDetails();

        sc.close();
    }
}
