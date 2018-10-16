package com.test.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;
import com.test.qa.util.TestUtil;

public class AddUser extends BaseTest {
	
	WebDriver driver;
	public AddUser(WebDriver driver) throws IOException {
		this.driver=driver;
		// TODO Auto-generated constructor stub
		
		 PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[8]/mat-list-item[1]/div[1]/div[3]")
	WebElement settings;
	
	@FindBy(xpath="//div[1]/mat-grid-tile[1]/figure[1]/mat-card[1]")
	WebElement userlist;
	
	@FindBy(xpath="//div[1]/app-settings[1]/app-users[1]/app-users-overview[1]/div[1]/div[2]/button[1]")
	WebElement adduser;

	@FindBy(name="first_name")
	WebElement first_name;
	
	@FindBy(name="last_name")
	WebElement last_name;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement client;
	
	@FindBy(xpath="//div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement application;
	
	@FindBy(xpath="//div[5]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement role;
	
	@FindBy(xpath="//div[1]/mat-option")
	List<WebElement> list;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement createuser;	
	
	public void adduser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fs=new FileInputStream(prop.getProperty("adduser"));
	    Workbook w= WorkbookFactory.create(fs);
	    
	   
		Sheet sh=w.getSheet("adduser");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
				Row row=sh.getRow(i);
			
				 if (row != null) {
		settings.click();
		Thread.sleep(2000);
		userlist.click();
		Thread.sleep(2000);
		adduser.click();
		Thread.sleep(2000);
		first_name.sendKeys(row.getCell(0).getStringCellValue());
		last_name.sendKeys(row.getCell(1).getStringCellValue());
		email.sendKeys(row.getCell(2).getStringCellValue());
		password.sendKeys(row.getCell(3).getStringCellValue());
		client.click();
		Thread.sleep(3000);
        for(int index=0;index<list.size();index++)
     	  {
        	String str=row.getCell(4).getStringCellValue();
     	     if(str.equals(list.get(index).getText()))
     	     {
     		    TestUtil.javascript_button_click(driver,list.get(index));
     	     }
     	  }
        application.click();
        Thread.sleep(3000);
        for(int index=0;index<list.size();index++)
   	  {
      	String str=row.getCell(5).getStringCellValue();
   	     if(str.equals(list.get(index).getText()))
   	     {
   		    TestUtil.javascript_button_click(driver,list.get(index));
   	     }
   	  }
        role.click();
        Thread.sleep(3000);
        for(int index=0;index<list.size();index++)
   	  {
      	String str=row.getCell(5).getStringCellValue();
   	     if(str.equals(list.get(index).getText()))
   	     {
   		    TestUtil.javascript_button_click(driver,list.get(index));
   	     }
   	  }
      createuser.click();
				 }
		}
		
	}
}
