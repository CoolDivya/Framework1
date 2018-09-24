package com.test.qa.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;
import com.test.qa.util.TestUtil;

public class LoginPage extends BaseTest {

	public LoginPage() throws IOException {

        PageFactory.initElements(driver, this);

	}





	@FindBy(id="mat-input-0")
	WebElement username;
	
	@FindBy(id="mat-input-1")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login_btn;
	
	
	@FindBy(xpath="//*[contains(text(),'Mobii')]")
	WebElement select_app;
	
               

   

    public Create_StoryCardsPage login(String path) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
    	
    	 FileInputStream fs=new FileInputStream("D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\file\\data.xlsx");
    	 Workbook w= WorkbookFactory.create(fs);
    			
    	 Sheet sh=w.getSheet("login");
    			
    	 Row row=sh.getRow(1);

         String un=row.getCell(0).getStringCellValue();
    	 String pwd=row.getCell(1).getStringCellValue();

    	            username.sendKeys(un);

                    password.sendKeys(pwd);

                    login_btn.click();
                    
                    Thread.sleep(3000);

                    select_app.click();
                    
                    Thread.sleep(3000);
                    
              TestUtil.screenshot(driver,path);

              return new Create_StoryCardsPage(driver);

    }
}
