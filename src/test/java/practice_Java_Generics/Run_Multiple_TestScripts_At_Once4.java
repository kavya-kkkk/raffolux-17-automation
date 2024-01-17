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
public class Run_Multiple_TestScripts_At_Once4
{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		//Set Firefox options to use an existing profile
		firefox_options = webdriver.FirefoxOptions();
		firefox_options.profile = webdriver.FirefoxProfile("C:/Program Files/Mozilla Firefox");

		//# Initialize Firefox driver with options
		driver = webdriver.Firefox(options=firefox_options);

		//# Open the first website and perform tests
		driver.get("http://www.example.com");
		//# Run test scripts for the first website

		//# Open the second website and perform tests
		driver.get("http://www.anotherexample.com");
		//# Run test scripts for the second website

		//# Open the third website and perform tests
		driver.get("http://www.yetanotherexample.com");
		//# Run test scripts for the third website

		//# Close the Firefox window and quit the driver
		driver.quit();
		
		
		
	}
	
}
