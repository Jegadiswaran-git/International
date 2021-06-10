package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class LoginForm {

	WebDriver driver;

	// click agree cookie button
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	// click avatar image
	@FindBy(xpath = "/html/body/header/div/nav/ul/li[2]/a[2]/span[3]/img")
	public static WebElement clickavatarimage;

	// click facebook button
	@FindBy(xpath = "//a[@id='facebookloginbutton']")
	public static WebElement facebookbutton;

	// Login email
	@FindBy(id = "emailadd")
	public static WebElement loginemail;

	// Login password
	@FindBy(id = "regpassword")
	public static WebElement loginpwd;

	// Yes, I have password radio button
	@FindBy(xpath = "//input[@id='passwordyes']")
	public static WebElement yespwd;

	// No, I don't have password radio button
	@FindBy(xpath = "//input[@id='passwordno']")
	public static WebElement nopwd;

	// Remember me checkbox
	@FindBy(xpath = "//input[@id='remember']")
	public static WebElement remeberme;

	// Remember me checkbox
	@FindBy(xpath = "//a[@id='forgt']")
	public static WebElement forgetpwdlink;

	// click login me button
	@FindBy(id = "loginbtn")
	public static WebElement loginbtn;

	// Banner display in login page
	@FindBy(xpath = "//div[@id='google_ads_iframe_1029355/int_addregistration_skyscraper_120x600_0__container__']")
	public static WebElement logbanner;

	// click profileimage
	@FindBy(xpath = "//span[@class='lo_ur']//img")
	public static WebElement clickprofileimage;

	// username in profile page
	@FindBy(xpath = "//li[@id='logInUsrName']")
	public static WebElement username;

	// my details in profile page
	@FindBy(xpath = "//a[contains(text(),'My Details')]")
	public static WebElement mydetails;

	// Favourites in profile page
	@FindBy(xpath = "//li[@id='short_list_pod']//a")
	public static WebElement favourites;

	// Universities in profile page
	@FindBy(xpath = "//a[contains(text(),'Universities')]")
	public static WebElement universities;

	// my prosepectus in profile page
	@FindBy(xpath = "//a[contains(text(),'My Prospectuses')]")
	public static WebElement myprospectus;

	// my enquiries in profile page
	@FindBy(xpath = "//a[contains(text(),'My Enquiries')]")
	public static WebElement myenquiries;

	// my saved searched in profile page
	@FindBy(xpath = "//a[contains(text(),'My Saved Searches')]")
	public static WebElement mysavedsearches;

	// my reviews in profile page
	@FindBy(xpath = "//a[contains(text(),'My Reviews')]")
	public static WebElement myreviews;

	// my reading list in profile page
	@FindBy(xpath = "//a[contains(text(),'My Reading List')]")
	public static WebElement myreadinglist;

	// my draft forms in profile page
	@FindBy(xpath = "//a[contains(text(),'My Draft Forms')]")
	public static WebElement mydrafforms;

	// my data in profile page
	@FindBy(xpath = "//a[contains(text(),'My Data')]")
	public static WebElement mydata;

	// logout
	@FindBy(xpath = "//a[@id='logOutLnkId']")
	public static WebElement logout;

	@FindBy(xpath="//a[@id='topNavSrchIcn']")
	public static WebElement topnavsearchicn;

	@FindBy(xpath="//input[@id='topNavSrch']")
	public static WebElement topnavsearchbox;

	@FindBy(xpath="//div[@id='shrtId-0']//span[@class='fa pr fa-heart-o']")
	public static WebElement shortlisticn;

	@FindBy(xpath="//div[@id='shrVwFavPopId-0']")
	public static WebElement addtofavpod;

	@FindBy(xpath="//div[@id='shrVwFavPopId-0']//div[@class='fav_btn caps'][contains(text(),'VIEW MY FAVOURITES')]")
	public static WebElement viewmyfavbtn;

	@FindBy(xpath="//*[@id=\"profileLink\"]")
	public static WebElement podoneunivname;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/h2[1]/a[1]")
	public static WebElement myfavunivname;

	@FindBy(xpath="//h1[contains(text(),'My Favourites')]")
	public static WebElement myfavheadername;

	@FindBy(xpath="//body/div[@class='mainbody']/div[@id='intSrRst']/div[@id='refineRst']/div[@id='sr_result']/div[@class='container ser_ch sr_n sr_ar']/div[@class='sr_set sr_1']/div[2]")
	public static WebElement srsecondprovpod;

	@FindBy(xpath="//span[@class='fa fa-heart-o']")
	public static WebElement prpageshortlisticn;

	@FindBy(xpath="//li[@id='short_list_pod']//a")
	public static WebElement myfavlnk;

	@FindBy(xpath="//b[contains(text(),'You have not shortlisted any courses yet.')]")
	public static WebElement myfavexptxt;

	@FindBy(xpath="//a[@id='logOutLnkId']")
	public static WebElement logoutlnk;

	@FindBy(xpath="//*[@id=\"splashPop\"]/div/div/div[3]/div/div/span/a")
	public static WebElement notnowlnk;

	@FindBy(xpath="//h2[contains(text(),'To save/view your comparison')]")
	public static WebElement myfavexptxt1;

	@FindBy(xpath="//a[contains(text(),'LOG IN')]")
	public static WebElement myfavexploginbtn;

	@FindBy(xpath="//a[@class='bld']")
	public static WebElement myfavexptxt2;

	@FindBy(xpath="//img[@id='callbackCloseIcon']")
	public static WebElement Sflashclosebutton;

	@FindBy(xpath="//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath="//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;




	public LoginForm(WebDriver driver)
	{
		this.driver=driver;
	}


	public void newlogin(String email, String password, String url, String changepassword) throws IOException, InterruptedException, SQLException {

		Commanmethod.logger = Commanmethod.report.startTest("Verify Login Functionality", "Scope: Regression pack");

		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);


//		if(Commanmethod.isElementPresent(gotit)==true)
//		{
//			Commanmethod.click(gotit);
//
//		}

		Commanmethod.waitUntilElementVisible(clickavatarimage, 5000);


		// click avatar image
		Commanmethod.click(clickavatarimage);
//		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
//				"return performance.timing.loadEventEnd - performance.timing.navigationStart;");
//
//		Commanmethod.logger.log(LogStatus.INFO, "Login Page load time is " +  (loadtime / 1000) % 60  + " seconds ");

		Commanmethod.waitUntilElementVisible(facebookbutton, 5000);
		
		if(Commanmethod.isElementPresent(facebookbutton)==true)
		{
			Commanmethod.logger.log(LogStatus.PASS, "Facebook button is displayed");
		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Facebook button is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Facebook button is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		// Check the fields are available in login page
		if (Commanmethod.isElementPresent(loginemail)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Email address field is displayed");
			Commanmethod.type(loginemail, email);
		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Email address field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Email address field is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}

		if (Commanmethod.isElementPresent(yespwd)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Yes I have password radio button field is displayed");

		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Yes I have password radio button field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Yes I have password radio button field is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		if (Commanmethod.isEnabled(yespwd)) {
			Commanmethod.logger.log(LogStatus.PASS, "Yes I have password radio button is selected");
		} else {
			Commanmethod.click(yespwd);

			Commanmethod.logger.log(LogStatus.INFO, "Yes I have password radio button is not selected ");
			Commanmethod.logger.log(LogStatus.FAIL, "Yes I have password radio button is not selected ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}

		if (Commanmethod.isDisplayed(nopwd)) {
			Commanmethod.logger.log(LogStatus.PASS, "No, I've not registered before radio button field is displayed");
		} else {

			Commanmethod.logger.log(LogStatus.INFO,
					"No, I've not registered before radio button field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL,
					"No, I've not registered before radio button field is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isElementPresent(loginpwd)==true) {

			Commanmethod.type(loginpwd, password);
			//Commanmethod.logger.log(LogStatus.INFO, "LogIn page displayed Successfully ");
			Commanmethod.logger.log(LogStatus.PASS, "Password field displayed Successfully   ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		} else {

			//Commanmethod.logger.log(LogStatus.INFO, "Password field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Password field is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		if (Commanmethod.isElementPresent(remeberme)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Remember me checkbox field is displayed");
		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Remember me checkbox field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Remember me checkbox field is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isElementPresent(forgetpwdlink)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Forget your password link is displayed");
		} else {

			Commanmethod.logger.log(LogStatus.FAIL, "Forget your password link is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		//		if (Commanmethod.isDisplayed(logbanner)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "Banner slot is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "Banner slot is not displayed ");
		//			Commanmethod.logger.log(LogStatus.FAIL, "Banner slot is not displayed ",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}

		if (Commanmethod.isElementPresent(loginbtn)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Log me in button is displayed ");
			Commanmethod.click(loginbtn);
			Commanmethod.logger.log(LogStatus.INFO, "Login functionality working as expected ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Log me in button is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Log me in button is not displayed ",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Commanmethod.logger.log(LogStatus.PASS, "Login functionality working as expected ");
		Commanmethod.logger.log(LogStatus.INFO, "Login functionality working as expected ",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		// This code is modified by Jegadiswaran on 23/10/2019
		//Verify count incremented to 2 after shortlist the university in SR/PR Page
		//Commanmethod.click(Sflashclosebutton);
		//Thread.sleep(10000);
		//		Commanmethod.click(topnavsearchicn);
		//		Thread.sleep(10000);
		//		Commanmethod.type(topnavsearchbox, Commanmethod.getProperty("searchkeyword"));
		//		topnavsearchbox.sendKeys(Keys.ENTER);
		//		Commanmethod.click(gotit);
		//		Thread.sleep(10000);
		//		String srunivname = podoneunivname.getText();
		//		Thread.sleep(10000);
		//		Commanmethod.click(shortlisticn);
		//		Thread.sleep(10000);
		//		
		//		
		//		if(addtofavpod.getText().contains("Added to favourites"))
		//		{
		//			Commanmethod.logger.log(LogStatus.INFO, "Added to favourites text is displayed in  Add to favourites pod");
		//			Commanmethod.logger.log(LogStatus.PASS, "Added to favourites text is displayed in  Add to favourites pod",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		else
		//		{
		//			Commanmethod.logger.log(LogStatus.INFO, "Added to favourites text is not displayed in  Add to favourites pod");
		//			Commanmethod.logger.log(LogStatus.FAIL, "Added to favourites text is not displayed in  Add to favourites pod",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		
		//		if(Commanmethod.isDisplayed(viewmyfavbtn))
		//		{
		//			Commanmethod.logger.log(LogStatus.INFO, "VIEW MY FAVOURITES button is displayed in  Add to favourites pod");
		//			Commanmethod.logger.log(LogStatus.PASS, "VIEW MY FAVOURITES button is displayed in  Add to favourites pod",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			Commanmethod.click(viewmyfavbtn);
		//			String favpageunivname = myfavunivname.getText();
		//			
		//			if(myfavheadername.getText().contentEquals("My Favourites") && srunivname.contentEquals(favpageunivname))
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application redirected to My Favourites Page and Shortlisted institution displayed in My Favourites Page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Application redirected to My Favourites Page and Shortlisted institution displayed in My Favourites Page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//				
		//				Commanmethod.navigateBack();
		//				
		//			
		//			}
		//			else
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application redirected to My Favourites Page and Shortlisted institution not displayed in My Favourites Page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Application redirected to My Favourites Page and Shortlisted institution not displayed in My Favourites Page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//				Commanmethod.navigateBack();
		//			}
		//			
		//			
		//		}
		//		else
		//		{
		//			Commanmethod.logger.log(LogStatus.INFO, "VIEW MY FAVOURITES button is not displayed in  Add to favourites pod");
		//			Commanmethod.logger.log(LogStatus.FAIL, "VIEW MY FAVOURITES button is not displayed in  Add to favourites pod",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		
		//		//Code added on 23/10/2019
		//		Thread.sleep(2000);
		//		Commanmethod.click(srsecondprovpod);
		//		Thread.sleep(5000);
		//		Commanmethod.click(prpageshortlisticn);
		//		
		//	
		//		Thread.sleep(10000);
		//		Commanmethod.click(clickprofileimage);
		//		Thread.sleep(3000);
		//		Commanmethod.logger.log(LogStatus.INFO, "User profile sections listed successfully for logged in users");
		//		Commanmethod.logger.log(LogStatus.PASS, "User profile sections listed successfully for logged in users",
		//				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		if (Commanmethod.isDisplayed(username)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "Username is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "username is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "username is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(mydetails)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "Details is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "Details is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "Details is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(favourites)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My favourites is displayed");
		//			Commanmethod.click(myfavlnk);
		//			if(myfavexptxt.getText().contentEquals("You have not shortlisted any courses yet."))
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Expected text 'You have not shortlisted any courses yet.' is displayed in My favourites page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Expected text 'You have not shortlisted any courses yet.' is displayed in My favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			}
		//			else
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Expected text 'You have not shortlisted any courses yet.' is not displayed in My favourites page");
		//				Commanmethod.logger.log(LogStatus.FAIL, "Expected text 'You have not shortlisted any courses yet.' is not displayed in My favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//	
		//			}
		//			
		//		} 
		//		else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My favourites is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My favourites is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		
		//		Thread.sleep(5000);
		//		Commanmethod.click(clickprofileimage);
		//		
		//		if (Commanmethod.isDisplayed(universities)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "Universities is displayed");
		//			String univ_txt = universities.getText();
		//			if(univ_txt.contains("2"))
		//			{
		//				Commanmethod.logger.log(LogStatus.PASS, "University shortlist count is incremented to 2");
		//			}
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "Universities is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "Universities is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(myprospectus)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My prospectus is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My prospectus is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My prospectus is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(myenquiries)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My enquiries is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My enquiries is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My enquiries is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(mysavedsearches)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My saved searches is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My saved searches is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My saved searches is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(myreviews)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My reviews searches is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My reviews is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My reviews is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(myreadinglist)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My reading list is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My reading list is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My reading list is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(mydrafforms)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My draft forms is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My draft forms is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My draft forms is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//
		//		}
		//		if (Commanmethod.isDisplayed(mydata)) {
		//			Commanmethod.logger.log(LogStatus.PASS, "My data is displayed");
		//		} else {
		//			
		//			Commanmethod.logger.log(LogStatus.INFO, "My data is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "My data is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//		}
		//		if (Commanmethod.isDisplayed(logout)) {
		//			
		//			Commanmethod.logger.log(LogStatus.PASS, "Logout is displayed");
		//			//Commanmethod.report.endTest(Commanmethod.logger);
		//			//Commanmethod.verifyStatsKey( Commanmethod.getProperty("affiliate_id"), Commanmethod.getProperty("user_id"));
		//			Commanmethod.click(logoutlnk);
		//			Thread.sleep(5000);
		//			Commanmethod.click(topnavsearchicn);
		//			Commanmethod.type(topnavsearchbox, Commanmethod.getProperty("searchkeyword"));
		//			topnavsearchbox.sendKeys(Keys.ENTER);
		//			Thread.sleep(5000);
		//			Commanmethod.click(shortlisticn);
		//			Thread.sleep(2000);
		//			Commanmethod.click(viewmyfavbtn);
		//			Thread.sleep(3000);
		//			//Commanmethod.click(notnowlnk);
		//			if(myfavexptxt1.getText().contentEquals("To save/view your comparison"))
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application displayed To save/view your comparison text in My Favourites page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Application displayed To save/view your comparison text in My Favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			}
		//			else
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application failed to display To save/view your comparison text in My Favourites page");
		//				Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display To save/view your comparison text in My Favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//				
		//			}
		//			if(myfavexploginbtn.getText().contentEquals("LOG IN"))
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application displayed LOG IN button in My Favourites page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Application displayed LOG IN button in My Favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			}
		//			else
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application failed to display LOG IN button in My Favourites page");
		//				Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display LOG IN button in My Favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//				
		//			}
		//			
		//			if(myfavexptxt2.getText().contentEquals("Don't have an account yet?"))
		//			{
		//				Commanmethod.logger.log(LogStatus.INFO, "Application displayed Don't have an account yet? text in My Favourites page");
		//				Commanmethod.logger.log(LogStatus.PASS, "Application displayed Don't have an account yet? text in My Favourites page",
		//						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			}
		//			else
		//			{
		//			Commanmethod.logger.log(LogStatus.INFO, "Application failed to display Don't have an account yet? text in My Favourites page");
		//			Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display Don't have an account yet? text in My Favourites page",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//				
		//			}
		//	
		//		}
		//		else {
		//			Commanmethod.logger.log(LogStatus.INFO, "logout is not displayed");
		//			Commanmethod.logger.log(LogStatus.FAIL, "logout is not displayed",
		//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		//			
		//			
		//		}
	}
}
