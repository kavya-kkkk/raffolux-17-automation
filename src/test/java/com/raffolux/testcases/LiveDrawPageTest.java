/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.LiveDrawsPage;
import com.raffolux.pages.ProfilePop_up;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.WinnersPage;

/**
 * @author hp
 *
 */
public class LiveDrawPageTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	WinnersPage winnersPage;
	ProfilePop_up profilePop_up;
	LiveDrawsPage liveDrawsPage;
	
	
	@Test(priority = -1, enabled = true)
   	public void Verify_Navigation_ToLiveDrawPage() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Navigation_ToLiveDrawPage").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/livedraws/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 0, enabled = true)
   	public void VerifyLive_Draws_Page_Title() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Live_Draws_Page_Title").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateLive_Draws_Page_Title();
   		 String expectedText = "Live Draws";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 1, enabled = true)
   	public void Verify_Watch_All_The_Raffolux_LiveDraws_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Watch_All_The_Raffolux_LiveDraws_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateWatch_All_The_Raffolux_LiveDraws_Text();
   		 String expectedText = "Watch all the Raffolux live draws here! ";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 2, enabled = true)
   	public void Verify_Past_Draws_Option() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Past_Draws_Option").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidatePast_Draws_Option();
   		 String expectedText = "Past draws";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 3, enabled = true)
   	public void Verify_Show_Draws_For_text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Show_Draws_For_text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateShow_Draws_For_text();
   		 String expectedText = "Past draws";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 4, enabled = true)
   	public void Verify_Show_Draws_For_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Show_Draws_For_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 boolean flag =  liveDrawsPage.ValidateShow_Draws_For_dropdown();
		 if(flag == true)
		 {
			 test.pass("Show_Draws_For_dropdown is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Show_Draws_For_dropdown is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 5, enabled = true)
   	public void Verify_By_Selecting_One_Option_from_the_Show_Draws_For_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify By_Selecting_One_Option_from_the_Show_Draws_For_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 boolean flag =  liveDrawsPage.Select_Any_Of_The_Option_From_Show_Draws_For_dropdown();
   		 
		 if(flag == true)
		 {
			 test.pass("Successfully selected option from the Show_Draws_For_dropdown  :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 String actualText = liveDrawsPage.ValidateDrawn_Date_and_time_Text();
	   		 String expectedText = "Nov. 30, 2021, 5:20 p.m.";
	   		 if(actualText.equals(expectedText))
	   		 {
	   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
	   		 else
	   		 {
	   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
			 
		 }
		 else
		 {
			 test.fail("Show_Draws_For_dropdown is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 6, enabled = true)
   	public void Verify_One_of_the_Past_draw() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify One_of_the_Past_draw").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 boolean flag =  liveDrawsPage.ValidateOne_of_the_Past_draw();
		 if(flag == true)
		 {
			 test.pass("One_of_the_Past_draw is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("One_of_the_Past_draw is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	
	@Test(priority = 7, enabled = true)
   	public void ClickonS_One_of_the_Past_draw() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the One_of_the_Past_draw").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateOne_of_The_Live_Draw_Video();
		 if(flag == true)
		 {
			 test.pass("One_of_the_Past_draw is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("One_of_the_Past_draw is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
   	
   	@Test(priority = 8, enabled = true)
   	public void Verify_One_of_the_Past_Live_draw_Card_Image() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the One_of_the_Past_Live_draw_Card_Image").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateOne_of_the_Past_Live_draw_Card_Image();
		 if(flag == true)
		 {
			 test.pass("One_of_the_Past_Live_draw_Card_Image is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("One_of_the_Past_Live_draw_Card_Image is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
   	
   	@Test(priority = 9, enabled = true)
   	public void Verify_Drawn_Date_and_time_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Drawn_Date_and_time_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateDrawn_Date_and_time_Text();
   		 String expectedText = "April 30, 2021, 7:12 p.m.";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
   	
	@Test(priority = 10, enabled = true)
   	public void Verify_Title_Of_The_Past_drawn_Raffle() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Title_Of_The_Past_drawn_Raffle").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateTitle_Of_The_Past_drawn_Raffle();
   		 String expectedText = "Three Luxury Nights in Rome";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 11, enabled = true)
   	public void Verify_Total_no_of_days_of_Drawn() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Total_no_of_days_of_Drawn").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 String actualText = liveDrawsPage.ValidateTotal_no_of_days_of_Drawn();
   		 String expectedText ="1 year, 6 months ago ";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 12, enabled = true)
   	public void Verify_Raffle_Ticket_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Raffle_Ticket_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateRaffle_Ticket_Symbol();
		 if(flag == true)
		 {
			 test.pass("Raffle_Ticket_Symbol is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Raffle_Ticket_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 13, enabled = true)
   	public void Verify_Raffle_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Raffle_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateRaffle_Link();
		 if(flag == true)
		 {
			 test.pass("Raffle_Link is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Raffle_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 14, enabled = true)
   	public void Clikcon_Raffle_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clikcing the  _Raffle_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 liveDrawsPage.ClickonRaffle_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/holiday/raffle/456/Roma_Luxury/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 15, enabled = true)
   	public void Verify_Facebook_Logo_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Facebook_Logo_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateFacebook_Logo_Symbol();
		 if(flag == true)
		 {
			 test.pass("Facebook_Logo_Symbol is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Facebook_Logo_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 16, enabled = true)
   	public void Verify_Facebook_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Facebook_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateFacebook_Link();
		 if(flag == true)
		 {
			 test.pass("Facebook_Link is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Facebook_Link is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 17, enabled = true)
   	public void Clikcon_Facebook_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clikcing the  Facebook_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 liveDrawsPage.ClickonFacebook_Link();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.facebook.com/318953262057908/videos/322037036115341";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 18, enabled = true)
   	public void Verify_One_of_The_Live_Draw_Video() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify One_of_The_Live_Draw_Video").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateOne_of_The_Live_Draw_Video();
		 if(flag == true)
		 {
			 test.pass("One_of_The_Live_Draw_Video is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("One_of_The_Live_Draw_Video is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 19, enabled = true)
   	public void Verify_Video_Closing_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Video_Closing_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 //liveDrawsPage.ClickonOne_of_the_Past_draw();
   		 boolean flag =  liveDrawsPage.ValidateVideo_Closing_Symbol();
		 if(flag == true)
		 {
			 test.pass("Video_Closing_Symbol is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Video_Closing_Symbol is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 20, enabled = true)
   	public void Clikcon_Video_Closing_Symbol() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clikcing the  Video_Closing_Symbol").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 signInPage = indexPage.ClickOnSigninLink();
   		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
   		 profilePop_up = homePage.Click_On_User_profile_Logo();
   		 liveDrawsPage = profilePop_up.ClickonLiveDraws_Slide_Bar_Menu_Link();
   		 liveDrawsPage.ClickonVideo_Closing_Symbol();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://www.facebook.com/318953262057908/videos/322037036115341";
   		 if(actualUrl.equals(expectedUrl))
   		 {
   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
   		 }
   		 else
   		 {
   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
}
