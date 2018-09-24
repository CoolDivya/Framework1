package com.test.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;
import com.test.qa.util.TestUtil;

public class SearchTriggerPage extends BaseTest{

	WebDriver driver;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[6]/mat-list-item[1]/div[1]/div[3]")
	WebElement Trigger;
	
	@FindBy(xpath="//input[@class='search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	WebElement search_trigger;
	
	@FindBy(xpath="//mat-select[@name='type']//div[@class='mat-select-arrow']")
	WebElement type;
	
	@FindBy(xpath="//span[@class='mat-option-text']")
	List<WebElement> list; 
	
	@FindBy(xpath="//mat-select[@name='client']//div[@class='mat-select-arrow']")
	WebElement client;
	
	public SearchTriggerPage(WebDriver driver) throws IOException {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void search_trigger() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		
		FileInputStream fs=new FileInputStream(prop.getProperty("searchTrigger"));
	    Workbook w= WorkbookFactory.create(fs);
	    
	    Sheet sh=w.getSheet("searchTrigger");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
		    Row row=sh.getRow(i);
			
			if (row != null) {
					 
		                        Thread.sleep(3000);
		                        Trigger.click();
		                        Thread.sleep(2000);
		                        
		                        //Search trigger by Name
		                        if(row.getCell(0)!=null)          
		                        {
		                        search_trigger.clear();
		                        Thread.sleep(2000);
		                        search_trigger.sendKeys(row.getCell(0).getStringCellValue());
		                        Thread.sleep(2000);
		
                                String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByName";
                                String lpath1=".jpeg";
                                String actualpath=fpath1+i+lpath1;
                                TestUtil.screenshot1(driver,actualpath);
                                Thread.sleep(2000);
		                        }
		                        
		                        //Search trigger by Type
		                        if(row.getCell(1)!=null)
		                        {
		                        search_trigger.clear();	
		                        Thread.sleep(2000);
		                        type.click();
		                        for(int j=0;j<list.size();j++)
		                        {
			                            String str=row.getCell(1).getStringCellValue();
			                            if(str.equals(list.get(j).getText()))
			                            {
				                                list.get(j).click();
			                            }
			                     }
		                        Thread.sleep(2000);
		                        String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByType";
                                String lpath1=".jpeg";
                                String actualpath=fpath1+i+lpath1;
                                TestUtil.screenshot1(driver,actualpath);
                                Thread.sleep(2000);
		                        }
		                        
		
		                        //Search trigger by Client
		                        if(row.getCell(2)!=null)
		                        {
		                        driver.navigate().refresh();
		                        Thread.sleep(2000);
		                        client.click();
		                        for(int k=0;k<list.size();k++)
		                        {
			                            String str=row.getCell(2).getStringCellValue();
			                            if(str.equals(list.get(k).getText()))
			                            {
				                                list.get(k).click();
			                            }
			                        }
		                        Thread.sleep(2000);
		                        String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByClient";
                                String lpath1=".jpeg";
                                String actualpath=fpath1+i+lpath1;
                                TestUtil.screenshot1(driver,actualpath);
                                Thread.sleep(2000);
		                        }
		                        
		                        if((row.getCell(0)!=null) && (row.getCell(1)!=null))
		                        {
		                        	driver.navigate().refresh();
		                        	Thread.sleep(2000);
			                        search_trigger.sendKeys(row.getCell(0).getStringCellValue());
			                        Thread.sleep(1000);
			                        type.click();
			                        for(int j=0;j<list.size();j++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(j).getText()))
				                            {
					                                list.get(j).click();
				                            }
				                     }
			                        Thread.sleep(2000);
			
	                                String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByNameType";
	                                String lpath1=".jpeg";
	                                String actualpath=fpath1+i+lpath1;
	                                TestUtil.screenshot1(driver,actualpath);
	                                Thread.sleep(2000);
		                        }
		                        
		                        if((row.getCell(0)!=null) && (row.getCell(2)!=null))
		                        {
		                        	driver.navigate().refresh();
		                        	Thread.sleep(2000);
			                        client.click();
			                        Thread.sleep(1000);
			                        for(int k=0;k<list.size();k++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(k).getText()))
				                            {
					                                TestUtil.javascript_button_click(driver, list.get(k));
				                            }
				                     }
			                        Thread.sleep(1000);
			                        search_trigger.sendKeys(row.getCell(0).getStringCellValue());
			                        Thread.sleep(2000);
			                        
	                                String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByNameClient";
	                                String lpath1=".jpeg";
	                                String actualpath=fpath1+i+lpath1;
	                                TestUtil.screenshot1(driver,actualpath);
	                                Thread.sleep(2000);
		                        	
		                        }
		                        
		                        
		                        if((row.getCell(1)!=null) && (row.getCell(2)!=null))
		                        {
		                        	driver.navigate().refresh();
		                        	Thread.sleep(2000);
		                        	client.click();
			                        for(int l=0;l<list.size();l++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(l).getText()))
				                            {
					                                list.get(l).click();
				                            }
				                     }
			                        Thread.sleep(2000);
			                        type.click();
			                        for(int m=0;m<list.size();m++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(m).getText()))
				                            {
					                                list.get(m).click();
				                            }
				                     }
			                        Thread.sleep(2000);

	                                String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByTypeClient";
	                                String lpath1=".jpeg";
	                                String actualpath=fpath1+i+lpath1;
	                                TestUtil.screenshot1(driver,actualpath);
	                                Thread.sleep(2000);
			                        
		                        	
		                        }
		                        
		                        
		                        if((row.getCell(0)!=null) && (row.getCell(1)!=null) && (row.getCell(2)!=null))
		                        {
		                        	driver.navigate().refresh();
		                        	Thread.sleep(2000);
			                        search_trigger.sendKeys(row.getCell(0).getStringCellValue());
			                        Thread.sleep(1000);
			                    	client.click();
			                        for(int l=0;l<list.size();l++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(l).getText()))
				                            {
					                                list.get(l).click();
				                            }
				                     }
			                        Thread.sleep(2000);
			                        type.click();
			                        for(int m=0;m<list.size();m++)
			                        {
				                            String str=row.getCell(1).getStringCellValue();
				                            if(str.equals(list.get(m).getText()))
				                            {
					                                list.get(m).click();
				                            }
				                     }
			                        Thread.sleep(2000);

	                                String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\searchTrigger\\searchTiggerByNameTypeClient";
	                                String lpath1=".jpeg";
	                                String actualpath=fpath1+i+lpath1;
	                                TestUtil.screenshot1(driver,actualpath);
	                                Thread.sleep(2000);
		                        }
		}
				 
	}
	}

}