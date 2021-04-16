package com.idp.utilities;

import java.io.File;

public class FilePaths {
	
	
	public static final String chromeDriver = new File("D:/Abroad_RegressionPack/chromedriver.exe").getAbsolutePath();
	public static final String firefoxDriver=new File("D:/Abroad_RegressionPack/geckodriver.exe").getAbsolutePath();
	public static final String ieDriver=new File("D:/Programs/Datadriven/IEDriverServer.exe").getAbsolutePath();
	public static final File screenshot=new File("D:/Programs/Intl/src/main/java/com/hc/screenshots").getAbsoluteFile();
	public static final File excel2 = new File("D:\\Abroad_RegressionPack\\Data\\Test Data.xlsx").getAbsoluteFile();
	public static final File excel=new File("D:\\Abroad_RegressionPack\\Data\\Test Data.xlsx").getAbsoluteFile();
	
	//public static final File properties = new File("D:\\Programs\\Intl\\dataFile.properties");
	public static File properties = new File("C:\\Users\\jegadiswaran.s\\git\\TestProject\\IDPCallbackform\\dataFile.properties").getAbsoluteFile();
	public static File write_properties = new File("C:\\Users\\jegadiswaran.s\\eclipse-workspace\\IDP Callback form\\config-write.properties");
	
	public static final File mapping=new File("D:\\Abroad_RegressionPack\\Data\\Intl_Mapping Sheet.xlsx").getAbsoluteFile();
	
	public static final File testdata=new File("D:\\Abroad_RegressionPack\\Data\\Test Data.xlsx").getAbsoluteFile();
	

}
