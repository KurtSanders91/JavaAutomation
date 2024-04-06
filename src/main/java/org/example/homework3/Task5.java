package org.example.homework3;

public class Task5 {
    public static void main(String[] args) {

        double celsius = 17;

        double fahrenheit = celsiusToFahrenheit(celsius);

        double kelvin = celsiusToKelvin(celsius);

        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
