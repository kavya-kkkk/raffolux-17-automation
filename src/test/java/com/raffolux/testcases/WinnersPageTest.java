/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

import com.raffolux.pages.HomePage;

import com.raffolux.pages.SignInPage;
import com.raffolux.pages.WinnersPage;

/**
 * @author hp
 *
 */
public class WinnersPageTest extends BaseClass {
	SignInPage signInPage;
	HomePage homePage;
	WinnersPage winnersPage;

	@Test(priority = 0, enabled = true)
	public void Verify_WinnersPage_Url() throws Throwable {
		ExtentTest test = extent.createTest("Verify_WinnersPage_Url").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		//driver.get("https://sandbox.raffolux.com/");
		//signInPage = indexPage.ClickOnSigninLink();
		//homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		winnersPage = homePage.Click_On_Winners_Link();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/winners/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
		} else {
			test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 1, enabled = true)
	public void Verify_RaffoluxWinnersTitle() throws Throwable {
		ExtentTest test = extent.createTest("Verify the  RaffoluxWinnersTitle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualTitle = winnersPage.ValidateRaffoluxWinnersTitle();
		String expectedTitle = "Raffolux Winners";
		if (actualTitle.equals(expectedTitle)) {
			test.pass("actualTitle   :" + actualTitle + "is matching the expectedTitle  :" + expectedTitle);
		} else {
			test.fail("actualTitle   :" + actualTitle + " is not matching with the expectedTitle   :" + expectedTitle);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 2, enabled = true)
	public void Verify_LeftArrowSymbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify the  LeftArrowSymbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateLeftArrowSymbol();
		if (flag == true) {
			test.pass("LeftArrowSymbol is Displayed Successfully " + flag);
		} else {
			test.fail("LeftArrowSymbol is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 2, enabled = true)
	public void Verify_By_ClickingonLeftArrowSymbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the  LeftArrowSymbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		winnersPage.ClickonLeftArrowSymbol();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
		} else {
			test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

		homePage.Click_On_Winners_Link();
	}

	@Test(priority = 3, enabled = true)
	public void Verify_SearchBox() throws Throwable {
		ExtentTest test = extent.createTest("Verify SearchBox").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateSearchBox();
		if (flag == true) {
			test.pass("SearchBox is Displayed Successfully " + flag);
		} else {
			test.fail("SearchBox is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 4, enabled = true)
	public void Verify_Current_Month_And_Year_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Current_Month_And_Year_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualText = winnersPage.ValidateCurrent_Month_And_Year_Text();
		String expectedText = "NOVEMBER 2022"; // Need to be changed while running the test scripts
		if (actualText.equals(expectedText)) {
			test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
		} else {
			test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 5, enabled = true)
	public void Verify_OneOftheWinnerFromTheWinnersList() throws Throwable {
		ExtentTest test = extent.createTest("Verify OneOftheWinnerFromTheWinnersList").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateOneOftheWinnerFromTheWinnersList();
		if (flag == true) {
			test.pass("OneOftheWinnerFromTheWinnersList is Displayed Successfully " + flag);
		} else {
			test.fail("OneOftheWinnerFromTheWinnersList is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 6, enabled = true)
	public void Verify_By_ClickingonOneOftheWinnerFromTheWinnersList() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the  OneOftheWinnerFromTheWinnersList")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		winnersPage.ClickonOneOftheWinnerFromTheWinnersList();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/whowon/R1030/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
		} else {
			test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

		homePage.Click_On_Winners_Link();
	}

	@Test(priority = 7, enabled = true)
	public void Verify_Image_Of_Prize() throws Throwable {
		ExtentTest test = extent.createTest("Verify Image_Of_Prize").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateImage_Of_Prize();
		if (flag == true) {
			test.pass("Image_Of_Prize is Displayed Successfully " + flag);
		} else {
			test.fail("Image_Of_Prize is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 8, enabled = true)
	public void Verify_Title_Of_The_Prize() throws Throwable {
		ExtentTest test = extent.createTest("Verify the  Title_Of_The_Prize").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualTitle = winnersPage.ValidateTitle_Of_The_Prize();
		String expectedTitle = "Coco Chanel or Dior Sauvage";
		if (actualTitle.equals(expectedTitle)) {
			test.pass("actualTitle   :" + actualTitle + "is matching the expectedTitle  :" + expectedTitle);
		} else {
			test.fail("actualTitle   :" + actualTitle + " is not matching with the expectedTitle   :" + expectedTitle);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 9, enabled = true)
	public void Verify_Congratulations_Text_alongwith_WinnerName() throws Throwable {
		ExtentTest test = extent.createTest("Verify Congratulations_Text_alongwith_WinnerName").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualText = winnersPage.ValidateCongratulations_Text_alongwith_WinnerName();
		String expectedText = "NOVEMBER 2022";
		if (actualText.equals(expectedText)) {
			test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
		} else {
			test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

	@Test(priority = 10, enabled = true)
	public void Verify_Name_Of_The_PrizeWinner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Name_Of_The_PrizeWinner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		winnersPage.ClickonOneOftheWinnerFromTheWinnersList();
		String actualText = winnersPage.ValidateName_Of_The_PrizeWinner();
		String expectedText = "Hannah B";
		if (actualText.equals(expectedText)) {
			test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
		} else {
			test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 11, enabled = true)
	public void Verify_Title_Of_The_Prize_Won() throws Throwable {
		ExtentTest test = extent.createTest("Verify the  Title_Of_The_Prize_Won").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualTitle = winnersPage.ValidateTitle_Of_The_Prize_Won();
		String expectedTitle = "Won the \"Coco Chanel or Dior Sauvage\" raffle with the lucky ticket number";
		if (actualTitle.equals(expectedTitle)) {
			test.pass("actualTitle   :" + actualTitle + "is matching the expectedTitle  :" + expectedTitle);
		} else {
			test.fail("actualTitle   :" + actualTitle + " is not matching with the expectedTitle   :" + expectedTitle);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 12, enabled = true)
	public void Verify_PrizeWinning_Ticket_Number() throws Throwable {
		ExtentTest test = extent.createTest("Verify PrizeWinning_Ticket_Number").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualText = winnersPage.ValidatePrizeWinning_Ticket_Number();
		String expectedText = "10";
		if (actualText.equals(expectedText)) {
			test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
		} else {
			test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 13, enabled = true)
	public void Verify_Image_Of_Prize1() throws Throwable {
		ExtentTest test = extent.createTest("Verify Image_Of_Prize1").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateImage_Of_Prize1();
		if (flag == true) {
			test.pass("Image_Of_Prize1 is Displayed Successfully " + flag);
		} else {
			test.fail("Image_Of_Prize1 is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 14, enabled = true)
	public void Verify_Draw_Taken_Time_And_Date() throws Throwable {
		ExtentTest test = extent.createTest("Verify Draw_Taken_Time_And_Date").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		String actualText = winnersPage.ValidateDraw_Taken_Time_And_Date();
		String expectedText = "This draw was provided and verified";
		if (actualText.equals(expectedText)) {
			test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
		} else {
			test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 15, enabled = true)
	public void Verify_Random_Org_Image() throws Throwable {
		ExtentTest test = extent.createTest("Verify Random_Org_Image").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateRandom_Org_Image();
		if (flag == true) {
			test.pass("Random_Org_Image is Displayed Successfully " + flag);
		} else {
			test.fail("Random_Org_Image is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 16, enabled = true)
	public void Verify_Draw_Details_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify Draw_Details_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateDraw_Details_Link();
		if (flag == true) {
			test.pass("Draw_Details_Link is Displayed Successfully " + flag);
		} else {
			test.fail("Draw_Details_Link is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 17, enabled = true)
	public void Verify_MousehovOverDraw_Details_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify Draw_Details_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.MousehovOverDraw_Details_Link();
		if (flag == true) {
			test.pass("Draw_Details_Link is Displayed Successfully " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		} else {
			test.fail("Draw_Details_Link is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 18, enabled = true)
	public void Verify_By_ClickingonDraw_Details_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the Draw_Details_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		winnersPage.ClickonDraw_Details_Link();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/winners/R1030/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
		} else {
			test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

		homePage.Click_On_Winners_Link();
		winnersPage.ClickonOneOftheWinnerFromTheWinnersList();
	}

	@Test(priority = 19, enabled = true)
	public void Verify_Drawn_Name_Ticket_TableSection() throws Throwable {
		ExtentTest test = extent.createTest("Verify Drawn_Name_Ticket_TableSection").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		boolean flag = winnersPage.ValidateDrawn_Name_Ticket_TableSection();
		if (flag == true) {
			test.pass("Drawn_Name_Ticket_TableSection is Displayed Successfully " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		} else {
			test.fail("Drawn_Name_Ticket_TableSection is not Displayed  " + flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}

	}

	@Test(priority = 20, enabled = true)
	public void Verify_Drawn_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Drawn_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateDrawn_Text();
			String expectedText = "Drawn";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 21, enabled = true)
	public void Verify_Drawn_Result() throws Throwable {
		ExtentTest test = extent.createTest("Verify Drawn_Result").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateDrawn_Result();
			String expectedText = "Drawn_Result";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 22, enabled = true)
	public void Verify_Name_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Name_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateName_Text();
			String expectedText = "Name";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 23, enabled = true)
	public void Verify_Name_Of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Name_Of_The_Winner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateName_Of_The_Winner();
			String expectedText = "Hannah B";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 24, enabled = true)
	public void Verify_Ticket_No_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Tickat_No_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateTickat_No_Text();
			String expectedText = "Ticket No.";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 25, enabled = true)
	public void Verify_Number_Of_Tecket_Won() throws Throwable {
		ExtentTest test = extent.createTest("Verify Number_Of_Tecket_Won").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateNumber_Of_Tecket_Won();
			String expectedText = "10";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 26, enabled = true)
	public void Verify_Your_A_Sponser_Of_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Your_A_Sponser_Of_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateYour_A_Sponser_Of_Text();
			String expectedText = "You are a sponsor of";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 27, enabled = true)
	public void Verify_Logo_Of_The_Supported_Charity() throws Throwable {
		ExtentTest test = extent.createTest("Verify Logo_Of_The_Supported_Charity").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.ValidateLogo_Of_The_Supported_Charity();
			if (flag == true) {
				test.pass("Logo_Of_The_Supported_Charity is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("Logo_Of_The_Supported_Charity is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 28, enabled = true)
	public void Verify_Join_Our_Member_Club_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Join_Our_Member_Club_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		try {
			String actualText = winnersPage.ValidateJoin_Our_Member_Club_Text();
			String expectedText = "Join our members club!";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 29, enabled = true)
	public void Verify_Members_Club_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify Members_Club_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.ValidateMembers_Club_Link();
			if (flag == true) {
				test.pass("Members_Club_Link is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("Members_Club_Link is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 30, enabled = true)
	public void MOusehovOverMembers_Club_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify by mouse hovOve Members_Club_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		try {
			boolean flag = winnersPage.MousehovOverMembers_Club_Link();
			if (flag == true) {
				test.pass("Mouse hoverd on Members_Club_Link is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("not mouse hovered on Members_Club_Link is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 31, enabled = true)
	public void Verify_By_ClickingonMembers_Club_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify by Clicking the Members_Club_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			winnersPage.ClickonMembers_Club_Link();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.facebook.com/groups/2809091855848680/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
			} else {
				test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		homePage.Click_On_Winners_Link();
	}

	@Test(priority = 32, enabled = true)
	public void Verify_AS_A_Club_Member_Suggest_NextRaffle_Info_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify AS_A_Club_Member_Suggest_NextRaffle_Info_Text")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winnersPage.ValidateAS_A_Club_Member_Suggest_NextRaffle_Info_Text();
			String expectedText = "With our friendly club you can have your say and suggest our next raffles, we create raffles from club members suggestions every day! Don't miss out, get involved! join ";
			if (actualText.equals(expectedText)) {
				test.pass("actualText   :" + actualText + "is matching the expectedText  :" + expectedText);
			} else {
				test.fail("actualText   :" + actualText + " is not matching with the expectedText   :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 33, enabled = true)
	public void Verify_GetInvolved_Join_Here_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify GetInvolved_Join_Here_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.ValidateGetInvolved_Join_Here_Link();
			if (flag == true) {
				test.pass("GetInvolved_Join_Here_Link is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("GetInvolved_Join_Here_Link is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 34, enabled = true)
	public void MOusehovOverGetInvolved_Join_Here_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify by mouse hovOver GetInvolved_Join_Here_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.MousehovOverGetInvolved_Join_Here_Link();
			if (flag == true) {
				test.pass("Mouse hoverd on GetInvolved_Join_Here_Link is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("not mouse hovered on GetInvolved_Join_Here_Link is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 35, enabled = true)
	public void Verify_By_ClickingonGetInvolved_Join_Here_Link() throws Throwable {
		ExtentTest test = extent.createTest("Verify by Clicking the GetInvolved_Join_Here_Link").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			winnersPage.ClickonGetInvolved_Join_Here_Link();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.facebook.com/groups/2809091855848680/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
			} else {
				test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		homePage.Click_On_Winners_Link();
	}

	@Test(priority = 36, enabled = true)
	public void Verify_Charities_Horizontal_Scrolling_Bar() throws Throwable {
		ExtentTest test = extent.createTest("Verify Charities_Horizontal_Scrolling_Bar").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.ValidateCharities_Horizontal_Scrolling_Bar();
			if (flag == true) {
				test.pass("Charities_Horizontal_Scrolling_Bar is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("Charities_Horizontal_Scrolling_Bar is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 37, enabled = true)
	public void Verify_One_OfThe_Charity_From_Horizontal_Scrolling_Bar() throws Throwable {
		ExtentTest test = extent.createTest("Verify One_OfThe_Charity_From_Horizontal_Scrolling_Bar")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winnersPage.ValidateOne_OfThe_Charity_From_Horizontal_Scrolling_Bar();
			if (flag == true) {
				test.pass("One_OfThe_Charity_From_Horizontal_Scrolling_Bar is Displayed Successfully " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("One_OfThe_Charity_From_Horizontal_Scrolling_Bar is not Displayed  " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 38, enabled = true)
	public void Verify_By_ClickingonOne_OfThe_Charity_From_Horizontal_Scrolling_Bar() throws Throwable {
		ExtentTest test = extent.createTest("Verify by Clicking the One_OfThe_Charity_From_Horizontal_Scrolling_Bar")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winnersPage.ClickonOne_OfThe_Charity_From_Horizontal_Scrolling_Bar();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.facebook.com/groups/2809091855848680/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl   :" + actualUrl + "is matching the expectedUrl  :" + expectedUrl);
			} else {
				test.fail("actualUrl   :" + actualUrl + " is not matching with the expectedUrl   :" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		homePage.Click_On_Winners_Link();
	}

}
