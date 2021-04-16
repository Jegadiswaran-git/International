package com.idp.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class AddtoFavouritesFunctionality{
	
	
	WebDriver driver;

	Commanmethod cm = new Commanmethod();

	@FindBy(xpath = "//a[@id='tpNvInspLnk']")
	public static WebElement getinsplnk;

	@FindBy(xpath = "//a[contains(text(),'Student reviews')]")
	public static WebElement studreviewslnk;

	@FindBy(xpath = "//select[@id='countrySeId']")
	public static WebElement selectcountry;

	@FindBy(xpath = "//input[@id='college']")
	public static WebElement enteruniversity;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[1]")
	public static WebElement searchajx;

	@FindBy(xpath = "//input[@class='org_btn']")
	public static WebElement searchbtn;

	@FindBy(xpath = "//i[@class='fa fa-search fa-2x']")
	public static WebElement topnavsearchicn;

	@FindBy(xpath = "//input[@id='topNavSrch']")
	public static WebElement topnavsearchbox;

	@FindBy(xpath = "//p[@class='mb10 asr_np']")
	public static WebElement artheadercontent;

	@FindBy(xpath = "//*[@id='sr_result']/div/div/div[2]/a/div")
	public static WebElement providerpod;

	@FindBy(xpath = "//a[@class='wba']")
	public static WebElement chprovidername;

	@FindBy(xpath = "//a[@id='visitWebLinkId']")
	public static WebElement chvisitwebsitelnk;

	@FindBy(xpath = "//a[@id='contInst']")
	public static WebElement chcontinstbtn;

	@FindBy(xpath = "//span[contains(text(),'Subject area*')]")
	public static WebElement subjectsearch;

	@FindBy(xpath = "//span[contains(text(),'Destination')]")
	public static WebElement destsearch;

	@FindBy(xpath = "//span[contains(text(),'Undergraduate (e.g. BA & Diploma)')]")
	public static WebElement qualsearch;

	@FindBy(xpath = "//ul[@id='tab1lid']//button")
	public static WebElement podsearchbtn;

	@FindBy(xpath = "//div[@class='logo']//img[contains(@class,'lazy-loaded')]")
	public static WebElement abroadlogo;

	@FindBy(xpath = "//li[@id='nav-j']")
	public static WebElement pop_subj;

	@FindBy(xpath = "//a[@class='catlog_link']")
	public static WebElement subjlnk;

	@FindBy(xpath = "//span[@class='fa fa-heart-o']")
	public static WebElement praddfavlink;

	@FindBy(xpath = "//div[@class='sr_set pr_set sr_1']//div[1]//a[1]")
	public static WebElement cdpod;

	@FindBy(id = "ctitle_chosen")
	public static WebElement subjtxtbox;

	@FindBy(xpath = "//span[contains(text(),'Destination')]")
	public static WebElement desttxtbox;

	@FindBy(xpath = "//*[@id='studyLevelId_chosen']")
	public static WebElement qualtxtbox;

	@FindBy(xpath = "//ul[@id='tab1lid']//button")
	public static WebElement homesearchbtn;

	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement iagreebtn;

	// Search results page locators
	@FindBy(xpath = "//div[@id='srtByid']//a[@id='prLink']")
	public static WebElement srfirstpod;

	@FindBy(xpath = "//h1[@class='srf1 bd wba']")
	public static WebElement srheader;

	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	@FindBy(xpath = "//button[@id='topNavSrchBtn']")
	public static WebElement topnavsearchbutton;

	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath="//*[@id=\"profileLink\"]")
	public static WebElement podoneunivname;
	
	@FindBy(xpath="//div[@id='shrtId-0']//span[@class='fa pr fa-heart-o']")
	public static WebElement shortlisticn;
	
	@FindBy(xpath="//div[@id='shrVwFavPopId-0']")
	public static WebElement addtofavpod;
	
	@FindBy(xpath="//div[@id='shrVwFavPopId-0']//div[@class='fav_btn caps'][contains(text(),'VIEW MY FAVOURITES')]")
	public static WebElement viewmyfavbtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/h2[1]/a[1]")
	public static WebElement myfavunivname;
	
	@FindBy(xpath="//h1[contains(text(),'My Favourites')]")
	public static WebElement myfavheadername;
	
	// click avatar image
		@FindBy(xpath = "/html/body/header/div/nav/ul/li[2]/a[2]/span[3]/img")
		public static WebElement clickavatarimage;
		
		// Login email
		@FindBy(id = "emailadd")
		public static WebElement loginemail;
		
		// Login password
		@FindBy(id = "regpassword")
		public static WebElement loginpwd;
		
		// click login me button
		@FindBy(id = "loginbtn")
		public static WebElement loginbtn;
		
		@FindBy(xpath="//body/div[@class='mainbody']/div[@id='intSrRst']/div[@id='refineRst']/div[@id='sr_result']/div[@class='container ser_ch sr_n sr_ar']/div[@class='sr_set sr_1']/div[2]")
		public static WebElement srsecondprovpod;
		
		@FindBy(xpath="//span[@class='fa fa-heart-o']")
		public static WebElement prpageshortlisticn;
		
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

		@FindBy(xpath="//li[@id='short_list_pod']//a")
		public static WebElement myfavlnk;
		
		@FindBy(xpath="//b[contains(text(),'You have not shortlisted any courses yet.')]")
		public static WebElement myfavexptxt;
		
		@FindBy(xpath="//a[@id='logOutLnkId']")
		public static WebElement logoutlnk;
		
		@FindBy(xpath="//h2[contains(text(),'To save/view your comparison')]")
		public static WebElement myfavexptxt1;
		
		@FindBy(xpath="//a[contains(text(),'LOG IN')]")
		public static WebElement myfavexploginbtn;
		
		@FindBy(xpath="//a[@class='bld']")
		public static WebElement myfavexptxt2;
		
		
		


	
	public AddtoFavouritesFunctionality(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addtofavourites(String url, String ksearch, String addtofav, String myfav, String email, String password) throws InterruptedException, IOException
	{
		
		Commanmethod.logger = Commanmethod.report.startTest("Verify Top Nav Search Functionality",
				"Scope: Regression pack");
		Commanmethod.click(clickavatarimage);
		Commanmethod.type(loginemail, email);
		Commanmethod.type(loginpwd, password);
		Commanmethod.click(loginbtn);
		Thread.sleep(5000);
		
		cm.click(topnavsearchicn);
		Thread.sleep(15000);
		cm.type(topnavsearchbox, ksearch);
		Thread.sleep(3000);
		cm.click(topnavsearchbutton);

		Boolean isPresen = Commanmethod.isDisplayed(gotit);

		if (isPresen == true)

		{
			Commanmethod.click(gotit);
			
		}

		//Commanmethod.click(gotit);
		Thread.sleep(10000);
		String srunivname = podoneunivname.getText();
		Thread.sleep(10000);
		Commanmethod.click(shortlisticn);
		Thread.sleep(10000);
		
		
		if(addtofavpod.getText().contains(addtofav))
		{
			Commanmethod.logger.log(LogStatus.INFO, "Added to favourites text is displayed in  Add to favourites pod");
			Commanmethod.logger.log(LogStatus.PASS, "Added to favourites text is displayed in  Add to favourites pod",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "Added to favourites text is not displayed in  Add to favourites pod");
			Commanmethod.logger.log(LogStatus.FAIL, "Added to favourites text is not displayed in  Add to favourites pod",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		if(Commanmethod.isDisplayed(viewmyfavbtn))
		{
			Commanmethod.logger.log(LogStatus.INFO, "VIEW MY FAVOURITES button is displayed in  Add to favourites pod");
			Commanmethod.logger.log(LogStatus.PASS, "VIEW MY FAVOURITES button is displayed in  Add to favourites pod",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.click(viewmyfavbtn);
			String favpageunivname = myfavunivname.getText();
			
			if(myfavheadername.getText().contentEquals(myfav) && srunivname.contentEquals(favpageunivname))
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application redirected to My Favourites Page and Shortlisted institution displayed in My Favourites Page");
				Commanmethod.logger.log(LogStatus.PASS, "Application redirected to My Favourites Page and Shortlisted institution displayed in My Favourites Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				
				Commanmethod.navigateBack();
				
			
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application redirected to My Favourites Page and Shortlisted institution not displayed in My Favourites Page");
				Commanmethod.logger.log(LogStatus.PASS, "Application redirected to My Favourites Page and Shortlisted institution not displayed in My Favourites Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				Commanmethod.navigateBack();
			}
			
			
		}
		else
		{
			Commanmethod.logger.log(LogStatus.INFO, "VIEW MY FAVOURITES button is not displayed in  Add to favourites pod");
			Commanmethod.logger.log(LogStatus.FAIL, "VIEW MY FAVOURITES button is not displayed in  Add to favourites pod",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Thread.sleep(2000);
		
		Boolean isPresen1 = Commanmethod.isDisplayed(gotit);

		if (isPresen1 == true)

		{
			Commanmethod.click(gotit);
			
		}

		Commanmethod.click(srsecondprovpod);
		Thread.sleep(5000);
		Commanmethod.click(prpageshortlisticn);
		
	
		Thread.sleep(10000);
		Commanmethod.click(clickprofileimage);
		Thread.sleep(3000);
		Commanmethod.logger.log(LogStatus.INFO, "User profile sections listed successfully for logged in users");
		Commanmethod.logger.log(LogStatus.PASS, "User profile sections listed successfully for logged in users",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		if (Commanmethod.isDisplayed(username)) {
			Commanmethod.logger.log(LogStatus.PASS, "Username is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "username is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "username is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mydetails)) {
			Commanmethod.logger.log(LogStatus.PASS, "Details is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "Details is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "Details is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(favourites)) {
			Commanmethod.logger.log(LogStatus.PASS, "My favourites is displayed");
			Commanmethod.click(myfavlnk);
			if(myfavexptxt.getText().contentEquals("You have not shortlisted any courses yet."))
			{
				Commanmethod.logger.log(LogStatus.INFO, "Expected text 'You have not shortlisted any courses yet.' is displayed in My favourites page");
				Commanmethod.logger.log(LogStatus.PASS, "Expected text 'You have not shortlisted any courses yet.' is displayed in My favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Expected text 'You have not shortlisted any courses yet.' is not displayed in My favourites page");
				Commanmethod.logger.log(LogStatus.FAIL, "Expected text 'You have not shortlisted any courses yet.' is not displayed in My favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
	
			}
			
		} 
		else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My favourites is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My favourites is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Thread.sleep(5000);
		Commanmethod.click(clickprofileimage);
		
		if (Commanmethod.isDisplayed(universities)) {
			Commanmethod.logger.log(LogStatus.PASS, "Universities is displayed");
			String univ_txt = universities.getText();
			if(univ_txt.contains("2"))
			{
				Commanmethod.logger.log(LogStatus.PASS, "University shortlist count is incremented to 2");
			}
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "Universities is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "Universities is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myprospectus)) {
			Commanmethod.logger.log(LogStatus.PASS, "My prospectus is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My prospectus is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My prospectus is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myenquiries)) {
			Commanmethod.logger.log(LogStatus.PASS, "My enquiries is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My enquiries is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My enquiries is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mysavedsearches)) {
			Commanmethod.logger.log(LogStatus.PASS, "My saved searches is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My saved searches is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My saved searches is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myreviews)) {
			Commanmethod.logger.log(LogStatus.PASS, "My reviews searches is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My reviews is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My reviews is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myreadinglist)) {
			Commanmethod.logger.log(LogStatus.PASS, "My reading list is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My reading list is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My reading list is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mydrafforms)) {
			Commanmethod.logger.log(LogStatus.PASS, "My draft forms is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My draft forms is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My draft forms is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		}
		if (Commanmethod.isDisplayed(mydata)) {
			Commanmethod.logger.log(LogStatus.PASS, "My data is displayed");
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My data is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My data is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(logout)) {
			
			Commanmethod.logger.log(LogStatus.PASS, "Logout is displayed");
			//Commanmethod.report.endTest(Commanmethod.logger);
			//Commanmethod.verifyStatsKey( Commanmethod.getProperty("affiliate_id"), Commanmethod.getProperty("user_id"));
			Commanmethod.click(logoutlnk);
			Thread.sleep(5000);
			cm.click(topnavsearchicn);
			Thread.sleep(15000);
			cm.type(topnavsearchbox, ksearch);
			Thread.sleep(3000);
			cm.click(topnavsearchbutton);
			Thread.sleep(5000);
			Commanmethod.click(shortlisticn);
			Thread.sleep(2000);
			Commanmethod.click(viewmyfavbtn);
			Thread.sleep(3000);
			//Commanmethod.click(notnowlnk);
			if(myfavexptxt1.getText().contentEquals("To save/view your comparison"))
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application displayed To save/view your comparison text in My Favourites page");
				Commanmethod.logger.log(LogStatus.PASS, "Application displayed To save/view your comparison text in My Favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application failed to display To save/view your comparison text in My Favourites page");
				Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display To save/view your comparison text in My Favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				
			}
			if(myfavexploginbtn.getText().contentEquals("LOG IN"))
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application displayed LOG IN button in My Favourites page");
				Commanmethod.logger.log(LogStatus.PASS, "Application displayed LOG IN button in My Favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application failed to display LOG IN button in My Favourites page");
				Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display LOG IN button in My Favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				
			}
			
			if(myfavexptxt2.getText().contentEquals("Don't have an account yet?"))
			{
				Commanmethod.logger.log(LogStatus.INFO, "Application displayed Don't have an account yet? text in My Favourites page");
				Commanmethod.logger.log(LogStatus.PASS, "Application displayed Don't have an account yet? text in My Favourites page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
			Commanmethod.logger.log(LogStatus.INFO, "Application failed to display Don't have an account yet? text in My Favourites page");
			Commanmethod.logger.log(LogStatus.FAIL, "Application failed to display Don't have an account yet? text in My Favourites page",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				
			}
	
		}
		else {
			Commanmethod.logger.log(LogStatus.INFO, "logout is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "logout is not displayed",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			
		}


		
	}


}
