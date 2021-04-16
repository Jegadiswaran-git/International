package com.idp.cases;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.MyICPage;
import com.idp.pages.ReviewDisplayFunctionality;
import com.relevantcodes.extentreports.ExtentReports;

public class ReviewDisplayCase {
	
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
        Object[][] arrayObject = Commanmethod.getTestData("MYIC");      
        return arrayObject;
    }
	
	@Test(dataProvider="excelData")
	public void newreviewdisplay(String url,String emailid,String pwd, String affiliate, String country, String univname, String startdate, String enddate, String reviewurl, String rvwtitle, String rvwcontent) throws InterruptedException, IOException, SQLException, InvocationTargetException {

		ReviewDisplayCase newreviewdisp = new ReviewDisplayCase();
		Commanmethod.openBrowser(reviewurl);
		
		newreviewdisp.newrevtwodisp(url, emailid, pwd, affiliate, country, univname, startdate, enddate, reviewurl, rvwtitle, rvwcontent);
		
	}
	
	public static void newrevtwodisp(String url,String emailid,String pwd, String affiliate, String country, String univname, String startdate, String enddate,  String reviewurl, String rvwtitle, String rvwcontent) throws InterruptedException, IOException, SQLException {
		ReviewDisplayFunctionality revdisp = PageFactory.initElements(Commanmethod.driver, ReviewDisplayFunctionality.class);
		
		revdisp.verifypsreviewpage(url, emailid, pwd, affiliate, country, univname, startdate, enddate, reviewurl, rvwtitle, rvwcontent);
		
		

	}
	
	
	@AfterTest
	public void closeReport()
	{
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
		Commanmethod.closebrowser();
	  
	}


}
