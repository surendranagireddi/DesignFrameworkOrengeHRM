package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AddUser;
import com.pack.pageLayer.AdiminPage;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.User;
import com.pack.utilsLayer.SeleniumUtils;

public class UserTest extends BaseFunction{
	
	LoginHRMPage login;
	DashBoardPage dashboardpage;
	 AdiminPage adminPage;
	 
	 AddUser adduser;
	 User user;
	 @BeforeClass
	 public void setUp() throws IOException {
		   intialization();
		 login = new LoginHRMPage();
		 dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 adminPage = dashboardpage.adiminClick();
		 adminPage.click();
		 
		 user = new User();
		 
	 }
	 
	 @Test(priority = 1)
	 public void userTest() {
		 
		 user.userclick();
		 
	 }
	 @Test(priority =2)
	 public void searchTest() {
		 
		 user.systemUser(prop.getProperty("userName"));
		 
		 
	 }
	 @Test(priority = 3)
	 public void checkTest() {
		 
		 user.checkBoxClick();
	 }
	 @Test(priority = 4)
	 public void deleteUserTest()
	 {
		 user.deleteUser();
	 }
	 
	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"deltUser");
		 driver.close();
		 
	 }
	 

}
