package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AddCandidate;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.RecruitmentPage;
import com.pack.utilsLayer.SeleniumUtils;

public class AddCandidateTest extends BaseFunction {
	
	 LoginHRMPage login; 
	 DashBoardPage dashboardpage;
    RecruitmentPage recruitmentpage;
    AddCandidate addCandidate;
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		 dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 recruitmentpage = dashboardpage.recruitClick();
		 recruitmentpage.addClick();
		 addCandidate = new AddCandidate();
	 }
	 
	 @Test
	 public void validateAddCandidateTest() throws InterruptedException, IOException {
		 
		 addCandidate.addCanditae(prop.getProperty("firstname"), prop.getProperty("secondname"), prop.getProperty("emailId"), prop.getProperty("contactNo"));
		 
	
		 
		 
	 }
	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"addCandidte");
		 driver.close();
		 
	 }
	 

}
