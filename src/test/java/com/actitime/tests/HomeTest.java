package com.actitime.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.base.BaseConfig;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.pages.HomePage;

public class HomeTest extends BaseConfig {
	@Test
	public void homeVerify() throws InterruptedException, IOException
	{
		WebDriverUtils u=new WebDriverUtils();
		HomePage h=new HomePage(driver);
		Thread.sleep(3000);
		
		
	}

}
