package org.example.homework6;
import java.util.Scanner;

public class FillAndSortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\nSorted array by length:");
        for (String str : array) {
            System.out.println(str);
        }

        scanner.close();
    }
}
