package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class ApplayLeave extends BaseFunction {
	
//	@FindBy(xpath="//span[text()='Apply Leave']")
//	WebElement applayLeave;


	@FindBy(xpath="//a[@id='menu_leave_applyLeave']")
	WebElement apply;
	
	@FindBy(xpath="//select[@id='applyleave_txtLeaveType']")
	WebElement leavetype;
	
	@FindBy(xpath="//input[@id='applyleave_txtFromDate']")
	WebElement fromDate;
	
	@FindBy(xpath="//input[@id='applyleave_txtToDate']")
	WebElement toDate;
	
	@FindBy(xpath="//input[@id='applyBtn']")
	WebElement aply;

	public ApplayLeave() {
		super();
     PageFactory.initElements(driver, this);
	
	}
	
	public void applyLeaveClick() throws IOException {
				apply.click();
	
	}
	public void applayLeave() {
		
		Select sc = new Select(leavetype);
	 //	sc.selectByIndex(1);
		sc.selectByVisibleText("CAN - Bereavement");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		  js.executeScript("arguments[0].value='2022-05-12'", fromDate);
		  js.executeScript("arguments[0].value='2022-05-13'", toDate);
		
		aply.click();
		
	}
	

}
