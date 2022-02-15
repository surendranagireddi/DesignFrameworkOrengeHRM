package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class AddUser extends BaseFunction {
	
	 AdiminPage adminpage ;
		


//		
//		@FindBy(xpath="//select[@id='systemUser_userType']")
//		 WebElement userRole;
//		

		@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
		WebElement empName;
		
		@FindBy(xpath="//input[@id='systemUser_userName']")
		WebElement username;
		
		
		@FindBy(xpath="//select[@id='systemUser_status']")
		WebElement status;
		
		@FindBy(xpath="//input[@id='systemUser_password']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
		WebElement cnfPassword;
		
		@FindBy(xpath="//input[@name='btnSave']")
		WebElement btnSave;
		
		
		
		@FindBy(xpath="//input[@name='btnAdd']")
		WebElement addButton;
		
    	@FindBy(xpath="//input[@name='searchSystemUser[userName]']")
	   WebElement username1;
	
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;


		public AddUser() {
			super();
			
			PageFactory.initElements(driver, this);
		}
		
		public void cick() {
			addButton.click();
		}
		

		public AdiminPage addUser(String empNam ,String userName,String pwd,String cnfPass) throws IOException, InterruptedException {
			Select userrole = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
              userrole.selectByIndex(1);
	       
		     empName.sendKeys(empNam);
		     username.sendKeys(userName);
		     
		     Select sc = new Select(status);
		     sc.selectByIndex(0);
		      
		      password.sendKeys(pwd);
		      cnfPassword.sendKeys(cnfPass);
		      
    //		 js.executeScript("arguments[0].click();", btnSave);
		      
	//	      this.saveClick();
		      btnSave.click();
		      
		      Thread.sleep(1000); 
		      
		 //     SeleniumUtils.CaptureScreen(driver,"addUser");
		     
		      return new AdiminPage();
		     	
		        	 
			
			
		}
	public void saveUser() {
		btnSave.click();
	}


		
		

		
}
