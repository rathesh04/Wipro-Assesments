package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser Launched Successfully");

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Amazon Website Opened Successfully");
        } else {
            System.out.println("Amazon Website Not Opened");
        }

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        Thread.sleep(2000);
        System.out.println("Clicked on Sign In");

        driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("ssrfury@gmail.com");
        Thread.sleep(2000);
        System.out.println("Email Entered Successfully");

        driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click();
        Thread.sleep(2000);
        System.out.println("Clicked Continue Button");

        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rss@2764_");
        Thread.sleep(2000);
        System.out.println("Password Entered Successfully");

        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
        System.out.println("Sign Button Clicked");
        
         List<WebElement> deviceSelection =driver.findElements(By.id("auth-select-device-form"));

       if (!deviceSelection.isEmpty()) {

           System.out.println("WhatsApp / Call selection page detected");

           WebElement radioOption =driver.findElement(By.xpath("//input[@type='radio']"));
           radioOption.click();

           driver.findElement(By.xpath("//input[@type='submit']")).click();

       } else {

           System.out.println("Direct OTP page detected");
       }

       Thread.sleep(2000);

       List<WebElement> otpFieldCheck =driver.findElements(By.id("auth-mfa-otpcode"));

       if (!otpFieldCheck.isEmpty()) {

           WebElement otpField = otpFieldCheck.get(0);

           System.out.println("Waiting 20 seconds for OTP");
           Thread.sleep(20000);

           String enteredOtp = otpField.getAttribute("value");

           if (enteredOtp != null && !enteredOtp.isEmpty()) {

               System.out.println("OTP Entered");

               List<WebElement> remember =
                       driver.findElements(By.id("auth-mfa-remember-device"));

               if (!remember.isEmpty()) {
                   WebElement checkbox = remember.get(0);
                   if (!checkbox.isSelected()) {
                       checkbox.click();
                   }
               }

               driver.findElement(By.id("auth-signin-button")).click();
           }
       }


       
        
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 17 pro");
        Thread.sleep(2000);
        System.out.println("Product Name Entered in Search Box");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(2000);
        System.out.println("Search Button Clicked Successfully");
        Actions actions = new Actions(driver);
	    actions.scrollByAmount(0, 300).perform();
	    Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
        Thread.sleep(3000);
          
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        Thread.sleep(5000);
        
      //  *************************************************************
        driver.findElement(By.xpath("//span[contains(text(),'Credit or debit card')]/preceding::input[@type='radio'][1]")).click();

        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Add a new credit or debit card')]")).click();

        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@id=\"pp-sonMPK-17\"]")).sendKeys("123456788745");
        Thread.sleep(4000);
        
        driver.findElement(By.id("continue")).click();
        List<WebElement> errorList = driver.findElements(By.xpath("//*[contains(text(),'There was a problem')]"));

        if (!errorList.isEmpty()) {

            String errorText = errorList.get(0).getText();
            System.out.println("ERROR OCCURRED: " + errorText);

        } else {

            System.out.println("No error found. Proceeding to next step.");
        }
        driver.quit();
        
        }
}


/////////////////