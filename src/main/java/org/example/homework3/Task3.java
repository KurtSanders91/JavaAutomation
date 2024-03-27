package org.example.homework3;

public class Task3 {
    public static void main(String[] args) {

        //A long variable
        long a = 1234567890251351234L;

        // Print the original long value
        System.out.println("Original long value: " + a);

        // Convert the long to int (possible loss of precision if long value exceeds int range)
        int b = (int) a;

        // Print the converted int value
        System.out.println("Converted int value: " + b);
    }
}
