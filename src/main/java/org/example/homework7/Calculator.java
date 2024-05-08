package org.example.homework7;
public class Calculator {
    public int calculate(RomanNumber num1, RomanNumber num2, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = num1.getValue() + num2.getValue();
                break;
            case "-":
                result = num1.getValue() - num2.getValue();
                break;
            case "*":
                result = num1.getValue() * num2.getValue();
                break;
            case "/":
                result = num1.getValue() / num2.getValue();
                break;
            default:
                System.out.println("Invalid operation.");
        }
        return result;
    }
}

