package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy(xpath="//div[.='Add New']") private WebElement AddNewbtn;
	@FindBy(xpath="//div[.='+ New Customer']") private WebElement Newcustomer;
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewCustomer()
	{
		AddNewbtn.click();
		Newcustomer.click();
		
	}
	

}
