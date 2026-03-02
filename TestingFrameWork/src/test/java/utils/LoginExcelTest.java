package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExcelTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() throws Exception {

        String path = System.getProperty("user.dir") + "/src/test/resources/LoginData.xlsx";

        return ExcelUtil.getExcelData(path, "Sheet1");
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String username, String password, String expectedResult) {

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("submit")).click();

        if (expectedResult.equalsIgnoreCase("success")) {

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("logged-in-successfully"),
                    "Login failed for valid credentials!"
            );
        }
        else if (expectedResult.equalsIgnoreCase("invalidUser")) {

            String error = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(
                    error,
                    "Your username is invalid!",
                    "Incorrect error message for invalid username!"
            );
        }

        else if (expectedResult.equalsIgnoreCase("invalidPass")) {

            String error = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(
                    error,
                    "Your password is invalid!",
                    "Incorrect error message for invalid password!"
            );
        }

       

        else if (expectedResult.equalsIgnoreCase("empty")) {

            String error = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(
                    error,
                    "Your username is invalid!",
                    "Incorrect validation message for empty fields!"
            );
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}