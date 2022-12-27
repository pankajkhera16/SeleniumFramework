package com.demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.MainPage;

public class MainPageTest extends TestBase {
  
	
	@BeforeMethod
	public void navigateToWebsite()
	{
		initializeDriver();
		driver.get("https://demoqa.com/");
	}
	
	@Test
	public void validateMainPage()
	{
		String titleOfPage="ToolsQA";
		String title= MainPage.verifyTitle();
		Assert.assertEquals(title,titleOfPage);
	}
	
	@Test
	void verifyIfClassIsAvailable()
	{
		boolean res= MainPage.verifyIfSeleniumClassAvailable();
		Assert.assertEquals(res, true);
	}
  
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
