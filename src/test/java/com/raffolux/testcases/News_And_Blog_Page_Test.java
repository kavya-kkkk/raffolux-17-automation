/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.News_And_Blog_Page;

/**
 * @author hp
 *
 */
public class News_And_Blog_Page_Test extends BaseClass {
	
	News_And_Blog_Page news_And_Blog_Page;

	@Test(priority = 0, enabled = true)
	public void Verify_NavigationTo_News_And_Blog_Page() throws Throwable {
		ExtentTest test = extent.createTest("Verify NavigationTo_News_And_Blog_Page").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		driver.get("https://sandbox.raffolux.com");

		news_And_Blog_Page = indexPage.ClickonFooterNewsAndBlogLink();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/newslist/";
		if (actualUrl.equals(expectedUrl)) {
			test.pass("actualUrl :" + actualUrl + "is matching with the expectedUrl" + expectedUrl);
		} else {
			test.fail("actualUrl :" + actualUrl + "is not matching with the expectedUrl" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		
	}
	
	@Test(priority = 1, enabled = true)
	public void Verify_Blogs_And_News_Title_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Blogs_And_News_Title_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		String actualText = news_And_Blog_Page.ValidateBlogs_And_News_Title_Text();
		
		String expectedText = "Blog & News";
		if (actualText.equals(expectedText)) {
			test.pass("actualUrl :" + actualText + "is matching with the expectedUrl" + expectedText);
		} else {
			test.fail("actualUrl :" + actualText + "is not matching with the expectedUrl" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 2, enabled = true)
	public void Verify_Catch_Up_On_The_Latest_News_And_Articles_Text() throws Throwable {
		ExtentTest test = extent.createTest("Verify Catch_Up_On_The_Latest_News_And_Articles_Text").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		String actualText = news_And_Blog_Page.ValidateCatch_Up_On_The_Latest_News_And_Articles_Text();
		
		String expectedText = "Catch up on the latest news and articles from Raffolux";
		if (actualText.equals(expectedText)) {
			test.pass("actualUrl :" + actualText + "is matching with the expectedText" + expectedText);
		} else {
			test.fail("actualUrl :" + actualText + "is not matching with the expectedText" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	//The__News_And_Articles_List_Body
	
	@Test(priority = 3, enabled = true)
	public void Verify_The__News_And_Articles_List_Body() throws Throwable {
		ExtentTest test = extent.createTest("Verify The__News_And_Articles_List_Body").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.ValidateThe__News_And_Articles_List_Body();
		
		if(flag == true)
		{
			test.pass("The__News_And_Articles_List_Body is successfully displayed"+flag);
		}
		else
		{
			test.fail("The__News_And_Articles_List_Body is not displayed"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 4, enabled = true)
	public void Verify_One_Of_The_Blog_Post_Cards() throws Throwable {
		ExtentTest test = extent.createTest("Verify One_Of_The_Blog_Post_Cards").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.ValidateOne_Of_The_Blog_Post_Cards();
		
		if(flag == true)
		{
			test.pass("One_Of_The_Blog_Post_Cards is successfully displayed"+flag);
		}
		else
		{
			test.fail("One_Of_The_Blog_Post_Cards is not displayed"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 5, enabled = true)
	public void Verify_Image_Of_One_Of_The_Blog_Post_Cards() throws Throwable {
		ExtentTest test = extent.createTest("Verify One_Of_The_Blog_Post_Cards").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.ValidateImage_Of_One_Of_The_Blog_Post_Cards();
		
		if(flag == true)
		{
			test.pass("Image_Of_One_Of_The_Blog_Post_Cards is successfully displayed"+flag);
		}
		else
		{
			test.fail("Image_Of_One_Of_The_Blog_Post_Cards is not displayed"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 6, enabled = true)
	public void Clickon_Image_Of_One_Of_The_Blog_Post_Cards() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clikcing the Image_Of_One_Of_The_Blog_Post_Cards").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		news_And_Blog_Page.ClickonImage_Of_One_Of_The_Blog_Post_Cards();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/news/cricut-joy-what-does-it-do/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :" + actualUrl + "is matching with the expectedUrl" + expectedUrl);
		}
		else
		{
			test.fail("actualUrl :" + actualUrl + "is not matching with the expectedUrl" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		news_And_Blog_Page = indexPage.ClickonFooterNewsAndBlogLink();
	}
	
	@Test(priority = 7, enabled = true)
	public void Verify_Title_Of_One_Of_The_Blog_Post_Cards() throws Throwable {
		ExtentTest test = extent.createTest("Verify Title_Of_One_Of_The_Blog_Post_Cards").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		String actualText = news_And_Blog_Page.ValidateTitle_Of_One_Of_The_Blog_Post_Cards();
		
		String expectedText = "Introducing the Cricut Joy - what does it do?";
		if (actualText.equals(expectedText)) {
			test.pass("actualUrl :" + actualText + "is matching with the expectedText" + expectedText);
		} else {
			test.fail("actualUrl :" + actualText + "is not matching with the expectedText" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 8, enabled = true)
	public void Verify_Date_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Date_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		String actualText = news_And_Blog_Page.ValidateDate_Of_One_Of_The_Blog_Post_Cards_();
		
		String expectedText = "Raffolux | Nov. 18, 2022";
		if (actualText.equals(expectedText)) {
			test.pass("actualUrl :" + actualText + "is matching with the expectedText" + expectedText);
		} else {
			test.fail("actualUrl :" + actualText + "is not matching with the expectedText" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 9, enabled = true)
	public void Verify_Have_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Have_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		String actualText = news_And_Blog_Page.ValidateHave_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_();
		
		String expectedText = "Have you seen the latest raffle for a Cricut machine and are...";
		if (actualText.equals(expectedText)) {
			test.pass("actualUrl :" + actualText + "is matching with the expectedText" + expectedText);
		} else {
			test.fail("actualUrl :" + actualText + "is not matching with the expectedText" + expectedText);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 10, enabled = true)
	public void Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		if(flag == true)
		{
			test.pass("Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is successful  "+flag);
		}
		else
		{
			test.fail("not Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 11, enabled = true)
	public void Verify_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.ValidateRead_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		if(flag == true)
		{
			test.pass("Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is successfully displayed"+flag);
		}
		else
		{
			test.fail("Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is not displayed"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 12, enabled = true)
	public void Clickon_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		news_And_Blog_Page.CLickon_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/news/cricut-joy-what-does-it-do/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :" + actualUrl + "is matching with the expectedUrl" + expectedUrl);
		}
		else
		{
			test.fail("actualUrl :" + actualUrl + "is not matching with the expectedUrl" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		news_And_Blog_Page = indexPage.ClickonFooterNewsAndBlogLink();
	}
	
	@Test(priority = 13, enabled = true)
	public void Verify_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.ValidateForward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		if(flag == true)
		{
			test.pass("Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is successfully displayed  :"+flag);
		}
		else
		{
			test.fail("Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is not displayed"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}
	
	@Test(priority = 14, enabled = true)
	public void Clickon_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify by clicking the Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		news_And_Blog_Page.CLickon_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://sandbox.raffolux.com/news/cricut-joy-what-does-it-do/";
		if(actualUrl.equals(expectedUrl))
		{
			test.pass("actualUrl :" + actualUrl + "is matching with the expectedUrl" + expectedUrl);
		}
		else
		{
			test.fail("actualUrl :" + actualUrl + "is not matching with the expectedUrl" + expectedUrl);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
		news_And_Blog_Page = indexPage.ClickonFooterNewsAndBlogLink();
	}
	
	@Test(priority = 15, enabled = true)
	public void Mouse_HovOver_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable {
		ExtentTest test = extent.createTest("Verify Mouse_HovOver_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");

		
		boolean flag = news_And_Blog_Page.Mouse_HovOver_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_();
		
		if(flag == true)
		{
			test.pass("Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_ is successful  "+flag);
		}
		else
		{
			test.fail("not Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_"+flag);
			test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		}
	}

}
