package rathesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("D:\\Rathesh Files\\JAVA\\Rathesh Resume.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
		
	}

}
