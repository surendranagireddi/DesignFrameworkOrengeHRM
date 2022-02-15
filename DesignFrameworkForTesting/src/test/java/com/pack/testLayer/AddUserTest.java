package com.pack.testLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AddUser;
import com.pack.pageLayer.AdiminPage;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class AddUserTest extends BaseFunction{
	

	@FindBy(xpath="//input[@name='btnSave']")
	WebElement btnSave;

	LoginHRMPage login;
	DashBoardPage dashboardpage;
	 AdiminPage adminPage;
	 
	 AddUser adduser;
	 
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		   intialization();
		 login = new LoginHRMPage();
		 dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		
		 adminPage = dashboardpage.adiminClick();
		 adminPage.click();
		 
		 adduser = new AddUser();
		 
		 
		 
		 
	 }
	 

	 @Test(priority = 1)
	 public void addUserTest() throws IOException, InterruptedException {
		 
		adduser.addUser(prop.getProperty("empNam"), prop.getProperty("userName"), prop.getProperty("pwd"), prop.getProperty("cnfPass"));
		 
	
	 }
	 @Test(priority = 2)
	 public void saveUserTest() {
		 adduser.saveUser();
	 }

	
	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"addUser");
	//	 driver.close();
		 
	 }
	

	
	 
	
}

