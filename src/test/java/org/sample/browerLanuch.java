package org.sample;

import org.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browerLanuch extends BaseClasss {
	
public static void main(String[] args) {
	
	chromebrower();
	urllunch("https://www.facebook.com/");
	maximize();
	implicitwait(10);
	LoginPage i =new LoginPage();
	sendkeys(i.getTxtUserName(), "tamil");
	sendkeys(i.getTxtPassword(), "1234");
	sendkeys(i.getTxtPassword(), "1234");
	sendkeys(i.getTxtPassword(), "1234");
	}
	
}
