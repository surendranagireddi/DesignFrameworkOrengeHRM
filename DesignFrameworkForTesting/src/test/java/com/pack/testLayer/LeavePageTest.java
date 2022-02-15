package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LeavePage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class LeavePageTest extends BaseFunction{

	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
	 LeavePage leavePage;
	 
	 @BeforeClass
	 public void setUp() throws IOException, InterruptedException {
		 intialization();
		 login = new LoginHRMPage();
		// dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		leavePage  = dashboardpage.leaveClick();
		
		
		
		
		 
	 }
	 @Test (priority = 1)
	 public void validateAddTest() throws InterruptedException {
		 leavePage.assignClick();
	 }
	
	 @Test(priority = 2)
	 public void leaveTest() throws InterruptedException {
		 leavePage.applayLeaveTest();
	 }


	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"leavePageTests");
		 driver.close();
		 
	 }
	
	 
	 

}
