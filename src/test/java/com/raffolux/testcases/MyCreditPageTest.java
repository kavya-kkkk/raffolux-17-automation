/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;

import com.raffolux.pages.MyCreditPage;
import com.raffolux.pages.ProfilePop_up;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.WinnersPage;

/**
 * @author hp
 *
 */
public class MyCreditPageTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	WinnersPage winnersPage;
	ProfilePop_up profilePop_up;
	MyCreditPage myCreditPage;
	
	@Test(priority = 0, enabled = true)
   	public void Verify_Navigation_ToMyCreditPage() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Navigation_ToMyCreditPage").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/wallet";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   		 }
    }
	
	@Test(priority = 1, enabled = true)
   	public void Verify_Left_Arrow_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Left_Arrow_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 myCreditPage = profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 boolean flag =  myCreditPage.ValidateLeft_Arrow_Symbol();
		 if(flag == true)
		 {
			 test.pass("Left_Arrow_Symbol is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Left_Arrow_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 2, enabled = true)
   	public void Clickon_Left_Arrow_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Left_Arrow_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 myCreditPage = profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 myCreditPage.ClickonLeft_Arrow_Symbol();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/wallet";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   		 }
    }
	
	@Test(priority = 3, enabled = true)
   	public void Verify_Credit_Balance_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Credit_Balance_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 myCreditPage = profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 String actualText = myCreditPage.ValidateCredit_Balance_Text();
		 String expectedText = "CREDIT BALANCE";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText   :" + actualText + "is matching the expectedText  :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText   :"+ actualText + " is not matching with the expectedText   :"+ expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 4, enabled = true)
   	public void Verify_Credit_Balance_Amount() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Credit_Balance_Amount").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 myCreditPage = profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 String actualText = myCreditPage.ValidateCredit_Balance_Amount();
		 String expectedText = "£0.00";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText   :" + actualText + "is matching the expectedText  :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText   :"+ actualText + " is not matching with the expectedText   :"+ expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 5, enabled = true)
   	public void Verify_You_can_earn_credit_through_promotionalCodes_and_raffles_text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify You_can_earn_credit_through_promotionalCodes_and_raffles_text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 myCreditPage = profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 String actualText = myCreditPage.ValidateYou_can_earn_credit_through_promotionalCodes_and_raffles_text();
		 String expectedText = "You can earn credit through promotional codes and raffles.";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText   :" + actualText + "is matching the expectedText  :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText   :"+ actualText + " is not matching with the expectedText   :"+ expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
}
