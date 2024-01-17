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




/**
 * @author hp
 *
 */
public class IndexPageTest extends BaseClass
{
	SignInPage signInPage;
	ExtentTest test;
	HomePage homePage;
	//IndexPage indexPage;
	
	//WebElements present on the each of the raffle (Before login)
	
	@Test(priority = 0, enabled = true)
	public void VerifyOne_Of_The_Instant_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the One_Of_The_Instant_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		driver.get("https://sandbox.raffolux.com/");
		
    	boolean flag = indexPage.Validate_One_Of_The_Instant_Raffle();
    	if(flag ==true)
    	{
    		test.pass("One_Of_The_Instant_Raffle displayed successfully");
    	}
    	else
    	{
    		test.fail("One_Of_The_Instant_Raffle is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		
	}
	
	@Test(priority = 1, enabled = true)
	public void VerifyMegajackpot_Text_On_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Megajackpot_Text_On_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_Megajackpot_Text_On_Raffle();
    	if(flag == true)
    	{
    		test.pass("Megajackpot_Text_On_Raffle displayed successfully");
    	}
    	else
    	{
    		test.fail("Megajackpot_Text_On_Raffle is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		
	}
	
	@Test(priority = 2, enabled = true)
	public void VerifyTitle_Of_One_Of_The_Instant_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Title_Of_One_Of_The_Instant_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	String actualText = indexPage.Validate_Title_Of_One_Of_The_Instant_Raffle();
    	
    	String expectedText = "£50,000 Audi Q3 Treasure Hunt";
    	if(actualText.equals(expectedText))
    	{
    		test.pass("actualText is"+ actualText + "is matching with the"+ expectedText);
    	}
    	else
    	{
    		test.fail("actualText is"+ actualText + "is not matching with the"+ expectedText);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		
	}
	
	@Test(priority = 3, enabled = true)
	public void VerifyEntry_Prize_Of_One_Of_The_Instant_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Entry_Prize_Of_One_Of_The_Instant_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	String actualText = indexPage.Validate_Entry_Prize_Of_One_Of_The_Instant_Raffle();
    	
    	String expectedText = "£2.99";
    	if(actualText.equals(expectedText))
    	{
    		test.pass("actualText is"+ actualText + "is matching with the"+ expectedText);
    	}
    	else
    	{
    		test.fail("actualText is"+ actualText + "is not matching with the"+ expectedText);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	
	
	@Test(priority = 4, enabled = true)
	public void VerifyTicket_Sold_Progress_Bar() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Ticket_Sold_Progress_Bar").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_Ticket_Sold_Progress_Bar();
    	if(flag == true)
    	{
    		test.pass("Ticket_Sold_Progress_Bar displayed successfully");
    	}
    	else
    	{
    		test.fail("Ticket_Sold_Progress_Bar is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 5, enabled = true)
	public void VerifyTicket_Sold_Progress_Bar_Of_Sold_Tickets() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Ticket_Sold_Progress_Bar_Of_Sold_Tickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_Ticket_Sold_Progress_Bar_Of_Sold_Tickets();
    	if(flag == true)
    	{
    		test.pass("Ticket_Sold_Progress_Bar_Of_Sold_Tickets displayed successfully");
    	}
    	else
    	{
    		test.fail("Ticket_Sold_Progress_Bar_Of_Sold_Tickets is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 6, enabled = true)
	public void VerifyNumber_Of_Tickets_Sold() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Number_Of_Tickets_Sold").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	String actualText = indexPage.Validate_Number_Of_Tickets_Sold();
    	
    	String expectedText = "4911 tickets sold ";
    	if(actualText.equals(expectedText))
    	{
    		test.pass("actualText is"+ actualText + "is matching with the"+ expectedText);
    	}
    	else
    	{
    		test.fail("actualText is"+ actualText + "is not matching with the"+ expectedText);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 7, enabled = true)
	public void VerifyEnter_Now_Button_One_Of_The_Instant_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Enter_Now_Button_One_Of_The_Instant_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_Enter_Now_Button_One_Of_The_Instant_Raffle();
    	if(flag == true)
    	{
    		test.pass("Enter_Now_Button_One_Of_The_Instant_Raffle displayed successfully");
    	}
    	else
    	{
    		test.fail("Enter_Now_Button_One_Of_The_Instant_Raffle is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 8, enabled = true)
	public void ClickonEnter_Now_Button_One_Of_The_Instant_Raffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clikcing the Enter_Now_Button_One_Of_The_Instant_Raffle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
    	
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/cash/raffle/3374/auditreasurehunt/";
    	
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl is"+ actualUrl + "is matching with the"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl is"+ actualUrl + "is not matching with the"+ expectedUrl);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    			
    	indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 9, enabled = true)
	public void VerifyLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the Raffolux_Logo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateLogo();
    	if(flag == true)
    	{
    		test.pass("Raffolux_Logo displayed successfully");
    	}
    	else
    	{
    		test.fail("Raffolux_Logo is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		
	}
	
	@Test(priority = 10, enabled = true)
	public void verifymouseoveronCharity_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by mouseoveronCharity_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
		indexPage.mouseHoverOnCharityLink();
		Thread.sleep(2000);
		boolean flag = indexPage.Validate_charityLink();
		if(flag)
		{
			test.pass("Successfully mouseHoverOnCharityLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		else
		{
			test.fail("Unable to mouseHoverOnCharityLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 11, enabled = true)
	public void verifymouseoveronSigninLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by mouseoveronSigninLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
		indexPage.mouseHoverOnSigninLink();
		Thread.sleep(2000);
		boolean flag = indexPage.Validate_SignLink();
		if(flag)
		{
			test.pass("Successfully mouseHoverOnSigninLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		else
		{
			test.fail("Unable to mouseHoverOnSigninLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifySigninLink() throws Throwable
	{
		
		ExtentTest test = extent.createTest("Verify the SigninLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_SignLink();
    	if(flag == true)
    	{
    		test.pass("SigninLink displayed successfully");
    	}
    	else
    	{
    		test.fail("SigninLink is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 13, enabled = true)
	public void verifyByClickonSigninLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by ClickonSigninLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		 Thread.sleep(2000);
		 indexPage.ClickOnSigninLink();
		 
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/accounts/login/";
		 
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl is" + actualUrl + "matching with the expectedUrl " +expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl is" + actualUrl + "not matching with the expectedUrl " +expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 
		 indexPage.Validate_By_Clicking_Raffolux_Logo();
		 //String actualURL = driver.getCurrentUrl();
		 //Assert.assertEquals(actualURL, "https://raffolux.com/accounts/login/");			
	}
	
	@Test(priority = 14, enabled = true)
	public void VerifyCharityLink() throws Throwable
	{
		
		ExtentTest test = extent.createTest("Verify the CharityLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_charityLink();
    	if(flag == true)
    	{
    		test.pass("CharityLink displayed successfully");
    	}
    	else
    	{
    		test.fail("CharityLink is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 15, enabled = true)
	public void verifyByClickonCharityLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by ClickonCharityLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		 Thread.sleep(2000);
		 indexPage.ClickOnCharityLink();
		 
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/charities/";
		 
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl is" + actualUrl + "matching with the expectedUrl " +expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl is" + actualUrl + "not matching with the expectedUrl " +expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 indexPage.Validate_By_Clicking_Raffolux_Logo();
		 //String actualURL = driver.getCurrentUrl();
		// Assert.assertEquals(actualURL, "https://raffolux.com/charities/"); 
	}
	
	/*@Test(priority = 5, enabled = false)
	public void VerifyRaffoluxLink() throws Throwable
	{
    	indexPage.ValidateRaffoluxLink();
    	indexPage.mouseOveronRaffoluxLink();
    	indexPage.ClickonRaffoluxLink();
		System.out.println("RaffoluxLink verified Successfully");
	}*/
	
	@Test(priority = 16, enabled = true)
	public void verifyByClickonRaffolux_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify By ClickonRaffolux_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		 Thread.sleep(2000);
		 indexPage.ClickonRaffoluxLink();
		 
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/signup/";
		 
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl is" + actualUrl + "matching with the expectedUrl " +expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl is" + actualUrl + "not matching with the expectedUrl " +expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 indexPage.Validate_By_Clicking_Raffolux_Logo();
		 //String actualURL = driver.getCurrentUrl();
		// Assert.assertEquals(actualURL, "https://raffolux.com/charities/"); 
	}
	
	@Test(priority = 17, enabled = true)
	public void verifymouseOveronRaffoluxLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by mouseOveronRaffoluxLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
		indexPage.mouseOveronRaffoluxLink();
		Thread.sleep(2000);
		boolean flag = indexPage.ValidateRaffoluxLink();
		if(flag)
		{
			test.pass("Successfully mouseOveronRaffoluxLink");
		}
		else
		{
			test.fail("Unable to mouseOveronRaffoluxLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 18, enabled = true)
	public void VerifyRaffoluxLink() throws Throwable
	{
		
		ExtentTest test = extent.createTest("Verify the RaffoluxLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateRaffoluxLink();
    	if(flag == true)
    	{
    		test.pass("RaffoluxLink displayed successfully");
    	}
    	else
    	{
    		test.fail("RaffoluxLink is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 19, enabled = true)
	public void VerifyRatingImage() throws Throwable
	{
		
		ExtentTest test = extent.createTest("Verify the RatingImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_RatingImage();
    	if(flag == true)
    	{
    		test.pass("RatingImage displayed successfully");
    	}
    	else
    	{
    		test.fail("RatingImage is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	//Need to be Altered
	
	@Test(priority = 20, enabled = false)
	public void Verify_ClickOnRatingImg() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by ClickOnRatingImg").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	indexPage.ClickOnRatingImage();
    	String actualURL = driver.getCurrentUrl();
    	String expectedURL = "https://uk.trustpilot.com/review/raffolux.com";
    	
    	if(actualURL.equals(expectedURL))
    	{
    		test.pass("actualURL is" + actualURL + "matching with the expectedURL " +expectedURL);
    	}
    	else
    	{
    		test.fail("actualURL is" + actualURL + "matching with the expectedURL " +expectedURL);
    	}
    	
    	
    	//Assert.assertEquals(actualURL, expectedURL);
		//System.out.println("RatingImg verified Successfully");
	}
	
	@Test(priority = 21, enabled = true)
	public void VerifyRaffel1() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify Raffel1").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidateRaffel1();
    	boolean flag = indexPage.ValidateRaffel1();
    	if(flag == true)
    	{
    		test.pass("Raffel1 displayed successfully");
    	}
    	else
    	{
    		test.fail("Raffel1 is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 22, enabled = true)
	public void VerifyRaffel2() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify Raffel2").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidateRaffel2();
    	boolean flag = indexPage.ValidateRaffel2();
    	if(flag == true)
    	{
    		test.pass("Raffel2 displayed successfully");
    	}
    	else
    	{
    		test.fail("Raffel2 is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 23, enabled = true)
	public void VerifyOfferSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify OfferSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidateOfferBannerSection();
    	boolean flag = indexPage.ValidateOfferBannerSection();
    	if(flag == true)
    	{
    		test.pass("OfferBannerSection displayed successfully");
    	}
    	else
    	{
    		test.fail("OfferBannerSection is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 24, enabled = true)
	public void VerifyRatingSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify RatingSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidateRatingSection();
    	boolean flag = indexPage.ValidateRatingSection();
    	if(flag == true)
    	{
    		test.pass("RatingSection displayed successfully");
    	}
    	else
    	{
    		test.fail("RatingSection is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	
	@Test(priority = 25, enabled = true)
	public void VerifyPrizewinnerSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify PrizewinnerSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidatePrizewinnersSection();
    	boolean flag = indexPage.ValidatePrizewinnersSection();
    	if(flag == true)
    	{
    		test.pass("PrizewinnersSection displayed successfully");
    	}
    	else
    	{
    		test.fail("PrizewinnersSection is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 26, enabled = true)
	public void VerifyHowRaffelsWorksSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify HowRaffelsWorksSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	//indexPage.ValidateHowRaffelsWorksSection();
    	boolean flag = indexPage.ValidateHowRaffelsWorksSection();
    	if(flag == true)
    	{
    		test.pass("HowRaffelsWorksSection displayed successfully");
    	}
    	else
    	{
    		test.fail("HowRaffelsWorksSection is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------
	//Below test scripts are need to be modified still
	
	// Raffle category filters
	
	@Test(priority = 27, enabled = true)
	public void VerifyCashCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify CashCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	boolean flag = indexPage.Validate_CashCategoryOption();
    	
    	if(flag == true)
    	{
    		test.pass("CashCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("CashCategoryOption is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("CashCategoryOption verified Successfully");
	}
	
	@Test(priority = 28, enabled = true)
	public void VerifyTechCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify TechCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	boolean flag = indexPage.Validate_TechCategoryOption();
    	
    	if(flag == true)
    	{
    		test.pass("TechCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("TechCategoryOption is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("TechCategoryOption verified Successfully");
	}
	
	@Test(priority = 29, enabled = true)
	public void VerifyHolidayCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify HolidayCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	boolean flag = indexPage.Validate_HolidayCategoryOption();
    	
    	if(flag == true)
    	{
    		test.pass("HolidayCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("HolidayCategoryOption is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("HolidayCategoryOption verified Successfully");
	}
	
	@Test(priority = 30, enabled = true)
	public void VerifyOtherCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify OtherCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	boolean flag = indexPage.Validate_OtherCategoryOption();
    	
    	if(flag == true)
    	{
    		test.pass("OtherCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("OtherCategoryOption is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("OtherCategoryOption verified Successfully");
	}
	
	@Test(priority = 31, enabled = true)
	public void VerifyAllCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify AllCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	boolean flag = indexPage.Validate_AllCategoryOption();
    	
    	if(flag == true)
    	{
    		test.pass("AllCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("AllCategoryOption is not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("AllCategoryOption verified Successfully");
	}
	
	@Test(priority = 32, enabled = true)
	public void Verify_By_Clicking_The_CashFilterOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_The_CashFilterOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	boolean flag = indexPage.ClickOnCashOption();
    	
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the CashFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the CashFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 33, enabled = true)
	public void Verify_By_Clicking_The_TechFilterOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_The_TechFilterOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	boolean flag = indexPage.ClickOnTechOption();
    	
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the TechFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the TechFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 34, enabled = true)
	public void Verify_By_Clicking_The_HolidayFilterOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_The_HolidayFilterOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	boolean flag = indexPage.ClickOnHolidayOption();
    	
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the HolidayFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the HolidayFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 35, enabled = true)
	public void Verify_By_Clicking_The_OtherFilterOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_The_OtherFilterOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	boolean flag = indexPage.ClickOnOtherOption();
    	
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the OtherFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the OtherFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	@Test(priority = 36, enabled = true)
	public void Verify_By_Clicking_The_AllFilterOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_Clicking_The_AllFilterOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		Thread.sleep(2000);
    	boolean flag = indexPage.ClickonAllOption();
    	
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the AllFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the AllFilterOption");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
	}
	
	/*@Test(priority = 19, enabled = false)
	public void VerifyAllOption() throws Throwable
	{
    	indexPage.ValidateAllOption();
		System.out.println("AllOption verified Successfully");
	}*/
	
	// ------------------------------------------------------------------------
	// NEED to be Altered
	@Test(priority = 37, enabled = false)
	public void Verify_By_ClickOnRatingSection() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickOnRatingSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	indexPage.ClickOnRatingSection();
    	
    	String actualURL = driver.getCurrentUrl();
    	String expectedURL = "https://uk.trustpilot.com/review/raffolux.com";
    	
    	if(actualURL.equals(expectedURL))
    	{
    		test.pass("actualURL "+ actualURL + "is matching with the "+ expectedURL);
    	}
    	else
    	{
    		test.fail("actualURL "+ actualURL + "is not matching with the "+ expectedURL);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	//Assert.assertEquals(actualURL, expectedURL);
		System.out.println("ClickOnRatingSection verified Successfully");
	}
	
	@Test(priority = 38, enabled = true)
	public void Verify_By_ClickingonChatBox() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonChatBox").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		Thread.sleep(2000);
    	indexPage.ClickOnChatbox();
    	boolean flag = indexPage.Validate_Chat_Window();
    	if(flag == true)
    	{
    		test.pass("Successfully clicked on the ChatBox");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("Unable to click on the ChatBox");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	
	}
	
	
	@Test(priority = 39, enabled = true)
	public void VerifyHorScrollBanner() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_HorScrollBanner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateHorScrollBar();
    	if(flag == true)
    	{
    		test.pass("HorScrollBanner displayed successfully");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("HorScrollBanner not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("HorScrollBanner verified Successfully");
	}
	
	@Test(priority = 40, enabled = true)
	public void VerifyMoreInfoLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_MoreInfoLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.Validate_MoreInfoLink();
    	if(flag == true)
    	{
    		test.pass("MoreInfoLink displayed successfully");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("MoreInfoLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	
		System.out.println("MoreInfoLink verified Successfully");
	}
	
	@Test(priority = 41, enabled = true)
	public void VerifyEighteenPlusLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_EighteenPlusLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateEighteenPlusLogo();
    	if(flag == true)
    	{
    		test.pass("EighteenPlusLogo displayed successfully");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("EighteenPlusLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	
		System.out.println("EighteenPlusLogo verified Successfully");
	}
	
	@Test(priority = 42, enabled = true)
	public void Verify_By_ClickingonMoreInfo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonMoreInfo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ClickonMoreInfoLink();
    	
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "";
    	
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :" +expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :" +expectedUrl);
    	}
		System.out.println("MoreInfo verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	
	@Test(priority = 43, enabled = true)
	public void VerifyPleaseGambleResponsiblyText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_PleaseGambleResponsiblyText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidatePleaseGambleResponsiblyText();
    	if(flag == true)
    	{
    		test.pass("PleaseGambleResponsiblyText displayed successfully");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	else
    	{
    		test.fail("PleaseGambleResponsiblyText not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("PleaseGambleResponsiblyText verified Successfully");
	}
	
	//
	
	@Test(priority = 44, enabled = true)
	public void Verify_By_ClickingonGameCareLogoText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonGameCareLogoText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonGameCareLogo();
    	
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "";
    	
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("Successfully clicked on PleaseGambleResponsiblyText ");
    	}
    	else
    	{
    		test.fail("Unable to Click on PleaseGambleResponsiblyText");
    	}
		System.out.println("PleaseGambleResponsiblyText verified Successfully");
	}
	
	@Test(priority = 45, enabled = true)
	public void Verify_By_ClickingonGambleResponsiblyText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonGameCareLogoText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonBegambleLogo();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "";
    	
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("");
    	}
    	else
    	{
    		test.fail("Unable to Click on PleaseGambleResponsiblyText");
    	}
		System.out.println("GambleResponsiblyText verified Successfully");
	}
	
	@Test(priority = 46, enabled = true)
	public void Verify_RatingfooterImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_RatingfooterImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag  = indexPage.ValidateRatingImage1();
    	if(flag == true)
    	{
    		test.pass("RatingfooterImage displayed successfully");
    	}
    	else
    	{
    		test.fail("RatingfooterImage not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("RatingfooterImage verified Successfully");
	}
	
	@Test(priority = 47, enabled = true)
	public void Verify_By_ClickingOnRatingfooterImage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_RatingfooterImage").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonRatingImage1();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://uk.trustpilot.com/review/raffolux.com";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
    	
		System.out.println("RatingfooterImage verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 48, enabled = true)
	public void Verify_RaffoluxFooterLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_RaffoluxFooterLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateRaffoluxFooterLogo();
    	if(flag == true)
    	{
    		test.pass("RaffoluxFooterLogo displayed successfully");
    	}
    	else
    	{
    		test.fail("RaffoluxFooterLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("ValidateRaffoluxFooterLogo verified Successfully");
	}
	
	@Test(priority = 49, enabled = true)
	public void Varify_FacebookSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Varify_FacebookSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		boolean flag = indexPage.ValidateFacebookSocialLogo();
    	if(flag == true)
    	{
    		test.pass("FacebookSocialLogo displayed successfully");
    	}
    	else
    	{
    		test.fail("FacebookSocialLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FacebookSocialLogo verified Successfully");
	}
	
	@Test(priority = 50, enabled = false)
	public void Verify_By_ClickingonFacebookSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFacebookSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFacebookSocialLogo();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://www.facebook.com/raffolux/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FacebookSocialLogo verified Successfully");
	}
	
	@Test(priority = 51, enabled = true)
	public void Verify_TwitterSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_TwitterSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateTwitterSocialLogo();
    	if(flag == true)
    	{
    		test.pass("TwitterSocialLogo displayed successfully");
    	}
    	else
    	{
    		test.fail("TwitterSocialLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("TwitterSocialLogo verified Successfully");
	}
	
	@Test(priority = 52, enabled = false)
	public void Verify_By_ClickingonTwitterSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonTwitterSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonTwitterSocialLogo();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://twitter.com/raffolux/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("TwitterSocialLogo verified Successfully");
	}
	
	@Test(priority = 53, enabled = true)
	public void Verify_InstagramSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonTwitterSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateInstagramSocialLogo();
    	if(flag == true)
    	{
    		test.pass("InstagramSocialLogo displayed successfully");
    	}
    	else
    	{
    		test.fail("InstagramSocialLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("InstagramSocialLogo verified Successfully");
	}
	
	@Test(priority = 54, enabled = false)
	public void Verify_By_ClickingonInstagramSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonInstagramSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonInstagramSocialLogo();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://www.instagram.com/raffolux/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
    	
    	
		System.out.println("InstagramSocialLogo verified Successfully");
	}
	
	@Test(priority = 55, enabled = true)
	public void Verify_LinkedInSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_LinkedInSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateLinkedInSocialLogo();
    	if(flag == true)
    	{
    		test.pass("Verify_LinkedInSocialLogo displayed successfully");
    	}
    	else
    	{
    		test.fail("Verify_LinkedInSocialLogo not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
    	
		System.out.println("LinkedInSocialLogo verified Successfully");
	}
	
	@Test(priority = 56, enabled = false)
	public void Verify_By_ClickingonLinkedInSocialLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonLinkedInSocialLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonLinkedInSocialLogo();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://www.linkedin.com/authwall?trk=bf&trkInfo=AQH5_dDmi7BFnQAAAYW_TKdws0pVcdMGwFHonwRWkCyzLo9nps7rucR4R3g6N6vL1FGeZexT7ZljzmPkG2YKU8NCUt6BRdpOZ9Cp__uHhxX_BFM8Tb18bGvMDcruwj_7kmBmxEw=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fraffolux%2Fabout%2F";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("LinkedInSocialLogo verified Successfully");
	}
	
    //---------------------------------------------------------------------------------------------
	
	
	@Test(priority = 57, enabled = true)
	public void Verify_FooterWebsiteoption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterWebsiteoption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterWebsiteoption();
    	if(flag == true)
    	{
    		test.pass("FooterWebsiteoption displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterWebsiteoption not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterWebsiteoption verified Successfully");
	}
	
	@Test(priority = 58, enabled = true)
	public void Verify_FooterMyraffelsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterMyraffelsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterMyraffelsLink();
    	if(flag == true)
    	{
    		test.pass("FooterMyraffelsLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterMyraffelsLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterMyraffelsLink verified Successfully");
	}
	
	@Test(priority = 59, enabled = true)
	public void Verify_By_ClickingonFooterMyraffelsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterMyraffelsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterMyraffelsLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/myraffles/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterMyraffelsLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 60, enabled = true)
	public void Verify_FooterCharityLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterCharityLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterCharityLink();
    	if(flag == true)
    	{
    		test.pass("FooterCharityLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterCharityLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterCharityLink verified Successfully");
	}
	
	@Test(priority = 61, enabled = true)
	public void Verify_By_ClickingonFooterCharityLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterCharityLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterCharityLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/charities/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterCharityLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 62, enabled = true)
	public void Verify_FooterNewsAndBlogLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterNewsAndBlogLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterNewsAndBlogLink();
    	if(flag == true)
    	{
    		test.pass("FooterNewsAndBlogLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterNewsAndBlogLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterNewsAndBlogLink verified Successfully");
	}
	
	@Test(priority = 63, enabled = true)
	public void Verify_By_ClickingonFooterNewsAndBlogLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterNewsAndBlogLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterNewsAndBlogLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/newslist/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterNewsAndBlogLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 64, enabled = true)
	public void Verify_FooterAccountLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterAccountLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterAccountLink();
    	if(flag == true)
    	{
    		test.pass("FooterAccountLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterAccountLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterAccountLink verified Successfully");
	}
	
	@Test(priority = 65, enabled = true)
	public void Verify_By_ClickingonFooterAccountLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterAccountLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterAccountLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/accounts/login/?next=/members/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterAccountLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 66, enabled = true)
	public void Verify_FooterResponsiblePlayLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterResponsiblePlayLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterResponsiblePlayLink();
    	if(flag == true)
    	{
    		test.pass("FooterResponsiblePlayLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterResponsiblePlayLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterResponsiblePlayLink verified Successfully");
	}
	
	/*@Test(priority = 48, enabled = false)
	public void ClickonFooterResponsiblePlayLink() throws Throwable
	{
    	indexPage.ClickonFooterResponsiblePlayLink();
		System.out.println("FooterResponsiblePlayLink verified Successfully");
	}*/
	
	
	@Test(priority = 67, enabled = true)
	public void Verify_ClickonFooterResponsiblePlayLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterResponsiblePlayLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterResponsiblePlayLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/play/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterResponsiblePlayLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 68, enabled = true)
	public void Verify_FooterWinnersGallaeryLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterWinnersGallaeryLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterWinnersGallaeryLink();
    	if(flag == true)
    	{
    		test.pass("FooterWinnersGallaeryLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterWinnersGallaeryLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterWinnersGallaeryLink verified Successfully");
	}
	
	@Test(priority = 69, enabled = true)
	public void Verify_By_ClickingonFooterWinnersGallaeryLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterWinnersGallaeryLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterWinnersGallaeryLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/winners_gallery/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterWinnersGallaeryLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 70, enabled = true)
	public void Verify_FooterInfooption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterInfooption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterInfoOption();
    	if(flag == true)
    	{
    		test.pass("FooterInfooption displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterInfooption not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterInfooption verified Successfully");
	}
	
	@Test(priority = 71, enabled = true)
	public void Verify_FooterHelpLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterHelpLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterHelpLink();
    	if(flag == true)
    	{
    		test.pass("FooterHelpLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterHelpLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterHelpLink verified Successfully");
	}
	
	@Test(priority = 72, enabled = true)
	public void Verify_By_ClickingonFooterHelpLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterHelpLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterHelpLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/help/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterHelpLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 73, enabled = true)
	public void Verify_FooterTermsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterTermsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterTermsLink();
    	if(flag == true)
    	{
    		test.pass("FooterTermsLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterTermsLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterTermsLink verified Successfully");
	}
	
	@Test(priority = 74, enabled = true)
	public void Verify_By_ClickingonFooterTermsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterTermsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterTermsLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/tcs/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterTermsLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 75, enabled = true)
	public void Verify_FooterPrivacyLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterPrivacyLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterPrivacyLink();
    	if(flag == true)
    	{
    		test.pass("FooterPrivacyLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterPrivacyLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterPrivacyLink verified Successfully");
	}
	
	@Test(priority = 76, enabled = true)
	public void Verify_By_ClickingonFooterPrivacyLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterPrivacyLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterPrivacyLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/privacy/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterPrivacyLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 77, enabled = true)
	public void Verify_FooterWorkwithusLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterWorkwithusLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterWorkwithusLink();
    	if(flag == true)
    	{
    		test.pass("FooterWorkwithusLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterWorkwithusLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterWorkwithusLink verified Successfully");
	}
	
	@Test(priority = 78, enabled = true)
	public void Verify_By_ClicingonFooterWorkwithusLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClicingonFooterWorkwithusLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterWorkwithusLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/workwithus/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterWorkwithusLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	//Categories options-------------------------------------------------------------------------
	
	
	@Test(priority = 79, enabled = true)
	public void Verify_FooterCategoryOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterCategoryOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterCategoryOption();
    	if(flag == true)
    	{
    		test.pass("FooterCategoryOption displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterCategoryOption not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterCategoryOption verified Successfully");
	}
	
	@Test(priority = 80, enabled = true)
	public void Verify_FooterCashLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterCashLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterCashLink();
    	if(flag == true)
    	{
    		test.pass("FooterCashLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterCashLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterCashLink verified Successfully");
	}
	
	@Test(priority = 81, enabled = true)
	public void Verify_By_ClickonFooterCashLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickonFooterCashLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterCashLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/cash/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterCashLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 82, enabled = true)
	public void Verify_FooterTechLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterTechLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterTechLink();
    	if(flag == true)
    	{
    		test.pass("FooterTechLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterTechLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterTechLink verified Successfully");
	}
	
	@Test(priority = 83, enabled = true)
	public void Verify_By_ClickingonFooterTechLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterTechLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterTechLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/electronic/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterTechLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 84, enabled = true)
	public void Verify_FooterCarsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterCarsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterCarsLink();
    	if(flag == true)
    	{
    		test.pass("FooterCarsLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterCarsLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterCarsLink verified Successfully");
	}
	
	@Test(priority = 85, enabled = true)
	public void Verify_By_ClickingonFooterCarsLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterCarsLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterCarsLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/car/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterCarsLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 86, enabled = true)
	public void Verify_FooterHolidaysLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterHolidaysLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterHolidaysLink();
    	if(flag == true)
    	{
    		test.pass("FooterHolidaysLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterHolidaysLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterHolidaysLink verified Successfully");
	}
	
	@Test(priority = 87, enabled = true)
	public void Verify_By_ClickingonFooterHolidaysLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterHolidaysLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterHolidaysLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/holiday/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterHolidaysLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	@Test(priority = 88, enabled = true)
	public void Verify_FooterIndulenceLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterIndulenceLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterIndulenceLink();
    	if(flag == true)
    	{
    		test.pass("FooterIndulenceLink displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterIndulenceLink not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterIndulenceLink verified Successfully");
	}
	
	@Test(priority = 89, enabled = true)
	public void Verify_By_ClickingonFooterIndulenceLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterIndulenceLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterIndulenceLink();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/indulgence/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterIndulenceLink verified Successfully");
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	// Contact options -----------------------------------------------------------------------
	
	
	@Test(priority = 90, enabled = true)
	public void Verify_FooterContactOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterContactOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterContactOption();
    	if(flag == true)
    	{
    		test.pass("FooterContactOption displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterContactOption not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterContactOption verified Successfully");
	}
	
	@Test(priority = 91, enabled = true)
	public void Verify_FooterContactAdressText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterContactAdressText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterContactAdressText();
    	if(flag == true)
    	{
    		test.pass("FooterContactAdressText displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterContactAdressText not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterContactAdressText verified Successfully");
	}
	
	@Test(priority = 92, enabled = true)
	public void Verify_FooterContactNumber() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterContactNumber").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterContactNumber();
    	if(flag == true)
    	{
    		test.pass("FooterContactNumber displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterContactNumber not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterContactNumber verified Successfully");
	}
	
	//We have to automate "Alert pop-up"
	@Test(priority = 93, enabled = false)
	public void Verify_By_ClickingonFooterContactNumber() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterContactNumber").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonFooterContactNumber();
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/indulgence/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterContactNumber verified Successfully");
	}
	
	@Test(priority = 94, enabled = true)
	public void Verify_FooterContactEmail() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterContactEmail").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterContactEmail();
    	if(flag == true)
    	{
    		test.pass("FooterContactEmail displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterContactEmail not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterContactEmail verified Successfully");
	}
	
	@Test(priority = 95, enabled = false)
	public void Verify_By_ClickingonFooterContactEmail() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonFooterContactEmail").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://sandbox.raffolux.com/category/indulgence/";
    	if(actualUrl.equals(expectedUrl))
    	{
    		test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
    	}
    	else
    	{
    		test.fail("actualUrl :"+ actualUrl + "is not matching with the expectedUrl :"+ expectedUrl);
    	}
		System.out.println("FooterContactEmail verified Successfully");
	}
	
	@Test(priority = 96, enabled = true)
	public void Verify_FooterPhoneIcon() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterPhoneIcon").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterPhoneIcon();
    	if(flag == true)
    	{
    		test.pass("FooterContactEmail displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterContactEmail not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterPhoneIcon verified Successfully");
	}
	
	@Test(priority = 97, enabled = true)
	public void Verify_FooterEmailIcon() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FooterEmailIcon").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	boolean flag = indexPage.ValidateFooterEmailIcon();
    	if(flag == true)
    	{
    		test.pass("FooterEmailIcon displayed successfully");
    	}
    	else
    	{
    		test.fail("FooterEmailIcon not displayed");
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("FooterEmailIcon verified Successfully");
	}
	
	@Test(priority = 98, enabled = true)
	public void VerifyInstantRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the InstantRaffleTitle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
    	String title = indexPage.ValidateInstantRaffle();
    	if(title.equals("£40,000 INSTANT WIN TREASURE HUNT"))
    	{
    		test.pass("Raffle is Displayed successfully, So title of the raffle is  :" +title);
    	}
    	else
    	{
    		test.fail("Raffle is not Displayed successfully, also the title of the raffle is    :" + title);
    		test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
    	}
		System.out.println("InstantRaffle verified Successfully");
		
	}
	
	@Test(priority = 99, enabled = true)
	public void ClickonInstantRaffle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ClickonEnterNOwBtn").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	indexPage.ClickonInstantRaffle();
		System.out.println("InstantRaffle verified Successfully");
		String actualUrl = driver.getCurrentUrl();
		test.info("Cpatured Url"+ actualUrl); 
		String expectedUrl = "https://raffolux.com/cash/raffle/2986/treasurehunt/";
		if(actualUrl.equals(expectedUrl))
		{
			
		          //test.addScreenCaptureFromPath(CaptureScreenshot(driver));
			test.pass("Clicked on EnterNow btn successfully");
			test.pass("ActualUrl  :" + actualUrl +"  is matching with the ExpectedUrl  :"+expectedUrl);
		}
		else
		{
		         
			test.fail("ActualUrl  :" + actualUrl +"  is not matching with the ExpectedUrl  :"+expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver)); //Called captureScreenshot Method which is present in action class as static
		}
		indexPage.Validate_By_Clicking_Raffolux_Logo();
	}
	
	/*@Test(priority = 100, enabled = true)
	public void ClickonInstantRaffleEnterNowBtnAfterLogin() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the ClickonEnterNOwBtn").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
    	 
		signInPage = indexPage.ClickOnSigninLink();
		homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClickonInstantRaffleEnterNowBtnAfterLogin();
		System.out.println("InstantRaffle verified Successfully");
		String actualUrl = driver.getCurrentUrl();
		test.info("Cpatured Url"+ actualUrl); 
		String expectedUrl = "https://raffolux.com/cash/raffle/2986/treasurehunt/";
		if(actualUrl.equals(expectedUrl))
		{
		          //test.addScreenCaptureFromPath(CaptureScreenshot(driver));
			test.pass("Clicked on EnterNow btn successfully");
			test.pass("ActualUrl  :" + actualUrl +"  is matching with the ExpectedUrl  :"+expectedUrl);
		}
		else
		{
		         
			test.fail("ActualUrl  :" + actualUrl +"  is not matching with the ExpectedUrl  :"+expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver)); //Called captureScreenshot Method which is present in action class as static
		}
	}*/
	
	/*@Test(priority = 48, enabled = true)
	public void ClickonFooterResponsiblePlayLink() throws Throwable
	{
    	indexPage.ClickonFooterResponsiblePlayLink();
		System.out.println("FooterResponsiblePlayLink verified Successfully");
	}*/
}
