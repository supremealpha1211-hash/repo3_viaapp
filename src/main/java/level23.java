public class level23 {
}
// Program: LargestDigits
// Description: Find largest and second largest digits using dynamic array logic

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid number!");
            System.exit(0);
        }

        int maxSize = 10;
        int[] digits = new int[maxSize];
        int index = 0;

        // Extract digits
        while (number != 0) {

            if (index == maxSize) {
                maxSize += 10;

                int[] temp = new int[maxSize];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Find largest & second largest
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        input.close();
    }
}