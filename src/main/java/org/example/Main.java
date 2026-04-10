package org.example;
public class Main {
    // Note: The main method MUST include (String[] args) to accept arguments
    public static void main(String[] args) {

        // Check if an argument was actually provided to avoid errors
        if (args.length > 0) {
            // Get the name from the first command-line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback message if no name is provided
            System.out.println("Hello World!");
        }
    }
}