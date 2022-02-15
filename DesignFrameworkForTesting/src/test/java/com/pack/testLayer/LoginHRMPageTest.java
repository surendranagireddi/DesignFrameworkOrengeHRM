package com.pack.testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.pageLayer.DashBoardPage;
import com.pack.pageLayer.LoginHRMPage;

public class LoginHRMPageTest extends BaseFunction{

	public LoginHRMPageTest() {
		super();
		

	}
  //declaring the object of LoginHRMPage and DashBoardPage
	LoginHRMPage loginhrmpage;
	DashBoardPage dashboardpage;
	
	// setup 
	@BeforeMethod
	public void setUp() throws IOException {
		intialization(); //call the method from BaseFunction
		
		loginhrmpage= new LoginHRMPage();  //creating a new login page object
		dashboardpage= new DashBoardPage(); //creating DashBoard Page obeject
		
	}
	
	//login page Test case
	
	@Test(priority = 2)
	public void LoginTest() throws IOException {
		
		
		 dashboardpage =loginhrmpage.logInToHrm(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	//Validating the page Test case
	@Test(priority = 1)
	public void ValidatePageTittle() {
		String tittle =	loginhrmpage.getTheTittles();
		
		if(tittle.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("Title is Matched");
			
		}
	}
	
}
