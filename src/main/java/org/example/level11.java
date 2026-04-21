// Program: VotingEligibility
// Description: Check if students are eligible to vote based on age

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalStudents = 10;
        int[] ages = new int[totalStudents];

        // Input ages
        System.out.println("Enter age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            // Validation
            if (ages[i] < 0) {
                System.err.println("Invalid age entered!");
                System.exit(0);
            }
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}