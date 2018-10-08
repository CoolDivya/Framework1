package com.test.qa.pages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;
import com.test.qa.util.TestUtil;

public class ContentAdvancedSearchPage extends BaseTest {

	WebDriver driver;
	public ContentAdvancedSearchPage(WebDriver driver) throws IOException {
		this.driver=driver;
		// TODO Auto-generated constructor stub
		
		 PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[3]/mat-list-item[1]/div[1]/div[3]")
    WebElement content;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']//button[@type='button']")
    WebElement advanced_search;
	
	@FindBy(name="contentId")
	WebElement contentid;
	
	@FindBy(name="byName")
	WebElement name;
	
	@FindBy(name="byBrand")
	WebElement brand;
	
	
	@FindBy(name="selectedByType")
    WebElement type;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	
	@FindBy(name="start_at")
	WebElement start;
	
	@FindBy(name="end_at")
	WebElement end;
	
	
	@FindBy(name="created_from")
	WebElement created_from;
	
	@FindBy(name="created_to")
	WebElement created_to;
	
	@FindBy(xpath="//div[@class='target-confirm']//button[@type='button']")
	WebElement clear;
	
	@FindBy(name="updated_from")
	WebElement updated_from;
	
	@FindBy(name="updated_to")
	WebElement updated_to;
	
	public void Open_Content_page() throws InterruptedException
	{
		Thread.sleep(3000);
		content.click();
	}

	
	
	 public void click_on_the_Advanced_Search_button() throws InterruptedException{
		   
		    TestUtil.javascript_button_click(driver, advanced_search);
	    	Thread.sleep(3000);
	    	TestUtil.javascript_button_click(driver, clear);
	      	Thread.sleep(3000);
		}


  public void enter_contentId_and_click_on_search() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {
		FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
   	     Workbook w= WorkbookFactory.create(fs);
   	     
   	     Sheet sh=w.getSheet("AdvSearch_Contentid");
		
		 for(int i=1;i<=sh.getLastRowNum();i++)
	     {
			Row row=sh.getRow(i);
			
			if (row != null) {
			
			Cell cell = row.getCell(0);
			
			 if (cell != null) {
			 
			String i1=cell.toString();
			String contactID=i1.replaceAll(".0","");
			contentid.sendKeys(contactID);
			Thread.sleep(3000);
		    search.click();
		   	Thread.sleep(3000);
		   	
		   	TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_ContentId"));
		   	Thread.sleep(3000);
		   	
            TestUtil.javascript_button_click(driver, advanced_search);
      	    Thread.sleep(3000);
      	    
      	    TestUtil.javascript_button_click(driver, clear);
		    Thread.sleep(3000);
			 }
		}
    
		
}

}
	   
	 public void enter_name_and_click_on_search() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	    {
		    FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	   	    Workbook w= WorkbookFactory.create(fs);
	   	     
	   	    Sheet sh=w.getSheet("AdvSearch_Contentid");
	   	    for(int i=1;i<=sh.getLastRowNum();i++)
 		    {
 			    Row row=sh.getRow(i);
 			   
 			    if (row != null) {
 				
 				Cell cell = row.getCell(1);
 				
 				 if (cell != null) {
 				 
 				String Name=cell.toString();
 				name.sendKeys(Name);
 				Thread.sleep(3000);
 				search.click();
 			    Thread.sleep(3000);
 			   	
 			    TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Name"));
 			   	Thread.sleep(3000);
 			   	
 			    TestUtil.javascript_button_click(driver, advanced_search);
 	      	    Thread.sleep(3000);
 		    	
 		    	TestUtil.javascript_button_click(driver, clear);
		    	Thread.sleep(3000);
 		    	}
 		    	}
 		}
	   	    
	   	    
 	 }


	 public void enter_brand_and_click_on_search() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
		
		    FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	    	Workbook w= WorkbookFactory.create(fs);
	    			
	    	Sheet sh=w.getSheet("AdvSearch_Contentid");
	    	
	    	for(int i=1;i<=sh.getLastRowNum();i++)
	    		{
	    				Row row=sh.getRow(i);
	    				
	    				 if (row != null) {
	    	    				
	    	    				Cell cell = row.getCell(2);
	    	    				
	    	    				 if (cell != null) {
	    				String Brand=cell.toString();
	    				brand.sendKeys(Brand);
	    				Thread.sleep(3000);
	    				search.click();
	    			   	Thread.sleep(3000);
	    			   	
	    			   	TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Brand"));
	     			   	Thread.sleep(3000);
	     			  
	    				TestUtil.javascript_button_click(driver, advanced_search);
	    		      	Thread.sleep(3000);
	    		      	
	    		      	TestUtil.javascript_button_click(driver, clear);
		    		    Thread.sleep(3000);
	    		    	
	    	    				 }
	    				 }
	    			}
	    
		}

		 
		 public void select_type_and_click_on_search() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
				
			
			    TestUtil.javascript_button_click(driver, type);
				
		    	List<WebElement> e1= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		    	
		    	System.out.println(e1.get(0).getText());
		    	
		    	FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
		    	Workbook w= WorkbookFactory.create(fs);
		    			
		    	Sheet sh=w.getSheet("AdvSearch_Contentid");
		    			
		    	Row row=sh.getRow(1);
		    	
		    	 if (row != null) {
	 				
	 				Cell cell = row.getCell(3);
	 				
	 				 if (cell != null) {
	 					 
	 				 
		    	String type1= cell.getStringCellValue();
		    	
	 				  
		    	if(type1.equalsIgnoreCase("Prize"))
		    	{
		    	      WebElement prize= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Prize')]"));
		    	      TestUtil.javascript_button_click(driver, prize);
		    	      search.click(); 
		    	      Thread.sleep(3000);
		    	      TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Type"));
	     			  Thread.sleep(3000);
		    	      
		    	     
		    	}
		    	
		    	else if(type1.equalsIgnoreCase("Offer"))
		       {
		    		 WebElement offer= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Offer')]"));
		    		 TestUtil.javascript_button_click(driver, offer);
	    	         search.click();
	    	         Thread.sleep(3000);
		    	     TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Type"));
	     			 Thread.sleep(3000);
	    	         
		        }
		    	else  if(type1.equalsIgnoreCase("Message"))
		        {
		    		 WebElement message= driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),'Message')]"));
		    		 TestUtil.javascript_button_click(driver, message);
	    	         search.click();
	    	         Thread.sleep(3000);
		    	     TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Type"));
	     			 Thread.sleep(3000);
	    	         
		        }
		    	 
	 				 }
		    	 }

	   	     
		 }
		 
		 
		 
		 public void select_start_date() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
	          
			
			FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	    	Workbook w= WorkbookFactory.create(fs);
	    			
	    			Sheet sh=w.getSheet("AdvSearch_Contentid");
	    		
	    			for(int i=1;i<=sh.getLastRowNum();i++)
	    		{
	    				Row row=sh.getRow(i);
	    				 if (row != null) {
	    	    				
	    	    				Cell cell = row.getCell(4);
	    	    				
	    	    				 if (cell != null) {
	    					String start_date=cell.toString();
	    					start.sendKeys(start_date);
	    					Thread.sleep(3000);
	    			    	search.click();
	    			    	Thread.sleep(3000);
	    			    	
	    		    	    TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_Start"));
	    	     			Thread.sleep(3000);
	    	     			
		    				TestUtil.javascript_button_click(driver, advanced_search);
		    		      	Thread.sleep(3000);
		    		      	
		    		      	TestUtil.javascript_button_click(driver, clear);
		    		      	Thread.sleep(3000);
	    	    				 }
	    				 }
	             }
			
	          
		 }
		 
		 public void select_end_date() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
	          
		
			FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	    	Workbook w= WorkbookFactory.create(fs);
	    			
	    			Sheet sh=w.getSheet("AdvSearch_Contentid");
	    			
	    		  
	    			for(int i=1;i<=sh.getLastRowNum();i++)
	    		{
	    				Row row=sh.getRow(i);
	    			
	   				 if (row != null) {
	   	    				
	   	    				Cell cell = row.getCell(5);
	   	    				
	   	    				if (cell != null) {
	    					String end_date=cell.toString();
	    					end.sendKeys(end_date);
	    					Thread.sleep(3000);
	    			    	search.click();
	    			    	Thread.sleep(3000);
	    			    	
	    			    	TestUtil.screenshot(driver, prop.getProperty("AdvacedSearch_End"));
	    	     			Thread.sleep(3000);
	    	     			
		    				TestUtil.javascript_button_click(driver, advanced_search);
		    		      	Thread.sleep(3000);
		    		      	
		    		      	TestUtil.javascript_button_click(driver, clear);
		    		      	Thread.sleep(3000);
	   	    				 }
	   				 }
	             }
			
	          
		 }
		
		 public void created_date() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
	          
		
			FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	    	Workbook w= WorkbookFactory.create(fs);
	    			
	    			Sheet sh=w.getSheet("AdvSearch_Contentid");
	    			
	    		  
	    			for(int i=1;i<=sh.getLastRowNum();i++)
	    		{
	    				Row row=sh.getRow(i);
	    			
	   				 if (row != null) {
	   	    				
	   	    				Cell cell1 = row.getCell(6);
	   	    				Cell cell2 = row.getCell(7);
	   	    				
	   	    				 if ((cell1 != null) && (cell2 != null) ) {
	    					String from_date=cell1.toString();
	    					String to_date=cell2.toString();
	    					 
	    				    created_from.sendKeys(from_date);
	    				   	Thread.sleep(3000);
	    				    created_to.sendKeys(to_date);
	    				   	Thread.sleep(3000);
	    			    	search.click();
	    			    	Thread.sleep(3000);
	    			    	
	    			    	TestUtil.screenshot(driver, prop.getProperty("created_date"));
	    	     			Thread.sleep(3000);
	    	     			
		    				 
		    				TestUtil.javascript_button_click(driver, advanced_search);
		    		      	Thread.sleep(3000);
		    		      	TestUtil.javascript_button_click(driver, clear);
		    		      	Thread.sleep(3000);
	   	    				 }
	   				 }
	             }
			
	          
		 }
		 
		 
		 public Create_StoryCardsPage updated_date() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
	          
		
		    FileInputStream fs=new FileInputStream(prop.getProperty("contentAdvancedSearch"));
	    	Workbook w= WorkbookFactory.create(fs);
	    			
	    			Sheet sh=w.getSheet("AdvSearch_Contentid");
	    			
	    		  
	    			for(int i=1;i<=sh.getLastRowNum();i++)
	    		{
	    				Row row=sh.getRow(i);
	    			
	   				 if (row != null) {
	   	    				
	   	    				Cell cell1 = row.getCell(8);
	   	    				Cell cell2 = row.getCell(9);
	   	    				
	   	    				 if ((cell1 != null) && (cell2 != null) ) {
	    					String from_date1=cell1.toString();
	    					String to_date2=cell2.toString();
	    					 
	    					updated_from.sendKeys(from_date1);
	    				   	Thread.sleep(3000);
	    				   	updated_to.sendKeys(to_date2);
	    				   	Thread.sleep(3000);
	    			    	search.click();
	    			    	Thread.sleep(3000);
	    			    	
	    			    	TestUtil.screenshot(driver, prop.getProperty("updated_date"));
	    	     			Thread.sleep(3000);
	    	     			
		    				 
		    				TestUtil.javascript_button_click(driver, advanced_search);
		    		      	Thread.sleep(3000);
		    		      	TestUtil.javascript_button_click(driver, clear);
		    		      	Thread.sleep(3000);
	   	    				 }
	   				 }
	             }
					return new Create_StoryCardsPage(driver);
			
	          
		 }
	

}
