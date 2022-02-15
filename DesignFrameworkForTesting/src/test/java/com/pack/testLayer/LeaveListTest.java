package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AssignPage;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LeaveList;
import com.pack.pageLayer.LeavePage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.utilsLayer.SeleniumUtils;

public class LeaveListTest extends BaseFunction {
	

	LoginHRMPage login;
	DashBoardPage dashboardpage;
	LeavePage leavepage;
	LeaveList leavelist;

	
	
	 @BeforeClass
	 public void setUp() throws IOException, InterruptedException {
		   intialization();
		 login = new LoginHRMPage();
		 //dashboardpage = new DashBoardPage();
		 
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 leavepage = new LeavePage();
		 leavepage = dashboardpage.leaveClick();
		 
		 
		leavepage.leaveListClick();
		
		 leavelist = new LeaveList();
		 
		 
		 
	 }
	 
	 @Test(priority = 1)
	 public void leaveListSearch() throws IOException, InterruptedException {
		 
		 leavelist.searchEmployee(prop.getProperty("employeeName"));
		 
	  // leavelist.searchEmployee();
		
		 
	 }
	 

	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"cancelleaveStatus");
		 driver.close();
		 
	 }
	
	 

}
