package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.EFLEnquiryPage;
import com.idp.pages.EnquiryForm;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class EFLEnquiryCase {
	
	static WebDriver driver;
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	@AfterMethod
	public void closebrow() {
		//Commanmethod.closebrowser();
	}

	@BeforeTest
	public void initializeReport() throws IOException {
		
		String browserName = getProperty("browser").toUpperCase();
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		// Adding System and Project info
	Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", browserName);
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Hotcourses Abroad Site");
		Commanmethod.report.addSystemInfo("SCRIPT_NAME", "Regression Pack");
		Commanmethod.report.addSystemInfo("LANGUAGE", "Java");
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "13-01-2021");
		Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
	   
	  }
	


	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("EFL_Enquiryform");
        
        return arrayObject;
    }
	
	@Test(dataProvider="excelData")
	public static void neweflenquiry(String fname, String lname, String email, String day, String month1, String year1, String phonenumber1,
			String phonetype1, String countrycode, String startyear1, String startmonth1, String password, String url, String affiliate) throws InterruptedException, IOException, SQLException {

		EFLEnquiryCase neweflenq = new EFLEnquiryCase();
		
		Commanmethod.openBrowser(url);
		neweflenq.neweflenqtwo(fname, lname, email, day, month1, year1, phonenumber1, phonetype1, countrycode, startyear1, startmonth1, password, url, affiliate);
		
	}
	
	public static void neweflenqtwo(String fname, String lname, String email, String day, String month1, String year1, String phonenumber1,
			String phonetype1, String countrycode, String startyear1, String startmonth1, String password, String url, String affiliate) throws InterruptedException, IOException, SQLException {
		EFLEnquiryPage enqobj = PageFactory.initElements(Commanmethod.driver, EFLEnquiryPage.class);
		
		
		enqobj.eflenquiryform(fname, lname, email, day, month1, year1, phonenumber1, phonetype1, countrycode, startyear1, startmonth1, password, url, affiliate);
		
		
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
