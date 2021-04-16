package com.idp.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.idp.functionlibrary.Commanmethod;
import com.idp.pages.SearchFunctionality;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;

public class SearchCase {
	
	@AfterMethod
	public void closebrow() {
		//Commanmethod.closebrowser();
	}

	
	@BeforeTest

	public void initializeReport() throws IOException {
		
		String browserName = getProperty("browser").toUpperCase();

		Commanmethod.report = new ExtentReports(new File("src/main/java/com/idp/testreport").getAbsolutePath() + "\\" + Commanmethod.dateformat.format(Commanmethod.date)+ "_TestReport.html");

		// Adding System and Project info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", browserName);
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Hotcourses Abroad Site");
		Commanmethod.report.addSystemInfo("SCRIPT_NAME", "Regression Pack");
		Commanmethod.report.addSystemInfo("LANGUAGE", "Java");
		Commanmethod.report.addSystemInfo("LAST UPDATED DATE", "10-10-2019");
		Commanmethod.report.addSystemInfo("LAST UPDATED BY", "JEGADISWARAN S");
		
		
	}
	
	@DataProvider(name="excelData")
    public Object[][] loginData() throws Exception {
        Object[][] arrayObject = Commanmethod.getTestData("Search");
        
        return arrayObject;
    }


	@Test(dataProvider="excelData")
	public static void newsearchf(String url, String ksearch, String asearch, String usearch, String csearch, String l1subject, String l2subject, String destination, String qualification, String asearchresult, String l1subjectsearchresult, String l2subjectsearchresult) throws InterruptedException, IOException, SQLException {
		
		SearchCase newsearch = new SearchCase();
		Commanmethod.openBrowser(url);
		newsearch.newsrchtwo(url,ksearch,asearch,usearch,csearch,l1subject,l2subject,destination,qualification,asearchresult, l1subjectsearchresult, l2subjectsearchresult);
		
	}
	
	public static void newsrchtwo(String url, String ksearch, String asearch, String usearch, String csearch, String l1subject, String l2subject, String destination, String qualification, String asearchresult, String l1subjectsearchresult, String l2subjectsearchresult) throws InterruptedException, IOException, SQLException {
		SearchFunctionality srchf = PageFactory.initElements(Commanmethod.driver, SearchFunctionality.class);
		
		srchf.topnavsearch(url,ksearch,asearch,usearch,csearch,l1subject,l2subject,destination,qualification,asearchresult,l1subjectsearchresult,l2subjectsearchresult);

	}

	
	@AfterTest
	public void closeReport() {
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
