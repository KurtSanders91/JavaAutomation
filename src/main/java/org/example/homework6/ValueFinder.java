package org.example.homework6;
import java.util.Scanner;
public class ValueFinder {
    public static void main(String[] args) {
        int[] integers = readIntegers();

        int minValue = findMin(integers);

        System.out.println("Minimum value: " + minValue);
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();

        String[] parts = input.split(",");
        int[] integers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            integers[i] = Integer.parseInt(parts[i].trim());
        }

        scanner.close();
        return integers;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
}
