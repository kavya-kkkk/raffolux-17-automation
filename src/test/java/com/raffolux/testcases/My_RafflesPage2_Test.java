/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

import com.raffolux.pages.HomePage;
import com.raffolux.pages.MyRafflesPage2;

import com.raffolux.pages.SignInPage;

/**
 * @author hp
 *
 */
public class My_RafflesPage2_Test extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	MyRafflesPage2 myRafflesPage2;
	
	@Test(priority = 0, enabled = true)
	public void Verify_MyRafflesPage_URL() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_MyRafflesPage_URL").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		// driver.get("https://sandbox.raffolux.com/");
		 //signInPage = indexPage.ClickOnSigninLink();
		 //homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 myRafflesPage2  = homePage.Click_On_MyRaffles_Link();
		 String actualUrl =  driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/myraffles/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("_MyRafflesPage_URL   :"+actualUrl+" is matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("_MyRafflesPage_URL   :"+actualUrl+" is not matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 1, enabled = true)
	public void Verify_RaffoluxLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_RaffoluxLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 homePage.Click_On_MyRaffles_Link();
		 boolean flag = myRafflesPage2.Validate_RaffoluxLogo();
		 if(flag == true)
		 {
			 test.pass("RaffoluxLogo Displayed Successfully");
		 }
		 else
		 {
			 test.fail("RaffoluxLogo is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 2, enabled = true)
	public void Verify_By_Clicking_RaffoluxLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_RaffoluxLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.Clickon_RaffoluxLogo();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 3, enabled = true)
	public void Verify_WinnersLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_WinnersLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.ValidateWinnersLink();
		 if(flag == true)
		 {
			 test.pass("WinnersLink Displayed Successfully");
		 }
		 else
		 {
			 test.fail("WinnersLink is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 4, enabled = true)
	public void Verify_By_Clicking_WinnersLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_WinnersLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.Clickon_WinnersLink();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/winners/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 5, enabled = true)
	public void Mouse_Hov_Over_WinnersLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_WinnersLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.Mousehov_Over_WinnersLink();
		 if(flag == true)
		 {
			 test.pass("Successfully mouse hovered on _WinnersLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 
		 }
		 else
		 {
			 test.fail("Unable to mouse hovered on _WinnersLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 6, enabled = true)
	public void Verify_Points_Wallet_On_header_part() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Points_Wallet_On_header_part").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = myRafflesPage2.Validate_Points_Wallet_On_header_part();
		 if(flag == true)
		 {
			 test.pass("Points_Wallet_On_header_part Displayed Successfully");
		 }
		 else
		 {
			 test.fail("Points_Wallet_On_header_part is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 7, enabled = true)
	public void Verify_By_Clicking_Points_Wallet_On_header_part() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_WinnersLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.Clickon_Points_Wallet_On_header_part();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/store/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 8, enabled = true)
	public void Verify_Mytickets_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Mytickets_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = myRafflesPage2.Validate_Points_Wallet_On_header_part();
		 if(flag == true)
		 {
			 test.pass("Mytickets_Link Displayed Successfully");
		 }
		 else
		 {
			 test.fail("Mytickets_Link is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 9, enabled = true)
	public void Verify_By_Clicking_Mytickets_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_Mytickets_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Mytickets_Link();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/myraffles/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 10, enabled = true)
	public void Mouse_Hov_Over_Mytickets_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_Mytickets_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.MousehovOver_Mytickets_Link();
		 if(flag == true)
		 {
			 test.pass("Successfully mouse hovered on Mytickets_Link");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 
		 }
		 else
		 {
			 test.fail("Unable to mouse hovered on Mytickets_Link");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 11, enabled = true)
	public void Verify_CartNotificationLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_CartNotificationLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = myRafflesPage2.Validate_CartNotificationLogo();
		 if(flag == true)
		 {
			 test.pass("CartNotificationLogo Displayed Successfully");
		 }
		 else
		 {
			 test.fail("CartNotificationLogo is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 12, enabled = true)
	public void Verify_By_Clicking_CartNotificationLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_CartNotificationLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_CartNotificationLogo();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/cart/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 13, enabled = true)
	public void Verify_ProfileLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_ProfileLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.Validate_ProfileLogo();
		 if(flag == true)
		 {
			 test.pass("ProfileLogo Displayed Successfully");
		 }
		 else
		 {
			 test.fail("ProfileLogo is not Displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 14, enabled = true)
	public void Verify_By_Clicking_On_ProfileLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_On_ProfileLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_ProfileLogo();
		 boolean flag = myRafflesPage2.Validate_Side_Bar_Menu_Content_In_Profile_Section();
		 if(flag == true)
		 {
			 test.pass("Side_Bar_Menu_Content_In_Profile_Section displayed after clicking the profile option");
		 }
		 else
		 {
			 test.fail("Side_Bar_Menu_Content_In_Profile_Section is not displayed after clicking the profile option");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 15, enabled = true)
	public void Verify_MyRaffles_TItle_Text() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_MyRaffles_TItle_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String ActualText = myRafflesPage2.Validate_MyRaffles_TItle_Text();
		 String ExpectedText = "My raffles";
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 16, enabled = true)
	public void Verify_Left_Arrow_Symbol() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Left_Arrow_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.Validate_Left_Arrow_Symbol();
		 if(flag == true)
		 {
			 test.pass("Left_Arrow_Symbol is displayed successfully  :"+flag);
		 }
		 else
		 {
			 test.fail("Left_Arrow_Symbol is not displayed successfully  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 17, enabled = true)
	public void Verify_By_Clicking_Left_Arrow_Symbol() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_Left_Arrow_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Left_Arrow_Symbol();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/";
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 18, enabled = true)
	public void Verify_MyRaffles_Tab_Text() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_MyRaffles_Tab_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String ActualText = myRafflesPage2.Validate_MyRaffles_Tab_Text();
		 String ExpectedText = "MY RAFFLES";
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	//
	
	@Test(priority = 19, enabled = true)
	public void Verify_Active_Scetion_tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Active_Scetion_tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 String ActualText = myRafflesPage2.Validate_Active_Scetion_tab();
		 String ExpectedText = "Active";
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 20, enabled = true)
	public void Verify_By_Clicking_Active_Scetion_tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_Active_Scetion_tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.ClickOn_Active_Section_tab();
		 if(flag == true)
		 {
			 test.pass("Successfully clicked on the Active tab");
			 boolean flag1 = myRafflesPage2.Validate_One_Of_The_Selected_Active_Raffle_Description();
			 if(flag1 == true)
			 {
				 test.pass("After clicking the active tab, One_Of_The_Selected_Active_Raffle_Description is displayed");
				 test.info("There are some active raffles");
			 }
			 else
			 {
				 test.fail("After clicking the active tab, There are no active raffles");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 String ActualText = myRafflesPage2.Validate_You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text();
                 String ExpectedText = "";   //-----------------------------------------------------------------
				 if(ActualText.equals(ExpectedText))
				 {
					 test.pass("ActualText :" +ActualText+ "is matching with the ExpectedText  :"+ExpectedText);
				 }
				 else
				 {
					 test.fail("ActualText :" +ActualText+ "is not matching with the ExpectedText  :"+ExpectedText);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
			 }
		 }
		 else
		 {
			 test.fail("Unable to click on the active tab");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 21, enabled = true)
	public void Verify_Ended_Scetion_tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Ended_Scetion_tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String ActualText = myRafflesPage2.Validate_Ended_Scetion_tab();
		 String ExpectedText = "Ended";
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 22, enabled = true)
	public void Verify_By_Clicking_Ended_Scetion_tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_Ended_Scetion_tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = myRafflesPage2.ClickOn_Ended_Section_tab();
		 if(flag == true)
		 {
			 test.pass("Successfully clicked on the Ended tab");
			 boolean flag1 = myRafflesPage2.Validate_One_Of_The_Selected_Ended_Raffle_Description();
			 if(flag1 == true)
			 {
				 test.pass("After clicking the Ended tab, One_Of_The_Selected_Ended_Raffle_Description is displayed");
				 test.info("There are some Ended raffles");
			 }
			 else
			 {
				 test.fail("After clicking the Ended tab, There are no Ended raffles");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 String ActualText = myRafflesPage2.Validate_You_Have_not_Entered_Any_Raffles_Yet_Text_Under_Ended_Tab();
				 String ExpectedText = "You haven't entered any raffles yet.";
				 if(ActualText.equals(ExpectedText))
				 {
					 test.pass("ActualText :" +ActualText+ "is matching with the ExpectedText  :"+ExpectedText);
				 }
				 else
				 {
					 test.fail("ActualText :" +ActualText+ "is not matching with the ExpectedText  :"+ExpectedText);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
			 }
		 }
		 else
		 {
			 test.fail("Unable to click on the active tab");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	//@Test(priority = 23, enabled = true)
	public void Verify_You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String ActualText = myRafflesPage2.Validate_You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text();
		 String ExpectedText = ""; //------------------------------------------------------------------
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	//@Test(priority = 24, enabled = true)
	public void Verify_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Click_here_to_see_whats_On_Text_Under_Active_Tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String ActualText = myRafflesPage2.Validate_Click_here_to_see_whats_On_Text_Under_Active_Tab();
		 String ExpectedText = ""; //-----------------------------------------------------
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
//	@Test(priority = 25, enabled = true)
	public void Verify_By_Clicking_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_Click_here_to_see_whats_On_Text_Under_Active_Tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Click_here_to_see_whats_On_Text_Under_Active_Tab();
		 String ActualUrl = driver.getCurrentUrl();
		 String ExpectedUrl = "https://sandbox.raffolux.com/";
		 if(ActualUrl.equals(ExpectedUrl))  //-------------------------------------
		 {
			 test.pass("ActualUrl :" + ActualUrl +"is matching with the ExpectedUrl  :"+ExpectedUrl);
		 }
		 else
		 {
			 test.fail("ActualUrl :" + ActualUrl +"is not matching with the ExpectedUrl  :"+ExpectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	//@Test(priority = 26, enabled = true)
	public void Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = myRafflesPage2.Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab();
		 if(flag == true)
		 {
			 test.pass("Successfully Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("Unable to Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 27, enabled = true)
	public void Verify_One_Of_The_Selected_Active_Raffle_Description() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_One_Of_The_Selected_Active_Raffle_Description").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_One_Of_The_Selected_Active_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("One_Of_The_Selected_Active_Raffle_Description is displayed successfully");
		 }
		 else 
		 {
			 test.fail("One_Of_The_Selected_Active_Raffle_Description is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 28, enabled = true)
	public void Verify_By_Clicking_One_Of_The_Selected_Active_Raffle_Description() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_One_Of_The_Selected_Active_Raffle_Description").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Clickon_One_Of_The_Selected_Active_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("One_Of_The_Selected_Active_Raffle_Description is displayed successfully");
			 boolean flag1 = myRafflesPage2.Validate_List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle();
			 if(flag1 == true)
			 {
				 test.pass("List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle are displayed successfully");
			 }
			 else
			 {
				 test.fail("List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle are not displayed");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
		 }
		 else 
		 {
			 test.fail("There are no Active Raffles");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 29, enabled = true)
	public void Verify_Selected_Active_Raffle_Photo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Selected_Active_Raffle_Photo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_Selected_Active_Raffle_Photo();
		 if(flag == true)
		 {
			 test.pass("Selected_Active_Raffle_Photo is displayed successfully");
		 }
		 else 
		 {
			 test.fail("Selected_Active_Raffle_Photo is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 30, enabled = true)
	public void Verify_Selected_Active_Raffle_Description() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_Selected_Active_Raffle_Description").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_Selected_Active_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("Selected_Active_Raffle_Description is displayed successfully");
		 }
		 else 
		 {
			 test.fail("Selected_Active_Raffle_Description is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 31, enabled = true)
	public void Verify_View_More_Text_On_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_View_More_Text_On_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_View_More_Text_On_Active_Raffle();
		 if(flag == true)
		 {
			 test.pass("_View_More_Text_On_Active_Raffle is displayed successfully");
		 }
		 else 
		 {
			 test.fail("_View_More_Text_On_Active_Raffle is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 32, enabled = true)
	public void Verify_By_Clicking_View_More_Text_On_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_View_More_Text_On_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 String ActualText = myRafflesPage2.Validate_Title_Of_One_Of_the_Selected_Active_Raffle();
		 myRafflesPage2.ClickOn_View_More_Text_On_Active_Raffle();
		 String ExpectedText = myRafflesPage2.Validate_Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage();
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else 
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 33, enabled = true)
	public void Verify_View_More_Farward_Symbol_On_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_View_More_Farward_Symbol_On_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 try
		 {
			 boolean flag = myRafflesPage2.Validate_View_More_Farward_Symbol_On_Active_Raffle();
			 if(flag == true)
			 {
				 test.pass("_View_More_Farward_Symbol_On_Active_Raffle is displayed successfully");
			 }
			 else 
			 {
				 test.fail("_View_More_Farward_Symbol_On_Active_Raffle is not displayed");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("=================================== Exception Alert ===================================");
			 System.out.println(e.getStackTrace());
		 } 
	}
	
	@Test(priority = 34, enabled = true)
	public void Verify_By_Clicking_View_More_Farward_Symbol_On_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_View_More_Farward_Symbol_On_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 String ActualText = myRafflesPage2.Validate_Title_Of_One_Of_the_Selected_Active_Raffle();
		 myRafflesPage2.ClickOn_View_More_Farward_Symbol_On_Active_Raffle();
		 String ExpectedText = myRafflesPage2.Validate_Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage();
		 if(ActualText.equals(ExpectedText))
		 {
			 test.pass("ActualText :" + ActualText +"is matching with the ExpectedText  :"+ExpectedText);
		 }
		 else 
		 {
			 test.fail("ActualText :" + ActualText +"is not matching with the ExpectedText  :"+ExpectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 homePage.Click_On_MyRaffles_Link();
	}
	
	@Test(priority = 35, enabled = true)
	public void Verify_List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Clickon_One_Of_The_Selected_Active_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("User Successfully clicked on the One_Of_The_Selected_Active_Raffle_Description");
			 boolean flag1 = myRafflesPage2.Validate_List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle();
			 if(flag1 == true)
			 {
				 test.pass("List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle are displayed successfully");
			 }
			 else
			 {
				 test.fail("List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle are not displayed ");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
		 }
		 else 
		 {
			 test.fail("Unable to Click on One_Of_The_Selected_Active_Raffle_Description");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 36, enabled = true)
	public void Verify_One_Of_The_Ticket_number_Of_Selected_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_One_Of_The_Ticket_number_Of_Selected_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_One_Of_The_Ticket_number_Of_Selected_Active_Raffle();
		 if(flag == true)
		 {
			 test.pass("One_Of_The_Ticket_number_Of_Selected_Active_Raffle is displayed successfully");
		 }
		 else 
		 {
			 test.fail("One_Of_The_Ticket_number_Of_Selected_Active_Raffle is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 37, enabled = true)
	public void Verify_The_EndLine_Under_The_One_Of_The_Active_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_The_EndLine_Under_The_One_Of_The_Active_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Active_Section_tab();
		 boolean flag = myRafflesPage2.Validate_The_EndLine_Under_The_One_Of_The_Active_Raffle();
		 if(flag == true)
		 {
			 test.pass("The_EndLine_Under_The_One_Of_The_Active_Raffle is displayed successfully");
		 }
		 else 
		 {
			 test.fail("The_EndLine_Under_The_One_Of_The_Active_Raffle is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 38, enabled = true)
	public void Verify_List_Of_Ended_Raffles_In_The_Ended_Tab() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_List_Of_Ended_Raffles_In_The_Ended_Tab").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 myRafflesPage2.ClickOn_Ended_Section_tab();
		 boolean flag = myRafflesPage2.Validate_List_Of_Ended_Raffles_In_The_Ended_Tab();
		 if(flag == true)
		 {
			 test.pass("List_Of_Ended_Raffles_In_The_Ended_Tab are displayed successfully");
		 }
		 else 
		 {
			 test.fail("List_Of_Ended_Raffles_In_The_Ended_Tab are not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 39, enabled = true)
	public void Verify_One_Of_The_Selected_Ended_Raffle_Description() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_One_Of_The_Selected_Ended_Raffle_Description").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Ended_Section_tab();
		 boolean flag = myRafflesPage2.Validate_One_Of_The_Selected_Ended_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("One_Of_The_Selected_Ended_Raffle_Description is diosplayed successfully");
		 }
		 else 
		 {
			 test.fail("One_Of_The_Selected_Ended_Raffle_Description is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 40, enabled = true)
	public void Verify_By_Clicking_One_Of_The_Selected_Ended_Raffle_Description() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_One_Of_The_Selected_Ended_Raffle_Description").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 myRafflesPage2.ClickOn_Ended_Section_tab();
		 boolean flag = myRafflesPage2.Clickon_One_Of_The_Selected_Ended_Raffle_Description();
		 if(flag == true)
		 {
			 test.pass("One_Of_The_Selected_Ended_Raffle_Description is displayed successfully");
			 boolean flag1 = myRafflesPage2.Validate_List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle();
			 if(flag1 == true)
			 {
				 test.pass("List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle are displayed successfully");
			 }
			 else
			 {
				 test.fail("List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle are not displayed");
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
		 }
		 else 
		 {
			 test.fail("There are no Active Raffles");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
}
