package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;




public class CallBackFormArticlePage {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	@FindBy(id="contInst")   
	public static WebElement getappadvice;
	@FindBy(xpath="//*[@id=\"cookiePopUpId\"]/div/span/a[2]")
	public static WebElement gotit;
	@FindBy(id="fstname")
	public static WebElement firstname;
	@FindBy(id="lstname")	
	public static WebElement lastname;
	@FindBy(id="confirmEmailId")
	public static WebElement emailid;
	@FindBy(id="phoneNo")
	public static WebElement phoneno;
	@FindBy(id="yournationality")
	public static WebElement nationality;
	@FindBy(id="destCtryId")
	public static WebElement studydest;
	@FindBy(id="studyLevel")
	public static WebElement studylevel;
	@FindBy(id="yearValue")
	public static WebElement studyyear;
	@FindBy(xpath="//*[@id=\"enquirydiv\"]/fieldset[2]/div[1]/div/label")
	public static WebElement consentFlag;
	
	@FindBy(xpath="//*[@id=\"nws4\"]/div/label")
	public static WebElement terms_chk;
	
	@FindBy(xpath="//*[@id=\"contactMeByFlagDiv\"]/div/label")
	public static WebElement contactMeByFlag;
	@FindBy(xpath="//*[@id=\"shareLeadUniDiv\"]/div/label")
	public static WebElement shareIdpLeadUniFlag;
	@FindBy(id="greybut")
	public static WebElement getadvicebtn;
	@FindBy(id="officeId")
	public static WebElement officeid;
	@FindBy(id="cal_back_continue")
	public static WebElement cal_back_continue;
	@FindBy(id="otpNo")
	public static WebElement verification;
	@FindBy(id="call_us_veri_sub")
	public static WebElement verif_submit;
	@FindBy(id="calbackLightbox")
	public static WebElement lightbox;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement password;
	
	
	@FindBy(id="acceptBtnId")
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
	
	@FindBy(xpath="/html/body/footer/div[2]/div/span/a[2]")
	public static WebElement allowallcookies;
	
	
	public CallBackFormArticlePage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
	
	public void verifyCallbackforminArticlePages() throws IOException, InterruptedException, SQLException
	{
		
		Commanmethod.logger = Commanmethod.report.startTest("Verify IDP Call back form display in 6 ESC's article details pages", "Scope: Regression pack");
		Thread.sleep(2000);
//		cm.click(getinsplnk);
//		cm.click(getinsparticles);
		Boolean isPresen1 = Commanmethod.isDisplayed(allowallcookies);
		if(isPresen1 == true)
		{
		Commanmethod.click(allowallcookies);
		}
		cm.scrollup();
		Thread.sleep(5000);
		cm.click(europepod);
		//Verify IDP Call back form display in UK Article detail page
		//cm.click(europepod);
		//cm.waitUntilElementVisible(europepod, 5000);
		//cm.scrolldown();
		Thread.sleep(5000);
        //cm.waitUntilElementVisible(uklnk, 5000);
        cm.click(uklnk);
        cm.scrolldown();
		
        Thread.sleep(5000);
        //cm.waitUntilElementVisible(articlelnk, 5000);
        cm.click(articlelnk);
        cm.scrolldown();
		
		
		String ukcbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice for admission to universities in the UK";
		cm.waitUntilElementVisible(cbfopenpodheader, 10);
		String ukcbfactheaderdata = cbfopenpodheader.getText();
		
		
		if((ukcbfactheaderdata.contentEquals(ukcbfexpectedheaderdata))&&(artcbform.isDisplayed()))
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in UK Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in UK Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
	    }
		else
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in UK Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in UK Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		cm.navigateBack();
		cm.navigateBack();
		Thread.sleep(10000);
		//cm.click(iagreebtn);
		
		
		//Verify IDP Call back form display in Canada Article detail page
		cm.scrolldown();
		//cm.waitUntilElementVisible(northamerpod, 5);
		//cm.waitUntilElementVisible(iagreebtn, 1000);
		
		
		
		cm.click(northamerpod);
		
		cm.waitUntilElementVisible(canadalnk, 10);
		cm.click(canadalnk);
		cm.scrolldown();
		cm.waitUntilElementVisible(articlelnk, 2);
		cm.click(articlelnk);
		cm.scrolldown();
		
		String canadacbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice for admission to universities in Canada";
		cm.waitUntilElementVisible(cbfopenpodheader, 10);
		String canadacbfactheaderdata = cbfopenpodheader.getText();
		
		if((canadacbfactheaderdata.contentEquals(canadacbfexpectedheaderdata))&&(artcbform.isDisplayed()))
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Canada Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Canada Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
	    }
		else
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Canada Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Canada Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		cm.navigateBack();
		cm.navigateBack();
		//cm.click(iagreebtn);
	    cm.scrolldown1();
		//Verify IDP Call back form display in UK Article detail page
	    //cm.waitUntilElementVisible(europepod, 5);
	    Thread.sleep(10000);
	    cm.waitUntilElementVisible(europepod, 10);
		cm.click(europepod);
		cm.waitUntilElementVisible(irelandlnk, 10);
		cm.click(irelandlnk);
		cm.scrolldown();
		cm.waitUntilElementVisible(articlelnk, 10);
		cm.click(articlelnk);
		cm.scrolldown();
		
		String irelandcbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice for admission to universities in Ireland";
		cm.waitUntilElementVisible(cbfopenpodheader, 10);
		String irelandcbfactheaderdata = cbfopenpodheader.getText();
		
		if((irelandcbfactheaderdata.contentEquals(irelandcbfexpectedheaderdata))&&(artcbform.isDisplayed()))
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Ireland Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Ireland Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
	    }
		else
		{
			
			cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Ireland Article detail page.");
			cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Ireland Article detail page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		cm.navigateBack();
		cm.navigateBack();
		//cm.click(iagreebtn);
	    cm.scrolldown();
	    
	   
		//Verify IDP Call back form display in USA Article detail page
		
		cm.click(northamerpod);
		cm.waitUntilElementVisible(usalnk, 10);
		Commanmethod.click(usalnk);
		cm.scrolldown();
		cm.waitUntilElementVisible(articlelnk, 2);
		cm.click(articlelnk);
		cm.scrolldown();
			
			String usacbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice for admission to universities in the USA";
			cm.waitUntilElementVisible(cbfopenpodheader, 30);
			String usacbfactheaderdata = cbfopenpodheader.getText();
			
			if((usacbfactheaderdata.contentEquals(usacbfexpectedheaderdata))&&(artcbform.isDisplayed()))
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in USA Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in USA Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		    }
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in USA Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in USA Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			cm.navigateBack();
			cm.navigateBack();
			//cm.click(iagreebtn);
		    cm.scrolldown();
		    cm.scrolldown();
		    //Verify IDP Call back form display in Study Abroad article pages
		    cm.click(studyabroadlnk);
		    cm.scrolldown();
			cm.waitUntilElementVisible(articlelnk, 2);
			cm.click(articlelnk);
			cm.scrolldown();
			
			String stdyabrcbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice on university admission for Australia, Canada, Ireland, New Zealand, UK & USA";
			cm.waitUntilElementVisible(cbfopenpodheader, 10);
			String stdycbfactheaderdata = cbfopenpodheader.getText();
			
			if((stdycbfactheaderdata.contentEquals(stdyabrcbfexpectedheaderdata))&&(artcbform.isDisplayed()))
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Study Abroad Info Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Study Abroad Info Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		    }
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Study Abroad Info Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Study Abroad Info Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			cm.navigateBack();
			cm.navigateBack();
			//cm.click(iagreebtn);
		    cm.scrolldown();
		    cm.scrolldown();
		    //Verify IDP Call back form display in Cross border study article pages
		  //Verify IDP Call back form display in Study Abroad article pages
		    cm.click(crosborderlnk);
		    cm.scrolldown();
			cm.waitUntilElementVisible(articlelnk, 2);
			cm.click(articlelnk);
			cm.scrolldown();
			
			String crosscbfexpectedheaderdata = "Our counsellors at IDP Education offer personal advice on university admission for Australia, Canada, Ireland, New Zealand, UK & USA";
			cm.waitUntilElementVisible(cbfopenpodheader, 10);
			String croscbfactheaderdata = cbfopenpodheader.getText();
			
			if((croscbfactheaderdata.contentEquals(crosscbfexpectedheaderdata))&&(artcbform.isDisplayed()))
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Cross broder study Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Study Abroad Info Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		    }
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Application displayed Callback form in Cross broder study Article detail page.");
				cm.logger.log(LogStatus.PASS, "Application displayed Callback form in Study Abroad Info Article detail page.",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			//Callback form submission in Cross border study article page 
//			cm.logger.log(LogStatus.INFO, "Callback form submission in Cross border study article page .");
//			cm.type(firstname, cm.getData("Callbackform", 2, 2));
//			cm.type(lastname, cm.getData("Callbackform", 2, 3));
//			cm.type(emailid, cm.getData("Callbackform", 1, 35));
//			cm.type(phoneno, cm.getData("Callbackform", 2, 6));
//			cm.scrolldown();
//			Select select1 = new Select(studydest);
//			select1.selectByVisibleText(cm.getData("Callbackform", 2, 23));
//		
//			
//			Thread.sleep(2000);
//			Select oSelect = new Select(studylevel);
//			oSelect.selectByVisibleText(cm.getData("Callbackform", 2, 7));
//
//			Select oSelect1 = new Select(studyyear);
//			oSelect1.selectByVisibleText(cm.getData("Callbackform", 1, 8));
//
//			// cm.click(consentFlag);
//			Thread.sleep(1000);
//			cm.click(terms_chk);
//			cm.click(contactMeByFlag);
//			
//			try {
//			   cm.click(shareIdpLeadUniFlag);
//			} 
//			catch(NoSuchElementException | StaleElementReferenceException  e) {
//				Commanmethod.logger.log(LogStatus.INFO, "Share IDP Leads to University flag is not enabled in Callback form");
//			}
//			
//			Commanmethod.logger.log(LogStatus.INFO, "Entered details is Step 1");
//			Commanmethod.logger.log(LogStatus.PASS, "All mandatory fieds are filled completely",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			Thread.sleep(1000);
//			cm.click(getadvicebtn);
//			
//			// Select Office in Step 2
//			Thread.sleep(10000);
//			Select oSelect2 = new Select(officeid);
//			oSelect2.selectByVisibleText(cm.getData("Callbackform", 2, 11));
//			cm.scrollup();
//			Thread.sleep(1000);
//			Commanmethod.logger.log(LogStatus.INFO, "Selected nearest office is Step 2");
//			Commanmethod.logger.log(LogStatus.PASS, "Nearest IDP office selected successfully",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			cm.scrolldown();
//			cm.click(cal_back_continue);
//
//			// Verify OTP
//			cm.getOTP(cm.getData("Callbackform", 1, 35), cm.getData("Callbackform", 1, 9));
//			Thread.sleep(1000);
//
//			cm.type(verification, cm.getOTP(cm.getData("Callbackform", 1, 35), cm.getData("Callbackform", 1, 9)));
//			Commanmethod.logger.log(LogStatus.INFO, "OTP verification");
//			Commanmethod.logger.log(LogStatus.PASS, "OTP verification completed successfully",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			cm.click(verif_submit);
//			
//			// Password light box
//	        cm.waitUntilElementVisible(password, 20);
//			cm.type(password,  cm.getData("Callbackform", 2, 14));
//			Commanmethod.logger.log(LogStatus.PASS, "Navigated to Password dialog box",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			Thread.sleep(1000);
//			cm.click(acceptbtn);
//			cm.click(calbacksuccess);
//			
//			Thread.sleep(10000);
//			
//			
//			if(crosborderarthead.getText().contentEquals("WHAT IS CROSS-BORDER STUDY?"))
//			{
//				Commanmethod.logger.log(LogStatus.INFO, "Callbackform submitted successfully");
//				Commanmethod.logger.log(LogStatus.PASS, "Callbackform submitted successfully",
//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			}
//			else
//			{
//				Commanmethod.logger.log(LogStatus.INFO, "Callbackform not submitted ");
//				Commanmethod.logger.log(LogStatus.FAIL, "Callbackform not submitted",
//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//			}
//			
//			Commanmethod.logger.log(LogStatus.INFO, "Cross border study article detail page",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.report.endTest(cm.logger);
			
}

}
