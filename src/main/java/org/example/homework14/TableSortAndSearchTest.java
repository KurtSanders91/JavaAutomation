package org.example.homework14;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TableSortAndSearchTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/webtables");

            driver.findElement(By.id("searchBox")).sendKeys("Cierra");

            WebElement searchResult = driver.findElement(By.xpath("//div[contains(text(),'Cierra')]"));
            System.out.println("Search Result Found: " + searchResult.isDisplayed());

            driver.findElement(By.xpath("//div[contains(text(),'Salary')]")).click();

        } finally {
            driver.quit();
        }
    }
}

