package exam;

import student.Student;
import java.util.Scanner;

class Result extends Student {
    int marks1, marks2, marks3;

    Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    void displayResult() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;
        System.out.println("========= MARK SHEET =========");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", avg);
        System.out.println("==============================");
    }
}

public class ExamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Roll No: ");  int roll = sc.nextInt();
        System.out.print("Name: ");    String name = sc.next();
        System.out.print("Marks 1: "); int m1 = sc.nextInt();
        System.out.print("Marks 2: "); int m2 = sc.nextInt();
        System.out.print("Marks 3: "); int m3 = sc.nextInt();

        Result r = new Result(roll, name, m1, m2, m3);
        r.displayResult();

        sc.close();
    }
}
