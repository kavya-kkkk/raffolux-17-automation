/**
 * 
 */
package com.raffolux.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class Intant_Raffle_Page 
{
	@Test
	public void Navigate_To_Instant_Raffle_Page()
	{
		for(int i=0; i<1; i++)
		{
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://raffolux.com/cash/raffle/3374/auditreasurehunt/");
			driver.get("https://raffolux.com/cash/raffle/3374/auditreasurehunt/");
		}
		
	}
}
