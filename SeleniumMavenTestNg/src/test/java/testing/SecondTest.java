package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SecondTest {

    WebDriver driver;

    @BeforeClass
    public void openDriver()throws InterruptedException  {
        
        driver = new ChromeDriver();   
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @BeforeMethod
    public void openWebsite()throws InterruptedException {
        
        driver.get("https://www.google.com");
        Thread.sleep(2000);
    }

    @Test
    public void gettingTitle() throws InterruptedException{
       
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Thread.sleep(2000);
    }

    @Test
    public void gettingUrl() throws InterruptedException{
        
        String url = driver.getCurrentUrl();
        System.out.println("URL is: " + url);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void afterTest() throws InterruptedException{
        
        System.out.println("Test cases completed");
        Thread.sleep(2000);
    }

    @AfterClass
    public void closeDriver() {
        
        driver.quit();   
    }
}
