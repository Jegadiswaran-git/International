package com.idp.cases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.C4CApplication;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;





public class C4CTest {
	
	@BeforeTest
	public void initializeReport() throws IOException {
		   
		Commanmethod.report = new ExtentReports(new File("C:\\Users\\jegadiswaran.s\\eclipse-workspace\\IDP Callback form\\src\\com\\idp\\testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "IDP Project");
		Commanmethod.openC4C();
		   
	  }
	
	
	  @Test
	  public void verifyC4C() throws IOException, InterruptedException
	  {
		  Commanmethod.logger=Commanmethod.report.startTest("IDP CALL BACK FORM AND C4C INTEGRATION Test", "Test");
		  Commanmethod cm = new Commanmethod();
		  cm.logger.log(LogStatus.INFO,"Test case started");
		  C4CApplication c4c_obj = PageFactory.initElements(Commanmethod.driver,C4CApplication.class);
		  c4c_obj.loginc4c();
		  Thread.sleep(1000);
		  c4c_obj.verify_ICoverview();
		  c4c_obj.logoutc4c();
		  
	  }
	  
	  @AfterTest
		public void closeReport()
		{
			Commanmethod.report.endTest(Commanmethod.logger);
			Commanmethod.report.flush();
			Commanmethod.report.close();
		
		  
	 }

}
