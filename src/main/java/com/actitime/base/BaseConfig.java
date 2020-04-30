package com.actitime.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.commonutils.IAutoconstant;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfig  implements IAutoconstant {
	public String baseurl="https://demo.actitime.com/login.do";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
	}
	@BeforeMethod
	public void mtdsetup() throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		WebDriverUtils utils=new WebDriverUtils();
		String user=utils.getDataFromProperties("username");
		String pass=utils.getDataFromProperties("password");
		lp.login(user, pass);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Thread.sleep(3000);
		h.logout();
				
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
}
