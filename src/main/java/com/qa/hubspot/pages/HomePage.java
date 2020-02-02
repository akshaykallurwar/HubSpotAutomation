package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage 
{

	public HomePage(WebDriver driver, WebDriverWait wait) 
	{
		super(driver, wait);
	}
	
	//page locators :-
	
	By header = By.xpath("//i18n-string[@data-key='getting-started-ui.appHeaderTitle']");
	
	//page actions :-
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHomePageHeader()
	{
		return doGetText(header);
	}
	

}
