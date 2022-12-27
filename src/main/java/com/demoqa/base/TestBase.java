package com.demoqa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase {

	public static WebDriver driver;
	
	public void initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\SeleniumFrameworkPankaj\\SeleniumFramework\\src\\main\\java\\com\\demoqa\\util\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
}
