package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomaticNegative {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser Launched Successfully");

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        System.out.println("Amazon Website Opened");

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        Thread.sleep(2000);
        System.out.println("Clicked on Sign In");


        driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"))
              .sendKeys("invalidemail@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"))
              .click();
        Thread.sleep(3000);

        String emailError = driver.findElement(
                By.xpath("//div[@class='a-alert-content']")).getText();

        if (emailError.contains("cannot find")) {
            System.out.println("PASS: Invalid Email Test Case Passed");
        } else {
            System.out.println("FAIL: Invalid Email Test Case Failed");
        }

        driver.navigate().back();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"))
              .sendKeys("validemail@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"))
              .click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"ap_password\"]"))
              .sendKeys("wrongpassword");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"))
              .click();
        Thread.sleep(3000);

        String passError = driver.findElement(
                By.xpath("//div[@class='a-alert-content']")).getText();

        if (passError.contains("incorrect")) {
            System.out.println("PASS: Invalid Password Test Case Passed");
        } else {
            System.out.println("FAIL: Invalid Password Test Case Failed");
        }

        driver.navigate().back();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\"auth-mfa-otpcode\"]"))
              .sendKeys("123456");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]"))
              .click();
        Thread.sleep(3000);

        String otpError = driver.findElement(
                By.xpath("//div[@class='a-alert-content']")).getText();

        if (otpError.contains("invalid")) {
            System.out.println("PASS: Invalid OTP Test Case Passed");
        } else {
            System.out.println("FAIL: Invalid OTP Test Case Failed");
        }

        System.out.println("Negative Test Cases Execution Completed");

        driver.quit();
    }
}
