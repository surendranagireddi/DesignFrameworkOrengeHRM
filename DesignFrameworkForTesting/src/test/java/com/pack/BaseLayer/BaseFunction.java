package com.pack.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunction {

public static WebDriver driver;
	
	public static Properties  prop;  // declaring prop is static variable
	public BaseFunction()  {
		
		try {
			//creating the Object Of Properties Class
			prop = new Properties(); 
		
			//read the properties file
			//	FileInputStream fis = new FileInputStream("C:\\Users\\hpadmin\\eclipse-workspace\\DesignFrameworkForTesting\\src\\test\\java\\com\\pack\\configs\\config.properties");
			FileInputStream fis = new FileInputStream("src/test/java/com/pack/configs/config.properties");
			
			//load the properties file
			prop.load(fis);
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace(); //Catched the FileNotFoundException
		}catch(IOException ie) {
			ie.printStackTrace(); //Catched the IOException
		}
	}
	//create the static method intialization
	public static void intialization() {
	//get the browser name from property file and stored in String type
	String browsername=	prop.getProperty("browser"); 
	//if browser name as chrome we do set property
	if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); 
	//creating chrome driver Object
     driver= new ChromeDriver(); 
	}
	if(browsername.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", "src/test/resources/Firefoxdriver.exe"); 
	     driver= new ChromeDriver();
		}
	//manage the Window
	driver.manage().window().maximize();  
	//delete the all cookies
	driver.manage().deleteAllCookies();
	//get the url prop property file
	driver.get(prop.getProperty("url"));
	
 }
}
