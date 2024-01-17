package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.ResponsiblePlay_And_WellBeing_Page;

public class ResponsiblePlay_And_WellBeing_Page_Test extends BaseClass
{
	 
	ExtentTest test;
	ResponsiblePlay_And_WellBeing_Page responsiblePlay_And_WellBeing_Page;
	
	
	/*@Test(priority = 0, enabled = true)
   	public void ValidatePageTitle() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ValidatePageTitle").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 
   		System.out.println("1");
   	    driver.get("https://sandbox.raffolux.com/");
   		responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();	
   		System.out.println("2");
   		boolean flag = responsiblePlay_And_WellBeing_Page.ValidatePageTitle();
   		System.out.println("3");
   		 if(flag == true)
   		 {
   			test.pass("pass");
   		 }
   		 else
   		 {
   			test.pass("fail");
   		 }
    }*/
	
	@Test(priority = 1, enabled = true)
	public void Verify_Navigation_To_The_responsiblePlay_And_WellBeing_Page() throws Throwable
	{
		 ExtentTest test = extent.createTest("Verify Navigation_To_The_responsiblePlay_And_WellBeing_Page").assignAuthor("Dharma")
	   				.assignCategory("Smoke testing").assignDevice("Windows");
		 
		 driver.get("https://sandbox.raffolux.com/");
	   	 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();	
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}
	
	@Test(priority = 2, enabled = true)
   	public void VerifyResponsiblePlay_And_WellBeing_Page_Title() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ResponsiblePlay_And_WellBeing_Page_Title").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 String actualText = responsiblePlay_And_WellBeing_Page.ValidateResponsiblePlay_And_WellBeing_Page_Title();
   		 String expectedText = "Responsible Play & Wellbeing";
   		 if(actualText.equals(expectedText))
   		 {
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 3, enabled = true)
   	public void VerifyResponsiblePlay_And_WellBeing_Page_Text_Block() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ResponsiblePlay_And_WellBeing_Page_Text_Block").assignAuthor("Dharma")
   				.assignCategory("Smoke testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateResponsiblePlay_And_WellBeing_Page_Text_Block();
   		 //String expectedText = "Responsible Play & Wellbeing";
   		 if(flag == true)
   		 {
   			 
   			 test.pass("ResponsiblePlay_And_WellBeing_Page_Text_Block is displayed successfully  :"+flag);
   			 String text = responsiblePlay_And_WellBeing_Page.ValidateResponsiblePlay_And_WellBeing_Page_Text_Block1();
   			 //System.out.println(responsiblePlay_And_WellBeing_Page.ValidateResponsiblePlay_And_WellBeing_Page_Text_Block1());
   			 test.pass(text);
   		 }
   		 else
   		 {
   			 test.fail("ResponsiblePlay_And_WellBeing_Page_Text_Block is not displayed :"+flag);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 4, enabled = true)
   	public void VerifyValidateWellBeing_Text() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ValidateWellBeing_Text").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 String actualText = responsiblePlay_And_WellBeing_Page.ValidateWellBeing_Text();
   		 String expectedText = "Wellbeing";
   		 if(actualText.equals(expectedText))
   		 {
   			 //test.skip("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   			 test.pass("actualText  :"+actualText+"is matching with the expectedText   :"+expectedText);
   		 }
   		 else
   		 {
   			 test.fail("actualText  :"+actualText+"is not matching with the expectedText   :"+expectedText);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	@Test(priority = 5, enabled = true)
   	public void VerifyValidateWellBeing_Text_Block1() throws Throwable
   	{
   		 ExtentTest test = extent.createTest("Verify ValidateWellBeing_Text_Block1").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateWellBeing_Text_Block1();
   		 //String expectedText = "Responsible Play & Wellbeing";
   		 if(flag == true)
   		 {
   			 
   			 test.pass("ResponsiblePlay_And_WellBeing_Page_Text_Block is displayed successfully  :"+flag);
   			 String text = responsiblePlay_And_WellBeing_Page.ValidateWellBeing_Text_Block();
   			 //System.out.println(responsiblePlay_And_WellBeing_Page.ValidateResponsiblePlay_And_WellBeing_Page_Text_Block1());
   			 test.pass(text);
   		 }
   		 else
   		 {
   			 test.fail("ResponsiblePlay_And_WellBeing_Page_Text_Block is not displayed :"+flag);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
    }
	
	//
	@Test(priority = 6, enabled = true)
	public void Verify_mouse_Hov_Over_Gamble_Aware_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Gamble_Aware_Link").assignAuthor("Veera")
   				.assignCategory("Smoke testing").assignDevice("Windows");
   		 
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gamble_Aware_Link();
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGamble_Aware_Link();
   		 if(flag == true)
   		 {
   			 test.pass("Gamble_Aware_Link is displayed successfully  :"+flag);
   		 	 test.pass("mouse hovered over Gamble_Aware_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("Gamble_Aware_Link is not displayed   :"+flag);
   			 test.pass("mouse hovered over Gamble_Aware_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 7, enabled = false)
	public void Verify_by_Clicking_Gamble_Aware_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gamble_Aware_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGamble_Aware_Link();
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://www.begambleaware.org/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 
		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	@Test(priority = 8, enabled = true)
	public void Verify_mouse_Hov_Over_Gam_Care_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Gam_Care_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGam_Care_Link();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gam_Care_Link();
   		 if(flag == true)
   		 {
   			 test.pass("Gam_Care_Link is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over Gam_Care_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("Gam_Care_Link is not displayed   :"+flag);
   			 test.pass("mouse hovered over Gam_Care_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 9, enabled = false)
	public void Verify_by_Clicking_Gam_Care_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gam_Care_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 responsiblePlay_And_WellBeing_Page.ClickonGam_Care_Link();
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://www.gamcare.org.uk/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	//
	@Test(priority = 10, enabled = true)
	public void Verify_mouse_Hov_Over_Support_At_Raffolux_Com_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Support_At_Raffolux_Com_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateSupport_At_Raffolux_Com_Link();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Support_At_Raffolux_Com_Link();
   		 if(flag == true)
   		 {
   			 test.pass("Support_At_Raffolux_Com_Link is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over Support_At_Raffolux_Com_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("Support_At_Raffolux_Com_Link is not displayed   :"+flag);
   			 test.pass("mouse hovered over Support_At_Raffolux_Com_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 
	}
	
	@Test(priority = 11, enabled = false)
	public void Verify_by_Clicking_Support_At_Raffolux_Com_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Support_At_Raffolux_Com_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonSupport_At_Raffolux_Com_Link();
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/play/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	@Test(priority = 12, enabled = true)
	public void Verify_mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section();
   		 if(flag == true)
   		 {
   			 test.pass("mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section is not displayed   :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 13, enabled = false)
	public void Verify_by_Clicking_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section();
   		 Thread.sleep(5000);
   		 String actualUrl = driver.getCurrentUrl();
   		 String expectedUrl = "https://sandbox.raffolux.com/play/";
   		 if(actualUrl.equals(expectedUrl))
   		 {
			 test.pass("PASS");
		 }
		 else
		 {
			 test.fail("FAIL");
		 }	
   			
   		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	//
	@Test(priority = 14, enabled = true)
	public void Verify_mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 if(flag == true)
   		 {
   			 test.pass("mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section is not displayed   :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 15, enabled = false)
	public void Verify_by_Clicking_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 Thread.sleep(5000);
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/play/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	//
	@Test(priority = 16, enabled = true)
	public void Verify_mouse_Hov_Over_Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 if(flag == true)
   		 {
   			 test.pass("Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section is not displayed   :"+flag);
   			 test.pass("mouse hovered over Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 17, enabled = false)
	public void Verify_by_Clicking_Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section();
   		 Thread.sleep(5000);
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://sandbox.raffolux.com/play/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	@Test(priority = 18, enabled = true)
	public void Verify_mouse_Hov_Over_Gambling_Commission_Website_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_Gambling_Commission_Website_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGambling_Commission_Website_Link();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_Gambling_Commission_Website_Link();
   		 if(flag == true)
   		 {
   			 test.pass("mouse_Hov_Over_Gambling_Commission_Website_Link is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gambling_Commission_Website_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("mouse_Hov_Over_Gambling_Commission_Website_Link is not displayed   :"+flag);
   			 test.pass("mouse hovered over mouse_Hov_Over_Gambling_Commission_Website_Link sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 19, enabled = false)
	public void Verify_by_Clicking_Gambling_Commission_Website_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gambling_Commission_Website_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGambling_Commission_Website_Link();
   		 Thread.sleep(5000);
   		 String actualTitle = driver.getTitle();
   		 String expectedTitle = "https://sandbox.raffolux.com/play/";
   		 if(actualTitle.equals(expectedTitle))
   		 {
   			 test.pass("actualTitle  :"+actualTitle+"is matching with the expectedTitle"+ expectedTitle);
   		 }
   		 else
   		 {
   			 test.fail("actualTitle  :"+actualTitle+"is not matching with the expectedTitle"+ expectedTitle);
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	@Test(priority = 20, enabled = true)
	public void Verify_mouse_Hov_Over_GAMSHOT_Link1() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify mouse_Hov_Over_GAMSHOT_Link1").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 
   		 boolean flag = responsiblePlay_And_WellBeing_Page.ValidateGAMSHOT_Link1();
   		 responsiblePlay_And_WellBeing_Page.mouse_Hov_Over_GAMSHOT_Link1();
   		 if(flag == true)
   		 {
   			 test.pass("GAMSHOT_Link1 is displayed successfully  :"+flag);
   			 test.pass("mouse hovered over GAMSHOT_Link1 sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
   		 else
   		 {
   			 test.fail("GAMSHOT_Link1 is not displayed   :"+flag);
   			 test.pass("mouse hovered over GAMSHOT_Link1 sucessfully  :");
   			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		 }
	}
	
	@Test(priority = 21, enabled = false)
	public void Verify_by_Clicking_GAMSHOT_Link1() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the GAMSHOT_Link1").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		
   		 responsiblePlay_And_WellBeing_Page.ClickonGAMSHOT_Link1();
   		 Thread.sleep(6000);
   		String actualUrl = driver.getCurrentUrl();
   		String expectedUrl = "https://www.gamstop.co.uk/";
   		if(actualUrl.equals(expectedUrl))
   		{
   			test.pass(actualUrl);
   		}
   		else
   		{
   			test.fail(actualUrl);
   			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		}
   	    responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	@Test(priority = 22, enabled = false)
	public void Verify_by_Clicking_GAMSHOT_Link2() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the GAMSHOT_Link2").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 	
   		 responsiblePlay_And_WellBeing_Page.ClickonGAMSHOT_Link2();
   		 Thread.sleep(6000);
   		String actualUrl = driver.getCurrentUrl();
   		String expectedUrl = "https://www.gamstop.co.uk/";
   		if(actualUrl.equals(expectedUrl))
   		{
   			test.pass(actualUrl);
   		}
   		else
   		{
   			test.fail(actualUrl);
   			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
   		}
   	    responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();
	}
	
	/*@Test(priority = 6, enabled = true)
	public void Verify_by_Clicking_Gamble_Aware_Link() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the Gamble_Aware_Link").assignAuthor("Dharma")
   				.assignCategory("Functional testing").assignDevice("Windows");
   		 responsiblePlay_And_WellBeing_Page = indexPage.ClickonFooterResponsiblePlayLink();	
   		 responsiblePlay_And_WellBeing_Page.ClickonGamble_Aware_Link();
   		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl = "https://www.begambleaware.org/";
		 if(actualUrl.equals(expectedUrl))
		 {
			 test.pass("actualUrl  :"+actualUrl+ "is matching with the expectedUrl  :"+expectedUrl);
		 }
		 else
		 {
			 test.fail("actualUrl  :"+actualUrl+ "is not matching with the expectedUrl  :"+expectedUrl);
			 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		 }
	}*/
}
