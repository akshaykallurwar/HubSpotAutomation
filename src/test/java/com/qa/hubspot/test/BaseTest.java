package com.qa.hubspot.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.pages.Page;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\browsersdriver\\chromeDriver79\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		try
		{
		Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Some error occured while launching the browser");
		}
		//create an object of Page class : Instantiate Page class
		page = new Page(driver, wait);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
