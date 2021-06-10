package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.CallbackThreadInitializer;

public class EnquiryForm {

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
	@FindBy(xpath = "//div[@class='pr_hd']")
	public static WebElement univselect;

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
	public static WebElement countryofresidence;

	// Country of citizenship
	@FindBy(xpath = "/html/body/div[7]/div/div/div[1]/form/div[3]/div[1]/div[1]/div[2]/ul/li[1]")
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
	public static WebElement studylvl;

	// Select Subject
	@FindBy(xpath = "//*[@id='enquirySubjectId']")
	public static WebElement selectsubject;

	// select start year
	@FindBy(id = "yearOfJoin")
	public static WebElement startYear;

	// Select fund
	@FindBy(xpath = "//li[@id='fund-58']")
	public static WebElement fund;

	// Select consent flag
	@FindBy(xpath = "//div[@id='clientConcernFlagDiv']//label")
	public static WebElement consentflg;

	// select T&C
	@FindBy(xpath = "//div[@id='enquirydiv']//div//div[@id='acceptDiv']//div//label")
	public static WebElement acceptBtn;

	// step1 proceed button
	@FindBy(xpath = "//input[@id='greybut']")
	public static WebElement step1proceed;

	// Enter password
	@FindBy(id = "passwordValue")
	public static WebElement passWord;

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

	// click popular subject dot navigation in content hub profile page
	@FindBy(xpath = "//li[@id='nav-j']")
	public static WebElement pop_subj;

	// click subject pod in content hub profile page
	@FindBy(xpath = "//a[@class='catlog_link']")
	public static WebElement subjlnk;

	// click on contact institution button
	@FindBy(xpath = "//div[@id='contInst']")
	public static WebElement prcontinstbtn;

	@FindBy(xpath = "//a[@class='fl']")
	public static WebElement prcontexploring;

	@FindBy(xpath = "/html/body/div[2]/div[9]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[1]/a")
	public static WebElement prcdpod;

	@FindBy(xpath = "/html/body/div[7]/div/div/div[3]/div[4]/div/div[2]/a")
	public static WebElement cdenqbtn;

	@FindBy(xpath = "//span[@class='fa fa-heart-o']")
	public static WebElement praddfavlink;

	@FindBy(xpath = "/html/body/header[1]/div/div/a/img")
	public static WebElement abroadlogo;

	@FindBy(xpath = "//a[@id='topNavlogIcn']")
	public static WebElement topnavlogicn;

	@FindBy(xpath = "//span[@id='shrtLstClgCnt']")
	public static WebElement univlnk;

	@FindBy(xpath = "//a[@id='collegeButton']")
	public static WebElement viewcomparisonbtn;

	@FindBy(xpath = "//div[@class='row row12']//li[1]//a[1]")
	public static WebElement viewcomparisonenqbtn;

	@FindBy(xpath = "//li[@id='short_list_pod']//a")
	public static WebElement myfavlink;

	@FindBy(xpath = "//div[@id='collegeHead']")
	public static WebElement myfavunivtab;

	@FindBy(xpath = "//div[@id='userProfileTopPos']//div[1]//div[2]//div[3]//a[1]")
	public static WebElement myfavcontinstbtn;

	@FindBy(xpath = "//div[2]//div[1]//div[1]//div[3]//a[1]")
	public static WebElement cpccontinstbtn;

	// Homepage element locators

	@FindBy(id = "ctitle_chosen")
	public static WebElement subjtxtbox;

	@FindBy(xpath = "//li[@id='cntryRegFilterLi']")
	public static WebElement desttxtbox;

	@FindBy(xpath = "//li[@id='studyLvlId']")
	public static WebElement qualtxtbox;

	@FindBy(xpath = "//ul[@id='tab1lid']//button")
	public static WebElement homesearchbtn;

	// Search results page locators
	@FindBy(xpath = "//div[@id='srtByid']//a[@id='prLink']")
	public static WebElement srfirstpod;

	// Provide results page locators
	@FindBy(xpath = "//a[@class='grn_btn']")
	public static WebElement mbaenqbtn;

	// Successpage locator
	@FindBy(xpath = "//*[@id=\"shrtSuccMsgId\"]/div[1]")
	public static WebElement successmsg;

		@FindBy(xpath = "//button[@id='details-button']")
		public static WebElement advancedlink;
	
		@FindBy(xpath = "//a[@id='proceed-link']")
		public static WebElement proceedlink;
	
	@FindBy(xpath = "//button[@id='topNavSrchBtn']")
	public static WebElement topnavsearchbtn;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div[2]/a[1]")
	public static WebElement univselect2;
	
	@FindBy(xpath="//select[@name='yearOfJoin']")
	public static WebElement startyear;
	
	@FindBy(xpath="//select[@name='monthOfJoin']")
	public static WebElement startMonth;
	
	@FindBy(xpath="//*[@id='cookieSetinPop']/a/img")
	public static WebElement cookieploicyclose;
	
	@FindBy(xpath="//a[contains(text(),'Manage cookies')]")
	public static WebElement managecookies;
	
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/span/a[2]")
	public static WebElement cookieaccept;
	
	@FindBy(xpath="/html/body/div[8]/div/div/div[3]/div/div[3]/div/div[1]/div/div[2]/div/div[4]/button")
	public static WebElement postenquirybutton;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[3]/div/div[3]/div/div[1]/div/div[3]/fieldset/div[2]/div/label")
	public static WebElement emailupdates_checkbox;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[3]/div/div[3]/div/div[1]/div/button")
	public static WebElement postenquiry_sendbutton;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[3]/div/div[3]/div/div[1]/div/div[3]/div[2]/textarea")
	public static WebElement postenquiry_textarea;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[3]/div/div[3]/div/div[1]/div/div[2]/div/div[4]/button/span")
	public static WebElement enquirysent_button;
	
	
	
	
	
	
	
	

	public EnquiryForm(WebDriver driver) {
		this.driver = driver;

	}

	public static void newenquiryform(String univname,String fname,String lname,String email,String date,String month,String year,String phonenumber,String phonetype,String countrycode,String studylevel,String subject,String startyear,String password,String univname2,String subject2,String url,String studylevel2, String destination, String qualification, String affiliate, String startyear1, String startmonth,String startmonth2, String affiliate_id)
			throws IOException, InterruptedException, SQLException {
		
		System.out.println(studylevel);

		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);
		

		Commanmethod.waitUntilElementVisible(searchlensicon, 1000);
		
		Commanmethod.click(searchlensicon);
		Commanmethod.type(topnavsearch, univname);
		Thread.sleep(4000);
		Commanmethod.click(topnavsearchbtn);

//		topnavsearch.sendKeys(Keys.DOWN);
//		Thread.sleep(1000);
//		topnavsearch.sendKeys(Keys.ENTER);
//		Commanmethod.waitUntilElementVisible(gotit, 1000);
//        
//        if(Commanmethod.isElementPresent(gotit)==true)
//		{
//			Commanmethod.click(gotit);
//         
//		}

		
        Thread.sleep(1000);
       
		Commanmethod.click(univselect);
		Commanmethod.waitUntilElementVisible(contactinstitution, 1000);
		Commanmethod.click(contactinstitution);
//		Commanmethod.waitUntilElementVisible(gotit, 1000);
//		 if(Commanmethod.isElementPresent(gotit)==true)
//			{
//				Commanmethod.click(gotit);
//	         
//			}
		Commanmethod.logger = Commanmethod.report.startTest(
				"Verify Enquiry Functionality in Profile Page/PR/CD/View Comparison/My Favourites page/MBA Enquiry -" + affiliate,
				"Scope: Regression pack");
		Commanmethod.type(firstname, fname);
		Commanmethod.type(lastname, lname);
		Commanmethod.type(confirmEmailId, email);
		
		
		 if(Commanmethod.isElementPresent(datefld)==true && Commanmethod.isElementPresent(monthfld)==true && Commanmethod.isElementPresent(yearfld)==true)
			{
			 Commanmethod.type(datefld, date);
				Commanmethod.type(monthfld, month);
				Commanmethod.type(yearfld, year);
	         
			}

		 Thread.sleep(5000);
		 Commanmethod.scrollup();

		// Commanmethod.isSelected(countryofresidence);
	
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", citizenship); 
			
			Commanmethod.click(citizenship);
		//Commanmethod.click(citizenship);
		
		//
		if (Commanmethod.isElementPresent(phoneType)==true && Commanmethod.isElementPresent(countryCode)==true && Commanmethod.isElementPresent(phoneNumber)==true) {
			Commanmethod.selectDropdown(phoneType, phonetype);
			Commanmethod.selectDropdown(countryCode, countrycode);
			Commanmethod.type(phoneNumber, phonenumber);
		} 
			Commanmethod.scrolldown();
			System.out.println(studylevel);
			Commanmethod.selectDropdown(studylvl, studylevel);
			Thread.sleep(3000);
			Commanmethod.selectDropdown(selectsubject, subject);
			Commanmethod.selectDropdown(startYear, startyear1);
			Thread.sleep(2000);
			Commanmethod.selectDropdown(startMonth, startmonth);

			//Commanmethod.selectDropdownVisibleText(startYear, startyear);
			if (Commanmethod.isElementPresent(fund)==true) {
				Commanmethod.click(fund);
			} else {
				Commanmethod.scrolldown();
			}
			if (Commanmethod.isElementPresent(consentflg)==true) {
				Commanmethod.click(consentflg);
			} else {
				Commanmethod.scrolldown();
			}
			if (Commanmethod.isElementPresent(acceptBtn)==true) {
				Commanmethod.click(acceptBtn);
				Commanmethod.waitUntilElementVisible(step1proceed, 500);

				Commanmethod.logger.log(LogStatus.INFO, "Entered details is Step 1");
				Commanmethod.logger.log(LogStatus.PASS, "All mandatory fieds are filled completely",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				Commanmethod.waitUntilElementVisible(step1proceed, 5000);
				Commanmethod.scrolldown();
				Commanmethod.click(step1proceed);
				Commanmethod.logger.log(LogStatus.INFO, "Enquiry submitted successfully");
				Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted successfully",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

				Commanmethod.waitUntilElementVisible(passWord, 4000);
				if (Commanmethod.isDisplayed(passWord)) {
					Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted application navigated to step 2",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					
					
				} else {
					Commanmethod.logger.log(LogStatus.FAIL,
							"Enquiry submitted application failed to navigated to step 2",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				}
				if (Commanmethod.isDisplayed(cookieaccept)) {
					
					Commanmethod.click(cookieaccept);
					
				}
				
				if (Commanmethod.isDisplayed(passWord) && Commanmethod.isDisplayed(passWord))
						{
					Commanmethod.type(passWord, password);
					
					
					
						}
				
				if (Commanmethod.isElementPresent(newslettrflg)==true && Commanmethod.isElementPresent(solusflg)==true && Commanmethod.isElementPresent(surveyflg)==true) {
					Commanmethod.waitUntilElementVisible(newslettrflg, 2000);
					Commanmethod.click(newslettrflg);
					Commanmethod.click(solusflg);
					Commanmethod.click(surveyflg);
					Commanmethod.click(step2proceed);
				} else {
					Commanmethod.logger.log(LogStatus.INFO, "Password or subcription flags are not selected");
					Commanmethod.logger.log(LogStatus.FAIL, "Password or subcription flags are not selected",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				}

				Commanmethod.waitUntilElementVisible(continueexploring, 2000);
				Commanmethod.logger.log(LogStatus.INFO, "Registration submitted successfully");
				Commanmethod.logger.log(LogStatus.PASS, "Registration submitted successfully",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}

			Commanmethod.waitUntilElementVisible(continueexploring, 3000);
			Commanmethod.click(continueexploring);

			// This code is added my Jegadiswaran on 14/10/2019
			// Enquiry submission in provider results page
			Commanmethod.waitUntilElementVisible(pop_subj, 3000);
			Commanmethod.click(pop_subj);
			Commanmethod.scrolldown();
			Thread.sleep(5000);
			Commanmethod.click(subjlnk);
			Commanmethod.click(praddfavlink);
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].scrollIntoView(true);", prcontinstbtn); 
			
			Commanmethod.click(prcontinstbtn);

			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Provider results enquiry form");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to Provider results enquiry form",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.scrolldown();
			Commanmethod.waitUntilElementVisible(studylvl, 3000);
			Commanmethod.selectDropdown(studylvl, studylevel);
			Commanmethod.waitUntilElementVisible(selectsubject, 3000);
			Commanmethod.selectDropdown(selectsubject, subject);
			Commanmethod.selectDropdown(startYear, startyear1);
			Commanmethod.waitUntilElementVisible(startMonth, 2000);
			Commanmethod.selectDropdown(startMonth, startmonth);

			if (Commanmethod.isElementPresent(consentflg)==true) {
				Commanmethod.click(consentflg);
			} else {
				Commanmethod.scrolldown();
			}
			if (Commanmethod.isElementPresent(acceptBtn)==true) {
				Commanmethod.click(acceptBtn);
			}

			Commanmethod.click(step1proceed);
			
			Commanmethod.logger.log(LogStatus.INFO, "Enquiry submitted successfully in Provider results page");
			Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted successfully in Provider results page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

			// Enquiry submission in Course details page
			Commanmethod.waitUntilElementVisible(prcontexploring, 3000);
			Commanmethod.click(prcontexploring);
			
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].scrollIntoView(true);", prcdpod); 
			Commanmethod.click(prcdpod);
			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Course details page");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to Course details page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].scrollIntoView(true);", cdenqbtn); 
			
			Commanmethod.click(cdenqbtn);

			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Course details page enquiry form");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to Course details page enquiry form",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.scrolldown();
			
			Commanmethod.selectDropdown(startYear, startyear1);
			Commanmethod.waitUntilElementVisible(startMonth, 2000);
			Commanmethod.selectDropdown(startMonth, startmonth);


			if (Commanmethod.isEnabled(consentflg)) {
				Commanmethod.click(consentflg);
			} else {
				Commanmethod.scrolldown();
			}

			Commanmethod.click(step1proceed);
			
			Commanmethod.logger.log(LogStatus.INFO, "Enquiry submitted successfully in Course details page");
			Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted successfully in Course details page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.waitUntilElementVisible(abroadlogo, 5000);
			
			// Navigated to home page
			Commanmethod.click(abroadlogo);
			Commanmethod.click(searchlensicon);
			Thread.sleep(3000);
			Commanmethod.type(topnavsearch, univname2);
			Thread.sleep(4000);
			Commanmethod.click(topnavsearchbtn);
			Thread.sleep(3000);
			Commanmethod.waitUntilElementClickable(univselect2, 3000);
			Commanmethod.click(univselect2);
			Commanmethod.waitUntilElementVisible(praddfavlink, 1000);
			Commanmethod.click(praddfavlink);
			Commanmethod.click(topnavlogicn);
			Commanmethod.waitUntilElementVisible(univlnk, 1000);
			Commanmethod.click(univlnk);
			//Enquiry submission in View Comparison page
			Commanmethod.logger.log(LogStatus.INFO, "Navigated to View Comparison page");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to View Comparison page","" +
			Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.click(viewcomparisonbtn);
			Commanmethod.scrolldown();
			Commanmethod.click(viewcomparisonenqbtn);
			Commanmethod.logger.log(LogStatus.INFO, "Navigated to View Comparison page enquiry form");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to View Comparison page enquiry form",
			"" +
			Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			

//            Boolean isPresentpt = Commanmethod.isDisplayed(phoneType);
//
//            if (isPresentpt == true) {
//                  Commanmethod.type(phoneType, phonetype);
//            }
//            
//            Boolean isPresentct = Commanmethod.isDisplayed(countryCode);
//
//            if (isPresentct == true) {
//                  Commanmethod.type(countryCode,countrycode);
//            }
//            
//            Boolean isPresentpn = Commanmethod.isDisplayed(phoneNumber);
//
//            if (isPresentct == true) {
//                  Commanmethod.type(phoneNumber, phonenumber);
//            }
            
    	
			Commanmethod.scrolldown();
			Commanmethod.selectDropdown(studylvl,studylevel2);
			Commanmethod.waitUntilElementVisible(selectsubject, 2000);
			Commanmethod.selectDropdown(selectsubject, subject);
			Commanmethod.selectDropdown(startYear, startyear1);
			Commanmethod.waitUntilElementVisible(startMonth, 2000);
			Commanmethod.selectDropdown(startMonth, startmonth2);
           // Commanmethod.click(fund);
			Commanmethod.click(step1proceed);
			Commanmethod.logger.log(LogStatus.INFO, "Enquiry submitted successfully in View Comparison page");
			Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted successfully in View Comparison page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			//Enquiry submission in My favourites page
			Commanmethod.click(prcontexploring);
			Commanmethod.waitUntilElementVisible(topnavlogicn, 2000);
			Commanmethod.click(topnavlogicn);
			Commanmethod.waitUntilElementVisible(myfavlink, 1000);
			Commanmethod.click(myfavlink);
			Commanmethod.click(myfavunivtab);
			Commanmethod.click(myfavcontinstbtn);
			
			Commanmethod.logger.log(LogStatus.INFO, "Navigated to My favourites page enquiry form");
			Commanmethod.logger.log(LogStatus.PASS, "Navigated to My favourites page enquiry form","" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.scrolldown();
			Commanmethod.selectDropdown(studylvl,studylevel2);
			Commanmethod.waitUntilElementVisible(selectsubject, 2000);
			Commanmethod.selectDropdown(selectsubject, subject);
			Commanmethod.selectDropdown(startYear, startyear1);
			Commanmethod.waitUntilElementVisible(startMonth, 2000);
			Commanmethod.selectDropdown(startMonth, startmonth2);

			Commanmethod.click(step1proceed);
			Thread.sleep(1000);
			Commanmethod.logger.log(LogStatus.INFO, "Enquiry submitted successfully in My favourites page enquiry form");
			Commanmethod.logger.log(LogStatus.PASS, "Enquiry submitted successfully in My favourites page enquiry form","" +Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			
			//Code for Post Enquiry
			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Post Enquiry Page");
			Commanmethod.click(postenquirybutton);
			
			Commanmethod.type(postenquiry_textarea, "I am interested in studying in your university");
			
			
			//Commanmethod.click(emailupdates_checkbox);
			
			Commanmethod.click(postenquiry_sendbutton);
			
			Thread.sleep(8000);
			
			if(enquirysent_button.isDisplayed())
			{
				Commanmethod.logger.log(LogStatus.INFO, "Post Enquiry submitted successfully");
				Commanmethod.logger.log(LogStatus.PASS, "Post Enquiry submitted successfully","" +Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Post Enquiry not submitted");
				Commanmethod.logger.log(LogStatus.FAIL, "Post Enquiry not submitted","" +Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			
			
			
			
			String User_id = cm.getuserid(affiliate_id, email);
			
			if(User_id.equals("null"))
			{
				Commanmethod.logger.log(LogStatus.FAIL, "User not registered in DB");
			}
			else
			{
				Commanmethod.logger.log(LogStatus.PASS, "User registered in DB and User ID is "+ User_id);
			}
			
		// Perform MBA Search and perform Normal and Post enquiry
			
//			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Home page to perform MBA Search and Enquiry");
//			Actions actions = new Actions(driver);
//			actions.moveToElement(subjtxtbox);
//			actions.click();
//			actions.sendKeys(subject2);
//			actions.build().perform();
//			actions.sendKeys(Keys.TAB);
//			actions.moveToElement(desttxtbox);
//			actions.click();
//			actions.sendKeys(destination);
//			actions.build().perform();
//			actions.sendKeys(Keys.TAB);
//			actions.moveToElement(qualtxtbox);
//			actions.click();
//			actions.sendKeys(qualification);
//			actions.build().perform();
//			actions.sendKeys(Keys.TAB);
//			Commanmethod.click(homesearchbtn);
//			Thread.sleep(15000);
//			Commanmethod.scrollup();
//			Thread.sleep(20000);
//			Commanmethod.click(univselect);
//			Thread.sleep(5000);
//			Commanmethod.click(contactinstitution);
//			
//			Commanmethod.logger.log(LogStatus.INFO, "Navigated to Enquiry form page");
//			Commanmethod.logger.log(LogStatus.PASS, "Navigated to Enquiry form page","" +Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//
//            Commanmethod.scrolldown();
//			Commanmethod.selectDropdown(studylvl,studylevel2);
//
//			Thread.sleep(1000);
//			// //Commanmethod.selectDropdownVisibleText(selectsubject,
//			// Commanmethod.getData("MBA Enquiry", 1, 10));
//			//
//			Commanmethod.click(step1proceed);
//			Commanmethod.logger.log(LogStatus.INFO, "MBA Enquiry Submitted Successfully");
//			Commanmethod.logger.log(LogStatus.PASS, "MBA Enquiry Submitted Successfully","" +Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		}

	}

