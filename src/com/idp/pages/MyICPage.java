package com.idp.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class MyICPage {

	WebDriver driver;
	Commanmethod cm = new Commanmethod();

	@FindBy(xpath="//a[@class='nma_org']")
	public static WebElement signinbtn;

	@FindBy(xpath="//input[@id='eid']")
	public static WebElement emailtxtbox;

	@FindBy(xpath="//input[@id='staticpassword']")
	public static WebElement passwordtextbox;

	@FindBy(xpath="//input[@id='loginBtn']")
	public static WebElement loginbtn;

	@FindBy(xpath="//a[contains(text(),'Admin')]")
	public static WebElement admintab;

	@FindBy(xpath="//a[contains(text(),'International back office')]")
	public static WebElement interbackofficelnk;

	@FindBy(xpath="//p[@class='mb10']//a[contains(text(),'View reviews')]")
	public static WebElement viewreviewslnk;

	@FindBy(xpath="//select[@id='fsite']")
	public static WebElement selectsite;

	@FindBy(xpath="//select[@id='fcountry']")
	public static WebElement selectcountry;

	@FindBy(xpath="//input[@id='institutionName']")
	public static WebElement instsearchbox;

	@FindBy(xpath="//input[@id='fdate']")
	public static WebElement startdte;

	@FindBy(xpath="//input[@id='tdate']")
	public static WebElement enddte;

	@FindBy(xpath="//input[@id='finderSubmit']")
	public static WebElement submitbtn;

	@FindBy(css="div.liquid.trs.vw_rev:nth-child(3) div.wrpr div.cont div.col_rgt:nth-child(3) div.dispy:nth-child(4) form.cform table.tbl.mb20:nth-child(2) tr.even td.incol table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td.w70:nth-child(2) > a:nth-child(1)")
	public static WebElement reviewname;

	@FindBy(xpath="//select[@id='istatus']")
	public static WebElement status;

	@FindBy(xpath="//select[@id='iapproved']")
	public static WebElement approve;	

	@FindBy(xpath="//input[@name='Save']")
	public static WebElement savebtn;

	@FindBy(xpath="//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[6]")
	public static WebElement reviewstatus;

	@FindBy(xpath="//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath="//a[@id='proceed-link']")
	public static WebElement proceedlink;

	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/p[1]")
	public static WebElement ps_reviewtitle;

	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/pre[1]")
	public static WebElement ps_reviewcontent;

	// click agree cookie button
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	//String screenshotPath = Commanmethod.addScreenshot();

	String statusone = "Live";
	String statustwo = "Pending";
	String statusthree = "Removed";



	public MyICPage(WebDriver driver)
	{
		this.driver=driver;
	}

	

	public void submitreview(String url,String emailid,String pwd, String affiliate, String country, String univname, String startdate, String enddate, String reviewurl, String rvwtitle, String rvwcontent) throws IOException, InterruptedException
	{
		Thread.sleep(30000);

		Commanmethod.logger = Commanmethod.report.startTest(
				"Verify Review Approval Functionality in MYIC for" +  affiliate,
				"Scope: Regression pack");
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}

		cm.click(signinbtn);
		cm.type(emailtxtbox, emailid);
		cm.type(passwordtextbox, pwd);
		cm.logger.log(LogStatus.INFO, "Sign in to MYIC application",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.click(loginbtn);
		Thread.sleep(3000);
		cm.click(admintab);
		Thread.sleep(3000);
		if(Commanmethod.isDisplayed(interbackofficelnk))
		{
			cm.click(interbackofficelnk);
			cm.logger.log(LogStatus.INFO, "Navigated to International Backoffice page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Failed to Navigate to International Backoffice page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}



		cm.click(viewreviewslnk);

		if(Commanmethod.isDisplayed(selectsite))
		{
			cm.logger.log(LogStatus.INFO, "Navigated to View Reviews Page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Application not displayed View Review Page");

		}
		cm.selectDropdown(selectsite, affiliate);

		cm.type(selectcountry, country);
		cm.type(instsearchbox, univname);
		instsearchbox.sendKeys(Keys.DOWN);
		instsearchbox.sendKeys(Keys.ESCAPE);
		cm.type(startdte, startdate);
		cm.type(enddte, enddate);
		cm.click(submitbtn);

		//checking input review name in excel and displayed review name in MyIC are same and perform action
		if(rvwtitle.equals(reviewname.getText()))
		{
			cm.click(reviewname);
		}
		else
		{   

			cm.logger.log(LogStatus.INFO, "Review name is different",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		status.sendKeys(Keys.DOWN);
		status.sendKeys(Keys.ESCAPE);
		cm.logger.log(LogStatus.INFO, "Changing Status to Live and Approve the Review",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		approve.sendKeys(Keys.DOWN);
		approve.sendKeys(Keys.ESCAPE);
		cm.click(savebtn);

		if(reviewstatus.getText().contentEquals(statusone))
		{
			cm.logger.log(LogStatus.PASS, "Review Status changed and approved successfully");
			cm.logger.log(LogStatus.INFO, "Review Status changed and approved successfully",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if(reviewstatus.getText().contentEquals(statustwo)||reviewstatus.getText().contentEquals(statusthree))
		{
			cm.logger.log(LogStatus.FAIL, "Review Status not changed or approved",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}


	}



}
