package com.test.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class CreateAudioFingerprintTriggerPage extends BaseTest {

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[6]/mat-list-item[1]/div[1]/div[3]")
	WebElement Trigger;
	
	@FindBy(xpath="//a[@type='button']")
    WebElement Add_Trigger;
	
	@FindBy(xpath="//mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/div[1]/a[1]/mat-list-item[1]/div[1]")
	WebElement Audio;
	
	@FindBy(xpath="//div[@fxlayoutalign='end start']//button[2]")
	WebElement Add_Audio_Fingerprint;
	
	@FindBy(xpath="//mat-select[1]/div[1]/div[1]/span[1]")
	WebElement Select_Type;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(xpath="//div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement client;
	
	@FindBy(xpath="//div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	List<WebElement> list_client;
	
	@FindBy(name="campaign")
	WebElement campaign;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/mat-option")
	List<WebElement> list_campaign;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option")
	List<WebElement> list_media_type;
	
	@FindBy(xpath="//input[@name='mediaSource']")
	WebElement media;
	
	@FindBy(xpath="//input[@name='network']")
	WebElement network;
	
	@FindBy(xpath="//div[contains(text(),'Delivery Preset Options')]")
    WebElement Delivery_Preset_Options;
	
	@FindBy(xpath="//div[contains(text(),'Fingerprint Options')]")
	WebElement Fingerprint_Options;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option")
	List<WebElement> list_PresetOptions;
	
	@FindBy(xpath="//input[@name='preset_name']")
	WebElement PresetName;
	 
	@FindBy(xpath="//app-delivery-preset-creator[1]/form[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement Delivery_Mode;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option")
	List<WebElement> Delivery_Mode_Options;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper'][contains(text(),'Create Delivery Preset')]")
	WebElement Create_Delivery_Preset;
	
	@FindBy(xpath="//div[@class='confirm-modal-actions']//button[2]")
	WebElement confirm_CreatePreset;
	
	@FindBy(xpath="//div[@class='add-content-group-row padding ng-star-inserted']//button[@type='button']")
	WebElement Add_Content_Group;
	
	@FindBy(xpath="//mat-card[1]/form[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement content_group_name;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement create_content_group;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-triggers[1]/app-trigger-creator[1]/app-trigger-creator-form[1]/form[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/app-delivery-preset-options[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-content-group-details[1]/div[1]/app-expandable-panel[1]/mat-toolbar[1]/div[1]/div[1]/div[3]/mat-icon[1]")
	WebElement iconContent;
	
	@FindBy(xpath="//div[@fxflex='100']//button[@name='button']")
	WebElement add_Content;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement search_content;
	
	@FindBy(xpath="//mat-table[1]/mat-row[1]/mat-cell[2]")
	WebElement select_Content;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Attach_Content;
	
	@FindBy(xpath="//input[@name='start_age']")
	WebElement start_age;
	
	@FindBy(xpath="//div[@class='mat-radio-container']")
	List<WebElement> gender;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-target-dialog[1]/form[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement region;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option")
	List<WebElement> region_list;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-target-dialog[1]/form[1]/div[2]/button[1]")
	WebElement Confirm_Target;
	

	//Create Content WebElement
	
	@FindBy(xpath="//app-content-creator[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement Select_Content_Type;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/ng-component[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/app-content-creator[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-content-type-creator[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement nameContent;
	
	@FindBy(name="brand")
	WebElement brand;
	
	@FindBy(name="display_name")
	WebElement Offer_title;
	
	@FindBy(name="description")
	WebElement description;
	
	@FindBy(name="quantity")
	WebElement quantity;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/ng-component[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/app-content-creator[1]/div[1]/div[2]/div[1]/div[1]/div[3]/app-content-redemption-creator[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement redemption;
	
	@FindBy(xpath="//mat-expansion-panel[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span")
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
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[4]/div[1]/mat-dialog-container[1]/app-uploader-dialog[1]/div[1]/div[1]/form[1]/label[1]/div[1]/div[1]")
	WebElement select_upload_image;
	
	@FindBy(xpath="//div[@class='btn-row']//button[2]")
    WebElement upload;	
	
	@FindBy(xpath="//div[@class='wallet-image-container ng-star-inserted']//div[@class='uploader-text ng-star-inserted']")
	WebElement walletImage;
	
	@FindBy(xpath="//div[@class='offer-scratcher-hero-image-container']//div[@class='ng-star-inserted'][contains(text(),'Select Image')]")
	WebElement messageImage1;
	
	@FindBy(xpath="//div[@class='in-body-container']//div[@class='ng-star-inserted'][contains(text(),'Select Image')]")
	WebElement messageImage2;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement create_content;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-triggers[1]/app-trigger-creator[1]/app-trigger-creator-form[1]/form[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-audio-creator[1]/div[1]/div[1]/app-audio-uploader[1]/div[1]/div[1]/div[1]/div[2]/app-s3-file-uploader[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement select_media;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-uploader-dialog[1]/div[1]/div[1]/form[1]/label[1]/div[1]/div[1]")
	WebElement selectmedia1;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-uploader-dialog[1]/div[1]/div[1]/form[1]/label[1]/div[1]/div[1]")
	WebElement upload_media;
	
	@FindBy(xpath="//div[@class='btn-row']//button[2]")
	WebElement uploadm;
	
	@FindBy(xpath="//button[@class='common-form-submit mat-raised-button mat-primary']")
	WebElement create_trigger;
	WebDriver driver;

	public CreateAudioFingerprintTriggerPage(WebDriver driver) throws IOException {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void open_trigger_page() throws InterruptedException
	{
	//	Thread.sleep(3000);
	//	Trigger.click();
		
	}
	
	public CreateTouchTriggerPage create_trigger() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fs=new FileInputStream(prop.getProperty("CreateAudioTrigger"));
	    Workbook w= WorkbookFactory.create(fs);
	    Sheet sh=w.getSheet("CreateAudioTrigger");
	     
	    for(int i=1;i<=sh.getLastRowNum();i++)
	    	{
	    		Row row=sh.getRow(i);
	             
	            if (row != null) {
	            	
	            	Thread.sleep(3000);
	        		Trigger.click();
	        		Thread.sleep(2000);
	        		//Add_Trigger.click();
	        		//Thread.sleep(3000);
	        		//Select_Type.click();	
	        		Audio.click();
	        		Thread.sleep(2000);
	        		
	        		Cell cell = row.getCell(0);
	        		
	        		  if (cell != null) {
		                	
	        			  
		                //  String type1= cell.getStringCellValue();
                         // TestUtil.select_trigger_type(driver, type1);
                          
                          //Create Audio Fingerprint trigger for ACTV8 client
                          //if(type1.equalsIgnoreCase("Audio Fingerprint"))
                         // {
	        			  Add_Audio_Fingerprint.click();
                            name.sendKeys(row.getCell(1).getStringCellValue()); 
                         	Thread.sleep(3000);
                         	client.click();
                         	Thread.sleep(3000);
                         	String str1="ACTV8";
                         	for(int index=0;index<list_client.size();index++)
                      	  {
                      	     if(str1.equals(list_client.get(index).getText()))
                      	     {
                      		    TestUtil.javascript_button_click(driver,list_client.get(index));
                      	     }
                      	  }
                         	
                        	String str=row.getCell(3).getStringCellValue();
                        	campaign.sendKeys(str);
                        	Thread.sleep(3000);
                           /* for(int index=0;index<list_campaign.size();index++)
                        	  {
                        	     if(str.equals(list_campaign.get(index).getText()))
                        	     {
                        		    TestUtil.javascript_button_click(driver, list_campaign.get(index));
                        	     }
                        	  }
                            */
                            
                            
                            // Delivery_Preset_Options.click();
                            // Thread.sleep(2000);  
                             
                             // Create Delivery Preset
                        	 driver.findElement(By.xpath("//app-delivery-preset-options[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
                     		 Thread.sleep(2000);
                     		 
                     		//Create Delivery Preset
                    		for(int index=0;index<list_PresetOptions.size();index++)
                      	    {
                    			String stri=row.getCell(4).getStringCellValue();
                    			if(stri.equals(list_PresetOptions.get(index).getText()))
                      	        {
                      		       TestUtil.javascript_button_click(driver,list_PresetOptions.get(index));
                      	        }
                      	    }

                    		PresetName.sendKeys(row.getCell(5).getStringCellValue());
                    		Delivery_Mode.click();
                    		Thread.sleep(2000);
                    		for(int index=0;index<Delivery_Mode_Options.size();index++)
                      	    {
                    			String str2=row.getCell(6).getStringCellValue();
                    		   
                    			if(str2.equals(Delivery_Mode_Options.get(index).getText()))
                      	        {
                    				TestUtil.javascript_button_click(driver,Delivery_Mode_Options.get(index));
                      	        }
                      	    }
                    		
                    		
                    		Create_Delivery_Preset.click();
                    		Thread.sleep(2000);
                    		confirm_CreatePreset.click();
                            
                    	    this.Deliver_Preset_Options();
                    		Thread.sleep(2000);
                    		Fingerprint_Options.click();
                    		Thread.sleep(2000);
                    		brand.sendKeys(row.getCell(7).getStringCellValue());
                            driver.findElement(By.xpath("//form/div[2]/mat-form-field/div/div/div/mat-select/div/div/span")).click();
                            for(int index=0;index<list_media_type.size();index++)
                      	    {
                    			String strr=row.getCell(8).getStringCellValue();
                    			if(strr.equals(list_media_type.get(index).getText()))
                      	        {
                      		       TestUtil.javascript_button_click(driver,list_media_type.get(index));
                      	        }
                      	    }
                            
                            media.sendKeys(row.getCell(9).getStringCellValue());
                            network.sendKeys(row.getCell(10).getStringCellValue());
                            
                            select_media.click();
                    		Thread.sleep(2000);
                    		selectmedia1.click();
                    		Thread.sleep(1000);
                    		Runtime.getRuntime().exec("D:\\Divyata Automation\\AutoIT\\VideoUpload.exe");
                    		Thread.sleep(3000);
                    		uploadm.click();
                    		Thread.sleep(50000); 
                    		TestUtil.javascript_button_click(driver,create_trigger);
                    		Thread.sleep(2000);
                    		
                         }
                        //}
	            }
	        }
		return new CreateTouchTriggerPage(driver); 
	}
	
	public void Deliver_Preset_Options() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	   
		
		FileInputStream fs=new FileInputStream(prop.getProperty("CreateAudioTrigger"));
	    Workbook w= WorkbookFactory.create(fs);
	    
	   
		Sheet sh1=w.getSheet("AddContentToGroup");
		for(int i=1;i<=sh1.getLastRowNum();i++)
		{
				Row row1=sh1.getRow(i);
			
				 if (row1 != null) {
	    			
					//Add Content Group
	    			Add_Content_Group.click();
		            Thread.sleep(2000);
		            content_group_name.sendKeys(row1.getCell(0).getStringCellValue());
		            create_content_group.click();
		            Thread.sleep(2000);
                 
		            //Add Target
	    			String before_xpath="//*[@id='mat-tab-content-0-1']/div[1]/div[1]/app-delivery-preset-options[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-content-group-details[";
	                String after_xpath="]/div[1]/app-expandable-panel[1]/mat-toolbar[1]/div[2]/button";
	                driver.findElement(By.xpath(before_xpath+i+after_xpath)).click();
		            driver.findElement(By.xpath("//*[@class='cdk-overlay-pane']/div/div/button")).click();
			
		            String before_xpath1="//*[@id='mat-tab-content-0-1']/div[1]/div[1]/app-delivery-preset-options[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-content-group-details[";
		            String after_xpath1="]/div[1]/app-expandable-panel[1]/mat-toolbar[1]/div[1]/div[1]/div[2]/button[1]";
		            driver.findElement(By.xpath(before_xpath1+i+after_xpath1)).click();
		               
		            String sage=row1.getCell(1).toString();
		   			String start_age_value=sage.replaceAll(".0","");
		            start_age.sendKeys(start_age_value);
		               
		            if(row1.getCell(2).getStringCellValue().equals("Everyone"))
		            {
		                   gender.get(0).click();
		            }
		            else if(row1.getCell(2).getStringCellValue().equals("Male"))
		            {
		                   gender.get(1).click();
		            }
		            else if(row1.getCell(2).getStringCellValue().equals("Female"))
		            {
		                   gender.get(2).click();
		            }
		               
		            //  Actions act=new Actions(driver);
		            //  act.moveToElement(region).click().build().perform();
		            //  TestUtil.javascript_button_click(driver, region);
		            //  region.click();
		            //  Thread.sleep(2000);
		            // region_list.get(2).click();
		            Thread.sleep(2000);
		            Confirm_Target.click();
		            Thread.sleep(3000); 
	    		  
		          
				//Add Content to Content group
			        iconContent.click();
			        Thread.sleep(2000);
			        Sheet sh2=w.getSheet("CreateContentAddToGroup");
			  		   for(int j=1;j<=sh2.getLastRowNum();j++)
			  	    	{
			  	    		Row row2=sh2.getRow(j);
			  	            if (row2 != null) 
			  	            {
			                   add_Content.click();
			                   Thread.sleep(2000);
			            
			                   // Click on create trigger
			                   String xpathBefore="//div[@id='mat-tab-label-";
			                   String xpathAfter="-1']";
			                   
			                   WebElement create=driver.findElement(By.xpath(xpathBefore+j+xpathAfter));
			                   TestUtil.javascript_button_click(driver, create);
			                   Thread.sleep(2000);
			                    
			                   Select_Content_Type.click();
			                   
			                   Cell cell = row2.getCell(0);
			                   if (cell != null) {
			                	   
			                	    String type1= cell.getStringCellValue();
			                	    TestUtil.select_ContentType(driver, type1);
	    
		                            if(type1.equalsIgnoreCase("Offer"))
	    	                        {
		                            	
	    	                  // TestUtil.select_ContentType(driver, "Offer");
			                   nameContent.sendKeys(row2.getCell(1).getStringCellValue());
			                   String str_name= nameContent.getText();
			                    brand.sendKeys(row2.getCell(2).getStringCellValue());
			                    Offer_title.sendKeys(row2.getCell(3).getStringCellValue());
			                    description.sendKeys(row2.getCell(4).getStringCellValue());
			                    String i1=row2.getCell(5).toString();
		                        String quantity_value=i1.replaceAll(".0","");
			                    //System.out.print(quantity_value);
			                    quantity.sendKeys(quantity_value);
			                    Thread.sleep(3000);
			                    redemption.click();
			                    Thread.sleep(3000);
			                    String method=row2.getCell(6).getStringCellValue();
			                 
			                    
			                    List<WebElement> e=driver.findElements(By.xpath("//div[1]/mat-option"));
			                	for(int index=0;index<e.size();index++)
			              	    {
			            			String str=e.get(index).getText();
			            			//System.out.println(str);
			            			if(method.equals(e.get(index).getText()))
			              	        {
			              		       TestUtil.javascript_button_click(driver, e.get(index));
			              	        }
			              	    }
			                    
			                    redemption_code_options.click();
			                    Thread.sleep(3000);
			                    TestUtil.javascript_button_click(driver, manual);
			                    Barcode.click();
			                    
			                    TestUtil.javascript_button_click(driver, driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option[8]/span[1]")));
			                    Thread.sleep(2000);
			                    if(method.equalsIgnoreCase("Online") || method.equalsIgnoreCase("Online & In Store"))
			                    {
			                    	redemption_URL.sendKeys("http://www.google.com");
			                    }
			                    redemption_code.sendKeys("1234567891231");
			                    
			                    
			                    TestUtil.javascript_scroll_up(driver);
			                    
			                	//upload saved in wallet image
			                	select_image.click();
			                    Thread.sleep(3000);
			                    select_upload_image.click();
			                    Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
			                    Thread.sleep(3000);
			                    upload.click();
			                    Thread.sleep(6000);
			                    walletImage.click();
			                    Thread.sleep(3000);
			                    select_upload_image.click();
			                    Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
			                    upload.click();
			                    Thread.sleep(6000);
			               
			                    TestUtil.javascript_scroll_up(driver);
			                    TestUtil.javascript_button_click(driver, create_content);
			                    //create_content.click();
			                   
			                    Thread.sleep(2000);
	    	                   }
		                       else if(type1.equalsIgnoreCase("Prize")) 
		                       {
		                    	   nameContent.sendKeys(row2.getCell(1).getStringCellValue());
				                   String str_name= nameContent.getText();
				                    brand.sendKeys(row2.getCell(2).getStringCellValue());
				                    Offer_title.sendKeys(row2.getCell(3).getStringCellValue());
				                    description.sendKeys(row2.getCell(4).getStringCellValue());
				                    String i1=row2.getCell(5).toString();
			                        String quantity_value=i1.replaceAll(".0","");
				                    //System.out.print(quantity_value);
				                    quantity.sendKeys(quantity_value);
				                    Thread.sleep(3000);
				                    redemption.click();
				                    Thread.sleep(3000);
				                    String method=row2.getCell(6).getStringCellValue();
				                    System.out.print(method);
				                    
				                    List<WebElement> e=driver.findElements(By.xpath("//div[1]/mat-option"));
				                	for(int index=0;index<e.size();index++)
				              	    {
				                		String str=e.get(index).getText();
				            			//System.out.println(str);
				            			if(method.equals(e.get(index).getText()))
				              	        {
				              		       TestUtil.javascript_button_click(driver, e.get(index));
				              	        }
				              	    }
				                    
				                    redemption_code_options.click();
				                    Thread.sleep(3000);
				                    TestUtil.javascript_button_click(driver, manual);
				                    Barcode.click();
				                    
				                    TestUtil.javascript_button_click(driver, driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option[8]/span[1]")));
				                    Thread.sleep(2000);
				                    if(method.equalsIgnoreCase("Online") || method.equalsIgnoreCase("Online & In Store"))
				                    {
				                    	redemption_URL.sendKeys("http://www.google.com");
				                    }
				                    redemption_code.sendKeys("1234567891231");
				                    
				                    
				                    TestUtil.javascript_scroll_up(driver);
				                    
				                	//upload saved in wallet image
				                	
				                    walletImage.click();
				                    Thread.sleep(3000);
				                    select_upload_image.click();
				                    Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
				                    upload.click();
				                    Thread.sleep(6000);
				                    select_image.click();
				                    Thread.sleep(3000);
				                    select_upload_image.click();
				                    Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
				                    Thread.sleep(3000);
				                    upload.click();
				                    Thread.sleep(6000);

				                    TestUtil.javascript_scroll_up(driver);
				                    TestUtil.javascript_button_click(driver,create_content);
				                    //create_content.click();
				                   
				                    Thread.sleep(2000);
		                       }
		                       else if(type1.equalsIgnoreCase("Message"))
		                       {
		                    	   nameContent.sendKeys(row2.getCell(1).getStringCellValue());
				                   String str_name= nameContent.getText();
				                   brand.sendKeys(row2.getCell(2).getStringCellValue());
				                   Offer_title.sendKeys(row2.getCell(3).getStringCellValue());
				                   messageImage1.click();
				                   Thread.sleep(3000);
				                   select_upload_image.click();
				                   Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
				                   Thread.sleep(3000);
				                   upload.click();
				                   Thread.sleep(6000);
				                   messageImage2.click();
				                   Thread.sleep(3000);
				                    select_upload_image.click();
				                    Runtime.getRuntime().exec(prop.getProperty("content_img_upload"));	
				                    upload.click();
				                    Thread.sleep(6000);
				               
				                    TestUtil.javascript_scroll_up(driver);
				                    TestUtil.javascript_button_click(driver, create_content);
				                    //create_content.click();
				                   
				                    Thread.sleep(2000);  
		                       }
			                   }
			                   
			              }
			  	    	}
				 
				}
	    	
		}
	      	          
	    
	    
		}
	
	
}
