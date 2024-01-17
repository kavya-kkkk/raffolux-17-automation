/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.CharityPageAfterLogin;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.SignInPage;

/**
 * @author hp
 * Here in this CharityPageAfterLoginTest we cannot automate
 * the web elements which are present on the each of the charity options (So we need to Test them Manually)
 */
public class CharityPageAfterLoginTest extends BaseClass
{
	CharityPageAfterLogin charityPageAfterLogin;
	SignInPage signInPage;
	HomePage homePage;
	
	@Test(priority = 0, enabled = true)
	public void VerifyCharityPageAfterLoginUrl() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  CharityPageAfterLoginUrl").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 driver.get("https://sandbox.raffolux.com/");
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 try
		 {
			 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 String actualUrl= driver.getCurrentUrl();
		 String expectedUrl = "https://raffolux.com/charities/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+ actualUrl + " is matching with the expectedUrl"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+ actualUrl + " is not matching with the expectedUrl"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 1, enabled = true)
	public void VerifyCharityRibbonLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  CharityRibbonLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = charityPageAfterLogin.ValidateCharityRibbonLogo();
		 if(flag == true)
		 {
			 test.pass("CharityRibbonLogo is Successfully Displayed  :" +flag);
		 }
		 else
		 {
			 test.fail("CharityRibbonLogo is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 2, enabled = true)
	public void VerifyTotalRaisedForCharityText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalRaisedForCharityText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String actualText = charityPageAfterLogin.ValidateTotalRaisedForCharityText();
		 String expectedText = "Total raised for charity";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 3, enabled = true)
	public void VerifyTotalMoneyRaisedForCharityInPounds() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalMoneyRaisedForCharityInPounds").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String actualText = charityPageAfterLogin.ValidateTotalMoneyRaisedForCharityInPounds();
		 String expectedText = "£501,339";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 4, enabled = true)
	public void VerifyOneOftheCharityOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  OneOftheCharityOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = charityPageAfterLogin.ValidateOneOftheCharityOption();
		 if(flag == true)
		 {
			 test.pass("OneOftheCharityOption is Successfully Displayed  :" +flag);
		 }
		 else
		 {
			 test.fail("OneOftheCharityOption is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 5, enabled = true)
	public void ClickonOneOftheCharityOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the OneOftheCharityOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 charityPageAfterLogin.ClickonOneOftheCharityOption();
		 boolean flag = charityPageAfterLogin.ValidateActionAidUKCharityOption();
		 if(flag == true)
		 {
			 test.pass("ActionAidUKCharityOption is Successfully Displayed  :" +flag);
		 }
		 else
		 {
			 test.fail("ActionAidUKCharityOption is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
	}
	
	@Test(priority = 6, enabled = true)
	public void VerifyRaffoluxMakesDonationsToItsCharityInformationText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RaffoluxMakesDonationsToItsCharityInformationText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 //charityPage.ClickonOneOftheCharityOption();
		 boolean flag = charityPageAfterLogin.ValidateRaffoluxMakesDonationsToItsCharityInformationText();
		 if(flag == true)
		 {
			 test.pass("RaffoluxMakesDonationsToItsCharityInformationText is Successfully Displayed  :" +flag);
		 }
		 else
		 {
			 test.fail("RaffoluxMakesDonationsToItsCharityInformationText is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 7, enabled = true)
	public void VerifyMouseHovOverOneOftheCharityOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by MouseHovOverOneOftheCharityOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 //charityPage.ClickonOneOftheCharityOption();
		 charityPageAfterLogin.ValidateMouseHovOverOneOftheCharityOption();
		 boolean flag = charityPageAfterLogin.ValidateOneOftheCharityOption();
		 if(flag == true)
		 {
			 test.pass("MouseHovOverOneOftheCharityOption is performed Successfully   :" +flag);
			 Thread.sleep(2000);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("MouseHovOverOneOftheCharityOption is Not performed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	//--------------------------------------------------------------After Seleceing the Charity option.
	
	@Test(priority = 8, enabled = true)
	public void VerifyMyCharityTitleText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  MyCharityTitleText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String actualText = charityPageAfterLogin.ValidateMyCharityTitleText();
		 String expectedText = "My Charity";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 9, enabled = true)
	public void VerifyYourCurrentCharitySponserIsText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  YourCurrentCharitySponserIsText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String actualText = charityPageAfterLogin.ValidateYourCurrentCharitySponserIsText();
		 String expectedText = "Your current charity sponsor is Alzheimer’s Society";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 10, enabled = true)
	public void VerifySelectedCharityName() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  SelectedCharityName").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 String actualText = charityPageAfterLogin.ValidateSelectedCharityName();
		 String expectedText = "Alzheimer’s Society";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 11, enabled = true)
	public void VerifySelectedCharityLogo() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify SelectedCharityLogo").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = charityPageAfterLogin.ValidateSelectedCharityLogo();
		 if(flag == true)
		 {
			 test.pass("SelectedCharityLogo is Displayed Successfully   :" +flag);
		 }
		 else
		 {
			 test.fail("SelectedCharityLogo is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 12, enabled = true)
	public void VerifyTotalDonatedTextOption() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalDonatedTextOption").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 String actualText = charityPageAfterLogin.ValidateTotalDonatedTextOption();
		 String expectedText = "TOTAL DONATED";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 13, enabled = true)
	public void VerifyTotalDonatedMoneyInPounds() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  TotalDonatedMoneyInPounds").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 String actualText = charityPageAfterLogin.ValidateTotalDonatedMoneyInPounds();
		 String expectedText = "£35,723";
		 if(actualText.equals(expectedText))
		 {
			 test.pass("actualText  :"+ actualText + " is matching with the expectedText   :"+expectedText);
		 }
		 else
		 {
			 test.fail("actualText  :"+ actualText + " is not matching with the expectedText   :"+expectedText);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 14, enabled = true)
	public void VerifyInformationTextAboutSelectedCharity() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify InformationTextAboutSelectedCharity").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 boolean flag = charityPageAfterLogin.ValidateInformationTextAboutSelectedCharity();
		 if(flag == true)
		 {
			 test.pass("InformationTextAboutSelectedCharity is Displayed Successfully   :" +flag);
		 }
		 else
		 {
			 test.fail("InformationTextAboutSelectedCharity is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 15, enabled = true)
	public void VerifyJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify JoinSelectedCharityNewsLetterLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 boolean flag = charityPageAfterLogin.ValidateJoinSelectedCharityNewsLetterLink();
		 if(flag == true)
		 {
			 test.pass("JoinSelectedCharityNewsLetterLink is Displayed Successfully   :" +flag);
		 }
		 else
		 {
			 test.fail("JoinSelectedCharityNewsLetterLink is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 16, enabled = true)
	public void VerifyMouseHovOverJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by MouseHovOverJoinSelectedCharityNewsLetterLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 
		 //charityPage.ClickonOneOftheCharityOption();
		 charityPageAfterLogin.MouseHovOverJoinSelectedCharityNewsLetterLink();
		 boolean flag = charityPageAfterLogin.ValidateOneOftheCharityOption();
		 if(flag == true)
		 {
			 test.pass("MouseHovOverJoinSelectedCharityNewsLetterLink is performed Successfully   :" +flag);
			 Thread.sleep(2000);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("MouseHovOverJoinSelectedCharityNewsLetterLink is Not performed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 17, enabled = true)
	public void ClickonJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  JoinSelectedCharityNewsLetterLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 charityPageAfterLogin.ClickonJoinSelectedCharityNewsLetterLink();
		 String actualUrl= driver.getCurrentUrl();
		 String expectedUrl = "https://www.alzheimers.org.uk/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+ actualUrl + " is matching with the expectedUrl"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+ actualUrl + " is not matching with the expectedUrl"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
		 
	}
	
	@Test(priority = 18, enabled = true)
	public void VerifyViewWebSiteLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify ViewWebSiteLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
		 boolean flag = charityPageAfterLogin.ValidateViewWebSiteLink();
		 if(flag == true)
		 {
			 test.pass("ViewWebSiteLink is Displayed Successfully   :" +flag);
		 }
		 else
		 {
			 test.fail("ViewWebSiteLink is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 19, enabled = true)
	public void VerifyMouseHovOverViewWebSiteLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by MouseHovOverViewWebSiteLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
		 //charityPage.ClickonOneOftheCharityOption();
		 charityPageAfterLogin.MouseHovOverViewWebSiteLink();
		 boolean flag = charityPageAfterLogin.ValidateOneOftheCharityOption();
		 if(flag == true)
		 {
			 test.pass("MouseHovOverViewWebSiteLink is performed Successfully   :" +flag);
			 Thread.sleep(2000);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("MouseHovOverViewWebSiteLink is Not performed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 20, enabled = true)
	public void ClickonViewWebSiteLink() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the  ClickonViewWebSiteLink").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
		 charityPageAfterLogin.ClickonViewWebSiteLink();
		 String actualUrl= driver.getCurrentUrl();
		 String expectedUrl = "https://www.alzheimers.org.uk/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+ actualUrl + " is matching with the expectedUrl"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+ actualUrl + " is not matching with the expectedUrl"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 charityPageAfterLogin = homePage.ClickonFooterCharityLink();
	}
	
}
