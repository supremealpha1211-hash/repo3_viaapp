package org.example;

import java.util.Scanner;

public class uc3tictac {

    // Method to accept user input
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot; // Return the entered slot
    }

    public static void main(String[] args) {

        // Call method to get user input
        int userSlot = getUserSlot();

        // Display the entered value
        System.out.println("You selected slot: " + userSlot);
    }
}