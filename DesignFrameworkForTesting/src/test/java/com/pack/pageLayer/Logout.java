package com.pack.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class Logout extends BaseFunction {
	
	@FindBy(xpath="//a[@id='welcome']")//a[@id='welcome']
	WebElement user;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;

	public Logout() {
		super();

	PageFactory.initElements(driver, this);
		
	}
	
	
	public void logout() {
		
		Actions action = new Actions(driver);
		action.moveToElement(user).perform();
		
	    WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
	    logOut.click();
		
		
		
	}
	
	

}
