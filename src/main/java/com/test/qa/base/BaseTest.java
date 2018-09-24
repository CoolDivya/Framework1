package com.test.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.media.sound.InvalidFormatException;


@SuppressWarnings("restriction")
public class BaseTest {

	
	protected static WebDriver driver;

    protected static Properties prop;

   

    public BaseTest() throws IOException

    {

                try

                    {

                        prop= new Properties();

                        FileInputStream fs= new FileInputStream("D:\\Divyata Automation\\Selenium\\Automation Test\\Automation1\\src\\main\\java\\com\\test\\qa\\config\\config.properties");

                        prop.load(fs);

                    }

                    catch(FileNotFoundException e)

                    {

                                    e.printStackTrace();

                    }

    }

   

  
	@SuppressWarnings("restriction")
	public static void initialization() throws InvalidFormatException, IOException

    {

                   String browserName= prop.getProperty("browser");

                   

                   if(browserName.equals("chrome"))

                   {

                                   

                    	System.setProperty("webdriver.chrome.driver","D:\\Divyata QA\\chrome exe\\chromedriver.exe");
                		driver=new ChromeDriver();

                   }

                   

                    driver.manage().window().maximize();

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                   

                    driver.get(prop.getProperty("url"));
                    
                    

    }
}
