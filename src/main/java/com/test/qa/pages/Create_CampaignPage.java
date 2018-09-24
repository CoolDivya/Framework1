package com.test.qa.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
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

public class Create_CampaignPage extends BaseTest {
 
	WebDriver driver;
	
	public Create_CampaignPage(WebDriver driver) throws IOException {
		this.driver=driver;
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/mat-nav-list/a[2]/mat-list-item/div")
	WebElement campaign;
	
	@FindBy(xpath="//a[@class='common-form-submit mat-raised-button']")
	WebElement create_campaign;
	
	@FindBy(name="name")
	WebElement name;
	
    @FindBy(name="description")
	WebElement description;
    
    @FindBy(xpath="//span[contains(text(),'Create')]")
    WebElement create;
	
    @FindBy(xpath="//input[@class='search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
    WebElement search;
    
	public void Open_Campaign_page() throws InterruptedException
	{
		Thread.sleep(3000);
		campaign.click();
	}
	
	 public Create_ContentPage CreateCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fs=new FileInputStream(prop.getProperty("CreateCampaign"));
	    	Workbook w= WorkbookFactory.create(fs);
	    	
	    	Sheet sh=w.getSheet("createcampaign");
			
  		  // Create Campaign
			for(int i=1;i<=sh.getLastRowNum();i++)
		{
				Row row=sh.getRow(i);
			
				 if (row != null) {
	    				
	    				Cell cell1 = row.getCell(0);
	    				Cell cell2 = row.getCell(1);
	    				
	    				 if ((cell1 != null) && (cell2 != null) ) {
	    		
	    			TestUtil.javascript_button_click(driver, create_campaign);
	    			Thread.sleep(3000);			 
	    				 
					String Name=cell1.toString();
					String Desciption=cell2.toString();
					 
					name.sendKeys(Name);
					String str_name=name.getText();
					System.out.print(str_name);
				   	Thread.sleep(3000);
				   	description.sendKeys(Desciption);
				   	Thread.sleep(3000);
				   	create.click();
			    	Thread.sleep(3000);
			    	Open_Campaign_page();
			    	Thread.sleep(3000);
			  	
			    	//Search created campaign
			    	search.sendKeys(str_name);
			    	Thread.sleep(3000);
			    	
			    	//Take screenshot for created campaign
			    	TestUtil.screenshot(driver, prop.getProperty("created_campaign_search"));
			    	Thread.sleep(3000);
			    	
	    				 }
				}
	    	
		}
			return new Create_ContentPage(driver);
			
		
	}
	 
	
	 
	
	
}
