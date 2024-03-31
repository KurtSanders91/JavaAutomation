package org.example.homework4;

public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] years = {2000, 2004, 1900, 2100, 2400, 2021};
        for (int year : years) {
            System.out.println(year + ": " + isLeapYear(year));
        }
    }
}
