package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;
import com.pack.pageLayer.Logout;
import com.pack.utilsLayer.SeleniumUtils;

public class LogoutTest extends BaseFunction {
	

	LoginHRMPage login;
	DashBoardPage dashboardpage;
	Logout logout;
	
	@BeforeClass
	public void setUp() throws IOException {
		intialization();
		   
			 login = new LoginHRMPage();
			 dashboardpage = new DashBoardPage();
			 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		     
			 logout = dashboardpage.logoutClick();
			 
			 logout = new Logout();
		
		
	}
	
	@Test
	public void LogoutVerifyTest() {
		logout.logout();
	}


//	 @AfterClass
//	 public void driverclose() throws IOException
//	 {
//		 
//		 SeleniumUtils.CaptureScreen(driver,"logout");
//		 driver.close();
//		 
//	 }
	
}
