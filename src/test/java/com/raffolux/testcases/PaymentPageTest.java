/**
 * 
 */
package com.raffolux.testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.CartSummaryPage;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.PaymentPage;
import com.raffolux.pages.RafflePageAfterLogin;
import com.raffolux.pages.SignInPage;

/**
 * @author hp
 *
 */
public class PaymentPageTest extends BaseClass {
	SignInPage signInPage;
	HomePage homePage;
	RafflePageAfterLogin rafflePageAfterLogin;
	CartSummaryPage cartSummaryPage;
	PaymentPage paymentPage;

	@Test(priority = -1, enabled = true)
	public void VerifyPaymentPageUrl() throws Throwable {
		ExtentTest test = extent.createTest("Verify the  PaymentPageUrl").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		try {
			//driver.get("https://sandbox.raffolux.com/");
			//signInPage = indexPage.ClickOnSigninLink();
			//homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
			rafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
			// rafflePageAfterLogin.ClickonSelectDropdown();
			rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
			rafflePageAfterLogin.ClickonEnterBtn();
			cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
			paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
			boolean flag = paymentPage.Validate_Pay_Button();
			// String actualUrl = driver.getCurrentUrl();
			// String expectedUrl =
			// "https://demo.vivapayments.com/web2?ref=9416470191068630&color=FFBD0A";
			if (flag == true) {
				test.pass("Pay_Button is displayed so, User successfully navigated to the Viva_Wallet page");
			} else {
				test.fail("Pay_Button is not displayed so, User unable to navigate to the Viva_Wallet page");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out
					.println("====================================== Exception Alert ===============================");
		}

	}

	// By using this testcase, we can check n number of card credentials..

	@Test(priority = 0, enabled = false)
	public void Verify_Payment_By_Using_CardDetails() throws Throwable {
		ExtentTest test = extent.createTest("Verify the Payment to purchase the Tickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			signInPage = indexPage.ClickOnSigninLink();
			homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
			rafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
			// rafflePageAfterLogin.ClickonSelectDropdown();
			Thread.sleep(2000);
			rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
			Thread.sleep(2000);
			rafflePageAfterLogin.ClickonEnterBtn();
			Thread.sleep(2000);
			cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
			Thread.sleep(2000);
			paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("====================================Exception Alert================================");
		}

		FileInputStream file = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		int NoOfRows = sheet.getLastRowNum();

		System.out.println("The NO of records in the excell sheet " + NoOfRows);

		for (int i = 1; i <= 8; i++) {
			XSSFRow current_row = sheet.getRow(i);
			/*
			 * int DOB = (int)current_row.getCell(3).getNumericCellValue(); String Email_Id
			 * = current_row.getCell(1).getStringCellValue(); long Phone_Number =
			 * (long)current_row.getCell(2).getNumericCellValue();
			 */

			String Email_Id = current_row.getCell(0).getStringCellValue();
			String CardHolderName = current_row.getCell(1).getStringCellValue();
			String CardNumber = current_row.getCell(2).getStringCellValue();
			int ExpiryDate = (int) current_row.getCell(3).getNumericCellValue();
			int Cvv = (int) current_row.getCell(4).getNumericCellValue();
			String Remember_Card = current_row.getCell(0).getStringCellValue();
			paymentPage.ClearTheTextField();

			try {
				paymentPage.MakePayment(Email_Id, CardHolderName, String.valueOf(CardNumber),
						String.valueOf(ExpiryDate), String.valueOf(Cvv), Remember_Card);
			} catch (Exception e) {
				System.out.println("===============================Exception Alert===============================");
				System.out.println(e.getMessage());
			}

			Thread.sleep(2000);

			String actualText = paymentPage.Validate_Payment_Successful_Text();
			String expectedText = "Payment Successful";
			if (actualText.equals(expectedText)) {
				test.pass("actualText is" + actualText + "matching with the expectedText " + expectedText);
				System.out.println("ActualText displayed is   :" + actualText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				homePage = paymentPage.Verify_Clickingon_Continue_Link();
				Thread.sleep(2000);
				homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
				Thread.sleep(2000);
				rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
				Thread.sleep(2000);
				rafflePageAfterLogin.ClickonEnterBtn();
				Thread.sleep(2000);
				rafflePageAfterLogin.ClickonEnterBtn();
				Thread.sleep(2000);
				cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
				Thread.sleep(2000);
				paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
				Thread.sleep(2000);
				paymentPage.ClickonOther_Cards_Toggle();
				// paymentPage.ClearTheTextField();
			} else {
				test.fail("actualText is" + actualText + " not matching with the expectedText " + expectedText);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				System.out.println("ActualText displayed is   :" + actualText);
				homePage = paymentPage.Verify_Clickingon_Continue_Link();
				Thread.sleep(2000);
				homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
				Thread.sleep(2000);
				rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
				Thread.sleep(2000);
				rafflePageAfterLogin.ClickonEnterBtn();
				Thread.sleep(2000);
				rafflePageAfterLogin.ClickonEnterBtn();
				Thread.sleep(2000);
				cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
				Thread.sleep(2000);
				paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
				Thread.sleep(2000);
				paymentPage.ClickonOther_Cards_Toggle();
				// paymentPage.ClearTheTextField();
			}
		}
	}

	@Test(priority = 1, enabled = true)
	public void Verify_GooglePayPaymentOption() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_GooglePayPaymentOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateGooglePayButon();
			if (flag == true) {
				System.out.println("GooglePap_Button is Successfully displayed   :" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				System.out.println("GooglePap_Button is not displayed :" + flag);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 2, enabled = false)
	public void Verify_By_Clicking_GooglePayPaymentOption() throws Throwable {
		ExtentTest test = extent.createTest("Verify the Payment to purchase the Tickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ClickonGooglePayButon();
			if (flag == true) {
				System.out.println("User successfully clicked on GooglePay_Button");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				System.out.println("User Unable to click on GooglePay_Button");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 3, enabled = true)
	public void Verify_VivaWallet_Source_Logo() throws Throwable {
		ExtentTest test = extent.createTest("Verify_VivaWallet_Source_Logo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateVivaWalletLogo();
			if (flag == true) {
				test.pass("VivaWallet Source_Logo is displayed successfully");
			} else {
				test.fail("VivaWallet Source_Logo is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 4, enabled = true)
	public void Verify_VivaWallet_Logo_Wrapper_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify_VivaWalletLogoText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidateViva_WalletLogo_WrapperText();
			String expectedText = " Viva Wallet ";
			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText  :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText  :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 5, enabled = true)
	public void Verify_Language_Dropdown_Button() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Language_Dropdown_Button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateLanguage_Dropdown_Button();
			if (flag == true) {
				test.pass("Language_Dropdown_Button is displayed successfully");
			} else {
				test.fail("Language_Dropdown_Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 6, enabled = true)
	public void Verify_By_Clicking_Language_Dropdown_Button() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_Language_Dropdown_Button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonLanguage_Dropdown_Button();
			boolean flag = paymentPage.ValidateLanguage_Content_List_Menu();
			if (flag == true) {
				test.pass(
						"Language_Content_List_Menu is displayed successfully after clicking the Language_Dropdown_Button");
			} else {
				test.fail("Language_Content_List_Menu is not displayed after clicking the Language_Dropdown_Button");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 7, enabled = true)
	public void Verify_BySelectEnglishLanguageOptionFromTheDropdown() throws Throwable {
		ExtentTest test = extent.createTest("Verify_BySelectEnglishLanguageOptionFromTheDropdown")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ValidateBySelectEnglishLanguageOptionFromTheDropdown();
			String actualText = paymentPage.Validate_Language_Name_On_The_Dropdown();
			String expectedText = "en";

			String ActualText = paymentPage.ValidateOr_PayWithOption_Text();
			String ExpectedText = " Or pay with ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else if (ActualText.equals(ExpectedText)) {
				test.pass("ActualText :" + ActualText + "is matching with the ExpectedText :" + ExpectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
				test.fail("ActualText :" + ActualText + "is not matching with the ExpectedText :" + ExpectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 8, enabled = true)
	public void Verify_BySelectDutchLanguageOptionFromTheDropdown() throws Throwable {
		ExtentTest test = extent.createTest("Verify_BySelectDutchLanguageOptionFromTheDropdown").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ValidateBySelectDutchLanguageOptionFromTheDropdown();
			String actualText = paymentPage.Validate_Language_Name_On_The_Dropdown();
			String expectedText = "nl";

			String ActualText = paymentPage.ValidateOr_PayWithOption_Text();
			String ExpectedText = " Of betaal met ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else if (ActualText.equals(ExpectedText)) {
				test.pass("ActualText :" + ActualText + "is matching with the ExpectedText :" + ExpectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
				test.fail("ActualText :" + ActualText + "is not matching with the ExpectedText :" + ExpectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 9, enabled = true)
	public void Verify_MarchentNameText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_MarchentNameText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidateMarchentNameText();
			String expectedText = " Gerry Lianos ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 10, enabled = true)
	public void Verify_Non_EditableAmmountInfoText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Non_EditableAmmountInfoText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateNonEditableAmountInfoText();

			if (flag == true) {
				test.pass("Non_EditableAmmountInfoText is displayed successfully");
			} else {
				test.fail("Non_EditableAmmountInfoText is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 11, enabled = true)
	public void Verify_Selected_TicketsList_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Selected_TicketsList_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidateSelected_TicketsList_Text();
			String expectedText = " Raffolux - 4 tickets ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 12, enabled = true)
	public void Verify_Currency_Symbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Currency_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateCurrency_Symbol();

			if (flag == true) {
				test.pass("Currency_Symbol is displayed successfully");
			} else {
				test.fail("Currency_Symbol is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 13, enabled = true)
	public void Verify_Formatted_Amount_Of_Selected_Tickets() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Formatted_Amount_Of_Selected_Tickets").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidateFormatted_Amount_Of_Selected_Tickets();
			String expectedText = " 11.96 ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 14, enabled = true)
	public void Verify_PaymentCodeText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_PaymentCodeText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidatePaymentCodeText();
			String expectedText = " Payment code ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 15, enabled = true)
	public void Verify_GeneratedPaymentCode() throws Throwable {
		ExtentTest test = extent.createTest("Verify_GeneratedPaymentCode").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidatePaymentCodeText();
			String expectedText = " 7106183276860816 ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 16, enabled = true)
	public void Verify_PaymentCodeExpiryText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_PaymentCodeExpiryText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidatePaymentCodeExpiryText();
			String expectedText = " Payment code expiry ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 16, enabled = true)
	public void Verify_PaymentCodeExpiryDate() throws Throwable {
		ExtentTest test = extent.createTest("Verify_PaymentCodeExpiryDate").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidatePaymentCodeExpiryDate();
			String expectedText = " 23/01/2023, 12:50 ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 17, enabled = true)
	public void Verify_PoweredByLogo_WrapperText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_PoweredByLogo_WrapperText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidatePoweredByLogo_WrapperText();
			String expectedText = "Powered by";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 18, enabled = true)
	public void Verify_Viva_WalletLogo_WrapperText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Viva_WalletLogo_WrapperText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			String actualText = paymentPage.ValidateViva_WalletLogo_WrapperText();
			String expectedText = " Viva Wallet ";

			if (actualText.equals(expectedText)) {
				test.pass("actualText :" + actualText + "is matching with the expectedText :" + expectedText);
			} else {
				test.fail("actualText :" + actualText + "is not matching with the expectedText :" + expectedText);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 19, enabled = true)
	public void Verify_Viva_WalletLogo_Symbol() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Viva_WalletLogo_Symbol").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateViva_WalletLogo_Symbol();

			if (flag == true) {
				test.pass("Viva_WalletLogo_Symbol is displayed successfully");
			} else {
				test.fail("Viva_WalletLogo_Symbol is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 20, enabled = true)
	public void Verify_GooglePayPaymentOption_Button() throws Throwable {
		ExtentTest test = extent.createTest("Verify_GooglePayPaymentOption_Button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateGooglePayPaymentOption_Button();

			if (flag == true) {
				test.pass("GooglePayPaymentOption_Button is displayed successfully");
			} else {
				test.fail("GooglePayPaymentOption_Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 21, enabled = false)
	public void Verify_By_Clicking_GooglePayPaymentOption_Button() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_GooglePayPaymentOption_Button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ClickonGooglePayPaymentOption_Button();

			if (flag == true) {
				test.pass("GooglePayPaymentOption_Button is displayed successfully");
			} else {
				test.fail("GooglePayPaymentOption_Button is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 22, enabled = true)
	public void Verify_Saved_Cards_Toggle() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Saved_Cards_Toggle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			boolean flag = paymentPage.ValidateSaved_Cards_Toggle();

			if (flag == true) {
				test.pass("Saved_Cards_Toggle is displayed successfully");
			} else {
				test.fail("Saved_Cards_Toggle is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 23, enabled = true)
	public void Verify_By_Clicking_Saved_Cards_Toggle() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_Saved_Cards_Toggle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonSaved_Cards_Toggle();
			boolean flag = paymentPage.Validate_One_Of_The_Saved_Card();
			if (flag == true) {
				test.pass("One_Of_The_Saved_Card is displayed successfully");
			} else {
				test.fail("One_Of_The_Saved_Card is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 24, enabled = true)
	public void Verify_Other_Cards_Toggle() throws Throwable {
		ExtentTest test = extent.createTest("Verify_Other_Cards_Toggle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonSaved_Cards_Toggle();
			boolean flag = paymentPage.ValidateOther_Cards_Toggle();
			if (flag == true) {
				test.pass("Other_Cards_Toggle is displayed successfully");
			} else {
				test.fail("Other_Cards_Toggle is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 25, enabled = true)
	public void Verify_By_Clicking_Other_Cards_Toggle() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_Other_Cards_Toggle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonOther_Cards_Toggle();
			boolean flag = paymentPage.ValidateEmailAddress_TextField();

			if (flag == true) {
				test.pass("Other_Cards_Toggle is displayed successfully");
			} else {
				test.fail("Other_Cards_Toggle is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 26, enabled = true)
	public void Verify_EmailAddress_TextField() throws Throwable {
		ExtentTest test = extent.createTest("Verify_EmailAddress_TextField").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonOther_Cards_Toggle();
			boolean flag = paymentPage.ValidateEmailAddress_TextField();

			if (flag == true) {
				test.pass("EmailAddress_TextField is displayed successfully");
			} else {
				test.fail("EmailAddress_TextField is not displayed");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 27, enabled = true)
	public void Verify_By_Clicking_EmailAddress_TextField() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Clicking_EmailAddress_TextField").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonOther_Cards_Toggle();
			boolean flag = paymentPage.ClickonEmailAddress_TextField();

			if (flag == true) {
				test.pass("EmailAddress_TextField is displayed successfully");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("EmailAddress_TextField is not displayed");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	@Test(priority = 28, enabled = true)
	public void Verify_EmailAddress_LableText() throws Throwable {
		ExtentTest test = extent.createTest("Verify_EmailAddress_LableText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		try {
			paymentPage.ClickonOther_Cards_Toggle();
			boolean flag = paymentPage.ValidateEmailAddress_LableText();

			if (flag == true) {
				test.pass("EmailAddress_LableText is displayed successfully");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("EmailAddress_LableText is not displayed");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("=========================== Exception Alert =========================================");
		}

	}

	/*
	 * @Test(priority = 28, enabled = false) public void
	 * Verify_By_Entering_ValidInputToEmailAddress_TextField() throws Throwable {
	 * ExtentTest test =
	 * extent.createTest("Verify_By_Entering_ValidInputToEmailAddress_TextField").
	 * assignAuthor("Dharma")
	 * .assignCategory("Functional testing").assignDevice("Windows");
	 * 
	 * signInPage = indexPage.ClickOnSigninLink(); homePage =
	 * signInPage.Signin(prop.getProperty("UserName"),
	 * prop.getProperty("PassWord")); rafflePageAfterLogin =
	 * homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle(); //
	 * rafflePageAfterLogin.ClickonSelectDropdown();
	 * rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
	 * rafflePageAfterLogin.ClickonEnterBtn(); cartSummaryPage =
	 * rafflePageAfterLogin.Click_On_Cart_Notifications_logo(); Thread.sleep(2000);
	 * paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
	 * Thread.sleep(2000);
	 * 
	 * paymentPage.ClickonOther_Cards_Toggle(); boolean flag =
	 * paymentPage.Validate_By_Entering_ValidInputToEmailAddress_TextField();
	 * 
	 * if(flag == true) {
	 * test.pass("EmailAddress_LableText is displayed successfully");
	 * test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver)); }else {
	 * test.fail("EmailAddress_LableText is not displayed");
	 * test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver)); } }
	 * 
	 * @Test(priority = 28, enabled = false) public void
	 * Verify_By_Entering_ValidInputToEmailAddress_TextField() throws Throwable {
	 * ExtentTest test =
	 * extent.createTest("Verify_By_Entering_ValidInputToEmailAddress_TextField").
	 * assignAuthor("Dharma")
	 * .assignCategory("Functional testing").assignDevice("Windows"); signInPage =
	 * indexPage.ClickOnSigninLink(); homePage =
	 * signInPage.Signin(prop.getProperty("UserName"),
	 * prop.getProperty("PassWord")); rafflePageAfterLogin =
	 * homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle(); //
	 * rafflePageAfterLogin.ClickonSelectDropdown(); Thread.sleep(2000);
	 * rafflePageAfterLogin.SelectedTicketsFromSelectDropdown(); Thread.sleep(2000);
	 * rafflePageAfterLogin.ClickonEnterBtn(); try { cartSummaryPage =
	 * rafflePageAfterLogin.Click_On_Cart_Notifications_logo(); Thread.sleep(2000);
	 * paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
	 * Thread.sleep(2000); } catch(Exception e) {
	 * System.out.println(e.getStackTrace()); } FileInputStream file = new
	 * FileInputStream(
	 * "C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
	 * XSSFWorkbook workbook = new XSSFWorkbook(file); XSSFSheet sheet =
	 * workbook.getSheet("Sheet4"); int NoOfRows = sheet.getLastRowNum();
	 * 
	 * System.out.println("The NO of records in the excell sheet " + NoOfRows);
	 * 
	 * 
	 * for(int i=1;i<=7; i++) { XSSFRow current_row = sheet.getRow(i); String
	 * Invalid_Email = current_row.getCell(0).getStringCellValue(); /*int DOB =
	 * (int)current_row.getCell(3).getNumericCellValue(); String Email_Id =
	 * current_row.getCell(1).getStringCellValue(); long Phone_Number =
	 * (long)current_row.getCell(2).getNumericCellValue();
	 */

	/*
	 * String Invalid_CH_Name = current_row.getCell(1).getStringCellValue(); String
	 * Invalid_CardNumber = current_row.getCell(2).getStringCellValue(); int
	 * Invalid_ExpiryDate = (int)current_row.getCell(3).getNumericCellValue(); int
	 * Invalid_Cvv = (int)current_row.getCell(4).getNumericCellValue(); String
	 * Invalid_Remember_Card = current_row.getCell(0).getStringCellValue();
	 */

	// paymentPage.ClearTheTextField();
	/*
	 * paymentPage.Validate_By_entering_Invalid_Email(Invalid_Email);
	 * 
	 * boolean flag = paymentPage.Validate_Email_Address_Error_Message(); if(flag ==
	 * true) { test.pass("Email_Address_Error_Message is displayed successfully"); }
	 * else { test.fail("Email_Address_Error_Message is not displayed"); }
	 * 
	 * 
	 * } }
	 */

	@Test(priority = 29, enabled = false)
	public void Verify_By_Entering_ValidInputToCardHolderName_TextField() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_Entering_ValidInputToCardHolderName_TextField")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");
		signInPage = indexPage.ClickOnSigninLink();
		homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		rafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		// rafflePageAfterLogin.ClickonSelectDropdown();
		Thread.sleep(2000);
		rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
		Thread.sleep(2000);
		rafflePageAfterLogin.ClickonEnterBtn();
		try {
			cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
			Thread.sleep(2000);
			paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		FileInputStream file = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet4");
		int NoOfRows = sheet.getLastRowNum();

		System.out.println("The NO of records in the excell sheet " + NoOfRows);

		for (int i = 1; i <= 7; i++) {
			XSSFRow current_row = sheet.getRow(i);
			// String Invalid_Email = current_row.getCell(0).getStringCellValue();

			/*
			 * int DOB = (int)current_row.getCell(3).getNumericCellValue(); String Email_Id
			 * = current_row.getCell(1).getStringCellValue(); long Phone_Number =
			 * (long)current_row.getCell(2).getNumericCellValue();
			 */

			/*
			 * String Invalid_CH_Name = current_row.getCell(1).getStringCellValue(); String
			 * Invalid_CardNumber = current_row.getCell(2).getStringCellValue(); int
			 * Invalid_ExpiryDate = (int)current_row.getCell(3).getNumericCellValue(); int
			 * Invalid_Cvv = (int)current_row.getCell(4).getNumericCellValue(); String
			 * Invalid_Remember_Card = current_row.getCell(0).getStringCellValue();
			 */

			// paymentPage.ClearTheTextField();
			try {
				String Invalid_CH_Name = current_row.getCell(1).getStringCellValue();
				paymentPage.Validate_By_entering_Invalid_CH_Name(Invalid_CH_Name);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
				System.out.println("=====================  Exception Alert  ======================================="
						+ e.getMessage());

			}

			boolean flag = paymentPage.ValidateCardHolderName_LableText();
			if (flag == true) {
				test.pass("CardHolderName_LableText is displayed successfully");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("CardHolderName_LableText is not displayed");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		}
	}

	@Test(priority = 30, enabled = false)
	public void Verify_By_entering_InvalidInputTo_CardNumber_TextField() throws Throwable {
		ExtentTest test = extent.createTest("Verify_By_entering_InvalidInputTo_CardNumber_TextField")
				.assignAuthor("Dharma").assignCategory("Functional testing").assignDevice("Windows");
		signInPage = indexPage.ClickOnSigninLink();
		homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		rafflePageAfterLogin = homePage.Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle();
		// rafflePageAfterLogin.ClickonSelectDropdown();
		Thread.sleep(2000);
		rafflePageAfterLogin.SelectedTicketsFromSelectDropdown();
		Thread.sleep(2000);
		rafflePageAfterLogin.ClickonEnterBtn();
		try {
			cartSummaryPage = rafflePageAfterLogin.Click_On_Cart_Notifications_logo();
			Thread.sleep(2000);
			paymentPage = cartSummaryPage.ClickonCheckOutButtonOption();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		FileInputStream file = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet4");
		int NoOfRows = sheet.getLastRowNum();

		System.out.println("The NO of records in the excell sheet " + NoOfRows);

		for (int i = 1; i <= 7; i++) {
			XSSFRow current_row = sheet.getRow(i);
			// String Invalid_Email = current_row.getCell(0).getStringCellValue();

			/*
			 * int DOB = (int)current_row.getCell(3).getNumericCellValue(); String Email_Id
			 * = current_row.getCell(1).getStringCellValue(); long Phone_Number =
			 * (long)current_row.getCell(2).getNumericCellValue();
			 */

			/*
			 * String Invalid_CH_Name = current_row.getCell(1).getStringCellValue(); String
			 * Invalid_CardNumber = current_row.getCell(2).getStringCellValue(); int
			 * Invalid_ExpiryDate = (int)current_row.getCell(3).getNumericCellValue(); int
			 * Invalid_Cvv = (int)current_row.getCell(4).getNumericCellValue(); String
			 * Invalid_Remember_Card = current_row.getCell(0).getStringCellValue();
			 */

			// paymentPage.ClearTheTextField();
			try {
				String Invalid_CH_Name = current_row.getCell(1).getStringCellValue();
				paymentPage.Validate_By_entering_Invalid_CH_Name(Invalid_CH_Name);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
				System.out.println("=====================  Exception Alert  ======================================="
						+ e.getMessage());

			}

			boolean flag = paymentPage.ValidateCardHolderName_LableText();
			if (flag == true) {
				test.pass("CardHolderName_LableText is displayed successfully");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			} else {
				test.fail("CardHolderName_LableText is not displayed");
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}

		}
	}
}
