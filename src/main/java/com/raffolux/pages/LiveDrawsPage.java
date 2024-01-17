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
public class LiveDrawsPage extends BaseClass
{
	@FindBy(xpath = "//h1[text()='Live Draws']")
	WebElement Live_Draws_Page_Title;
	
	@FindBy(xpath = "//p[text()='Watch all the Raffolux live draws here! ']")
	WebElement Watch_All_The_Raffolux_LiveDraws_Text;
	
	@FindBy(xpath = "//h3[text()='Past draws']")
	WebElement Past_Draws_Option;
	
	@FindBy(xpath = "//label[text()='Show draws for']")
	WebElement Show_Draws_For_text;
	
	@FindBy(xpath = "//*[@id=\"sort-filter\"]")
	WebElement Show_Draws_For_dropdown;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]")
	WebElement One_of_the_Past_draw;
	
	//The WebElement which are present on the "Past draw"..
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/a/img")
	WebElement One_of_the_Past_Live_draw_Card_Image;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[1]/h3")
	WebElement Drawn_Date_and_time_Text;
	
	@FindBy(xpath = "//p[text()='Rolex Submariner or £10,000']")
	WebElement Title_Of_The_Past_drawn_Raffle;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[2]/p")
	WebElement Total_no_of_days_of_Drawn;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[2]/div/a[1]")
	WebElement Raffle_Link;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[2]/div/a[1]/i")
	WebElement Raffle_Ticket_Symbol;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[2]/div/a[2]")
	WebElement Facebook_Link;
	
	@FindBy(xpath = "/html/body/section[4]/div/div/div[2]/div[1]/div/div[2]/div/a[2]/i")
	WebElement Facebook_Logo_Symbol;
	
	@FindBy(xpath = "//*[@id=\"u_0_5_Y3\"]")
	WebElement One_of_The_Live_Draw_Video;
	
	@FindBy(xpath = "//*[@id=\"toggleFacebookPlayer\"]/i")
	WebElement Video_Closing_Symbol;
	
	
	public LiveDrawsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLive_Draws_Page_Title()
	{
		String text = Live_Draws_Page_Title.getText();
		return text;
	}
	
	
	public String ValidateWatch_All_The_Raffolux_LiveDraws_Text()
	{
		String text = Watch_All_The_Raffolux_LiveDraws_Text.getText();
		return text;
	}
	
	public String ValidatePast_Draws_Option()
	{
		String text = Past_Draws_Option.getText();
		return text;
	}
	
	public String ValidateShow_Draws_For_text()
	{
		String text = Show_Draws_For_text.getText();
		return text;
	}
	
	public boolean ValidateShow_Draws_For_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Show_Draws_For_dropdown);
	}
	
	public boolean Select_Any_Of_The_Option_From_Show_Draws_For_dropdown() throws Throwable
	{
		return Action.selectByIndex(Show_Draws_For_dropdown, 1);
	}
	
	public boolean Select_Any_Of_The_Option1_From_Show_Draws_For_dropdown() throws Throwable
	{
		return Action.selectByIndex(Show_Draws_For_dropdown, 0);
	}
	
	public boolean ValidateOne_of_the_Past_draw() throws Throwable
	{
		return Action.isDisplayed(driver, One_of_the_Past_draw);
	}
	
	public void ClickonOne_of_the_Past_draw() throws Throwable
	{
		Action.Click(driver, One_of_the_Past_draw);
	}
	
	public boolean ValidateOne_of_the_Past_Live_draw_Card_Image() throws Throwable
	{
		return Action.isDisplayed(driver, One_of_the_Past_Live_draw_Card_Image);
	}
	
	public String ValidateDrawn_Date_and_time_Text()
	{
		String text = Drawn_Date_and_time_Text.getText();
		return text;
	}
	
	public String ValidateTitle_Of_The_Past_drawn_Raffle()
	{
		String text = Title_Of_The_Past_drawn_Raffle.getText();
		return text;
	}
	
	public String ValidateTotal_no_of_days_of_Drawn()
	{
		String text = Total_no_of_days_of_Drawn.getText();
		return text;
	}
	
	public boolean ValidateRaffle_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Raffle_Link);
	}
	
	public void ClickonRaffle_Link() throws Throwable
	{
		Action.JSClick(driver, Raffle_Link);
	}
	
	public boolean ValidateRaffle_Ticket_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Raffle_Ticket_Symbol);
	}
	
	public boolean ValidateFacebook_Logo_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Facebook_Logo_Symbol);
	}
	
	public boolean ValidateFacebook_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Facebook_Link);
	}
	
	public void ClickonFacebook_Link() throws Throwable
	{
		Action.JSClick(driver, Facebook_Link);
	}
	
	public boolean ValidateVideo_Closing_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Video_Closing_Symbol);
	} 
	
	public void ClickonVideo_Closing_Symbol() throws Throwable
	{
		Action.JSClick(driver, Video_Closing_Symbol);
	}
	
	public boolean ValidateOne_of_The_Live_Draw_Video() throws Throwable
	{
		return Action.isDisplayed(driver, One_of_The_Live_Draw_Video);
	}
}
