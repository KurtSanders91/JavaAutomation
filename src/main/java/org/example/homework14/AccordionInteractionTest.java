package org.example.homework14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AccordionInteractionTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/accordian");

            driver.findElement(By.id("section1Heading")).click();
            System.out.println("Section 1 Content: " + driver.findElement(By.id("section1Content")).isDisplayed());

            driver.findElement(By.id("section2Heading")).click();
            System.out.println("Section 2 Content: " + driver.findElement(By.id("section2Content")).isDisplayed());

            driver.findElement(By.id("section3Heading")).click();
            System.out.println("Section 3 Content: " + driver.findElement(By.id("section3Content")).isDisplayed());

        } finally {
            driver.quit();
        }
    }
}

