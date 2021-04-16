package com.idp.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class ReviewDisplayFunctionality {

	WebDriver driver;
	Commanmethod cm = new Commanmethod();

	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;

	@FindBy(xpath = ".//p[@class='family' and preceding-sibling::span[@class='caps grey']]")
	public static WebElement psreviewtitle;

	@FindBy(xpath = ".//p[@class='family' and preceding-sibling::span[@class='caps grey']]//following::pre")
	public static WebElement psreviewcontent;

	// click agree cookie button
	@FindBy(xpath = "//a[@class='gt_it']")
	public static WebElement gotit;

	public ReviewDisplayFunctionality(WebDriver driver) {
		this.driver = driver;
	}

	public void verifypsreviewpage(String url,String emailid,String pwd, String affiliate, String country, String univname, String startdate, String enddate, String reviewurl, String rvwtitle, String rvwcontent)
			throws IOException, InterruptedException {
		Thread.sleep(1000);
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}

		

		Commanmethod.logger = Commanmethod.report.startTest("Verify Review Display Functionality for" + affiliate,
				"Scope: Regression pack");

		System.out.println("I am in front end");

		Commanmethod.scroll();
		Commanmethod.waitUntilElementVisible(psreviewtitle, 1000);


		String rtitle = psreviewtitle.getText();
		String rcontent = psreviewcontent.getText();
		System.out.println(rvwtitle);


		if (rtitle.equals(rvwtitle) && rcontent.equals(rvwcontent)) {
			System.out.println("Inside if block");
			Commanmethod.logger.log(LogStatus.INFO, "Submitted/Approved review is displaying in front end.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.logger.log(LogStatus.PASS, "Submitted/Approved review is displaying in front end.");
		} else {
			System.out.println("Inside else block");
			Commanmethod.logger.log(LogStatus.INFO, "Submitted/Approved review is not displaying in front end.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			Commanmethod.logger.log(LogStatus.FAIL, "Submitted/Approved review is not displaying in front end.");
		}

	}

}
