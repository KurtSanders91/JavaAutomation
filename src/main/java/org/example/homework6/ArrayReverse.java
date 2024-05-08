package org.example.homework6;

public class ArrayReverse {
    public static void reverseArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("\nReversed array:");
        printArray(numbers);
    }
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
