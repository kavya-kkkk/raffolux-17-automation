/**
 * 
 */
package com.raffolux.testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.SignInPage;
import com.raffolux.utility.Log;

/**
 * @author hp
 *
 */
public class SignInPageTest extends BaseClass
{
	SignInPage signInPage;
	
	@Test(priority = 0, enabled = true)
	public void Verify_RaffoluxLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_RaffoluxLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 driver.get("https://sandbox.raffolux.com/");
		 signInPage = indexPage.ClickOnSigninLink();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Accept']")).click();
		 Thread.sleep(2000);
		 boolean flag = signInPage.ValidateRaffoluxLogo();
		 if(flag == true)
		 {
			 test.pass("RaffoluxLogo displayed successfully");
		 }
		 else
		 {
			 test.fail("RaffoluxLogo is not dispalyed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 
		 System.out.println("1");
	}
	
	@Test(priority = 1, enabled = true)
	public void Verify_charityLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_Charity_Link", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidatecharityLink();
		 if(flag == true)
		 {
			 test.pass("charityLink displayed successfully");
		 }
		 else
		 {
			 test.fail("charityLink is not dispalyed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("2");
	}
	
	@Test(priority = 2, enabled = true)
	public void Verify_JoinRaffoluxLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_JoinRaffoluxLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateRaffoluxLink();
		 if(flag == true)
		 {
			 test.pass("JoinRaffoluxLink displayed successfully");
		 }
		 else
		 {
			 test.fail("JoinRaffoluxLink is not dispalyed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("3");
	}
	
	@Test(priority = 3, enabled = true)
	public void Verify_SignLink() throws Throwable
	{
		ExtentTest test  = Action.Test_Description("Verify_SignLink", "Dharma", "Functional Testing", "Windows");	
		
		 boolean flag = signInPage.ValidateSignLink();
		 if(flag == true)
		 {
			 test.pass("Verify_SignLink displayed successfully");
		 }
		 else
		 {
			 test.fail("Verify_SignLink is not dispalyed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("4");
	}
	
	@Test(priority = 4, enabled = true)
	public void Verify_By_ClickingoncharityLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingoncharityLink", "Dharma", "Functional Testing", "Windows");
		
		
		 signInPage.ClickOnCharityLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/charities/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl :"+ actualUrl + "is not matching with expectedUrl :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 Thread.sleep(2000);
		 signInPage = indexPage.ClickOnSigninLink();
		 System.out.println("5");
	}
	
	@Test(priority = 5, enabled = true)
	public void Verify_By_ClickingonJoinRaffoluxLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonJoinRaffoluxLink", "Dharma", "Functional Testing", "Windows");
		
		
		 signInPage.ClickonRaffoluxLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/signup/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl :"+ actualUrl + "is not matching with expectedUrl :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 signInPage = indexPage.ClickOnSigninLink();
		 System.out.println("6");
	}
	
	@Test(priority = 6, enabled = true)
	public void Verify_By_ClickingonSigninLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonSigninLink", "Dharma", "Functional Testing", "Windows");
		
		 signInPage.ClickOnSigninLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/accounts/login/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl :"+ actualUrl + "is not matching with expectedUrl :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("7");
	}
	
	@Test(priority = 7, enabled = true)
	public void Mouse_Hov_OvercharityLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Mouse_Hov_OvercharityLink", "Dharma", "Functional Testing", "Windows");
		 
		 boolean flag = signInPage.mouseHoverOnCharityLink();
		 if(flag == true)
		 {
			 test.pass("Mouse_Hov_OvercharityLink  successfully");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("Not Mouse_Hov_OvercharityLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("8");
	}
	
	@Test(priority = 8, enabled = true)
	public void Mouse_Hov_OverJoinRaffoluxLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Mouse_Hov_OverJoinRaffoluxLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.mouseOveronRaffoluxLink();
		 if(flag == true)
		 {
			 test.pass("Mouse_Hov_OverJoinRaffoluxLink  successfully");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("Not Mouse_Hov_OverJoinRaffoluxLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("9");
	}
	
	@Test(priority = 9, enabled = true)
	public void Mouse_Hov_OverSignLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Mouse_Hov_OverSignLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.mouseHoverOnSigninLink();
		 if(flag == true)
		 {
			 test.pass("Mouse_Hov_OverSignLink  successfully");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("Not Mouse_Hov_OverSignLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("10");
	}
	
	@Test(priority = 10, enabled = true)
	public void Verify_SignInTitle() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_SignInTitle", "Dharma", "Functional Testing", "Windows");
		 
		 boolean flag = signInPage.ValidateSignInTitle();
		 if(flag == true)
		 {
			 test.pass("Verify_SignInTitle is displayed successfully");
		 }
		 else
		 {
			 test.fail("Verify_SignInTitle is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("11");
	}
	
	@Test(priority = 11, enabled = true)
	public void Verify_NotAMemberText() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_NotAMemberText", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateNotAMemberText();
		 if(flag == true)
		 {
			 test.pass("NotAMemberText is displayed successfully");
		 }
		 else
		 {
			 test.fail("NotAMemberText is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("12");
	}
	
	@Test(priority = 12, enabled = true)
	public void Verify_SignUpLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_SignUpLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateSignUpLink();
		 if(flag == true)
		 {
			 test.pass("SignUpLink is displayed successfully");
		 }
		 else
		 {
			 test.fail("SignUpLink is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 System.out.println("13");
	}
	
	@Test(priority = 13, enabled = true)
	public void Mouse_Hov_OverSignUpLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Mouse_Hov_OverSignUpLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.MousehovOverSignUpLink();
		 if(flag == true)
		 {
			 test.pass("Mouse_Hov_OverSignUpLink successfully");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("not Mouse_Hov_OverSignUpLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 14, enabled = true)
	public void Verify_By_ClickingonSignUpLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonSignUpLink", "Dharma", "Functional Testing", "Windows");
		
		 signInPage.ClickonSignUpLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/signup/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl :"+ actualUrl + "is not matching with expectedUrl :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		// Log.endTestcase("ClickonSignUpLink");
		 signInPage = indexPage.ClickOnSigninLink();
	}
	
	@Test(priority = 15, enabled = true)
	public void Verify_ForgotYourPasswordText() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_ForgotYourPasswordText", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateForgotYourPasswordText();
		 if(flag == true)
		 {
			 test.pass("ForgotYourPasswordText is displayed successfully");
		 }
		 else
		 {
			 test.fail("ForgotYourPasswordText is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 16, enabled = true)
	public void Verify_ResetPasswordLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_ResetPasswordLink", "Dharma", "Functional Testing", "Windows");
	
		 boolean flag = signInPage.ValidateResetPasswordLink();	 
		 if(flag == true)
		 {
			 test.pass("ResetPasswordLink is displayed successfully");
		 }
		 else
		 {
			 test.fail("ResetPasswordLink is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 17, enabled = true)
	public void Mouse_Hov_OverResetPasswordLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Mouse_Hov_OverResetPasswordLink", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.MousehovOverResetPasswordLink();	
		 if(flag == true)
		 {
			 test.pass("Mouse_Hov_OverResetPasswordLink successfully");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("Not Mouse_Hov_OverResetPasswordLink");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 18, enabled = true)
	public void Verify_By_ClickingonResetPasswordLink() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonResetPasswordLink", "Dharma", "Functional Testing", "Windows");
		 
		 signInPage.ClickonResetPasswordLink();
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://raffolux.com/accounts/password_reset/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl :"+ actualUrl + "is matching with expectedUrl :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 signInPage = indexPage.ClickOnSigninLink();
	}
	
	@Test(priority = 19, enabled = true)
	public void Verify_OrSignInViaText() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_OrSignInViaText", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValiadateOrSignInViaText();
		 if(flag == true)
		 {
			 test.pass("Verify_OrSignInViaText is displayed successfully");
		 }
		 else
		 {
			 test.fail("Verify_OrSignInViaText is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 20, enabled = true)
	public void Verify_SignInThroughFacebookLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_SignInThroughFacebookLogo", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateSignInThroughFacebookLogo(); 
		 if(flag == true)
		 {
			 test.pass("SignInThroughFacebookLogo is displayed successfully");
		 }
		 else
		 {
			 test.fail("SignInThroughFacebookLogo is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 21, enabled = true)
	public void Verify_SignInThroughTwitterLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_SignInThroughTwitterLogo", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateSignInThroughTwitterLogo();
		 if(flag == true)
		 {
			 test.pass("SignInThroughTwitterLogo is displayed successfully");
		 }
		 else
		 {
			 test.fail("SignInThroughTwitterLogo is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 22, enabled = true)
	public void Verify_SignInThroughGoogleLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_SignInThroughGoogleLogo", "Dharma", "Functional Testing", "Windows");
		
		 boolean flag = signInPage.ValidateSignInThroughGoogleLogo();
		 if(flag == true)
		 {
			 test.pass("SignInThroughGoogleLogo is displayed successfully");
		 }
		 else
		 {
			 test.fail("SignInThroughGoogleLogo is not displayed");
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 23, enabled = true)
	public void Verify_by_ClickingonSignInThroughFacebookLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_by_ClickingonSignInThroughFacebookLogo", "Dharma", "Functional Testing", "Windows");
		
		 signInPage.ClickonSignInThroughFacebookLogo();
		 //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "Log in to Facebook";
		 if(actualTitle.equals(expectedTitle))
		 {
			 test.pass("actualTitle :"+ actualTitle + "is matching with the expectedTitle :"+ expectedTitle);
		 }
		 else
		 {
			 test.fail("actualTitle :"+ actualTitle + "is matching with the expectedTitle :"+ expectedTitle);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		
	}
	
	@Test(priority = 24, enabled = true)
	public void Verify_By_ClickingonSignInThroughTwitterLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonSignInThroughTwitterLogo", "Dharma", "Functional Testing", "Windows");
		
		 signInPage.ClickonSignInThroughTwitterLogo();
		String actualTitle =  driver.getCurrentUrl();
		String expectedTitle = "Twitter/ Authorize an application";
		if(actualTitle.equals(expectedTitle))
		{
			test.pass("actualTitle :"+ actualTitle + "is matching with the expectedTitle :"+ expectedTitle);
		}
		else
		{
			test.fail("actualTitle :"+ actualTitle + "is matching with the expectedTitle :"+ expectedTitle);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	
	@Test(priority = 25, enabled = true)
	public void Verify_By_ClickingonSignInThroughGoogleLogo() throws Throwable
	{
		ExtentTest test = Action.Test_Description("Verify_By_ClickingonSignInThroughGoogleLogo", "Dharma", "Functional Testing", "Windows");
		 
		    signInPage.ClickonSignInThroughGoogleLogo();
		    String actualTitle=  driver.getTitle();
		    String expectedTitle = "Sign in - Google accounts";
			if(actualTitle.equals(expectedTitle))
			{
				test.pass("actualTitle :"+ actualTitle + "is matching with the expectedTitle :"+ expectedTitle);
			}
			else
			{
				test.fail("actualTitle :"+ actualTitle + "is not matching with the expectedTitle :"+ expectedTitle);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}	
	}
	
	// Testing the Login Functionality by fetching the data from the Excel sheet (Data Driven Framework )
	
	@Test(priority = 26, enabled = false)
	public void SignInTest() throws Throwable
	{
		ExtentTest test = Action.Test_Description("SignInTest", "Dharma", "Functional Testing", "Windows");
		test.info("Test Started");
		
		Log.startTestcase("SignInTest");
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\dharma.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int noOfrows = sheet.getLastRowNum();
		
		Log.startTestcase("SignInTest");
		System.out.println("The NO of records in the excell sheet " + noOfrows);
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);*/
		
		for(int row=3; row<noOfrows; row++)
		{
			try
			{
				
			XSSFRow current_row = sheet.getRow(row);
			Log.info("Going to enter the Username");
			String username = current_row.getCell(1).getStringCellValue();
			Log.info("Successfully entered Username");
			Log.info("Going to enter the Password");
			String password = current_row.getCell(2).getStringCellValue();
			Log.info("Successfully entered Password");
			
			
			 
				signInPage.Signin(username, password);
				
				String actualUrl = driver.getCurrentUrl();
				String expectedUrl = "https://raffolux.com/";      //Home page After login
				if(actualUrl.equals(expectedUrl))
				{
					test.pass("actualUrl "+ actualUrl + "is matching with the "+ expectedUrl);
				}
				else
				{
					test.fail("actualUrl "+ actualUrl + "is matching with the "+ expectedUrl);
					test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getStackTrace());
				System.out.println("Exception Occurs");
				test.fail("fail");
			}
			
			
			
		   /* driver.findElement(By.id("emailAddress")).sendKeys(username);
			Thread.sleep(3000);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);*/
			
			
			try
			{
				driver.navigate().refresh();
				WebElement ele = driver.findElement(By.id("emailAddress"));   // Exception message will come here
				ele.sendKeys(Keys.CONTROL+"ac");
				ele.clear();	
				Log.endTestcase("SignInTest");
			}
			catch(Exception e)
			{
				System.out.println("Exception :" +e.getStackTrace());
				System.out.println("=============Exception Alert======================");
			}
			
		}
		
		workbook.close();
		test.info("Test Completed");
		
	}
	

}
