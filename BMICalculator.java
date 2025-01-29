
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        String category = determineBMICategory(bmi);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Your BMI category is: " + category);
    }
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    private static String determineBMICategory(double bmi) {
        if (bmi < 20.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}


