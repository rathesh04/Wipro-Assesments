import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1_2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("Launching Browser...");
        WebDriverManager.chromedriver().setup();   // Important
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void testLogin() {
        System.out.println("Executing Login Test...");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        // Verification
        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @AfterClass
    public void teardown() {
        System.out.println("Closing Browser...");
        if (driver != null) {
            driver.quit();
        }
    }
}