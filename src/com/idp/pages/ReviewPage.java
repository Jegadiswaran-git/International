package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class ReviewPage {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	@FindBy(id="rvwIdPrfPageAnt")
	public static WebElement writeareviewbtn;
	
	@FindBy(xpath="//a[@id='r1']")
	public static WebElement Overallexprating;
	
	@FindBy(xpath="//a[@id='r2']")
	public static WebElement admissionprocess;
	
	@FindBy(xpath="//a[@id='r3']")
	public static WebElement fundingandschol;
	
	@FindBy(xpath="//a[@id='r4']")
	public static WebElement studyexp;
	
	@FindBy(xpath="//a[@id='r5']")
	public static WebElement lifeexp;
	
	@FindBy(xpath="//a[@id='r6']")
	public static WebElement jobpros;
	
	@FindBy(xpath="//input[@id='reviewtitle']")
	public static WebElement reviewtle;
	
	@FindBy(xpath="//textarea[@id='txtArea']")
	public static WebElement txtarea;
	
	@FindBy(xpath="//select[@id='gradyear']")
	public static WebElement gradyear;
	
	@FindBy(xpath="//select[@id='reviewstudyLevelId']")
	public static WebElement studylvl;
	
	@FindBy(xpath="//input[@id='courseTitle']")
	public static WebElement subjectname;
	
	@FindBy(xpath="//input[@id='courseText']")
	public static WebElement crsname;
	
	@FindBy(xpath="//li[@id='recomnd-11']")
	public static WebElement recommendyes;
	
	@FindBy(xpath="//input[@id='fstname']")
	public static WebElement fstname;
	
	@FindBy(xpath="//input[@id='lstname']")
	public static WebElement lstname;
	
	@FindBy(xpath="//input[@id='confirmEmailId']")
	public static WebElement confirmEmailId;
	
	@FindBy(xpath="//select[@id='yournationality']")
	public static WebElement nationality;
	
	@FindBy(xpath="//input[@id='passwordValue']")
	public static WebElement pwd;
	
	@FindBy(xpath="//div[@class='c_chck']")
	public static WebElement review_agree_chk;
	
	@FindBy(xpath="//div[@class='trm_lt grey']")
	public static WebElement tandc_chk;
	
	@FindBy(xpath="//input[@id='greybut']")
	public static WebElement submitbtn;
	
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;
	
	@FindBy(xpath="//a[@id='tpNvInspLnk']")
	public static WebElement insplink;
	
	@FindBy(xpath="//a[contains(text(),'Student reviews')]")
	public static WebElement studreviewslink;
	
	@FindBy(xpath="//select[@id='countrySeId']")
	public static WebElement selectctry;
	
	@FindBy(xpath="//input[@id='college']")
	public static WebElement univsearchbox;	
	
	@FindBy(xpath="//input[@class='org_btn']")
	public static WebElement searchbtn;
	
	@FindBy(xpath="//div[2]//div[1]//div[1]//span[1]//p[1]")
	public static WebElement ps_reviewername;
	
	@FindBy(xpath="//body/div[@id='middle_cnt_shrt']/div[@class='container']/div[@class='flud bgwht mt30']/div[2]/div[1]/div[2]/div[4]")
	public static WebElement ps_reviewtitle;
			
	@FindBy(xpath="//*[@id='middle_cnt_shrt']/div/div[1]/div[2]/div/div[2]/div[4]/pre")
	public static WebElement ps_reviewcontent;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/span/a[2]")
    public static WebElement agreebtn;
	
	@FindBy(xpath="//*[@id='qlclose1']")
	 public static WebElement thankyoupage;
	
	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath="//h2[@id='qlclose1']")
	public static WebElement successmsg;
	
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;
	
	@FindBy(xpath="//*[@id='JA.74$$$2710~4']")
	public static WebElement artdropdown;
	
	@FindBy(xpath="//input[@id='geoConsentId']")
	public static WebElement geoconsent_flag;
	
	
	
	
		
	String screenshotPath = cm.addScreenshot();
	
	
	public ReviewPage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
	public void clickreviewbtn() throws InterruptedException
	{
//		Boolean isPresen = Commanmethod.isDisplayed(advancedlink);
//
//		if (isPresen == true) {
//			Commanmethod.click(advancedlink);
//			Commanmethod.click(proceedlink);
//		}
//
//		cm.click(writeareviewbtn);
		
	}
	
	public void submitreview(String url,String reviewtitle, String reviewcomments, String yearofgrad, String studylevel, String subject, String coursename, String firstname, String lastname, String emailaddress, String yourcountry, String password, String country, String univname, String startdate, String enddate, String affiliate, String affiliate_id) throws IOException, InterruptedException, SQLException
	{
		
		Commanmethod.logger = Commanmethod.report.startTest(
				"Verify Review Functionality in" + affiliate,
				"Scope: Regression pack");
	    cm.logger.log(LogStatus.INFO, "Navigated to Content Hub Page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
	    
	    if(Commanmethod.isDisplayed(advancedlink))
		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}
		
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);

		cm.click(writeareviewbtn);
		if(Commanmethod.isDisplayed(gotit))
		{
			Commanmethod.click(gotit);

		}
		
		Thread.sleep(5000);
	
		
		cm.logger.log(LogStatus.INFO, "Navigated to Review Page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		cm.click(Overallexprating);
		Thread.sleep(5000);
		
		cm.click(admissionprocess);
		Thread.sleep(5000);
		cm.click(fundingandschol);
		Thread.sleep(5000);
		cm.click(studyexp);
		Thread.sleep(5000);
		cm.click(lifeexp);
		Thread.sleep(5000);
		cm.click(jobpros);
		Thread.sleep(5000);
	    cm.type(reviewtle, reviewtitle);
	    cm.type(txtarea, reviewcomments);
        cm.logger.log(LogStatus.INFO, "Screenshot",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
	    cm.selectDropdown(gradyear, yearofgrad);
	    cm.selectDropdown(studylvl, studylevel);
	    cm.type(subjectname, subject);
	    Thread.sleep(3000);
	    cm.click(artdropdown);
//	    subjectname.sendKeys(Keys.DOWN);
//	    subjectname.sendKeys(Keys.DOWN);
//	    subjectname.sendKeys(Keys.DOWN);
//	    subjectname.sendKeys(Keys.DOWN);
//	    subjectname.sendKeys(Keys.ENTER);
//	    Thread.sleep(2000);
	    cm.type(crsname, coursename);
	    cm.click(recommendyes);
	    cm.type(fstname, firstname);
	    cm.type(lstname, lastname);
	    cm.type(confirmEmailId, emailaddress);
	    confirmEmailId.sendKeys(Keys.TAB);
        cm.logger.log(LogStatus.INFO, "Screenshot",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        
	    //cm.type(nationality, yourcountry );
	    cm.type(pwd, password);
	    cm.click(review_agree_chk);
//	    Actions act =  new Actions(driver);
//	    act.moveToElement(geoconsent_flag).click().perform();
	   
        cm.click(tandc_chk);
        cm.logger.log(LogStatus.INFO, "Screenshot",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
	    cm.click(submitbtn);
	    if(successmsg.isDisplayed())
	    {
	    
	    cm.logger.log(LogStatus.PASS, "Review Submitted Successfully",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
	   
	    }
	    else
	    {
	   	 cm.logger.log(LogStatus.FAIL, "Review not Submitted",
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

