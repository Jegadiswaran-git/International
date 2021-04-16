package com.idp.cases;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Driver;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.CallbackFormPage;
import com.idp.pages.DPForm;
import com.idp.pages.HomePage;
import com.idp.pages.MyICPage;
import com.idp.pages.ReviewPage;
import com.relevantcodes.extentreports.ExtentReports;

public class ReviewCase {
	@AfterMethod
	public void closebrow() {
		//Commanmethod.closebrowser();
	}

	
	@BeforeTest
	public void initializeReport() throws IOException {
		
		
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		// Adding System and Project info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Hotcourses Abroad Site");
		Commanmethod.report.addSystemInfo("SCRIPT_NAME", "Regression Pack");
		Commanmethod.report.addSystemInfo("LANGUAGE", "Java");
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "30-9-2019");
		Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
		
				   
	  }
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("Reviewform");      
        return arrayObject;
    }
	

	@Test(dataProvider="excelData")
	public void newreview(String url,String reviewtitle, String reviewcomments, String yearofgrad, String studylevel, String subject, String coursename, String firstname, String lastname, String emailaddress, String yourcountry, String password, String country, String univname, String startdate, String enddate, String affiliate, String affiliate_id) throws InterruptedException, IOException, SQLException, InvocationTargetException {

		ReviewCase newreview = new ReviewCase();
		
		Commanmethod.openBrowser(url);
		newreview.newrevtwo(url,reviewtitle,reviewcomments,yearofgrad,studylevel,subject,coursename,firstname,lastname,emailaddress,yourcountry,password,country,univname,startdate,enddate,affiliate,affiliate_id);
		
	}
	
	public static void newrevtwo(String url,String reviewtitle, String reviewcomments, String yearofgrad, String studylevel, String subject, String coursename, String firstname, String lastname, String emailaddress, String yourcountry, String password, String country, String univname, String startdate, String enddate, String affiliate, String affiliate_id) throws InterruptedException, IOException, SQLException {
		ReviewPage revobj = PageFactory.initElements(Commanmethod.driver, ReviewPage.class);
		
		revobj.submitreview(url,reviewtitle,reviewcomments,yearofgrad,studylevel,subject,coursename,firstname,lastname,emailaddress,yourcountry,password,country,univname,startdate,enddate,affiliate,affiliate_id);

	}
	
	
	@AfterTest
	public void closeReport()
	{
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
		Commanmethod.closebrowser();
	  
	}

}
