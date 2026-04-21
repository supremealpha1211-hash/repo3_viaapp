package org.example;

public class tictacUC1 {

    public static void main(String[] args) {

        // Step 1: Create a 3x3 board
        char[][] board = new char[3][3];

        // Step 2: Initialize the board with '-'
        for (int i = 0; i < 3; i++) {          // Rows
            for (int j = 0; j < 3; j++) {      // Columns
                board[i][j] = '-';
            }
        }

        // Step 3: Display the board
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}