package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;
import com.pack.utilsLayer.SeleniumUtils;

public class Candidate extends BaseFunction{

	

       @FindBy(xpath="//input[@name='candidateSearch[candidateName]']") //input[@name='candidateSearch[candidateName]']
       WebElement candidateName;

       @FindBy(xpath="//input[@id='btnSrch']")//input[@id='btnSrch']
       WebElement search;

     @FindBy(xpath="//input[@name='chkSelectAll']")//input[@name='chkSelectAll']
      WebElement checkBox;
     @FindBy(xpath="//input[@id='btnDelete']")//input[@id='btnDelete']
     WebElement delete;
	
     @FindBy(xpath="//input[@id='dialogDeleteBtn']")//input[@id='dialogDeleteBtn']
     WebElement dltOk;
	public Candidate() {
		super();

		PageFactory.initElements(driver, this);
	}
	
	public void searchCandidate(String fname, String lname) {
		
		candidateName.sendKeys(fname+" "+lname);
		
		search.click();
		
	}
	
	
	public void deleteCandidate() throws InterruptedException, IOException {
		checkBox.click();
		delete.click();
		Thread.sleep(3000);
		dltOk.click();
		
		
		 SeleniumUtils.CaptureScreen(driver,"candidateDlt");
		
		
		
	}
	
	
	

}
