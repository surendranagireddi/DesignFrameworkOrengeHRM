package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class PimPage extends BaseFunction {
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addButton;
	
	
	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement addEmp;
	
	@FindBy(xpath="//input[@id='firstName' and @name='firstName']")
	 WebElement firstname;
		
	@FindBy(xpath="//input[@id='lastName' and @name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='btnSave' and @value='Edit']")
	WebElement editBtn;
	
	@FindBy(xpath="//input[@name='personal[txtLicenNo]']")
	WebElement dlicenseNo ;
	
	
  @FindBy(xpath="//input[@id='personal_optGender_1']")
  WebElement male;
  
  @FindBy(xpath="//input[@id='personal_optGender_2']")
  WebElement feMale;
	
	
@FindBy(xpath="//input[@id='btnSave' and @value='Save']")
WebElement save;
	
@FindBy(xpath="//a[text()='Employee List']")
WebElement emplist;


//@FindBy(xpath="//a[text()='Employee List']")
//WebElement emplist;

@FindBy(xpath="//input[@name='empsearch[employee_name][empName]']")
WebElement empname;

@FindBy(xpath="//input[@id='searchBtn']")
WebElement searchBtn;

	public PimPage() {
		super();

		PageFactory.initElements(driver, this);
	}


	public void click() {

		emplist.click();
		
	}

	public void addClick() {

		addEmp.click();
	}
	
public void addEmpInform(String firstName,String lastName) throws IOException {
		
		firstname.sendKeys(firstName);
	    lastname.sendKeys(lastName);
	    
	    saveBtn.click();
	    SeleniumUtils.CaptureScreen(driver,"addEmp");
		
	}
public EmployeeList editEmployeeDetails() throws IOException {
	
	editBtn.click();
	dlicenseNo.sendKeys("787878901");
	male.click();
	save.click();
	 SeleniumUtils.CaptureScreen(driver,"editEmp");
	return new EmployeeList();
	
}








}
