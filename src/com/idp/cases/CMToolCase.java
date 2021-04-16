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
import com.idp.pages.CMToolJourney;
import com.idp.pages.CallbackFormPage;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class CMToolCase {
	
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
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "08-02-2021");
		Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
	   
	  }
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("CMTool");
        
        return arrayObject;
    }
	
	@Test(dataProvider="excelData")
	public static void newCMTool(String firstname,String lastname,String emailaddress,String password,String residence,String destination,String subject,String startyear, String url, String affiliate,String affiliate_id,String environment, String phonenumber, String studylevel, String idpoffice) throws InterruptedException, IOException, SQLException, InvocationTargetException {

		CMToolCase newcmtool = new CMToolCase();
		
		Commanmethod.openBrowser(url);
		newcmtool.newcmtoolfunc(firstname, lastname, emailaddress, password, residence, destination, subject, startyear, url, affiliate, affiliate_id, environment,  phonenumber,  studylevel, idpoffice);
		
	}
	
	
	public static void newcmtoolfunc(String firstname,String lastname,String emailaddress,String password,String residence,String destination,String subject,String startyear, String url, String affiliate,String affiliate_id,String environment, String phonenumber, String studylevel, String idpoffice) throws InvocationTargetException, InterruptedException, IOException, SQLException
	{
		CMToolJourney cmtoolobj = PageFactory.initElements(Commanmethod.driver, CMToolJourney.class);
		cmtoolobj.verifyCMToolJourney(firstname, lastname, emailaddress, password, residence, destination, subject, startyear, url, affiliate, affiliate_id, environment,  phonenumber,  studylevel, idpoffice);
		

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
