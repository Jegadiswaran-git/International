package com.idp.pages;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.idp.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class SearchFunctionality {

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

	@FindBy(xpath = "/html/body/div[2]/header[1]/div/div/a/img")
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

	@FindBy(xpath="/html/body/header[1]/div/nav/ul[1]/li[1]/div/form/div[3]/button")
	public static WebElement topnavsearchbutton;
	
	@FindBy(xpath="/html/body/div[2]/header[1]/div/nav/ul[1]/li[1]/div/form/div[3]/button")
	public static WebElement topnavsearchbutton1;
	

	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advancedlink;

	@FindBy(xpath = "//a[@id='proceed-link']")
	public static WebElement proceedlink;
	
	@FindBy(xpath = "/html/body/section[2]/div/div[2]/div/div/form/ul[2]/li[3]/div/div/ul")
	public static WebElement qualdropdown;
	
	@FindBy(xpath="/html/body/footer/div[2]/div/div[2]/a[2]")
	public static WebElement allowallcookies;
	

	public SearchFunctionality(WebDriver driver) {
		this.driver = driver;
	}

	public void topnavsearch(String url, String ksearch, String asearch, String usearch, String csearch,
			String l1subject, String l2subject, String destination, String qualification, String asearchresult, String l1subjectsearchresult, String l2subjectsearchresult)
			throws IOException, InterruptedException, SQLException {

		Commanmethod.logger = Commanmethod.report.startTest("Verify Top Nav Search Functionality",
				"Scope: Regression pack");

		Boolean isPresen=Commanmethod.isDisplayed(advancedlink);

		if (isPresen==true)

		{
			Commanmethod.click(advancedlink);
			Commanmethod.click(proceedlink);
		}
		
		Thread.sleep(3000);
		// click accept cookie button
		Commanmethod.click(allowallcookies);


		// Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
		// "return performance.timing.loadEventEnd -
		// performance.timing.navigationStart;");
		//
		// Commanmethod.logger.log(LogStatus.INFO, "Home Page load time is " +
		// (loadtime / 1000) % 60 + " seconds ");
		
		
//		Thread.sleep(1000);
//		Commanmethod.click(topnavsearchicn);
//		Commanmethod.type(topnavsearchbox, usearch);
//		Thread.sleep(2000);
//		Commanmethod.click(topnavsearchbutton);
//
//		Boolean topnavsrchbtnisPresen = Commanmethod.isDisplayed(topnavsearchbutton);
//
//		if (topnavsrchbtnisPresen == true)
//
//		{
//			cm.click(topnavsearchbutton);
//		}
//
//		
//		
//		
//		Boolean agreeisPresen = Commanmethod.isDisplayed(iagreebtn);
//
//		if (agreeisPresen == true)
//
//		{
//			cm.click(iagreebtn);
//		}
//
//		
//		Thread.sleep(5000);
//		cm.scrollup();
//		cm.click(providerpod);
//		// Verifying Addto Favourites link in Provider landing page
//		if (praddfavlink.isDisplayed()) {
//			cm.logger.log(LogStatus.INFO, "Application displayed Add to Favourites link in Provider landing page.");
//			cm.logger.log(LogStatus.PASS, "Application displayed Add to Favourites link in Provider landing page.",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//		} else {
//			cm.logger.log(LogStatus.INFO,
//					"Application failed to display Add to Favourites link in Provider landing page.");
//			cm.logger.log(LogStatus.FAIL,
//					"Application failed to display Add to Favourites link in Provider landing page.",
//					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//		}
//
//		
		
		
		Thread.sleep(5000);
		
		cm.click(topnavsearchicn);
		Thread.sleep(5000);
		cm.type(topnavsearchbox, ksearch);
		Thread.sleep(5000);
		//Commanmethod.waitUntilElementVisible(topnavsearchbutton, 3000);
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", topnavsearchbutton); 
		cm.click(topnavsearchbutton);
		Thread.sleep(5000);
		String keysearchurl = driver.getCurrentUrl();
		cm.logger.log(LogStatus.INFO, "Top Navigation Search Functionality Verification Started.");
		if (keysearchurl.contains("cgory")) {
			cm.logger.log(LogStatus.INFO, "Application fail to display keyword search results to the user.");
			cm.logger.log(LogStatus.FAIL, "Application fail to display keyword search results to the user.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));

		} else {
			cm.logger.log(LogStatus.INFO, "Application displayed Keyword search results to the user.");
			cm.logger.log(LogStatus.PASS, "Application displayed Keyword search results to the user.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		Thread.sleep(3000);
		cm.click(topnavsearchicn);
		cm.type(topnavsearchbox, asearch);
		Thread.sleep(5000);

		cm.click(topnavsearchbutton1);

		if (artheadercontent.getText().contentEquals(asearchresult)) {
			cm.logger.log(LogStatus.INFO, "Application navigated to appropriate article listing page.");
			cm.logger.log(LogStatus.PASS, "Application navigated to appropriate article listing page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		} else {
			cm.logger.log(LogStatus.INFO, "Application fail to navigate to appropriate article listing page.");
			cm.logger.log(LogStatus.FAIL, "Application fail to navigate to appropriate article listing page.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}
		
		
		cm.click(topnavsearchicn);
		cm.type(topnavsearchbox, csearch);
		Thread.sleep(5000);

		cm.click(topnavsearchbutton);

		Thread.sleep(5000);
		String ctgrysearchurl = driver.getCurrentUrl();
		
		if(ctgrysearchurl.contains("cgory"))
		{
			
            
			cm.logger.log(LogStatus.INFO, "Application displayed Category search results to the user.");
			cm.logger.log(LogStatus.PASS, "Application displayed Category search results to the user.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
			
		}
		else
		{
			cm.logger.log(LogStatus.INFO, "Application fail to display Category search results to the user.");
			cm.logger.log(LogStatus.FAIL, "Application fail to display Category search results to the user.",
					"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
		}

		cm.click(abroadlogo);
		
		Commanmethod.logger=Commanmethod.report.startTest("Verify Home Page Search Functionality - L1 Subject", "Test");
		//L1 + Study level search
		cm.logger.log(LogStatus.INFO, "Application navigated to Abroad Home Page");
		cm.logger.log(LogStatus.PASS, "Application navigated to Abroad Home Page",
				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
        
		Actions actions = new Actions(driver);
        actions.moveToElement(subjtxtbox);
        actions.click();
        actions.sendKeys(l1subject);
        actions.build().perform();
        actions.sendKeys(Keys.TAB);
        
       
        actions.moveToElement(qualtxtbox);
        actions.click();
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.ENTER);
        //actions.sendKeys(cm.getProperty("hpqualification"));
        actions.build().perform();
        Commanmethod.waitUntilElementVisible(homesearchbtn, 2000);
        //actions.sendKeys(Keys.ENTER);
        
         cm.click(homesearchbtn);
         cm.waitUntilElementVisible(srheader, 4000);
         
         if(srheader.isDisplayed())
         {
         
         cm.logger.log(LogStatus.INFO, "Application navigated to search results page");
         cm.logger.log(LogStatus.PASS, "Application navigated to search results page",
 				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         
         String headerdata = srheader.getText();
         
         if(headerdata.contains(l1subjectsearchresult)) 
         {
        	 
        	 cm.logger.log(LogStatus.INFO, "Application displayed the search results for L1 subject" + l1subject+ "Study level" + qualification);
				cm.logger.log(LogStatus.PASS, "Application displayed the search results for L1 subject" + l1subject+ "Study level" + qualification,
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         }
         
         else
         {
        	 cm.logger.log(LogStatus.INFO, "Application fail to display the search results for L1 subject" + l1subject+ "Study level" + qualification);
				cm.logger.log(LogStatus.FAIL, "Application fail to display the search results for L1 subject" + l1subject+ "Study level" + qualification,
						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         }
         }
         else
         {
        	 cm.logger.log(LogStatus.FAIL, "Application fail to navigate to search results page",
     				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         }
         
         cm.click(abroadlogo);
         
 		Commanmethod.logger=Commanmethod.report.startTest("Verify Home Page Search Functionality - L2 Subject", "Test");
 		//L2 + Study level search
 		cm.logger.log(LogStatus.INFO, "Application navigated to Abroad Home Page");
 		cm.logger.log(LogStatus.PASS, "Application navigated to Abroad Home Page",
 				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
         
 		Actions actions1 = new Actions(driver);
         actions1.moveToElement(subjtxtbox);
         actions1.click();
         actions1.sendKeys(l2subject);
         actions1.build().perform();
         actions1.sendKeys(Keys.TAB);
         
        
         actions1.moveToElement(qualtxtbox);
         actions1.click();
         actions1.sendKeys(Keys.DOWN);
         actions1.sendKeys(Keys.DOWN);
         actions1.sendKeys(Keys.ENTER);
         //actions.sendKeys(cm.getProperty("hpqualification"));
         actions.build().perform();
         Thread.sleep(2000);
         //actions.sendKeys(Keys.ENTER);
         
          cm.click(homesearchbtn);
          cm.waitUntilElementVisible(srheader, 4000);
          
          if(srheader.isDisplayed())
          {
          
          cm.logger.log(LogStatus.INFO, "Application navigated to search results page");
          cm.logger.log(LogStatus.PASS, "Application navigated to search results page",
  				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
          
          String headerdata = srheader.getText();
          
          if(headerdata.contains(l2subjectsearchresult)) 
          {
         	 
         	 cm.logger.log(LogStatus.INFO, "Application displayed the search results for L2 subject" + l2subject+ "Study level" + qualification);
 				cm.logger.log(LogStatus.PASS, "Application displayed the search results for L2 subject" + l1subject+ "Study level" + qualification,
 						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
          }
          
          else
          {
         	 cm.logger.log(LogStatus.INFO, "Application fail to display the search results for L2 subject" + l2subject+ "Study level" + qualification);
 				cm.logger.log(LogStatus.FAIL, "Application fail to display the search results for L2 subject" + l2subject+ "Study level" + qualification,
 						"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
          }
          }
          else
          {
         	 cm.logger.log(LogStatus.FAIL, "Application fail to navigate to search results page",
      				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
          }
          
          
          //Qualification Search Journey 
          
//          Commanmethod.logger = Commanmethod.report.startTest("Qualification Search Verification",
//  				"Scope: Regression pack");
//
//          cm.click(abroadlogo);
//          
//          cm.logger.log(LogStatus.INFO, "Application navigated to Abroad Home Page");
//  	    cm.logger.log(LogStatus.PASS, "Application navigated to Abroad Home Page",
//  				"" + Commanmethod.logger.addScreenCapture(Commanmethod.addScreenshot()));
//          
//  		 Actions actions2 = new Actions(driver);
//          actions2.moveToElement(subjtxtbox);
//          actions2.click();
//          actions2.sendKeys(l1subject);
//          actions2.build().perform();
//          actions2.sendKeys(Keys.TAB);
//          
//          List<WebElement> options = driver.findElements(By.xpath("/html/body/section[2]/div/div[2]/div/div/form/ul[2]/li[3]/div/div/ul"));
//          
//          for (int i=0; i<=options.size();i++) 
//          {
//        	  
//        	  Commanmethod.click(qualdropdown);
//        	  options.get(i).click();   
//        	  
//        	  cm.click(homesearchbtn);
//        	  
        	  
//          } 

//          Iterator<WebElement> it=options.iterator();
//
//            while(it.hasNext())
//             {
//               System.out.println(it.next().getAttribute("Value"));
//             }
          
         
          
          


				
		

	}
}