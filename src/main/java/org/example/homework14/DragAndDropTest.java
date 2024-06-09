package org.example.homework14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/droppable");

            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(source, target).perform();

            String targetText = target.getText();
            System.out.println("Drop Result: " + targetText);

        } finally {
            driver.quit();
        }
    }
}

