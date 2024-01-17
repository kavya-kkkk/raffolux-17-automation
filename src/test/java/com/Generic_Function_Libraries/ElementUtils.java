/**
 * 
 */
package com.Generic_Function_Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author hp
 *
 */
public class ElementUtils 
{
	public static WebDriver driver;
	
	public static void clickElement(By locator) {
        driver.findElement(locator).click();
    }
    
    public static void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
    
    public static void selectOption(By locator, String option) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(option);
    }
}
