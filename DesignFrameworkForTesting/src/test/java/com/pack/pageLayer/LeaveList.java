package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class LeaveList extends BaseFunction{

	public LeaveList() {
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@id='leaveList_txtEmployee_empName']")//input[@id='leaveList_txtEmployee_empName']
	WebElement employee;
	
	@FindBy(xpath="//label[text()='All']")//label[text()='All']
	WebElement allCheck;
	@FindBy(xpath="//input[@id='btnSearch']")//input[@id='btnSearch']
	WebElement search;
	
	@FindBy(xpath="//select[@class='select_action quotaSelect']")//select[@class='select_action quotaSelect']
    WebElement cancelDrop;
	
	@FindBy(xpath="//input[@id='btnSave']")//input[@id='btnSave']
	WebElement save;
	
	@FindBy(xpath="//input[@name='leaveList[calFromDate]']")//input[@name='leaveList[calFromDate]']
	WebElement fromDate;
	@FindBy(xpath="//input[@name='leaveList[calToDate]']")
	WebElement toDate;
	
	public void searchEmployee(String empname) throws IOException, InterruptedException {

		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	    js.executeScript("arguments[0].value='12-05-2022'", fromDate);
	    
	    js.executeScript("arguments[0].value='13-05-2022'", toDate);
		 allCheck.click();
		 employee.sendKeys(empname);
		 
		 search.click();
		 Thread.sleep(1000);
		SeleniumUtils.CaptureScreen(driver,"leaveList");
		
	Select sc = new Select(cancelDrop);
	sc.selectByVisibleText("Cancel");
	Thread.sleep(1000);
	SeleniumUtils.CaptureScreen(driver,"cancelDropdwn");	
	Thread.sleep(3000);
	
	save.click();
		
	//SeleniumUtils.CaptureScreen(driver,"cancelStatus");	
		
	}
	
	
//	
//	 public void leaveCancle() throws IOException, InterruptedException { 
//	  Select sc = new Select(cancel); 
//	  sc.selectByVisibleText("Cancel");
//	 //save.click();
//	  Thread.sleep(1000); //
//	  SeleniumUtils.CaptureScreen(driver,"cancelLeave"); 
//	  }
	 
	
	
	
	 }
	
	

