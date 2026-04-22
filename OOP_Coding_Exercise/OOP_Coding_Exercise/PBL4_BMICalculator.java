import java.util.Scanner;

class BMICalculator {
    private double weightPounds;
    private double heightInches;

    void setValues(double weightPounds, double heightInches) {
        this.weightPounds = weightPounds;
        this.heightInches = heightInches;
    }

    double getWeightKg() {
        return weightPounds * 0.45359237;
    }

    double getHeightMeters() {
        return heightInches * 0.0254;
    }

    double calculateBMI() {
        double h = getHeightMeters();
        return getWeightKg() / (h * h);
    }

    String getCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25.0) return "Normal weight";
        else if (bmi < 30.0) return "Overweight";
        else return "Obese";
    }

    void display() {
        double bmi = calculateBMI();
        System.out.printf("Weight : %.2f lbs = %.4f kg%n", weightPounds, getWeightKg());
        System.out.printf("Height : %.2f in = %.4f m%n", heightInches, getHeightMeters());
        System.out.printf("BMI    : %.2f (%s)%n", bmi, getCategory(bmi));
    }
}

public class PBL4_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        BMICalculator bmi = new BMICalculator();
        bmi.setValues(weight, height);
        bmi.display();

        sc.close();
    }
}
