package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        System.out.println("Browser Launched Successfully");

        driver.get("https://www.amazon.in");

        wait.until(ExpectedConditions.titleContains("Amazon"));
        System.out.println("Amazon Website Opened Successfully");

        // Click Sign in
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"))).click();

        // Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"ap_email_login\"]")))
                .sendKeys("ssrfury@gmail.com");

        System.out.println("Email Entered Successfully");

        // Click continue
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"continue\"]/span/input"))).click();

        // Enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"ap_password\"]")))
                .sendKeys("Rss@2764_");

        System.out.println("Password Entered Successfully");

        // Click Sign in
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"signInSubmit\"]"))).click();

        System.out.println("Sign Button Clicked");

        // Handle Two Step Verification if present
        List<WebElement> deviceSelection =
                driver.findElements(By.id("auth-select-device-form"));

        if (!deviceSelection.isEmpty()) {

            System.out.println("WhatsApp / Call selection page detected");

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@type='radio']"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"auth-send-code\"]/span"))).click();
        }

        // Wait for OTP field
        List<WebElement> otpFieldCheck =
                driver.findElements(By.id("auth-mfa-otpcode"));

        if (!otpFieldCheck.isEmpty()) {

            System.out.println("Please enter OTP manually within 60 seconds...");
            wait.withTimeout(Duration.ofSeconds(60))
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.id("auth-signin-button")));
        }

        // Wait until homepage loads (important fix)
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@id=\"nav-hamburger-menu\"]")));

        // Click hamburger menu
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"nav-hamburger-menu\"]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[3]/ul/li[1]/a/div"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"hmenu-content\"]/div[26]/section/ul/li[7]/a"))).click();

        // Search product
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"twotabsearchtextbox\"]")))
                .sendKeys("noise diva 2");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"nav-search-submit-button\"]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"a-autoid-6-announce\"]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a"))).click();

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"gutterCartViewForm\"]/div/div[1]/div[1]/span/div/label/i")));
        checkbox.click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input"))).click();

        Actions actions2 = new Actions(driver);
        actions2.scrollByAmount(0, 300).perform();

        WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input")));
        radio.click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"placeOrder\"]"))).click();

        WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"nav-link-accountList\"]")));

        Actions actions11 = new Actions(driver);
        actions11.moveToElement(account).perform();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Sign Out"))).click();

        driver.quit();
    }
}
