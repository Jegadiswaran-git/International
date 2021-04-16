package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.CallbackThreadInitializer;

public class DPForm {

	static WebDriver driver;
	static Commanmethod cm = new Commanmethod();
	// click search icon
	@FindBy(xpath = "//i[@class='fa fa-search fa-2x']")
	public static WebElement searchlensicon;

	// top nav search
	@FindBy(xpath = "//input[@id='topNavSrch']")
	public static WebElement topnavsearch;

	// click university from ajax
	@FindBy(xpath = "//span[@id='univ_0']")
	public static WebElement univsearch;

	// click university from university list
	@FindBy(xpath = "//*[@id='profileLink']")
	public static WebElement univselect;
	
	@FindBy(xpath = "//a[@id='profileLink']")
	public static WebElement univselect1;

	// Click Contact institution button
	@FindBy(id = "contInst")
	public static WebElement contactinstitution;

	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	// Enter Firstname
	@FindBy(id = "fstname")
	public static WebElement firstname;

	// Enter Lastname
	@FindBy(id = "lstname")
	public static WebElement lastname;

	// Enter email address
	@FindBy(id = "confirmEmailId")
	public static WebElement confirmEmailId;

	// Enter dob date
	@FindBy(id = "date")
	public static WebElement datefld;

	// Enter dob month
	@FindBy(id = "month")
	public static WebElement monthfld;

	// Enter dob year
	@FindBy(id = "year")
	public static WebElement yearfld;

	//// Select country of residence
	@FindBy(id = "countryOfResidence")
	public static WebElement countryofresidencefld;

	// Country of citizenship
	@FindBy(id = "resQuestion-Y")
	public static WebElement citizenship;

	// Select mobile type
	@FindBy(id = "phoneType")
	public static WebElement phoneType;

	// Select country code
	@FindBy(id = "countryCode")
	public static WebElement countryCode;

	// Enter phone number
	@FindBy(id = "phoneNumber")
	public static WebElement phoneNumber;

	//// Select study level
	@FindBy(id = "studyLevelId")
	public static WebElement studylevelfld;

	// Select Subject
	@FindBy(xpath = "//*[@id='enquirySubjectId']")
	public static WebElement selectsubject;

	// select start year
	@FindBy(id = "yearOfJoin")
	public static WebElement startyearfld;

	// Select fund
	@FindBy(xpath = "//li[@id='fund-58']")
	public static WebElement fund;

	// Select consent flag
	@FindBy(xpath = "//div[@id='enquirydiv']//div//div[@id='acceptDiv']//div//label")
	public static WebElement consentflg;

	// select T&C
	@FindBy(xpath = "//div[@class='hldr enq_hl cnfrm_sec']//label")
	public static WebElement acceptBtn;

	// step1 proceed button
	@FindBy(xpath = "//input[@id='greybut']")
	public static WebElement step1proceed;

	// Enter password
	@FindBy(id = "passwordValue")
	public static WebElement passwordfld;

	// Newsletter flag
	@FindBy(xpath = "//*[@id='newsLetterDiv']/div/label")
	public static WebElement newslettrflg;

	// Solus flag
	@FindBy(xpath = "//*[@id='univUpdatesDiv']/div/label")
	public static WebElement solusflg;

	// survey flag
	@FindBy(xpath = "//*[@id='surveyDiv']/div/label")
	public static WebElement surveyflg;

	// click proceed button in step 2
	@FindBy(xpath = "//input[@id='greybut']")
	public static WebElement step2proceed;

	// click continue exploring
	@FindBy(xpath = "//a[@class='fl']")
	public static WebElement continueexploring;

	// click login button
	@FindBy(xpath = "//span[@id='alreadyregisterandlogin']")
	public static WebElement loginbtn;

	// Enter email address
	@FindBy(xpath = "//input[@id='eMail']")
	public static WebElement loginemail;

	// Enter password
	@FindBy(xpath = "//input[@id='passwordVal']")
	public static WebElement loginpwd;

	// click log me in button
	@FindBy(xpath = "//a[@id='loginAjaxBtn']")
	public static WebElement logmein;

	// click dp dot navigation
	@FindBy(xpath = "//li[@id='nav-p']")
	public static WebElement dpdotnav;

	// click download prpspectus button
	@FindBy(xpath = "//a[@id='downloadprosLink']")
	public static WebElement dpbtn;

	// click download button in the form
	@FindBy(xpath = "//input[@id='greybut']")
	public static WebElement downldbtn;

	@FindBy(xpath = "//span[@class='fa fa-heart-o']")
	public static WebElement praddfavlink;

	@FindBy(xpath = "//a[@id='tpNvInspLnk']")
	public static WebElement getinsplnk;

	@FindBy(xpath = "//*[@id='sub7']/li[3]/a")
	public static WebElement univproslnk;

	@FindBy(xpath = "//h1[@class='dpros']")
	public static WebElement proslstpagetitle;

	@FindBy(xpath = "//body/div[@id='sr_result']/div[@class='container']/div[@id='dp_list']/div[@id='bnrLhsDivId']/div[1]/div[1]/div[2]/a[1]")
	public static WebElement proslstdownlbtn;

	@FindBy(xpath = "//*[@id=\"sticky\"]/div/div")
	public static WebElement successmsg;

	@FindBy(xpath = "//span[@class='lo_ur']//img")
	public static WebElement loginicn;

	@FindBy(xpath = "//*[@id=\"topNavLogDiv\"]/div[3]/ul/li[1]/a")
	public static WebElement myprospectuslnk;

	@FindBy(xpath = "//div[@class='enq_st']//div[1]//div[1]//div[2]//div[3]//button[1]")
	public static WebElement myprospectusdpbtn;

	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;

	@FindBy(xpath = "//button[@id='topNavSrchBtn']")
	public static WebElement topnavsearchbtn;

	@FindBy(xpath = "//span[@class='cls_rgt']")
	public static WebElement closepopup;

	@FindBy(xpath = "//div[@class='dptx']")
	public static WebElement successelmnt;
	
	@FindBy(xpath="//select[@id='yournationality']")
	public static WebElement nationality;
	
	@FindBy(xpath="//*[@id='wrapper']/div/a/img")
	public static WebElement abroadlogo;
	
	@FindBy(xpath="//select[@name='yearOfJoin']")
	public static WebElement startyear;
	
	@FindBy(xpath="//select[@name='monthOfJoin']")
	public static WebElement startmonth;
	

	@FindBy(xpath="//a[contains(text(),'Allow All')]")
	public static WebElement allowallcookies;
	
	// verify Get advice megamenu option
		@FindBy(xpath = "//a[@id='tpNvCrseLnk']")
		public static WebElement getadvicelink;
		
		// verify chatbot button megamenu option
		@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
		public static WebElement chatbot_button;

		// verify university rankings megamenu option
		@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
		public static WebElement university_rankings_link;
		
		// verify university prospectus megamenu option
		@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		public static WebElement university_prospectus_link;

	public DPForm(WebDriver driver) {
		this.driver = driver;
	}

	public void newdpform(String univname, String fname, String lname, String emailaddress, String date, String month,
			String year, String phonenumber, String phonetype, String countrycode, String studylevel,String studylevel2, String subject,
			String startyear, String password, String subject2, String countryofresidence, String yournationality, String url, String affiliate, String startYear, String startMonth,String affiliate_id)
			throws IOException, InterruptedException, SQLException {
		Boolean isPresen = Commanmethod.isDisplayed(advancedlink);

		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		
		if(Commanmethod.isElementPresent(allowallcookies)==true)
		{
			Commanmethod.click(allowallcookies);
         
		}
		
		
	

		Commanmethod.waitUntilElementVisible(searchlensicon, 1000);
		Commanmethod.click(searchlensicon);
		Commanmethod.type(topnavsearch, univname);
		Thread.sleep(4000);
		Commanmethod.click(topnavsearchbtn);
		// topnavsearch.sendKeys(Keys.DOWN);topnavsearchbtn
		// Thread.sleep(1000);
		// topnavsearch.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		if(Commanmethod.isDisplayed(gotit))
		{
			Commanmethod.click(gotit);
         
		}


		Commanmethod.click(univselect);

		

		Commanmethod.scrolldown();
		Thread.sleep(10000);
		// click download prospectus dot navigation
		
		Commanmethod.click(dpdotnav);
		
		Thread.sleep(15000);

		

		
		Thread.sleep(5000);
		// click download prospectus button
		Commanmethod.scrollup();
		Commanmethod.scrolldown();
		Thread.sleep(5000);

		if(Commanmethod.isElementPresent(gotit)==true)
		{
			Commanmethod.click(gotit);
         
		}

		Commanmethod.click(dpbtn);

		Thread.sleep(5000);
		// click accept cookies button

		if(Commanmethod.isElementPresent(gotit)==true)
		{
			Commanmethod.click(gotit);
         
		}
		Commanmethod.logger = Commanmethod.report.startTest(
				"Verify Download Prospectus Functionality in Profile Page/My Prospectus/Prospectus Listing Page -"
						+ affiliate,
				"Scope: Regression pack");

		Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus Enquiry Started");
		Commanmethod.logger.log(LogStatus.INFO, "Application navigated to Profile Page DP form");
		Commanmethod.logger.log(LogStatus.PASS, "Application navigated to Profile Page DP form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		// Enter details in Step 1
		Commanmethod.type(firstname, fname);
		Commanmethod.type(lastname, lname);
		Commanmethod.type(confirmEmailId, emailaddress);

		if(Commanmethod.isElementPresent(datefld)==true)
		{
			Commanmethod.click(datefld);
         
		}

		if(Commanmethod.isElementPresent(monthfld)==true)
		{
			Commanmethod.click(monthfld);
         
		}

		if(Commanmethod.isElementPresent(yearfld)==true)
		{
			Commanmethod.click(yearfld);
         
		}
		
	
		//Commanmethod.click(citizenship);
		Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus form in Profile page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		if(Commanmethod.isElementPresent(phoneType)==true)
		{
			Commanmethod.click(phoneType);
         
		}

		if(Commanmethod.isElementPresent(countryCode)==true)
		{
			Commanmethod.click(countryCode);
         
		}

		if(Commanmethod.isElementPresent(phoneNumber)==true)
		{
			Commanmethod.click(phoneNumber);
         
		}
		Commanmethod.scrolldown();
		Commanmethod.selectDropdown(studylevelfld, studylevel);
		
		Commanmethod.waitUntilElementVisible(selectsubject, 2000);
		//new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(selectsubject));
			
		Commanmethod.selectDropdown(selectsubject, subject);
		Commanmethod.selectDropdownVisibleText(startyearfld, startYear);
		Commanmethod.waitUntilElementVisible(startmonth, 5000);
		Commanmethod.selectDropdown(startmonth, startMonth);

		if(Commanmethod.isElementPresent(fund)==true)
		{
			Commanmethod.click(fund);
         
		}

		Commanmethod.scrolldown();

		if(Commanmethod.isElementPresent(consentflg)==true)
		{
			Commanmethod.click(consentflg);
         
		}

		Commanmethod.scrolldown();

//		Boolean isPresent12 = Commanmethod.isEnabled(acceptBtn);
//		if (isPresent12 == true) {
//			Commanmethod.click(acceptBtn);
//		}
		Commanmethod.waitUntilElementVisible(step1proceed, 2000);

		Commanmethod.click(step1proceed);
		
		
		if(Commanmethod.isElementPresent(successelmnt)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus submitted successfully in Profile page");
			Commanmethod.logger.log(LogStatus.PASS, "Download Prospectus submitted successfully in Profile page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         
		}
		
		else {

			Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus not submitted  in Profile page");
			Commanmethod.logger.log(LogStatus.PASS, "Download Prospectus not submitted  in Profile page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}

		

		Commanmethod.waitUntilElementVisible(passwordfld, 6000);
		// Enter details in step 2
		Commanmethod.type(passwordfld, password);
		if (Commanmethod.isDisplayed(newslettrflg) && Commanmethod.isDisplayed(solusflg)
				&& Commanmethod.isDisplayed(surveyflg)) {
			Thread.sleep(2000);
			Commanmethod.click(newslettrflg);
			Commanmethod.click(solusflg);
			Commanmethod.click(surveyflg);
			Commanmethod.scrolldown();
			Commanmethod.click(step2proceed);
		} else {
			System.out.println("Please Enter password or select any subscription flags");
			Commanmethod.logger.log(LogStatus.INFO, "Password or subcription flags are not selected");
			Commanmethod.logger.log(LogStatus.PASS, "Password or subcription flags are not selected",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		Thread.sleep(3000);
		Commanmethod.logger.log(LogStatus.INFO, "Registration submitted successfully");
		Commanmethod.logger.log(LogStatus.PASS, "Registration submitted successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		Commanmethod.click(continueexploring);
		// Download prospectus verification in My prospectus page
		Commanmethod.waitUntilElementVisible(loginicn, 7000);
		Commanmethod.click(loginicn);
		Commanmethod.waitUntilElementVisible(myprospectuslnk, 8000);
		Commanmethod.click(myprospectuslnk);
		Commanmethod.scrolldown();
		Commanmethod.logger.log(LogStatus.INFO, "Application navigated to My Prospectus page");
		Commanmethod.logger.log(LogStatus.PASS, "Application navigated to My Prospectus page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Commanmethod.waitUntilElementVisible(myprospectusdpbtn, 7000);
		
//		if(Commanmethod.isDisplayed(myprospectusdpbtn) && Commanmethod.isEnabled(myprospectusdpbtn))
//		{
		Commanmethod.click(myprospectusdpbtn);

		Commanmethod.logger.log(LogStatus.PASS, "Navigated to Download Prospectus form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		if(Commanmethod.isElementPresent(phoneType)==true)
		{
			Commanmethod.click(phoneType);
         
		}

		if(Commanmethod.isElementPresent(countryCode)==true)
		{
			Commanmethod.click(countryCode);
         
		}

		if(Commanmethod.isElementPresent(phoneNumber)==true)
		{
			Commanmethod.click(phoneNumber);
         
		}
		
		if(Commanmethod.isElementPresent(datefld)==true)
		{
			Commanmethod.click(datefld);
         
		}

		if(Commanmethod.isElementPresent(monthfld)==true)
		{
			Commanmethod.click(monthfld);
         
		}

		if(Commanmethod.isElementPresent(yearfld)==true)
		{
			Commanmethod.click(yearfld);
         
		}
		


		Commanmethod.scrolldown();
		Commanmethod.selectDropdown(studylevelfld, studylevel2);
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(selectsubject));
		Commanmethod.selectDropdown(selectsubject, subject);
		Commanmethod.selectDropdownVisibleText(startyearfld, startYear);
		Commanmethod.waitUntilElementVisible(startmonth, 2000);
		Commanmethod.selectDropdown(startmonth, startMonth);

		
		if(Commanmethod.isElementPresent(fund)==true)
		{
			Commanmethod.click(fund);
         
		}


		Commanmethod.click(downldbtn);
		
		
		if(Commanmethod.isElementPresent(successelmnt)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus submitted successfully in MyProspectus page");
			Commanmethod.logger.log(LogStatus.PASS, "Download Prospectus submitted successfully in MyProspectus page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         
		}
		
		else {

			Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus not submitted  in MyProspectus page");
			Commanmethod.logger.log(LogStatus.PASS, "Download Prospectus not submitted  in MyProspectus page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		
		
		if(Commanmethod.isElementPresent(continueexploring)==true)
		{
			Commanmethod.click(continueexploring);
         
		}
		
		else {

			Commanmethod.click(abroadlogo);

		}

			
		
		Commanmethod.waitUntilElementVisible(getadvicelink, 10000);
		// Download prospectus verification in Prospectus listing page
		Commanmethod.click(getadvicelink);
		Commanmethod.click(university_prospectus_link);
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}

		Commanmethod.logger.log(LogStatus.INFO, "Application navigated to Prospectus listing page");
		Commanmethod.logger.log(LogStatus.PASS, "Application navigated to Prospectus listing page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		if(Commanmethod.isElementPresent(gotit)==true)
		{
			Commanmethod.click(gotit);
         
		}
		Commanmethod.scrolldown2();
		Commanmethod.click(proslstdownlbtn);

		Commanmethod.logger.log(LogStatus.PASS, "Navigated to Download Prospectus form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		Commanmethod.scrolldown();
		Commanmethod.selectDropdown(studylevelfld, studylevel);
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(selectsubject));
		Commanmethod.selectDropdown(selectsubject, subject);
		Commanmethod.selectDropdownVisibleText(startyearfld, startYear);
		Commanmethod.waitUntilElementVisible(startmonth, 2000);
		Commanmethod.selectDropdown(startmonth, startMonth);

		Commanmethod.click(step1proceed);

		if (Commanmethod.isElementPresent(successelmnt)==true) {
			
			Commanmethod.logger.log(LogStatus.INFO,
					"Download Prospectus submitted successfully in Prospectus Listing page");
			Commanmethod.logger.log(LogStatus.PASS,
					"Download Prospectus submitted successfully in Prospectus Listing page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		else {

			Commanmethod.logger.log(LogStatus.INFO, "Download Prospectus not submitted  in Prospectus Listing page");
			Commanmethod.logger.log(LogStatus.PASS, "Download Prospectus not submitted  in Prospectus Listing page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		
		String User_id = cm.getuserid(affiliate_id, emailaddress);
		
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
