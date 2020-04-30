package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username") private WebElement uname;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(xpath="//div[.='Login ']") private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username,String password) throws InterruptedException
	{
		uname.sendKeys(username);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(2000);
		loginbtn.click();
	}
	
	

	

}
