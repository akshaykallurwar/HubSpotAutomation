package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage
{
	//login url :- https://app.hubspot.com/login

	public LoginPage(WebDriver driver, WebDriverWait wait) 
	{
		super(driver, wait);
	}
	
	//page locators:-
	
	By emailId = By.id("username");
	By passwd = By.id("password");
	By loginBtn = By.id("loginBtn");
	
	//page actions :-
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String userName,String pwd)
	{
		doSendKeys(emailId, userName);
		doSendKeys(passwd, pwd);
		doClick(loginBtn);
		try
		{
		Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
