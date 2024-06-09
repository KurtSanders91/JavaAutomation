package org.example.homework14;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class FormSubmissionTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/automation-practice-form");

            driver.findElement(By.id("firstName")).sendKeys("John");
            driver.findElement(By.id("lastName")).sendKeys("Doe");
            driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");
            driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
            driver.findElement(By.id("userNumber")).sendKeys("1234567890");

            driver.findElement(By.id("dateOfBirthInput")).click();
            new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("January");
            new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1990");
            driver.findElement(By.xpath("//div[contains(text(),'1')]")).click();

            driver.findElement(By.id("subjectsInput")).sendKeys("Math");
            driver.findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);

            driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();

            driver.findElement(By.id("uploadPicture")).sendKeys("/path/to/your/image.jpg");
            driver.findElement(By.id("currentAddress")).sendKeys("123 Main St");

            driver.findElement(By.id("state")).click();
            driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
            driver.findElement(By.id("city")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).click();

            driver.findElement(By.id("submit")).click();

            WebElement confirmationDialog = driver.findElement(By.id("example-modal-sizes-title-lg"));
            System.out.println("Confirmation: " + confirmationDialog.isDisplayed());

        } finally {
            driver.quit();
        }
    }
}
