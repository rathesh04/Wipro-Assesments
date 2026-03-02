package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/upload");
	
	driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("D:\\Rathesh Files\\JAVA\\Rathesh Resume.pdf");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
	Thread.sleep(2000);
}
}
