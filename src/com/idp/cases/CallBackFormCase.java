package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.CallbackFormPage;
import com.idp.pages.DPForm;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class CallBackFormCase {
	
	@BeforeTest
	public void initializeReport() throws IOException {
		
		String browserName = getProperty("browser").toUpperCase();
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", browserName);
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl Project");
		
				   
	  }
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("Callbackform");
        
        return arrayObject;
    }
	
	@Test(dataProvider="excelData")
	public void verifyCBF(String fname, String lname, String emailaddress,String phonenumber, String countryofresidence, String destination, String studylevel, String startyear, String idpoffice,String affiliateid, String password, String url, String affiliatename) throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		CallBackFormCase newCBF = new CallBackFormCase();
		Commanmethod.openBrowser(url);
		
		newCBF.newcbftwo(fname,lname,phonenumber,emailaddress,countryofresidence,destination,studylevel,startyear,idpoffice,affiliateid,password,url,affiliatename);
	
	}
	
	
	public static void newcbftwo(String fname, String lname, String emailaddress,String phonenumber, String countryofresidence, String destination, String studylevel, String startyear, String idpoffice,String affiliateid, String password, String url, String affiliatename) throws InvocationTargetException, InterruptedException, IOException, SQLException
	{
		CallbackFormPage cbfobj = PageFactory.initElements(Commanmethod.driver, CallbackFormPage.class);
		
		cbfobj.submitcallbackform(fname,lname,phonenumber,emailaddress,countryofresidence,destination,studylevel,startyear,idpoffice,affiliateid,password,url,affiliatename);

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
