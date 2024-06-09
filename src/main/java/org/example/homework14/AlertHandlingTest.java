package org.example.homework14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AlertHandlingTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/alerts");

            driver.findElement(By.id("alertButton")).click();
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert Message: " + alert.getText());
            alert.accept();

            driver.findElement(By.id("confirmButton")).click();
            Alert confirmAlert = driver.switchTo().alert();
            System.out.println("Confirm Alert Message: " + confirmAlert.getText());
            confirmAlert.accept();

            driver.findElement(By.id("promtButton")).click();
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys("Test");
            System.out.println("Prompt Alert Message: " + promptAlert.getText());
            promptAlert.accept();

            WebElement promptResult = driver.findElement(By.id("promptResult"));
            System.out.println("Prompt Result: " + promptResult.getText());

        } finally {
            driver.quit();
        }
    }
}

