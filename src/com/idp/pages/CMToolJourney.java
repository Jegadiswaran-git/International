package com.idp.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class CMToolJourney {
	
	

	
	
	@FindBy(xpath="/html/body/section[2]/div/div[1]/div/div[1]/div/div/div/div/a/span")
	public static WebElement coursematcher_button;
	
	@FindBy(xpath="/html/body/div[7]/div[1]/div[2]/div/a")
	public static WebElement getstarted_button;
	
	@FindBy(xpath="//*[@id='studyLevelEntityDecSL_20002']")
	public static WebElement studylevel_undergraduate;
	
	@FindBy(xpath="//*[@id='studyLevelEntityDecSL_20003']")
	public static WebElement studylevel_postgraduate;
	
	@FindBy(xpath="//*[@id='studyLevelEntityDecSL_20001']")
	public static WebElement studylevel_vocational;
	
	@FindBy(xpath="//*[@id='studyLevelEntityDecSL_20006']")
	public static WebElement studylevel_doctoral;
	
	@FindBy(xpath="//*[@id='nxtButton']/span")
	public static WebElement nextbutton1;
	
	@FindBy(xpath="//*[@id='intakeYearEntityDescINTAKE_YEAR_6M']")
	public static WebElement INTAKE_YEAR_6M;
	
	@FindBy(xpath="//*[@id='intakeYearEntityDescINTAKE_YEAR_12M']")
	public static WebElement INTAKE_YEAR_12M;
	
	@FindBy(xpath="//*[@id='intakeYearEntityDescINTAKE_YEAR_24M']")
	public static WebElement INTAKE_YEAR_24M;
	
	@FindBy(xpath="//*[@id='intakeYearEntityDescINTAKE_YEAR_36M']")
	public static WebElement INTAKE_YEAR_36M;
	
	@FindBy(xpath="//*[@id='intakeYearEntityDescINTAKE_YEAR_NONE']")
	public static WebElement INTAKE_YEAR_NONE;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/div/a")
	public static WebElement nextbutton2;
	
	@FindBy(xpath="//*[@id='subjeTextSUB_L1_6205']")
	public static WebElement L1Subject_ComputerScience;
	
	@FindBy(xpath="//*[@id='childSubjDescSUB_L2_20801']")
	public static WebElement L2Subject_ComputerScience;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/div/a/span")
	public static WebElement nextbutton3;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div[2]/ul/li[2]/div/div[2]/a[1]")
	public static WebElement USA_Country_select;
	
	@FindBy(xpath="//*[@id='choseCityButton']")
	public static WebElement Choose_state;
	
	@FindBy(xpath="/html/body/div[3]/div[7]/div[3]/div/section/form/div[2]/fieldset/div/div")
	public static WebElement CitySearchdrop;
	
	@FindBy(xpath="/html/body/div[3]/div[7]/div[3]/div/section/form/div[2]/fieldset/div/select")
	public static WebElement CitySearchbox;
	
	@FindBy(xpath="//html/body/div[3]/div[5]/div[2]/div/div/section/section/div/a")
	public static WebElement CitySearchNextButton;
	
	@FindBy(xpath="/html/body/div[3]/div[7]/div[3]/div/section/form/div[2]/fieldset/div/input[25]")
	public static WebElement cityajaxvalue;
	
	@FindBy(xpath="//*[@id='citySearch_chosen']")
	public static WebElement citysearchlightbox;
	
	@FindBy(xpath="	//*[@id='minvalue']")
	public static WebElement minimumvalueprice;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section[1]/section/form/div[2]/div[3]/span")
	public static WebElement outsidearea;
	
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section[1]/section/form/div[2]/div[3]/div/a")
	public static WebElement Tutionfeenextbutton;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div/fieldset[1]/div/select")
	public static WebElement Country_Qualification_from_dropdown;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div/fieldset[2]/div/select")
	public static WebElement Recent_Qualification_dropdown;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div/fieldset[3]/div/select")
	public static WebElement Gradetype_dropdown;
	
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div/fieldset[4]/div/select")
	public static WebElement Gradescore_dropdown;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/div/a")
	public static WebElement Qualification_nextbutton;
	
	
	@FindBy(xpath="//*[@id='engENG_TEST_TYPE_50701']")
	public static WebElement IELTS_Qualification;
	
	
	@FindBy(xpath="//*[@id='ieltsScoreDrop']")
	public static WebElement Test_score;
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div/section/section/form/div[2]/div[5]/a")
	public static WebElement Englishtest_nextbutton;
	
	@FindBy(xpath="//*[@id='prefCAMPUS_ACCOMM_51601']")
	public static WebElement UniversityPreferences_Selection;
	
	@FindBy(xpath="//*[@id='nxtButton']/span")
	public static WebElement Viewcoursesbutton;
	
	@FindBy(xpath="//*[@id='filterForm']/div[1]/h1")
	public static WebElement Review_your_Preferences_header;
	
	
	// First name
		@FindBy(id = "fstnameId")
		public static WebElement fstname;

		// Last name
		@FindBy(id = "lastnameId")
		public static WebElement lstname;

		// Email Address
		@FindBy(xpath = "//input[@id='confirmEmailID']")
		public static WebElement email1;

		// Email exists
		@FindBy(xpath = "//p[@id='emailErrorMsgTag']")
		public static WebElement emailexistalready;

		// Password value
		@FindBy(xpath = "//input[@id='passwordValId']")
		public static WebElement passwd;

		// where do you want to study
		@FindBy(xpath = "//*[@id='countrySecId_chosen']")
		public static WebElement studydestination;

		@FindBy(xpath = "//div[@id='countrySecId_chosen']//ul[@class='chosen-results']")
		public static List<WebElement> selectstudydestination;

		// what do you want to study
		@FindBy(id = "subjectID")
		public static WebElement selsubject;

		// When would you like to startselectstudydestination
		@FindBy(xpath = ".//*[@id='yearULId']/child::li")
		public static List<WebElement> studystartyear;

		// Newsletter flag
		@FindBy(xpath = "//*[@id='newsLetterDiv']/div/label")
		public static WebElement newslettrflg;

		// Solus flag
		@FindBy(xpath = "//*[@id='univUpdatesDiv']/div/label")
		public static WebElement solusflg;

		// survey flag
		@FindBy(xpath = "//*[@id='surveyDiv']/div/label")
		public static WebElement surveyflg;

		// HC terms and condition
		@FindBy(xpath = "//div[@id='enquirydiv']//div//div[@id='acceptDiv']//div//label")
		public static WebElement termsconditions;

		// Click register button
		@FindBy(xpath = "//input[@id='greybutton']")
		public static WebElement registerbtn;
		
		// Savemyprogress button
		@FindBy(xpath = "//*[@id='saveMvpProgressButton']")
		public static WebElement saveMvpProgressButton;
		
		// Reviewyourselection link
		
		@FindBy(xpath = "//*[@id='mainHead']/div/p/a")
		public static WebElement Reviewyourselection_link;
		
		//Sort option
		@FindBy(xpath = "//*[@id='mvpMiddleContent']/div[3]/span")
		public static WebElement Sortoption;
		
		//Get Advice Button
		@FindBy(xpath = "//*[@id='idpCBFButtonId']")
		public static WebElement GetAdviceButton;
		
		//Review your selection link
		@FindBy(xpath = "//*[@id='mainHead']/div/p/a")
		public static WebElement reviewyourselection;
		
		//Studylevel change
		@FindBy(xpath = "//*[@id='stepOneId']")
		public static WebElement studylevelchange;
		
		//Select Postgraduate 
		@FindBy(xpath = "//*[@id='studyLevelEntityDecSL_20003']")
		public static WebElement selectpostgraduate;
		
		//apply button
		@FindBy(xpath = "//*[@id='nxtButton']")
		public static WebElement clickapplybutton;
		
		//see my matches button
		@FindBy(xpath = "//*[@id='nxtButton']/span")
		public static WebElement seemymatchesbutton;
		
		//results screen header
		@FindBy(xpath = "//*[@id='mainHead']/h1")
		public static WebElement resultsscreenheader;
		
		//studymode filter
		@FindBy(xpath = "//*[@id='studyModeFilter']")
		public static WebElement studymodefilter;
		
		//studylevel filter
		@FindBy(xpath = "//*[@id='childStudyFilter']")
		public static WebElement studylevelfilter;
		
		//online filter
		@FindBy(xpath = "//*[@id='studDivIdSTUDY_OPT_50002']/div/label/div")
		public static WebElement onlinefilter;
		
		//studymode apply button
		@FindBy(xpath = "//*[@id='applyButtonId']")
		public static WebElement studymode_apply_button;
		
		
		//Callback form Element Identification
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
		
		@FindBy(xpath="//*[@id='nws4_splash']/div/label")
		public static WebElement terms_chk;
		
		@FindBy(xpath="//*[@id='contactMeByFlagDiv_splash']/div/label")
		public static WebElement contactMeByFlag;
		@FindBy(xpath="//*[@id='enquirydiv_splash']/fieldset[2]/div[4]/div/label")
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
		public static WebElement passwd1;
		
		
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
		
		@FindBy(xpath="//*[@id='calbackLightbox_splash']")
		public static WebElement cbf_successmsg;
		
		@FindBy(xpath="//*[@id='clsCallbackBtn']/i")
		public static WebElement successclose;
		
		@FindBy(xpath="//*[@id='childStudyFilter']")
		public static WebElement studylevelfilter_cmtool;
		
		@FindBy(xpath="//*[@id='searchIdSL_20114']/div/label")
		public static WebElement masterdegree_studylevelfilter;
		
		@FindBy(xpath="//*[@id='applyButtonId']")
		public static WebElement studylevel_applybutton;
		
		@FindBy(xpath="//*[@id='sortByText']")
		public static WebElement sort_label;
		
		@FindBy(xpath="//*[@id='sortByUL']/li[2]")
		public static WebElement sortby_academic;
		
		@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div[5]/div/ul[1]/li[1]/div/div[3]/div[2]/span[2]")
		public static WebElement addtofavourites_button;
		
		
		
		@FindBy(xpath="//*[@id='totShortlistCount']")
		public static WebElement total_shortlistcount;
		
		@FindBy(xpath="/html/body/div[3]/div[5]/div[2]/div/div[5]/div/ul[1]/li[1]/div/div[4]")
		public static WebElement quickviewlink;
		
		@FindBy(xpath="//*[@id='videoPod-0']")
		public static WebElement videolightbox;
		
		@FindBy(xpath="//*[@id='Icon/Close']")
		public static WebElement videolightbox_close;
		
		@FindBy(xpath = "//i[@class='fa fa-search fa-2x']")
		public static WebElement topnavsearchicn;
		
		@FindBy(xpath = "//*[@id='topNavForm']/div[5]/a")
		public static WebElement trycoursematcherbutton;
		
		
		@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
		public static WebElement allowallcookies;
		
		
		
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	
	
	
	
	public CMToolJourney(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void verifyCMToolJourney(String firstname,String lastname,String emailaddress,String password,String residence,String destination,String subject,String startyear, String url, String affiliate,String affiliate_id, String environment, String phonenumber, String studylevel, String idpoffice) throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);
		Commanmethod.logger = Commanmethod.report.startTest("Verify Course Matcher Tool Journey Functionality in " + affiliate + "affiliate", "Scope: Regression pack");
        
		cm.click(topnavsearchicn);
		
		Thread.sleep(3000);
		
		cm.click(trycoursematcherbutton);
		
//		if(Commanmethod.isElementPresent(coursematcher_button)==true)
//		{
//		Commanmethod.click(coursematcher_button);
//		}
//		else
//		{
//			cm.logger.log(LogStatus.FAIL, "Course Matcher Tool Button not available in Home Page",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//		}
		
		Commanmethod.click(getstarted_button);
		
		Thread.sleep(5000);
		
		cm.logger.log(LogStatus.INFO, "Step 1/8 Study Level Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Thread.sleep(5000);
		Commanmethod.click(studylevel_undergraduate);
		
		cm.logger.log(LogStatus.INFO, "Click on Next button in Step 1/8",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		
		
		Commanmethod.click(nextbutton1);
		
		cm.logger.log(LogStatus.INFO, "Step 2/8 Intake Year Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Thread.sleep(5000);
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 2",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 2",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Commanmethod.click(INTAKE_YEAR_6M);
		
		Thread.sleep(2000);
		
		Commanmethod.click(nextbutton2);
		
		cm.logger.log(LogStatus.INFO, "Step 3/8 Subject Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Thread.sleep(5000);
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 3",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 3",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Commanmethod.scrolldown1();
		
		Commanmethod.click(L1Subject_ComputerScience);
		
		cm.logger.log(LogStatus.INFO, "Step 3/8 L1 Subject Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		String L1_Subject_Storage = L1Subject_ComputerScience.getText();
		
		Thread.sleep(2000);
		
		Commanmethod.click(L2Subject_ComputerScience);
		
		cm.logger.log(LogStatus.INFO, "Step 3/8 L2 Subject Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(nextbutton3);
		
		cm.logger.log(LogStatus.INFO, "Step 4/8 Study Destination Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Thread.sleep(5000);
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 4",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 4",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Commanmethod.click(USA_Country_select);
		
		cm.logger.log(LogStatus.INFO, "Step 4/8 Study Destination Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
//		Commanmethod.click(Choose_state);
//		
//		Thread.sleep(5000);
//		
//
//		
//		Commanmethod.click(CitySearchdrop);
//		Thread.sleep(3000);
		
//		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//		executor1.executeScript("arguments[0].scrollIntoView(true);", cityajaxvalue);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", cityajaxvalue);
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(cityajaxvalue).click().build().perform();
	
//		
//		cm.logger.log(LogStatus.INFO, "Step 4/8 Study Destination Selection in Course Matcher Tool Journey",
//				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(CitySearchNextButton);
		
		Thread.sleep(5000);
		Commanmethod.clear(minimumvalueprice);
		
		Commanmethod.type(minimumvalueprice, "1000");
		
		cm.logger.log(LogStatus.INFO, "Step 5/8 Tution Fees Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 5",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 5",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Commanmethod.click(outsidearea);
		Commanmethod.click(Tutionfeenextbutton);
		
		cm.logger.log(LogStatus.INFO, "Step 6/8 Qualification Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 6",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 6",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Commanmethod.selectDropdown(Country_Qualification_from_dropdown, "NATIONALITY_51086:Y:9");
		
		Commanmethod.selectDropdown(Recent_Qualification_dropdown, "39:24748:1");
		
		Commanmethod.selectDropdown(Gradetype_dropdown, "26242");
		
		Commanmethod.selectDropdown(Gradescore_dropdown, "2");
		
		cm.logger.log(LogStatus.INFO, "Step 6/8 Qualification Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		
		Commanmethod.click(Qualification_nextbutton);
		
		cm.logger.log(LogStatus.INFO, "Step 7/8 English Test Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Thread.sleep(3000);
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 7",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 7",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Commanmethod.click(IELTS_Qualification);
		
		Commanmethod.selectDropdown(Test_score, "ENG_TEST_SCORE_9");
		
		cm.logger.log(LogStatus.INFO, "Step 7/8 English Test Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(Englishtest_nextbutton);
		
		Thread.sleep(3000);
		
		cm.logger.log(LogStatus.INFO, "Step 8/8 University Preferences Selection in Course Matcher Tool Journey",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
		{
			cm.logger.log(LogStatus.PASS, "Save my progress Button available in Step 8",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in Step 8",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Commanmethod.click(UniversityPreferences_Selection);
		
		Commanmethod.click(Viewcoursesbutton);
		
		
		cm.logger.log(LogStatus.INFO, "Registration form",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		// Enter first name
		
				Commanmethod.type(fstname,firstname);

				// Enter last name
				Commanmethod.type(lstname,lastname);

				// Enter Email address
				Commanmethod.type(email1,emailaddress);

				// Verify already registered user
				//Commanmethod.type(passwd,password);
//				Commanmethod.click(passwd);
				
				Actions act =  new Actions(driver);
				act.moveToElement(passwd).click().perform();
				Commanmethod.waitUntilElementVisible(passwd, 1000);
				Commanmethod.type(passwd,password);
				
				cm.logger.log(LogStatus.INFO, "Registration form",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

					
					Commanmethod.scrolldown();
					
					
					if (Commanmethod.isElementPresent(newslettrflg)==true) {
						Commanmethod.click(newslettrflg);
					} else {
						Commanmethod.logger.log(LogStatus.INFO, "Newsletter flag is not enabled or displayed");
					}
					if (Commanmethod.isElementPresent(solusflg)==true) {
						Commanmethod.click(solusflg);
					} else {
						Commanmethod.logger.log(LogStatus.INFO, "Solus flag is not enabled or displayed");
					}
								
					if (Commanmethod.isElementPresent(surveyflg)==true) {
						Commanmethod.click(surveyflg);
					} else {
						Commanmethod.logger.log(LogStatus.INFO, "Survey flag is not enabled or displayed");
					}
					
					
					
					Commanmethod.scrolldown3();
					
					  if(Commanmethod.isElementPresent(termsconditions)==true){
							Commanmethod.click(termsconditions);
				            } else {
				            	Commanmethod.logger.log(LogStatus.INFO, "T&C flag is not enabled or displayed");
				            }
					  
					  cm.logger.log(LogStatus.INFO, "Registration form",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

							Commanmethod.click(registerbtn);
							
							//Code to check user is available in DB 
							
//                           String User_id = cm.getuserid(affiliate_id, emailaddress);
//							
//							if(User_id.equals("null"))
//							{
//								Commanmethod.logger.log(LogStatus.FAIL, "User not registered in DB");
//							}
//							else
//							{
//								Commanmethod.logger.log(LogStatus.PASS, "User registered in DB and User ID is "+ User_id);
//							}
							
							
							cm.logger.log(LogStatus.INFO, "Results Screen",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							
							String Results_Screen_header_text = resultsscreenheader.getText();
							
							if(Results_Screen_header_text.contains(L1_Subject_Storage))
							{
								cm.logger.log(LogStatus.INFO, "Results screen header text is ", Results_Screen_header_text);
								cm.logger.log(LogStatus.INFO, "Chosen L1 Subject is ", L1_Subject_Storage);
										
								
								cm.logger.log(LogStatus.PASS, "The Selected Subject Results displayed in results screen!!",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
								
							}
							else
							{
								cm.logger.log(LogStatus.INFO, "Results screen header text is ", Results_Screen_header_text);
								cm.logger.log(LogStatus.INFO, "Chosen L1 Subject is ", L1_Subject_Storage);
								cm.logger.log(LogStatus.FAIL, "The Selected Subject Results not displayed in results screen!!",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							if(Commanmethod.isElementPresent(saveMvpProgressButton)==true)
							{
								cm.logger.log(LogStatus.PASS, "Save my progress Button available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Save my progress Button not available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							if(Commanmethod.isElementPresent(Reviewyourselection_link)==true)
							{
								cm.logger.log(LogStatus.PASS, "Review your selection link available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Review your selection link not available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							
							if(Commanmethod.isElementPresent(Sortoption)==true)
							{
								cm.logger.log(LogStatus.PASS, "Sort Option available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Sort Option not available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							if(Commanmethod.isElementPresent(GetAdviceButton)==true)
							{
								cm.logger.log(LogStatus.PASS, "Get Advice Button available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Get Advice Button not available in results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							//click on review your selection link
							Commanmethod.click(reviewyourselection);
							
							//change study level
							Commanmethod.click(studylevelchange);
							
							cm.logger.log(LogStatus.INFO, "Change the selection",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							//select postgraduate 
							Commanmethod.click(selectpostgraduate);
							
							cm.logger.log(LogStatus.INFO, "Change the selection",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							//click apply button
							Commanmethod.click(clickapplybutton);
							
							
							if(Commanmethod.isElementPresent(Review_your_Preferences_header)==true)
							{
								cm.logger.log(LogStatus.PASS, "Application navigated to review screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Application not navigated to review screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							Thread.sleep(3000);
							Commanmethod.scrolldown3();
							
							Commanmethod.click(seemymatchesbutton);
							
							Thread.sleep(5000);
							
							Commanmethod.click(studymodefilter);
							Thread.sleep(8000);
							
							
							
							Commanmethod.click(onlinefilter);
							
							cm.logger.log(LogStatus.INFO, "Studymode filter",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							Commanmethod.click(studymode_apply_button);
							
							Thread.sleep(5000);
							
							Commanmethod.click(studylevelfilter_cmtool);
							
							Thread.sleep(8000);
							
							Commanmethod.click(masterdegree_studylevelfilter);
							
							cm.logger.log(LogStatus.INFO, "Studylevel filter",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							
							Commanmethod.click(studylevel_applybutton);
							
														
							if(Commanmethod.isElementPresent(resultsscreenheader)==true)
							{
								cm.logger.log(LogStatus.PASS, "Application navigated to results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
								Thread.sleep(5000);
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Application not navigated to results screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							
							Commanmethod.click(sort_label);
							
							Commanmethod.click(sortby_academic);
							
							
							
							Thread.sleep(5000);
							
							cm.logger.log(LogStatus.INFO, "Results screen after academic sort",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							Commanmethod.click(addtofavourites_button);
							
							Thread.sleep(2000);
							
							if(total_shortlistcount.getText().contentEquals("1"))
									{
								cm.logger.log(LogStatus.PASS, "Shortlist count incremented to 1",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
									}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Shortlist count not incremented to 1",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
								
							}
							
							cm.logger.log(LogStatus.INFO, "Shortlist count after shortlist",
									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							
							
							Commanmethod.click(quickviewlink);
							
							Thread.sleep(5000);
							
							if(Commanmethod.isElementPresent(videolightbox)==true)
							{
								cm.logger.log(LogStatus.PASS, "Quickview Lightbox displayed in the screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
								Commanmethod.click(videolightbox_close);
								
							}
							else
							{
								cm.logger.log(LogStatus.FAIL, "Quickview Lightbox not displayed in the screen",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							
							if(environment.contentEquals("TEST"))
							{
								Commanmethod.click(GetAdviceButton);
								
								Thread.sleep(2000);
								cm.type(phoneno, phonenumber);
								

								
								cm.scroll();
								cm.selectDropdown(studydest, destination);
								
								cm.selectDropdown(studylvl, studylevel);
								cm.selectDropdown(studyyear, startyear);
								
								Commanmethod.waitUntilElementVisible(how_would_you_like_counselled, 1000);
								cm.scrollup();
								

								cm.click(how_would_you_like_counselled);
								cm.scrolldown();
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
								cm.type(verification, cm.getOTP(emailaddress, affiliate_id));
								cm.click(verif_submit);
								
								Thread.sleep(4000);
								
								
								
								if(Commanmethod.isElementPresent(cbf_successmsg)==true)
								{
									cm.logger.log(LogStatus.PASS, "Callback form Submitted Successfully!!",
											"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
									
									cm.click(successclose);
								}
								else
								{
									cm.logger.log(LogStatus.FAIL, "Callback form not Submitted!!",
											"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
								}
								
								
								
							}
							else
							{
								cm.logger.log(LogStatus.INFO, "You are in LIVE environment!!",
										"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
							}
							
							
							
							
							
							
							
}
}
