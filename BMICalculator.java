import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator");

        // Input height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);
        
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
