package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenTabEdge {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
			String title = driver.getTitle();
			System.out.println("Title :" + title);
			
			if(title.contains("Google")) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
		}
			catch(Exception e) {
				System.out.println("Exception Occured :"+ e.getMessage());		
			}
		}
		
	}

