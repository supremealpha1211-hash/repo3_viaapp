// Program: StoreAndSum
// Description: Store max 10 numbers or stop on 0/negative and find sum

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");

        while (true) {
            double value = input.nextDouble();

            if (value <= 0 || index == numbers.length) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display
        System.out.println("Entered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total Sum = " + total);

        input.close();
    }
}
