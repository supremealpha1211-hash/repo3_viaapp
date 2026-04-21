// Program: DigitFrequency
// Description: Find frequency of each digit in a number using array

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid number!");
            System.exit(0);
        }

        int temp = number;

        // Count digits
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Output
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        input.close();
    }
}