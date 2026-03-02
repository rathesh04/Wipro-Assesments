package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomeWork {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("Browser Launched Successfully");
        Thread.sleep(2000);
        
        //Getting amazon website
        driver.get("https://www.amazon.in");
        Thread.sleep(4000);
        
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Amazon Website Opened Successfully");
        } else {
            System.out.println("Amazon Website Not Opened");
        }
        
        //clicking on sign in 
        
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        Thread.sleep(4000);
        
        
        // entering values
        
        driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("ssrfury@gmail.com");
        Thread.sleep(2000);
        System.out.println("Email Entered Successfully");
        
        // clicking continue
        
        driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click();
        Thread.sleep(2000);
        System.out.println("Clicked Continue Button");
        
        //entering password
        
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rss@2764_");
        Thread.sleep(2000);
        System.out.println("Password Entered Successfully");
        
        //clicking continue button
        
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
        System.out.println("Sign Button Clicked");
        
        
        
        
        
        
        
        //checking two step verification page
        
        List<WebElement> deviceSelection =driver.findElements(By.id("auth-select-device-form"));
        if (!deviceSelection.isEmpty()) {

            System.out.println("WhatsApp / Call selection page detected");

            WebElement radioOption =driver.findElement(By.xpath("//input[@type='radio']"));
            radioOption.click();

            driver.findElement(By.xpath("//*[@id=\"auth-send-code\"]/span/input")).click();
            

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

                List<WebElement> remember = driver.findElements(By.id("auth-mfa-remember-device"));

                if (!remember.isEmpty()) {
                    WebElement checkbox = remember.get(0);
                    if (!checkbox.isSelected()) {
                        checkbox.click();
                    }
                }

                driver.findElement(By.id("auth-signin-button")).click();
            }
        }
        Thread.sleep(3000);
        
        
        
        
        
        
        
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(3000);
        
	    driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[3]/ul/li[1]/a/div")).click();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/div[26]/section/ul/li[7]/a")).click();
	   Thread.sleep(4000);


  
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("noise diva 2");
	    Thread.sleep(3000);
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	    Thread.sleep(3000);
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"a-autoid-6-announce\"]")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")).click();
	    Thread.sleep(3000);
	    
	    WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"gutterCartViewForm\"]/div/div[1]/div[1]/span/div/label/i"));
	    checkbox.click();
	    Thread.sleep(2000); 

	    driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
	    Thread.sleep(4000);
	    
		   
	    
	    driver.findElement(By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input")).click();
	    Thread.sleep(10000);
	    Actions actions2 = new Actions(driver);
	    actions2.scrollByAmount(0, 300).perform();
	    Thread.sleep(3000);
	    
	    
	    WebElement radio = driver.findElement(By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input"));
	    radio.click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"placeOrder\"]")).click();
	    Thread.sleep(6000);
	    
	    
	    WebElement account = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));

	    Actions actions11 = new Actions(driver);
	    actions11.moveToElement(account).perform();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Sign Out")).click();
	    Thread.sleep(6000);
	    
	    
	    driver.quit();  
        
	}

}
