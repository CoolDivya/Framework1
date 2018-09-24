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

public class Create_StoryCardsPage extends BaseTest {

	WebDriver driver;

	public Create_StoryCardsPage(WebDriver driver) throws IOException {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[4]/mat-list-item[1]/div[1]")
	WebElement story_cards;
	
	@FindBy(xpath="//button[@class='mat-fab mat-primary']")
    WebElement create_card;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='buttonOneText']")
	WebElement buttonOneText;
	
	@FindBy(xpath="//input[@name='buttonOneUrl']")
	WebElement buttonOneUrl;
	
	@FindBy(xpath="//div[@class='mat-form-field-wrapper']/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement Btn_action;
	
	@FindBy(xpath="//div[@class='mat-select-content ng-trigger ng-trigger-fadeInContent']/mat-option")
	List<WebElement> list_action;
	
	@FindBy(xpath="//app-s3-file-uploader[@class='story-uploader-width']/div[1]/div[1]/div[1]/div[1]")
	WebElement select_image;
	
	@FindBy(xpath="//app-uploader-dialog[@class='ng-star-inserted']/div[1]/div[1]/form[1]/label[1]/div[1]/div[1]")
	WebElement select_img;
	
	@FindBy(xpath="//div[@class='btn-row']//button[2]")
    WebElement upload;	
	
	@FindBy(xpath="//div[@class='scratcher-form-buttons']//button[@type='submit']")
	WebElement save_card;
	
	public void create_story_card() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    FileInputStream fs=new FileInputStream(prop.getProperty("Create_StoryCard"));
	    Workbook w= WorkbookFactory.create(fs);
	    
	   
		Sheet sh=w.getSheet("createcard");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
				Row row=sh.getRow(i);
			
				 if (row != null) {
					 
					 
					         story_cards.click();
						     Thread.sleep(2000);
					         create_card.click();
						     Thread.sleep(2000);
							 name.sendKeys(row.getCell(0).getStringCellValue());
							 buttonOneText.sendKeys(row.getCell(1).getStringCellValue());
							 buttonOneUrl.sendKeys(row.getCell(2).getStringCellValue());
						     Btn_action.click();
						     
						     for(int index=0;index<list_action.size();index++)
						     {
						    	 String action=row.getCell(5).getStringCellValue();
						    	 if(action.equals(list_action.get(index).getText()))
						    	 {
						    		 list_action.get(index).click();
						    	 }
						     }
						     
						     select_image.click();
						     select_img.click();
						     Runtime.getRuntime().exec(prop.getProperty("storycard_image_upload"));
						     Thread.sleep(3000);
			                 upload.click();
			                 Thread.sleep(6000);
			                 save_card.click();
			                 Thread.sleep(1000);
			                 String fpath1="D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\screenshot\\StoryCard";
                             String lpath1=".jpeg";
                             String actualpath=fpath1+i+lpath1;
                             TestUtil.screenshot1(driver,actualpath);
                             Thread.sleep(2000);
						     
				 }
		}		 
		
		
	}
	
}
