/**
 * 
 */
package practice_Java_Generics;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

/**
 * @author hp
 * Add viewName String array i.e new viewName[]
 */
public class CustomizeExtentReport 
{
	@Test
	public void CreateTest() throws IOException
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html")
				.viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD,ViewName.TEST,ViewName.EXCEPTION,ViewName.AUTHOR,ViewName.DEVICE,ViewName.LOG,ViewName.CATEGORY}).apply();
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report Demo");
		extent.attachReporter(spark);
		
		
		ExtentTest test = extent.createTest("LoginPage Test").assignAuthor("Dharma").assignCategory("Smoke Testing").assignDevice("Windows");
		test.pass("LoginPage Test started successfully");
		test.info("URL is entered");
		test.info("Value entered");
		int a = 0;
		try {
			int c = 10/a;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception");
			//System.out.println(c);
		}
		//test.pass("LoginPage Test Completed Successfully");
		test.pass(MarkupHelper.createLabel("LoginPage Test Completed Successfully", ExtentColor.GREEN));// To highlight the test of the logs
		//Arrays.asList(new String[] {"Selenium", "Appium","Rest Assuered"}).forEach(test::pass);
		
		ExtentTest test1 = extent.createTest("HomePage Test").assignAuthor("Dharma").assignCategory("Smoke Testing").assignDevice("Windows");
		test1.pass("HomePage Test started successfully");
		test1.info("URL is entered");
		test1.info("Value entered");
		//test1.fail("HomePage Test failed miserably");
		test1.fail(MarkupHelper.createLabel("HomePage Test failed miserably", ExtentColor.RED)); //To highlight the test of the logs
		
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	
	

}
