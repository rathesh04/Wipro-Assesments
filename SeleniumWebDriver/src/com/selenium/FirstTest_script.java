package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_script {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
        "D:\\Rathesh Files\\JAVA\\Selenium_Integration\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Title : " + driver.getTitle());

        driver.quit();
    }
}
