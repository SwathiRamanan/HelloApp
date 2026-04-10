package org.example;

public class Main {
    public static void main(String[] args) {
        String resultName = "World";
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean isFirst = true;
            for (String name : args) {
                if (!isFirst) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                isFirst = false;
            }
            resultName = nameBuilder.toString();
        }

        System.out.println("Hello, " + resultName + "!");
    }
}