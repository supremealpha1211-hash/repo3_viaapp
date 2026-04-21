// Program: BMICalculation
// Description: Calculate BMI and weight status for multiple persons

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.err.println("Invalid number!");
            System.exit(0);
        }

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1));

            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.err.println("Invalid input! Enter again.");
                i--;
            }
        }

        // Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Output
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + weight[i] +
                    " | Height: " + height[i] +
                    " | BMI: " + bmi[i] +
                    " | Status: " + status[i]);
        }

        input.close();
    }
}