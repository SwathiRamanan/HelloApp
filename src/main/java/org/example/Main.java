package org.example;

public class Main {
    public static void main(String[] args) {
        String resultName = "World";

        if (args.length > 0) {
            resultName = String.join(", ", args);
        }

        System.out.println("Hello, " + resultName + "!");
    }
}