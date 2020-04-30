package com.actitime.commonutils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	
		WebDriver driver;
		public String getDataFromProperties(String key) throws IOException 
		{
			FileInputStream fisobj=new FileInputStream("./src/main/resources/DataProperties/LoginData.properties");
			Properties obj=new Properties();
			obj.load(fisobj);
			String value=obj.getProperty(key);
			return value;
			
		}
		public void captureScreenshot(WebDriver driver,String tc) throws IOException, InterruptedException
		{
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"\\Screen\\"+tc+".png");
			FileUtils.copyFile(src, target);
			System.out.println("screenshot taken");
			Thread.sleep(2000);
			
		}
		public String readxldata(String path,String sheet,int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
		{
			Workbook book=WorkbookFactory.create(new FileInputStream(path));
			String s=book.getSheet(sheet).getRow(row).getCell(cell).toString();
			return s;
			
		}
		

	}


