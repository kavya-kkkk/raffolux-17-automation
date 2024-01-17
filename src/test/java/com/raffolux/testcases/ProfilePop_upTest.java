/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.ProfilePop_up;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.WinnersPage;

/**
 * @author hp
 *
 */
public class ProfilePop_upTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	WinnersPage winnersPage;
	ProfilePop_up profilePop_up;
	
	@Test(priority = 0, enabled = true)
   	public void Verify_Navigation_ToProfile_pop_up() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Navigation_ToProfile_pop_up").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag =  profilePop_up.ValidateProfile_Pop_up_window();
		 if(flag == true)
		 {
			 test.pass("Profile_Pop_up_window is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Profile_Pop_up_window is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 1, enabled = true)
   	public void Verify_WelComeBackDharma_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify WelComeBackDharma_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 String actualText = profilePop_up.ValiadteWelComeBackDharma_Text();
		 String expectedText = "Welcome back pen";
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
	
   	@Test(priority = 2, enabled = true)
   	public void Verify_You_Have_Entries_In_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify You_Have_Entries_In_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 String actualText = profilePop_up.ValiadteYou_Have_Entries_In_Text();
		 String expectedText = "You have entries in 1 active raffle";
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
   	
   	@Test(priority = 3, enabled = true)
   	public void Verify_Pop_Up_Closing_Option() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Pop_Up_Closing_Option").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag =  profilePop_up.ValidatePop_Up_Closing_Option();
		 if(flag == true)
		 {
			 test.pass("Pop_Up_Closing_Option is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Pop_Up_Closing_Option is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
   	
   	@Test(priority = 4, enabled = true)
   	public void Clickon_Pop_Up_Closing_Option() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Pop_Up_Closing_Option").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonPop_Up_Closing_Option();
   		 boolean flag = profilePop_up.ValidateProfile_Pop_up_window();
		 if(flag == false)
		 {
			 test.pass("Profile_Pop_up_window is not Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Profile_Pop_up_window is Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
   	
	@Test(priority = 5, enabled = true)
   	public void Verify__Active_Raffles() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify _Active_Raffles").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.Validate_Active_Raffles();
		 if(flag == true)
		 {
			 test.pass("_Active_Raffles is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("_Active_Raffles is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 6, enabled = true)
   	public void Clickon_Two_Active_Raffles() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Two_Active_Raffles").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.Clickon_Active_Raffles();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/myraffles/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 7, enabled = true)
   	public void VerifyMyraffles_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Myraffles_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateMyraffles_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Myraffles_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Myraffles_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 8, enabled = true)
   	public void VerifyMyraffles_Ticket_Token() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Myraffles_Ticket_Token").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateMyraffles_Ticket_Token();
		 if(flag == true)
		 {
			 test.pass("Myraffles_Ticket_Token is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Myraffles_Ticket_Token is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 9, enabled = true)
   	public void ClickonMyraffles_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Myraffles_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonMyraffles_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/myraffles/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 10, enabled = true)
   	public void VerifyMyCredit_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify MyCredit_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateMyCredit_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("MyCredit_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("MyCredit_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 11, enabled = true)
   	public void VerifyMyCredit_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify MyCredit_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateMyCredit_Symbol();
		 if(flag == true)
		 {
			 test.pass("MyCredit_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("MyCredit_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 12, enabled = true)
   	public void ClickonMyCredit_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the MyCredit_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonMyCredit_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/wallet";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 13, enabled = true)
   	public void VerifyMyCredit_Balance_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify MyCredit_Balance_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 String actualText = profilePop_up.ValiadteMyCredit_Balance_Text();
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
	
	@Test(priority = 14, enabled = true)
   	public void VerifyWinners_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Winners_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateWinners_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Winners_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Winners_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 15, enabled = true)
   	public void VerifyWinners_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Winners_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateWinners_Symbol();
		 if(flag == true)
		 {
			 test.pass("Winners_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Winners_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 16, enabled = true)
   	public void ClickonWinners_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Winners_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonWinners_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/winners/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 17, enabled = true)
   	public void VerifyLiveDraws_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify LiveDraws_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateLiveDraws_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("LiveDraws_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("LiveDraws_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 18, enabled = true)
   	public void VerifyLiveDraws_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify LiveDraws_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateLiveDraws_Symbol();
		 if(flag == true)
		 {
			 test.pass("LiveDraws_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("LiveDraws_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 19, enabled = true)
   	public void ClickonLiveDraws_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the LiveDraws_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/livedraws/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 20, enabled = true)
   	public void VerifyCharity_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Charity_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateCharity_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Charity_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Charity_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 21, enabled = true)
   	public void VerifyCharity_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Charity_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateCharity_Symbol();
		 if(flag == true)
		 {
			 test.pass("Charity_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Charity_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 22, enabled = true)
   	public void ClickonCharity_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Charity_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonCharity_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/charities/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 23, enabled = true)
   	public void VerifyToggleTheme_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ToggleTheme_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateToggleTheme_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("ToggleTheme_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("ToggleTheme_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 24, enabled = true)
   	public void VerifyToggleTheme_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ToggleTheme_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateToggleTheme_Symbol();
		 if(flag == true)
		 {
			 test.pass("ToggleTheme_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("ToggleTheme_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 25, enabled = true)
   	public void ClickonToggleTheme_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the ToggleTheme_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonToggleThema_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/#";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.pass("The Theme is Changed as per prefered");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 26, enabled = true)
   	public void VerifyLogout_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Logout_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateLogout_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Logout_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Logout_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 27, enabled = true)
   	public void VerifyLogout_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Logout_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateLogout_Symbol();
		 if(flag == true)
		 {
			 test.pass("Logout_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Logout_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 28, enabled = true)
   	public void ClickonLogout_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Logout_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonLogout_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 29, enabled = true)
   	public void VerifyAccount_Option() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Account_Option").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 String actualText = profilePop_up.ValiadteAccount_Option();
		 String expectedText = "Account";
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
	
	@Test(priority = 30, enabled = true)
   	public void VerifyPersonal_Info_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Personal_Info_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidatePersonal_Info_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Personal_Info_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Personal_Info_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 31, enabled = true)
   	public void VerifyPersonal_Info_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Personal_Info_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidatePersonal_Info_Symbol();
		 if(flag == true)
		 {
			 test.pass("Personal_Info_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Personal_Info_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 32, enabled = true)
   	public void ClickonPersonal_Info_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Personal_Info_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonPersonal_Info_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/members/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 33, enabled = true)
   	public void VerifySite_Info_Option() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Site_Info_Option").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 String actualText = profilePop_up.ValiadteSite_Info_Option();
		 String expectedText = "Site information";
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
	
	@Test(priority = 34, enabled = true)
   	public void VerifyHelp_And_FAQS_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Help_And_FAQS_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateHelp_And_FAQS_Slide_Bar_Menu_Link();
		 if(flag == true)
		 {
			 test.pass("Help_And_FAQS_Slide_Bar_Menu_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Help_And_FAQS_Slide_Bar_Menu_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 35, enabled = true)
   	public void VerifyHelp_And_FAQS_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Help_And_FAQS_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateHelp_And_FAQS_Symbol();
		 if(flag == true)
		 {
			 test.pass("Help_And_FAQS_Symbol is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Help_And_FAQS_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 36, enabled = true)
   	public void ClickonHelp_And_FAQS_Slide_Bar_Menu_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Help_And_FAQS_Slide_Bar_Menu_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonHelp_And_FAQS_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/help/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 37, enabled = true)
   	public void VerifyTerms_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Terms_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateTerms_Link();
		 if(flag == true)
		 {
			 test.pass("Terms_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Terms_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 38, enabled = true)
   	public void ClickonTerms_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Terms_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonTerms_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/tcs/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 39, enabled = true)
   	public void VerifyPrivacy_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Privacy_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidatePrivacy_Link();
		 if(flag == true)
		 {
			 test.pass("Privacy_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Privacy_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 40, enabled = true)
   	public void ClickonPrivacy_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Privacy_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonPrivacy_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/privacy/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 41, enabled = true)
   	public void VerifyHelp_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Help_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateHelp_Link();
		 if(flag == true)
		 {
			 test.pass("Help_Link is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Help_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 42, enabled = true)
   	public void ClickonHelp_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Help_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonHelp_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/help/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 43, enabled = true)
   	public void VerifyFacebook_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Facebook_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateFacebook_Icon_Logo();
		 if(flag == true)
		 {
			 test.pass("Facebook_Icon_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Facebook_Icon_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 44, enabled = true)
   	public void ClickonFacebook_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Facebook_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonFacebook_Icon_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.facebook.com/raffolux/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 43, enabled = true)
   	public void VerifyTwitter_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Twitter_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateTwitter_Icon_Logo();
		 if(flag == true)
		 {
			 test.pass("Twitter_Icon_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Twitter_Icon_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 44, enabled = true)
   	public void ClickonTwitter_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Twitter_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonTwitter_Icon_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://twitter.com/raffolux/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 45, enabled = true)
   	public void VerifyInstagram_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Instagram_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateInstagram_Icon_Logo();
		 if(flag == true)
		 {
			 test.pass("Instagram_Icon_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Instagram_Icon_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 46, enabled = true)
   	public void ClickonInstagram_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Instagram_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonInstagram_Icon_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.instagram.com/raffolux/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 47, enabled = true)
   	public void VerifyLinkDin_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify LinkDin_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateLinkDin_Icon_Logo();
		 if(flag == true)
		 {
			 test.pass("LinkDin_Icon_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("LinkDin_Icon_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 48, enabled = true)
   	public void ClickonLinkDin_Icon_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the LinkDin_Icon_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonLinkDin_Icon_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.linkedin.com/company/raffolux/about/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 49, enabled = true)
   	public void VerifyGameCare_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify GameCare_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateGameCare_Logo();
		 if(flag == true)
		 {
			 test.pass("GameCare_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("GameCare_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 50, enabled = true)
   	public void ClickonGameCare_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the GameCare_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonGameCare_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.gamcare.org.uk/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 51, enabled = true)
   	public void VerifyBe_GambleAware_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Be_GambleAware_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 boolean flag = profilePop_up.ValidateBe_GambleAware_Logo();
		 if(flag == true)
		 {
			 test.pass("Be_GambleAware_Logo is  Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Be_GambleAware_Logo is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 52, enabled = true)
   	public void ClickonBe_GambleAware_Logo() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Be_GambleAware_Logo").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonBe_GambleAware_Logo();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.begambleaware.org/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl   :"+actualUrl+"is matching with the expectedUrl  :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
}
