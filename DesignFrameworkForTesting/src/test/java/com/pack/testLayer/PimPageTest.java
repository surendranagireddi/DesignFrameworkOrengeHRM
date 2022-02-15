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

public class PimPageTest extends BaseFunction {
	
	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
	 PimPage pimPage;
//	 EmployeeList emp;
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		// dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 pimPage = dashboardpage.pimClick();
		 
		 
	 }
	 @Test (priority =1)
	 public void validateAddTest() {
		 pimPage.addClick();
	 }
	 

	 @Test(priority = 2)
	   public void validateTestEmp() throws IOException {
		   
		  pimPage.addEmpInform(prop.getProperty("firstName"),prop.getProperty("lastName"));
	   }

	 @Test(priority = 3)
	 public void saveEmployeeTest() throws IOException {
		 
		 pimPage.editEmployeeDetails();
	 }
	 
	
	 
  	 
	 @AfterClass
	 public void tearDown() throws IOException {
		 
		 SeleniumUtils.CaptureScreen(driver,"pimPageDetails");
		 driver.close();
	 }

}
