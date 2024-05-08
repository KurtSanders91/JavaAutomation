package org.example.homework7;

import org.example.homework7.Calculator;
import org.example.homework7.RomanNumber;

public class Main {
    public static void main(String[] args) {
        RomanNumber num1 = RomanNumber.X;
        RomanNumber num2 = RomanNumber.V;
        String operation = "+";

        Calculator calculator = new Calculator();
        int result = calculator.calculate(num1, num2, operation);
        System.out.println("Result: " + result);
    }
}