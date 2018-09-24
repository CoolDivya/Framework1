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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;
import com.test.qa.util.TestUtil;

public class Create_ContentPage extends BaseTest{
	WebDriver driver;
	public Create_ContentPage(WebDriver driver) throws IOException {
		this.driver=driver;
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[3]/mat-list-item[1]/div[1]/div[3]")
    WebElement content;
	
	
	@FindBy(xpath="//a[@type='button']")
    WebElement Add_Content;

	@FindBy(xpath="//mat-form-field/div/div/div")
	WebElement Select_Type;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="brand")
	WebElement brand;
	
	@FindBy(name="display_name")
	WebElement Offer_title;
	
	@FindBy(name="description")
	WebElement description;
	
	@FindBy(name="quantity")
	WebElement quantity;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-content[1]/app-content-creator[1]/div[1]/div[2]/div[1]/div[1]/div[3]/app-content-redemption-creator[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]")
	WebElement redemption;
	
	@FindBy(xpath="//div[2]/mat-form-field/div/div/div/mat-select/div/div/span")
	WebElement redemption_code_options;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains(text(),'Manual')]")
	WebElement manual;
	
	@FindBy(xpath="//div[3]/mat-form-field/div/div/div/mat-select/div/div/span")
	WebElement Barcode;
	
	@FindBy(xpath="//input[@name='redemption_code']")
	WebElement redemption_code;
	
	@FindBy(xpath="//input[@name='redemption_url']")
	WebElement redemption_URL; 
	
	@FindBy(xpath="//div[@class='offer-scratcher-hero-image-container ng-star-inserted']//div[@class='ng-star-inserted'][contains(text(),'Select Image')]")
	WebElement  select_image;
	
	@FindBy(xpath="//div[@class='offer-scratcher-hero-image-container']//div[@class='ng-star-inserted'][contains(text(),'Select Image')]")
	WebElement select_msg_image;
	
	@FindBy(xpath="//div[@class='in-body-container']//div[@class='ng-star-inserted'][contains(text(),'Select Image')]")
	WebElement select_msg_image2;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-uploader-dialog[1]/div[1]/div[1]/form[1]/label[1]/div[1]/div[1]")
	WebElement select_upload_image;
	
	@FindBy(xpath="//div[@class='btn-row']//button[2]")
    WebElement upload;	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement create_content;
	
	@FindBy(xpath="//input[@class='search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-valid']")
	WebElement search;
	

	 
	 public CreateTouchTriggerPage Create_Content() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		
		
		FileInputStream fs=new FileInputStream(prop.getProperty("createcontent"));
	     Workbook w= WorkbookFactory.create(fs);
	    			
	     Sheet sh=w.getSheet("CreateOfferContent");
	    			
	     for(int i=1;i<=sh.getLastRowNum();i++)
	    	{
	    		
	             Row row=sh.getRow(i);
	             
	            if (row != null) {
				
                //	 for(int j=0;j<=row.getLastCellNum();j++)
                	// {
	            	
	            	Thread.sleep(3000);
	        		content.click();
	        		
	        		   
	        		TestUtil.javascript_button_click(driver, Add_Content);
	        	    Thread.sleep(3000);
	        	    
	        	    Select_Type.click();
				          Cell cell = row.getCell(0);
				
				                if (cell != null) {
				                	
				                	
			                        String type1= cell.getStringCellValue();
		                            TestUtil.select_ContentType(driver, type1);
	    
		                            if(type1.equalsIgnoreCase("Offer"))
	    	                        {
		    	                        name.sendKeys(row.getCell(1).getStringCellValue());
		    	                        String str_name= name.getText();
	    		                        brand.sendKeys(row.getCell(2).getStringCellValue());
	    		                        Offer_title.sendKeys(row.getCell(3).getStringCellValue());
	    		                        description.sendKeys(row.getCell(4).getStringCellValue());
	    		                        String i1=row.getCell(5).toString();
				                        String qua=i1.replaceAll(".0","");
	    	                            quantity.sendKeys(qua);
	    		                        Thread.sleep(3000);
	    		                        redemption.click();
	    		                        Thread.sleep(3000);
	    		                        String method=row.getCell(6).getStringCellValue();
	    		                        System.out.print(method);
	    		                        TestUtil.select_Redemption_Method(driver, method);
	    		                        Thread.sleep(3000);
		                            	
	    		                        redemption_code_options.click();
	    		                        Thread.sleep(3000);
	    		                        TestUtil.javascript_button_click(driver, manual);
	    		                        Barcode.click();
	    		                        
	    		                        String barcode=row.getCell(7).getStringCellValue();
	    		                        TestUtil.select_Barcode_Format(driver,barcode);
	    		                     
	    		                       // String i2=row.getCell(8).toString();
	    		            	     //   String redm_code=i2.replaceAll(".0","");
	    		                        redemption_code.sendKeys("1234567891231");
	    		                        
	    		                        if(method.equalsIgnoreCase("Online") || method.equalsIgnoreCase("Online & In Store"))
	    		                        {
	    		                        	redemption_URL.sendKeys(row.getCell(8).getStringCellValue());
	    		                        }
	    		                        
	    		                        TestUtil.javascript_scroll_up(driver);
	    		                        
		                            	//upload saved in wallet image
		                            	select_image.click();
	    		                        Thread.sleep(3000);
	    		                        select_upload_image.click();
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        Thread.sleep(3000);
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    		                        driver.findElement(By.xpath("//div[@class='wallet-image-container ng-star-inserted']//div[@class='uploader-text ng-star-inserted']")).click();
	    		                        Thread.sleep(3000);
	    		                        select_upload_image.click();
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    	                       
	    		                        create_content.click();
	    		                        Thread.sleep(2000);
	    		                        
	    		                        //Take Screenshot of created content in search
	    		                        driver.navigate().refresh();
	    		                        Thread.sleep(3000);
	    		                 	    content.click();
	    		                        Thread.sleep(3000);
	    		                        search.sendKeys(str_name);
	    		                        Thread.sleep(3000);
	    		                        TestUtil.screenshot(driver, prop.getProperty("created_Content_search"));
	    		                        Thread.sleep(3000);
	    	                        
	    	                        }
				 
			                       else if(type1.equalsIgnoreCase("Prize"))
			    	               {
			                    	    name.sendKeys(row.getCell(1).getStringCellValue());
		    	                        String str_name= name.getText();
	    		                        brand.sendKeys(row.getCell(2).getStringCellValue());
	    		                        Offer_title.sendKeys(row.getCell(3).getStringCellValue());
	    		                        description.sendKeys(row.getCell(4).getStringCellValue());
	    		                        String i1=row.getCell(5).toString();
				                        String qua=i1.replaceAll(".0","");
	    	                            quantity.sendKeys(qua);
	    		                        Thread.sleep(3000);
	    		                        redemption.click();
	    		                        Thread.sleep(3000);
	    		                        String method=row.getCell(6).getStringCellValue();
	    		                        System.out.print(method);
	    		                        TestUtil.select_Redemption_Method(driver, method);
	    		                        Thread.sleep(3000);
		                            	
	    		                        redemption_code_options.click();
	    		                        Thread.sleep(3000);
	    		                        TestUtil.javascript_button_click(driver, manual);
	    		                        Barcode.click();
	    		                        
	    		                        String barcode=row.getCell(7).getStringCellValue();
	    		                        TestUtil.select_Barcode_Format(driver,barcode);
	    		                     
	    		                       // String i2=row.getCell(8).toString();
	    		            	     //   String redm_code=i2.replaceAll(".0","");
	    		                        redemption_code.sendKeys("1234567891231");
	    		                        
	    		                        if(method.equalsIgnoreCase("Online") || method.equalsIgnoreCase("Online & In Store"))
	    		                        {
	    		                        	redemption_URL.sendKeys(row.getCell(8).getStringCellValue());
	    		                        }
	    		                        
	    		                        TestUtil.javascript_scroll_up(driver);
	    		                        
		                            	//upload saved in wallet image
		                            	select_image.click();
	    		                        Thread.sleep(3000);
	    		                        select_upload_image.click();
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        Thread.sleep(3000);
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    		                        driver.findElement(By.xpath("//div[@class='wallet-image-container ng-star-inserted']//div[@class='uploader-text ng-star-inserted']")).click();
	    		                        Thread.sleep(3000);
	    		                        select_upload_image.click();
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    	                       
	    		                        create_content.click();
	    		                        Thread.sleep(2000);
	    		                        
	    		                        //Take Screenshot of created content in search
	    		                        driver.navigate().refresh();
	    		                        Thread.sleep(3000);
	    		                 	    content.click();
	    		                        Thread.sleep(3000);
	    		                        search.sendKeys(str_name);
	    		                        Thread.sleep(3000);
	    		                        TestUtil.screenshot(driver, prop.getProperty("created_Content_search"));
	    		                        Thread.sleep(3000);
			    	               }
			 
			                       else if(type1.equalsIgnoreCase("Message"))
	    	                       {
			                    	    name.sendKeys(row.getCell(1).getStringCellValue());
	    		                        brand.sendKeys(row.getCell(2).getStringCellValue());
	    		                        Offer_title.sendKeys(row.getCell(3).getStringCellValue());
	    		                        
                                        TestUtil.javascript_scroll_up(driver);
	    		                        
		                            	//upload saved in wallet image
                                        select_msg_image.click();
	    		                        Thread.sleep(3000);
	    		                        select_upload_image.click();
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        Thread.sleep(3000);
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    		                        select_msg_image2.click();
	    		                        Thread.sleep(3000);
	    		                        Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
	    		                        Thread.sleep(3000);
	    		                        upload.click();
	    		                        Thread.sleep(6000);
	    		                        
	    		                        create_content.click();
	    		                        Thread.sleep(2000);
	    		                        
	    		                        //Take Screenshot of created content in search
	    		                        driver.navigate().refresh();
	    		                        Thread.sleep(3000);
	    		                 	    content.click();
	    		                        Thread.sleep(3000);
	    		                       // search.sendKeys(str_name);
	    		                        Thread.sleep(3000);
	    		                        TestUtil.screenshot(driver, prop.getProperty("created_Content_search"));
	    		                        Thread.sleep(3000);
	    		                          
	    	                       }
			                     }
                           }
	                  //  }
                 
	              }
		return new CreateTouchTriggerPage(driver);
	 }
	    	 
	    	 
	 
	 
	 
}
