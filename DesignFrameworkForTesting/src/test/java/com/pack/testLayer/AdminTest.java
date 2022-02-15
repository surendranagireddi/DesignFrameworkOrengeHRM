package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.AdiminPage;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;

public class AdminTest extends BaseFunction {

	public AdminTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginHRMPage login;
	DashBoardPage dashboardpage;
	 AdiminPage adminPage;

	 
	 
	 @BeforeClass
	 public void setUp() throws IOException {
		   intialization();
		 login = new LoginHRMPage();
		 // dashboardpage = new DashBoardPage();
		 dashboardpage = login.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
		 adminPage = dashboardpage.adiminClick();
		 		 
	 }
	 @Test 
	 public void validateAddTest() {
		 adminPage.click();
	 }
	 
}
