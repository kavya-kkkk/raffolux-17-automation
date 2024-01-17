package com.raffolux.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

public class MyRafflesPage2 extends BaseClass
{
	@FindBy(id = "raffolux-logo")
	WebElement _RaffoluxLogo;
	
	@FindBy(linkText = "Winners")
	WebElement WinnersLink;
	
	@FindBy(linkText = "My tickets")
	WebElement Mytickets_Link;
	
	@FindBy(xpath = "(//i[@class='fal fa-shopping-cart'])[1]")
	WebElement CartNotificationLogo;
	
	@FindBy(xpath = "(//i[@class='fal fa-user-circle colour-default-accent'])[2]")
	WebElement ProfileLogo;
	
	@FindBy(xpath = "//div[@class='sidebar-menu-content']")
	WebElement Side_Bar_Menu_Content_In_Profile_Section;
	
	
	@FindBy(xpath = "//div[@class='pointsClaimed']")
	WebElement Points_Wallet_On_header_part;
	//
	@FindBy(xpath = "//h3[@class='raffle-hdr']")
	WebElement MyRaffles_TItle_Text;
	
	@FindBy(xpath = "//i[@class='fas fa-arrow-left desk-hide']")
	WebElement Left_Arrow_Symbol;
	
	@FindBy(xpath = "//h3[@class='tab-hdr']")
	WebElement MyRaffles_Tab_Text;
	
	@FindBy(xpath = "(//a[@class='tab-border'])[1]")
	WebElement Active_Scetion_tab;
	
	@FindBy(xpath = "(//a[@class='tab-border'])[2]")
	WebElement Ended_Scetion_tab;
	
	@FindBy(xpath = "//p[@class='text-black']")
	WebElement You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text;
	
	@FindBy(xpath = "Click here to see what's on.")
	WebElement Click_here_to_see_whats_On_Text_Under_Active_Tab;
	
	@FindBy(xpath = "(//div[@class='row align-items-center content-padding raffle-desk-hide'])[1]")
	WebElement One_Of_The_Selected_Active_Raffle_Description;
	
	@FindBy(xpath = "//img[@class='rounded']")
	WebElement Selected_Active_Raffle_Photo;
	
	@FindBy(xpath = "//div[@class='col-md-9 pl-0 active-tab']")
	WebElement Selected_Active_Raffle_Description;
	
	@FindBy(xpath = "(//a[@class='view-link-txt view-txt-allign'])[1]")
	WebElement View_More_Text_On_Active_Raffle;
	
	@FindBy(xpath = "(//i[@class='fas fa-solid fa-chevron-right'])[1]")
	WebElement View_More_Farward_Symbol_On_Active_Raffle;
	
	@FindBy(xpath = "//div[@class='collapse show in']")
	WebElement List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle;
	
	@FindBy(xpath = "(//div[@class='ticket-outline-small ticket-width'])[1]")
	WebElement One_Of_The_Ticket_number_Of_Selected_Active_Raffle;
	
	@FindBy(xpath = "(//hr[@class='hr-bdrClr'])[1]")
	WebElement The_EndLine_Under_The_One_Of_The_Active_Raffle;
	//
	@FindBy(xpath = "//div[@class='tab-pane fade show active in']")
	WebElement List_Of_Ended_Raffles_In_The_Ended_Tab;
	
	@FindBy(xpath = "(//div[@class='row align-items-center content-padding raffle-desk-hide'])[2]")
	WebElement One_Of_The_Selected_Ended_Raffle_Description;
	
	@FindBy(xpath = "(//img[@class=' rounded'])[2]")
	WebElement Selected_Ended_Raffle_Photo;
	
	@FindBy(xpath = "(//div[@class='col-md-9 pl-0 col-8 active-tab ended-pdng'])[1]")
	WebElement Selected_Ended_Raffle_Description;
	
	@FindBy(xpath = "(//a[@class='view-link-txt view-txt-allign'])[2]")
	WebElement View_More_Text_On_Ended_Raffle;
	
	@FindBy(xpath = "(//i[@class='fas fa-solid fa-chevron-right'])[3]")
	WebElement View_More_Farward_Symbol_On_Ended_Raffle;
	
	@FindBy(xpath = "(//div[@class='collapse show in'])[2]")
	WebElement List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle;
	
	@FindBy(xpath = "(//div[@class='ticket-outline-small ticket-width'])[1]")
	WebElement One_Of_The_Ticket_number_Of_Ended_Raffle;
	
	@FindBy(xpath = "(//hr[@class='hr-bdrClr'])[1]")
	WebElement The_EndLine_Under_The_One_Of_The_Ended_Raffle;
	
	//
	@FindBy(xpath = "(//h3[@class='active-hdr'])[1]")
	WebElement Title_Of_One_Of_the_Selected_Active_Raffle;
	
	@FindBy(xpath = "//h1[@class='large-title mb-3 pt-0 pt-sm-5 text-black raffle-title-font']")
	WebElement Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage;
	
	//
	@FindBy(xpath = "(//p[@class='text-black'])[1]")
	WebElement You_Haven_not_Entered_Any_Raffles_Yet_Text_Under_Ended_Tab;
	
	@FindBy(linkText = "Click here to see what's on.")
	WebElement Click_Here_To_See_Whats_On_Text_Under_Ended_Tab;
	
	
	public MyRafflesPage2()
	{
		PageFactory.initElements(driver, this); 
	}
	
	public String Validate_Title_Of_One_Of_the_Selected_Active_Raffle() throws Throwable
	{
		System.out.println("Title_Of_One_Of_the_Selected_Active_Raffle verified successfully -");
		String text = Title_Of_One_Of_the_Selected_Active_Raffle.getText();
		return text;
	}
	
	public String Validate_Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage() throws Throwable
	{
		System.out.println("Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage verified successfully -");
		String text = Title_Of_One_Of_the_Selected_Active_Raffle_In_respective_RafflePage.getText();
		return text;
	}
	
	public boolean Validate_RaffoluxLogo() throws Throwable
	{
		System.out.println("Raffolux logo verified successfully -");
		return Action.isDisplayed(driver, _RaffoluxLogo);
	}
	
	public void Clickon_RaffoluxLogo() throws Throwable
	{
		Action.Click(driver, _RaffoluxLogo);
		//Assert.assertEquals("true", "false");
		System.out.println("Raffolux logo verified successfully -");
	}
	
	public boolean ValidateWinnersLink() throws Throwable
	{
		System.out.println("WinnersLink verified successfully -");
		return Action.isDisplayed(driver, WinnersLink);
	}
	
	public void Clickon_WinnersLink() throws Throwable
	{
		Action.Click(driver, WinnersLink);
		System.out.println("WinnersLink verified successfully -");
	}
	
	public boolean Mousehov_Over_WinnersLink() throws Throwable
	{
		System.out.println("WinnersLink verified successfully -");
		return Action.mouseOverElement(WinnersLink);
	}
	
	public boolean Validate_Points_Wallet_On_header_part() throws Throwable
	{
		System.out.println("Points_Wallet_On_header_part verified successfully -");
		return Action.isDisplayed(driver, Points_Wallet_On_header_part);
	}
	
	public void Clickon_Points_Wallet_On_header_part() throws Throwable
	{
		Action.JSClick(driver, Points_Wallet_On_header_part);
		System.out.println("Points_Wallet_On_header_part verified successfully -");
	}
	
	public boolean Validate_Mytickets_Link() throws Throwable
	{
		System.out.println("Mytickets_Link verified successfully -");
		return Action.isDisplayed(driver, Mytickets_Link);
	}
	
	public MyRafflesPage2 ClickOn_Mytickets_Link() throws Throwable
	{
		Action.JSClick(driver, Mytickets_Link);
		System.out.println("Mytickets_Link verified successfully -");
		
		return new MyRafflesPage2();
	}
	
	public boolean MousehovOver_Mytickets_Link() throws Throwable
	{
		System.out.println("Mytickets_Link verified successfully -");
		return Action.mouseOverElement(Mytickets_Link);
	}
	
	public boolean Validate_CartNotificationLogo() throws Throwable
	{
		System.out.println("CartNotificationLogo verified successfully -");
		return Action.isDisplayed(driver, CartNotificationLogo);
	}
	
	public CartSummaryPage ClickOn_CartNotificationLogo() throws Throwable
	{
		Action.JSClick(driver, CartNotificationLogo);
		System.out.println("CartNotificationLogo verified successfully -");
		return new CartSummaryPage();
	}
	
	public boolean Validate_ProfileLogo() throws Throwable
	{
		System.out.println("ProfileLogo verified successfully -");
		return Action.isDisplayed(driver, ProfileLogo);
	}
	
	public void ClickOn_ProfileLogo() throws Throwable
	{
		Action.JSClick(driver, ProfileLogo);
		Thread.sleep(2000);
		System.out.println("ProfileLogo verified successfully -");
	}
	
	public boolean Validate_Side_Bar_Menu_Content_In_Profile_Section() throws Throwable
	{
		System.out.println("Side_Bar_Menu_Content_In_Profile_Section verified successfully -");
		return Action.isDisplayed(driver, Side_Bar_Menu_Content_In_Profile_Section);
	}
	
	
	public String Validate_MyRaffles_TItle_Text() throws Throwable
	{
		String text = MyRaffles_TItle_Text.getText();
		return text;
	}
	
	public boolean Validate_Left_Arrow_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Left_Arrow_Symbol);
	}
	
	public void ClickOn_Left_Arrow_Symbol() throws Throwable
	{
		Action.JSClick(driver, Left_Arrow_Symbol);
	}
	
	public String Validate_MyRaffles_Tab_Text() throws Throwable
	{
		String text = MyRaffles_Tab_Text.getText();
		return text;
	}
	
	public String Validate_Active_Scetion_tab() throws Throwable
	{
		String text = Active_Scetion_tab.getText();
		return text;
	}
	
	public boolean ClickOn_Active_Section_tab() throws Throwable
	{
		return Action.JSClick(driver, Active_Scetion_tab);
	}
	
	public String Validate_Ended_Scetion_tab() throws Throwable
	{
		String text = Ended_Scetion_tab.getText();
		return text;
	}
	
	public boolean ClickOn_Ended_Section_tab() throws Throwable
	{
		return Action.JSClick(driver, Ended_Scetion_tab);
	}
	
	public String Validate_You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text() throws Throwable
	{
		String text = You_Are_Not_Currently_Enterred_Into_Any_Active_Raffles_Text.getText();
		return text;
	}
	
	public String Validate_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		String text = Click_here_to_see_whats_On_Text_Under_Active_Tab.getText();
		return text;
	}
	
	public void ClickOn_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		Action.JSClick(driver, Click_here_to_see_whats_On_Text_Under_Active_Tab);
	}
	
	public boolean Mouse_Hov_Over_Click_here_to_see_whats_On_Text_Under_Active_Tab() throws Throwable
	{
		System.out.println("Mouse Hovered On Click_here_to_see_whats_On_Text_Under_Active_Tab text successfully -");
		return Action.mouseOverElement(Click_here_to_see_whats_On_Text_Under_Active_Tab);
	}
	
	//Active Raffle Tab 
	
	public boolean Validate_One_Of_The_Selected_Active_Raffle_Description() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Selected_Active_Raffle_Description);
	}
	
	public boolean Clickon_One_Of_The_Selected_Active_Raffle_Description() throws Throwable
	{
		return Action.JSClick(driver, One_Of_The_Selected_Active_Raffle_Description);
	}
	
	public boolean Validate_Selected_Active_Raffle_Photo() throws Throwable
	{
		return Action.isDisplayed(driver, Selected_Active_Raffle_Photo);
	}
	
	public boolean Validate_Selected_Active_Raffle_Description() throws Throwable
	{
		String text = Selected_Active_Raffle_Photo.getText();
		System.out.println(text);
		return Action.isDisplayed(driver, Selected_Active_Raffle_Description);
	}
	
	public boolean Validate_View_More_Text_On_Active_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, View_More_Text_On_Active_Raffle);
	}
	
	public boolean ClickOn_View_More_Text_On_Active_Raffle() throws Throwable
	{
		return Action.JSClick(driver, View_More_Text_On_Active_Raffle);
	}
	
	public boolean Validate_View_More_Farward_Symbol_On_Active_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, View_More_Farward_Symbol_On_Active_Raffle);
	}
	
	public boolean ClickOn_View_More_Farward_Symbol_On_Active_Raffle() throws Throwable
	{
		return Action.JSClick(driver, View_More_Farward_Symbol_On_Active_Raffle);
	}
	
	public boolean Validate_List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle() throws Throwable
	{
		String text = List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle.getText();
		System.out.println(text);
		return Action.isDisplayed(driver, List_Of_Purchased_Tickets_Of_One_Of_the_Active_Raffle);
	}
	
	public boolean Validate_One_Of_The_Ticket_number_Of_Selected_Active_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Ticket_number_Of_Selected_Active_Raffle);
	}
	
	public boolean Validate_The_EndLine_Under_The_One_Of_The_Active_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, The_EndLine_Under_The_One_Of_The_Active_Raffle);
	}
	
	//Ended Raffle tab
	
	public boolean Validate_List_Of_Ended_Raffles_In_The_Ended_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, List_Of_Ended_Raffles_In_The_Ended_Tab);
	}
	
	public boolean Validate_One_Of_The_Selected_Ended_Raffle_Description() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Selected_Ended_Raffle_Description);
	}
	
	public boolean Clickon_One_Of_The_Selected_Ended_Raffle_Description() throws Throwable
	{
		return Action.JSClick(driver, One_Of_The_Selected_Ended_Raffle_Description);
	}
	
	public boolean Validate_Selected_Ended_Raffle_Photo() throws Throwable
	{
		return Action.isDisplayed(driver, Selected_Ended_Raffle_Photo);
	}
	
	public boolean Validate_Selected_Ended_Raffle_Description() throws Throwable
	{
		return Action.isDisplayed(driver, Selected_Ended_Raffle_Description);
	}
	
	public String Validate_View_More_Text_On_Ended_Raffle() throws Throwable
	{
		String text = View_More_Text_On_Ended_Raffle.getText();
		return text;
	}
	
	public boolean Validate_View_More_Farward_Symbol_On_Ended_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, View_More_Farward_Symbol_On_Ended_Raffle);
	}
	
	public boolean ClickOn_View_More_Farward_Symbol_On_Ended_Raffle() throws Throwable
	{
		return Action.JSClick(driver, View_More_Farward_Symbol_On_Ended_Raffle);
	}
	
	public boolean Validate_List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, List_Of_Purchased_Tickets_Of_One_Of_the_Ended_Raffle);
	}
	
	public boolean Validate_One_Of_The_Ticket_number_Of_Ended_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Ticket_number_Of_Ended_Raffle);
	}
	
	public boolean Validate_The_EndLine_Under_The_One_Of_The_Ended_Raffle() throws Throwable
	{
		return Action.isDisplayed(driver, The_EndLine_Under_The_One_Of_The_Ended_Raffle);
	}
	
	public String Validate_You_Have_not_Entered_Any_Raffles_Yet_Text_Under_Ended_Tab() throws Throwable
	{
		System.out.println("You_Haven_not_Entered_Any_Raffles_Yet_Text_Under_Ended_Tab verified successfully -");
		String text = You_Haven_not_Entered_Any_Raffles_Yet_Text_Under_Ended_Tab.getText();
		return text;
	}
	
	public String Validate_Click_Here_To_See_Whats_On_Text() throws Throwable
	{
		System.out.println("Click_Here_To_See_Whats_On_Text verified successfully -");
		String text = Click_Here_To_See_Whats_On_Text_Under_Ended_Tab.getText();
		return text;
	}
	
	public void ClickOn_Click_Here_To_See_Whats_On_Text_Under_Ended_Tab() throws Throwable
	{
		Action.JSClick(driver, Click_Here_To_See_Whats_On_Text_Under_Ended_Tab);
	}
	
	public boolean Mouse_Hov_Over_Click_Here_To_See_Whats_On_Text_Under_Ended_Tab() throws Throwable
	{
		return Action.mouseOverElement(Click_Here_To_See_Whats_On_Text_Under_Ended_Tab);
	}

}
