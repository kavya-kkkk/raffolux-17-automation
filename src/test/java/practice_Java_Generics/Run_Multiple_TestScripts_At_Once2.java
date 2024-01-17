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
public class Run_Multiple_TestScripts_At_Once2 extends BaseClass
{
	WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		options.addArguments("--disable notifications");

		DesiredCapabilities cp = new DesiredCapabilities();

		cp.setCapability(ChromeOptions.CAPABILITY, options);

		options.merge(cp);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		//driver.get("https://sandbox.raffolux.com/");
		//Capabilities cap =  driver.getCapabilities();
		
		//Map<String, Object> mycap = cap.asMap();
		
		//System.out.println(mycap);
	}
	
}
