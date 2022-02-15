package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.EmployeeList;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.PimPage;
import com.pack.utilsLayer.SeleniumUtils;

public class EmployeeListTest extends BaseFunction {
	
	
	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
	 PimPage pimPage;
	 EmployeeList elist;
	 

	public EmployeeListTest() {
		super();

	}
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		 pimPage = new PimPage();
		 dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 pimPage = dashboardpage.pimClick();
		 
		 elist = new EmployeeList();
	 }
	 
	
	 
	 @Test(priority =1)
	 public void empSearchTest() {
		 
		elist.empSearch(prop.getProperty("firstName"), prop.getProperty("lastName"));
	    // elist.empSearch(); 
		
		 
	 }
	 
	 @Test(priority = 2)
	 public void checkBoxTest() throws InterruptedException{
		 elist.checkBoxClick();
		 Thread.sleep(5000);
	 }
	 
	 @Test(priority = 3)
	 public void deleteEmpName() throws InterruptedException {
		
		 elist.clickDelete();
		 Thread.sleep(5000);
	 }
	
	 @AfterClass
	 public void tearDown() throws IOException {
		 
		 SeleniumUtils.CaptureScreen(driver,"emplistDetails");
		 driver.close();
	 }
	
	
	

}
