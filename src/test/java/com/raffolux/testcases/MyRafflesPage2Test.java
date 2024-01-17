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
public class MyRafflesPage2Test extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	MyRafflesPage2 myRafflesPage2;
	
	@Test(priority = -1, enabled = true)
	public void VerifyMyRafflePage2Url() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the MyRafflePage2Url").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualUrl =  driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/myraffles/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("MyRafflePage2Url   :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("MyRafflePage2Url   :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 0, enabled = true)
	public void VerifyMyRaffleTitle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the MyRaffleTitle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualtitle =  myRafflesPage2.ValidateMyRaffleTitle();
		 String expectedtitle = "My Raffles";
		 if(actualtitle.equals(expectedtitle))
		 {
			 test.pass("MyRafflePageTitle is :"+actualtitle+"matching with the expectedTitle   :"+expectedtitle);
		 }
		 else
		 {
			 test.fail("MyRafflePageTitle   :"+actualtitle+"is not matching with the expectedTitle   :"+expectedtitle);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 1, enabled = true)
	public void VerifyYouCurrentlyHavenoTicketsInAnyActiveRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the YouCurrentlyHavenoTicketsInAnyActiveRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText =  myRafflesPage2.ValidateYouCurrentlyHavenoTicketsInAnyActiveRaffles();
		 String expectedText = "My Raffles";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YouCurrentlyHavenoTicketsInAnyActiveRaffles Text is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YouCurrentlyHavenoTicketsInAnyActiveRaffles Text   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 2, enabled = true)
	public void VerifyClickHereToSeeWhatsOnLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ClickHereToSeeWhatsOnLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText =  myRafflesPage2.ValidateClickHereToSeeWhatsOnLink();
		 String expectedText = "Click here to see what's on.";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("ClickHereToSeeWhatsOnLink Text is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLink Text   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 3, enabled = true)
	public void ClickonClickHereToSeeWhatsOnLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the ClickHereToSeeWhatsOnLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonClickHereToSeeWhatsOnLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("ClickHereToSeeWhatsOnLink actualUrl is :"+actualUrl+"matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLink actualUrl   :"+actualUrl+" not  matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 4, enabled = true)
	public void VerifyActiveRafflesSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ActiveRafflesSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateActiveRafflesSection();
		 String expectedText = "Active raffles";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("ActiveRafflesSection actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("ActiveRafflesSection actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 5, enabled = true)
	public void VerifyRecentlyEndedRafflesSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RecentlyEndedRafflesSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateRecentlyEndedRafflesSection();
		 String expectedText = "Recently ended raffles";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("RecentlyEndedRafflesSection actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("RecentlyEndedRafflesSection actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 6, enabled = true)
	public void VerifyYouareNotCurrentlyEnteredIntoAnyActiveRafflesText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the YouareNotCurrentlyEnteredIntoAnyActiveRafflesText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateYouareNotCurrentlyEnteredIntoAnyActiveRafflesText();
		 String expectedText = "Active raffles";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YouareNotCurrentlyEnteredIntoAnyActiveRafflesText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YouareNotCurrentlyEnteredIntoAnyActiveRafflesText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 7, enabled = true)
	public void VerifyYouhaveNotEnteredAnyRafflesYetTextUnderRecentlyEndedRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the YouhaveNotEnteredAnyRafflesYetTextUnderRecentlyEndedRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateYouhaveNotEnteredAnyRafflesYetTextUnderRecentlyEndedRaffles();
		 String expectedText = "You haven't entered any raffles yet.";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YouhaveNotEnteredAnyRafflesYetTextUnderRecentlyEndedRaffles actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YouhaveNotEnteredAnyRafflesYetTextUnderRecentlyEndedRaffles actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 8, enabled = true)
	public void VerifyClickHereToSeeWhatsOnLinkUnderActiveRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ClickHereToSeeWhatsOnLinkUnderActiveRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateClickHereToSeeWhatsOnLinkUnderActiveRaffles();
		 String expectedText = "Click here to see what's on.";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("ClickHereToSeeWhatsOnLinkUnderActiveRaffles actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLinkUnderActiveRaffles actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 9, enabled = true)
	public void VerifyClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles();
		 String expectedText = "Click here to see what's on.";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 10, enabled = true)
	public void ClickonClickHereToSeeWhatsOnLinkUnderActiveRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by cliking the ClickHereToSeeWhatsOnLinkUnderActiveRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonClickHereToSeeWhatsOnLinkUnderActiveRaffles();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/";        //
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("ClickHereToSeeWhatsOnLinkUnderActiveRaffles actualUrl is :"+actualUrl+"matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLinkUnderActiveRaffles actualUrl   :"+actualUrl+" not  matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 11, enabled = true)
	public void ClickonClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/";        //
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles actualUrl is :"+actualUrl+"matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("ClickHereToSeeWhatsOnLinkUnderRecentlyEndedRaffles actualUrl   :"+actualUrl+" not  matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifyYouCurrentlyHaveTicketsInText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the YouCurrentlyHaveTicketsInText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateYouCurrentlyHaveTicketsInText();
		 String expectedText = "You currently have tickets in ";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YouCurrentlyHaveTicketsInText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YouCurrentlyHaveTicketsInText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 13, enabled = true)
	public void VerifyActiveRafflesLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ActiveRafflesLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateActiveRafflesLink();
		 String expectedText = "2 active raffles";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("ActiveRafflesLink actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("ActiveRafflesLink actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 14, enabled = true)
	public void VerifySelectedRaffle1UnderTheActiveraffleSection1() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffle1UnderTheActiveraffleSection1").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 boolean flag = myRafflesPage2.ValidateSelectedRaffle1UnderTheActiveraffleSection1();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffle1UnderTheActiveraffleSection1  is Successfully Displayed:"+ flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffle1UnderTheActiveraffleSection1    is not Displayed:" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 15, enabled = true)
	public void VerifySelectedRaffle1UnderTheActiveraffleSection2() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffle1UnderTheActiveraffleSection2").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 boolean flag = myRafflesPage2.ValidateSelectedRaffle1UnderTheActiveraffleSection2();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffle1UnderTheActiveraffleSection2  is Successfully Displayed:"+ flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffle1UnderTheActiveraffleSection2    is not Displayed:" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 16, enabled = true)
	public void VerifySelectedRaffle1Image() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffle1Image").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 boolean flag = myRafflesPage2.ValidateSelectedRaffle1Image();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffle1Image  is Successfully Displayed:"+ flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffle1Image    is not Displayed:" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 17, enabled = true)
	public void VerifySelectedRaffle1ActiveText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffle1ActiveText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateSelectedRaffle1ActiveText();
		 String expectedText = "Active";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("SelectedRaffle1ActiveText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("SelectedRaffle1ActiveText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 18, enabled = true)
	public void VerifySelectedRaffle1TitleText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffle1TitleText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateSelectedRaffle1TitleText();
		 String expectedText = "WIN A BRAND NEW VOLKSWAGEN POLO";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("SelectedRaffle1TitleText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("SelectedRaffle1TitleText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 19, enabled = true)
	public void VerifyDateAndTimeOfRaffleDraw() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the DateAndTimeOfRaffleDraw").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateDateAndTimeOfRaffleDraw();
		 String expectedText = "Dec. 31, 2022, 10 p.m.";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("DateAndTimeOfRaffleDraw actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("DateAndTimeOfRaffleDraw actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 20, enabled = true)
	public void VerifyRaffleEndsInText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RaffleEndsInText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateRaffleEndsInText();
		 String expectedText = "Raffle ends in: 1 month, 1 week from now";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("RaffleEndsInText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("RaffleEndsInText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 21, enabled = true)
	public void VerifyNoOfTicketsPurchasedText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the NoOfTicketsPurchasedText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 String actualText = myRafflesPage2.ValidateNoOfTicketsPurchasedText();
		 String expectedText = "31 tickets";        //
		 if(actualText.equals(expectedText))
		 {
			 test.pass("NoOfTicketsPurchasedText actualText is :"+actualText+"matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("NoOfTicketsPurchasedText actualText   :"+actualText+" not  matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 22, enabled = true)
	public void VerifyHiddenTicketAlongWithNumbers() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the HiddenTicketAlongWithNumbers").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonSelectedRaffle1UnderTheActiveraffleSection1();
		 boolean  flag = myRafflesPage2.ValidateHiddenTicketAlongWithNumbers();    //
		 if(flag == true)
		 {
			 test.pass("HiddenTicketAlongWithNumbers are successfully displayed   : " +flag);
		 }
		 else
		 {
			 test.fail("HiddenTicketAlongWithNumbers are not dispalyed  :" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 23, enabled = true)
	public void VerifyViewRafflesButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ViewRafflesButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonSelectedRaffle1UnderTheActiveraffleSection1();
		 boolean  flag = myRafflesPage2.ValidateViewRafflesButton();   //
		 if(flag == true)
		 {
			 test.pass("ViewRafflesButton is successfully displayed   : " +flag);
		 }
		 else
		 {
			 test.fail("ViewRafflesButton is not dispalyed  :" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 24, enabled = true)
	public void ClickonViewRafflesButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the ViewRafflesButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonSelectedRaffle1UnderTheActiveraffleSection1();//
		 myRafflesPage2.ClickonViewRafflesButton();
		 
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/car/raffle/2916/charity_escape/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("by clicking the ViewRafflesButton actualUrl is :"+actualUrl+"matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("by clicking the ViewRafflesButton actualUrl   :"+actualUrl+" not  matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 25, enabled = true)
	public void ClickonSelectedRaffle1Dropdown() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the SelectedRaffle1Dropdown").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 myRafflesPage2 = homePage.Click_On_MyRaffles_Link();
		 myRafflesPage2.ClickonSelectedRaffle1Dropdown();
		// myRafflesPage2.ClickonViewRafflesButton();
		 
		 boolean  flag = myRafflesPage2.ValidateViewRafflesButton();   //
		 if(flag == true)
		 {
			 test.pass("ViewRafflesButton is successfully displayed   : " +flag);
		 }
		 else
		 {
			 test.fail("ViewRafflesButton is not dispalyed  :" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 
		
	}


}
