package com.idp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class EFLEnquiryPage {
	
	static WebDriver driver;
	Commanmethod cm = new Commanmethod();
	

	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	

	
	@FindBy(xpath="/html/body/div[7]/div/div/div[3]/div[4]/div/div[2]/a")
	public static WebElement contactuniversity;
	
	@FindBy(xpath="//input[@id='fstname']")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='lstname']")
	public static WebElement lastname;
	
	@FindBy(xpath="//input[@id='confirmEmailId']")
	public static WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='date']")
	public static WebElement date;
	
	@FindBy(xpath="//input[@id='month']")
	public static WebElement month;
	
	@FindBy(xpath="//input[@id='year']")
	public static WebElement year;
	
	@FindBy(xpath="//li[@id='resQuestion-Y']")
	public static WebElement citezenship_yes;
	
	@FindBy(xpath="//select[@id='phoneType']")
	public static WebElement phonetype;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	public static WebElement phonenumber;
	
	@FindBy(xpath="//select[@id='yearOfJoin']")
	public static WebElement startyear;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div[1]/form/div[3]/div[4]/div[3]/span[2]/div/select")
	public static WebElement startmonth;
	
	@FindBy(xpath="//li[@id='fund-58']")
	public static WebElement self_funded;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div[1]/form/div[3]/div[4]/div[5]/div[2]/div/label")
	public static WebElement tandc_checkbox;
	
	@FindBy(xpath="//input[@id='greybut']")
	public static WebElement proceedbutton;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div/form/fieldset[1]/div[2]/div/span/div[1]/div/input")
	public static WebElement password;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div/form/fieldset[2]/div[2]/div/label")
	public static WebElement newsletter_flag;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div/form/fieldset[2]/div[3]/div/label")
	public static WebElement universityupdate_flag;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div/form/fieldset[2]/div[4]/div/label")
	public static WebElement survey_flag;
	
	@FindBy(xpath="/html/body/div[7]/div/div[2]/div/div/form/div/div[1]/input")
	public static WebElement proceedbutton2;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/span/a[2]")
	public static WebElement iagreebutton;
	
	@FindBy(xpath="/html/body/div[7]/div/div/div/div/div/div/div/div[1]/p/text()")
	public static WebElement successmsg;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;
	
	
	
	
	
	
	
	
	
	
	public EFLEnquiryPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public static void eflenquiryform(String fname, String lname, String email, String day, String month1, String year1, String phonenumber1,
			String phonetype1, String countrycode, String startyear1, String startmonth1, String password1, String url, String affiliate) throws InterruptedException
	{
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);
		
		
		Commanmethod.click(contactuniversity);
		
		Commanmethod.logger = Commanmethod.report.startTest(
				"Verify EFL Enquiry Functionality in" + affiliate + "site",
				"Scope: Regression pack");
		
		if(Commanmethod.isElementPresent(iagreebutton)==true)
		{
		Commanmethod.click(iagreebutton);
		}
		
		Commanmethod.type(firstname, fname);
		Commanmethod.type(lastname, lname);
		Commanmethod.type(emailaddress, email);
		
		Commanmethod.logger.log(LogStatus.INFO, "EFL Enquiry form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		/*
		Commanmethod.type(date, day);
		Commanmethod.type(month, month1);
		Commanmethod.type(year, year1);
		*/
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", citezenship_yes); 
			
			Commanmethod.click(citezenship_yes);
		
		Commanmethod.selectDropdown(phonetype, phonetype1);
		Commanmethod.type(phonenumber, phonenumber1);
		Commanmethod.logger.log(LogStatus.INFO, "EFL Enquiry form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.selectDropdown(startyear, startyear1);
		Thread.sleep(5000);
		Commanmethod.selectDropdown(startmonth, startmonth1);
		
		/*
		Commanmethod.click(self_funded);
		*/
		Commanmethod.click(tandc_checkbox);
		
		Commanmethod.click(proceedbutton);
		
		Commanmethod.logger.log(LogStatus.INFO, "EFL Enquiry form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.type(password, password1);
		
		Commanmethod.click(newsletter_flag);
		
		Commanmethod.click(universityupdate_flag);
		
		Commanmethod.click(survey_flag);
		
		Commanmethod.click(proceedbutton2);
		Thread.sleep(5000);
		
		if(successmsg.isDisplayed())
		{
		Commanmethod.logger.log(LogStatus.PASS, "EFL Enquiry Submitted Successfully!!",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		
	}
		else
		{
			Commanmethod.logger.log(LogStatus.FAIL, "EFL Enquiry not Submitted",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

}
}
