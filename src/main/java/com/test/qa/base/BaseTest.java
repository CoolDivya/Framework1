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

                        FileInputStream fs= new FileInputStream("C:\\Users\\k2actv801\\git\\Framework1\\src\\main\\java\\com\\test\\qa\\config\\config.properties");

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

                                   

                    	System.setProperty("webdriver.chrome.driver","D:\\Divyata Automation\\Automation\\chromedriver_win32\\chromedriver.exe");
                		driver=new ChromeDriver();

                   }

                   

                    driver.manage().window().maximize();

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                   

                    driver.get(prop.getProperty("url"));
                    
                    

    }
}
