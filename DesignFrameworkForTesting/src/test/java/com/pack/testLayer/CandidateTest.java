package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AddCandidate;
import com.pack.pageLayer.Candidate;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.RecruitmentPage;
import com.pack.utilsLayer.SeleniumUtils;

public class CandidateTest extends BaseFunction{
	
	
	 LoginHRMPage login;
	 DashBoardPage dashboardpage;
   RecruitmentPage recruitmentpage;
  
   Candidate candidate;
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		 intialization();
		 login = new LoginHRMPage();
		 dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 recruitmentpage = dashboardpage.recruitClick();
		 //recruitmentpage.addClick();
		 candidate = new Candidate();
	 }
	 
	 @Test(priority = 1)
	 public void searchTest() {
		 
		 candidate.searchCandidate(prop.getProperty("firstname"), prop.getProperty("secondname"));
		 
		 
	 }
	 
	 @Test(priority = 2)
	 public void deleteCandidateTest() throws InterruptedException, IOException {
		 
		 candidate.deleteCandidate();
	 }
	 @AfterClass
	 public void driverclose() throws IOException
	 {
		 
		 SeleniumUtils.CaptureScreen(driver,"candidate");
		 driver.close();
		 
	 }
	 

}
