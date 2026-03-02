package seleniumwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTabChrome {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
			String title = driver.getTitle();
			System.out.println("Title : " + title);
			
			if(title.contains("Google")) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
		}
			catch(Exception e) {
				System.err.println("Exception occured :" + e.getMessage());
			}
			
		}
		
	}


