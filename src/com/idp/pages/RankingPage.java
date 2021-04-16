package com.idp.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;
import com.idp.pages.HomePage;

public class RankingPage {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	
	//University rankings page element locators
	@FindBy(xpath="//span[contains(text(),'VIEW INDEX')]")
	public static WebElement HDI;
	
	@FindBy(xpath="//h2[contains(text(),'Times Higher Education World University Rankings 2021')]")
	public static WebElement THE;
	
	@FindBy(xpath="//li[3]//a[1]//div[1]//div[1]//span[1]")
	public static WebElement QS;
	
	@FindBy(xpath="//li[4]//a[1]//div[1]//div[1]//span[1]")
	public static WebElement Academic ;
	
	// verify find courses link in Home page
	@FindBy(xpath = "//a[@id='tpNvInspLnk']")
	public static WebElement getinspired;
	
	// verify Get advice megamenu option
	@FindBy(xpath = "//a[@id='tpNvCrseLnk']")
	public static WebElement getadvicelink;
	
	@FindBy(xpath="//*[@id='tpNvCrseDiv']/div/div[2]/div[1]/ul/li[1]/a")
	public static WebElement univrankings;
	
	@FindBy(xpath="//h1[contains(text(),'Hotcourses Diversity Index')]")
	public static WebElement hotdivindx;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[1]/div[2]/div[1]/h2/a")
	public static WebElement hdunivnameone;
	
	@FindBy(xpath="//div[@class='rt_rgt acd snd_bg actv']//div[@class='hd_vw ra_ng mt5']")
	public static WebElement hdunivdetone;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[1]/div[2]/div[3]/div[3]/span")
	public static WebElement hdunivdettwo;
	
	@FindBy(xpath="//*[@id=\"natSpanTlTip0\"]")
	public static WebElement nationalities;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[2]/div[2]/div[1]/h2/a")
	public static WebElement hdunivnametwo;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[2]/div[2]/div[1]/div")
	public static WebElement hdunivtwodetone;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[2]/div[2]/div[3]/div[3]/span")
	public static WebElement hdunivtwodettwo;
	
	@FindBy(xpath="//span[@id='natSpanTlTip1']")
	public static WebElement nationalitiestwo;
	
	@FindBy(xpath="//*[@id=\"cookiePopUpId\"]/div/span/a[2]")
	public static WebElement iagreebtn;
	
	@FindBy(xpath="//h1[contains(text(),'Hotcourses Diversity Index')]")
	public static WebElement hdipagetitle;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[1]/div[1]/span")
	public static WebElement hdiprovonerank;
	
	@FindBy(xpath="//*[@id=\"divIndRankProfileDiv\"]/div[2]/div[1]/span")
	public static WebElement hdiprovtworank;
	
	@FindBy(xpath="//*[@id=\"rg_cont-0\"]/h1")
	public static WebElement thepagetitle;
	
	@FindBy(xpath="//div[@id='rankProfilePodId']//div[1]//div[2]//div[1]//h2[1]")
	public static WebElement theprovnameone;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[1]/div[1]")
	public static WebElement theprovrankone;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[1]/div[2]/div/div/p[1]")
	public static WebElement theprovcountryone;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[2]/div/h2/a")
	public static WebElement theprovnametwo;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[1]")
	public static WebElement theprovranktwo;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[2]/div/div/p[1]")
	public static WebElement theprovcountrytwo;
	
	@FindBy(xpath="//h1[contains(text(),'QS World University Rankings 2021')]")
	public static WebElement qspagetitle;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[1]/div[1]")
	public static WebElement qsprovrankone;
	
	@FindBy(xpath="//div[@id='rankProfilePodId']//div[1]//div[2]//div[1]//h2[1]")
	public static WebElement qsprovnameone;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[1]/div[2]/div/div/p[1]")
	public static WebElement qsprovcountryone;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[1]")
	public static WebElement qsprovranktwo;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[2]/div/h2/a")
	public static WebElement qsprovnametwo;
	
	@FindBy(xpath="//div[@id='divContentId']//div[2]//div[2]//div[1]//div[1]//p[1]")
	public static WebElement qsprovcountrytwo;
	
	@FindBy(xpath="//h1[contains(text(),'Academic Ranking of World Universities 2020')]")
	public static WebElement academicpagetitle;
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[1]/div[1]")
	public static WebElement academicprovrankone;
	
	@FindBy(xpath="//div[@id='rankProfilePodId']//div[1]//div[2]//div[1]//h2[1]")
	public static WebElement academicprovnameone;
	
	@FindBy(xpath="//div[@id='rankProfilePodId']//div[1]//div[2]//div[1]//div[1]//p[1]")
	public static WebElement academicprovcountryone;
	
	
	@FindBy(xpath="//*[@id=\"rankProfilePodId\"]/div[2]/div[1]")
	public static WebElement academicprovranktwo;
	
	@FindBy(xpath="//div[@class='container rv_rnk']//div[2]//div[2]//div[1]//h2[1]")
	public static WebElement academicprovnametwo;
	
	@FindBy(xpath="//div[@id='divContentId']//div[2]//div[2]//div[1]//div[1]//p[1]")
	public static WebElement academicprovcountrytwo;
	
	@FindBy(xpath="//a[contains(text(),'Allow All')]")
	public static WebElement allowallcookies;
	
	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	
	
	
	
	
	
	public RankingPage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
	public void verifyrankingpage() throws IOException, InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("Verify Ranking Page Functionalities", "Test");
		
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	            "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			
		cm.logger.log(LogStatus.INFO, "University rankings Page load time is " +  (loadtime / 1000) % 60  + " seconds ");
		Thread.sleep(10000);
		cm.click(getadvicelink);
		
		//Navigating to University rankings page
		Thread.sleep(10000);
		cm.click(univrankings);
		
		if(Commanmethod.isElementPresent(advancedlink)==true)
		{
			Commanmethod.click(advancedlink);
          Commanmethod.click(proceedlink);
		}
		cm.logger.log(LogStatus.INFO, "Application navigated to University Rankings Page.");
		//Navigating to Hotcourses Diversity Index page
		Thread.sleep(5000);
		cm.click(HDI);
		
		if(Commanmethod.isElementPresent(allowallcookies)==true)
		{
			Commanmethod.click(allowallcookies);
		}
		
		
		
		if(Commanmethod.getData("Ranking", 2, 5).contentEquals(hotdivindx.getText()))
		{
			cm.logger.log(LogStatus.INFO, "Application navigated to Hotcourses Diversity Index Page.");
			cm.logger.log(LogStatus.PASS, "Application navigated to Hotcourses Diversity Index Page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			cm.scroll();
			cm.logger.log(LogStatus.INFO, "Rank 1 Provider verification");
			
			if(Commanmethod.getData("Ranking", 2, 5).contentEquals(hdipagetitle.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected HDI Page title  " + hdipagetitle.getText() + " displayed in HDI Page");
				cm.logger.log(LogStatus.PASS, "Expected HDI Page title " + hdipagetitle.getText() + " displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected HDI Page title " + hdipagetitle.getText() + " not displayed in HDI Page");
				cm.logger.log(LogStatus.FAIL, "Expected HDI Page title " + hdipagetitle.getText() + " not displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.getData("Ranking", 2, 4).contentEquals(hdiprovonerank.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected Provider One Rank  " + hdiprovonerank.getText() + " displayed in HDI Page");
				cm.logger.log(LogStatus.PASS, "Expected Provider One Rank " + hdiprovonerank.getText() + " displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected Provider One Rank " + hdiprovonerank.getText() + " not displayed in HDI Page");
				cm.logger.log(LogStatus.FAIL, "Expected Provider One Rank " + hdiprovonerank.getText() + " not displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.getData("Ranking", 2, 0).contentEquals(hdunivnameone.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected University name  " + hdunivnameone.getText() + " displayed in HDI Page");
				cm.logger.log(LogStatus.PASS, "Expected University name " + hdunivnameone.getText() + " displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected University name " + hdunivnameone.getText() + " not displayed in HDI Page");
				cm.logger.log(LogStatus.FAIL, "Expected University name " + hdunivnameone.getText() + " not displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.getData("Ranking", 2, 1).contentEquals(nationalities.getText()))
			{
				
				cm.logger.log(LogStatus.INFO, "Number of nationalities displayed in HDI Page is " +nationalities.getText()+" matched with expected data");
				cm.logger.log(LogStatus.PASS, "Number of nationalities displayed in HDI Page is " +nationalities.getText()+" matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Number of nationalities displayed in HDI Page is " +nationalities.getText()+" not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Number of nationalities displayed in HDI Page is " +nationalities.getText()+" not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(hdunivdetone.getText().contains(Commanmethod.getData("Ranking", 2, 2)))
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 2) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 2) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 2) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 2) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(hdunivdettwo.getText().contains(Commanmethod.getData("Ranking", 2, 3)))   
			{
				
				cm.logger.log(LogStatus.INFO, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 3) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 3) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 3) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 2, 3) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			cm.logger.log(LogStatus.INFO, "Rank 2 Provider verification");
			
			if(Commanmethod.getData("Ranking", 3, 4).contentEquals(hdiprovtworank.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank  " + hdiprovtworank.getText() + " displayed in HDI Page");
				cm.logger.log(LogStatus.PASS, "Expected Provider Two Rank " + hdiprovtworank.getText() + " displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank " + hdiprovtworank.getText() + " not displayed in HDI Page");
				cm.logger.log(LogStatus.FAIL, "Expected Provider Two Rank " + hdiprovtworank.getText() + " not displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			if(Commanmethod.getData("Ranking", 3, 0).contentEquals(hdunivnametwo.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected University name  " + hdunivnametwo.getText() + " displayed in HDI Page");
				cm.logger.log(LogStatus.PASS, "Expected University name " + hdunivnametwo.getText() + " displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected University name " + hdunivnametwo.getText() + " not displayed in HDI Page");
				cm.logger.log(LogStatus.FAIL, "Expected University name " + hdunivnametwo.getText() + " not displayed in HDI Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.getData("Ranking", 3, 1).contentEquals(nationalitiestwo.getText()))
			{
				
				cm.logger.log(LogStatus.INFO, "Number of nationalities displayed in HDI Page is " +nationalitiestwo.getText()+" matched with expected data");
				cm.logger.log(LogStatus.PASS, "Number of nationalities displayed in HDI Page is " +nationalitiestwo.getText()+" matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Number of nationalities displayed in HDI Page is " +nationalitiestwo.getText()+" not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Number of nationalities displayed in HDI Page is " +nationalitiestwo.getText()+" not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(hdunivtwodetone.getText().contains(Commanmethod.getData("Ranking", 3, 2)))
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 2) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 2) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 2) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Country name displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 2) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(hdunivtwodettwo.getText().contains(Commanmethod.getData("Ranking", 3, 3)))   
			{
				
				cm.logger.log(LogStatus.INFO, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 3) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 3) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 3) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Number of Students displayed in HDI Page is " + Commanmethod.getData("Ranking", 3, 3) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			
		}
		else
		{
			cm.logger.log(LogStatus.INFO, "Application failed to navigate to Hotcourses Diversity Index Page.");
			cm.logger.log(LogStatus.FAIL, "Application failed to navigate to Hotcourses Diversity Index Page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		//Navigating to University rankings page by page back
		cm.logger.log(LogStatus.INFO, "Application navigated to University Rankings Page to verify THE Rankings");
		cm.navigateBack();
		Thread.sleep(10000);
		cm.click(THE);
		Thread.sleep(10000);
		if(thepagetitle.getText().contentEquals(Commanmethod.getData("Ranking", 5, 5)))
		{
			
			cm.logger.log(LogStatus.INFO, "Application navigated to THE Ranking Page.");
			cm.logger.log(LogStatus.PASS, "Application navigated to THE Ranking Page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
			//cm.logger.log(LogStatus.INFO, "Expected THE Page title  " + thepagetitle.getText() + " displayed in HDI Page");
			cm.logger.log(LogStatus.PASS, "Expected THE Page title " + thepagetitle.getText() + " displayed in THE Ranking Page");
			
			cm.scroll();
			cm.logger.log(LogStatus.INFO, "Rank 1 Provider verification");
			
			if(Commanmethod.getData("Ranking", 5, 4).contentEquals(theprovrankone.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected Provider One Rank  " + theprovrankone.getText() + " displayed in THE Ranking Page");
				cm.logger.log(LogStatus.PASS, "Expected Provider One Rank " + theprovrankone.getText() + " displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected Provider One Rank " + theprovrankone.getText() + " not displayed in THE Ranking Page");
				cm.logger.log(LogStatus.FAIL, "Expected Provider One Rank " + theprovrankone.getText() + " not displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(Commanmethod.getData("Ranking", 5, 0).contentEquals(theprovnameone.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected University name  " + theprovnameone.getText() + " displayed in THE Ranking Page");
				cm.logger.log(LogStatus.PASS, "Expected University name " + theprovnameone.getText() + " displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected University name " + theprovnameone.getText() + " not displayed in THE Ranking Page");
				cm.logger.log(LogStatus.FAIL, "Expected University name " + theprovnameone.getText() + " not displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(theprovcountryone.getText().contains(Commanmethod.getData("Ranking", 5, 2)))
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 5, 2) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 5, 2) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 5, 2) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 5, 2) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			cm.logger.log(LogStatus.INFO, "Rank 2 Provider verification");
			
			if(Commanmethod.getData("Ranking", 6, 4).contentEquals(theprovranktwo.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank  " + theprovranktwo.getText() + " displayed in THE Ranking Page");
				cm.logger.log(LogStatus.PASS, "Expected Provider Two Rank " + theprovranktwo.getText() + " displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank " + theprovranktwo.getText() + " not displayed in THE Ranking Page");
				cm.logger.log(LogStatus.FAIL, "Expected Provider Two Rank " + theprovranktwo.getText() + " not displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			
					
			if(Commanmethod.getData("Ranking", 6, 0).contentEquals(theprovnametwo.getText()))
			{
				
				
				cm.logger.log(LogStatus.INFO, "Expected University name  " + theprovnametwo.getText() + " displayed in THE Ranking Page");
				cm.logger.log(LogStatus.PASS, "Expected University name " + theprovnametwo.getText() + " displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Expected University name " + theprovnametwo.getText() + " not displayed in THE Ranking Page");
				cm.logger.log(LogStatus.FAIL, "Expected University name " + theprovnametwo.getText() + " not displayed in THE Ranking Page",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
			if(theprovcountrytwo.getText().contains(Commanmethod.getData("Ranking", 6, 2)))
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 6, 2) + " matched with expected data");
				cm.logger.log(LogStatus.PASS, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 6, 2) + " matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			else
			{
				
				cm.logger.log(LogStatus.INFO, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 6, 2) + " not matched with expected data");
				cm.logger.log(LogStatus.FAIL, "Country name displayed in THE Ranking Page is " + Commanmethod.getData("Ranking", 6, 2) + " not matched with expected data",
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			}
			
		}
		else
		{
			
			cm.logger.log(LogStatus.INFO, "Application failed to navigate to THE Ranking Page.");
			cm.logger.log(LogStatus.FAIL, "Application failed to navigate to THE Ranking Page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		//Navigating to University rankings page by page back
				cm.logger.log(LogStatus.INFO, "Application navigated to University Rankings Page to verify QS World Rankings");
				cm.navigateBack();
				
				Thread.sleep(10000);
				cm.click(QS);
				Thread.sleep(10000);
				
				if(qspagetitle.getText().contentEquals(Commanmethod.getData("Ranking", 8, 5)))
				{
					
					cm.logger.log(LogStatus.INFO, "Application navigated to QS Ranking Page.");
					cm.logger.log(LogStatus.PASS, "Application navigated to QS Ranking Page.",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					
					//cm.logger.log(LogStatus.INFO, "Expected THE Page title  " + thepagetitle.getText() + " displayed in HDI Page");
					cm.logger.log(LogStatus.PASS, "Expected QS Ranking Page title " + qspagetitle.getText() + " displayed in QS Ranking Page");
					
					cm.scroll();
					cm.logger.log(LogStatus.INFO, "Rank 1 Provider verification");
					
					if(Commanmethod.getData("Ranking", 8, 4).contentEquals(qsprovrankone.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected Provider One Rank  " + qsprovrankone.getText() + " displayed in QS Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected Provider One Rank " + qsprovrankone.getText() + " displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected Provider One Rank " + qsprovrankone.getText() + " not displayed in QS Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected Provider One Rank " + qsprovrankone.getText() + " not displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(Commanmethod.getData("Ranking", 8, 0).contentEquals(qsprovnameone.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected University name  " + qsprovnameone.getText() + " displayed in QS Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected University name " + qsprovnameone.getText() + " displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected University name " + qsprovnameone.getText() + " not displayed in QS Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected University name " + qsprovnameone.getText() + " not displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(qsprovcountryone.getText().contains(Commanmethod.getData("Ranking", 8, 2)))
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 8, 2) + " matched with expected data");
						cm.logger.log(LogStatus.PASS, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 8, 2) + " matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 8, 2) + " not matched with expected data");
						cm.logger.log(LogStatus.FAIL, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 8, 2) + " not matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					cm.logger.log(LogStatus.INFO, "Rank 2 Provider verification");
					
					if(Commanmethod.getData("Ranking", 9, 4).contentEquals(qsprovranktwo.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank  " + qsprovranktwo.getText() + " displayed in QS Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected Provider Two Rank " + qsprovranktwo.getText() + " displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank " + qsprovranktwo.getText() + " not displayed in QS Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected Provider Two Rank " + qsprovranktwo.getText() + " not displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					
							
					if(Commanmethod.getData("Ranking", 9, 0).contentEquals(qsprovnametwo.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected University name  " + qsprovnametwo.getText() + " displayed in QS Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected University name " + qsprovnametwo.getText() + " displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected University name " + qsprovnametwo.getText() + " not displayed in QS Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected University name " + qsprovnametwo.getText() + " not displayed in QS Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(qsprovcountrytwo.getText().contains(Commanmethod.getData("Ranking", 9, 2)))
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 9, 2) + " matched with expected data");
						cm.logger.log(LogStatus.PASS, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 9, 2) + " matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 9, 2) + " not matched with expected data");
						cm.logger.log(LogStatus.FAIL, "Country name displayed in QS Ranking Page is " + Commanmethod.getData("Ranking", 9, 2) + " not matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
				}
				else
				{
					
					cm.logger.log(LogStatus.INFO, "Application failed to navigate to QS Ranking Page.");
					cm.logger.log(LogStatus.FAIL, "Application failed to navigate to QS Ranking Page.",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				}
		
				
				//Navigating to University rankings page by page back
				cm.logger.log(LogStatus.INFO, "Application navigated to University Rankings Page to verify Academic Rankings");
				cm.navigateBack();
				Thread.sleep(10000);
				
				
				cm.scrollup();
				cm.click(Academic);
				Thread.sleep(10000);
				cm.scroll();
				
				
				if(academicpagetitle.getText().contentEquals(Commanmethod.getData("Ranking", 11, 5)))
				{
					
					cm.logger.log(LogStatus.INFO, "Application navigated to Academic Ranking Page.");
					cm.logger.log(LogStatus.PASS, "Application navigated to Academic Ranking Page.",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					
					//cm.logger.log(LogStatus.INFO, "Expected THE Page title  " + thepagetitle.getText() + " displayed in HDI Page");
					cm.logger.log(LogStatus.PASS, "Expected Academic Ranking Page title " + academicpagetitle.getText() + " displayed in Academic Ranking Page");
					
					cm.scroll();
					cm.logger.log(LogStatus.INFO, "Rank 1 Provider verification");
					
					if(Commanmethod.getData("Ranking", 11, 4).contentEquals(academicprovrankone.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected Provider One Rank  " + academicprovrankone.getText() + " displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected Provider One Rank " + academicprovrankone.getText() + " displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected Provider One Rank " + academicprovrankone.getText() + " not displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected Provider One Rank " + academicprovrankone.getText() + " not displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(Commanmethod.getData("Ranking", 11, 0).contentEquals(academicprovnameone.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected University name  " + academicprovnameone.getText() + " displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected University name " + academicprovnameone.getText() + " displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected University name " + academicprovnameone.getText() + " not displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected University name " + academicprovnameone.getText() + " not displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(academicprovcountryone.getText().contains(Commanmethod.getData("Ranking", 11, 2)))
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 11, 2) + " matched with expected data");
						cm.logger.log(LogStatus.PASS, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 11, 2) + " matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 11, 2) + " not matched with expected data");
						cm.logger.log(LogStatus.FAIL, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 11, 2) + " not matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					cm.logger.log(LogStatus.INFO, "Rank 2 Provider verification");
					
					if(Commanmethod.getData("Ranking", 12, 4).contentEquals(academicprovranktwo.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank  " + academicprovranktwo.getText() + " displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected Provider Two Rank " + academicprovranktwo.getText() + " displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected Provider Two Rank " + academicprovranktwo.getText() + " not displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected Provider Two Rank " + academicprovranktwo.getText() + " not displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					
							
					if(Commanmethod.getData("Ranking", 12, 0).contentEquals(academicprovnametwo.getText()))
					{
						
						
						cm.logger.log(LogStatus.INFO, "Expected University name  " + academicprovnametwo.getText() + " displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.PASS, "Expected University name " + academicprovnametwo.getText() + " displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Expected University name " + academicprovnametwo.getText() + " not displayed in Academic Ranking Page");
						cm.logger.log(LogStatus.FAIL, "Expected University name " + academicprovnametwo.getText() + " not displayed in Academic Ranking Page",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
					if(academicprovcountrytwo.getText().contains(Commanmethod.getData("Ranking", 12, 2)))
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 12, 2) + " matched with expected data");
						cm.logger.log(LogStatus.PASS, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 12, 2) + " matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					else
					{
						
						cm.logger.log(LogStatus.INFO, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 12, 2) + " not matched with expected data");
						cm.logger.log(LogStatus.FAIL, "Country name displayed in Academic Ranking Page is " + Commanmethod.getData("Ranking", 12, 2) + " not matched with expected data",
								"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
					}
					
				}
				else
				{
					
					cm.logger.log(LogStatus.INFO, "Application failed to navigate to Academic Ranking Page.");
					cm.logger.log(LogStatus.FAIL, "Application failed to navigate to Academic Ranking Page.",
							"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
				}
		
		
	}
	
	
	

}
