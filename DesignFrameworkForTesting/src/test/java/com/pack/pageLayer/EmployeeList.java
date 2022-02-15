package com.pack.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseLayer.BaseFunction;

public class EmployeeList extends BaseFunction {
	
	
	
	@FindBy(xpath="//a[text()='Employee List']")
    WebElement emplist;
	
	@FindBy(xpath="//input[@name='empsearch[employee_name][empName]']")
	WebElement empname;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	WebElement searchBtn;
	//input[@id='searchBtn']
	
	
	@FindBy(xpath="//input[@name='chkSelectAll' and @id='ohrmList_chkSelectAll']")
	WebElement chkBox;
	//input[@name='chkSelectAll' and @id='ohrmList_chkSelectAll']
	
	@FindBy(xpath="//input[@id='btnDelete']")
	WebElement delete;
	//input[@id='btnDelete']
	
    @FindBy(xpath="//input[@id='dialogDeleteBtn' and @value='Ok']")
     WebElement dltOk;
    
	//input[@id='dialogDeleteBtn' and @value='Ok']
	public EmployeeList() {
		super();

		PageFactory.initElements(driver, this);
	
	}	
	
	public void emplistClick() {
		
		emplist.click();
		
		//return new PimPage();
	}
	
	public void empSearch(String fname,String sname){
	//public void empSearch() {
		
		empname.sendKeys(fname+" "+sname);
	//	empname.sendKeys("Ananya Dash");
		
		this.searchClick();
		//searchBtn.click();
	}
	public void searchClick() {
		
		searchBtn.click();
	}
	
	public void checkBoxClick() {
		
		chkBox.click();
	}
	
	public void clickDelete() {
		delete.click();
		
		
		dltOk.click();
		
		
	}
	

}
