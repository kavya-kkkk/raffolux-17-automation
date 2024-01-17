/**
 * 
 */
package practice_Java_Generics;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 * 
 * 
 * To print all the capabilities of respective Chrome browser.
 * 
 * How to open chrome browser when we having an issue with chrome browser 111 version
 * 
 * 
 *
 */
public class Run_Multiple_TestScripts_At_Once3
{
	public static WebDriver driver;
	
	/*public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\src\\test\\resources\\resources\\geckodriver.exe");
	    //WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "\\src\\test\\resources\\resources\\geckodriver.exe");
		
		/*FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		WebDriver driver1 = new FirefoxDriver(options);
		driver1.get("https://sandbox.raffolux.com/");
	
	}*/
	
	@Test(priority = -1)
	public void Launch_Browser()
	{
		WebDriverManager.firefoxdriver().setup();
		
		// Set the desired port
        String port = "9022";

        // Create FirefoxOptions object and add the preference
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("network.port", Integer.parseInt(port));

        // Launch Firefox with the desired port
        driver = new FirefoxDriver(options);

        // Navigate to a URL
       // driver.get("http://example.com");

        // Close the browser
     //   driver.quit();
	}
	
	
	@Test(priority = 0)
	public void Verify_FacebookPage_Url()
	{
		//ExtentTest test = extent.createTest("Verify_RaffoluxLogo").assignAuthor("Dharma")
				//.assignCategory("Functional testing").assignDevice("Windows");
		
		//driver.get("https://facebook.com/");
		driver.get("https://sandbox.raffolux.com/");
		//driver.navigate().to("https://sandbox.raffolux.com/");
		driver.findElement(By.linkText("Sign in")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sandbox.raffolux.com/accounts/login/");
	    //test.pass("Pass====================");
	}
	
	@Test(priority = 1)
	public void Verify_By_Entering_Email()
	{
		
		WebElement ele = driver.findElement(By.id("emailAddress"));
	    ele.sendKeys("Dharmaveera.Devaputra@rhibhus.com");
	    Assert.assertEquals(true, false);
	}
	
	@Test(priority = 2)
	public void Verify_By_Entering_Password()
	{
		
		WebElement ele = driver.findElement(By.id("Password"));
		ele.sendKeys("Dharma@8103");
		Assert.assertEquals(false, false);
	}
	
	@Test(priority = 3)
	public void Verify_HomePage_By_Clicking_LoginBtn()
	{
		
		WebElement ele = driver.findElement(By.id("btnLogin"));
		ele.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sandbox.raffolux.com/");
	}
	
}
