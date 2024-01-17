/**
 * 
 */
package com.Generic_Function_Libraries;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author hp
 *
 */
public class AssertionUtils {

	public static WebDriver driver;
	
	public static void assertElementPresent(By locator) {
        assertTrue(driver.findElement(locator).isDisplayed());
    }
    
    public static void assertTextPresent(String expectedText) {
        String actualText = driver.findElement(By.tagName("body")).getText();
        assertTrue(actualText.contains(expectedText));
    }
}
