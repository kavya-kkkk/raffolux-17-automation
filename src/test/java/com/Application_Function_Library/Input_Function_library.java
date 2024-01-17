/**
 * 
 */
package com.Application_Function_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author hp
 *
 */
public class Input_Function_library 
{
	    public static void setInputField(WebDriver driver, By locator, String inputText) {
	        WebElement inputField = driver.findElement(locator);
	        inputField.clear();
	        inputField.sendKeys(inputText);
	    }

	    public static void clickButton(WebDriver driver, By locator) {
	        WebElement button = driver.findElement(locator);
	        button.click();
	    }
}
