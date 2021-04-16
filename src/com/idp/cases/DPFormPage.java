package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.DPForm;
import com.idp.pages.EnquiryForm;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class DPFormPage {
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
				Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "13-11-2019");
		        Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
		        
				   
	  }
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("DPform");
        
        return arrayObject;
    }
	
	
	@Test(dataProvider="excelData")
	public void verifyDp(String univname, String fname, String lname, String emailaddress, String date, String month, String year, String phonenumber, String phonetype, String countrycode, String studylevel,String studylevel2, String subject, String startyear, String password, String subject2, String countryofresidence,String yournationality, String url, String affiliate,String startYear, String startMonth,String affiliate_id) throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		DPFormPage newdp = new DPFormPage();
		Commanmethod.openBrowser(url);
		
		newdp.newdptwo(univname,fname,lname,emailaddress,date,month,year,phonenumber,phonetype,countrycode,studylevel,studylevel2,subject,startyear,password,subject2,countryofresidence,yournationality,url,affiliate,startYear,startMonth,affiliate_id);
	
	}
	
	public static void newdptwo(String univname, String fname, String lname, String emailaddress, String date, String month, String year, String phonenumber, String phonetype, String countrycode, String studylevel,String studylevel2, String subject, String startyear, String password, String subject2, String countryofresidence,String yournationality, String url, String affiliate,String startYear, String startMonth,String affiliate_id) throws InterruptedException, IOException, SQLException {
		DPForm dpobj = PageFactory.initElements(Commanmethod.driver, DPForm.class);
		
		dpobj.newdpform(univname,fname,lname,emailaddress,date,month,year,phonenumber,phonetype,countrycode,studylevel,studylevel2,subject,startyear,password,subject2,countryofresidence,yournationality,url,affiliate,startYear,startMonth,affiliate_id);

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



