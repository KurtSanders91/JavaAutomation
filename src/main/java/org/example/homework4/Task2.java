package org.example.homework4;

public class Task2.1 {
          public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
                return;
            }

            long minutesInHour = 60;
            long hoursInDay = 24;
            long daysInYear = 365;

            long totalMinutes = minutes;
            long totalHours = totalMinutes / minutesInHour;
            long totalDays = totalHours / hoursInDay;
            long years = totalDays / daysInYear;
            long remainingDays = totalDays % daysInYear;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

        public static void main(String[] args) {
            printYearsAndDays(525600); // 1 year
            printYearsAndDays(1051200); // 2 years
            printYearsAndDays(1440); // 0 years, 1 day
            printYearsAndDays(-100); // Invalid Value
        }
    }
