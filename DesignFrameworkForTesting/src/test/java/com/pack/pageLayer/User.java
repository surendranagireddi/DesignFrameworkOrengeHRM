package com.pack.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class User extends BaseFunction {
	
	

 
 @FindBy(xpath ="//input[@name='searchSystemUser[userName]']")
 WebElement username;
 
 @FindBy(xpath="//input[@name='_search' and @value='Search']")
 WebElement search;

	@FindBy(xpath ="//a[text()='User Management']")
	WebElement userManagement;
	
	@FindBy(xpath ="//a[@id='menu_admin_viewSystemUsers']")
	WebElement userObject;
	
	@FindBy(xpath ="//input[@type ='checkbox' and @name ='chkSelectAll']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@id='btnDelete' and @value='Delete']")
	WebElement deleteUser;
	
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")
	WebElement dltOk;
	
	@FindBy(xpath="//input[@type ='button' and @value ='Cancel']")
	WebElement cancel;
	
	
public User() {
	super();

	PageFactory.initElements(driver, this);

}


 

public void userclick() {
	

	 Actions action =  new Actions(driver);
	 
	 action.moveToElement(userManagement).perform();
	 WebElement link = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	 
    link.click();
	
}
public void systemUser(String userName) {
	
	username.sendKeys(userName);
	  search.click();
	
}
public void checkBoxClick() {
	
	checkbox.click();
}
 
public void deleteUser() {
	deleteUser.click();
	
	dltOk.click();
	
}
 
 

}
