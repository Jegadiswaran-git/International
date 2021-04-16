package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.HomePage;
import com.idp.pages.RankingPage;

import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class RankingsCase {
	
	WebDriver driver;
	@BeforeTest
	public void initializeReport() throws IOException {
		
		String browserName = getProperty("browser").toUpperCase();
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", browserName);
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Hotcourses Abroad Site");
		Commanmethod.report.addSystemInfo("SCRIPT_NAME", "Regression Pack");
		Commanmethod.report.addSystemInfo("LANGUAGE", "Java");
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "7-11-2019");
        Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
			   
	  }
	
	@Test
	public void verifyRanking() throws IOException, InterruptedException
	{
		String url = "https://www.hotcoursesabroad.com/?nr=true";
		Commanmethod.openBrowser(url);
		
		RankingPage rankpage_obj = PageFactory.initElements(Commanmethod.driver, RankingPage.class);
		rankpage_obj.verifyrankingpage();
		
	}
	
	
	
	
	@AfterTest
	public void closeReport()
	{
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
		//Commanmethod.closebrowser();
		
	  
	}
	
	 public static String getProperty(String name) throws IOException {
			FileInputStream Finput = new FileInputStream(FilePaths.properties);
			Properties prop = new Properties();
			prop.load(Finput);
			return prop.getProperty(name);

		}

}
