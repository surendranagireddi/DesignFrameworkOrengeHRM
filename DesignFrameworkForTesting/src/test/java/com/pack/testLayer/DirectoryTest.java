package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.Directory;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class DirectoryTest extends BaseFunction{
	
	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
     Directory directory;
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		// dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 directory = dashboardpage.directoryClick();
		
		 
	 }
	 @Test(priority =1)
	 public void verifyTest() {
		 
		 directory.verifyText(); 
		 
	 }

	 @Test(priority = 2)
	 public void searchDirectory() throws InterruptedException {
		 directory.SearchDirectory();
	 }
	 

	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"directoryPage");
		 driver.close();
		 
	 }
	
}
