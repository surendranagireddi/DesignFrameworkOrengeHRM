package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class AssignPage extends BaseFunction{
	
	
	
	



//	@FindBy(xpath="//input[@name='assignleave[txtEmployee][empName]']")
//	WebElement employeeName;
	@FindBy(xpath="//input[@id='assignleave_txtEmployee_empName']")
	WebElement empname;
	
	@FindBy(xpath="//select[@name='assignleave[txtLeaveType]']")
	WebElement leavetype;
	
	
	
	  @FindBy(xpath="//input[ @class='calendar hasDatepicker' and @name ='assignleave[txtFromDate]']")
	WebElement fromDate;
	
	@FindBy(xpath="//input[ @class='calendar hasDatepicker' and @name ='assignleave[txtToDate]']")
	WebElement toDate;
	
	@FindBy(xpath="//input[@id ='assignBtn']")
	WebElement assignButton;
	
	
	
			
	public AssignPage() {
		super();

		PageFactory.initElements(driver, this);
	
	}
	

	
	public void  assignLeave() throws InterruptedException, IOException {
        
		
		Select sc = new Select(leavetype);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Kevin Mathews'", empname);
	    sc.selectByIndex(2);
	  
	    js.executeScript("arguments[0].value='12-05-2022'", fromDate);
	    
	    js.executeScript("arguments[0].value='13-05-2022'", toDate);
	    
	   
		assignButton.click();
		
	//	SeleniumUtils.CaptureScreen(driver,"assignPage");
		
		Thread.sleep(1000);
		
		
		
		
		
	}	
		
	}
