package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class AddCandidate extends BaseFunction {
	
	 @FindBy(xpath="//input[@id='addCandidate_firstName']")//input[@id='addCandidate_firstName']
	 WebElement fname;
	
     @FindBy(xpath="//input[@id='addCandidate_lastName']")//input[@id='addCandidate_lastName']
	 WebElement lname;
		
     @FindBy(xpath="//input[@id='addCandidate_email']")	//input[@id='addCandidate_email']
	 WebElement email;
		
     @FindBy(xpath="//select[@id='addCandidate_vacancy']") //select[@id='addCandidate_vacancy']	
	 WebElement vacancy;

     @FindBy(xpath="//input[@id='addCandidate_contactNo']") //input[@id='addCandidate_contactNo']
	 WebElement contact;

	@FindBy(xpath="//input[@id='addCandidate_consentToKeepData']") 	//input[@id='addCandidate_consentToKeepData']
	 WebElement	keepData;
		
	@FindBy(xpath="//input[@id='btnSave']") //input[@id='btnSave']
	 WebElement save;

	public AddCandidate() {
		super();

		PageFactory.initElements(driver, this);
	
	}
	
	public void addCanditae(String firstname,String secondname,String emailId, String contactNo ) throws IOException, InterruptedException {
		
		fname.sendKeys(firstname);
		lname.sendKeys(secondname);
		email.sendKeys(emailId);
		contact.sendKeys(contactNo);
		
		Select sc  = new Select(vacancy);
		sc.selectByIndex(2);
		keepData.click();
		
		save.click();
		Thread.sleep(2000);
		SeleniumUtils.CaptureScreen(driver,"AddCandidate");
		
	}
	
	
	


}
