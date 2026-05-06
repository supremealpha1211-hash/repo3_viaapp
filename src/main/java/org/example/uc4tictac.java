package org.example;

import java.util.Scanner;

public class uc4tictac {

    // Utility method to convert slot → row & column
    public static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;  // Division → row
        int col = (slot - 1) % 3;  // Modulo → column

        return new int[]{row, col}; // Return both values
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        // Step 2: Convert slot to indices
        int[] position = convertSlotToIndex(slot);

        // Step 3: Display result
        System.out.println("Row index: " + position[0]);
        System.out.println("Column index: " + position[1]);
    }
}