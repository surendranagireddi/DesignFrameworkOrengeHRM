package com.pack.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class Directory extends BaseFunction {
	
	@FindBy(xpath="//b[text()='Directory']")//b[text()='Directory']
    WebElement directory;
	
	@FindBy(xpath="//input[@id='searchDirectory_emp_name_empName']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='searchBtn' and @name='_search']")
	WebElement search;
	
    @FindBy(xpath="//b[text()='Lisa Andrews']")
    WebElement verifyTxt;
	
	public Directory() {
		super();
     PageFactory.initElements(driver, this);
	
     
	}
	public void verifyText() {
	
		verifyTxt.click();
		
	}
	
	public void SearchDirectory() throws InterruptedException{
		
		name.sendKeys("Lisa Andrews");
		
		
		search.click();
		Thread.sleep(3000);
		
		
	}
	
	
	
	

}
