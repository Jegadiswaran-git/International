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
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.CallbackFormPage;
import com.idp.pages.FacebookLogin;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class FbloginPage {
	
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
				Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "22-10-2019");
		        Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
		   
	  }
	
	
	@Test
	public void verifyfblogin() throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		
		String url = "https://www.hotcourses.ae";
		Commanmethod.openBrowser(url);
		FacebookLogin fbobj = PageFactory.initElements(Commanmethod.driver, FacebookLogin.class);
		fbobj.fblogin();
	
	}
	
	
	
	@AfterTest
	public void closeReport()
	{
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
			  
	}
	
	public static String getProperty(String name) throws IOException {
		FileInputStream Finput = new FileInputStream(FilePaths.properties);
		Properties prop = new Properties();
		prop.load(Finput);
		return prop.getProperty(name);

	}

}



