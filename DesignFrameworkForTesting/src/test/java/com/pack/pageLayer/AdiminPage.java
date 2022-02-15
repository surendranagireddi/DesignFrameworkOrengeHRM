package com.pack.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class AdiminPage extends BaseFunction{

	@FindBy(xpath="//input[@name='btnAdd']")
	WebElement addButton;

	@FindBy(xpath="//input[@name='btnSave']")
	WebElement btnSave;

	
	
	@FindBy(xpath ="//a[text()='User Management']")
	WebElement userManagement;
	
	@FindBy(xpath ="//a[@id='menu_admin_viewSystemUsers']")
	WebElement userObject;
	
	User user = new User();

	public AdiminPage() {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	public void click() {
		addButton.click();
	}
	
	public AdiminPage saveClick() {
		
		 btnSave.click();
		 
		return new AdiminPage();
	}
	
//	public User clickOnUserPage() {
//		
//		
//		user.userclick();
//		
//		return new User();
//	}
	
}
