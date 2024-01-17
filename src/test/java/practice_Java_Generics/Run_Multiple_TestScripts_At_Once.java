/**
 * 
 */
package practice_Java_Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class Run_Multiple_TestScripts_At_Once extends BaseClass
{
	//WebDriver driver;
	/*public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:9988");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://facebook.com");
		
	}*/
	
	@Test(priority = 0)
	public void Verify_FacebookPage_Url()
	{
		ExtentTest test = extent.createTest("Verify_RaffoluxLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		//driver.get("https://facebook.com/");
		driver.get("https://sandbox.raffolux.com/");
		//driver.navigate().to("https://sandbox.raffolux.com/");
		driver.findElement(By.linkText("Sign in")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://sandbox.raffolux.com/accounts/login/");
	    test.pass("Pass====================");
	}
	
	@Test(priority = 1)
	public void Verify_By_Entering_Email()
	{
		
		WebElement ele = driver.findElement(By.id("emailAddress"));
	    ele.sendKeys(prop.getProperty("UserName"));
	    Assert.assertEquals(true, false);
	}
	
	@Test(priority = 2)
	public void Verify_By_Entering_Password()
	{
		
		WebElement ele = driver.findElement(By.id("Password"));
		ele.sendKeys(prop.getProperty("PassWord"));
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
