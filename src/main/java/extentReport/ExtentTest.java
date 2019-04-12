public class ExtentTest {

      

public ExtentHtmlReporter extentHtmlReporter;

 

public ExtentTest extentTest;

 

public ExtentTest extentReports;

 

 

       @BeforeClass

       public void beforeClass() {

              extentHtmlReporter = new ExtentHtmlReporter("extent.html");package extentTest;

import org.testng.annotations.BeforeClass;






extentReports.attachReporter(extentHtmlReporter);

extentTest=extenttest.createTest(getClass().getSimpleName());







}
       @BeforeMethod

       public void beforeMethod(Method result) {

              extentTest.log(Status.INFO, result.getName()+"Started..");

             

       }
       @Test

       public void test1() {

             

              extentTest.log(Status.INFO, "test 1 started");

              extentTest.log(Status.INFO, "test 1 started");

       }@AfterMethod

       public void afterMethod(ITestResult result) {

              logReport(result);

             

       }

      

       public void logReport(ITestResult result) {

             

              if(result.getStatus()==result.FAILURE) {

                     extentTest.log(Status.ERROR, result.getName()+"Failed");

                     extentTest.log(Status.ERROR,result.getThrowable());

              }

              else if (result.getStatus()==result.SKIP) {

                  extentTest.log(Status.SKIP, result.getName()+"Skipped");

                  extentTest.log(Status.SKIP,result.getThrowable());

           }

          

           else if (result.getStatus()==result.SUCCESS) {

                  extentTest.log(Status.INFO, result.getName()+"Success");

           }

       }

       

       @AfterTest

       public void Afterclass() {

             

              extentReports.flush();

       }
