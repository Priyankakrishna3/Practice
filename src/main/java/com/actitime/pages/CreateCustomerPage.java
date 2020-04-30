package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") private WebElement CustomerName;
	@FindBy(xpath="//div[.='Create Customer']") private WebElement CreateCustomerbtn;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") private WebElement desc;
	
	
	public CreateCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customerDetails(String custname)
	{
		CustomerName.sendKeys(custname);
		CreateCustomerbtn.click();	
	}
	public void customerDetails(String custname,String description)
	{
		CustomerName.sendKeys(custname);
		desc.sendKeys(description);
		
		CreateCustomerbtn.click();	
	}

}
