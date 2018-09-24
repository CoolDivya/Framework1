package com.test.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TestUtil {

	
	public static void javascript_button_click(WebDriver driver, WebElement e)
	{

    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", e);
	}

	
	
	public static void javascript_textbox_clear(WebDriver driver, WebElement e1)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].value = '';", e1);
    	
    }

	public static void javascript_scroll_up(WebDriver driver)
	{ 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,-1000)");
		
	}
	public static void screenshot(WebDriver driver, String path) throws IOException

    {

                    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                    FileHandler.copy(src, new File(path));
   }   
	
	public static void screenshot1(WebDriver driver, String path) throws IOException

    {

                    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                    FileHandler.copy(src, new File(path));
   }  
	
	
	
	public static void select_ContentType(WebDriver driver,String type1)
	{
		
    	
		  
    	if(type1.equalsIgnoreCase("Prize"))
    	{
    	      WebElement prize= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Prize')]"));
    	      TestUtil.javascript_button_click(driver, prize);
    	      
    	}
    	
    	else if(type1.equalsIgnoreCase("Offer"))
       {
    		 WebElement offer= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Offer')]"));
    		 TestUtil.javascript_button_click(driver, offer);
	   }
       else  if(type1.equalsIgnoreCase("Message"))
       {
    		 WebElement message= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Message')]"));
    		 TestUtil.javascript_button_click(driver, message);
	                 
	   }
	
    }
	
	public static void select_Redemption_Method(WebDriver driver,String method)
	
	{
		if(method.equalsIgnoreCase("Online"))
    	{
    	      WebElement Online= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"));
    	      TestUtil.javascript_button_click(driver, Online);
    	      
    	}
		else if(method.equalsIgnoreCase("In Store"))
		{
			  WebElement Instore= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]"));
  	          TestUtil.javascript_button_click(driver, Instore);	
		}
		else if(method.equalsIgnoreCase("Online & In Store"))
		{
			  WebElement OnlineAndInstore= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]"));
	          TestUtil.javascript_button_click(driver, OnlineAndInstore);
		}
	}
	
	
public static void select_Barcode_Format(WebDriver driver,String barcode)
	
	{
		if(barcode.equalsIgnoreCase("AZTEC"))
    	{
    	      WebElement AZTEC= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'AZTEC')]"));
    	      TestUtil.javascript_button_click(driver, AZTEC);
    	      
    	}
		else if(barcode.equalsIgnoreCase("CODE 39"))
		{
			  WebElement CODE39= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'CODE 39')]"));
  	          TestUtil.javascript_button_click(driver, CODE39);	
		}
		else if(barcode.equalsIgnoreCase("Code 128"))
		{
			  WebElement CODE128= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'CODE 128')]"));
	          TestUtil.javascript_button_click(driver, CODE128);
		}
		else if(barcode.equalsIgnoreCase("DATA MATRIX"))
		{
			  WebElement Data= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'DATA MATRIX')]"));
  	          TestUtil.javascript_button_click(driver, Data);	
		}
		else if(barcode.equalsIgnoreCase("EAN 8"))
		{
			  WebElement EAN8= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'EAN 8')]"));
	          TestUtil.javascript_button_click(driver, EAN8);
		}
		else if(barcode.equalsIgnoreCase("EAN 13"))
		{
			  WebElement EAN13= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'EAN 13')]"));
  	          TestUtil.javascript_button_click(driver, EAN13);	
		}
		else if(barcode.equalsIgnoreCase("PDF 417"))
		{
			  WebElement PDF417= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'PDF 417')]"));
	          TestUtil.javascript_button_click(driver, PDF417);
		}
		else if(barcode.equalsIgnoreCase("QR CODE"))
		{
			  WebElement QR= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'QR CODE')]"));
  	          TestUtil.javascript_button_click(driver, QR);	
		}
		else if(barcode.equalsIgnoreCase("ITF 14"))
		{
			  WebElement ITF= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'ITF 14')]"));
	          TestUtil.javascript_button_click(driver, ITF);
		}
		else if(barcode.equalsIgnoreCase("UPC E"))
		{
			  WebElement UPC= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'UPC E')]"));
  	          TestUtil.javascript_button_click(driver, UPC);	
		}
		else if(barcode.equalsIgnoreCase("Other"))
		{
			  WebElement Other= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Other')]"));
	          TestUtil.javascript_button_click(driver, Other);
		}
	}

public static void select_trigger_type(WebDriver driver,String type)
{
	if(type.equalsIgnoreCase("Audio Fingerprint"))
	{
	WebElement e=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Audio Fingerprint')]"));
	TestUtil.javascript_button_click(driver, e);
	}
	else if(type.equalsIgnoreCase("Audio Watermark"))
	{
		WebElement e=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Audio Watermark')]"));
		TestUtil.javascript_button_click(driver, e);
		
	}
	else if(type.equalsIgnoreCase("Beacon"))
	{
		WebElement e=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Beacon')]"));
		TestUtil.javascript_button_click(driver, e);
	}
	else if(type.equalsIgnoreCase("Geofence"))
	{
		WebElement e=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Geofence')]"));
		TestUtil.javascript_button_click(driver, e);
	}
	else if(type.equalsIgnoreCase("Touch"))
	{
		WebElement e=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Touch')]"));
		TestUtil.javascript_button_click(driver, e);
	}
		
}



public static void select_client(WebDriver driver,String client)
{
	if(client.equalsIgnoreCase("ACTV8"))
	{
	WebElement ACTV8=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"));
	TestUtil.javascript_button_click(driver, ACTV8);
	}
}
}