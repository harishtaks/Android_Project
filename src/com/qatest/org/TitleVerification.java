package com.qatest.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerification {
	
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Jarfile\\jars\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Jarfile\\jars\\drivers\\chromedriver.exe");
	}
//hi
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		String actual=driver.getTitle();
		System.out.println("acutal page:"+actual);
		String expected="Sign up for | facebook";
	
		if(actual.startsWith(expected))

		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Unsucessfull login");
		}
		driver.quit();
		
	}

}
