package com.idp.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class CallbackFormPage {
	
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
//	@FindBy(xpath="//*[@id=\"con-for-nav-a\"]/div[3]/div[2]/div[2]/h1/a")
//	public static WebElement univ_name;
//	public String Univ_name = univ_name.getText();
	
	@FindBy(id="contInst")   
	public static WebElement getappadvice;
	@FindBy(xpath="//*[@id=\"cookiePopUpId\"]/div/span/a[2]")
	public static WebElement gotit;
	@FindBy(id="fstname_splash")
	public static WebElement firstname;
	@FindBy(id="lstname_splash")	
	public static WebElement lastname;
	@FindBy(id="confirmEmailId_splash")
	public static WebElement emailid;
	@FindBy(id="phoneNo_splash")
	public static WebElement phoneno;
	@FindBy(id="yournationality_splash")
	public static WebElement nationality;
	@FindBy(id="destCtryId_splash")
	public static WebElement studydest;
	@FindBy(id="studyLevel_splash")
	public static WebElement studylvl;
	@FindBy(id="yearValue_splash")
	public static WebElement studyyear;
	@FindBy(id="counsellingMode2_splash")
	public static WebElement how_would_you_like_counselled;
	
	@FindBy(xpath="//*[@id=\"enquirydiv\"]/fieldset[2]/div[1]/div/label")
	public static WebElement consentFlag;
	
	@FindBy(xpath="/html/body/div[17]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div[3]/div/form/div[4]/fieldset[2]/div[1]/div/label")
	public static WebElement terms_chk;
	
	@FindBy(xpath="/html/body/div[17]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div[3]/div/form/div[4]/fieldset[2]/div[2]/div/label")
	public static WebElement contactMeByFlag;
	@FindBy(xpath="/html/body/div[17]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div[3]/div/form/div[4]/fieldset[2]/div[4]/div/label")
	public static WebElement shareIdpLeadUniFlag;
	@FindBy(xpath="//input[@id='greybut_splash']")
	public static WebElement getadvicebtn;
	@FindBy(id="officeId_splash")
	public static WebElement officeid;
	@FindBy(id="cal_back_continue_splash")
	public static WebElement cal_back_continue;
	@FindBy(id="otpNo")
	public static WebElement verification;
	@FindBy(id="call_us_veri_sub")
	public static WebElement verif_submit;
	@FindBy(id="calbackLightbox")
	public static WebElement lightbox;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement passwd;
	
	
	@FindBy(xpath=".//label[@for='acceptBtnId']")
	public static WebElement acceptbtn;
	
	@FindBy(id="cal_back_success")
	public static WebElement calbacksuccess;
	

	
	@FindBy(xpath="//a[@class='wba']")
	public static WebElement cbuniv;
	
	
	@FindBy(xpath="//a[@id='tpNvInspLnk']")
	public static WebElement getinsplnk;
	
	@FindBy(xpath = "//a[contains(text(),'Articles')]")
	public static WebElement getinsparticles;
	
	@FindBy(xpath="//a[@class='gt_it']")   
	public static WebElement iagreebtn;
	
	@FindBy(xpath="//h2[contains(text(),'Europe')]")
	public static WebElement europepod;
	
	//UK element identifiers
	
	@FindBy(xpath="//span[contains(text(),'UK')]")
	public static WebElement uklnk;
	
	@FindBy(xpath="//div[@class='flud mt20 new_atlc']//div[contains(@class,'new_vw_svl')]//div[@class='shdw']")
	public static WebElement articlelnk;
	
	@FindBy(xpath="//div[@class='Hidp_hdcont']//p[contains(text(),'Our counsellors at IDP Education offer personal ad')]")
	public static WebElement cbfopenpodheader;
		
	
	@FindBy(xpath="//div[@class='Hidp_flds']")
	public static WebElement artcbform;
	
	@FindBy(xpath="//span[contains(text(),'All Articles')]")
	public static WebElement allarticlebreadcrumb;
	
	//Canada element identifiers
	
	
	@FindBy(xpath="//h2[contains(text(),'North America')]")
	public static WebElement northamerpod;
	
	@FindBy(xpath="//span[contains(text(),'Canada')]")  
	public static WebElement canadalnk;
	
	@FindBy(xpath="//span[contains(text(),'Ireland')]")
	public static WebElement irelandlnk;
	
	//USA element identifiers
	@FindBy(xpath="//span[contains(text(),'USA')]")    
	public static WebElement usalnk;
	
    //Study abroad identifiers
	@FindBy(xpath="//h2[contains(text(),'Study Abroad Info')]")
	public static WebElement studyabroadlnk;
	
	@FindBy(xpath="//h2[contains(text(),'Cross-border Study')]")
	public static WebElement crosborderlnk;
	
	@FindBy(xpath="//h1[contains(text(),'What is cross-border study?')]")
	public static WebElement crosborderarthead;
	
	
	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath= "//input[@id='consentFlag']")
	public static WebElement sharerelevantinfo;
	
	@FindBy(xpath="//a[@class='wba']")
	public static WebElement universityname;
	
	@FindBy(xpath="//div[@class='fl_ctr counsel']//a[1]")
	public static WebElement virtualcounselingbutton_thai;
	
	@FindBy(xpath="/html/body/div[13]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[4]/form/fieldset[2]/div[2]/div/input")
	public static WebElement newsletter_chkbox;
	
	@FindBy(xpath="/html/body/div[13]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[4]/form/fieldset[2]/div[3]/div/input")
	public static WebElement universityupdate_chkbox;
	
	@FindBy(xpath="/html/body/div[13]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[4]/form/fieldset[2]/div[4]/div/label/div/text()")
	public static WebElement survey_chkbox;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;
	
	
	
	
	

	
	public CallbackFormPage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
	public void submitcallbackform(String fname, String lname, String emailaddress,String phonenumber, String countryofresidence, String destination, String studylevel, String startyear, String idpoffice,String affiliateid, String password, String url, String affiliatename) throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);
		Commanmethod.logger = Commanmethod.report.startTest("Verify CallBack Form Functionality in " + affiliatename + "affiliate", "Scope: Regression pack");
		cm.logger.log(LogStatus.INFO, "Navigated to Content Hub Page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		String studylevelvalue =  cm.getProperty("callback_studylevel");
		Commanmethod.waitUntilElementVisible(getappadvice, 500);
		
		cm.click(getappadvice);
		Commanmethod.waitUntilElementVisible(firstname, 500);
		cm.logger.log(LogStatus.INFO, "Navigated to Callback form Page 1",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//		Boolean isPresen1 = Commanmethod.isDisplayed(gotit);
//
//		if (isPresen1 == true) {
//			cm.click(gotit);
//		}
		cm.type(firstname, fname);
		cm.type(lastname,lname);
		cm.type(emailid, emailaddress);
//		emailid.sendKeys(Keys.TAB);
		cm.type(phoneno, phonenumber);
		
				
//		if(Commanmethod.isElementPresent(nationality)==true)
//		{
//			cm.selectDropdown(nationality, countryofresidence);
//		}
		
		cm.scroll();
		cm.selectDropdown(studydest, destination);
		
		cm.selectDropdown(studylvl, studylevel);
		cm.selectDropdown(studyyear, startyear);
		
		Commanmethod.waitUntilElementVisible(how_would_you_like_counselled, 1000);
		cm.scrollup();
		
//		Boolean virtualcounsellingbtn_isPresent = Commanmethod.isEnabled(virtualcounselingbutton_thai);
//		
//		if(virtualcounsellingbtn_isPresent == true)
//		{
//		
//		cm.click(virtualcounselingbutton_thai);
//		}
		cm.click(how_would_you_like_counselled);
		
		Thread.sleep(3000);
		cm.scrolldown();
		
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].scrollIntoView(true);", terms_chk);
		cm.click(terms_chk);
		
		//cm.click(terms_chk);
		
		
		cm.click(contactMeByFlag);
		
		Commanmethod.waitUntilElementVisible(shareIdpLeadUniFlag, 1000);
		
		if(Commanmethod.isElementPresent(shareIdpLeadUniFlag)==true)
		{
			cm.click(shareIdpLeadUniFlag);
		}
		
		
		cm.logger.log(LogStatus.INFO, "Filled Callback form Page 1",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.click(getadvicebtn);
		Commanmethod.waitUntilElementVisible(officeid, 2000);
		cm.logger.log(LogStatus.INFO, "Navigated to Callback form Page 2",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.selectDropdown(officeid, idpoffice);
		cm.logger.log(LogStatus.INFO, "Filled Callback form Page 2",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Commanmethod.waitUntilElementVisible(cal_back_continue, 2000);
		cm.click(cal_back_continue);
		//cm.getOTP(emailaddress, affiliateid);
		cm.type(verification, cm.getOTP(emailaddress, affiliateid));
		cm.click(verif_submit);
		Commanmethod.waitUntilElementVisible(cal_back_continue, 5000);
		cm.logger.log(LogStatus.INFO, "Navigated to Callback form Page 3",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.type(passwd, password);

		Thread.sleep(1000);

		
		
		cm.click1(acceptbtn);
		
		
		
		cm.logger.log(LogStatus.INFO, "Filled Callback form Page 3",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].scrollIntoView(true);", calbacksuccess);    
		calbacksuccess.click();

			
		Commanmethod.waitUntilElementVisible(universityname, 10000);
		
		
		if(Commanmethod.isElementPresent(universityname)==true)
		{
			cm.logger.log(LogStatus.INFO, "Call back form is submitted.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		String User_id = cm.getuserid(affiliateid, emailaddress);
		
		if(User_id.equals("null"))
		{
			Commanmethod.logger.log(LogStatus.FAIL, "User not registered in DB");
		}
		else
		{
			Commanmethod.logger.log(LogStatus.PASS, "User registered in DB and User ID is "+ User_id);
		}
		
		
		
			
}
}
