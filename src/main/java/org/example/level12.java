// Program: NumberAnalysis
// Description: Check positive/negative/zero and even/odd, compare first & last

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int[size];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analysis
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive Even");
                } else {
                    System.out.println(numbers[i] + " is Positive Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        // Compare first and last
        if (numbers[0] == numbers[size - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (numbers[0] > numbers[size - 1]) {
            System.out.println("First element is Greater");
        } else {
            System.out.println("Last element is Greater");
        }

        input.close();
    }
}