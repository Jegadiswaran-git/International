package com.idp.functionlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.idp.pages.RegistrationForm;
import com.idp.pages.WebDriverEventListenerClass;
import com.idp.utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.github.bonigarcia.wdm.WebDriverManager;





public class Commanmethod {
	
	 public static WebDriver driver;
	 public static ExtentReports report;
	 public static ExtentTest logger;
	 
	 public static DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
	 public static Date date = new Date();
	
	 public static void selectdropdownbyindex(WebElement element,int i)
	 {
		 Select listbox = new Select(element);
		 listbox.selectByIndex(i);
	 }
	 
	 
	 public static void scrollup()
	    {
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("scroll(0, -10000);");
	    }
	 

	 
	 public static String getProperty(String name) throws IOException {
			FileInputStream Finput = new FileInputStream(FilePaths.properties);
			Properties prop = new Properties();
			prop.load(Finput);
			return prop.getProperty(name);

		}
	 
	 
	 public static String get_Write_Property(String name) throws IOException {
			FileInputStream Finput = new FileInputStream(FilePaths.write_properties);
			Properties prop = new Properties();
			prop.load(Finput);
			return prop.getProperty(name);

		}
	 
	 public static void setProperty(String key, String value) throws IOException
	 {
		 FileOutputStream fis = new FileOutputStream("D:\\Abroad_RegressionPack\\config-write.properties");
		 Properties prop = new Properties();
		 prop.setProperty(key, value);
		 prop.store(fis, null);
		 fis.close();
	 }
	 
	 public static void customDrop(List<WebElement> elem, String value) throws InterruptedException{
		
//	        WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
//	        waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(elem));
		 for(WebElement element:elem)
		{
			
//		String innerhtml=element.getAttribute("innerHTML");
		String innerhtml=element.getText();
        //System.out.println(innerhtml);
//		System.out.println(value);
		if(innerhtml.contains(value))
		{
			//System.out.println("matched value this "+innerhtml);	
		element.click();
		break;
		
		}

		}
		 
 }
	 
	 public void closeApp() {
			driver.close();
			driver.quit();
		}
	 
	 public static void openBrowser(String appUrl) throws IOException {
		    //String appUrl = getProperty("abroadurl");
			String browserName = getProperty("browser");
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--incognito");
			
			if (browserName.equalsIgnoreCase("chrome")) 
			{
              
			
				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
				System.setProperty("webdriver.chrome.silentOutput", "true");
				
             options.setPageLoadStrategy(PageLoadStrategy.NONE);
				
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.get(appUrl);
				
								
				
			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

				FirefoxProfile profile = new FirefoxProfile();
				profile.setAcceptUntrustedCertificates(true);

				dc.setCapability(FirefoxDriver.PROFILE, profile);

				WebDriver driver =  new FirefoxDriver(dc);

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
			
			
		}
	 
	 public static void callbackUrl() throws IOException {
		    String appUrl = getProperty("url");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{
                            
				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 
	 public static void callbackArtUrl() throws IOException {
		    String appUrl = getProperty("malurl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{
                         
				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 public static void openC4C() throws IOException {
		    String appUrl = getProperty("c4curl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 
	 public static void openContentHub() throws IOException {
		    String appUrl = getProperty("churl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 public static void openMYIC() throws IOException {
		    String appUrl = getProperty("myicurl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}

	 public static void openCPC() throws IOException {
		    String appUrl = getProperty("cpcurl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{
                            
				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}

	 public static void closebrowser()
	 {
		 driver.close();
	 }
	 
	 public static  void openabroad() throws IOException {
		    String appUrl = getProperty("abroadurl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
//				EventFiringWebDriver cdriver = new EventFiringWebDriver(driver);
//		        WebDriverEventListenerClass eventListener = new WebDriverEventListenerClass();
//
//		        cdriver.register(eventListener);
				
				driver.get(appUrl);
				
				
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 public static void openreviewurl() throws IOException {
		    String appUrl = getProperty("providerreviewurl");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}
	 
	 public static void openSPprofile() throws IOException {
		    String appUrl = getProperty("spprofilelink");
			String browserName = getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) 
			{

				System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePaths.firefoxDriver);
//				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//				capabilities.setCapability("marionette", true);
				//WebDriver driver = new FirefoxDriver(capabilities);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", FilePaths.ieDriver);
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(appUrl);
				
			}

			else {
				
			}
		}

	 public static void captureScreenshot(String fileName, WebDriver driver) throws IOException {
			File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File(FilePaths.screenshot + "//" + fileName + ".png"));

		}

		public static String getData(String sheet, int row, int col) throws IOException {
			String result = null;
			try {
				FileInputStream fis = new FileInputStream(FilePaths.excel);
				// File format .xls=HSSF
				// File format .xlsx=XSSF
				XSSFWorkbook w = new XSSFWorkbook(fis);
				XSSFSheet s = w.getSheet(sheet);
				XSSFRow r = s.getRow(row);
				XSSFCell c = r.getCell(col);
				if (c != null) {
					result = c.toString();
					
				}
			} catch (IOException e) {
				System.out.println("No values");
			}
			return result;
		}

		// Action commands

		public static void type(WebElement element, String value) {
			element.sendKeys(value);
		
		}

		public static void click(WebElement element) {
			element.click();
		}
		
		
		public static void clear(WebElement element) {
			element.clear();
		}

		public static void navigateForward() {
			driver.navigate().forward();
		}

		public static void navigateBack() {
			driver.navigate().back();
		}

		public static void refreshPage() {
			driver.navigate().refresh();
		}

		public static void selectDropdown(WebElement element, String option) {
			new Select(element).selectByValue(option);
		}
		
		public static void selectVisibleText(WebElement element, String option) {
			new Select(element).selectByVisibleText(option);
		}
		
		
		public static void acceptAlert() {
			Alert popup = driver.switchTo().alert();
			popup.accept();
		}

		public static void dismissAlert() {
			Alert popup = driver.switchTo().alert();
			popup.dismiss();
		}

		public static void clearcookie() {
			driver.manage().deleteAllCookies();
		}

		public static void waitUntilElementVisible(WebElement element, int second) {
			WebDriverWait wait = new WebDriverWait(driver, second);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

		public static void waitUntilElementClickable(WebElement element, int second) {
			WebDriverWait wait = new WebDriverWait(driver, second);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		public static void implicitwait() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
//		public static void explicitwait(WebElement element, int second)
//		{
//			 WebDriverWait wait = new WebDriverWait(driver, second);
//			 wait.until(ExpectedConditions.visibilityOfElementLocated(element));
//		}

		public static void perform() {
			Actions action = new Actions(driver);
			action.perform();
		}

		//scroll the page
		
		public static void scroll()
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 500);");
		}
		
		// Storage commands:

		public static String gettitle() {
			return driver.getTitle();
		}

		public static String getUrl() {
			return driver.getCurrentUrl();
		}

		// text or label or link or paragraph
		public static String gettext(WebElement element) {
			return element.getText();
		}

		// value present in text field, checkbox, rediobutton, button label.
		public static String getValue(WebElement element) {
			return element.getAttribute("value");
		}

		// Tooltip:
		public static String getTooltip(WebElement element) {
			return element.getAttribute("title");
		}

		// Dropdown and listbox values:
		public static String getDropdownOption(WebElement element) {
			return new Select(element).getFirstSelectedOption().getText();
		}

		public static List<WebElement> getAllDropdownValues(WebElement element) {
			return new Select(element).getOptions();
		}

		public static List<WebElement> getListselectedValues(WebElement element) {
			return new Select(element).getAllSelectedOptions();
		}

		// Alert:
		public static String getAlertMessages() {
			Alert popup = driver.switchTo().alert();
			return popup.getText();
		}

		public static boolean isSelected(WebElement element) {
			try {
				element.isSelected();
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public static boolean isDisplayed(WebElement element) {
			try {
				element.isDisplayed();
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public static boolean isEnabled(WebElement element) {
			try {
				element.isEnabled();
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public static boolean isAlertPresent() {
			try {
				Alert popup = driver.switchTo().alert();
				return true;
			} catch (Exception e) {
				return false;
			}

		}
		
		public static void liveHostentries() throws IOException
		{
			Runtime.getRuntime().exec("D:\\host_entries\\liveentries.bat");
		}
		
		
		public static void testHostentries() throws IOException
		{
			Runtime.getRuntime().exec("D:\\host_entries\\Testentries.bat");
		}
		
		
		public static void failOverHostentries() throws IOException
		{
			Runtime.getRuntime().exec("D:\\host_entries\\failoverentries.bat");
		}


	 public void accessprop()
	 {
		 File file = new File("D:\\Programs\\IDP Callback form\\dataFile.properties");
		 FileInputStream fileInput = null;

			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
	 }
	 
	 public String getOTP(String email, String affiliate_id) throws SQLException
	 {
		 int ret_code;
		 
	        Connection conn = null;
	        try {
	            // Load and register Oracle driver
	            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	            // Establish a connection
	           // conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_INT", "Mas3rat1");
	             conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_CMI", "ast0n");
	    
	            
	             String query = "SELECT uu.email,uu.affiliate_id,uo.OTP FROM hot_cmi.u_users uu,hot_intadmin.u_user_otp uo WHERE uu.user_id  = uo.user_id AND uu.email = '"+email+"' AND uu.affiliate_id  =" +affiliate_id;
	            // 
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(query);
	           
	            while (rs.next()) { 
	            String OTP = rs.getString("OTP");
	            return OTP;
	            
	 }
	            stmt.close();
	            rs.close();
	        
	            } catch (SQLException e) {
	            ret_code = e.getErrorCode();
	            System.err.println(ret_code + e.getMessage());
	            conn.close();
		 
		 
	 }
	        finally {
	        	
	        	try {
	        		
	        	if(conn!=null)
	        	{
	        		conn.close();
	        	}
	        }
	        	catch (SQLException closeexception)
	        	{
	        		closeexception.printStackTrace();
	        	}
	        }
	 
	 return null;
	 }
	 
	 public static void verifyStatsKey(String affiliate_id, String userid) throws SQLException
	 {
		 int ret_codes;
	 
		 Connection conn = null;
	        try {
	            // Load and register Oracle driver
	            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	            // Establish a connection
	           // conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_INT", "Mas3rat1");
	             conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_CMI", "ast0n");
		 
	             String query = "SELECT d.* FROM   hot_cmi.d_session_log d WHERE  d.user_id = '"+userid+"' and d.affiliate_id = '"+affiliate_id + "'";
				 
		 Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query);
        
         while (rs.next()) { 
         String statskey = rs.getString("TYPE_KEY");
         //
         if(statskey.contains("H.DP"))
         {
        	 //Commanmethod.logger.log(LogStatus.PASS, "Enquiry Stats logged successfully"); 
        	 
         }
         else
         {
        	 
        	// Commanmethod.logger.log(LogStatus.FAIL, "Enquiry Stats not logged successfully"); 
         }
         //return statskey;
         
}
         stmt.close();
         rs.close();
     
         } catch (SQLException e) {
         ret_codes = e.getErrorCode();
         System.err.println(ret_codes + e.getMessage());
         conn.close();
         }
         
         finally {
	        	
	        	try {
	        		
	        	if(conn!=null)
	        	{
	        		conn.close();
	        	}
	        }
	        	catch (SQLException closeexception)
	        	{
	        		closeexception.printStackTrace();
	        	}
	        }
	 
	//return null;
		 		
	 }
	 
	 
	 public String getuserid(String affiliate_id,String emailid) throws SQLException
	 {
		 int ret_codes;
		 
		 Connection conn = null;
	        try {
	            // Load and register Oracle driver
	            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	            // Establish a connection
	           // conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_INT", "Mas3rat1");
	             conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_CMI", "ast0n");
		 
	             String query = "select user_id from u_users where email='"+emailid+"' and affiliate_id = '"+affiliate_id+"'";
				 
		 Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query);
        
         while (rs.next()) { 
         String userid = rs.getString("USER_ID");
         return userid;
         
}
         stmt.close();
         rs.close();
     
         } catch (SQLException e) {
         ret_codes = e.getErrorCode();
         System.err.println(ret_codes + e.getMessage());
         conn.close();
         }
         
         finally {
	        	
	        	try {
	        		
	        	if(conn!=null)
	        	{
	        		conn.close();
	        	}
	        }
	        	catch (SQLException closeexception)
	        	{
	        		closeexception.printStackTrace();
	        	}
	        }
			return null;
	 }
	 
	 public static void highlightElement(WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');", element);

	 }
	 
	 public static void unhighlightElement(WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 0px solid green;');", element);

	 }
	 
	 public static void scrollintoview(WebElement element) throws InterruptedException
	 {
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("arguments[0].scrollIntoView(true);",element);

	 }
	 
	 public static void scrolldown()
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 750);");
		}

	 public static void scrolldown1()
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 550);");
		}
	 public static void scrolldown2()
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 750);");
		}
	 
	 public static void scrolldown3()
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 2000);");
		}


	 
	 public static void selectDropdownVisibleText(WebElement element, String option) {
			new Select(element).selectByVisibleText(option);
	 }
	 
	 
	 public static String addScreenshot() {
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String encodedBase64 = null;

	 

	        FileInputStream fileInputStreamReader = null;
	        try {
	            fileInputStreamReader = new FileInputStream(scrFile);
	            byte[] bytes = new byte[(int) scrFile.length()];
	            fileInputStreamReader.read(bytes);
	            encodedBase64 = new String(Base64.encodeBase64(bytes));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	        return "data:image/png;base64," + encodedBase64;
	    }
	 
	 public void getPageLoadTime(String url)
	 {
		    System.setProperty("webdriver.chrome.driver", FilePaths.chromeDriver);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		    EventFiringWebDriver cdriver = new EventFiringWebDriver(driver);
	        WebDriverEventListenerClass eventListener = new WebDriverEventListenerClass();
	        cdriver.register(eventListener);
	        driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
	        driver.quit();
	 }
	 
	
	    
     public static List<String> getSectionTitle(String order_item_id, String affiliate_id) throws SQLException
     {
         int ret_code;
         
            Connection conn = null;
            try {
                // Load and register Oracle driver
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                // Establish a connection
                   conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_CMI", "ast0n");
                   String query = "SELECT wlis.DISPLAY_NAME FROM c_institutions ci,w_order wo,w_order_item woi,s_profile_section sps,w_inst_profile wip,w_live_inst_profile_section wlis,s_affiliates sa WHERE ci.institution_id = wo.institution_id AND wo.order_id = woi.order_id AND woi.key_id = wip.key_profile_id AND wip.key_profile_id = wlis.key_profile_id AND wlis.section_id = sps.section_id AND sa.affiliate_id = woi.affiliate_id AND woi.affiliate_id IS NOT NULL AND woi.order_item_id = "+order_item_id+" AND woi.affiliate_id ="+affiliate_id+" UNION SELECT wlis.display_name FROM c_institutions ci,w_order wo,w_order_item woi,s_profile_section sps,w_inst_profile wip,s_affiliates sa,w_live_inst_profile_section wlis WHERE ci.institution_id = wo.institution_id AND wo.order_id = woi.order_id AND woi.order_item_id = wip.order_item_id AND wip.key_profile_id = wlis.key_profile_id AND wlis.SECTION_ID = sps.section_id AND sa.affiliate_id = wip.affiliate_id AND network_id IS NULL AND woi.ORDER_ITEM_ID = "+order_item_id+" AND  wip.AFFILIATE_ID = "+affiliate_id;
        
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);


                List<String> resultList = new ArrayList<String>();
                while (rs.next()) {
                      String  result = rs.getString(1); 
                        resultList.add(result);
                }
               
                        return resultList;
            
                } 
            
            catch (SQLException e) {
                ret_code = e.getErrorCode();
                System.err.println(ret_code + e.getMessage());
                conn.close();
             
     }
            finally {
                
                try {
                    
                if(conn!=null)
                {
                    conn.close();
                }
            }
                catch (SQLException closeexception)
                {
                    closeexception.printStackTrace();
                }
            }
     
     return null;
     }


     public static String getIdpMapDatat(String stName, String values, int colu) throws IOException {
         String result = null;
         FileInputStream fis = new FileInputStream("D:\\Abroad_RegressionPack\\Data\\Intl_Mapping Sheet.xlsx");
         XSSFWorkbook wb = new XSSFWorkbook(fis);
         XSSFSheet ss = wb.getSheet(stName);
         String vals = values;
         int itr = colu;
//         Iterator<Sheet> sheetIt = wb.sheetIterator();
//         while (sheetIt.hasNext()) {
//             Sheet sheet = sheetIt.next();
             Iterator<Row> rowIterator = ss.rowIterator();
             while (rowIterator.hasNext()) {
                 Row row = rowIterator.next();
                 Iterator<Cell> cellIt = row.cellIterator();
                 while (cellIt.hasNext()) {
                     Cell cell = cellIt.next();
                     DataFormatter formatter = new DataFormatter(Locale.US);
                     String a = formatter.formatCellValue(cell);
                     String invoiceNumber=null;
                     String b="Null";
                     String c="Null";
                 try{
                     if (a.equals(vals)) {
                         invoiceNumber = row.getCell(cell.getColumnIndex() + itr).getStringCellValue();
                         
                 //        System.out.println(invoiceNumber);
                         if (invoiceNumber == null || invoiceNumber.isEmpty()) {
                         return b;
                         }

  

                         return invoiceNumber;
                         
                     }
                     fis.close();
                 }
                 catch(NullPointerException e)
                 {
                      return c;
                 }
                 }
                 
             }
     //    }
         return result;
     }

  



  

  

  

 

  

     public static void customDrop1(List<WebElement> elem, String value) {
         WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30); 
         waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(elem));
//         int flag = 0;
         for (WebElement element : elem) {

  

              String innerhtml=element.getAttribute("data-value");
         //    String innerhtml = element.getText();
             if (innerhtml.contentEquals(value)) {
                 element.click();
//                 flag = 1;
                 break;

  

             }
//             System.out.println("DropDown Value : " + innerhtml);
//             Assert.assertTrue(flag == 1, "dropdown Type '" + innerhtml
//                     + "' passed as parameter is a mismatch with values available in drop-down ");
         }
     }

	 
	
	 
	 //public static void sendOTP(String email)
	 
//	 public static void sendEmail(String message, String testCaseName)
//	 {
//	 MailMessage mail = new MailMessage();
//	 mail.To.Add("your-to-email-address-goes-here");
//	 mail.From = new MailAddress("your-from-email-address-goes-here ");
//	 mail.Subject = "your-mail-subject-goes-here";
//	 mail.Body = "Test Case Name: " + testCaseName;
//	 mail.Body += Environment.NewLine;
//	 mail.Body += message;
//	 SmtpClient smtp = new SmtpClient();
//	 smtp.Host = "localhost";
//	 smtp.Port = 25;
//	 smtp.Send(mail);
//	 }
     
     public static Object[][] getTestData(String sheetName) throws IOException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException 
     {

    	 

         FileInputStream file = null;
         try {
             file = new FileInputStream(FilePaths.testdata);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         Workbook book = null;
         try {
             book = WorkbookFactory.create(file);
         } catch (InvalidFormatException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         Sheet sheet = book.getSheet(sheetName);
         Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
         // System.out.println(sheet.getLostRowNum() + "______"+
         // sheet.getRow(0).getLostCellNum());
         for (int i = 0; i < sheet.getLastRowNum(); i++) {
             for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                 data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                 // System.out.println(data[i][k]);
             }
         }
         file.close();
         return data;
         
     }
     
     public static void privateconnect(WebElement advanced, WebElement proceed)
     {
    	 
    	 if(advanced.isEnabled())
         {
         	Commanmethod.click(advanced);
         	if(proceed.isEnabled())
            {
            	Commanmethod.click(proceed);
            }
         }
    	 else
    	 {
    		 
    	 }
         
         
    	 
    	 
     }
	 
     
     public static boolean isElementPresent(WebElement element) {
    	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	   
    	    boolean returnVal = true;
    	    try{
    	    	element.isDisplayed();
    	    } catch (NoSuchElementException e){
    	        returnVal = false;
    	    } finally {
    	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	    }
    	    return returnVal;
    	}
     
     public static void click1(WebElement element) {
    	    WebDriverWait wait = new WebDriverWait(driver, 60);
    	    wait.until(ExpectedConditions.elementToBeClickable(element));
    	        JavascriptExecutor js = (JavascriptExecutor) driver;
    	        js.executeScript("arguments[0].click()", element);
    	    }
	
	 


public String intl_verifyuser_hotcmi(String email) throws SQLException
{
	int ret_code;

	Connection conn = null;
	try {
		//System.out.println("statement1");
		// Load and register Oracle driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//System.out.println("statement2");
		// Establish a connection
		// conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "HOT_INT", "Mas3rat1");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@217.33.19.186:1521:phoenix", "hot_cmi", "ast0n");


		//give today and tomorrow date for execute routine
		String query1 = "select user_id from u_users where email = '"+email+"' ";

		Statement stmt = conn.createStatement();
		// System.out.println("statement5");

		ResultSet rs = stmt.executeQuery(query1);
		
		  while (rs.next()) { 
	            String user_id = rs.getString("USER_ID");
	            return user_id;
	            
	 }
	            stmt.close();
	            rs.close();
	        
	            } catch (SQLException e) {
	            ret_code = e.getErrorCode();
	            System.err.println(ret_code + e.getMessage());
	            conn.close();
		 
		 
	 }
	        finally {
	        	
	        	try {
	        		
	        	if(conn!=null)
	        	{
	        		conn.close();
	        	}
	        }
	        	catch (SQLException closeexception)
	        	{
	        		closeexception.printStackTrace();
	        	}
	        }
	 
	 return null;



}
}





	    


