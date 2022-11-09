package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	
	public static WebDriver driver;

	public static WebDriver chromebrower() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 return driver;
	}
	
	public static void urllunch(String url) {
		driver.get(url);

	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitwait(long secs) {
	driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS);
	
	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}

	public static String currenturl() {
		String url = driver.getCurrentUrl();
		return url;

	}
	
	public static String grtattribute(WebElement e) {
	String att = e.getAttribute("value");
	return att;
	}
}
