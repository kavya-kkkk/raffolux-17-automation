/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.HowCanWe_Help_YouPage;
import com.raffolux.pages.LiveDrawsPage;
import com.raffolux.pages.ProfilePop_up;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.WinnersPage;


/**
 * @author hp
 *
 */
public class HowCanWe_Help_YouPageTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	WinnersPage winnersPage;
	ProfilePop_up profilePop_up;
	LiveDrawsPage liveDrawsPage;
	HowCanWe_Help_YouPage howCanWe_Help_YouPage;
	
	@Test(priority = -1, enabled = true)
   	public void Verify_Navigation_HowCanWe_Help_YouPage() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Navigation_HowCanWe_Help_YouPage").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 /*signInPage = indexPage.ClickOnSigninLink();
  		 homePage = signInPage.Signin(prop.getProperty("uname"), prop.getProperty("pswd"));
  		 profilePop_up = homePage.Click_On_User_profile_Logo();
  		 howCanWe_Help_YouPage = profilePop_up.ClickonHelp_And_FAQS_Slide_Bar_Menu_Link();*/
         
   		 driver.get("https://sandbox.raffolux.com/");
   		 howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/help/";
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
   	public void VerifyHow_Can_We_Help_You_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify How_Can_We_Help_You_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidateHow_Can_We_Help_You_Text();
   		 String expectedText = "How can we help you?";
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
   	public void VerifyPlease_Refere_To_These_Frequently_Asked_Question_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Please_Refere_To_These_Frequently_Asked_Question_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		//howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidatePlease_Refere_To_These_Frequently_Asked_Question_Text();
   		 String expectedText = "Please refer to these frequently asked and answered questions.";
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
   	public void VerifyTop_Questions_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Top_Questions_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidateTop_Questions_Text();
   		 String expectedText = "Top Questions";
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
   	public void VerifyPlaying_the_Raffles_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Playing_the_Raffles_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidatePlaying_the_Raffles_Text();
   		 String expectedText = "Playing the raffles";
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
   	public void VerifyDrawing_the_Winner_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Drawing_the_Winner_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidateDrawing_the_Winner_Text();
   		 String expectedText = "Drawing the winners";
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
   	
   	@Test(priority = 5, enabled = true)
   	public void VerifyPrizes_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Prizes_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidatePrizes_Text();
   		 String expectedText = "Prizes";
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
   	
	@Test(priority = 6, enabled = true)
   	public void VerifyCharity_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Charity_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidateCharity_Text();
   		 String expectedText = "Charity";
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
	
	@Test(priority = 7, enabled = true)
   	public void VerifyPayment_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Payment_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidatePayment_Text();
   		 String expectedText = "Payment";
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
	
	@Test(priority = 8, enabled = true)
   	public void VerifyAccount_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Account_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 String actualText = howCanWe_Help_YouPage.ValidateAccount_Text();
   		 String expectedText = "Accounts";
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
	
	//WebElements which are present under the "Top questions" section..
	//How_Do_I_Enter_Raffle_dropdown
	
	@Test(priority = 9, enabled = true)
   	public void Verify_How_Do_I_Enter_Raffle_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify How_Do_I_Enter_Raffle_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Do_I_Enter_Raffle_dropdown();
		 if(flag == true)
		 {
			 test.pass("How_Do_I_Enter_Raffle_dropdown is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("How_Do_I_Enter_Raffle_dropdown is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 10, enabled = true)
   	public void ClickonHow_Do_I_Enter_Raffle_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_I_Enter_Raffle_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 howCanWe_Help_YouPage.ClickonHow_Do_I_Enter_Raffle_dropdown();
   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Do_I_Enter_Raffle_Text_Block();
		 if(flag == true)
		 {
			 test.pass("How_Do_I_Enter_Raffle_Text_Block is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("How_Do_I_Enter_Raffle_Text_Block is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 driver.navigate().refresh();
    }
	
    @Test(priority = 11, enabled = true)
   	public void Verify_Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
 		 howCanWe_Help_YouPage.ClickonHow_Do_I_Enter_Raffle_dropdown();
 		 Thread.sleep(2000);
   		 boolean flag =  howCanWe_Help_YouPage.ValidateFacebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown();
		 if(flag == true)
		 {
			 test.pass("Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
    
    @Test(priority = 12, enabled = true)
   	public void Clikcon_Facebook_Link() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clikcing the  Facebook_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
 		 //howCanWe_Help_YouPage.ClickonHow_Do_I_Enter_Raffle_dropdown();
   		 howCanWe_Help_YouPage.ClickonFacebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown();
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://m.facebook.com/raffolux/";
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
    
    //Who_Can_Play_With_Raffolux_dropdown
    
    @Test(priority = 13, enabled = true)
   	public void Verify_Who_Can_Play_With_Raffolux_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify Who_Can_Play_With_Raffolux_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 boolean flag =  howCanWe_Help_YouPage.ValidateWho_Can_Play_With_Raffolux_dropdown();
		 if(flag == true)
		 {
			 test.pass("Who_Can_Play_With_Raffolux_dropdown is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("Who_Can_Play_With_Raffolux_dropdown is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
    }
	
	@Test(priority = 14, enabled = true)
   	public void ClickonWho_Can_Play_With_Raffolux_dropdown() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify by clicking the Who_Can_Play_With_Raffolux_dropdown").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
   		 howCanWe_Help_YouPage.ClickonWho_Can_Play_With_Raffolux_dropdown();
   		 boolean flag = howCanWe_Help_YouPage.ValidateTo_Play_Raffolux_You_Must_Be_Eighteen_Text();
		 if(flag == true)
		 {
			 test.pass("To_Play_Raffolux_You_Must_Be_Eighteen_Text is Displayed Successfully "+ flag);
		 }
		 else
		 {
			 test.fail("To_Play_Raffolux_You_Must_Be_Eighteen_Text is not Displayed  "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 driver.navigate().refresh();
		 
    }
	
	//How_Is_The_Winner_Selected_dropdown
	
	    @Test(priority = 15, enabled = true)
	   	public void Verify_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
	   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Is_The_Winner_Selected_dropdown();
			 if(flag == true)
			 {
				 test.pass("How_Is_The_Winner_Selected_dropdown is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("How_Is_The_Winner_Selected_dropdown is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
		
		@Test(priority = 16, enabled = true)
	   	public void ClickonHow_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clicking the How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		
	   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Is_The_Winner_Selected_Text_Block();
			 if(flag == true)
			 {
				 test.pass("How_Is_The_Winner_Selected_Text_Block is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("How_Is_The_Winner_Selected_Text_Block is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
			 driver.navigate().refresh();
	    }
		
		@Test(priority = 17, enabled = true)
	   	public void Verify_Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 boolean flag =  howCanWe_Help_YouPage.ValidateFacebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown();
			 if(flag == true)
			 {
				 test.pass("Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
	    
	    @Test(priority = 18, enabled = true)
	   	public void Clikcon_Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clikcing the  Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 howCanWe_Help_YouPage.ClickonFacebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown();
	   		 String actualUrl = driver.getCurrentUrl();
	   		 String expectedUrl = "https://www.facebook.com/raffolux/";
	   		 if(actualUrl.equals(expectedUrl))
	   		 {
	   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
	   		 }
	   		 else
	   		 {
	   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
	   		driver.navigate().refresh();
	    }
	    
	    @Test(priority = 19, enabled = true)
	   	public void Verify_Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 boolean flag =  howCanWe_Help_YouPage.ValidateSmart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown();
			 if(flag == true)
			 {
				 test.pass("Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
	    
	    @Test(priority = 20, enabled = true)
	   	public void Clikcon_Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clikcing the  Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   	 	 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 howCanWe_Help_YouPage.ClickonSmart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown();
	   		 String actualUrl = driver.getCurrentUrl();
	   		 String expectedUrl = "https://smartplay.com/";
	   		 if(actualUrl.equals(expectedUrl))
	   		 {
	   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
	   		 }
	   		 else
	   		 {
	   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
	   		driver.navigate().refresh();
	    }
	    
	    @Test(priority = 21, enabled = true)
	   	public void Verify_Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 boolean flag =  howCanWe_Help_YouPage.ValidatePublic_Register_Link_Under_How_Is_The_Winner_Selected_dropdown();
			 if(flag == true)
			 {
				 test.pass("Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
	    
	    @Test(priority = 22, enabled = true)
	   	public void Clikcon_Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clikcing the  Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 howCanWe_Help_YouPage.ClickonPublic_Register_Link_Under_How_Is_The_Winner_Selected_dropdown();
	   		 String actualUrl = driver.getCurrentUrl();
	   		 String expectedUrl = "https://www.random.org/draws/records/?owner=34188";
	   		 if(actualUrl.equals(expectedUrl))
	   		 {
	   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
	   		 }
	   		 else
	   		 {
	   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
	   		driver.navigate().refresh();
	    }
	    
	    @Test(priority = 23, enabled = true)
	   	public void Verify_You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 boolean flag =  howCanWe_Help_YouPage.ValidateYou_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link();
			 if(flag == true)
			 {
				 test.pass("You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
	    
	    @Test(priority = 24, enabled = true)
	   	public void Clikcon_You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clikcing the  You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 //howCanWe_Help_YouPage.ClickonHow_Is_The_Winner_Selected_dropdown();
	   		 howCanWe_Help_YouPage.ClickonYou_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link();
	   		 String actualUrl = driver.getCurrentUrl();
	   		 String expectedUrl = "https://raffolux.com/winners/";
	   		 if(actualUrl.equals(expectedUrl))
	   		 {
	   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
	   		 }
	   		 else
	   		 {
	   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
	   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
	   		 }
	   		driver.navigate().refresh();
	    }
	    
	  //When_Is_The_Draw_dropdown
	    
	    @Test(priority = 25, enabled = true)
	   	public void Verify_When_Is_The_Draw_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify When_Is_The_Draw_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhen_Is_The_Draw_dropdown();
			 if(flag == true)
			 {
				 test.pass("When_Is_The_Draw_dropdown is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("When_Is_The_Draw_dropdown is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
	    }
		
		@Test(priority = 26, enabled = true)
	   	public void ClickonWhen_Is_The_Draw_dropdown() throws Throwable
	   	{
	   		 ExtentTest test = extent.createTest("Verify by clicking the When_Is_The_Draw_dropdown").assignAuthor("Dharma")
	   				.assignCategory("Functional testing").assignDevice("Windows");
	   		 
	   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
	   		 howCanWe_Help_YouPage.ClickonWhen_Is_The_Draw_dropdown();
	   		 boolean flag = howCanWe_Help_YouPage.ValidateWhen_Is_The_Draw_Under_The_Top_Questions_Text_Block();
			 if(flag == true)
			 {
				 test.pass("When_Is_The_Draw_Under_The_Top_Questions_Text_Block is Displayed Successfully "+ flag);
			 }
			 else
			 {
				 test.fail("When_Is_The_Draw_Under_The_Top_Questions_Text_Block is not Displayed  "+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
			 driver.navigate().refresh();
	    }
		
		 @Test(priority = 27, enabled = true)
		   	public void Verify_When_Is_The_Draw_Facebook_Page_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify When_Is_The_Draw_Facebook_Page_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 


		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
		   		 howCanWe_Help_YouPage.ClickonWhen_Is_The_Draw_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhen_Is_The_Draw_Facebook_Page_link();
				 if(flag == true)
				 {
					 test.pass("When_Is_The_Draw_Facebook_Page_link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("When_Is_The_Draw_Facebook_Page_link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
		    
		    @Test(priority = 28, enabled = true)
		   	public void Clikcon_When_Is_The_Draw_Facebook_Page_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clikcing the  When_Is_The_Draw_Facebook_Page_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");


		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
		   		 howCanWe_Help_YouPage.ClickonWhen_Is_The_Draw_dropdown();
		   		 howCanWe_Help_YouPage.ClickonWhen_Is_The_Draw_Facebook_Page_link();
		   		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://www.facebook.com/raffolux/";
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
		    
		    @Test(priority = 29, enabled = true)
		   	public void Verify_What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");


		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown();
				 if(flag == true)
				 {
					 test.pass("What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 30, enabled = true)
		   	public void ClickonWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");


		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
		   		 howCanWe_Help_YouPage.ClickonWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block();
				 if(flag == true)
				 {
					 test.pass("What_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("What_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			//WebElements which are present under the "Playing the Raffles" section..
			//How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown
			// @Test(priority = 15, enabled = false)
			@Test(priority = 31, enabled = true)
		   	public void Verify_How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Many_Tickets_Can_Buy_ForA_Raffle_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 32, enabled = true)
		   	public void ClickonHow_Many_Tickets_Can_Buy_ForA_Raffle_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();
		  		 howCanWe_Help_YouPage.ClickonHow_Many_Tickets_Can_Buy_ForA_Raffle_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			//How_Long_Do_Raffles_Last_dropdown
			
			@Test(priority = 33, enabled = true)
		   	public void Verify_How_Long_Do_Raffles_Last_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Long_Do_Raffles_Last_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Long_Do_Raffles_Last_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Long_Do_Raffles_Last_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Long_Do_Raffles_Last_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 34, enabled = true)
		   	public void ClickonHow_Long_Do_Raffles_Last_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Long_Do_Raffles_Last_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Long_Do_Raffles_Last_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Long_Do_Raffles_Last_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Long_Do_Raffles_Last_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Long_Do_Raffles_Last_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			//-------------------------------------------------------------------------------------------------------------------------------------------
			//Can_I_get_My_Tickets_Refunded_Text_Block
			@Test(priority = 35, enabled = true)
		   	public void Verify_Can_I_get_My_Tickets_Refunded_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Can_I_get_My_Tickets_Refunded_Text_Block").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateCan_I_get_My_Tickets_Refunded_dropdown();
				 if(flag == true)
				 {
					 test.pass("Can_I_get_My_Tickets_Refunded_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Can_I_get_My_Tickets_Refunded_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 36, enabled = true)
		   	public void ClickonCan_I_get_My_Tickets_Refunded_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Can_I_get_My_Tickets_Refunded_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonCan_I_get_My_Tickets_Refunded_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateCan_I_get_My_Tickets_Refunded_Text_Block();
				 if(flag == true)
				 {
					 test.pass("Can_I_get_My_Tickets_Refunded_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Can_I_get_My_Tickets_Refunded_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			//How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown
			@Test(priority = 37, enabled = true)
		   	public void Verify_How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 38, enabled = true)
		   	public void ClickonHow_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			//How_Do_I_Know_If_I_Have_Won_dropdown
			@Test(priority = 39, enabled = true)
		   	public void Verify_How_Do_I_Know_If_I_Have_Won_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Do_I_Know_If_I_Have_Won_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Do_I_Know_If_I_Have_Won_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Do_I_Know_If_I_Have_Won_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_I_Know_If_I_Have_Won_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 40, enabled = true)
		   	public void ClickonHow_Do_I_Know_If_I_Have_Won_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_I_Know_If_I_Have_Won_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Do_I_Know_If_I_Have_Won_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Do_I_Know_If_I_Have_Won_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_I_Know_If_I_Have_Won_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 41, enabled = true)
		   	public void Verify_How_Do_I_Know_If_I_Have_Won_Facebook_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Do_I_Know_If_I_Have_Won_Facebook_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Do_I_Know_If_I_Have_Won_Facebook_link();
				 if(flag == true)
				 {
					 test.pass("How_Do_I_Know_If_I_Have_Won_Facebook_link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_I_Know_If_I_Have_Won_Facebook_link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 42, enabled = true)
		   	public void ClickonHow_Do_I_Know_If_I_Have_Won_Facebook_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_I_Know_If_I_Have_Won_Facebook_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_Facebook_link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://www.facebook.com/raffolux/";           //https://www.facebook.com/raffolux/
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			@Test(priority = 43, enabled = true)
		   	public void Verify_How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link();
				 if(flag == true)
				 {
					 test.pass("How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 44, enabled = true)
		   	public void ClickonHow_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 // howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 // howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_dropdown();
		  		 howCanWe_Help_YouPage.ClickonHow_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://raffolux.com/winners/";           //https://www.facebook.com/raffolux/
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
			
			@Test(priority = 45, enabled = true)
		   	public void Verify_Where_Can_I_View_My_Tickets_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Where_Can_I_View_My_Tickets_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhere_Can_I_View_My_Tickets_dropdown();
				 if(flag == true)
				 {
					 test.pass("Where_Can_I_View_My_Tickets_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_I_View_My_Tickets_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 46, enabled = true)
		   	public void ClickonWhere_Can_I_View_My_Tickets_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Where_Can_I_View_My_Tickets_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_I_View_My_Tickets_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateWhere_Can_I_View_My_Tickets_Text_Block();
				 if(flag == true)
				 {
					 test.pass("Where_Can_I_View_My_Tickets_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_I_View_My_Tickets_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 47, enabled = true)
		   	public void Verify_Where_Can_I_View_My_Tickets_MyRaffles_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Where_Can_I_View_My_Tickets_MyRaffles_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_I_View_My_Tickets_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhere_Can_I_View_My_Tickets_MyRaffles_link();
				 if(flag == true)
				 {
					 test.pass("Where_Can_I_View_My_Tickets_MyRaffles_link is Displayed Successfully "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 else
				 {
					 test.fail("Where_Can_I_View_My_Tickets_MyRaffles_link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 48, enabled = true)
		   	public void ClickonWhere_Can_I_View_My_Tickets_MyRaffles_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Where_Can_I_View_My_Tickets_MyRaffles_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_I_View_My_Tickets_dropdown();
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_I_View_My_Tickets_MyRaffles_link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://raffolux.com/accounts/login/?next=/myraffles/";           //https://www.facebook.com/raffolux/
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			@Test(priority = 49, enabled = true)
		   	public void Verify_Why_should_I_Play_with_Raffolux_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Why_should_I_Play_with_Raffolux_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhy_should_I_Play_with_Raffolux_dropdown();
				 if(flag == true)
				 {
					 test.pass("Why_should_I_Play_with_Raffolux_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Why_should_I_Play_with_Raffolux_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 50, enabled = true)
		   	public void ClickonWhy_should_I_Play_with_Raffolux_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Why_should_I_Play_with_Raffolux_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonWhy_should_I_Play_with_Raffolux_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateWhy_should_I_Play_with_Raffolux_Text_Block();
				 if(flag == true)
				 {
					 test.pass("Why_should_I_Play_with_Raffolux_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Why_should_I_Play_with_Raffolux_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			//WebElements which are present under the "Drawing the Winners" section..
			//How_Does_The_Instant_Draw_Works_dropdown
			@Test(priority = 51, enabled = true)
		   	public void Verify_How_Does_The_Instant_Draw_Works_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Does_The_Instant_Draw_Works_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Does_The_Instant_Draw_Works_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Does_The_Instant_Draw_Works_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Does_The_Instant_Draw_Works_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 52, enabled = true)
		   	public void ClickonHow_Does_The_Instant_Draw_Works_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Does_The_Instant_Draw_Works_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Does_The_Instant_Draw_Works_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Does_The_Instant_Draw_Works_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Does_The_Instant_Draw_Works_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Does_The_Instant_Draw_Works_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 53, enabled = true)
		   	public void Verify_How_Does_The_Instant_Draw_Works_Public_Registe_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Does_The_Instant_Draw_Works_Public_Registe_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		howCanWe_Help_YouPage.ClickonHow_Does_The_Instant_Draw_Works_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Does_The_Instant_Draw_Works_Public_Registe_link();
				 if(flag == true)
				 {
					 test.pass("How_Does_The_Instant_Draw_Works_Public_Registe_link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Does_The_Instant_Draw_Works_Public_Registe_link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 54, enabled = true)
		   	public void ClickonHow_Does_The_Instant_Draw_Works_Public_Registe_link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Does_The_Instant_Draw_Works_Public_Registe_link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonHow_Does_The_Instant_Draw_Works_dropdown();
		  		 howCanWe_Help_YouPage.ClickonHow_Does_The_Instant_Draw_Works_Public_Registe_link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://www.random.org/draws/records/?owner=34188";          
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			//If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown
			@Test(priority = 55, enabled = true)
		   	public void Verify_If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown();
				 if(flag == true)
				 {
					 test.pass("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 56, enabled = true)
		   	public void ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block();
				 if(flag == true)
				 {
					 test.pass("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 57, enabled = true)
		   	public void Verify_If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		 howCanWe_Help_YouPage.ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link();
				 if(flag == true)
				 {
					 test.pass("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 58, enabled = true)
		   	public void ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown();
		  		 howCanWe_Help_YouPage.ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://raffolux.com/winners/";          
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			//Where_Can_Watch_The_Live_Draws_dropdown
			@Test(priority = 59, enabled = true)
		   	public void Verify_Where_Can_Watch_The_Live_Draws_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Where_Can_Watch_The_Live_Draws_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhere_Can_Watch_The_Live_Draws_dropdown();
				 if(flag == true)
				 {
					 test.pass("Where_Can_Watch_The_Live_Draws_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_Watch_The_Live_Draws_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 60, enabled = true)
		   	public void ClickonWhere_Can_Watch_The_Live_Draws_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Where_Can_Watch_The_Live_Draws_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateWhere_Can_Watch_The_Live_Draws_Text_Block();
				 if(flag == true)
				 {
					 test.pass("Where_Can_Watch_The_Live_Draws_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_Watch_The_Live_Draws_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			@Test(priority = 61, enabled = true)
		   	public void Verify_Where_Can_Watch_The_Live_Draws_Facebook_Page_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Where_Can_Watch_The_Live_Draws_Facebook_Page_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhere_Can_Watch_The_Live_Draws_Facebook_Page_Link();
				 if(flag == true)
				 {
					 test.pass("Where_Can_Watch_The_Live_Draws_Facebook_Page_Link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_Watch_The_Live_Draws_Facebook_Page_Link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 62, enabled = true)
		   	public void ClickonWhere_Can_Watch_The_Live_Draws_Facebook_Page_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Where_Can_Watch_The_Live_Draws_Facebook_Page_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_dropdown();
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_Facebook_Page_Link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://www.facebook.com/raffolux/";          
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			@Test(priority = 63, enabled = true)
		   	public void Verify_Where_Can_Watch_The_Live_Draws_Winners_Page_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Where_Can_Watch_The_Live_Draws_Winners_Page_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_dropdown();
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateWhere_Can_Watch_The_Live_Draws_Winners_Page_Link();
				 if(flag == true)
				 {
					 test.pass("Where_Can_Watch_The_Live_Draws_Winners_Page_Link is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Where_Can_Watch_The_Live_Draws_Winners_Page_Link is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 64, enabled = true)
		   	public void ClickonWhere_Can_Watch_The_Live_Draws_Winners_Page_Link() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the Where_Can_Watch_The_Live_Draws_Winners_Page_Link").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		// howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink();How_Long_Do_Raffles_Last_dropdown
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_dropdown();
		  		 howCanWe_Help_YouPage.ClickonWhere_Can_Watch_The_Live_Draws_Winners_Page_Link();
		  		 String actualUrl = driver.getCurrentUrl();
		   		 String expectedUrl = "https://raffolux.com/winners/";          
		   		 if(actualUrl.equals(expectedUrl))
		   		 {
		   			 test.pass("actualUrl  :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		   		 }
		   		 else
		   		 {
		   			 test.fail("actualUrl  :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
		   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		   		 }
		   		driver.navigate().refresh();
		    }
			
			//WebElements which are present under the "Prizes" section..
			//How_Do_The_Prizes_Get_Delivered_dropdown
			@Test(priority = 65, enabled = true)
		   	public void Verify_How_Do_The_Prizes_Get_Delivered_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify How_Do_The_Prizes_Get_Delivered_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 //howCanWe_Help_YouPage = indexPage.ClickonFooterHelpLink(); 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateHow_Do_The_Prizes_Get_Delivered_dropdown();
				 if(flag == true)
				 {
					 test.pass("How_Do_The_Prizes_Get_Delivered_dropdown is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_The_Prizes_Get_Delivered_dropdown is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 66, enabled = true)
		   	public void ClickonHow_Do_The_Prizes_Get_Delivered_dropdown() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_The_Prizes_Get_Delivered_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		
		  		 howCanWe_Help_YouPage.ClickonHow_Do_The_Prizes_Get_Delivered_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateHow_Do_The_Prizes_Get_Delivered_Text_Block();
				 if(flag == true)
				 {
					 test.pass("How_Do_The_Prizes_Get_Delivered_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("How_Do_The_Prizes_Get_Delivered_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			
			//Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow
			@Test(priority = 67, enabled = true)
		   	public void Verify_Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		   		 boolean flag =  howCanWe_Help_YouPage.ValidateCan_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown();
				 if(flag == true)
				 {
					 test.pass("Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
		    }
			
			@Test(priority = 68, enabled = true)
		   	public void ClickonCan_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdow() throws Throwable
		   	{
		   		 ExtentTest test = extent.createTest("Verify by clicking the How_Do_The_Prizes_Get_Delivered_dropdown").assignAuthor("Dharma")
		   				.assignCategory("Functional testing").assignDevice("Windows");
		   		 
		  		 howCanWe_Help_YouPage.ClickonCan_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown();
		   		 boolean flag = howCanWe_Help_YouPage.ValidateCan_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block();
				 if(flag == true)
				 {
					 test.pass("Can_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block is Displayed Successfully "+ flag);
				 }
				 else
				 {
					 test.fail("Can_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block is not Displayed  "+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
				 driver.navigate().refresh();
		    }
			

}
