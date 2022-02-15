package com.pack.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class DashBoardPage extends BaseFunction {

   @FindBy(xpath="//span[text()='Assign Leave']")

   WebElement assignleavebtn;
   
   @FindBy(xpath = "//b[text()='Admin']")
	WebElement admin;
	
	@FindBy(xpath="//b[text()='PIM']")
	WebElement pim;
	
	@FindBy(xpath ="//b[text()='Recruitment']")
	WebElement recruit;
	
	@FindBy(xpath="//b[text()='Directory']")
	WebElement directory;
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement logout;
	
	
	@FindBy(xpath="//span[text()='Apply Leave']")
	WebElement applayLeave;
	
	@FindBy(xpath="//input[@name='btnSave']")
	WebElement btnSave;
	
	@FindBy(xpath="//input[@name='btnAdd']")
	WebElement addBtn;
	
	@FindBy(xpath="//b[text()='Leave']")
	WebElement leaveObj;
	
	
	
	
   
   public DashBoardPage() throws IOException{
	   super();
	   PageFactory.initElements(driver, this);
	  
   }

	  
   public ApplayLeave applayLeave() { 
	   applayLeave.click();
	   
	   return new ApplayLeave();
	   
   }
   
   
	   public void clickAssignLeave(){
		   assignleavebtn.click();
		   
		  
}
	   public AdiminPage adiminClick() {
			admin.click();
		    

			return new AdiminPage();
		}
		public PimPage pimClick() {
			pim.click();
			
			return new PimPage();
		}
		public LeavePage leaveClick() {
			
			
			leaveObj.click();
			
			return new LeavePage();
		}
		
		public RecruitmentPage recruitClick() {
			
			recruit.click();
			return  new RecruitmentPage();
			
		}
		public Directory directoryClick() {
			directory.click();
			return new Directory();
		}
		public Logout logoutClick() {
			
			logout.click();
			return new Logout();
		}
		public AdiminPage addClick() {
		
		addBtn.click();
			 
   			 return  new AdiminPage();
		}
		
	
}
