package org.example.homework9;
import org.example.homework9.Printer;
public class Printertest {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        int tonerLevel = printer.addToner(30);
        if (tonerLevel != -1) {
            System.out.println("Toner level after adding: " + tonerLevel);
        } else {
            System.out.println("Failed to add toner. Toner level is out of range.");
        }

        int pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());

        tonerLevel = printer.addToner(80);
        if (tonerLevel != -1) {
            System.out.println("Toner level after adding: " + tonerLevel);
        } else {
            System.out.println("Failed to add toner. Toner level is out of range.");
        }

        pagesPrinted = printer.printPages(20);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());
    }
}
