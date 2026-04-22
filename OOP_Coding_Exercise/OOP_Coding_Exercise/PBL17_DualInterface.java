import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface ClassifyGrade {
    String getDivision(double average);
}

class ExamResult implements Exam, ClassifyGrade {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    @Override
    public String getDivision(double average) {
        if (average >= 70) return "Distinction";
        else if (average >= 60) return "First Division";
        else if (average >= 50) return "Second Division";
        else if (average >= 35) return "Pass";
        else return "Fail";
    }
}

public class PBL17_DualInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamResult result = new ExamResult();

        System.out.print("Enter marks obtained (out of 100): ");
        int mark = sc.nextInt();
        System.out.print("Enter average (for division): ");
        double avg = sc.nextDouble();

        System.out.println("\nMark     : " + mark);
        System.out.println("Passed   : " + result.isPassed(mark));
        System.out.println("Average  : " + avg);
        System.out.println("Division : " + result.getDivision(avg));

        sc.close();
    }
}
