package com.qa.hubspot.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest 
{
	@Test(priority =1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("LoginPage title is "+title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		page.getInstance(LoginPage.class).doLogin("akshaykallurwar@gmail.com", "A**123");
	}

}
