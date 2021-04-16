package com.idp.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;


public class HomePage {

	WebDriver driver;
	Commanmethod cm = new Commanmethod();



	@FindBy(xpath="//a[@id='tpNvInspLnk']")
	public static WebElement getinsplnk;

	@FindBy(xpath="//a[contains(text(),'Student reviews')]")
	public static WebElement studreviewslnk;

	@FindBy(xpath="//select[@id='countrySeId']")
	public static WebElement selectcountry;

	@FindBy(xpath="//input[@id='college']")
	public static WebElement enteruniversity;

	@FindBy(xpath="/html[1]/body[1]/div[9]/div[1]")
	public static WebElement searchajx;

	@FindBy(xpath="//input[@class='org_btn']")
	public static WebElement searchbtn;

	@FindBy(xpath="//i[@class='fa fa-search fa-2x']")         
	public static WebElement topnavsearchicn;

	@FindBy(xpath="//input[@id='topNavSrch']")
	public static WebElement topnavsearchbox;

	@FindBy(xpath="//p[@class='mb10 asr_np']")
	public static WebElement artheadercontent;

	@FindBy(xpath="//*[@id='sr_result']/div/div/div[2]/a/div")
	public static WebElement providerpod;

	@FindBy(xpath="//a[@class='wba']")
	public static WebElement chprovidername;

	@FindBy(xpath="//a[@id='visitWebLinkId']")
	public static WebElement chvisitwebsitelnk;

	@FindBy(xpath="//a[@id='contInst']")
	public static WebElement chcontinstbtn;

	@FindBy(xpath="//span[contains(text(),'Subject area*')]")
	public static WebElement subjectsearch;

	@FindBy(xpath="//span[contains(text(),'Destination')]")
	public static WebElement destsearch;

	@FindBy(xpath="//span[contains(text(),'Undergraduate (e.g. BA & Diploma)')]")
	public static WebElement qualsearch;

	@FindBy(xpath="//ul[@id='tab1lid']//button")
	public static WebElement podsearchbtn;

	@FindBy(xpath="//div[@class='logo']//img[contains(@class,'lazy-loaded')]")
	public static WebElement abroadlogo;

	@FindBy(xpath="//li[@id='nav-j']")
	public static WebElement pop_subj;

	@FindBy(xpath="//a[@class='catlog_link']")
	public static WebElement subjlnk;

	@FindBy(xpath="//span[@class='fa fa-heart-o']")
	public static WebElement praddfavlink;

	@FindBy(xpath="//div[@class='sr_set pr_set sr_1']//div[1]//a[1]")
	public static WebElement cdpod;

	@FindBy(id="ctitle_chosen")
	public static WebElement subjtxtbox;

	@FindBy(xpath="//span[contains(text(),'Destination')]")
	public static WebElement desttxtbox;

	@FindBy(xpath="//span[contains(text(),'Qualification')]")
	public static WebElement qualtxtbox;

	@FindBy(xpath="//ul[@id='tab1lid']//button")
	public static WebElement homesearchbtn;

	@FindBy(xpath="//a[@class='gt_it']")
	public static WebElement iagreebtn;

	//Search results page locators
	@FindBy(xpath="//div[@id='srtByid']//a[@id='prLink']")
	public static WebElement srfirstpod;

	@FindBy(xpath="//h1[@class='srf1 bd wba']")
	public static WebElement srheader;

	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	@FindBy(xpath="//button[@id='topNavSrchBtn']")
	public static WebElement topnavsearchbutton;


	

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

	// verify university reviews megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public static WebElement university_reviews_link;
	
	// verify student videos megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	public static WebElement student_videos_link;

	// verify eventsnear you megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	public static WebElement events_link;

	// verify fundingguides megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
	public static WebElement fundingguides_link;

	// verify findscholorships megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
	public static WebElement findscholorships_link;

	// verify tutionfees megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
	public static WebElement tutionfees_link;

	// verify studentloans megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")
	public static WebElement studentloans_link;

	// verify studying_abroad_articles megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
	public static WebElement studying_abroad_articles;
	
	// verify IELTS_preperation megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]")
	public static WebElement IELTS_preperation;
	
	// verify housing and accomodation megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[3]/a[1]")
	public static WebElement housing_accomodation_link;

	// verify find a course megamenu option
	@FindBy(xpath = "//a[@id='tpNvInspLnk']")
	public static WebElement find_course_link;
	
	// verify postgratuate courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	public static WebElement postgratuate_course_link;
	
	// verify undergraduate courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	public static WebElement undergratuate_course_link;
	
	// verify vocational courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public static WebElement vocational_course_link;
	
	// verify pathway courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	public static WebElement pathway_course_link;
	
	// verify premaster courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	public static WebElement premaster_course_link;
	
	// verify english courses megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")
	public static WebElement english_course_link;
	
	// verify study destination megamenu option
	@FindBy(xpath = "//a[@id='tpNvAbtLnk']")
	public static WebElement study_destination_link;
	
	// verify study destination megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[3]/div[1]/div[1]/div[1]/div[2]/a[1]")
	public static WebElement start_yourjourney_link;

	// verify our services megamenu option
	@FindBy(xpath = "//a[@id='tpNvAbtLnkSrc']")
	public static WebElement our_services_link;
	
	// verify our services megamenu option
	@FindBy(xpath = "//header/div[@id='wrapper']/nav[1]/div[1]/ul[2]/li[5]/a[1]")
	public static WebElement latest_news_link;
	
	
	
	
	
	// verify find courses link
	@FindBy(xpath = "//a[@id='tpNvInspLnk']")
	public static WebElement getinspired;

	// verify about us link
	@FindBy(xpath = "//a[@id='tpNvAbtLnk']")
	public static WebElement aboutus;

	// Verify search lens icon
	@FindBy(xpath = "//i[@class='fa fa-search fa-2x']")
	public static WebElement searchicon;

	// Verify avatar image
	@FindBy(xpath = "//span[@class='lo_in']//img[contains(@class,'lazy-loaded')]")
	public static WebElement avatarimage;

	// Verify Find courses - By subject
	@FindBy(xpath = "//a[contains(text(),'By subject')]")
	public static WebElement bysubject;

	// Verify Find courses - By destination
	@FindBy(xpath = "//a[contains(text(),'By destination')]")
	public static WebElement bydestination;

	// Verify Find courses - By university
	@FindBy(xpath = "//a[contains(text(),'By university')]")
	public static WebElement byuniversity;

	// Verify Find courses - By English courses
	@FindBy(xpath = "//a[contains(text(),'English courses')]")
	public static WebElement byenglishcourses;

	// Verify Find courses - By Pathway courses
	@FindBy(xpath = "//a[contains(text(),'Pathways courses')]")
	public static WebElement byPathwayourses;

	// Verify get inspired - articles
	@FindBy(xpath = "//a[contains(text(),'Articles')]")
	public static WebElement getinsparticles;

	// Verify get inspired - student videos
	@FindBy(xpath = "//a[contains(text(),'Student videos')]")
	public static WebElement getinspstuvideos;

	// Verify get inspired - University prospectus
	@FindBy(xpath = "//a[contains(text(),'University prospectus')]")
	public static WebElement getinspunivpros;

	// Verify get inspired - University rankings
	@FindBy(xpath = "//a[contains(text(),'University rankings')]")
	public static WebElement getinspunivrank;

	// Verify get inspired - Student review
	@FindBy(xpath = "//a[contains(text(),'Student reviews')]")
	public static WebElement getinspstureview;

	// Verify get inspired - Funding guides
	@FindBy(xpath = "//a[contains(text(),'Funding guides')]")
	public static WebElement getinspfunding;

	// Verify get inspired - Events near you
	@FindBy(xpath = "//a[contains(text(),'Events near you')]")
	public static WebElement getinspeventsnearyou;

	// Verify About us - Who we are
	@FindBy(xpath = "//a[contains(text(),'Who we are')]")
	public static WebElement abtwhoweare;

	// Verify About us - Our Partners
	@FindBy(xpath = "//a[contains(text(),'Our partners')]")
	public static WebElement abtpartners;

	// Verify About us - Contact Us
	@FindBy(xpath = "//ul[@id='sub8']//a[contains(text(),'Contact us')]")
	public static WebElement abtcontactus;

	//Verify Static Header
	@FindBy(xpath="/html/body/header")
	public static WebElement staticheader;

	//Verify Searchpod
	@FindBy(xpath="//div[@class='bnrr']")
	public static WebElement searchpod;

	//Verify Unsure what to study section
	@FindBy(xpath="//section[@class='stftr hm']//div[@class='main']")
	public static WebElement unsurewhattostudy;

	//Verify advice tips and guidance section
	@FindBy(xpath="//div[@id='articleProfileId']")
	public static WebElement advicetips;

	//Verify unsure where to study section
	@FindBy(xpath="//section[@class='bgwht hm warw']//div[@class='main']")
	public static WebElement unsurewheretostudy;

	//Verify have you heard about section
	@FindBy(id="profilePodId")
	public static WebElement haveyouheardabout;      

	//Verify what more you can do section
	@FindBy(xpath="//section[@class='stftr']")
	public static WebElement whatmoreyoucando;

	//Verify we work alongside section 
	@FindBy(xpath="//section[@class='mstplr']//div[@class='main']")
	public static WebElement weworkalongside;

	//Verify newsletter section
	@FindBy(xpath="//div[@class='ftr_lft']")
	public static WebElement newsletter;

	//Verify usefullinks section
	@FindBy(xpath="//div[@class='ftr_lft lst']")
	public static WebElement usefullink;

	//Verify footer section
	@FindBy(xpath="//div[@class='sup_footer']")
	public static WebElement footer;

	//verify chatbot section
	@FindBy(xpath="//div[@id='chatBotBanner']")
	public static WebElement chatbot;

	@FindBy(xpath="//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath="//a[@id='proceed-link']")
	public static WebElement proceedlink;

	@FindBy(xpath="//a[@class='grn_btn']")
	public static WebElement coursematchercarousel;
	
	@FindBy(xpath="//*[@id='ftr']/div/div[1]/div[2]/ul/li[4]/a")
	public static WebElement termsandconditions;
	
	

	@FindBy(xpath="//*[@id='ftr']/div/div[1]/div[2]/ul/li[1]/a")
	public static WebElement privacynotice;
	

	@FindBy(xpath="//*[@id='sr_result']/div/div/h2")
	public static WebElement termsandconditions_newwindow;
	

	@FindBy(xpath="//*[@id='sect1']")
	public static WebElement privacynotice_newwindow;
	
	
	
	
	
	

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}




	public void topnavsection() {

		Commanmethod.logger=Commanmethod.report.startTest("Verify Top Navigation Section Functionality", "Test");

		Boolean isPresen=Commanmethod.isDisplayed(advancedlink);

		if (isPresen==true)

		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}

		// Verify Hc abroad logo is displayed
		if (Commanmethod.isDisplayed(abroadlogo)) {

			Commanmethod.logger.log(LogStatus.INFO, "HC abroad logo is displayed successfully");
			Commanmethod.logger.log(LogStatus.PASS, "HC abroad logo is displayed successfully",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		} else {

			Commanmethod.logger.log(LogStatus.INFO, "HC abroad logo is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "HC abroad logo is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		//Verifying Megamenu options 

		if(Commanmethod.isElementPresent(getadvicelink)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Get Advice link is displayed in Homepage");

			Commanmethod.logger.log(LogStatus.PASS, "Get Advice link is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.click(getadvicelink);
			
			if(Commanmethod.isElementPresent(chatbot_button)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Chatbot button is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Chatbot button is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Chatbot button is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Chatbot button is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(university_rankings_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "University Ranking link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "University Ranking link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "University Ranking link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "University Ranking link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(university_prospectus_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "University Prospectus link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "University Prospectus link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "University Prospectus link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "University Prospectus link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(university_reviews_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "University reviews link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "University reviews link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "University reviews link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "University reviews link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(student_videos_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Student videos link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Student videos link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Student videos link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Student videos link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(events_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Events near you link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Events near you link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Events near you link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Events near you link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(fundingguides_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Funding guides link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Funding guides link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Funding guides link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Funding guides link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(findscholorships_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Find scholorships link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Find scholorships link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Funding scholorships link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Funding scholorships link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(tutionfees_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Tution fees link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Tution fees link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Tution fees link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Tution fees link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(studentloans_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Student loans link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Student loans link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Student loans link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Student loans link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(studying_abroad_articles)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Studying Abroad articles link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Studying Abroad articles link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Studying Abroad articles link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Studying Abroad articles link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(studying_abroad_articles)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Studying Abroad articles link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Studying Abroad articles link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Studying Abroad articles link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Studying Abroad articles link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(IELTS_preperation)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "IELTS preparation link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "IELTS preparation link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "IELTS preparation link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "IELTS preparation link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(housing_accomodation_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Housing and accommodation link is displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Housing and accommodation link is displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Housing and accommodation link is not displayed in Get Advice Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Housing and accommodation link is not displayed in Get Advice Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Get Advice link is not displayed in Homepage");

			Commanmethod.logger.log(LogStatus.FAIL, "Get Advice link is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		if(Commanmethod.isElementPresent(find_course_link)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Find a course link is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Find a course link is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			Commanmethod.click(find_course_link);
			
			if(Commanmethod.isElementPresent(postgratuate_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Postgraduate courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Postgraduate courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Postgraduate courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Postgraduate courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(undergratuate_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Undergraduate courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Undergraduate courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Undergraduate courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Undergraduate courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(vocational_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Vocational courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Vocational courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Vocational courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Vocational courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(pathway_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Pathway courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Pathway courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Pathway courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Pathway courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(premaster_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Pre-master courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Pre-master courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Pre-master courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Pre-master courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.isElementPresent(english_course_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "English courses link is displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.PASS, "English courses link is displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "English courses link is not displayed in Find a course Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "English courses link is not displayed in Find a course Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			
			
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Find a course link is not displayed in HomePage");
			Commanmethod.logger.log(LogStatus.FAIL, "Find a course link is not displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		if(Commanmethod.isElementPresent(study_destination_link)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Study destination link is displayed in HomePage");
			Commanmethod.logger.log(LogStatus.PASS, "Study destination link is displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			Commanmethod.click(study_destination_link);
			
			if(Commanmethod.isElementPresent(start_yourjourney_link)==true)
			{
				Commanmethod.logger.log(LogStatus.INFO, "Start your journey button is displayed in Study destination Menu");
				Commanmethod.logger.log(LogStatus.PASS, "Start your journey button is displayed in Study destination Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Start your journey button is not displayed in Study destination Menu");
				Commanmethod.logger.log(LogStatus.FAIL, "Start your journey button is not displayed in Study destination Menu",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Study destination link is not displayed in HomePage");
			Commanmethod.logger.log(LogStatus.FAIL, "Study destination link is not displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		
		if(Commanmethod.isElementPresent(our_services_link)==true)
		{
			Commanmethod.click(our_services_link);
			Commanmethod.logger.log(LogStatus.INFO, "Our services link is displayed in HomePage");
			Commanmethod.logger.log(LogStatus.PASS, "Our services link is displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Our services link is not displayed in HomePage");
			Commanmethod.logger.log(LogStatus.FAIL, "Our services link is not displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		if(Commanmethod.isElementPresent(latest_news_link)==true)
		{
			Commanmethod.logger.log(LogStatus.INFO, "Latest news link is displayed in HomePage");
			Commanmethod.logger.log(LogStatus.PASS, "Latest news link is displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Latest news link is not displayed in HomePage");
			Commanmethod.logger.log(LogStatus.FAIL, "Latest news link is not displayed in HomePage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		



	}
	// Method to verify Home Page contains all the sections 
	public void homepagesections() throws InterruptedException
	{
		Commanmethod.click(iagreebtn);
		Commanmethod.logger=Commanmethod.report.startTest("Verify HomePage sections", "Test");

		Thread.sleep(10000);
		//Commanmethod.waitUntilElementVisible(staticheader, 10000);
		//Comdition to verify the static header
		if(staticheader.isDisplayed())
		{
			Commanmethod.highlightElement(staticheader);
			Commanmethod.logger.log(LogStatus.INFO, "Static header is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Static header is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Static header is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Static header is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		Commanmethod.waitUntilElementVisible(searchpod, 3000);
		if(searchpod.isDisplayed())
		{
			Commanmethod.highlightElement(searchpod);
			Commanmethod.logger.log(LogStatus.INFO, "Search Pod is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Search Pod is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Search Pod is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Search Pod is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		//						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chatbot);
		//						Thread.sleep(500); 
		//						
		//						if(chatbot.isDisplayed())
		//						{
		//							Commanmethod.highlightElement(chatbot);
		//							Commanmethod.logger.log(LogStatus.INFO, "Chatbot section is displayed in Homepage");
		//							Commanmethod.logger.log(LogStatus.PASS, "Chatbot section is displayed in Homepage",
		//									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//							
		//						}
		//						else
		//						{
		//							Commanmethod.logger.log(LogStatus.INFO, "Chatbot section is not displayed in Homepage");
		//							Commanmethod.logger.log(LogStatus.FAIL, "Chatbot section is not displayed in Homepage",
		//									"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//						}
		//						

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unsurewhattostudy);
		Thread.sleep(500); 


		if(unsurewhattostudy.isDisplayed())
		{
			Commanmethod.highlightElement(unsurewhattostudy);
			Commanmethod.logger.log(LogStatus.INFO, "Unsure what to study? section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Unsure what to study? section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Unsure what to study? section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Unsure what to study? section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}


		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", advicetips);
		Thread.sleep(500); 


		if(advicetips.isDisplayed())
		{
			Commanmethod.highlightElement(advicetips);
			Commanmethod.logger.log(LogStatus.INFO, "Advice, tips and guidance section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Advice, tips and guidance section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Advice, tips and guidance section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Advice, tips and guidance section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}


		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unsurewheretostudy);
		Thread.sleep(500); 

		if(unsurewheretostudy.isDisplayed())
		{
			Commanmethod.highlightElement(unsurewheretostudy);
			Commanmethod.logger.log(LogStatus.INFO, "Unsure where to study? section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Unsure where to study? section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Unsure where to study? section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Unsure where to study? section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		Commanmethod.scrolldown();

		//Commanmethod.waitUntilElementVisible(haveyouheardabout, 1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", haveyouheardabout);


		if(haveyouheardabout.isDisplayed())
		{

			Commanmethod.logger.log(LogStatus.INFO, "Have you heard about? section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Have you heard about? section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Have you heard about? section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Have you heard about? section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", whatmoreyoucando);
		Thread.sleep(500); 

		if(whatmoreyoucando.isDisplayed())
		{
			Commanmethod.highlightElement(whatmoreyoucando);
			Commanmethod.logger.log(LogStatus.INFO, "What more can you do? section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "What more can you do? section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "What more can you do? section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "What more can you do? section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", weworkalongside);
		Thread.sleep(500); 

		if(weworkalongside.isDisplayed())
		{
			Commanmethod.highlightElement(weworkalongside);
			Commanmethod.logger.log(LogStatus.INFO, "We work alongside... section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "We work alongside... section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "We work alongside... section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "We work alongside... section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletter);
		Thread.sleep(500); 

		if(newsletter.isDisplayed())
		{
			Commanmethod.highlightElement(newsletter);
			Commanmethod.logger.log(LogStatus.INFO, "Newsletter section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Newsletter section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Newsletter section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Newsletter section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		if(usefullink.isDisplayed())
		{
			Commanmethod.highlightElement(usefullink);
			Commanmethod.logger.log(LogStatus.INFO, "Useful links section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Useful links section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Useful links section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Useful links section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
		Thread.sleep(500); 

		if(footer.isDisplayed())
		{
			Commanmethod.highlightElement(footer);
			Commanmethod.logger.log(LogStatus.INFO, "Footer section is displayed in Homepage");
			Commanmethod.logger.log(LogStatus.PASS, "Footer section is displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window

			Commanmethod.click(termsandconditions);
			Thread.sleep(5000);
			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			
			// Perform the actions on new window
			if(termsandconditions_newwindow.isDisplayed())
			{
				Commanmethod.logger.log(LogStatus.INFO, "Terms and Conditions link working fine as expected");
				
				Commanmethod.logger.log(LogStatus.PASS, "Terms and Conditions link working fine as expected",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

			}
			else
			{
				
				Commanmethod.logger.log(LogStatus.INFO, "Terms and Conditions link not working fine as expected");
				Commanmethod.logger.log(LogStatus.FAIL, "Terms and Conditions link not working fine as expected",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

			}
			
			// Close the new window, if that window no more required
			driver.close();

			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);
			
			
			Commanmethod.click(privacynotice);
			Thread.sleep(5000);
			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			
			// Perform the actions on new window
			if(privacynotice_newwindow.isDisplayed())
			{
				Commanmethod.logger.log(LogStatus.INFO, "Privacy Notice link working fine as expected");
				
				Commanmethod.logger.log(LogStatus.PASS, "Privacy Notice link not working fine as expected",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

			}
			else
			{
				
				Commanmethod.logger.log(LogStatus.INFO, "Privacy Notice link not working fine as expected");
				Commanmethod.logger.log(LogStatus.FAIL, "Privacy Notice link not working fine as expected",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

			}
			
			// Close the new window, if that window no more required
			driver.close();

			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);

			
			

			
			
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Footer section is not displayed in Homepage");
			Commanmethod.logger.log(LogStatus.FAIL, "Footer section is not displayed in Homepage",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		Commanmethod.report.endTest(Commanmethod.logger);	

		Commanmethod.click(abroadlogo);





	}
}

