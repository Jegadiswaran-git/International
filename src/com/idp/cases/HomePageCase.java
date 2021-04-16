package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.HomePage;
import com.idp.pages.MyICPage;
import com.idp.pages.ReviewPage;
import com.idp.pages.WebDriverEventListenerClass;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageCase {
	
	
	WebDriver driver;
	
	@AfterMethod
	public void closebrow() {
		//Commanmethod.closebrowser();
	}

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
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "26-11-2019");
        Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
			   
	  }
	
	@Test
	public void verifyhomepage() throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		String url = "https://www.hotcoursesabroad.com/?nr=true";
		Commanmethod.openBrowser(url);
		
		
		HomePage homepage_obj = PageFactory.initElements(Commanmethod.driver, HomePage.class);
		//homepage_obj.verifyhomepagesearch();
		homepage_obj.homepagesections();
      //  homepage_obj.verifytopnavsearch();
		homepage_obj.topnavsection();
        
 
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
