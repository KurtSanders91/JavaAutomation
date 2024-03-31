package org.example.homework4;

public class Task3.1 {
    public static double calculateTotalCost(double unitPrice, int quantity) {
        double totalCost = unitPrice * quantity;

        if (quantity > 10 && quantity <= 20) {
            totalCost *= 0.95; // Apply 5% discount
        } else if (quantity > 20 && quantity <= 30) {
            totalCost *= 0.90; // Apply 10% discount
        } else if (quantity > 30 && quantity <= 80) {
            totalCost *= (0.88 - (Math.floorDiv(quantity - 30, 10) * 0.004)); // Apply 12% discount with additional discount for every 10 units beyond 30
        } else if (quantity > 80) {
            totalCost *= 0.87; // Apply 13% discount
        }

        return totalCost;
    }

    public static void main(String[] args) {
        double unitPrice = 10.0;

        int quantity = 8;
        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);

        quantity = 15;
        totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);

        quantity = 25;
        totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);

        quantity = 35;
        totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);

        quantity = 55;
        totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);

        quantity = 100;
        totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }
}
