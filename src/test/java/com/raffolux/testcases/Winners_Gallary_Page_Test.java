/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.Winners_Gallary_Page;

/**
 * @author hp
 *
 */
public class Winners_Gallary_Page_Test extends BaseClass {
	Winners_Gallary_Page winners_Gallary_Page;

	@Test(priority = 0, enabled = true)
	public void Verify_NavigationTo_Winners_Gallary_Page() throws Throwable {
		ExtentTest test = extent.createTest("Verify NavigationTo_Winners_Gallary_Page").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		//driver.get("https://sandbox.raffolux.com/");

		try {
			winners_Gallary_Page = indexPage.ClickonFooterWinnersGallaeryLink();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://sandbox.raffolux.com/winners_gallery/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl :" + actualUrl + "is matching with the expectedUrl" + expectedUrl);
			} else {
				test.fail("actualUrl :" + actualUrl + "is not matching with the expectedUrl" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 1, enabled = true)
	public void Verify_Winners_Title_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Winners_Title_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winners_Gallary_Page.Validate_Winners_Title_Text();
			String expectedText = "Winners";
			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}
	// Winning_Cup_Symbol

	@Test(priority = 2, enabled = true)
	public void Verify_Winning_Cup_Symbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify Winning_Cup_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_Winning_Cup_Symbol();
			if (flag == true) {
				test.pass("Winning_Cup_Symbol is displayed successfully   :" + flag);
			} else {
				test.fail("Winning_Cup_Symbol is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	// List_Of_Winners_

	@Test(priority = 3, enabled = true)
	public void Verify_List_Of_Winners_() throws Throwable {
		ExtentTest test = extent.createTest("Verify List_Of_Winners_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_List_Of_Winners_();
			if (flag == true) {
				test.pass("List_Of_Winners_ is displayed successfully   :" + flag);
			} else {
				test.fail("List_Of_Winners_ is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	// One_Of_The_Winner_From_The_List_Of_Winners_
	@Test(priority = 4, enabled = true)
	public void Verify_One_Of_The_Winner_From_The_List_Of_Winners_() throws Throwable {
		ExtentTest test = extent.createTest("Verify One_Of_The_Winner_From_The_List_Of_Winners_Card")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		// winners_Gallary_Page.Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card();
		// Thread.sleep(3000);
		try {
			boolean flag = winners_Gallary_Page.Validate_One_Of_The_Winner_From_The_List_Of_Winners_();
			if (flag == true) {
				test.pass("One_Of_The_Winner_From_The_List_Of_Winners_Card is displayed successfully   :" + flag);
			} else {
				test.fail("One_Of_The_Winner_From_The_List_Of_Winners_Card is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 5, enabled = true)
	public void Clickon_One_Of_The_Winner_From_The_List_Of_Winners_() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the  One_Of_The_Winner_From_The_List_Of_Winners_Card")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card();
			Thread.sleep(3000);
			boolean flag = winners_Gallary_Page.Validate_One_Of_The_Winner_Card();
			if (flag == true) {
				test.pass("One_Of_The_Winner_Card is displayed successfully   :" + flag);
			} else {
				test.fail("One_Of_The_Winner_Card is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		winners_Gallary_Page = indexPage.ClickonFooterWinnersGallaeryLink();
	}

	@Test(priority = 6, enabled = true)
	public void Validate_Image_Of_The_Winner_Of_One_OF_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Image_Of_The_Winner_Of_One_OF_The_Winner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_Image_Of__One_of_The_Winners();
			if (flag == true) {
				test.pass("Image_Of_The_Winner_Of_One_OF_The_Winner is displayed successfully   :" + flag);
			} else {
				test.fail("Image_Of_The_Winner_Of_One_OF_The_Winner is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		winners_Gallary_Page = indexPage.ClickonFooterWinnersGallaeryLink();
	}

	@Test(priority = 7, enabled = true)
	public void Validate_Name_Of_The_Prize_On_One_of_The_Winners() throws Throwable {
		ExtentTest test = extent.createTest("Verify Name_Of_The_Prize_On_One_of_The_Winners").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winners_Gallary_Page.Validate_Name_Of_One_of_The_Winning_Prize();
			String expectedText = "Makita Cordless 4-Piece Tool Set";
			if (actualText.equals(expectedText)) {
				test.pass("actualText  :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText  :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 7, enabled = true)
	public void Verify_One_Of_The_Winner_Card_Remove_Symbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify One_Of_The_Winner_Card_Remove_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card();
			Thread.sleep(3000);
			boolean flag = winners_Gallary_Page.Validate_One_Of_The_Winner_Card_Remove_Symbol();
			if (flag == true) {
				test.pass("One_Of_The_Winner_Card_Remove_Symbol is displayed successfully   :" + flag);
			} else {
				test.fail("One_Of_The_Winner_Card_Remove_Symbol is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 8, enabled = true)
	public void Clickon_One_Of_The_Winner_Card_Remove_Symbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the One_Of_The_Winner_Card_Remove_Symbol")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_One_Of_The_Winner_Card_Remove_Symbol();
			Thread.sleep(3000);
			boolean flag = winners_Gallary_Page.Validate_One_Of_The_Winner_Card();
			if (flag == false) {
				test.pass("One_Of_The_Winner_Card is displayed successfully   :" + flag);
			} else {
				test.fail("One_Of_The_Winner_Card is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	// Name_Of_One_of_The_Winning_Prize//
	@Test(priority = 9, enabled = true)
	public void Validate_Name_Of_One_of_The_Winning_Prize() throws Throwable {
		ExtentTest test = extent.createTest("Verify Name_Of_One_of_The_Winning_Prize").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card();
			Thread.sleep(3000);
			String actualText = winners_Gallary_Page.Validate_Name_Of_One_of_The_Winning_Prize();
			String expectedText = "Makita Cordless 4-Piece Tool Set";
			if (actualText.equals(expectedText)) {
				test.pass("actualText  :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText  :" + actualText + "is not matching with the expectedText :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 10, enabled = true)
	public void Validate_WonBy_Text_Of_One_of_The_Winning_Prize() throws Throwable {
		ExtentTest test = extent.createTest("Verify WonBy_Text_Of_One_of_The_Winning_Prize").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winners_Gallary_Page.Validate_WonBy_Text_Of_One_of_The_Winning_Prize();
			String expectedText = "won by";
			if (actualText.equals(expectedText)) {
				test.pass("actualText  :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText  :" + actualText + "is not matching with the expectedText :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 11, enabled = true)
	public void Validate_Ticket_Number_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Ticket_Number_of_One_of_The_Winner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = winners_Gallary_Page.Validate_Ticket_Number_of_One_of_The_Winning_Prize();
			String expectedText = "231";
			if (actualText.equals(expectedText)) {
				test.pass("actualText  :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText  :" + actualText + "is not matching with the expectedText :" + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 12, enabled = true)
	public void Ticket_Shape_Outline_of_One_of_The_Winning_Ticket() throws Throwable {
		ExtentTest test = extent.createTest("Verify Ticket_Shape_Outline_of_One_of_The_Winning_Ticket")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_Ticket_Shape_Outline_of_One_of_The_Winning_Ticket();
			if (flag == true) {
				test.pass("Ticket_Shape_Outline_of_One_of_The_Winning_Ticket is displayed successfully   :" + flag);
			} else {
				test.fail("Ticket_Shape_Outline_of_One_of_The_Winning_Ticket is not displayed" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 13, enabled = true)
	public void mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner();
			if (flag == true) {
				test.pass("mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner is  success  :" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("Unable to mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 14, enabled = true)
	public void Verify_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Draw_Detalis_Link_of_One_of_The_Winner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_Draw_Detalis_Link_of_One_of_The_Winner();
			if (flag == true) {
				test.pass("Draw_Detalis_Link_of_One_of_The_Winner is successfully displayed  :" + flag);
			} else {
				test.fail("Draw_Detalis_Link_of_One_of_The_Winner is not displayed " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 15, enabled = true)
	public void Clickon_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the Draw_Detalis_Link_of_One_of_The_Winner")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_Draw_Detalis_Link_of_One_of_The_Winner();
			Thread.sleep(3000);
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://sandbox.raffolux.com/whowon/177156/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl  :" + actualUrl + "is matching with the expectedUrl  :" + expectedUrl);
			} else {
				test.fail("actualUrl  :" + actualUrl + "is not matching with the expectedUrl  :" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

		winners_Gallary_Page = indexPage.ClickonFooterWinnersGallaeryLink();
	}

	@Test(priority = 16, enabled = true)
	public void mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card();
			Thread.sleep(3000);
			boolean flag = winners_Gallary_Page.mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner();
			if (flag == true) {
				test.pass("mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner is  success  :" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("Unable to mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 17, enabled = true)
	public void Verify_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify Winners_Gallery_Link_of_One_of_The_Winner").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = winners_Gallary_Page.Validate_Winners_Gallery_Link_of_One_of_The_Winner();
			if (flag == true) {
				test.pass("Winners_Gallery_Link_of_One_of_The_Winner is successfully displayed  :" + flag);
			} else {
				test.fail("Winners_Gallery_Link_of_One_of_The_Winner is not displayed " + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}

	@Test(priority = 18, enabled = true)
	public void Clickon_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the Winners_Gallery_Link_of_One_of_The_Winner")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			winners_Gallary_Page.Clickon_Winners_Gallery_Link_of_One_of_The_Winner();
			Thread.sleep(3000);
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://sandbox.raffolux.com/winners_gallery/";
			if (actualUrl.equals(expectedUrl)) {
				test.pass("actualUrl  :" + actualUrl + "is matching with the expectedUrl  :" + expectedUrl);
			} else {
				test.fail("actualUrl  :" + actualUrl + "is not matching with the expectedUrl  :" + expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println();
		}

	}
}
