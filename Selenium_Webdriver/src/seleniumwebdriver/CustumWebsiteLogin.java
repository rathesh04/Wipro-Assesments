package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class CustumWebsiteLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://www.saucedemo.com/");
		System.out.println("Website opened success");
		
		driver.manage().window().maximize();
		System.out.println("Maximized  success");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		System.out.println("Enter Username Success");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		System.out.println("Enter PassWord Success");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).submit();
		System.out.println("Logged In Success");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		System.out.println("Sauce Labs Backpack Added to cart");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		System.out.println("Go to cart page success");
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		System.out.println("Check out page open");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Rathesh");	
		System.out.println("First name added succesfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Prabu");	
		System.out.println("Second name added succesfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("600106");	
		System.out.println("Zip code addded Successsfully");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}catch(Exception e) {
		System.out.println();
	}
}
