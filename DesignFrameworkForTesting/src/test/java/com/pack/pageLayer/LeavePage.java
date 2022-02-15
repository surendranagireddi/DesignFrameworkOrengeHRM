package com.pack.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pack.BaseLayer.BaseFunction;

public class LeavePage extends BaseFunction {

	
	@FindBy(xpath="//a[text()='Assign Leave']")
	WebElement assignObj;
	
	@FindBy(xpath="//a[@id='menu_leave_applyLeave']")
	WebElement apply;

	@FindBy(xpath="//a[text()='Leave List']")
	WebElement leaveList;

	public LeavePage() {
		super();
		PageFactory.initElements(driver, this);
		

	}
	public void assignClick() throws InterruptedException {
		assignObj.click();
		Thread.sleep(3000);
		//
	}
	
	public void leaveListClick() {
		leaveList.click();
	}
	public void applayLeaveTest() throws InterruptedException {
		apply.click();
		Thread.sleep(1000);
	}
	

	

	
	
	

}
