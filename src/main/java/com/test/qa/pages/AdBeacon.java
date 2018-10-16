  package com.test.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.util.TestUtil;

public class AdBeacon {
	
	WebDriver driver;

	public AdBeacon(WebDriver driver) throws IOException {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-navigation[1]/mat-sidenav-container[1]/mat-sidenav[1]/mat-nav-list[1]/a[7]/mat-list-item[1]/div[1]/div[3]")
	WebElement Beacons;
	
	@FindBy(xpath="//span[contains(text(),'Add Beacon')]")
	WebElement addBeacon;
	
	@FindBy(xpath="//mat-form-field[1]/div[1]/div[1]/div[1]/mat-select")
	WebElement select_BeaconType;
	
	@FindBy(xpath="//div[1]/mat-option")
	List<WebElement> list_BeaconsType;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="uniqueId")
	WebElement uniqueId;
	
	@FindBy(name="search")
	WebElement search;
	
	public void add_Beacons() throws InterruptedException
	{
		Beacons.click();
		Thread.sleep(2000);
		addBeacon.click();
		Thread.sleep(2000);
		TestUtil.javascript_button_click(driver, select_BeaconType);
		Thread.sleep(2000);
		 for(int index=0;index<list_BeaconsType.size();index++)
	     {
	    	 String action="Standard";
	    	 if(action.equals(list_BeaconsType.get(index).getText()))
	    	 {
	    		 list_BeaconsType.get(index).click();
	    	 }
	     }
		 name.sendKeys("ACTV8me - Beacon: o6R4");
		 uniqueId.sendKeys("o6R4");
		 search.sendKeys("Karwan Road, Santosh Nagar, Mehdipatnam, Hyderabad, Telangana, India");
	}
}
