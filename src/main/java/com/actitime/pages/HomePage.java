package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.base.BaseConfig;

public class HomePage  {
	@FindBy(xpath="//div[.='Time-Track']")private WebElement Timetrack;
	@FindBy(xpath="//div[.='Tasks']") private WebElement Tasks;
	@FindBy(xpath="//div[.='Reports']") private WebElement Reports;
	@FindBy(xpath="//div[.='Users']") private WebElement Users;
	@FindBy(xpath="//a[.='Logout']")private WebElement logout;
	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void clickTasks()
	{
	Tasks.click();	
	}
	public void logout()
	{
		logout.click();
		
	}
	

}
