package com.idp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class CPCEnquiryPage {
	
	
	static WebDriver driver;
	
	@FindBy(xpath=".//a[contains(@onclick, 'Email-Request')]")
	public static WebElement enquirybutton;
	
	
	
	public CPCEnquiryPage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
	
	
	public void submitCPCEnquiry()
	{
		
		Commanmethod.logger = Commanmethod.report.startTest("Verify CPC Enquiry Functionality", "Scope: Regression pack");
		Commanmethod.logger.log(LogStatus.INFO, "Navigated to CPC Page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		
		
	
		
		
	}
	
	
	
	
	
	


}
