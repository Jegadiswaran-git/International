
package com.idp.pages;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;

import com.relevantcodes.extentreports.LogStatus;

public class FacebookLogin {
    
	WebDriver driver;
	// click avatar image
	@FindBy(xpath = "/html/body/header/div/nav/ul/li[2]/a[2]/span[3]/img")
	public static WebElement clickavatarimage;

	// click facebook button
	@FindBy(xpath = "//a[@id='facebookloginbutton']")
	public static WebElement facebookbutton;

	// facebook email
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement facebookemail;

	// Facebook password
	@FindBy(xpath = "//input[@id='pass']")
	public static WebElement facebookpass;

	// Facebook login
	@FindBy(xpath = "//button[@id='loginbutton']")
	public static WebElement facebooklogin;

	// click profileimage
	@FindBy(xpath = "//a[@id='topNavlogIcn']")
	public static WebElement clickprofileimage;

	// username in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/span[1]/b[1]")
	public static WebElement username;

	// my details in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/span[1]/a[1]")
	public static WebElement mydetails;

	// Favourites in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public static WebElement favourites;

	// Universities in profile page
//	@FindBy(xpath = "//a[contains(text(),'Universities')]")
//	public static WebElement universities;

	// my prosepectus in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public static WebElement myprospectus;

	// my enquiries in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	public static WebElement myenquiries;

	// my saved searched in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[3]/span[1]/a[1]")
	public static WebElement mysavedsearches;

	// my reviews in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[4]/a[1]")
	public static WebElement myreviews;

	// my reading list in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[5]/a[1]")
	public static WebElement myreadinglist;

	// my draft forms in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[6]/span[1]/a[1]")
	public static WebElement mydrafforms;

	// my data in profile page
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[7]/span[1]/a[1]")
	public static WebElement mydata;

	// logout
	@FindBy(xpath = "//a[@id='logOutLnkId']")
	public static WebElement logout;
	
	//homepage title
	@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]")
	public static WebElement homepagetitle;
	
	@FindBy(xpath="//button[@id='details-button']")
	public static WebElement advancedlink;
	
	@FindBy(xpath="//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/span/a[2]")
	public static WebElement iagreebutton;
	
	
	
	public FacebookLogin(WebDriver driver)
    {
    	this.driver=driver;
    }

	public void fblogin() throws IOException, InterruptedException {
		
		Commanmethod.logger = Commanmethod.report.startTest("Verify Facebook Login Functionality", "Scope: Regression pack");
		
		Boolean isPresen=Commanmethod.isDisplayed(advancedlink);
	    
	    if (isPresen==true)
		
	    {
	    	Commanmethod.click(advancedlink);
	        Commanmethod.click(proceedlink);
	    }
	    
	    Thread.sleep(5000);
//	    if(iagreebutton.isDisplayed())
//	    {
//	    Commanmethod.click(iagreebutton);
//	    }
//	    else
//	    {
//	    	System.out.println("Cookie policy pod not available");
//	    }
		
		Thread.sleep(7000);
		// click avatar image
		Commanmethod.click(clickavatarimage);
		
		
		Commanmethod.waitUntilElementClickable(facebookbutton, 2000);
		// click facebook button
		Commanmethod.click(facebookbutton);
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	            "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			
		Commanmethod.logger.log(LogStatus.INFO, "Facebook Login Page load time is " +  (loadtime / 1000) % 60  + " seconds ");
		Commanmethod.waitUntilElementVisible(facebookemail, 20);
		// Enter Facebook credentials
		
		WebElement webelement = driver.switchTo().activeElement();
		webelement.sendKeys(Commanmethod.getData("FBLogin", 1, 0),Keys.TAB,Commanmethod.getData("FBLogin", 1, 1),Keys.ENTER);
		//Commanmethod.type(facebookemail, Commanmethod.getData("FBLogin", 1, 0));
		//Commanmethod.type(facebookpass, Commanmethod.getData("FBLogin", 1, 1));
		//Commanmethod.click(facebooklogin);
		String loggedintitle="Find your perfect course in the UK";
		String loggedintitle1 = "Looking to study the UK?";
		System.out.println(loggedintitle);
		Thread.sleep(10000);
		if(clickprofileimage.isDisplayed())
		{
			
			Commanmethod.logger.log(LogStatus.INFO, "Facebook user logged in successfully");
			Commanmethod.logger.log(LogStatus.PASS, "Facebook user logged in successfully",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			
		}
		else
		{
			
			Commanmethod.logger.log(LogStatus.INFO, "Facebook login failed");
			Commanmethod.logger.log(LogStatus.FAIL, "Facebook login failed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Commanmethod.waitUntilElementVisible(clickprofileimage, 20);
		Commanmethod.click(clickprofileimage);
		Thread.sleep(3000);
		Commanmethod.logger.log(LogStatus.INFO, "User profile sections listed successfully for logged in users");
		Commanmethod.logger.log(LogStatus.PASS, "User profile sections listed successfully for logged in users",
                "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		if (Commanmethod.isDisplayed(username)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "username is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "username is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mydetails)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "Details is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "Details is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(favourites)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My favourites is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My favourites is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
//		if (Commanmethod.isDisplayed(universities)) {
//			
//		} else {
//			
//			Commanmethod.logger.log(LogStatus.INFO, "universities is displayed");
//			Commanmethod.logger.log(LogStatus.FAIL, "universities is displayed",
//                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//		}
		if (Commanmethod.isDisplayed(myprospectus)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My prospectus is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My prospectus is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myenquiries)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My enquiries is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My enquiries is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mysavedsearches)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My saved searches is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My saved searches is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myreviews)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My reviews is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My reviews is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(myreadinglist)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My reading list is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My reading list is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(mydrafforms)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My draft forms is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My draft forms is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		}
		if (Commanmethod.isDisplayed(mydata)) {
			
		} else {
			
			Commanmethod.logger.log(LogStatus.INFO, "My data is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "My data is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		if (Commanmethod.isDisplayed(logout)) {
			
			Commanmethod.report.endTest(Commanmethod.logger);
		} 
		else {
			
			Commanmethod.logger.log(LogStatus.INFO, "logout is not displayed");
			Commanmethod.logger.log(LogStatus.FAIL, "logout is not displayed",
                    "" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
	}
}
