package testing;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class LoginJavaExcel 
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dataProvider="excelData")
	public void loginTest(String username, String password) 
	{
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="excelData")
	public Object[][]  getexcelData()throws Exception
	{
		return ExcelUtils.getEcelData("C:\\Users\\senba\\eclipse-workspace\\SeleniumMavenTestNg\\TestData\\Sheet1.xlsx","Sheet1");
	}
 
 
}