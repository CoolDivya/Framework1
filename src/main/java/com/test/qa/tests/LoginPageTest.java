package com.test.qa.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.test.qa.base.BaseTest;
import com.test.qa.pages.AdBeacon;
import com.test.qa.pages.AddUser;
import com.test.qa.pages.ContentAdvancedSearchPage;
import com.test.qa.pages.CreateAudioFingerprintTriggerPage;
import com.test.qa.pages.CreateTouchTriggerPage;
import com.test.qa.pages.Create_CampaignPage;
import com.test.qa.pages.Create_ContentPage;
import com.test.qa.pages.Create_StoryCardsPage;
import com.test.qa.pages.LoginPage;
import com.test.qa.pages.SearchTriggerPage;

public class LoginPageTest extends BaseTest {
	LoginPage loginPage;
	Create_CampaignPage campaign;
	Create_ContentPage CreateContent;
	ContentAdvancedSearchPage advSearch;
	CreateAudioFingerprintTriggerPage AudioFingerPrint;
    CreateTouchTriggerPage Touch;
    Create_StoryCardsPage storycards;
    SearchTriggerPage searchTrigger;
    AddUser adduser;
    AdBeacon addBeacon;
    


    public LoginPageTest() throws IOException {

                    super();

                    // TODO Auto-generated constructor stub

    }

    @BeforeSuite
     public void setup() throws IOException, InvalidFormatException

    {

                    initialization();

                    loginPage=new LoginPage();
                    campaign=new Create_CampaignPage(driver); 
                    CreateContent= new Create_ContentPage(driver);	
                    advSearch= new ContentAdvancedSearchPage(driver);
                    AudioFingerPrint=new CreateAudioFingerprintTriggerPage(driver);
                    Touch=new CreateTouchTriggerPage(driver);
                    storycards= new Create_StoryCardsPage(driver);
                    searchTrigger=new SearchTriggerPage(driver);
                    adduser=new AddUser(driver);
                    addBeacon=new AdBeacon(driver);

    }

   

    @Test(priority=0)
    public void login() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
    	
    	 
    	addBeacon=loginPage.login(prop.getProperty("login_screen_path"));
    	
    	//AudioFingerPrint.create_trigger();
   }
    
    
   /* @Test(priority=1)
    public void Create_CampaignTest() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
	    campaign.Open_Campaign_page();     
    	CreateContent=campaign.CreateCampaign();      
		 
	}
    
   @Test(priority=2)
    public void Create_ContentTest() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
         
	   advSearch=CreateContent.Create_Content();

    }


   @Test(priority=3)
    public void AdvSearch_By_contentId() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
          
 		 advSearch.click_on_the_Advanced_Search_button();  
 		
 		 advSearch.enter_contentId_and_click_on_search();  

    }

    @Test(priority=4)
 	 public void AdvSearch_By_Name() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
         
 		
 		 advSearch.enter_name_and_click_on_search();  

    }

    @Test(priority=5)
 	 public void AdvSearch_By_Brand() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
      
 		 advSearch.enter_brand_and_click_on_search();  

    }
 	 
 	
 	 
 	 @Test(priority=6)
 	 public void AdvSearch_By_type() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
         
 		advSearch.select_type_and_click_on_search();  

    
    }
 	 
 	 
 	 @Test(priority=7)
 	 public void AdvSearch_By_StartDate() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
      advSearch.click_on_the_Advanced_Search_button();  
      advSearch.select_start_date();  
    
    }


 	 @Test(priority=8)
 	 public void AdvSearch_By_EndDate() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
      advSearch.select_end_date();  
    
    }
  

 	 @Test(priority=9)
 	 public void AdvSearch_By_CreatedDate() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException

    {
     
      advSearch.created_date();  
    
    }
 	
 	 @Test(priority=10)
 	 public void AdvSearch_By_UpdatedDate() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
     
 		storycards=advSearch.updated_date();  
    
    }
 	
 	 @Test(priority=11)
 	 public void create_AudioFingerprintTrigger() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
     
 		Touch=AudioFingerPrint.create_trigger();
    
    }
   
 	@Test(priority=12)
 	 public void create_TouchTrigger() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
     Touch.create_trigger();
    
    }
 
    @Test(priority=13)
 	 public void create_StoryCards() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
    {
     
    	 storycards.create_story_card();
    
    }
  
    
    @Test(priority=14)
	 public void search_trigger() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
   {
    
    	searchTrigger.search_trigger();
   
   }

    
    
    @Test(priority=15)
	 public void AddUser() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
   {
    
    	adduser.adduser();
   
   }
   */
   
    @Test(priority=16)
	 public void AddBeacons() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
  {
   
   addBeacon.add_Beacons();
  
  }
   
    @AfterSuite

    public void close()

    {

         //  driver.quit();

                   

    }
}
