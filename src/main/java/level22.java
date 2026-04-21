// Program: FriendsAnalysis
// Description: Find youngest and tallest among 3 friends

import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height of " + names[i]);

            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.err.println("Invalid input!");
                System.exit(0);
            }
        }

        // Find youngest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);

        input.close();
    }
}