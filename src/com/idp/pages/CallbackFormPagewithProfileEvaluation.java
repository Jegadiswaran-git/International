package com.idp.pages;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CallbackFormPagewithProfileEvaluation {

	WebDriver driver;
	Commanmethod cm = new Commanmethod();

	// @FindBy(xpath="//*[@id=\"con-for-nav-a\"]/div[3]/div[2]/div[2]/h1/a")
	// public static WebElement univ_name;
	// public String Univ_name = univ_name.getText();

	@FindBy(id = "contInst")
	public static WebElement getappadvice;
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;
	@FindBy(id = "fstname")
	public static WebElement firstname;
	@FindBy(id = "lstname")
	public static WebElement lastname;
	@FindBy(id = "confirmEmailId")
	public static WebElement emailid;
	@FindBy(id = "calBackCountryCode")
	public static WebElement phonenocode;
	@FindBy(id = "phoneNo")
	public static WebElement phoneno;
	@FindBy(id = "yournationality")
	public static WebElement nationality;
	@FindBy(id = "destCtryId")
	public static WebElement studydest;
	@FindBy(id = "studyLevel")
	public static WebElement studylevel;
	@FindBy(id = "yearValue")
	public static WebElement studyyear;
	@FindBy(xpath = "//*[@id=\"enquirydiv\"]/fieldset[2]/div[1]/div/label")
	public static WebElement consentFlag;

	@FindBy(xpath = "//*[@id=\"nws4\"]/div/label")
	public static WebElement terms_chk;

	@FindBy(xpath = "//*[@id=\"contactMeByFlagDiv\"]/div/label")
	public static WebElement contactMeByFlag;
	@FindBy(xpath = "//*[@id=\"shareLeadUniDiv\"]/div/label")
	public static WebElement shareIdpLeadUniFlag;
	@FindBy(id = "greybut")
	public static WebElement getadvicebtn;
	@FindBy(id = "officeId")
	public static WebElement officeid;
	@FindBy(id = "cal_back_continue")
	public static WebElement cal_back_continue;
	@FindBy(id = "otpNo")
	public static WebElement verification;
	@FindBy(id = "call_us_veri_sub")
	public static WebElement verif_submit;
	@FindBy(id = "calbackLightbox")
	public static WebElement lightbox;
	@FindBy(xpath = "//*[@id=\"password\"]")
	public static WebElement password;

	@FindBy(id = "acceptBtnId")
	public static WebElement acceptbtn;
	@FindBy(id = "cal_back_success")
	public static WebElement calbacksuccess;

	// profile evaluation
	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/a[1]")
	public static WebElement profquesone;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/span[1]/div[1]")
	public static WebElement currentqualtext;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[5]/div[1]/select[1]")
	public static WebElement profquestwo;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[8]/div[1]/a[1]")
	public static WebElement profquesthree;

	@FindBy(xpath = "//*[@id='inpt_220-55']")
	public static WebElement profquesfour;

	@FindBy(xpath = "//*[@id=\"skip_id_223\"]")
	public static WebElement profquesfive;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[17]/div[1]/a[2]")
	public static WebElement profquessix;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[20]/div[1]/select[1]")
	public static WebElement profquesseven;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[23]/div[1]/a[2]")
	public static WebElement profqueseight;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[26]/div[1]/select[1]")
	public static WebElement profquesnine;

	@FindBy(xpath = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[29]/fieldset[1]/textarea[1]")
	public static WebElement addinfo;

	@FindBy(xpath = "//*[@id=\"inpt_244-57\"]")
	public static WebElement profquesten;
	
	@FindBy(xpath="//*[@id=\"skip_id_238\"]")
	public static WebElement questelevenskip;
	
	@FindBy(xpath="//*[@id=\"skip_id_239\"]")
	public static WebElement skipcontinue;
	
	@FindBy(xpath="//a[@class='wba']")
	public static WebElement cbuniv;

	public CallbackFormPagewithProfileEvaluation(WebDriver driver) {
		this.driver = driver;
	}

	public void submitcallbackform() throws InterruptedException, IOException, SQLException, InvocationTargetException {

		Commanmethod.logger = Commanmethod.report.startTest("Verify CallBack Form Functionality with Profile Evaluation", "Scope: Regression pack");
		cm.logger.log(LogStatus.INFO, "Navigated to Content Hub Page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		String studylevelvalue = cm.getData("Callbackform", 2, 7);
		
		Thread.sleep(2000);
		cm.click(gotit);
		cm.click(getappadvice);
		
		
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	            "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			
		cm.logger.log(LogStatus.INFO, "Callbackform Page load time is " +  (loadtime / 1000) % 60  + " seconds ");
		
		Thread.sleep(5000);
		// Enter details in Step 1
		cm.type(firstname, cm.getData("Callbackform", 2, 2));
		cm.type(lastname, cm.getData("Callbackform", 2, 3));
		cm.type(emailid, cm.getData("Callbackform", 2, 5));
		emailid.sendKeys(Keys.TAB);
		//cm.selectDropdown(phonenocode, cm.getProperty("callback_mobilecode"));
		cm.type(phoneno, cm.getData("Callbackform", 2, 6));

		/*
		 * Select select = new Select(nationality); WebElement option =
		 * select.getFirstSelectedOption(); String defaultItem =
		 * option.getText(); cm.setProperty("CountryofResidence", defaultItem);
		 */

		cm.scrolldown();

		/*
		 * Select select1 = new Select(studydest); WebElement option1 =
		 * select1.getFirstSelectedOption(); String defaultItem1 =
		 * option1.getText(); 
		 * cm.setProperty("StudyDestination", defaultItem1);
		 */

		// studylevel.click();
		// cm.selectVisibleText(studylevel,
		// cm.getProperty("callback_studylevel"));
		// studylevel.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		Select oSelect = new Select(studylevel);
		oSelect.selectByVisibleText(cm.getData("Callbackform", 2, 7));

		Select oSelect1 = new Select(studyyear);
		oSelect1.selectByVisibleText(cm.getData("Callbackform", 2, 8));

		// cm.click(consentFlag);
		Thread.sleep(1000);
		cm.click(terms_chk);
		cm.click(contactMeByFlag);
		
		
		
		try {
		   cm.click(shareIdpLeadUniFlag);
		} 
		catch(NoSuchElementException | StaleElementReferenceException  e) {
			Commanmethod.logger.log(LogStatus.INFO, "Share IDP Leads to University flag is not enabled in Callback form");
		}
		
		Commanmethod.logger.log(LogStatus.INFO, "Entered details is Step 1");
		Commanmethod.logger.log(LogStatus.PASS, "All mandatory fieds are filled completely",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Thread.sleep(1000);
		cm.click(getadvicebtn);

		// Select Office in Step 2
		Thread.sleep(1000);
		Select oSelect2 = new Select(officeid);
		oSelect2.selectByVisibleText(cm.getData("Callbackform", 2, 11));
		cm.scrollup();
		Thread.sleep(1000);
		Commanmethod.logger.log(LogStatus.INFO, "Selected nearest office is Step 2");
		Commanmethod.logger.log(LogStatus.PASS, "Nearest IDP office selected successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.scrolldown();
		cm.click(cal_back_continue);

		// Verify OTP
		cm.getOTP(cm.getData("Callbackform", 2, 5), cm.getData("Callbackform", 2, 9));
		Thread.sleep(1000);

		cm.type(verification, cm.getOTP(cm.getData("Callbackform", 2, 5), cm.getData("Callbackform", 2, 9)));
		Commanmethod.logger.log(LogStatus.INFO, "OTP verification");
		Commanmethod.logger.log(LogStatus.PASS, "OTP verification completed successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.click(verif_submit);
		Thread.sleep(2000);

		// Profile evaluation
		cm.waitUntilElementVisible(profquesone, 20);
		cm.click(profquesone);
		Thread.sleep(7000);
		cm.click(profquestwo);
		Thread.sleep(1000);
		cm.selectDropdown(profquestwo, cm.getData("Callbackform", 2, 30));
		cm.waitUntilElementVisible(profquesthree, 40);
		cm.click(profquesthree);
		Thread.sleep(7000);
		cm.click(profquesfour);
		Thread.sleep(1000);
		cm.selectDropdownVisibleText(profquesfour, cm.getData("Callbackform", 2, 31));
		cm.waitUntilElementVisible(profquesfive, 20);
		cm.click(profquesfive);
		cm.waitUntilElementVisible(profquessix, 20);
		cm.click(profquessix);
		Thread.sleep(7000);
		cm.click(profquesseven);
		Thread.sleep(1000);
		cm.selectDropdown(profquesseven, cm.getData("Callbackform", 2, 32));
		cm.waitUntilElementVisible(profqueseight, 20);
		cm.click(profqueseight);
		Thread.sleep(9000);
		cm.click(profquesnine);
		Thread.sleep(1000);
		cm.selectDropdown(profquesnine, cm.getData("Callbackform", 2, 33));
		Thread.sleep(3000);
		cm.waitUntilElementVisible(profquesten, 20);

		Commanmethod.logger.log(LogStatus.INFO, "Entered details in profile evaluation");
		Commanmethod.logger.log(LogStatus.PASS, "Profile evaluation completed successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		cm.click(profquesten);
		cm.waitUntilElementVisible(questelevenskip, 20);
        cm.click(questelevenskip);
        cm.waitUntilElementVisible(skipcontinue, 100);
        cm.click(skipcontinue);
    	Commanmethod.logger.log(LogStatus.INFO, "Call back submitted successfully");
		Commanmethod.logger.log(LogStatus.PASS, "Call back submitted successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        
		// Password light box
        cm.waitUntilElementVisible(password, 20);
		cm.type(password,  cm.getData("Callbackform", 2, 14));
		Thread.sleep(1000);
		cm.click(acceptbtn);
	
		cm.click(calbacksuccess);
		Thread.sleep(3000);
		if(cbuniv.isDisplayed()&&cbuniv.getText().contentEquals(cm.getProperty("chuniversity")))
		{
			cm.logger.log(LogStatus.INFO, "Call back form is submitted successfully with password details");
			cm.logger.log(LogStatus.PASS, "Call back form is submitted successfully with password details",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		else
		{
			cm.logger.log(LogStatus.FAIL, "Call back form is not submitted.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		cm.report.endTest(cm.logger);
		

	}
	
	

}
