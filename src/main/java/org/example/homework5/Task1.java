package org.example.homework5;

public class Task1 {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(165489745));
        System.out.println(getEvenDigitSum(783));
        System.out.println(getEvenDigitSum(-33));
    }
}
