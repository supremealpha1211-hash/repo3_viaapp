// Program: EmployeeBonus
// Description: Calculate bonus, new salary, and totals for 10 employees

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 10;

        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));

            salary[i] = input.nextDouble();
            years[i] = input.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input! Enter again.");
                i--;
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < size; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}