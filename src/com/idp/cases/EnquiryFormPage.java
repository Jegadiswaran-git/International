package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.EnquiryForm;
import com.idp.pages.RegistrationForm;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class EnquiryFormPage {
	
	static WebDriver driver;
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
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "26-11-2019");
		Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
	   
	  }
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("Enquiryform");
        
        return arrayObject;
    }
	
	
	@Test(dataProvider="excelData")
	public static void newenquiry(String univname,String fname,String lname,String email,String date,String month,String year,String phonenumber,String phonetype,String countrycode,String studylevel,String subject,String startyear,String password,String univname2,String subject2,String url,String studylevel2, String destination, String qualification, String affiliate, String startyear1, String startmonth, String startmonth2,String affiliate_id) throws InterruptedException, IOException, SQLException {

		EnquiryFormPage newenq = new EnquiryFormPage();
		
		Commanmethod.openBrowser(url);
		newenq.newregtwo(univname, fname, lname, email, date, month, year, phonenumber, phonetype, countrycode, studylevel, subject, startyear, password, univname2, subject2, url, studylevel2, destination, qualification, affiliate, startyear1,  startmonth, startmonth2,affiliate_id);
		
	}
	
	public static void newregtwo(String univname,String fname,String lname,String email,String date,String month,String year,String phonenumber,String phonetype,String countrycode,String studylevel,String subject,String startyear,String password,String univname2,String subject2,String url,String studylevel2, String destination, String qualification, String affiliate, String startyear1, String startmonth, String startmonth2,String affiliate_id) throws InterruptedException, IOException, SQLException {
		EnquiryForm enqobj = PageFactory.initElements(Commanmethod.driver, EnquiryForm.class);
		
		enqobj.newenquiryform(univname, fname, lname, email, date, month, year, phonenumber, phonetype, countrycode, studylevel, subject, startyear, password, univname2, subject2, url, studylevel2, destination, qualification, affiliate, startyear1,  startmonth, startmonth2,affiliate_id);

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



