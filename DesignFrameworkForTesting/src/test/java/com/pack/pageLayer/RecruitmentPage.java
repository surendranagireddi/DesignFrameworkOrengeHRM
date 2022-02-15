package com.pack.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class RecruitmentPage extends BaseFunction {
	
	
	@FindBy(xpath="//input[@name='btnAdd']")
	WebElement addBtn;
	
	
	
	

	public RecruitmentPage() {
		super();

	   PageFactory.initElements(driver, this);
	   
	}
	public void addClick() {
		
		addBtn.click();
		
	}
	
	
	
	
	
	

}
