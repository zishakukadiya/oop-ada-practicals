import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    @Override
    public String getDivision(double average) {
        if (average >= 70) return "Distinction";
        else if (average >= 60) return "First Division";
        else if (average >= 50) return "Second Division";
        else if (average >= 35) return "Pass";
        else return "Fail";
    }
}

public class PBL16_ClassifyInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result result = new Result();

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        System.out.println("Average   : " + avg);
        System.out.println("Division  : " + result.getDivision(avg));

        sc.close();
    }
}
