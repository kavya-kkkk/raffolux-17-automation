/**
 * 
 */
package practice_Java_Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class Multiple_Test_Scripts 
{
	private static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        // Initialize the Firefox driver
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void testScript1() {
        // Add your test script 1 code here
    	driver.get("https://sandbox.raffolux.com/");
    	
    }

    @Test
    public void testScript2() {
        // Add your test script 2 code here
    	WebElement ele = driver.findElement(By.xpath("(//a[text()='Sign in'])[1]"));
    	ele.click();
    }

    @AfterSuite
    public void tearDown() {
        // Close the Firefox driver
        driver.quit();
    }
}
