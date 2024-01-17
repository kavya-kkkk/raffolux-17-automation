/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.RafflePageAfterLogin;
import com.raffolux.pages.RafflePageBeforeLogin;
import com.raffolux.pages.SignInPage;

/**
 * @author hp
 *
 */
public class RafflePageAfterLoginTest extends BaseClass
{
	HomePage homePage;
	SignInPage signInPage;
    RafflePageAfterLogin rafflePageAfterLogin;
	
	@Test(priority = -1, enabled = true)
	public void VerifyAfterLoginInstantrafflePageUrl() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify AfterLoginInstantraffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 driver.get("https://sandbox.raffolux.com");
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 rafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		 boolean flag = rafflePageAfterLogin.Validate_Respective_Raffle_Image();
		 if(flag == true)
		 {
			 test.pass("Respective_Raffle_Image is displayed successfully"+ flag);
		 }
		 else
		 {
			 test.fail("Respective_Raffle_Image is not displayed "+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 0, enabled = true)
	public void VerifyAfterLoginInstantraffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify AfterLoginInstantraffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = rafflePageAfterLogin.Validate_Respective_Raffle_Image();
		 if(flag == true)
		 {
			 test.pass("Respective_Raffle_Image is Displayed successfully  :" + flag);
		 }
		 else
		 {
			 test.fail("Respective_Raffle_Image is not Displayed    :" + flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 1, enabled = true) //                  Learn About Waits and perform here untill the "How to play Raffle" image displays.
	public void VerifyHowToPlayRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify  AfterLoginInstantHowToPlayRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = rafflePageAfterLogin.ValidateHowToPlayImage();
		 if(flag == true)
		 {
			 test.pass("RaffleImage is Displayed successufully  :"+flag);
		 }
		 else
		 {
			 test.fail("RaffleImage is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	
	@Test(priority = 2, enabled = true) //                  Learn About Waits and perform here untill the "How to play Raffle" image displays.
	public void VerifyLeftArrowSymbolOnTheRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify LeftArrowSymbolOnTheRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = rafflePageAfterLogin.ValidateLeftArrowSymbolOnTheRaffle();
		 if(flag == true)
		 {
			 test.pass("LeftArrowSymbol is Displayed successufully    :"+ flag);
		 }
		 else
		 {
			 test.fail("LeftArrowSymbol is not Displayed     :"+ flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 3, enabled = true) 
	public void ClickonLeftArrowSymbolOnTheRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by Clicking LeftArrowSymbolOnTheRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 rafflePageAfterLogin.ClickonLeftArrowSymbolOnTheRaffle();
		 boolean flag = rafflePageAfterLogin.ValidateHowToPlayImage();
		 if(flag == true)
		 {
			 test.pass("HowToPlayImage is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("HowToPlayImage is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 4, enabled = true) 
	public void VerifyRightArrowSymbolOnTheRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RightArrowSymbolOnTheRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = rafflePageAfterLogin.ValidateRightArrowSymbolOnTheRaffle();
		 if(flag == true)
		 {
			 test.pass("RightArrowSymbol is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("RightArrowSymbol is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 5, enabled = true) 
	public void ClickonRightArrowSymbolOnTheRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by Clicking RightArrowSymbolOnTheRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 rafflePageAfterLogin.ClickonRightArrowSymbolOnTheRaffle();
		 boolean flag = rafflePageAfterLogin.ValidateHowToPlayImage();
		 if(flag == true)
		 {
			 test.pass("HowToPlayImage is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("HowToPlayImage is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 6, enabled = true) 
	public void VerifyImageAtLeftBottomofRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify  ImageAtLeftBottomofRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 //rafflePageBeforeLogin.ClickonRightArrowSymbolOnTheRaffle();
		 boolean flag = rafflePageAfterLogin.ValidateImageAtLeftBottomofRaffleImage();
		 if(flag == true)
		 {
			 test.pass("ImageAtLeftBottomofRaffleImage is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("ImageAtLeftBottomofRaffleImage is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 7, enabled = true) 
	public void ClickonImageAtRightBottomofRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking ImageAtRightBottomofRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 rafflePageAfterLogin.ClickonImageAtRightBottomofRaffleImage();
		 boolean flag = rafflePageAfterLogin.ValidateHowToPlayImage();
		 if(flag == true)
		 {
			 test.pass("Successfully clicked on ImageAtRightBottomofRaffleImage and also HowToPlayImage is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("Successfully clicked on ImageAtRightBottomofRaffleImage and also is HowToPlayImage not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 8, enabled = true) 
	public void VerifyImageAtRightBottomofRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify ImageAtRightBottomofRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = rafflePageAfterLogin.ValidateImageAtRightBottomofRaffleImage();
		 if(flag == true)
		 {
			 test.pass("ImageAtRightBottomofRaffleImage is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("ImageAtRightBottomofRaffleImage is not Displayed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 9, enabled = true) 
	public void VerifyEnabilityOfImageAtRightBottomofRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify EnabilityOfImageAtRightBottomofRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 boolean flag = rafflePageAfterLogin.ValidateEnabilityOfImageAtRightBottomofRaffleImage();
		 if(flag == true)
		 {
			 test.pass("ImageAtRightBottomofRaffleImage is Enabled successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("ImageAtRightBottomofRaffleImage is not Enabled  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 10, enabled = true) 
	public void VerifyEnabilityOfImageAtLeftBottomofRaffleImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify EnabilityOfImageAtLeftBottomofRaffleImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = rafflePageAfterLogin.ValidateEnabilityOfImageAtLeftBottomofRaffleImage();
		 if(flag == true)
		 {
			 test.pass("ImageAtLeftBottomofRaffleImage is Enabled successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("ImageAtLeftBottomofRaffleImage is not Enabled  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 11, enabled = true) 
	public void VerifyAboutThePrizeText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify AboutThePrizeText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = rafflePageAfterLogin.ValidateAboutThePrizeText();
		 if(flag == true)
		 {
			 test.pass("AboutThePrizeText is Displayed successufully  :"+ flag);
		 }
		 else
		 {
			 test.fail("AboutThePrizeText is not Dispalyed  :"+flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifyAboutThePrizeRaffleDescription() throws Throwable {
		ExtentTest test = extent.createTest("Verify AboutThePrizeRaffleDescription").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateAboutThePrizeRaffleDescription();
		if (flag == true) {
			test.pass("AboutThePrizeRaffleDescription is Displayed successufully  :" + flag);
		} else {
			test.fail("AboutThePrizeRaffleDescription is not Dispalyed  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 13, enabled = true)
	public void VerifyDetailsText() throws Throwable {
		ExtentTest test = extent.createTest("Verify DetailsText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateDetailsText();
		if (flag == true) {
			test.pass("DetailsText is Displayed successufully  :" + flag);
		} else {
			test.fail("DetailsText is not Dispalyed  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 14, enabled = true)
	public void VerifyDetailedDescriptionOfRaffleText() throws Throwable {
		ExtentTest test = extent.createTest("Verify DetailedDescriptionOfRaffleText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateDetailedDescriptionOfRaffleText();
		if (flag == true) {
			test.pass("DetailedDescriptionOfRaffleText is Displayed successufully  :" + flag);
		} else {
			test.fail("DetailedDescriptionOfRaffleText is not Dispalyed  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 15, enabled = true)
	public void VerifyYouMayBeAlsoInterestedInTextt() throws Throwable {
		ExtentTest test = extent.createTest("Verify YouMayBeAlsoInterestedInText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateYouMayBeAlsoInterestedInText();
		if (flag == true) {
			test.pass("YouMayBeAlsoInterestedInText is Displayed successufully  :" + flag);
		} else {
			test.fail("YouMayBeAlsoInterestedInText is not Dispalyed  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 16, enabled = true)
	public void VerifyOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles() throws Throwable {
		ExtentTest test = extent.createTest("Verify OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles();
		if (flag == true) {
			test.pass("OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles is Displayed successufully  :" + flag);
		} else {
			test.fail("OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles is not Dispalyed  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	

	@Test(priority = 17, enabled = true)
	public void ClickonOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		
		rafflePageAfterLogin.ClickonOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://raffolux.com/cash/raffle/3019/250/"; 
		if (actualUrl.equals(expectedUrl)) {
			test.pass("clicked on OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles successufully     :"
					+ "actualUrl   :" + actualUrl + " is matching with the expectedUrl   :" + expectedUrl);
		} else {
			test.fail("Unable to click on OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles successufully     :"
					+ "actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 18, enabled = true)
	public void VerifyTitleOfTheRaffle() throws Throwable {
		ExtentTest test = extent.createTest("Verify TitleOfTheRaffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTitleOfTheRaffle();
		// String actualUrl = driver.getCurrentUrl();
		// String expectedUrl = "https://raffolux.com/cash/raffle/3019/250/";
		if (flag == true) {
			test.pass("TitleOfTheRaffle is Displayed successfully    :" + flag);
		} else {
			test.fail("TitleOfTheRaffle is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 19, enabled = true)
	public void VerifyMaxTicketSection() throws Throwable {
		ExtentTest test = extent.createTest("Verify MaxTicketSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateMaxTicketSection();
		// String actualUrl = driver.getCurrentUrl();
		// String expectedUrl = "https://raffolux.com/cash/raffle/3019/250/";
		if (flag == true) {
			test.pass("MaxTicketSection is Displayed successfully    :" + flag);
		} else {
			test.fail("MaxTicketSection is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 20, enabled = true)
	public void VerifyTotalTicketsSection() throws Throwable {
		ExtentTest test = extent.createTest("Verify TotalTicketsSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateTotalTicketsSection();
		// String actualUrl = driver.getCurrentUrl();
		// String expectedUrl = "https://raffolux.com/cash/raffle/3019/250/";
		if (flag == true) {
			test.pass("TotalTicketsSection is Displayed successfully    :" + flag);
		} else {
			test.fail("TotalTicketsSection is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 21, enabled = true)
	public void VerifyInstantDrawDateSection() throws Throwable {
		ExtentTest test = extent.createTest("Verify InstantDrawDateSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateInstantDrawDateSection();
		// String actualUrl = driver.getCurrentUrl();
		// String expectedUrl = "https://raffolux.com/cash/raffle/3019/250/";
		if (flag == true) {
			test.pass("InstantDrawDateSection is Displayed successfully    :" + flag);
		} else {
			test.fail("InstantDrawDateSection is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 22, enabled = true)
	public void VerifyMaxTicketsPresent() throws Throwable {
		ExtentTest test = extent.createTest("Verify MaxTicketsPresent").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateMaxTicketsPresent();
		if (flag == true) {
			test.pass("MaxTicketsPresent is Displayed successfully    :" + flag);
		} else {
			test.fail("MaxTicketsPresent is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 23, enabled = true)
	public void VerifyTotalTicketsPresent() throws Throwable {
		ExtentTest test = extent.createTest("Verify TotalTicketsPresent").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTotalTicketsPresent();
		if (flag == true) {
			test.pass("TotalTicketsPresent is Displayed successfully    :" + flag);
		} else {
			test.fail("TotalTicketsPresent is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 24, enabled = true)
	public void VerifyInstantDrawDate() throws Throwable {
		ExtentTest test = extent.createTest("Verify InstantDrawDate").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateInstantDrawDate();
		if (flag == true) {
			test.pass("InstantDrawDate is Displayed successfully    :" + flag);
		} else {
			test.fail("InstantDrawDate is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 25, enabled = true)
	public void VerifySeeTermsForFreePostalEntryOption() throws Throwable {
		ExtentTest test = extent.createTest("Verify SeeTermsForFreePostalEntryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateSeeTermsForFreePostalEntryOption();
		if (flag == true) {
			test.pass("SeeTermsForFreePostalEntryOption is Displayed successfully    :" + flag);
		} else {
			test.fail("SeeTermsForFreePostalEntryOption is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 26, enabled = true)
	public void VerifyTermsLink() throws Throwable {
		ExtentTest test = extent.createTest("Verify TermsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTermsLink();
		if (flag == true) {
			test.pass("TermsLink is Displayed successfully    :" + flag);
		} else {
			test.fail("TermsLink is not Displayed Successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 27, enabled = false)
	public void ClickonTermsLink() throws Throwable {
		ExtentTest test = extent.createTest("Verify TermsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		 rafflePageAfterLogin.ClickonTermsLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://raffolux.com/tcs/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("clicked on OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles successufully     :"
					+ "actualUrl   :" + actualUrl + " is matching with the expectedUrl   :" + expectedUrl);
		} else {
			test.fail("Unable to click on OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles successufully     :"
					+ "actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 28, enabled = true)
	public void VerifyEntryTicketPrize() throws Throwable {
		ExtentTest test = extent.createTest("Verify EntryTicketPrize").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateEntryTicketPrize();
		if (flag == true) {
			test.pass("EntryTicketPrize is Displayed successfully     :" + flag);
		} else {
			test.fail("EntryTicketPrize is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 29, enabled = true)
	public void VerifyTotalTicketProgressBar() throws Throwable {
		ExtentTest test = extent.createTest("Verify TotalTicketProgressBar").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTotalTicketProgressBar();
		if (flag == true) {
			test.pass("TotalTicketProgressBar is Displayed successfully     :" + flag);
		} else {
			test.fail("TotalTicketProgressBar is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 30, enabled = true)
	public void VerifyTicketSoldProgressBar() throws Throwable {
		ExtentTest test = extent.createTest("Verify TicketSoldProgressBar").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTicketSoldProgressBar();
		if (flag == true) {
			test.pass("TicketSoldProgressBar is Displayed successfully     :" + flag);
		} else {
			test.fail("TicketSoldProgressBar is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 31, enabled = true)
	public void VerifyMinNoOfTickets() throws Throwable {
		ExtentTest test = extent.createTest("Verify MinNoOfTickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateMinNoOfTickets();
		if (flag == true) {
			test.pass("MinNoOfTickets is Displayed successfully     :" + flag);
		} else {
			test.fail("MinNoOfTickets is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 32, enabled = true)
	public void VerifyMaxNoOfTickets() throws Throwable {
		ExtentTest test = extent.createTest("Verify MaxNoOfTickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateMaxNoOfTickets();
		if (flag == true) {
			test.pass("MaxNoOfTickets is Displayed successfully     :" + flag);
		} else {
			test.fail("MaxNoOfTickets is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 33, enabled = true)
	public void VerifyTotalNoOfTicketsLeft() throws Throwable {
		ExtentTest test = extent.createTest("Verify TotalNoOfTicketsLeft").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateTotalNoOfTicketsLeft();
		if (flag == true) {
			test.pass("TotalNoOfTicketsLeft is Displayed successfully     :" + flag);
		} else {
			test.fail("TotalNoOfTicketsLeft is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 34, enabled = true)
	public void VerifyPercentageOfTicketsSold() throws Throwable {
		ExtentTest test = extent.createTest("Verify PercentageOfTicketsSold").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidatePercentageOfTicketsSold();
		if (flag == true) {
			test.pass("PercentageOfTicketsSold is Displayed successfully     :" + flag);
		} else {
			test.fail("PercentageOfTicketsSold is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 35, enabled = true)
	public void VerifySelectDropdown() throws Throwable {
		ExtentTest test = extent.createTest("Verify SelectDropdown").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateSelectDropdown();
		if (flag == true) {
			test.pass("SelectDropdown is Displayed successfully     :" + flag);
		} else {
			test.fail("SelectDropdown is not Displayed successfully    :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 36, enabled = true)
	public void ClickonSelectDropdown() throws Throwable {
		ExtentTest test = extent.createTest("Verify SelectDropdown").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		 rafflePageAfterLogin.ClickonSelectDropdown();
		test.info("Successfully clicked on the select dropdown");
		boolean flag = rafflePageAfterLogin.ValidateDropdownMenuShow();
		if (flag == true) {
			test.pass("Clicked on select dropdown, hence DropdownMenuShow is Displayed successfully     :" + flag);
		} else {
			test.fail("Unable to Click on select dropdown, hence DropdownMenuShow is not Displayed successfully    :"
					+ flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 37, enabled = true)
	public void VerifyEnterBtn() throws Throwable {
		ExtentTest test = extent.createTest("Verify EnterBtn").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateEnterBtn();
		if (flag == true) {
			test.pass("EnterBtn is Displayed successfully  :" + flag);
		} else {
			test.fail("EnterBtn is not Displayed successfuly  :" + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 38, enabled = true)
	public void ClickonEnterBtn() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the EnterBtn").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ClickonEnterBtn();
		
		if (flag == true) {
			test.pass("Successfully clicked on the EnterBtn");
		} else {
			test.fail("Unable to click on the EnterBtn");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 39, enabled = true)
	public void VerifyInstantDrawInformationText() throws Throwable {
		ExtentTest test = extent.createTest("Verify InstantDrawInformationText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = rafflePageAfterLogin.ValidateInstantDrawInformationText();
		if (flag == true) {
			test.pass("InstantDrawInformationText is Displayed successfully");
		} else {
			test.fail("InstantDrawInformationText is not Displayed successfully");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 40, enabled = true)
	public void VerifyCompetitionInformationText() throws Throwable {
		ExtentTest test = extent.createTest("Verify CompetitionInformationText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		 
		boolean flag = rafflePageAfterLogin.ValidateCompetitionInformationText();
		if (flag == true) {
			test.pass("CompetitionInformationText is Displayed successfully");
		} else {
			test.fail("CompetitionInformationText is not Displayed successfully");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

}
