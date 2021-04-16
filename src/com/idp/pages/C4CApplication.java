	package com.idp.pages;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class C4CApplication {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	@FindBy(id="USERNAME_FIELD-inner")
	public static WebElement usernamefield;
	
	@FindBy(id="PASSWORD_FIELD-inner")
	public static WebElement passwordfield;
	
	@FindBy(id="LOGIN_LINK_CONTENT")
	public static WebElement signinbtn;
	
	@FindBy(xpath=".//*[@title='Search']")
	public static WebElement searchbtn;
	
	
	@FindBy(xpath=".//*[@type='search']")
	public static WebElement searchbox;
	
	@FindBy(xpath=".//div[@class='sapMSFB sapMSFS']")
	public static WebElement searchbtn1;
	
	@FindBy(xpath=".//div[@class='sapMListNoDataText']")
	public static WebElement nomatch;
	
	@FindBy(xpath=".//*[@class='sapMLnk sapMLnkMaxWidth']")
	public static WebElement user_name_lnk;
	
	@FindBy(xpath="//*[@id='__button75-img']")  
	public static WebElement morelnk;
	
	@FindBy(xpath=".//*[@title='Name']//following-sibling::div//descendant::span")
	public static WebElement name;
	
	@FindBy(xpath=".//*[@title='Primary E-Mail']//following-sibling::div//descendant::a")
	public static WebElement primaryemail;
	
	
	@FindBy(xpath=".//*[@title='Mobile']//following-sibling::div//descendant::span")
	public static WebElement mobilenumber;
	
	@FindBy(xpath=".//*[@title='Country of Residency']//following-sibling::div//descendant::span")
	public static WebElement CountryofResidency;
	
	@FindBy(xpath=".//*[@title='Site ID']//following-sibling::div//descendant::span")
	public static WebElement Siteid;
	
	@FindBy(xpath=".//*[@title='Marketing Acceptance']//following-sibling::div//descendant::span")
	public static WebElement MarketingAcceptance;
	
	@FindBy(xpath=".//*[@title='Contact Me By']//following-sibling::div//descendant::span")
	public static WebElement ContactMeBy;
	
	@FindBy(xpath=".//*[@title='How did you Hear?']//following-sibling::div//descendant::span")
	public static WebElement HowdidyouHear;
	
	@FindBy(xpath=".//*[@title='T&C Acceptance']//following-sibling::div//descendant::span")
	public static WebElement TCAcceptance;
	
	@FindBy(xpath="//*[@id=\"navigationitemYCdZuOaf3KARrUJtyU49cm_7-text\"]")
	public static WebElement Lead_tab;
	
	@FindBy(xpath=".//*[@class='sapClientM-TT-COD_MKT_PROSPECT sapClientMThingTypeIcon sapUiIcon sapClientMImageIcon sapclnt-ThingTypeLinkImage']//following-sibling::a")
	public static WebElement Lead_name;
	
	@FindBy(xpath="//span[@id='formpaneS9fKUl_QoK_vGDKAWvy1b0_493-moreLessButton-img']")
	public static WebElement lead_morelnk;
	
	@FindBy(xpath=".//*[@title='Lead Name']//following-sibling::div//descendant::span")
	public static WebElement lead_name;
	
	@FindBy(xpath = ".//*[@title='Lead ID']//following-sibling::div//descendant::span")
	public static WebElement Lead_Id;
	
	@FindBy(xpath=".//*[@title='Source']//following-sibling::div//descendant::span")
	public static WebElement lead_source;
	
	@FindBy(xpath=".//span[text()='Yes']")
	public static WebElement lead_advertiser;
	
	@FindBy(xpath="//*[@id=\"texteditNhJJenzuRqU3pxCBRj8qBm_626-text-inner\"]")
	public static WebElement Notes;
	
	@FindBy(xpath="//*[@id=\"objectvalueselectoruWfdLFfhc4wJ1nerZ8VeS0_632-text\"]")
	public static WebElement idp_organization;
	
	@FindBy(xpath="//*[@id=\"objectvalueselectorOTUj01QsdaMSdY84Fj8NFG_636-text\"]")
	public static WebElement idp_office;
	
	@FindBy(xpath="//*[@id=\"objectvalueselectorHjoBLrM7RKYMGrgjTTq4m0_640-text\"]")
	public static WebElement idp_team;
	
	@FindBy(xpath="//*[@id=\"__container109\"]")
	public static WebElement lead_email;
	
	@FindBy(xpath="//*[@id=\"inputfield4WUbk0kyvqA2jwaEJ1VwC0_657-text\"]")
	public static WebElement lead_mobile;
	
	@FindBy(xpath="//*[@id=\"inputfieldVFuMWJM13K26pt5wS_sHvQm_675-text\"]")
	public static WebElement lead_country;
	
	@FindBy(xpath="//*[@id=\"navigationitemb7488a1682e0edf9e7c05d15cbee78fa_456-text\"]")
	public static WebElement qual_tab;
	
	@FindBy(xpath="//*[@id=\"multivaluedropdownlistbox04a2628369986dea94d5c9cc6428dc00_746-text\"]")
	public static WebElement studyin_qual;
	
	@FindBy(xpath="//*[@id=\"dropdownlistbox1c81831953229eb6529dcd737a0e6007_754-text\"]")
	public static WebElement studylevel_qual;
	
	@FindBy(xpath="//*[@id=\"navigationitemNAVIGATIONITEMID_b3752cddbd734451852771ce1a621df1_457-text\"]")
	public static WebElement online_tab;
	
	@FindBy(id="//*[@id=\"link53DCa_sykL4YVhSXg9d8nTm_803-link\"]")
	public static WebElement referring_url;
	
	@FindBy(xpath="//*[@id=\"inputfield2XNigDD97KEMUUrir436G0_807-text\"]")
	public static WebElement nearoffice_online;
	
	@FindBy(xpath="//*[@id=\"statictext2yX1x4Yf44gmvWPXyxbQr0_810\"]")
	public static WebElement inst_info;
	
	@FindBy(xpath="//*[@id=\"dropdownlistbox9911f4d2d7da1831460e148518df1b95_824-text\"]")
	public static WebElement howdidyouhear;
	
	@FindBy(xpath="//*[@id=\"shell-header-user-image\"]/span")
	public static WebElement log_icn;
	
	@FindBy(xpath="//*[@id=\"__button72-BDI-content\"]")
	public static WebElement signout_lnk;
	
	@FindBy(xpath="//bdi[@id='__mbox-btn-0-BDI-content']")
	public static WebElement signout_yes;
	
	
	public void loginc4c() throws IOException, InterruptedException
	{

		Commanmethod.type(usernamefield,Commanmethod.getProperty("c4c_id"));
		Commanmethod.type(passwordfield, Commanmethod.getProperty("c4c_pwd"));
		Commanmethod.click(signinbtn);
		Commanmethod.waitUntilElementVisible(searchbtn, 500);
		Commanmethod.click(searchbtn);
		//Commanmethod.implicitwait();
		Commanmethod.waitUntilElementVisible(searchbox, 1000);
		Thread.sleep(3000);
		Commanmethod.type(searchbox, cm.getData("Callbackform", 1, 5));
		Commanmethod.click(searchbtn1);
		Thread.sleep(3000);
		Commanmethod.click(user_name_lnk);
		Thread.sleep(5000);
		Commanmethod.click(morelnk);
	
	}
	
	
	public void verify_ICoverview() throws IOException, InterruptedException
	{
		
		String screenshotPath = cm.addScreenshot();
		
		//CallbackFormPage cb_obj = new CallbackFormPage(driver);
		
		cm.logger.log(LogStatus.INFO, "IC Level verification Started");
		cm.highlightElement(name);
		//First name and Last name verification in C4C Application 
		Thread.sleep(2000);
		//
			if((name.getText().contains(cm.getData("Callbackform", 1, 2))&(name.getText().contains(cm.getData("Callbackform", 1, 3)))))
		{
	    cm.logger.log(LogStatus.PASS, "First Name and Last Name expected result matches with actual result");
	    
		}
         else
        {
	    cm.logger.log(LogStatus.FAIL, "First Name and Last Name expected result not matches with actual result");
	    cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
          }
		cm.highlightElement(primaryemail);
		//Email id verification in C4C Application 
		//
		Thread.sleep(2000);
		if((primaryemail.getText().equals(cm.getData("Callbackform", 1, 5))))
		{
			cm.logger.log(LogStatus.PASS, "Email address expected result matches with actual result");
		}
		else
		{
			//
			cm.logger.log(LogStatus.FAIL, "Email address expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
		
		Thread.sleep(2000);
		
		cm.highlightElement(mobilenumber);
		//Mobile number verification in C4C Application 
		Thread.sleep(2000);
		if((mobilenumber.getText().contains(cm.getData("Callbackform", 1, 6))))
				{
			cm.logger.log(LogStatus.PASS,"Mobile number expected result matches with actual result");
				}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Mobile number expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
		cm.highlightElement(CountryofResidency);
		//Country of residency verification in C4C Application 
		Thread.sleep(2000);
		if((CountryofResidency.getText().equals(cm.getData("Callbackform", 1, 4))))
		{
			cm.logger.log(LogStatus.PASS, "Country of residence expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Country of residence expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
		cm.highlightElement(MarketingAcceptance);
		//Marketing Acceptance verification in C4C Application 
		Thread.sleep(2000);
		if((MarketingAcceptance.getText().equals(cm.getData("Callbackform", 1, 15))))
		{
			cm.logger.log(LogStatus.PASS, "Marketing acceptance expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Marketing acceptance expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
			
		}
		cm.highlightElement(ContactMeBy);
		//Contact details verification in C4C Application 
		Thread.sleep(2000);
		if((ContactMeBy.getText().equals(cm.getData("Callbackform", 1, 16))))
		{
			cm.logger.log(LogStatus.PASS, "Contact details expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Contact details expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
		cm.highlightElement(HowdidyouHear);
		//How did you hear verification in C4C Application 
		Thread.sleep(2000);
		if((HowdidyouHear.getText().equals(cm.getData("Callbackform", 1, 17))))
		{
			cm.logger.log(LogStatus.PASS, "How did you hear expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "How did you hear  expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
		cm.highlightElement(TCAcceptance);
		//T & C Acceptance verification in C4C Application 
		Thread.sleep(2000);
		if((TCAcceptance.getText().equals(cm.getData("Callbackform", 1, 18))))
		{
			cm.logger.log(LogStatus.PASS, "T & C Acceptance expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "T & C Acceptance  expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath));
		}
	
		//cm.highlightElement(Lead_tab);
		//Clicking on Lead Tab
		//Thread.sleep(3000);
		//cm.click(Lead_tab);
		//Thread.sleep(3000);
		cm.highlightElement(Lead_name);
		//Clicking on Lead Name
		cm.click(Lead_name);
		Thread.sleep(7000);
		//cm.highlightElement(lead_morelnk);
		//Clicking on More link 
		//cm.click(lead_morelnk);
		String screenshotPath_lead = cm.addScreenshot();
		cm.logger.log(LogStatus.INFO, "Lead Level verification Started");
		cm.highlightElement(lead_name);
		//First name and Last name verification in C4C Application 
		//if((lead_name.getText().contains(cm.getProperty("firstname"))&(lead_name.getText().contains(cm.getProperty("lastname")))))
		Thread.sleep(2000);
		if((lead_name.getText().contains(cm.getData("Callbackform", 1, 2))&(lead_name.getText().contains(cm.getData("Callbackform", 1, 3)))))
		{
	    cm.logger.log(LogStatus.PASS, "Lead Name expected result matches with actual result");
			
		}
		else
	    {
	    cm.logger.log(LogStatus.FAIL, "Lead Name expected result not matches with actual result");
	    cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
	    }
		cm.highlightElement(lead_source);
		//Source verification in C4C Application
		Thread.sleep(2000);
		if(lead_source.getText().contains(cm.getData("Callbackform", 1, 19)))
		{
			 cm.logger.log(LogStatus.PASS, "Source expected result matches with actual result");
		}
		else
	    {
	         cm.logger.log(LogStatus.FAIL, "Source expected result not matches with actual result");
	         cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
	    }
		cm.highlightElement(lead_advertiser);
		//Advertiser verification in C4C Application 
		Thread.sleep(2000);
		if(lead_advertiser.getText().contains(cm.getData("Callbackform", 1, 20)))
		{
			 cm.logger.log(LogStatus.PASS, "Advertiser expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Advertiser expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(Notes);
		//Notes verification in C4C Application 
		Thread.sleep(2000);
		if(Notes.getText().contains(cm.getData("Callbackform", 1, 21)))
		{
			 cm.logger.log(LogStatus.PASS, "Notes expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Notes expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(idp_organization);
		//IDP Organization verification in C4C Application 
		Thread.sleep(2000);
		if(idp_organization.getText().equals(cm.getData("Callbackform", 1, 27)))
		{
			 cm.logger.log(LogStatus.PASS, "IDP Organization expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "IDP Organization expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(idp_office);
		//IDP Organization verification in C4C Application 
		Thread.sleep(2000);
		if(idp_office.getText().equals(cm.getData("Callbackform", 1, 28)))
		{
			 cm.logger.log(LogStatus.PASS, "IDP Office expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "IDP Office expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(idp_team);
		//IDP Team verification in C4C Application 
		Thread.sleep(2000);
		if(idp_office.getText().equals(cm.getData("Callbackform", 1, 29)))
		{
			 cm.logger.log(LogStatus.PASS, "IDP Team expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "IDP Team expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
			
		cm.highlightElement(lead_email);
		//Email id verification in C4C Application 
		Thread.sleep(2000);
		if(lead_email.getText().contains(cm.getData("Callbackform", 1, 5)))
		{
			 cm.logger.log(LogStatus.PASS, "Email address expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Email address expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(lead_mobile);
		//Phone number verification in C4C Application 
		Thread.sleep(2000);
		if(lead_mobile.getText().contains(cm.getData("Callbackform", 1, 6)))
		{
			 cm.logger.log(LogStatus.PASS, "Mobile number expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Mobile number expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		cm.highlightElement(lead_country);
		//Country verification in C4C Application 
		Thread.sleep(2000);
		if(lead_country.getText().equals(cm.getData("Callbackform", 1, 22)))
		{
			cm.logger.log(LogStatus.PASS, "Country expected result matches with actual result");
		}
		
		else
		{
			cm.logger.log(LogStatus.FAIL, "Country expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_lead));
		}
		
		//Clicking on Qualification Tab
		cm.click(qual_tab);
		String screenshotPath_qual = cm.addScreenshot();
		cm.logger.log(LogStatus.INFO, "Qualification Tab Verification");
		cm.highlightElement(studyin_qual);
		Thread.sleep(2000);
		if(studyin_qual.getText().equals(cm.getData("Callbackform", 1, 23)))
		{
			cm.logger.log(LogStatus.PASS, "Study Destination expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Study Destination expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_qual));
		}
		
		
		cm.highlightElement(studylevel_qual);
		Thread.sleep(2000);
		if(studylevel_qual.getText().equals(cm.getData("Callbackform", 1, 26)))
		{
			cm.logger.log(LogStatus.PASS, "Study Level expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Study Level expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_qual));
		}
		
		cm.highlightElement(online_tab);
		cm.logger.log(LogStatus.INFO, "Online Tab Verification");
		cm.click(online_tab);
		
	
	
		Thread.sleep(2000);
     	cm.highlightElement(nearoffice_online);
     	
     	if(nearoffice_online.getText().equals(cm.getData("Callbackform", 1, 11)))
		{
			cm.logger.log(LogStatus.PASS, "Nearest IDP Office expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Nearest IDP Office expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_qual));
		}
     	
     	cm.highlightElement(inst_info);
     	Thread.sleep(2000);
     	if(inst_info.getText().equals(cm.getData("Callbackform", 1, 24)))
		{
			cm.logger.log(LogStatus.PASS, "University Name expected result matches with actual result");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "University Name expected result not matches with actual result");
			cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_qual));
		}
     	
     	cm.highlightElement(howdidyouhear);
     	Thread.sleep(2000);
     	if(howdidyouhear.getText().equals(cm.getData("Callbackform", 1, 25)))
     	{
     		cm.logger.log(LogStatus.PASS, "How did you hear expacted result matches with actual result");
     	}
     	else
     	{
     		cm.logger.log(LogStatus.FAIL, "How did you hear expacted result not matches with actual result");
     		cm.logger.log(LogStatus.INFO, cm.logger.addScreenCapture(screenshotPath_qual));
     	}
     	

	}
	
	
	public void logoutc4c()
	{
		cm.click(log_icn);
		cm.click(signout_lnk);
		cm.click(signout_yes);
	}
	
		
	}
	
	
	
	
	


