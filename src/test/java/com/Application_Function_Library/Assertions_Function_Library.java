/**
 * 
 */
package com.Application_Function_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * @author hp
 *
 */
public class Assertions_Function_Library 
{
	    public static void assertTitleEquals(WebDriver driver, String expectedTitle) {
	        Assert.assertEquals(driver.getTitle(), expectedTitle);
	    }

	    public static void assertTextEquals(String actualText, String expectedText) {
	        Assert.assertEquals(actualText, expectedText);
	    }

	    public static void assertElementIsDisplayed(WebDriver driver, By locator) {
	        Assert.assertTrue(driver.findElement(locator).isDisplayed());
	    }
}

