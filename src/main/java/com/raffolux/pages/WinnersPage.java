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
public class WinnersPage extends BaseClass
{
	@FindBy(xpath = "/html/body/div[4]/h4")
	WebElement RaffoluxWinnersTitle;
	
	@FindBy(xpath = "/html/body/div[4]/a/i")
	WebElement LeftArrowSymbol;
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div/input")
	WebElement SearchBox;
	
	@FindBy(xpath = "//h4[text()='November 2022']")
	WebElement Current_Month_And_Year_Text;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/a[1]/div")
	WebElement OneOftheWinnerFromTheWinnersList;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/a[1]/div/div/img")
	WebElement Image_Of_Prize;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/a[7]/div/p[1]")
	WebElement Title_Of_The_Prize;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/a[7]/div/p[2]")
	WebElement Congratulations_Text_alongwith_WinnerName;
	
	//WebElements which are present in the particular winner Page..
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div[1]/h2")
	WebElement Name_Of_The_PrizeWinner;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div[2]/h4")
	WebElement Title_Of_The_Prize_Won;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div/div/div[3]/h4")
	WebElement PrizeWinning_Ticket_Number;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/img")
	WebElement Image_Of_Prize1;
	
	@FindBy(xpath = "/html/body/div[4]/div[4]/div/div/p[1]")
	WebElement Draw_Taken_Time_And_Date;
	
	@FindBy(xpath = "/html/body/div[4]/div[4]/div/div/p[2]/a/img")
	WebElement Random_Org_Image;
	
	@FindBy(xpath = "/html/body/div[4]/div[4]/div/div/p[3]/a")
	WebElement Draw_Details_Link;
	
	@FindBy(xpath = "/html/body/div[4]/div[5]/div/div/div")
	WebElement Drawn_Name_Ticket_TableSection;
	
	@FindBy(xpath = "//th[text()='Drawn']")
	WebElement Drawn_Text;
	
	@FindBy(xpath = "//th[text()='1st']")
	WebElement Drawn_Result;
	
	@FindBy(xpath = "//th[text()='Name']")
	WebElement Name_Text;
	
	@FindBy(xpath = "//h2[@class='color-tan']")
	WebElement Name_Of_The_Winner;
	
	@FindBy(xpath = "//th[text()='Ticket No.']")
	WebElement Tickat_No_Text;
	
	@FindBy(xpath = "//div[text()='10']")
	WebElement Number_Of_Tecket_Won;
	//
	@FindBy(xpath = "/html/body/div[4]/div[7]/div/div/h4/strong")
	WebElement Your_A_Sponser_Of_Text;
	
	@FindBy(xpath = "/html/body/div[4]/div[7]/div/div/strong/img")
	WebElement Logo_Of_The_Supported_Charity;
	
	@FindBy(xpath = "/html/body/div[4]/strong/div/div/h4/strong")
	WebElement Join_Our_Member_Club_Text;
	
	@FindBy(linkText = "members club!")
	WebElement Members_Club_Link;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div/strong/p")
	WebElement AS_A_Club_Member_Suggest_NextRaffle_Info_Text;
	
	@FindBy(linkText = "here")
	WebElement GetInvolved_Join_Here_Link;
	
	@FindBy(xpath = "/html/body/div[4]/section/div/div")
	WebElement Charities_Horizontal_Scrolling_Bar;
	
	@FindBy(xpath = "/html/body/div[4]/section/div/div/div/div/div[12]/a/img")
	WebElement One_OfThe_Charity_From_Horizontal_Scrolling_Bar;
	
	public WinnersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateRaffoluxWinnersTitle()
	{
		String text = RaffoluxWinnersTitle.getText();
		return text;
	}
	
	public boolean ValidateLeftArrowSymbol() throws Throwable
	{
		return Action.isDisplayed(driver, LeftArrowSymbol);
	}
	
	public void ClickonLeftArrowSymbol() throws Throwable
	{
	     Action.JSClick(driver, LeftArrowSymbol);
	}
	
	public boolean ValidateSearchBox() throws Throwable
	{
		return Action.isDisplayed(driver, SearchBox);
	}
	
	public String ValidateCurrent_Month_And_Year_Text()
	{
		String text = Current_Month_And_Year_Text.getText();
		return text;
	}
	
	public boolean ValidateOneOftheWinnerFromTheWinnersList() throws Throwable
	{
		return Action.isDisplayed(driver, OneOftheWinnerFromTheWinnersList);
	}
	
	public void ClickonOneOftheWinnerFromTheWinnersList() throws Throwable
	{
	     Action.Click(driver, OneOftheWinnerFromTheWinnersList);
	}
	
	public boolean ValidateImage_Of_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Image_Of_Prize);
	}
	
	public String ValidateTitle_Of_The_Prize()
	{
		String text = Title_Of_The_Prize.getText();
		return text;
	}
	
	public String ValidateCongratulations_Text_alongwith_WinnerName()
	{
		String text = Congratulations_Text_alongwith_WinnerName.getText();
		return text;
	}
	//WebElements Present in the any one of the particular winner page
	public String ValidateName_Of_The_PrizeWinner()
	{
		String text = Name_Of_The_PrizeWinner.getText();
		return text;
	}
	
	public String ValidateTitle_Of_The_Prize_Won()
	{
		String text = Title_Of_The_Prize_Won.getText();
		return text;
	}
	
	public String ValidatePrizeWinning_Ticket_Number()
	{
		String text = PrizeWinning_Ticket_Number.getText();
		return text;
	}
	
	public boolean ValidateImage_Of_Prize1() throws Throwable
	{
		return Action.isDisplayed(driver, Image_Of_Prize1);
	}
	
	public String ValidateDraw_Taken_Time_And_Date()
	{
		String text = Draw_Taken_Time_And_Date.getText();
		return text;
	}
	
	public boolean ValidateRandom_Org_Image() throws Throwable
	{
		return Action.isDisplayed(driver, Random_Org_Image);
	}
	
	public boolean ValidateDraw_Details_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Draw_Details_Link);
	}
	
	public boolean MousehovOverDraw_Details_Link() throws Throwable
	{
		return Action.mouseHoverByJavaScript(Draw_Details_Link);
	}
	
	public void ClickonDraw_Details_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Draw_Details_Link);
	     Action.Click(driver, Draw_Details_Link);
	}
	
	public boolean ValidateDrawn_Name_Ticket_TableSection() throws Throwable
	{
		Action.scrollIntoView(driver, Drawn_Name_Ticket_TableSection);
		return Action.isDisplayed(driver, Drawn_Name_Ticket_TableSection);
	}
	
	public String ValidateDrawn_Text()
	{
		Action.scrollIntoView(driver, Drawn_Text);
		String text = Drawn_Text.getText();
		return text;
	}
	
	public String ValidateDrawn_Result()
	{
		Action.scrollIntoView(driver, Drawn_Result);
		String text = Drawn_Result.getText();
		return text;
	}
	
	public String ValidateName_Text()
	{
		Action.scrollIntoView(driver, Name_Text);
		String text = Name_Text.getText();
		return text;
	}
	
	public String ValidateName_Of_The_Winner()
	{
		Action.scrollIntoView(driver, Name_Of_The_Winner);
		String text = Name_Of_The_Winner.getText();
		return text;
	}
	
	public String ValidateTickat_No_Text()
	{
		Action.scrollIntoView(driver, Tickat_No_Text);
		String text = Tickat_No_Text.getText();
		return text;
	}
	
	public String ValidateNumber_Of_Tecket_Won()
	{
		Action.scrollIntoView(driver, Number_Of_Tecket_Won);
		String text = Number_Of_Tecket_Won.getText();
		return text;
	}
	
	
	public String ValidateYour_A_Sponser_Of_Text()
	{
		Action.scrollIntoView(driver, Your_A_Sponser_Of_Text);
		String text = Your_A_Sponser_Of_Text.getText();
		return text;
	}
	
	public boolean ValidateLogo_Of_The_Supported_Charity() throws Throwable
	{
		Action.scrollIntoView(driver, Logo_Of_The_Supported_Charity);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, Logo_Of_The_Supported_Charity);
	}
	
	public String ValidateJoin_Our_Member_Club_Text() throws InterruptedException
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		String text = Join_Our_Member_Club_Text.getText();
		return text;
	}
	
	public boolean ValidateMembers_Club_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, Members_Club_Link);
	}
	
	public boolean MousehovOverMembers_Club_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		return Action.mouseHoverByJavaScript(Members_Club_Link);
	}
	
	public void ClickonMembers_Club_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		Action.Click(driver, Members_Club_Link);
	}
	
	public String ValidateAS_A_Club_Member_Suggest_NextRaffle_Info_Text() throws InterruptedException
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		String text = AS_A_Club_Member_Suggest_NextRaffle_Info_Text.getText();
		return text;
	}
	
	public void ClickonGetInvolved_Join_Here_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		Action.Click(driver, GetInvolved_Join_Here_Link);
		Thread.sleep(2000);
	}
	
	public boolean MousehovOverGetInvolved_Join_Here_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		return Action.mouseHoverByJavaScript(GetInvolved_Join_Here_Link);
	}
	
	public boolean ValidateGetInvolved_Join_Here_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, GetInvolved_Join_Here_Link);
	}
	
	public boolean ValidateCharities_Horizontal_Scrolling_Bar() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		return Action.isDisplayed(driver, Charities_Horizontal_Scrolling_Bar);
	}
	
	public boolean ValidateOne_OfThe_Charity_From_Horizontal_Scrolling_Bar() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		return Action.isDisplayed(driver, One_OfThe_Charity_From_Horizontal_Scrolling_Bar);
	}
	
	public void ClickonOne_OfThe_Charity_From_Horizontal_Scrolling_Bar() throws Throwable
	{
		Action.scrollIntoView(driver, Charities_Horizontal_Scrolling_Bar);
		Action.JSClick(driver, One_OfThe_Charity_From_Horizontal_Scrolling_Bar);
	}
	
	
	
}
