import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C://JAVA course//chromedriver-win64");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        // Add more actions and assertions as needed
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

