/**
 * 
 */
package com.raffolux.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class Get_Attributes extends BaseClass {

	SignInPage signInPage;
	HomePage homePage;
	RafflePageAfterLogin RafflePageAfterLogin;
	CartSummaryPage cartSummaryPage;
	
	@Test
	public void Get_AttributeValue() throws Throwable
	{
		
   /* WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://duckduckgo.com/");*/
	
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 
		WebElement EnterNow_Btn =  driver.findElement(By.xpath("//*[@id=\"8254\"]/div[2]/span/a"));
		
		Action.JSClick(driver, EnterNow_Btn);
		 
		/*WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		
		Action.JSClick(driver, ele1);
		 
		 Action.selectByIndex(ele1, 2);
		//Action.selectByIndex(ele1, 0) */
		
		 WebElement Enter_Btn = driver.findElement(By.xpath("//*[@id=\"desktop-mutation-enter\"]"));
		 
		 Action.JSClick(driver, Enter_Btn);
		
		 WebElement Cart_Notification_Symbol = driver.findElement(By.xpath("//*[@id=\"mainMenuContent\"]/ul/li[3]/a/i"));
		 
		 Action.JSClick(driver, Cart_Notification_Symbol);
		 
		WebElement Ticket_Remove_Symbol =  driver.findElement(By.xpath("(//i[@class='fal fa-times text-always-black'])[1]"));
		
		// retrieving html attribute value using getAttribute() method
		String data_Id = Ticket_Remove_Symbol.getAttribute("data-Id");
		System.out.println("Value of data_Id attribute: "+ data_Id);

		String data_item=Ticket_Remove_Symbol.getAttribute("data-item");
		System.out.println("Value of data_item attribute: "+data_item);

		// Retrieving value of attribute which does not exist
		String data_cart=Ticket_Remove_Symbol.getAttribute("data-cart");
		System.out.println("Value of data_cart attribute: "+data_cart);
		 
		/*
		 //RafflePageAfterLogin = homePage.ClickonInstantRaffleEnterNowBtnAfterLogin();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 cartSummaryPage= RafflePageAfterLogin.CliockonCartNotificationLogo();
	

	WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

	
	// retrieving html attribute value using getAttribute() method
	String typeValue=searchTextBox.getAttribute("type");
	System.out.println("Value of type attribute: "+typeValue);

	String autocompleteValue=searchTextBox.getAttribute("autocomplete");
	System.out.println("Value of autocomplete attribute: "+autocompleteValue);

	// Retrieving value of attribute which does not exist
	String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
	System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);*/

	}
	}
	
	
	
	
	
	
	

