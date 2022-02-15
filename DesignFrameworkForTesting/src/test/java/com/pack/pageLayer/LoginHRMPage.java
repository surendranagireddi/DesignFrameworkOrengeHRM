package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class LoginHRMPage extends BaseFunction {

	
WebElement obj = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	
	WebElement ele = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	
	WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	
	
	@FindBy(xpath="//input[@name='txtUsername']")
	WebElement username;
	

	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	WebElement loginClick;
	
	public LoginHRMPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public DashBoardPage logInToHrm(String user,String pwd) throws IOException {
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginClick.click();
		
	    return  new DashBoardPage();
	}
	public String getTheTittles() {
		return driver.getTitle();
	}
   
}
