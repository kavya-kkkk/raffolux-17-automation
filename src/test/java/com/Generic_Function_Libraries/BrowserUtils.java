/**
 * 
 */
package com.Generic_Function_Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class BrowserUtils 
{
	 public static WebDriver driver;
	    
	    public static void openBrowser(String browserType) {
	        if (browserType.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (browserType.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else {
	            throw new IllegalArgumentException("Invalid browser type: " + browserType);
	        }
	    }
	    
	    public static void navigateToURL(String url) {
	        driver.get(url);
	    }
	    
	    public static void closeBrowser() {
	        driver.quit();
	    }
}
