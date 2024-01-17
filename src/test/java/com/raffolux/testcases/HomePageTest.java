/**
 * 
 */
package com.raffolux.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.UserInformationPage;

/**
 * @author hp
 *
 */
public class HomePageTest extends BaseClass
{
	/*SignInPage signInPage;
	HomePage homePage;
	UserInformationPage userInformationPage;
	
	@Test(priority = 0, enabled = true)
	public void VerifyRaffoluxLogo() throws Throwable
	{
		
		//test.info("I am going to click on the Sign in link");
		 signInPage = indexPage.ClickOnSigninLink();
		// test.info("I am going to Sign in");
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateRaffoluxLogo();	
	}
	
	@Test(priority = 1, enabled = true)
	public void ClickonRaffoluxLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.CliockonRaffoluxLogo();	
	}
	
	@Test(priority = 2, enabled = true)
	public void VerifyWinnersLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateWinnersLink();	
	}
	
	@Test(priority = 3, enabled = true)
	public void MousehovOverWinnersLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.MousehovOverWinnersLink();	
	}
	
	@Test(priority = 4, enabled = true)
	public void ClickonWinnersLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonWinnersLink();	
	}
	
	@Test(priority = 5, enabled = true)
	public void VerifyMyRafflesLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateMyRafflesLink();	
	}
	
	@Test(priority = 6, enabled = true)
	public void MousehovOverMyRafflesLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.MousehovOverMyRafflesLink();	
	}
	
	@Test(priority = 7, enabled = true)
	public void ClickonMyRafflesLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.CliockonMyRafflesLink();
	}
	
	@Test(priority = 8, enabled = true)
	public void VerifyCartNotificationLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateCartNotificationLogo();
	}
	
	
	@Test(priority = 9, enabled = true)
	public void ClickonCartNotificationLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.CliockonCartNotificationLogo();
	}
	
	@Test(priority = 10, enabled = true)
	public void VerifyProfileLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateProfileLogo();
	}
	
	@Test(priority = 11, enabled = true)
	public void ClickonProfileLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonProfileLogo();
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifyPayPalLoGo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidatePayPalLogo();
	}
	
	@Test(priority = 13, enabled = true)
	public void VerifyLatestOfferBannerSection() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateLatestOfferBannerSection();
	}
	
	@Test(priority = 14, enabled = true)
	public void ClickonLatestOfferBannerSection() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonLatestOfferBannerSection();
	}
	
	@Test(priority = 15, enabled = true)
	public void VerifyMegaJockPotRaffel() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateMegaJackPotRaffel();
	}
	
	@Test(priority = 16, enabled = true)
	public void CliockonJockPotRaffel() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonMegaJackPotRaffel();
	}
	
	
	@Test(priority = 17, enabled = true)
	public void VerifyTitleOFRaffel() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateTitleOFRaffel();
	}
	
	@Test(priority = 18, enabled = true)
	public void VerifyNameOfTheRaffel() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateNameOFRaffel();
	}
	
	@Test(priority = 19, enabled = true)
	public void VerifyEntryPrice() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateEntryPrize();
	}
	
	
	@Test(priority = 20, enabled = true)
	public void VerifyTicketSoldProgressBar() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateTicketSoldProgressBar();
	}
	
	@Test(priority = 21, enabled = true)
	public void VerifyTotalNumberOfTicketsSold() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateTotalNumberOfTicketSold();
	}
	
	@Test(priority = 22, enabled = true)
	public void VerifyEnterNowBtn() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateEnterNowBtn();
	}
	
	/*@Test(priority = 23, enabled = true)
	public void ClickonEnterNowBtn() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonEnterNowBtn();
	}
	
	@Test(priority = 24, enabled = true)
	public void VerifyDrawInTime() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateDrawinTime();
	}
	
	@Test(priority = 23, enabled = true)
	public void ClickonEnterNowBtn() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonEnterNowBtn();
		 Thread.sleep(2000);
		 String actualURl = driver.getCurrentUrl();
		 String expectedUrl = "24354657687980";
		 if(actualURl==expectedUrl)
		 {
			 ExtentTest test = extent.createTest("Verify the ClickonEnterNOwBtn").assignAuthor("Dharma")
						.assignCategory("Functional testing").assignDevice("Windows");
			 //test.addScreenCaptureFromPath(CaptureScreenshot(driver));
			 test.fail("Failed");
		 }
		 else
		 {
			 ExtentTest test = extent.createTest("Verify the ClickonEnterNOwBtn").assignAuthor("Dharma")
						.assignCategory("Functional testing").assignDevice("Windows");

			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			 test.pass("Failed");
		 }
		 
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------
	/*@Test(priority = 24, enabled = true)
	public void ClickOnRatingImg() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnRatingImage();
    	String actualURL = driver.getCurrentUrl();
    	String expectedURL = "https://uk.trustpilot.com/review/raffolux.com";
    	Assert.assertEquals(actualURL, expectedURL);
		System.out.println("RatingImg verified Successfully");
	}
	
	@Test(priority = 25, enabled = true)
	public void VerifyRaffel1() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidateRaffel1();
		System.out.println("raffel1 verified Successfully");
	}
	
	@Test(priority = 26, enabled = true)
	public void VerifyRaffel2() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidateRaffel2();
		System.out.println("raffel2 verified Successfully");
	}
	//There is no offer section after login
	@Test(priority = 27, enabled = true)
	public void VerifyOfferSection() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidateOfferBannerSection();
		System.out.println("OfferBannerSection verified Successfully");
	}
	
	@Test(priority = 28, enabled = true)
	public void VerifyRatingSection() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidateRatingSection();
		System.out.println("RatingSection verified Successfully");
	}
	
	
	@Test(priority = 29, enabled = true)
	public void VerifyPrizewinnerSection() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidatePrizewinnersSection();
		System.out.println("PrizewinnerSection verified Successfully");
	}
	
	@Test(priority = 30, enabled = true)
	public void VerifyHowRaffelsWorksSection() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ValidateHowRaffelsWorksSection();
		System.out.println("HowRaffelsWorksSection verified Successfully");
	}
	
	
	
	@Test(priority = 31, enabled = true)
	public void VerifyCashOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateCashOption();
		Thread.sleep(2000);
    	//indexPage
		System.out.println("CashOption verified Successfully");
	}
	
	@Test(priority = 32, enabled = true)
	public void VerifyTechOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateTechOption();
		//Thread.sleep(2000);
    	//indexPage.ClickOnTechOption();
		System.out.println("TechOption verified Successfully");
	}
	
	@Test(priority = 33, enabled = true)
	public void VerifyHolidayOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateHolidayOption();
    	//indexPage.ClickOnHolidayOption();
		System.out.println("HolidayOption verified Successfully");
	}
	
	@Test(priority = 34, enabled = true)
	public void VerifyOtherOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateOtherOption();
		//Thread.sleep(2000);
    	//indexPage.ClickOnOtherOption();
		System.out.println("HolidayOption verified Successfully");
	}
	
	@Test(priority = 35, enabled = true)
	public void ClickonCashOption() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnCashOption();
		System.out.println("CashOption verified Successfully");
	}
	
	@Test(priority = 36, enabled = true)
	public void ClickonTechOption() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnTechOption();
		System.out.println("TechOption verified Successfully");
	}
	
	@Test(priority = 37, enabled = true)
	public void ClickonHolidayOption() throws Throwable
	{
    	indexPage.ClickOnHolidayOption();
		System.out.println("HolidayOption verified Successfully");
	}
	
	@Test(priority = 38, enabled = true)
	public void ClickonOtherOption() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnOtherOption();
		System.out.println("HolidayOption verified Successfully");
	}
	
	@Test(priority = 39, enabled = true)
	public void ClickOnRatingSection() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnRatingSection();
    	String actualURL = driver.getCurrentUrl();
    	String expectedURL = "https://uk.trustpilot.com/review/raffolux.com";
    	Assert.assertEquals(actualURL, expectedURL);
		System.out.println("RatingISection verified Successfully");
	}
	
	@Test(priority = 40, enabled = true)
	public void ClickonChatBox() throws Throwable
	{
		Thread.sleep(2000);
    	indexPage.ClickOnChatbox();
		System.out.println("ChatBox verified Successfully");
	}
	
	@Test(priority = 41, enabled = true)
	public void VerifyAllOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateAllOption();
    	//indexPage.ValidateAllOption();
		System.out.println("AllOption verified Successfully");
	}
	
	@Test(priority = 42, enabled = true)
	public void ClickonAllOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonAllOption();
    	//indexPage.ValidateAllOption();
		System.out.println("AllOption verified Successfully");
	}
	
	@Test(priority = 43, enabled = true)
	public void VerifyHorScrollBanner() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateHorScrollBanner();
    	//indexPage.ValidateHorScrollBar();
		System.out.println("HorScrollBar verified Successfully");
	}
	
	@Test(priority = 44, enabled = true)
	public void VerifyEighteenPlusLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateEighteenPlusLogo();
    	//indexPage.ValidateEighteenPlusLogo();
		System.out.println("EighteenPlusLogo verified Successfully");
	}
	
	@Test(priority = 45, enabled = true)
	public void VerifyMoreInfo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateMoreInfoLink();
    	//indexPage.ClickonMoreInfoLink();
		System.out.println("MoreInfo verified Successfully");
	}
	
	@Test(priority = 46, enabled = true)
	public void ClickonMoreInfo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonMoreInfoLink();
    	//indexPage.ClickonMoreInfoLink();
		System.out.println("MoreInfo verified Successfully");
	}
	
	
	@Test(priority = 47, enabled = true)
	public void VerifyPleaseGambleResponsiblyText() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidatePleaseGambleResponsiblyText();
    	//indexPage.ValidatePleaseGambleResponsiblyText();
		System.out.println("PleaseGambleResponsiblyText verified Successfully");
	}
	
	
	@Test(priority = 48, enabled = true)
	public void ClickonGameCareLogoText() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonGameCareLogo();
    	//indexPage.ClickonGameCareLogo();
		System.out.println("PleaseGambleResponsiblyText verified Successfully");
	}
	
	@Test(priority = 49, enabled = true)
	public void ClickonGambleResponsiblyLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonBegambleLogo();
    	//indexPage.ClickonBegambleLogo();
		System.out.println("PleaseGambleResponsiblyText verified Successfully");
	}
	
	@Test(priority = 50, enabled = true)
	public void VerifyRatingfooterImage() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidatefooterRatingImage1();
    	//indexPage.ValidateRatingImage1();
		System.out.println("RatingfooterImage verified Successfully");
	}
	
	@Test(priority = 51, enabled = true)
	public void ClickOnRatingfooterImage() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonfooterRatingImage1();
    	//indexPage.ClickonRatingImage1();
		System.out.println("RatingfooterImage verified Successfully");
	}
	
	//28/10/22 -----------------------------------------------------------------------------------------------------------
	
	@Test(priority = 52, enabled = true)
	public void VerifyRaffoluxFooterLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateRaffoluxFooterLogo();
    	//indexPage.ValidateRaffoluxFooterLogo();
		System.out.println("ValidateRaffoluxFooterLogo verified Successfully");
	}
	
	@Test(priority = 53, enabled = true)
	public void VarifyFacebookSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFacebookSocialLogo();
    	//indexPage.ValidateFacebookSocialLogo();
		System.out.println("FacebookSocialLogo verified Successfully");
	}
	
	@Test(priority = 54, enabled = true)
	public void ClickonFacebookSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFacebookSocialLogo();
    	//indexPage.ClickonFacebookSocialLogo();
		System.out.println("FacebookSocialLogo verified Successfully");
	}
	
	@Test(priority = 55, enabled = true)
	public void VerifyTwitterSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateTwitterSocialLogo();
    	//indexPage.ValidateTwitterSocialLogo();
		System.out.println("TwitterSocialLogo verified Successfully");
	}
	
	@Test(priority = 56, enabled = true)
	public void ClickonTwitterSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonTwitterSocialLogo();
    	//indexPage.ClickonTwitterSocialLogo();
		System.out.println("TwitterSocialLogo verified Successfully");
	}
	
	@Test(priority = 57, enabled = true)
	public void VerifyInstagramSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateInstagramSocialLogo();
    	//indexPage.ValidateInstagramSocialLogo();
		System.out.println("InstagramSocialLogo verified Successfully");
	}
	
	@Test(priority = 58, enabled = true)
	public void ClickonInstagramSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonInstagramSocialLogo();
    	//indexPage.ClickonInstagramSocialLogo();
		System.out.println("InstagramSocialLogo verified Successfully");
	}
	
	@Test(priority = 59, enabled = true)
	public void VerifyLinkedInSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateLinkedInSocialLogo();
    	//indexPage.ValidateLinkedInSocialLogo();
		System.out.println("LinkedInSocialLogo verified Successfully");
	}
	
	@Test(priority = 60, enabled = true)
	public void ClickonLinkedInSocialLogo() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonLinkedInSocialLogo();
    	//indexPage.ClickonLinkedInSocialLogo();
		System.out.println("LinkedInSocialLogo verified Successfully");
	}
    //---------------------------------------------------------------------------------------------
	@Test(priority = 61, enabled = true)
	public void VerifyFooterWebsiteoption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterWebsiteoption();
    	//indexPage.ValidateFooterWebsiteoption();
		System.out.println("FooterWebsiteoption verified Successfully");
	}
	
	@Test(priority = 62, enabled = true)
	public void VerifyFooterMyraffelsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterMyraffelsLink();
    	//indexPage.ValidateFooterMyraffelsLink();
		System.out.println("FooterMyraffelsLink verified Successfully");
	}
	
	@Test(priority = 63, enabled = true)
	public void ClickonFooterMyraffelsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterMyraffelsLink();
    	//indexPage.ClickonFooterMyraffelsLink();
		System.out.println("FooterMyraffelsLink verified Successfully");
	}
	
	@Test(priority = 64, enabled = true)
	public void VerifyFooterCharityLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterCharityLink();
    	//indexPage.ValidateFooterCharityLink();
		System.out.println("FooterCharityLin verified Successfully");
	}
	
	@Test(priority = 65, enabled = true)
	public void ClickonFooterCharityLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterCharityLink();
    	//indexPage.ClickonFooterCharityLink();
		System.out.println("FooterCharityLin verified Successfully");
	}
	
	@Test(priority = 66, enabled = true)
	public void VerifyFooterNewsAndBlogLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterNewsAndBlogLink();
    	//indexPage.ValidateFooterNewsAndBlogLink();
		System.out.println("FooterNewsAndBlogLink verified Successfully");
	}
	
	@Test(priority = 67, enabled = true)
	public void ClickonFooterNewsAndBlogLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterNewsAndBlogLink();
    	//indexPage.ClickonFooterNewsAndBlogLink();
		System.out.println("FooterNewsAndBlogLink verified Successfully");
	}
	
	@Test(priority = 68, enabled = true)
	public void VerifyFooterAccountLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterAccountLink();
    	//indexPage.ValidateFooterAccountLink();
		System.out.println("FooterAccountLink verified Successfully");
	}
	
	@Test(priority = 69, enabled = true)
	public void ClickonFooterAccountLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterAccountLink();
    	//indexPage.ClickonFooterAccountLink();
		System.out.println("FooterAccountLink verified Successfully");
	}
	
	@Test(priority = 70, enabled = true)
	public void VerifyFooterResponsiblePlayLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterResponsiblePlayLink();
    	//indexPage.ValidateFooterResponsiblePlayLink();
		System.out.println("FooterResponsiblePlayLink verified Successfully");
	}
	
	@Test(priority = 71, enabled = true)
	public void ClickonFooterResponsiblePlayLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterResponsiblePlayLink();
    	//indexPage.ClickonFooterResponsiblePlayLink();
		System.out.println("FooterResponsiblePlayLink verified Successfully");
	}
	
	@Test(priority = 72, enabled = true)
	public void VerifyFooterWinnersGallaeryLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterWinnersGallaeryLink();
    	//indexPage.ValidateFooterWinnersGallaeryLink();
		System.out.println("FooterWinnersGallaeryLink verified Successfully");
	}
	
	@Test(priority = 73, enabled = true)
	public void ClickonFooterWinnersGallaeryLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterWinnersGallaeryLink();
    	//indexPage.ClickonFooterWinnersGallaeryLink();
		System.out.println("FooterWinnersGallaeryLink verified Successfully");
	}
	
	// Info Options----------------------------------------------------------------------------
	
	@Test(priority = 74, enabled = true)
	public void VerifyFooterInfooption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterInfoOption();
    	//indexPage.ValidateFooterInfoOption();
		System.out.println("FooterInfooption verified Successfully");
	}
	
	@Test(priority = 75, enabled = true)
	public void VerifyFooterHelpLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterHelpLink();
    	//indexPage.ValidateFooterHelpLink();
		System.out.println("FooterHelpLink verified Successfully");
	}
	
	@Test(priority = 76, enabled = false)
	public void ClickonFooterHelpLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterHelpLink();
    	//indexPage.ClickonFooterHelpLink();
		System.out.println("FooterHelpLink verified Successfully");
	}
	
	@Test(priority = 77, enabled = true)
	public void VerifyFooterTermsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterTermsLink();
    	 //indexPage.ValidateFooterTermsLink();
		System.out.println("FooterTermsLink verified Successfully");
	}
	
	@Test(priority = 78, enabled = true)
	public void ClickonFooterTermsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterTermsLink();
    	//indexPage.ClickonFooterTermsLink();
		System.out.println("FooterTermsLink verified Successfully");
	}
	
	@Test(priority = 79, enabled = true)
	public void VerifyFooterPrivacyLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterPrivacyLink();
    	//indexPage.ValidateFooterPrivacyLink();
		System.out.println("FooterPrivacyLink verified Successfully");
	}
	
	@Test(priority = 80, enabled = true)
	public void ClickonFooterPrivacyLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterPrivacyLink();
    	//indexPage.ClickonFooterPrivacyLink();
		System.out.println("FooterPrivacyLink verified Successfully");
	}
	
	@Test(priority = 81, enabled = true)
	public void VerifyFooterWorkwithusLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterWorkwithusLink();
    	//indexPage.ValidateFooterWorkwithusLink();
		System.out.println("FooterWorkwithusLink verified Successfully");
	}
	
	@Test(priority = 82, enabled = true)
	public void ClickonFooterWorkwithusLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterWorkwithusLink();
    	 //indexPage.ClickonFooterWorkwithusLink();
		System.out.println("FooterWorkwithusLink verified Successfully");
	}
	
	//Categories options-------------------------------------------------------------------------
	@Test(priority = 83, enabled = true)
	public void VerifyFooterCategoryOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterCategoryOption();
    	//indexPage.ValidateFooterCategoryOption();
		System.out.println("FooterCategoryOption verified Successfully");
	}
	
	@Test(priority = 84, enabled = true)
	public void VerifyFooterCashLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterCashLink();
    	//indexPage.ValidateFooterCashLink();
		System.out.println("FooterCashLink verified Successfully");
	}
	
	@Test(priority = 85, enabled = true)
	public void ClickonFooterCashLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterCashLink();
    	 //indexPage.ClickonFooterCashLink();
		System.out.println("FooterCashLink verified Successfully");
	}
	
	@Test(priority = 86, enabled = true)
	public void VerifyFooterTechLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterTechLink();
    	 //indexPage.ValidateFooterTechLink();
		System.out.println("FooterTechLink verified Successfully");
	}
	
	@Test(priority = 87, enabled = true)
	public void ClickonFooterTechLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterTechLink();
    	 //indexPage.ClickonFooterTechLink();
		System.out.println("FooterTechLink verified Successfully");
	}
	
	@Test(priority = 88, enabled = true)
	public void VerifyFooterCarsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterCarsLink();
    	//indexPage.ValidateFooterCarsLink();
		System.out.println("FooterCarsLink verified Successfully");
	}
	
	@Test(priority = 89, enabled = true)
	public void ClickonFooterCarsLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterCarsLink();
    	//indexPage.ClickonFooterCarsLink();
		System.out.println("FooterCarsLink verified Successfully");
	}
	
	@Test(priority = 90, enabled = true)
	public void VerifyFooterHolidaysLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterHolidaysLink();
    	 //indexPage.ValidateFooterHelpLink();
		System.out.println("FooterHolidaysLink verified Successfully");
	}
	
	@Test(priority = 91, enabled = true)
	public void ClickonFooterHolidaysLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterHolidaysLink();
    	 //indexPage.ClickonFooterHolidaysLink();
		System.out.println("FooterHolidaysLink verified Successfully");
	}
	
	@Test(priority = 92, enabled = true)
	public void VerifyFooterIndulenceLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterIndulenceLink();
    	// indexPage.ValidateFooterIndulenceLink();
		System.out.println("FooterIndulenceLink verified Successfully");
	}
	
	@Test(priority = 93, enabled = true)
	public void ClickonFooterIndulenceLink() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterIndulenceLink();
    	// indexPage.ClickonFooterIndulenceLink();
		 System.out.println("FooterIndulenceLink verified Successfully");
	}
	
	// Contact options -----------------------------------------------------------------------
	@Test(priority = 94, enabled = true)
	public void VerifyFooterContactOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterContactOption();
    	// indexPage.ValidateFooterContactOption();
		 System.out.println("FooterIndulenceLink verified Successfully");
	} 
	
	@Test(priority = 95, enabled = true)
	public void VerifyFooterContactAdressText() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterContactAdressText();
    	 //indexPage.ValidateFooterContactAdressText();
		 System.out.println("FooterIndulenceLink verified Successfully");
	}
	
	@Test(priority = 96, enabled = true)
	public void VerifyFooterContactNumber() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterContactNumber();
    	 //indexPage.ValidateFooterContactNumber();
		 System.out.println("FooterContactNumber verified Successfully");
	}
	
	@Test(priority = 97, enabled = true)
	public void ClickonFooterContactNumber() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterContactNumber();
    	 // indexPage.ClickonFooterContactNumber();
		 System.out.println("FooterContactNumber verified Successfully");
	}
	
	@Test(priority = 98, enabled = true)
	public void VerifyFooterContactEmail() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterContactEmail();
      // indexPage.ValidateFooterContactEmail();
		 System.out.println("FooterContactEmail verified Successfully");
	}
	
	@Test(priority = 99, enabled = true)
	public void ClickonFooterContactEmail() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ClickonFooterContactEmail();
    	// indexPage.ClickonFooterContactEmail();
		 System.out.println("FooterContactEmail verified Successfully");
	}
	
	@Test(priority = 100, enabled = true)
	public void VerifyFooterPhoneIcon() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterPhoneIcon();	
    	//indexPage.ValidateFooterPhoneIcon();
		System.out.println("FooterPhoneIcon verified Successfully");
	}
	
	@Test(priority = 101, enabled = true)
	public void VerifyFooterEmailIcon() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin("wingsfire21@gmail.com", "fire@555");
		 Thread.sleep(2000);
		 homePage.ValidateFooterEmailIcon();	
    	// indexPage.ValidateFooterEmailIcon();
		 System.out.println("FooterEmailIcon verified Successfully");
	}
	
	@Test(priority = 0, enabled =true)
	public void ClickOnPersonalInfoOption() throws Throwable
	{
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("Username"), prop.getProperty("Password"));
		 homePage.ClickonProfileLogo();
		// userInformationPage = homePage.ClickonPersonalInfoOption();
		 
	}*/
}




