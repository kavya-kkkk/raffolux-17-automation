

package com.raffolux.base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.raffolux.actiondriver.Action;
import com.raffolux.pages.IndexPage;
import com.raffolux.pages.Instant_Raffle_Pagination_Page;
import com.raffolux.pages.SignUpPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 * 
 * 
 *
 */
public class BaseClass 
{
	public static ExtentTest test;
	public static WebDriver driver;
	public static Properties prop;
	public static IndexPage indexPage;
	public static SignUpPage signUpPage;
	public static Instant_Raffle_Pagination_Page instant_Raffle_Pagination_Page;
	
	
	//Extent Report code
	public static ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		
	//Open the Extent Report
	@BeforeMethod
	public void Config_Extent_Report()
	{
		spark.config().setTheme(Theme.DARK);//
		spark.config().setDocumentTitle("My report");
		spark.config().setReportName("Automation report");
		extent.attachReporter(spark);   // very very important...
	}
	
	//Close the Extent Report
	@AfterMethod
	public void SetUp()
	{
		//ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		//Desktop.getDesktop().browse(new File("target/Spark.html").toURI()); // <------In order to open the report
		// automatically (no need to open manually)
		extent.flush();
	}
	
	//Fetch the data from the property file
	@BeforeTest
	public void LoadConfig()
	{
		try {
		prop = new Properties();
		System.out.println("Super constructor invoked");
		
	    FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
	                  
	     prop.load(ip);
	     
	     System.out.println("driver :"+ driver);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
         catch (IOException e) 
		{
			e.printStackTrace();
	    }
	}
	
	//Launch the browser
	@BeforeSuite
	public void LaunchApp() throws InterruptedException
	{
		
		//ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		try
		{
			WebDriverManager.firefoxdriver().setup();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true);
        driver = new FirefoxDriver(options);

        /*ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:9922");
       
        driver = new ChromeDriver(opt);*/
		
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
	    /*String BrowserName = prop.getProperty("browsername");
		
		if(BrowserName.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.contains("firfox")) 
		{
			driver = new FirefoxDriver();
		}
		else if(BrowserName.contains("IE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
		     throw new IllegalArgumentException("Invalid browser type: " + BrowserName);
		}*/
		
		//driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		//driver.get(prop.getProperty("url"));                  //Raffolux Live url
		//driver.get(prop.getProperty("URL1"));                //Debugging chrome
		//driver.get(prop.getProperty("URL"));                //Sandbox URL
		//driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		Thread.sleep(3000);
		System.out.println("driver :"+ driver);
		indexPage = new IndexPage();
	}
	
	    //Close the browser as well as workbook
		@AfterSuite
		public void tearDown() throws IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			workbook.close();
			//driver.close();
			driver.quit();
		}
	
}
