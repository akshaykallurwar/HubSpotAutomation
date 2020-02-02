package com.qa.hubspot.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest 
{
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		page.getInstance(LoginPage.class).doLogin("akshaykallurwar@gmail.com", "A**123");
		String homePageTitle = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("HomePage title is "+homePageTitle);
		Assert.assertEquals(homePageTitle, "Account Setup | HubSpot");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest()
	{
		page.getInstance(LoginPage.class).doLogin("akshaykallurwar@gmail.com", "A**123");
		String homePageHeader = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("HomePage header is "+homePageHeader);
		Assert.assertEquals(homePageHeader, "Set up your HubSpot account");
	}

}
