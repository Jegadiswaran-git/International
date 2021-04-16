package com.idp.cases;

public class runnerclass {
	
//  private static final String String = null;

	 

  @BeforeClass



  public void initializeReport() {
          CommonFunction.report = new ExtentReports(
              FilePath.reports.getAbsolutePath()
                      + "\\" + CommonFunction.dateformat.format(CommonFunction.date) + "User_Reg_and_Ex-User_TestReport.html");



      // Adding system info
      CommonFunction.report.addSystemInfo("OS", "WINDOWS");
      CommonFunction.report.addSystemInfo("BROWSER", "CHROME");
      CommonFunction.report.addSystemInfo("PROJECT_NAME", "IDP");
      CommonFunction.report.addSystemInfo("Scriptname", "Regression");
  }



//   @AfterClass
//   public void closeReport() {
//   CommonFunction.report.endTest(CommonFunction.logger);
//   CommonFunction.report.flush();
//  
//   }



//  @BeforeMethod 
//  public void lanchbrowser() throws IOException {
//
//      CommonFunction.openBrowserPera("url");
//
//  }



//  @AfterClass
//  public void closebrowser() {
//      CommonFunction.closeApp();
//  }
  
  @DataProvider(name="excelData")
  public Object[][] loginData() throws Exception {
      Object[][] arrayObject = CommonFunction.getTestData("RegUserEnq");
      
      return arrayObject;
  }
  
  
  @Test(dataProvider="excelData") 
  public void idpRegist(String TestDataId, String RegFirstName, String RegLastName, String RegEmail, String RegMbCode, String RegMobile,
          String RegPwd, String RegIDPOffice, String RegMktingAccpt, String PrefStudyAbCnty, String StudyLevel, 
          String WhenToStudy,    String ExuserMktAccpt, String WalkIn, String FindOut, String Naty, String HowDidYouHear, 
          String FundEdu, String ExUsrIDPOffice , String url) throws InterruptedException, IOException {
      IdpRegistrationRunnerClass objrs = new IdpRegistrationRunnerClass();
      String tcStat = CommonFunction.getIdpMapDatat("EnqTcStatus", TestDataId, 1).toLowerCase();
      if(tcStat.equals("fail")||tcStat.equals("null")){
      CommonFunction.openBrowserPeras(url);
//      CommonFunction.report = new ExtentReports(
//              FilePath.reports.getAbsolutePath()
//                      + "\\" + CommonFunction.dateformat.format(CommonFunction.date) + "Reg_User_TestReport.html");
//
//      // Adding system info
//      CommonFunction.report.addSystemInfo("OS", "WINDOWS");
//      CommonFunction.report.addSystemInfo("BROWSER", "CHROME");
//      CommonFunction.report.addSystemInfo("PROJECT_NAME", "IDP");
//      CommonFunction.report.addSystemInfo("Scriptname", "Regression");
      objrs.idpRegPage(TestDataId, RegFirstName, RegLastName, RegEmail, RegMbCode, RegMobile, RegPwd, RegIDPOffice, RegMktingAccpt, PrefStudyAbCnty, StudyLevel, WhenToStudy, ExuserMktAccpt, WalkIn, FindOut, Naty, HowDidYouHear, FundEdu, ExUsrIDPOffice, url);
//                  
//      CommonFunction.closeApp();



  }
  }
  public void idpRegPage(String TestDataId, String RegFirstName, String RegLastName, String RegEmail, String RegMbCode,    String RegMobile,
          String RegPwd, String RegIDPOffice, String RegMktingAccpt, String PrefStudyAbCnty, String StudyLevel, 
          String WhenToStudy,    String ExuserMktAccpt, String WalkIn, String FindOut, String Naty, String HowDidYouHear, 
          String FundEdu, String ExUsrIDPOffice, String url) throws InterruptedException, IOException {
      IdpRegistration R1 = PageFactory.initElements(CommonFunction.driver, IdpRegistration.class);
      
      R1.registration(TestDataId, RegFirstName, RegLastName, RegEmail, RegMbCode, RegMobile, RegPwd, RegIDPOffice, RegMktingAccpt, PrefStudyAbCnty, StudyLevel, WhenToStudy, ExuserMktAccpt, WalkIn, FindOut, Naty, HowDidYouHear, FundEdu, ExUsrIDPOffice, url);
  CommonFunction.closeApp();
//       CommonFunction.report.endTest(CommonFunction.logger);
//       CommonFunction.report.flush();



  }



}

}
