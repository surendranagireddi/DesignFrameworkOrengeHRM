package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.ApplayLeave;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LeavePage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class ApplayLeaveTest extends BaseFunction {
	
	LoginHRMPage loginhrmpage ;
	DashBoardPage dashboardpage;
	ApplayLeave applyPage ;
	LeavePage leave;
	
	@AfterClass
	public void setUp() throws IOException, InterruptedException
	{
		intialization();
		loginhrmpage=new LoginHRMPage();
	    dashboardpage = new DashBoardPage();
	   dashboardpage =	loginhrmpage.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
	   leave = dashboardpage.leaveClick();
	   leave.applayLeaveTest();
	   
	   
	   applyPage = new ApplayLeave();
	   
}
	@Test(priority = 1)
	public void ApplyLeaveTest() throws IOException {
		applyPage.applyLeaveClick();
	}

	@Test(priority = 2)
	public void testAppalyLeave() {
		applyPage.applayLeave();
	}

	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"appalyLeave");
		 driver.close();
		 
	 }
	
}
