package com.login;

/**
 * Hello world!
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class App {
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","../chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless=new");
		  WebDriver driver=new ChromeDriver(options);
		  driver.get("http://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("yourUsername");
		  Thread.sleep(5000);
		  driver.findElement(By.id("pass")).sendKeys("yourPassword");
		  Thread.sleep(5000);
		  driver.findElement(By.name("login")).click();
		  String pageTitle = driver.getTitle();
          System.out.println("Page title: " + pageTitle);
		  driver.close();
}
}
