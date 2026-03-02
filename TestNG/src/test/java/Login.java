import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

    WebDriver driver;

    @BeforeClass
    public void setupEnvironment() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Environment Setup Completed");
    }

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"student", "Password123", "success"},
                {"student", "wrongpass", "invalidPassword"},
                {"wronguser", "Password123", "invalidUsername"},
                {"", "", "empty"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String scenario) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        //  Successful Login → Verify URL
        if (scenario.equals("success")) {

            String actualURL = driver.getCurrentUrl();
            String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";

            Assert.assertEquals(actualURL, expectedURL,
                    "Dashboard URL did not match after successful login");
        }

        //  Invalid Username
        else if (scenario.equals("invalidUsername")) {

            String errorMsg = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(errorMsg,
                    "Your username is invalid!",
                    "Incorrect error message for invalid username");
        }

        // Invalid Password
        else if (scenario.equals("invalidPassword")) {

            String errorMsg = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(errorMsg,
                    "Your password is invalid!",
                    "Incorrect error message for invalid password");
        }

        // Empty Fields
        else if (scenario.equals("empty")) {

            String errorMsg = driver.findElement(By.id("error")).getText();

            Assert.assertTrue(errorMsg.contains("invalid"),
                    "Validation message not displayed for empty fields");
        }
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @AfterClass
    public void cleanup() {
        System.out.println("All Tests Completed");
    }
}