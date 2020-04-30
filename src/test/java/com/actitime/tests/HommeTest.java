package com.actitime.tests;


import org.testng.annotations.Test;

import com.actitime.base.BaseConfig;
import com.actitime.pages.HomePage;

public class HommeTest extends BaseConfig {
	
	
	@Test
	public void clickOnTask() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		Thread.sleep(3000);
		h.clickTasks();
		
		
	}
	
	

}
