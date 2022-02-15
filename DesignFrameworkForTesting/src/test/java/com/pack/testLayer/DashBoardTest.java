package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.ApplayLeave;


import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;

public class DashBoardTest extends BaseFunction {

	public DashBoardTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginHRMPage loginhrmpage ;
	DashBoardPage dashboardpage;
	ApplayLeave applyPage ;
	
	@AfterClass
	public void setUp() throws IOException
	{
		intialization();
		loginhrmpage=new LoginHRMPage();
	  //dashboardpage = new DashBoardPage();
	   dashboardpage =	loginhrmpage.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
	   applyPage = new ApplayLeave();
    
	}
	@Test
	public void ApplayLeaveClickableTest() {
	applyPage =	dashboardpage.applayLeave();
	}
	@Test
	public void AssiginLeaveClickableTest() {
		 System.out.println("2nd Test case");
		//dashboardpage.clickAssignLeave();
	}
	@AfterClass
	public void tearDown() {
		
		//driver.close();
	}
}
