/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.CharityPage;


/**
 * @author hp
 *
 */
public class CharityPageTest extends BaseClass
{
	CharityPage charityPage;
	
	@Test(priority = 0, enabled = true)
	public void VerifyCharityPageUrl() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  CharityPageUrl").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 driver.get("https://sandbox.raffolux.com/");
		 charityPage = indexPage.ClickOnCharityLink();
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
		
		
		 boolean flag = charityPage.ValidateCharityRibbonLogo();
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
		
		 
		 String actualText = charityPage.ValidateTotalRaisedForCharityText();
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
		
		 
		 String actualText = charityPage.ValidateTotalMoneyRaisedForCharityInPounds();
		 String expectedText = "£594,828";
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
		
		
		 boolean flag = charityPage.ValidateOneOftheCharityOption();
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
		
		 
		 charityPage.ClickonOneOftheCharityOption();
		 boolean flag = charityPage.ValidateActionAidUKCharityOption();
		 if(flag == true)
		 {
			 test.pass("ActionAidUKCharityOption is Successfully Displayed  :" +flag);
		 }
		 else
		 {
			 test.fail("ActionAidUKCharityOption is Not Displayed    :" +flag);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 charityPage = indexPage.ClickOnCharityLink();
	}
	
	@Test(priority = 6, enabled = true)
	public void VerifyRaffoluxMakesDonationsToItsCharityInformationText() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the RaffoluxMakesDonationsToItsCharityInformationText").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		
		 //charityPage.ClickonOneOftheCharityOption();
		 boolean flag = charityPage.ValidateRaffoluxMakesDonationsToItsCharityInformationText();
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
		 charityPage.ValidateMouseHovOverOneOftheCharityOption();
		 boolean flag = charityPage.ValidateOneOftheCharityOption();
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

}
