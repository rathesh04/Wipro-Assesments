package utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


@Listeners(Testng.LocalListener.class)
public class Testng {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    

    @BeforeClass
    public void globalSetup() {
        System.out.println("Environment Setup: Launching Saucedemo Test Suite");
    }

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void globalCleanup() {
        System.out.println("Cleanup: Browser instances closed and reports ready.");
    }

    

    @DataProvider(name = "LoginDetails")
    public Object[][] getValues() {
        return new Object[][] {
            {"standard_user", "secret_sauce", "success"},    
            {"standard_user", "wrong_pass", "error"},        
            {"locked_out_user", "secret_sauce", "error"},    
            {"", "", "empty"}                                
        };
    }

  

    @Test(dataProvider = "LoginDetails", retryAnalyzer = LocalRetry.class)
    public void loginTest(String un, String ps, String scenario) {
        driver.findElement(By.id("user-name")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("login-button")).click();

        if (scenario.equals("success")) {
            wait.until(ExpectedConditions.urlContains("inventory.html"));
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed for valid user!");
        } else if (scenario.equals("error")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3[data-test='error']")));
            String error = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(error.contains("do not match"), "Incorrect error for invalid login!");
        } else if (scenario.equals("empty")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3[data-test='error']")));
            String error = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(error.contains("is required"), "Missing validation for empty fields!");
        }
    }

    

    public static class LocalRetry implements IRetryAnalyzer {
        private int count = 0;
        private static final int MAX_LIMIT = 2; 
        @Override
        public boolean retry(ITestResult result) {
            if (count < MAX_LIMIT) {
                count++;
                return true;
            }
            return false;
        }
    }

   

    public static class LocalListener implements ITestListener {
        @Override
        public void onTestFailure(ITestResult result) {
            Object currentClass = result.getInstance();
            WebDriver driver = ((Testng) currentClass).getDriver();
            
            if (driver != null) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    String fileName = "./screenshots/" + result.getName() + ".png";
                    FileUtils.copyFile(src, new File(fileName));
                    System.out.println("Screenshot captured for failed test: " + fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}