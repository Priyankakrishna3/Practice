package com.actitime.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.base.BaseConfig;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.pages.CreateCustomerPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TasksPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTest extends BaseConfig{
	
	WebDriverUtils ut=new WebDriverUtils();
	@Test
	public void createTest() throws IOException, InterruptedException
	{
		String custname = ut.readxldata("./src/test/resources/Exceldata/New XLSX Worksheet.xlsx","Sheet1",1, 0);
		
		
		HomePage h=new HomePage(driver);
		Thread.sleep(5000);
		h.clickTasks();
		TasksPage tp=new TasksPage(driver);
		Thread.sleep(3000);
		tp.createNewCustomer();
		CreateCustomerPage cp=new CreateCustomerPage(driver);
		Thread.sleep(3000);
		cp.customerDetails("abcd");
		Thread.sleep(2000);	
		
	}
	@Test
	public void createTestDescription() throws IOException, InterruptedException
	{
		
		
		
		
		HomePage h=new HomePage(driver);
		Thread.sleep(5000);
		h.clickTasks();
		TasksPage tp=new TasksPage(driver);
		Thread.sleep(3000);
		tp.createNewCustomer();
		String custname = ut.readxldata("./src/test/resources/Exceldata/New XLSX Worksheet.xlsx","Sheet1",2, 0);
		String description=ut.readxldata("./src/test/resources/Exceldata/New XLSX Worksheet.xlsx", "Sheet1", 2, 1);
		CreateCustomerPage cp=new CreateCustomerPage(driver);
		Thread.sleep(3000);
		cp.customerDetails(custname, description);
		Thread.sleep(2000);	
		
	}
	
	
	

}
