package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class ChangePasswordFunctionality {
	
	
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
	
	@FindBy(xpath="/html/body/header[1]/div/nav/ul[1]/li[2]/div/div[1]/ul/li[2]/span/a")
	public static WebElement mydetails_link;
	
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/form/div[1]/div/div[1]/div[2]/div/a")
	public static WebElement changepassowrd_link;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/form/div[1]/fieldset[2]/fieldset/div/div/input")
	public static WebElement existingpassword;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/form/div[2]/fieldset[1]/fieldset[2]/fieldset/div[1]/div/input")
	public static WebElement newpassword;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/form/div[2]/fieldset[2]/fieldset[2]/fieldset/div/div/input")
	public static WebElement confirmpassword;
	
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/form/div[5]/div/input")
	public static WebElement changepasswordbutton;
	
	@FindBy(xpath="/html/body/header[4]/div/p")
	public static WebElement successmsg;
	
	@FindBy(xpath="/html/body/header[1]/div/nav/ul[1]/li[2]/div/div[3]/ul/li[8]/a")
	public static WebElement logoutlink;
	
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div")
	public static WebElement homepagesearchbar;
	
	
	
	
	
	
	
	
	
	
	
	
	public ChangePasswordFunctionality(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void changepassword(String email, String password, String url, String changepassword) throws IOException, InterruptedException, SQLException {

		Commanmethod.logger = Commanmethod.report.startTest("Verify Change Password Functionality", "Scope: Regression pack");

		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}


		if(Commanmethod.isElementPresent(gotit)==true)
		{
			Commanmethod.click(gotit);

		}

		Commanmethod.waitUntilElementVisible(clickavatarimage, 5000);


		// click avatar image
		Commanmethod.click(clickavatarimage);
		
		
		if (Commanmethod.isElementPresent(loginemail)==true) {
			Commanmethod.logger.log(LogStatus.PASS, "Email address field is displayed");
			Commanmethod.type(loginemail, email);
		} else {

			Commanmethod.logger.log(LogStatus.INFO, "Email address field is not displayed ");
			Commanmethod.logger.log(LogStatus.FAIL, "Email address field is not displayed ",
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
		
		
		Commanmethod.logger.log(LogStatus.INFO, "Navigating to user profile page");
		Commanmethod.click(clickprofileimage);
		
		Commanmethod.click(mydetails_link);
		
		Commanmethod.logger.log(LogStatus.INFO, "Change Password Functionality",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(changepassowrd_link);
		
		Commanmethod.type(existingpassword, password);
		
		Commanmethod.logger.log(LogStatus.INFO, "Changing Password");
		Commanmethod.logger.log(LogStatus.INFO, "Change Password Functionality",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Commanmethod.type(newpassword, changepassword);
		
		Commanmethod.logger.log(LogStatus.INFO, "Changing Password");
		
		Commanmethod.logger.log(LogStatus.INFO, "Change Password Functionality",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.type(confirmpassword, changepassword);
		
		Commanmethod.logger.log(LogStatus.INFO, "Changing Password");
		Commanmethod.logger.log(LogStatus.INFO, "Change Password Functionality",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		
		Commanmethod.click(changepasswordbutton);
		
		Commanmethod.logger.log(LogStatus.INFO, "Change Password Functionality",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		if(Commanmethod.isDisplayed(successmsg))
		{
			Commanmethod.logger.log(LogStatus.INFO, "Password Changed Successfully!!");
			
			Commanmethod.logger.log(LogStatus.PASS, "Password Changed Successfully!!",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
            Commanmethod.logger.log(LogStatus.INFO, "Password not changed!!");
			
			Commanmethod.logger.log(LogStatus.FAIL, "Password not changed!!",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		Commanmethod.logger.log(LogStatus.INFO, "Login again to check new passowrd working fine or not");
		Commanmethod.click(clickprofileimage);
		
		Commanmethod.logger.log(LogStatus.INFO, "Login using new password",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(logoutlink);
		
		Commanmethod.click(clickavatarimage);
		
		Commanmethod.logger.log(LogStatus.INFO, "Login using new password",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		Commanmethod.type(loginemail, email);
		
		Commanmethod.type(loginpwd, changepassword);
		
		Commanmethod.logger.log(LogStatus.INFO, "Login using new password",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		Commanmethod.click(loginbtn);
		
		Commanmethod.logger.log(LogStatus.INFO, "Login using new password",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		
		if(Commanmethod.isDisplayed(homepagesearchbar))
		{
            Commanmethod.logger.log(LogStatus.INFO, "New password working fine as expected!!");
			
			Commanmethod.logger.log(LogStatus.PASS, "New password working fine as expected!!",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		else
		{
           Commanmethod.logger.log(LogStatus.INFO, "New password not working fine as expected!!");
			
			Commanmethod.logger.log(LogStatus.FAIL, "New password not working fine as expected!!",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		
		

}
	
	

	
	
}
