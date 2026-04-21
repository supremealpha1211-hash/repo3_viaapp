// Program: MultiplicationTable
// Description: Store multiplication table in array and display

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validation
        if (number <= 0) {
            System.err.println("Invalid number!");
            System.exit(0);
        }

        int[] table = new int[10];

        // Store table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}