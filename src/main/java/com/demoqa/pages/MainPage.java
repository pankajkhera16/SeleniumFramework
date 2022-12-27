/*
 * This file will consist:
 * 1. Elements on the main page of the website. It will be done using the FindBy Annotation of Selenium
 * 2. All methods which will be specific to the main page of the website.
 * */


package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;

public class MainPage extends TestBase {

	@FindBy(xpath="//*[@class='card-body']/h5[contains(text(),'Elements')]")
	WebElement Elements;
	
	@FindBy(xpath="//img[@alt='Selenium Online Training']")
	static WebElement SeleniumClassBanner;
	
	
	
	public MainPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static String verifyTitle()
	{
		return(driver.getTitle());
	}

	public static boolean verifyIfSeleniumClassAvailable() {
		return(SeleniumClassBanner.isDisplayed());
	}
}
