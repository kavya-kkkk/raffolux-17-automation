/**
 * 
 */
package com.raffolux.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class News_And_Blog_Page extends BaseClass
{
	@FindBy(xpath = "//h1[text()='Blog & News']")
	WebElement Blogs_And_News_Title_Text;
	
	@FindBy(xpath = "//p[text()='Catch up on the latest news and articles from Raffolux']")
	WebElement Catch_Up_On_The_Latest_News_And_Articles_Text;
	
	@FindBy(xpath = "/html/body/section[2]")
	WebElement The__News_And_Articles_List_Body;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[1]")
	WebElement One_Of_The_Blog_Post_Cards;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/a/img")
	WebElement Image_Of_One_Of_The_Blog_Post_Cards;
	
	@FindBy(xpath = "//h3[text()='Introducing the Cricut Joy - what does it do?']")
	WebElement Title_Of_One_Of_The_Blog_Post_Cards;
	
	@FindBy(xpath = "(//p[text()='Raffolux | Nov. 18, 2022'])[1]")
	WebElement Date_Of_One_Of_The_Blog_Post_Cards_;
	
	@FindBy(xpath = "//p[text()='Have you seen the latest raffle for a Cricut machine and are...']")
	WebElement Have_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[2]/p/a/apan")
	WebElement Read_More_Link_Of_One_Of_The_Blog_Post_Cards_;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[2]/p/a/i")
	WebElement Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_;
	
	
	public News_And_Blog_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateBlogs_And_News_Title_Text()
	{
		String text = Blogs_And_News_Title_Text.getText();
		return text;
	}
	
	public String ValidateCatch_Up_On_The_Latest_News_And_Articles_Text()
	{
		String text = Catch_Up_On_The_Latest_News_And_Articles_Text.getText();
		return text;
	}
	
	public boolean ValidateThe__News_And_Articles_List_Body() throws Throwable
	{
		return Action.isDisplayed(driver, The__News_And_Articles_List_Body);
	}
	
	public boolean ValidateOne_Of_The_Blog_Post_Cards() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Blog_Post_Cards);
	}
	
	public void ClickonOne_Of_The_Blog_Post_Cards() throws Throwable
	{
		Action.JSClick(driver, One_Of_The_Blog_Post_Cards);
	}
	
	public boolean ValidateImage_Of_One_Of_The_Blog_Post_Cards() throws Throwable
	{
		return Action.isDisplayed(driver, Image_Of_One_Of_The_Blog_Post_Cards);
	}
	
	public void ClickonImage_Of_One_Of_The_Blog_Post_Cards() throws Throwable
	{
		Action.JSClick(driver, Image_Of_One_Of_The_Blog_Post_Cards);
	}
	
	public String ValidateTitle_Of_One_Of_The_Blog_Post_Cards()
	{
		String text = Title_Of_One_Of_The_Blog_Post_Cards.getText();
		return text;
	}
	
	public String ValidateDate_Of_One_Of_The_Blog_Post_Cards_()
	{
		String text = Date_Of_One_Of_The_Blog_Post_Cards_.getText();
		return text;
	}
	
	public String ValidateHave_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_()
	{
		String text = Have_You_Seen_The_Latest_Raffle_Text_Of_One_Of_The_Blog_Post_Cards_.getText();
		return text;
	}
	
	public boolean ValidateRead_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		return Action.isDisplayed(driver, Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	public boolean Mouse_HovOver_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		Action.scrollIntoView(driver, Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
		return Action.mouseOverElement(Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	public void CLickon_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		Action.JSClick(driver, Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	public boolean ValidateForward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		return Action.isDisplayed(driver, Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	public boolean Mouse_HovOver_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		Action.scrollIntoView(driver, Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
		return Action.mouseOverElement(Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	public void CLickon_Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_() throws Throwable
	{
		Action.JSClick(driver, Forward_Arrow_Of_Read_More_Link_Of_One_Of_The_Blog_Post_Cards_);
	}
	
	

}
