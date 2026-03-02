package rathesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.yahoo.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/a")).click();
		Thread.sleep(2000);
		
		

		WebElement checkbox = driver.findElement(By.id("persistent"));

		if (!checkbox.isSelected()) {
		    checkbox.click();
		    System.out.println("Check Box Clicked");
		}else {
			System.out.println("Check box not clicked");
		}
		Thread.sleep(2000);

		
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("Rss@2764");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
	}

}
