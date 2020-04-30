package com.actitime.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.base.BaseConfig;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;

public class TC_LoginTest extends BaseConfig {
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		WebDriverUtils utils=new WebDriverUtils();
		String user=utils.getDataFromProperties("username");
		String pass=utils.getDataFromProperties("password");
		lp.login(user, pass);
		Thread.sleep(5000);
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		if(driver.getTitle().equals("bdd"))
		{
			Assert.assertTrue(true);
	}
		else
		{
			utils.captureScreenshot(driver,"test2");
			Assert.assertTrue(false);
			
		}
		
	}
		
	}


