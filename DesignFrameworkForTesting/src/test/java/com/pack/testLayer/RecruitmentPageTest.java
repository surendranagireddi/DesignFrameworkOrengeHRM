package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.RecruitmentPage;
import com.pack.utilsLayer.SeleniumUtils;

public class RecruitmentPageTest extends BaseFunction{
	
	
	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
     RecruitmentPage recruitmentpage;
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		// dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		
		 recruitmentpage = dashboardpage.recruitClick();
		 
	 }
	 @Test(priority =1)
	 public void validateRecruitmentTest() {
		
		 recruitmentpage = dashboardpage.recruitClick();
		
	 }
	 @Test(priority = 2)
	 public void validateAddTest() {
		 recruitmentpage.addClick(); 
		 
	 }
	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"recruitmentAddPage");
		 driver.close();
		 
	 }
	 

}
