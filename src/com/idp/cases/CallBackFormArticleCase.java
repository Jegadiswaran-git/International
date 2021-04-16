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
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.CallBackFormArticlePage;
import com.idp.pages.CallbackFormPage;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class CallBackFormArticleCase {
	
	@BeforeTest
	public void initializeReport() throws IOException {
		
		String browserName = getProperty("browser").toUpperCase();
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", browserName);
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl Project");
		
				   
	  }
	
	@Test
	public void verifyCBFArticlePages() throws InterruptedException, IOException, SQLException, InvocationTargetException
	{
		Commanmethod.callbackArtUrl();
		CallBackFormArticlePage cbf_obj = PageFactory.initElements(Commanmethod.driver, CallBackFormArticlePage.class);
		//cbf_obj.submitcallbackform();	
		cbf_obj.verifyCallbackforminArticlePages();
		
		
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
