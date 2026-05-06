package org.example;

import java.util.Random;

public class uc2tictac {

    public static void main(String[] args) {

        // Step 1: Create Random object
        Random random = new Random();

        // Step 2: Perform toss (0 or 1)
        int toss = random.nextInt(2);

        // Step 3: Game state variables
        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // Step 4: Conditional logic
        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        // Step 5: Display result
        System.out.println("Toss Completed!");
        System.out.println(currentPlayer + " will start first.");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}