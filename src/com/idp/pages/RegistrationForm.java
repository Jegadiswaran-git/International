package com.idp.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class RegistrationForm {

	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	// click avatar image
	@FindBy(xpath = "/html/body/header/div/nav/ul/li[2]/a[2]/span[3]/img")
	public static WebElement clickavatarimage;
	
	//li[@class='icn']

	// click no i've not registered radio button
	@FindBy(xpath = "//input[@id='passwordno']")
	public static WebElement notregisteredradiobutton;

	// Click Register button
	@FindBy(id = "regstrbtn")
	public static WebElement registerbutton;

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

	// click update button in profile page
	@FindBy(xpath = "//span[@id='hr']//fieldset[@class='crm_hst lst']//input")
	public static WebElement updatebtn;

	// Login email
	@FindBy(id = "emailadd")
	public static WebElement loginemail;

	// Login password
	@FindBy(id = "regpassword")
	public static WebElement loginpwd;

	// click login me button
	@FindBy(id = "loginbtn")
	public static WebElement loginbtn;

	// click hotcoursesabroad image
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/a[1]/img[1]")
	public static WebElement hcabroadimage;

	// click profileimage
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/a[2]/span[1]/img[1]")
	public static WebElement clickprofileimage;

	// logout
	@FindBy(xpath = "//a[@id='logOutLnkId']")
	public static WebElement logout;

	// click agree cookie button
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;
	
	//confirm success email error messga
	@FindBy(xpath="//p[@id='confirmEmailSucErrorMsg']")
	public static WebElement confirmEmailSucErrMsg;
	
	@FindBy(xpath="//button[@id='details-button']")
	public static WebElement advancedlink;
	
	@FindBy(xpath="//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath="//*[@id='geoConsentTextDiv']/div/label")
	public static WebElement geoconsentflag;
	
	
	
	public RegistrationForm(WebDriver driver)
    {
    	this.driver=driver;
    }
	
//	 public static int privateconnect(WebElement advanced, WebElement proceed)
//     {
//    	 
//    	 if(advanced.isEnabled())
//         {
//         	Commanmethod.click(advanced);
//         	if(proceed.isEnabled())
//            {
//            	Commanmethod.click(proceed);
//            	return 1;
//            }
//         }
//    	 else
//    	 {
//    		 return 2;
//    	 }
//		return 1;
// 
//     }

	public void newregistration(String firstname,String lastname,String emailaddress,String password,String residence,String destination,String subject,String startyear, String url, String affiliate, String affiliate_id) throws InterruptedException, IOException {
        
		Commanmethod.logger = Commanmethod.report.startTest("Verify Registration Functionality in "+affiliate+" affiliate", "Scope: Regression pack");
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			
	    	Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
	
		// click accept cookie button
		//Commanmethod.click(gotit);
		
		// click avatar image
		Commanmethod.waitUntilElementVisible(clickavatarimage, 1000);
		Commanmethod.click(clickavatarimage);
		
		Commanmethod.waitUntilElementVisible(notregisteredradiobutton, 1000);
		// click not registered radio button
		Commanmethod.click(notregisteredradiobutton);
		Commanmethod.waitUntilElementVisible(registerbutton, 1000);

		// Click register button
		Commanmethod.click(registerbutton);
		//Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	   //         "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println(firstname);	
		System.out.println(lastname);
		System.out.println(emailaddress);
		System.out.println(password);
		//Commanmethod.logger.log(LogStatus.INFO, "Registration Page load time is " +  (loadtime / 1000) % 60  + " seconds ");
		Commanmethod.waitUntilElementVisible(fstname, 10000);

		// Enter first name
		
		Commanmethod.type(fstname,firstname);

		// Enter last name
		Commanmethod.type(lstname,lastname);

		// Enter Email address
		Commanmethod.type(email1,emailaddress);

		// Verify already registered user
		//Commanmethod.type(passwd,password);
		Commanmethod.click(passwd);
		Commanmethod.waitUntilElementVisible(passwd, 1000);
		Commanmethod.type(passwd,password);

			
			Commanmethod.scrolldown();
//			Commanmethod.waitUntilElementVisible(studydestination, 3000);
//			Commanmethod.click(studydestination);
//			
//			Thread.sleep(3000);
//			Actions builder  = new Actions(driver);
//			Action select = builder.keyDown(studydestination,Keys.SHIFT).sendKeys(studydestination, destination).keyUp(studydestination, Keys.SHIFT).sendKeys(Keys.ENTER).build();
//			select.perform();
//			
//			Commanmethod.selectDropdown(selsubject, subject);
//            Commanmethod.customDrop(studystartyear, startyear);
            
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
			
			
			
			Commanmethod.scrolldown1();
			
			Thread.sleep(3000);
			

//			if(Commanmethod.isElementPresent(geoconsentflag)==true) {
//
//				JavascriptExecutor executor4 = (JavascriptExecutor) driver;
//				executor4.executeScript("arguments[0].scrollIntoView(true);", geoconsentflag);
//				cm.click(geoconsentflag);
//			}
			
			
            if(Commanmethod.isElementPresent(termsconditions)==true){
			Commanmethod.click(termsconditions);
            } else {
            	Commanmethod.logger.log(LogStatus.INFO, "T&C flag is not enabled or displayed");
            }

			Commanmethod.click(registerbtn);
			
			try {
				Commanmethod.logger.log(LogStatus.INFO, "Registration Submitted successfully");
				Commanmethod.logger.log(LogStatus.PASS, "Registration Submitted successfully",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				Thread.sleep(1000);
				Commanmethod.click(updatebtn);
				Commanmethod.logger.log(LogStatus.INFO, "Profile updated successfully");
				Commanmethod.logger.log(LogStatus.PASS, "Profile updated successfully",	
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				Commanmethod.click(hcabroadimage);
				Thread.sleep(1000);
				Commanmethod.click(clickprofileimage);
				Commanmethod.click(logout);
				Commanmethod.report.endTest(Commanmethod.logger);
				
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
			
			catch (Exception e) 
			{
				
				
			}
//			/*
//			 * }else{ String
//			 * emailexists="This email address already exists. Please";
//			 * if(emailexists.contains(CommonFunction.getProperty("Emailexists")
//			 * )){ Thread.sleep(3000); CommonFunction.click(emailexistalready);
//			 * login(); }
//			 */
//		}
//	}
//
//	
//	/*
//	 * public static void login() throws InterruptedException, IOException {
//	 * CommonFunction.waitUntilElementVisible(loginemail, 5);
//	 * if(CommonFunction.isDisplayed(loginemail)) {
//	 * CommonFunction.clear(loginemail); CommonFunction.type(loginemail,
//	 * CommonFunction.getProperty("emailreg")); CommonFunction.click(loginpwd);
//	 * CommonFunction.type(loginpwd, CommonFunction.getProperty("pwdreg"));
//	 * CommonFunction.click(loginbtn); } }
//	 * 
//	 * public static void existinglogindetails() throws IOException { //click
//	 * avatar image CommonFunction.click(clickavatarimage);
//	 * CommonFunction.logger =
//	 * CommonFunction.report.startTest("HC INTL Regression",
//	 * "Scope: Regression suite run"); CommonFunction.type(loginemail,
//	 * CommonFunction.getProperty("emailreg")); CommonFunction.click(loginpwd);
//	 * CommonFunction.type(loginpwd, CommonFunction.getProperty("pwdreg"));
//	 * CommonFunction.click(loginbtn); }
//	 * 
//	 */
		}	
}
	//}
