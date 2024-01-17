/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.CartSummaryPage;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.RafflePageAfterLogin;
import com.raffolux.pages.SignInPage;

/**
 * @author hp 
 *
 */
public class CartSummaryPageTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	RafflePageAfterLogin RafflePageAfterLogin;
	CartSummaryPage cartSummaryPage;
	
	@Test(priority = 0, enabled = true)
	public void Verify_CartSummaryPageUrl() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the CartSummaryPageUrl").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 homePage.Click_On_Cart_Notifications_logo();
		 //myRafflesPage2 = homePage.CliockonMyRafflesLink();
		 String actualUrl =  driver.getCurrentUrl();
		 String expectedUrl = "https://raffolux.com/cart/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("CartSummaryPageUrl   :"+actualUrl+"is matching with the expectedUrl   :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("CartSummaryPageUrl   :"+actualUrl+"is not matching with the expectedUrl   :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 1, enabled = true)
	public void Verify_CartSummaryTitleText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the CartSummaryTitleText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage= RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualText = cartSummaryPage.Validate_Cart_Text();
		 String expectedText = "Cart Summary";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("CartSummaryTitleText   :"+actualText+" is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("CartSummaryTitleText   :"+actualText+" is matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 2, enabled = true)
	public void VerifyYourCartwillExpiryInText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the YourCartwillExpiryInText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage = RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualText = cartSummaryPage.ValidateYourCartwillExpiryInText();
		 String expectedText = "Your cart will expire in";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YourCartwillExpiryInText   :"+actualText+" is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YourCartwillExpiryInText   :"+actualText+" is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 3, enabled = true)
	public void VerifyCartExpiryTimerExlamation() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the CartExpiryTimerExlamation").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage = RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 if(flag == true)
		 {
			 test.pass("CartExpiryTimerExlamation is Successfully Dispalyed     :"+flag);
		 }
		 else
		 {
			 test.fail("CartExpiryTimerExlamation  is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 4, enabled = true)
	public void VerifyCompetitionOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the CompetitionOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateCompetitionOption();
		 if(flag == true)
		 {
			 test.pass("CompetitionOption is Successfully Dispalyed     :"+flag);
		 }
		 else
		 {
			 test.fail("CompetitionOption  is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 5, enabled = true)
	public void VerifySubtotalOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SubtotalOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateSubtotalOption();
		 if(flag == true)
		 {
			 test.pass("SubtotalOption is Successfully Dispalyed     :"+flag);
		 }
		 else
		 {
			 test.fail("SubtotalOption  is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 6, enabled = true)
	public void VerifySelectedRaffleOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffleOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateSelectedRaffleOption();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffleOption is Successfully Dispalyed     :"+flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffleOption  is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 7, enabled = true)
	public void VerifyraffleRemoveSymbol() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the raffleRemoveSymbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateraffleRemoveSymbol();
		 if(flag == true)
		 {
			 test.pass("raffleRemoveSymbol is Successfully Dispalyed     :"+flag);
		 }
		 else
		 {
			 test.fail("raffleRemoveSymbol  is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 8, enabled = true)
	public void ClickonraffleRemoveSymbol() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the raffleRemoveSymbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonraffleRemoveSymbol();
		 String actualText = cartSummaryPage.ValidateYourCartIsEmptyMessage();
		 String expectedText = "Your cart is empty. Why not check out our current raffles to get started?";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("YourCartwillExpiryInText   :"+actualText+" is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("YourCartwillExpiryInText   :"+actualText+" is matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 9, enabled = true)
	public void VerifySelectedRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateSelectedRaffleImage();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffleImage is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffleImage is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 10, enabled = true)
	public void VerifyTitleOfTheSelectedRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the TitleOfTheSelectedRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualText = cartSummaryPage.ValidateTitleOfTheSelectedRaffle();
		 String expectedText = "£40,000 Instant Win Treasure Hunt";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("TitleOfTheSelectedRaffle   :"+actualText+" is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("TitleOfTheSelectedRaffle   :"+actualText+" is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 11, enabled = true)
	public void VerifySelectedTicketOptionOnSelectedRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the SelectedTicketOptionOnSelectedRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateSelectedTicketOptionOnSelectedRaffle();
		 if(flag == true)
		 {
			 test.pass("SelectedRaffleImage is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("SelectedRaffleImage is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifyRemoveOptionOnSelectedTicketOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RemoveOptionOnSelectedTicketOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateRemoveOptionOnSelectedTicketOption();
		 if(flag == true)
		 {
			 test.pass("RemoveOptionOnSelectedTicketOption is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("RemoveOptionOnSelectedTicketOption is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	/*@Test(priority = 11, enabled = true)              //Here need to Automate Alerts So Learn And Impliment.
	public void ClickonRemoveOptionOnSelectedTicketOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the RemoveOptionOnSelectedTicketOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonRemoveOptionOnSelectedTicketOption();
		 if(flag == true)
		 {
			 test.pass("RemoveOptionOnSelectedTicketOption is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("RemoveOptionOnSelectedTicketOption is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}*/
	
	@Test(priority = 13, enabled = true)
	public void VerifyGiftCardOptionSelectedTicketOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the GiftCardOptionSelectedTicketOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateGiftCardOptionSelectedTicketOption();
		 if(flag == true)
		 {
			 test.pass("GiftCardOptionSelectedTicketOption is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("GiftCardOptionSelectedTicketOption is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 14, enabled = true)
	public void VerifyAddEntryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the AddEntryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateAddEntryOption();
		 if(flag == true)
		 {
			 test.pass("AddEntryOption is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("AddEntryOption is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 15, enabled = true)
	public void ClickonAddEntryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the AddEntryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonAddEntryOption();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://raffolux.com/cash/raffle/2986/treasurehunt/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("RafflePageAfterLogin   :"+actualUrl+"is matching with the expectedUrl   :"+ expectedUrl);
		 }
		 else
		 {
			 test.fail("RafflePageAfterLogin   :"+actualUrl+"is not matching with the expectedUrl   :"+ expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 16, enabled = true)
	public void VerifyPricePerEachTicketEntered() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify PricePerEachTicketEntered").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualText = cartSummaryPage.ValidatePricePerEachTicketEntered();
		 String expectedText = "£4.99 ";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("PricePerEachTicketEntered Text   :"+actualText+"is matching with the expectedText   :"+ expectedText);
		 }
		 else
		 {
			 test.fail("PricePerEachTicketEntered Text  :"+actualText+"is not matching with the expectedText   :"+ expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 17, enabled = true)
	public void VerifyCartTotalOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify CartTotalOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualText = cartSummaryPage.ValidateCartTotalOption();
		 String expectedText = "Cart total";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("CartTotalOption   :"+actualText+"is matching with the expectedText   :"+ expectedText);
		 }
		 else
		 {
			 test.fail("CartTotalOption   :"+actualText+"is not matching with the expectedText   :"+ expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 18, enabled = true)
	public void VerifyPromoCodeButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify PromoCodeButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidatePromoCodeButton();
		 if(flag == true)
		 {
			 test.pass("PromoCodeButton is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("PromoCodeButton is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 19, enabled = true)
	public void ClickonPromoCodeButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the  PromoCodeButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeButton();
		 boolean flag = cartSummaryPage.ValidatepromoCodeTextBox();
		 if(flag == true)
		 {
			 test.pass("promoCodeTextBox is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeTextBox is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 20, enabled = true)
	public void VerifyPromoCodeDropdownOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify PromoCodeDropdownOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidatePromoCodeDropdownOption();
		 if(flag == true)
		 {
			 test.pass("PromoCodeDropdownOption is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("PromoCodeDropdownOption is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 21, enabled = true)
	public void ClickonPromoCodeDropdownOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the  PromoCodeDropdownOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 boolean flag = cartSummaryPage.ValidatepromoCodeTextBox();
		 if(flag == true)
		 {
			 test.pass("promoCodeTextBox is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeTextBox is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	} 
	
	@Test(priority = 22, enabled = true)
	public void VerifypromoCodeTextBox() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  promoCodeTextBox").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 boolean flag = cartSummaryPage.ValidatepromoCodeTextBox();
		 if(flag == true)
		 {
			 test.pass("promoCodeTextBox is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeTextBox is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	} 
	
	@Test(priority = 23, enabled = true)
	public void VerifypromoCodeApplyButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  promoCodeApplyButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 boolean flag = cartSummaryPage.ValidatepromoCodeApplyButton();
		 if(flag == true)
		 {
			 test.pass("promoCodeApplyButton is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeApplyButton is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	} 
	
	/*@Test(priority = 23, enabled = true)                                //Its negative Scenarion need to learn How to automate "Alert" Messages
	public void ClickonpromoCodeApplyButton() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the promoCodeApplyButton").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 cartSummaryPage =  RafflePageAfterLogin.CliockonCartNotificationLogo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 cartSummaryPage.ClickonpromoCodeApplyButton();
		 if(flag == true)
		 {
			 test.pass("promoCodeApplyButton is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeApplyButton is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	} */
	
	//This test script is for Valid Vocher Id ---> and also try keeping promocode text field blank and click on apply button
	@Test(priority = 24, enabled = true)
	public void VerifypromoCodeApplyButtonWithValidInput() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  promoCodeApplyButtonWithValidInput").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 cartSummaryPage.ValidatepromoCodeTextBoxByEnteringtheValidInput();
		 cartSummaryPage.ClickonpromoCodeApplyButton();
		/* if(flag == true)
		 {
			 test.pass("promoCodeApplyButton is Successfully Dispalyed     :"+ flag);
		 }
		 else
		 {
			 test.fail("promoCodeApplyButton is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }*/
	} 
	
	//Very Very Important Test Script it has 4 test cases... What happens if we enter Wrong vocher ID Then These test cases should be tested.
	
	@Test(priority = 25, enabled = true)
	public void VerifypromoCodeApplyButtonWithInValidInput() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  promoCodeApplyButtonWithInValidInput").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonPromoCodeDropdownOption();
		 cartSummaryPage.ValidatepromoCodeTextBoxByEnteringtheInValidInput();
		 cartSummaryPage.ClickonpromoCodeApplyButton();
		 boolean flag = cartSummaryPage.ValidateThatVoucherIsNotValidText();
		if(flag == true)
		 {
			 test.pass("ThatVoucherIsNotValidText is Successfully Dispalyed     :"+ flag);
			 boolean flag1 = cartSummaryPage.ValidateTryADifferentVoucherCodeText();
			 
			 if(flag1 == true)
			 {
				 test.pass("TryADifferentVoucherCodeText is Successfully Dispalyed     :"+ flag);
				 boolean flag2 = cartSummaryPage.ValidateGOBackButton();
				 
				 if(flag2 == true)
				 {
					 test.pass("GOBackButton is Successfully Dispalyed     :"+ flag);
					 cartSummaryPage.ClickonGOBackButton();
					 String actualUrl = driver.getCurrentUrl();
					 String expectedUrl = "https://raffolux.com/cart/";
					 if(actualUrl.equals(expectedUrl))
					 {
						 test.pass("Successfully clicked on GoBack Button and also actualUrl is  :"+
					              actualUrl+ "matching with the expectedUrl  :"+expectedUrl);
						 
					 }
					 else
					 {
						 test.fail("Unable to click on GoBack Button and also actualUrl is  :"
					              +actualUrl+" not matching with the expectedUrl  :"+expectedUrl);   
						 
					 }
				 }
				 else
				 {
					 test.fail("GOBackButton is not Dispalyed     :"+ flag);
					 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				 }
			 }
			 else
			 {
				 test.fail("TryADifferentVoucherCodeText is not Dispalyed     :"+ flag);
				 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 }
		 }
		 else
		 {
			 test.fail("ThatVoucherIsNotValidText is not Dispalyed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	} 
	
	@Test(priority = 26, enabled = true)
	public void VerifyTotalOptionUnderCartTotalSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalOptionUnderCartTotalSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String actualTotalPrice = cartSummaryPage.ValidateTotalOptionUnderCartTotalSection();
		 String expectedTotalPrice = "£19.96";
		 if(actualTotalPrice.equals(expectedTotalPrice))
		 {
			 test.pass("actualTotalPrice is      :"+ actualTotalPrice + "Matching with the expectedTotalPrice :"+ expectedTotalPrice);
		 }
		 else
		 {
			 test.fail("actualTotalPrice is  not    :"+ actualTotalPrice + "Matching with the  expectedTotalPrice   :"+ expectedTotalPrice);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	
	//Here i am going to match subtotal price and total price bcz i have added only one raffle
	@Test(priority = 27, enabled = true)
	public void VerifyTotalPricePerEachTicketsOfAllTheSelectedRaffles() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalPricePerEachTicketsOfAllTheSelectedRaffles").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 String PricePerEachTicketEntered = cartSummaryPage.ValidatePricePerEachTicketEntered();
		 String TotalPrice = cartSummaryPage.ValidateTotalPricePerEachTicketsOfAllTheSelectedRaffles();
		 if(PricePerEachTicketEntered.equals(TotalPrice))
		 {
			 test.pass("TotalPrice is      :"+ TotalPrice + "Matching with the PricePerEachTicketEntered  :"+ PricePerEachTicketEntered);
		 }
		 else
		 {
			 test.fail("TotalPrice is  not    :"+ TotalPrice + "Matching with the PricePerEachTicketEntered :" + PricePerEachTicketEntered);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 28, enabled = true)
	public void VerifyCheckOutButtonOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  CheckOutButtonOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 boolean flag = cartSummaryPage.ValidateCheckOutButtonOption();
		 //String PricePerEachTicketEntered = cartSummaryPage.ValidatePricePerEachTicketEntered();
		// String TotalPrice = cartSummaryPage.ValidateTotalPricePerEachTicketsOfAllTheSelectedRaffles();
		 if(flag == true)
		 {
			 test.pass("CheckOutButtonOption is Successfully Dispalyed     :" + flag);
		 }
		 else
		 {
			 test.fail("CheckOutButtonOption is not Dispalyed     :" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 29, enabled = true)
	public void ClickonCheckOutButtonOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  CheckOutButtonOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 RafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 RafflePageAfterLogin.ClickonEnterBtn();
		 Thread.sleep(2000);
		 cartSummaryPage =  RafflePageAfterLogin.Click_On_Cart_Notifications_logo();
		 cartSummaryPage.ClickonCheckOutButtonOption();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://www.vivapayments.com/web2?ref=1068969346510583&color=1C1C27";// Everytime it is Changing so we cannot expect will see 
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl is      :"+ actualUrl + "Matching with the expectedUrl  :"+ expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl is      :"+ actualUrl + "Matching with the expectedUrl  :"+ expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
}
