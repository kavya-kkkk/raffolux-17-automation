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
import com.raffolux.pages.HomePage;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.SignUpPage;

/**
 * @author hp
 *
 */
public class SignUpTest extends BaseClass
{
	SignUpPage signUpPage;
	
	@Test(priority = 0, enabled = true)
	public void Verify_CreateAccountTest() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_CreateAccountTest").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		driver.get("https://sandbox.raffolux.com/");
		
		signUpPage = indexPage.ClickonRaffoluxLink();
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int NoOfRows = sheet.getLastRowNum();
		
		System.out.println("The NO of records in the excell sheet " + NoOfRows);
		
		
		for(int i=1; i<3; i++)
		{
			 XSSFRow current_row = sheet.getRow(i);
			 
		    String First_Name = current_row.getCell(0).getStringCellValue();
		    String Last_Name = current_row.getCell(1).getStringCellValue();
		    String Email_Id = current_row.getCell(2).getStringCellValue();
		    long Phone_Number = (long)current_row.getCell(3).getNumericCellValue();
		    String Choose_Password = current_row.getCell(4).getStringCellValue();
		    String Confirm_Password = current_row.getCell(5).getStringCellValue();
		    
		    signUpPage.CreateAccount(First_Name, Last_Name, Email_Id, String.valueOf(Phone_Number), Choose_Password, Confirm_Password);
		    String actualUrl =  driver.getCurrentUrl();
		    String expectedUrl = "https://raffolux.com/";
			if(actualUrl.equals(expectedUrl))
			{
				test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			}
			else
			{
				test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}	
		  
		}
		
	}
	
	@Test(priority = 1, enabled = true)
	public void Verify_SignUpTitle() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_SignUpTitle").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateSignUpTitle();
		if(flag == true)
		{
			test.pass("SignUpTitle is displayed successfully");
		}
		else
		{
			test.fail("SignUpTitle is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		
	}
	
	@Test(priority = 2, enabled = true)
	public void Verify_AlreadyMemberText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_AlreadyMemberText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateAlreadyMemberText();
		if(flag == true)
		{
			test.pass("AlreadyMemberText is displayed successfully");
		}
		else
		{
			test.fail("AlreadyMemberText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 3, enabled = true)
	public void Verify_By_ClickonSignInLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickonSignInLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickOnSignLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/accounts/login/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		indexPage.ClickonRaffoluxLink();
	}
	
	@Test(priority = 4, enabled = true)
	public void Verify_FirstNameLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_FirstNameLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.Validatefirst_nameLabelText();
		if(flag == true)
		{
			test.pass("FirstNameLabelText is displayed successfully");
		}
		else
		{
			test.fail("FirstNameLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 5, enabled = true)
	public void Verify_LastNameLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_LastNameLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.Validatelast_nameLabelText();
		if(flag == true)
		{
			test.pass("LastNameLabelText is displayed successfully");
		}
		else
		{
			test.fail("LastNameLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 6, enabled = true)
	public void Verify_EmailIdLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_EmailIdLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateemailIDLabelText();
		if(flag == true)
		{
			test.pass("EmailIdLabelText is displayed successfully");
		}
		else
		{
			test.fail("EmailIdLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 7, enabled = true)
	public void Verify_PhonenumberLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_PhonenumberLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidatePhoneNumberLabelText();
		if(flag == true)
		{
			test.pass("PhonenumberLabelText is displayed successfully");
		}
		else
		{
			test.fail("PhonenumberLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 8, enabled = true)
	public void Verify_ChoosepasswordLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_ChoosepasswordLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateChoosePasswordLabelText();
		if(flag == true)
		{
			test.pass("ChoosepasswordLabelText is displayed successfully");
		}
		else
		{
			test.fail("ChoosepasswordLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 9, enabled = true)
	public void Verify_ConfirmpasswordLabelText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_ConfirmpasswordLabelText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateConfirmPasswordLabelText();
		if(flag == true)
		{
			test.pass("ConfirmpasswordLabelText is displayed successfully");
		}
		else
		{
			test.fail("ConfirmpasswordLabelText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 10, enabled = true)
	public void Verify_TermsAndConditionLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_TermsAndConditionLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateTermsAndConditionsLink();
		if(flag == true)
		{
			test.pass("TermsAndConditionLink is displayed successfully");
		}
		else
		{
			test.fail("TermsAndConditionLink is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 11, enabled = true)
	public void Mouse_Hov_Over_TermsAndConditionLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_TermsAndConditionLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateTermsAndConditionsLink();
		if(flag == true)
		{
			test.pass("Mouse_Hov_Over_TermsAndConditionLink is successfully");
		}
		else
		{
			test.fail("Not Mouse_Hov_Over_TermsAndConditionLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 12, enabled = true)
	public void Verify_By_ClickingonTermsAndConditionLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonTermsAndConditionLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonTermsAndConditionsLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://raffolux.com/tcs/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		indexPage.ClickonRaffoluxLink();
	}
	
	@Test(priority = 13, enabled = true)
	public void Verify_PrivacyPloicyLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_PrivacyPloicyLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidatePrivacyPolicyLink();
		if(flag == true)
		{
			test.pass("PrivacyPloicyLink is displayed successfully");
		}
		else
		{
			test.fail("PrivacyPloicyLink is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 14, enabled = true)
	public void Mouse_Hov_Over_PrivacyPloicyLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_PrivacyPloicyLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidatePrivacyPolicyLink();
		if(flag == true)
		{
			test.pass("Mouse_Hov_Over_PrivacyPloicyLink is successfully");
		}
		else
		{
			test.fail("Not Mouse_Hov_Over_PrivacyPloicyLink");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 15, enabled = true)
	public void Verify_By_ClickingonPrivacypolicyLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Mouse_Hov_Over_PrivacyPloicyLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonPrivacyPolicyLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://raffolux.com/privacy/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		indexPage.ClickonRaffoluxLink();
	}
	
	@Test(priority = 16, enabled = true)
	public void Verify_OrSignUpViaText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_OrSignUpViaText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateSignUpViaText();
		if(flag == true)
		{
			test.pass("OrSignUpViaText is displayed successfully");
		}
		else
		{
			test.fail("OrSignUpViaText is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 17, enabled = true)
	public void Verify_SignUpFacebookLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_SignUpFacebookLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateSignUpFaceBookLogo();
		if(flag == true)
		{
			test.pass("SignUpFacebookLogo is displayed successfully");
		}
		else
		{
			test.fail("SignUpFacebookLogo is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 18, enabled = false)
	public void Verify_By_ClickingonSignUpFacebookLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonSignFacebookLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonSignUpFaceBookLogo();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/login.php?skip_api_login=1&api_key=700027233954487&kid_directed_site=0&app_id=700027233954487&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv12.0%2Fdialog%2Foauth%3Fclient_id%3D700027233954487%26redirect_uri%3Dhttps%253A%252F%252Fraffolux.com%252Foauth%252Fcomplete%252Ffacebook%252F%26state%3DsbsNKD7yFcPyferCEZWDwgd4FwTeT8EP%26return_scopes%3Dtrue%26scope%3Demail%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3Ddbf163c4-fb78-41e9-88cd-619abbaa7254%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fraffolux.com%2Foauth%2Fcomplete%2Ffacebook%2F%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DsbsNKD7yFcPyferCEZWDwgd4FwTeT8EP%23_%3D_&display=page&locale=en_GB&pl_dbl=0";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 19, enabled = true)
	public void Verify_SignUpGoogleLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_SignUpGoogleLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		boolean flag = signUpPage.ValidateSignUpGoogleLogo();
		if(flag == true)
		{
			test.pass("SignUpGoogleLogo is displayed successfully");
		}
		else
		{
			test.fail("SignUpGoogleLogo is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 20, enabled = false)
	public void Verify_By_ClickingonSignUpGoogleLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonSignUpGoogleLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonSignUpGoogleLogo();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://raffolux.com/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 21, enabled = true)
	public void Verify_ContinueAsDharmaveeraBtn() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonSignUpFacebookLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonSignUpFaceBookLogo();
		Thread.sleep(2000);
		boolean flag = signUpPage.ValidateContinueAsDharmaveeraBtn();
		if(flag == true)
		{
			test.pass("ContinueAsDharmaveeraBtn is displayed successfully");
		}
		else
		{
			test.fail("ContinueAsDharmaveeraBtn is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	
	//Login through facebook
	@Test(priority = 22, enabled = false)
	public void Verify_LoginThroughFacebookSocialmedia() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_LoginThroughFacebookSocialmedia").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		signUpPage.ClickonSignUpFaceBookLogo();
		Thread.sleep(2000);
		signUpPage.LoginThroughFacebookSocialmedia("h.dharmaveera1998@gmail.com", "Dharma@8103");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
		}
		else
		{
			test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	/*@Test(priority = 19, enabled = false)
	public void Verify_By_ClickingOnContinueAsDharmaveeraBtn() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_By_ClickingonSignUpFacebookLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		signUpPage = indexPage.ClickonRaffoluxLink();
		Thread.sleep(2000);
		signUpPage.ClickonSignUpFaceBookLogo();
		Thread.sleep(2000);
		boolean flag = signUpPage.ClickonContinueAsDharmaveeraBtn();
		if(flag == true)
		{
			test.pass("ContinueAsDharmaveeraBtn is displayed successfully");
		}
		else
		{
			test.fail("ContinueAsDharmaveeraBtn is not displayed");
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 21, enabled = false)
	public void ClickonOneOfTheEmailAccount() throws Throwable
	{
		signUpPage = indexPage.ClickonRaffoluxLink();
		Thread.sleep(2000);
		signUpPage.ClickonSignUpGoogleLogo();
		Thread.sleep(2000);
		signUpPage.ClickonTheOneOfTheEmailAccount();
	}
	
	*/
	
	
	
	

}
