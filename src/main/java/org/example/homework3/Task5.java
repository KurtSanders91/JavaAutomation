package org.example.homework3;

public class Task5 {
    public static void main(String[] args) {

        // Pre-assigned Celsius temperature
        double celsius = 17;

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);

        // Convert Celsius to Kelvin
        double kelvin = celsiusToKelvin(celsius);

        // Print results
        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
