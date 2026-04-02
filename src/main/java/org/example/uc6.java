package org.example;

public class uc6 {
    public static void main(String[] args) {
        // Requirement: Default greeting if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Start the greeting string
            String greeting = "Hello, ";

            // Requirement: Use an enhanced for loop to process multiple names
            for (String name : args) {
                greeting += name + ", ";
            }

            // Requirement: Use substring to remove the trailing delimiter (", ")
            // The logic: take everything from index 0 to (length - 2)
            greeting = greeting.substring(0, greeting.length() - 2);

            // Final Output
            System.out.println(greeting + "!");
        }
    }
}
