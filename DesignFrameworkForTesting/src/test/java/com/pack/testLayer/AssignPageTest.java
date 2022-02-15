package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AssignPage;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LeavePage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class AssignPageTest extends BaseFunction {
	
	LoginHRMPage login;
	DashBoardPage dashboardpage;
	LeavePage leavepage;
	
	 AssignPage  assignPage;

	
	
	 @BeforeClass
	 public void setUp() throws IOException, InterruptedException {
		   intialization();
		 login = new LoginHRMPage();
		 //dashboardpage = new DashBoardPage();
		 
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 leavepage = dashboardpage.leaveClick();
		 leavepage = new LeavePage();
		 leavepage.assignClick();
		  
		  assignPage = new AssignPage();
		 
		
		 
	 }
	 
	 @Test
	 public void checkAssignPageTest() throws InterruptedException, IOException {
		 
		assignPage.assignLeave();
		 
	 }
	

	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"assignLeave");
		 driver.close();
		 
	 }
	
	
	
	

}
