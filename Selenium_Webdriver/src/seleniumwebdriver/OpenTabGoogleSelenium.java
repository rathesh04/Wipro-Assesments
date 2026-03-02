package seleniumwebdriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenTabGoogleSelenium {
	public static void main(String[] args) {
		

	WebDriver driver = new ChromeDriver();
	
		
	try {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Google")) {
			driver.get("https://www.selenium.dev/");
			Actions actions = new Actions(driver);
		    actions.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		
			
		 
			driver.get("https://www.selenium.dev/downloads/");
			Actions actions1 = new Actions(driver);
		    actions1.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions1.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		
			driver.get("https://www.selenium.dev/documentation/");
			Actions actions2 = new Actions(driver);
		    actions2.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions2.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		
			driver.get("https://www.selenium.dev/projects/");
			Actions actions3 = new Actions(driver);
		    actions3.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions3.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		
			driver.get("https://www.selenium.dev/support/");
			Actions actions4 = new Actions(driver);
		    actions4.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions4.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		
			driver.get("https://www.selenium.dev/blog/");
			Actions actions5 = new Actions(driver);
		    actions5.scrollByAmount(0, 500).perform();
		    Thread.sleep(2000);
		    actions5.scrollByAmount(0, -500).perform();
		    Thread.sleep(2000);
			
		}
		
		else {
			System.out.println("Test Fail");
		}
	}
	catch(Exception e) {
		System.out.println("Exception Occured : " + e.getMessage());
		}finally {
			driver.quit();
		}
	}
	public static void scrollPage(JavascriptExecutor js) throws InterruptedException {       
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);
	}

}