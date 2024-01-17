/**
 * 
 */
package com.Application_Function_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author hp
 *
 */
public class Wait_Function_Library 
{

	    public static void waitForElementToBeClickable(WebDriver driver, By locator, Duration timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	        wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    public static void waitForVisibilityOfElementLocated(WebDriver driver, By locator, Duration timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public static void waitUntilPageLoad(WebDriver driver, Duration timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	        wait.until(webDriver -> String.valueOf(((JavascriptExecutor) webDriver)
	                .executeScript("return document.readyState"))
	                .equals("complete"));
	    }
	}


