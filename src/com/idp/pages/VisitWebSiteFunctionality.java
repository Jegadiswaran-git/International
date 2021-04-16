package com.idp.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class VisitWebSiteFunctionality {
	
	
	WebDriver driver;

	Commanmethod cm = new Commanmethod();
	
	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath = "//a[@class='wba']")
	public static WebElement chprovidername;

	@FindBy(xpath = "//a[@id='visitWebLinkId']")
	public static WebElement chvisitwebsitelnk;
	
	@FindBy(xpath = "//a[@id='contInst']")
	public static WebElement chcontinstbtn;
	
	@FindBy(xpath="/html/body/div/div[2]/button[3]")
	public static WebElement visitwebsiteadvancedlink;
	
	@FindBy(xpath="/html/body/div/div[3]/p[2]/a")
	public static WebElement visitwebsiteproceedlink;



	
	public VisitWebSiteFunctionality(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void newvwebtwo(String url, String visitweburl, String providername, String affiliate) throws InterruptedException
	{
		Commanmethod.logger = Commanmethod.report.startTest("Verify Visit Website Functionality in" + affiliate,
				"Scope: Regression pack");
		
		
		Boolean isPresen = Commanmethod.isDisplayed(advancedlink);

		if (isPresen == true)

		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}
		
		 Thread.sleep(20000);
		
		if(cm.isDisplayed(chprovidername)&&(chprovidername.getText().contentEquals(providername)&&(cm.isDisplayed(chvisitwebsitelnk))&&cm.isDisplayed(chcontinstbtn)))
        {
        	cm.logger.log(LogStatus.INFO, "Application navigated to Provider landing page.");
        	cm.logger.log(LogStatus.PASS, "Application navigated to Provider landing page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        }
        else
        {
        	cm.logger.log(LogStatus.INFO, "Application failed to navigate to Provider landing page.");
        	cm.logger.log(LogStatus.FAIL, "Application failed to navigate to Provider landing page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        }
        
		
        cm.click(chvisitwebsitelnk);
        Thread.sleep(10000);
        
        Boolean isPresen1 = Commanmethod.isDisplayed(visitwebsiteadvancedlink);

		if (isPresen1 == true)

		{
			Commanmethod.click(visitwebsiteadvancedlink);
			Commanmethod.click(visitwebsiteproceedlink);
		}
		
		

        //Switching driver to new tab 
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(5000);
        String actvisitwebsiteurl = driver.getCurrentUrl();
        
       
        if(actvisitwebsiteurl.contentEquals(visitweburl)) {
        	cm.logger.log(LogStatus.INFO, "Application navigated to provider website.");
        	cm.logger.log(LogStatus.PASS, "Application navigated to provider website.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        }
        else
        {
        	cm.logger.log(LogStatus.INFO, "Application failed to navigate to provider website.");
        	cm.logger.log(LogStatus.FAIL, "Application failed to navigate to provider website.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        }
        driver.close();
        //switching driver to main tab
        driver.switchTo().window(tabs2.get(0));



	}



}
