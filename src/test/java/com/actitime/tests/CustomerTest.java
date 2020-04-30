package com.actitime.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.base.BaseConfig;
import com.actitime.pages.HomePage;
import com.actitime.pages.TasksPage;

public class CustomerTest extends BaseConfig {
	
	
		@Test
	public void createCustomerWithDetails() throws InterruptedException
	{
		
			HomePage h=new HomePage(driver);
			

	Thread.sleep(5000);
		h.clickTasks();
		TasksPage t=new TasksPage(driver);
		Thread.sleep(5000);
		
		t.createNewCustomer();
		
	}

}
