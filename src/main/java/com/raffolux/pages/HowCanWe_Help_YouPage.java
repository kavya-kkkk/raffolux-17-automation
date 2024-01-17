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
public class HowCanWe_Help_YouPage extends BaseClass
{
	@FindBy(xpath = "//h1[text()='How can we help you?']")
	WebElement How_Can_We_Help_You_Text;
	
	@FindBy(xpath = "//p[text()='Please refer to these frequently asked and answered questions.']")
	WebElement Please_Refere_To_These_Frequently_Asked_Question_Text;
	
	@FindBy(xpath = "//h3[text()='Top Questions']")
	WebElement Top_Questions_Text;
	
	@FindBy(xpath = "//h3[text()='Playing the raffles']")
	WebElement Playing_the_Raffles_Text;
	
	@FindBy(xpath = "//h3[text()='Drawing the winners']")
	WebElement Drawing_the_Winner_Text;
	
	@FindBy(xpath = "//h3[text()='Prizes']")
	WebElement Prizes_Text;
	
	@FindBy(xpath = "//h3[text()='Charity']")
	WebElement Charity_Text;
	
	@FindBy(xpath = "//h3[text()='Payment']")
	WebElement Payment_Text;
	
	@FindBy(xpath = "//h3[text()='Accounts']")
	WebElement Account_Text;
	
	//WebElements which are present under the "Top questions" section..
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[1]")
	WebElement How_Do_I_Enter_Raffle_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[2]")
	WebElement How_Do_I_Enter_Raffle_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col25\"]/p/a")
	WebElement Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[2]")
	WebElement Who_Can_Play_With_Raffolux_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[3]")
	WebElement To_Play_Raffolux_You_Must_Be_Eighteen_Text;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[3]")
	WebElement How_Is_The_Winner_Selected_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[4]")
	WebElement How_Is_The_Winner_Selected_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col38\"]/p/a[1]")
	WebElement Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col38\"]/p/a[2]")
	WebElement Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col38\"]/p/a[3]")
	WebElement Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col38\"]/p/a[4]")
	WebElement You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link collapsed'])[2]")
	WebElement When_Is_The_Draw_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[5]")
	WebElement When_Is_The_Draw_Under_The_Top_Questions_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col37\"]/p/a")
	WebElement When_Is_The_Draw_Facebook_Page_link;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[5]")
	WebElement What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[6]")
	WebElement What_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block;
	
	
	//WebElements which are present under the "Playing the Raffles" section..
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link collapsed'])[2]") 
	WebElement How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[7]")
	WebElement How_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[5]")
	WebElement How_Long_Do_Raffles_Last_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[8]")
	WebElement How_Long_Do_Raffles_Last_Text_Block;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[7]")
	WebElement Can_I_get_My_Tickets_Refunded_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[9]")
	WebElement Can_I_get_My_Tickets_Refunded_Text_Block;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[8]")
	WebElement How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[10]")
	WebElement How_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[9]")
	WebElement How_Do_I_Know_If_I_Have_Won_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[11]")
	WebElement How_Do_I_Know_If_I_Have_Won_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col46\"]/p/a[1]")
	WebElement How_Do_I_Know_If_I_Have_Won_Facebook_link;
	
	@FindBy(xpath = "//*[@id=\"col46\"]/p/a[2]")
	WebElement How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[10]")
	WebElement Where_Can_I_View_My_Tickets_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[12]")
	WebElement Where_Can_I_View_My_Tickets_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col57\"]/p/a")
	WebElement Where_Can_I_View_My_Tickets_MyRaffles_link;
	
	@FindBy(xpath = "(//a[@class='btn btn-link p-0 text-black collapsible-link'])[11]")
	WebElement Why_should_I_Play_with_Raffolux_dropdown;
	
	@FindBy(xpath = "(//p[@class='text-black'])[13]")
	WebElement Why_should_I_Play_with_Raffolux_Text_Block;
	
	//WebElements which are present under the "Drawing the Winners" section..
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[13]/h3/a")
	WebElement How_Does_The_Instant_Draw_Works_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col101\"]/p")
	WebElement How_Does_The_Instant_Draw_Works_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col101\"]/p/a")
	WebElement How_Does_The_Instant_Draw_Works_Public_Registe_link;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[14]/h3/a")
	WebElement If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col71\"]/p")
	WebElement If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col71\"]/p/a")
	WebElement If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[15]/h3/a")
	WebElement Where_Can_Watch_The_Live_Draws_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col68\"]/p")
	WebElement Where_Can_Watch_The_Live_Draws_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col68\"]/p/a[1]")
	WebElement Where_Can_Watch_The_Live_Draws_Facebook_Page_Link;
	
	@FindBy(xpath = "//*[@id=\"col68\"]/p/a[2]")
	WebElement Where_Can_Watch_The_Live_Draws_Winners_Page_Link;

	
	//WebElements which are present under the "Prizes" section..
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[16]/h3/a")
	WebElement How_Do_The_Prizes_Get_Delivered_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col42\"]/p")
	WebElement How_Do_The_Prizes_Get_Delivered_Text_Block;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[17]/h3/a")
	WebElement Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col43\"]/p")
	WebElement Can_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[18]/h3/a")
	WebElement Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col44\"]/p")
	WebElement Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_Text_Block;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[19]/h3/a")
	WebElement Can_I_Suggest_A_Prize_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col47\"]/p")
	WebElement Can_I_Suggest_A_Prize_Text_Block;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[20]/h3/a")
	WebElement What_Happens_If_The_Prize_Is_Not_Claimed_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col47\"]/p")
	WebElement What_Happens_If_The_Prize_Is_Not_Claimed_Text_Block;
	
	//WebElements which are present under the "Charity" section..
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[21]/h3/a")
	WebElement How_Does_Raffolux_Do_For_Charity_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col58\"]/p")
	WebElement How_Does_Raffolux_Do_For_Charity_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col58\"]/p/a")
	WebElement How_Does_Raffolux_Do_For_Charity_Change_at_any_time_Link;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[22]/h3/a")
	WebElement What_Charities_Does_Raffolux_Supports_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col59\"]/p")
	WebElement What_Charities_Does_Raffolux_Supports_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col59\"]/p/a")
	WebElement What_Charities_Does_Raffolux_Supports_You_Can_See_List_of_Charities_Here_Link;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[23]/h3/a")
	WebElement Can_I_Change_My_Sponsored_Charity_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col102\"]/p")
	WebElement Can_I_Change_My_Sponsored_Charity_Text_Block;
	
	@FindBy(xpath = "//*[@id=\"col102\"]/p/a")
	WebElement Can_I_Change_My_Sponsored_Charity_Here_Link;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[24]/h3/a")
	WebElement Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col60\"]/p")
	WebElement Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_Text_Block;
	
	//WebElements which are present under the "Payment" section..
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[25]")
	WebElement Are_Card_Peyments_Secure_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col49\"]/p")
	WebElement Are_Card_Peyments_Secure_Text_Block;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[26]")
	WebElement How_Can_I_Pay_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col51\"]/p")
	WebElement How_Can_I_Pay_Text_Block;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[27]")
	WebElement Can_I_Save_Card_Details_For_Future_use_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col53\"]/p")
	WebElement Can_I_Save_Card_Details_For_Future_use_Text_Block;
	
	//WebElements which are present under the "Account" section..
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[28]")
	WebElement What_If_Have_Lost_My_Email_Or_Password_dropdown;
	
	@FindBy(xpath = "//*[@id=\"col55\"]/p")
	WebElement What_If_Have_Lost_My_Email_Or_Password_Text_Block;
	
	public HowCanWe_Help_YouPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateHow_Can_We_Help_You_Text()
	{
		String text = How_Can_We_Help_You_Text.getText();
		return text;
	}
	
	public String ValidatePlease_Refere_To_These_Frequently_Asked_Question_Text()
	{
		String text = Please_Refere_To_These_Frequently_Asked_Question_Text.getText();
		return text;
	}
	
	public String ValidateTop_Questions_Text()
	{
		String text = Top_Questions_Text.getText();
		return text;
	}
	
	public String ValidatePlaying_the_Raffles_Text()
	{
		String text = Playing_the_Raffles_Text.getText();
		return text;
	}
	
	public String ValidateDrawing_the_Winner_Text()
	{
		String text = Drawing_the_Winner_Text.getText();
		return text;
	}
	
	public String ValidatePrizes_Text()
	{
		String text = Prizes_Text.getText();
		return text;
	}
	
	public String ValidateCharity_Text()
	{
		String text = Charity_Text.getText();
		return text;
	}
	
	public String ValidatePayment_Text()
	{
		String text = Payment_Text.getText();
		return text;
	}
	
	public String ValidateAccount_Text()
	{
		String text = Account_Text.getText();
		return text;
	}
	
	//WebElements which are present under the "Top questions" section..
	//How_Do_I_Enter_Raffle_dropdown
	public boolean ValidateHow_Do_I_Enter_Raffle_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Enter_Raffle_dropdown);
	}
	
	public void ClickonHow_Do_I_Enter_Raffle_dropdown() throws Throwable
	{
		 Action.JSClick(driver, How_Do_I_Enter_Raffle_dropdown);
	}
	
	public boolean ValidateHow_Do_I_Enter_Raffle_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Enter_Raffle_Text_Block);
	}
	
	public boolean ValidateFacebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown);
	}
	
	public void ClickonFacebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown() throws Throwable
	{
		 Action.JSClick(driver, Facebook_Page_Link_Under_How_Do_I_Enter_Raffle_dropdown);
	}
	
	//Who_Can_Play_With_Raffolux_dropdown
	public boolean ValidateWho_Can_Play_With_Raffolux_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Who_Can_Play_With_Raffolux_dropdown);
	}
	
	public void ClickonWho_Can_Play_With_Raffolux_dropdown() throws Throwable
	{
		 Action.JSClick(driver, Who_Can_Play_With_Raffolux_dropdown);
	}
	
	public boolean ValidateTo_Play_Raffolux_You_Must_Be_Eighteen_Text() throws Throwable
	{
		return Action.isDisplayed(driver, To_Play_Raffolux_You_Must_Be_Eighteen_Text);
	}
	
	//How_Is_The_Winner_Selected_dropdown
	public boolean ValidateHow_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Is_The_Winner_Selected_dropdown);
	}
	
	public void ClickonHow_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		 Action.JSClick(driver, How_Is_The_Winner_Selected_dropdown);
	}
	
	public boolean ValidateHow_Is_The_Winner_Selected_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Is_The_Winner_Selected_Text_Block);
	}
	
	public boolean ValidateFacebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public void ClickonFacebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		 Action.JSClick(driver, Facebook_Page_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public boolean ValidateSmart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public void ClickonSmart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		 Action.JSClick(driver, Smart_Play_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public boolean ValidatePublic_Register_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		Action.scrollIntoView(driver, Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown);
		return Action.isDisplayed(driver, Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public void ClickonPublic_Register_Link_Under_How_Is_The_Winner_Selected_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown);
		 Action.JSClick(driver, Public_Register_Link_Under_How_Is_The_Winner_Selected_dropdown);
	}
	
	public boolean ValidateYou_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link() throws Throwable
	{
		Action.scrollIntoView(driver, You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link);
		return Action.isDisplayed(driver, You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link);
	}
	
	public void ClickonYou_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link() throws Throwable
	{
		 Action.scrollIntoView(driver, You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link);
		 Action.JSClick(driver, You_Can_Find_All_Our_Winners_And_LiveDraws_Here_Link);
	}
	
	//When_Is_The_Draw_dropdown
	
	public boolean ValidateWhen_Is_The_Draw_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, When_Is_The_Draw_dropdown);
	}
	
	public void ClickonWhen_Is_The_Draw_dropdown() throws Throwable
	{
		 Action.JSClick(driver, When_Is_The_Draw_dropdown);
	}
	
	public boolean ValidateWhen_Is_The_Draw_Under_The_Top_Questions_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, When_Is_The_Draw_Under_The_Top_Questions_Text_Block);
	}
	
	public boolean ValidateWhen_Is_The_Draw_Facebook_Page_link() throws Throwable
	{
		return Action.isDisplayed(driver, When_Is_The_Draw_Facebook_Page_link);
	}
	
	public void ClickonWhen_Is_The_Draw_Facebook_Page_link() throws Throwable
	{
		 Action.JSClick(driver, When_Is_The_Draw_Facebook_Page_link);
	}
	
	//What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown
	
	public boolean ValidateWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown);
		 return Action.isDisplayed(driver, What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown);
		 
	}
	
	public void ClickonWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, What_If_Raffolux_Does_Not_Sell_Enough_Tickets_dropdown);
		 Action.JSClick(driver, What_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateWhat_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, What_If_Raffolux_Does_Not_Sell_Enough_Tickets_Text_Block);
	}
	
	//WebElements which are present under the "Playing the Raffles" section..
	//How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown
	
	public boolean ValidateHow_Many_Tickets_Can_Buy_ForA_Raffle_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown);
	}
	
	public void ClickonHow_Many_Tickets_Can_Buy_ForA_Raffle_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown);
		 Action.JSClick(driver, How_Many_Tickets_Can_Buy_ForA_Raffle_dropdown);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Many_Tickets_Can_Buy_ForA_Raffle_Text_Block);
	}
	
	//How_Long_Do_Raffles_Last_dropdown
	public boolean ValidateHow_Long_Do_Raffles_Last_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Long_Do_Raffles_Last_dropdown);
	}
	
	public void ClickonHow_Long_Do_Raffles_Last_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Long_Do_Raffles_Last_dropdown);
		 Action.ClickElementByJS(How_Long_Do_Raffles_Last_dropdown, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Long_Do_Raffles_Last_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Long_Do_Raffles_Last_Text_Block);
	}
	//Can_I_get_My_Tickets_Refunded_dropdown
	public boolean ValidateCan_I_get_My_Tickets_Refunded_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_get_My_Tickets_Refunded_dropdown);
	}
	
	public void ClickonCan_I_get_My_Tickets_Refunded_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, Can_I_get_My_Tickets_Refunded_dropdown);
		 Action.ClickElementByJS(Can_I_get_My_Tickets_Refunded_dropdown, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateCan_I_get_My_Tickets_Refunded_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_get_My_Tickets_Refunded_Text_Block);
	}
	//How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown
	
	public boolean ValidateHow_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown);
	}
	
	public void ClickonHow_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown);
		 Action.ClickElementByJS(How_Much_Does_It_Cost_To_Enter_The_Raffle_dropdown, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Much_Does_It_Cost_To_Enter_The_Raffle_Text_Block);
	}
	//How_Do_I_Know_If_I_Have_Won_dropdown
	
	public boolean ValidateHow_Do_I_Know_If_I_Have_Won_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Know_If_I_Have_Won_dropdown);
	}
	
	public void ClickonHow_Do_I_Know_If_I_Have_Won_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Do_I_Know_If_I_Have_Won_dropdown);
		 Action.ClickElementByJS(How_Do_I_Know_If_I_Have_Won_dropdown, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Do_I_Know_If_I_Have_Won_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Know_If_I_Have_Won_Text_Block);
	}
	
	public boolean ValidateHow_Do_I_Know_If_I_Have_Won_Facebook_link() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Know_If_I_Have_Won_Facebook_link);
	}
	
	public void ClickonHow_Do_I_Know_If_I_Have_Won_Facebook_link() throws Throwable
	{ 
		 Action.scrollIntoView(driver, How_Do_I_Know_If_I_Have_Won_Facebook_link);
		 Action.ClickElementByJS(How_Do_I_Know_If_I_Have_Won_Facebook_link, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link);
	}
	
	public void ClickonHow_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link);
		 Action.ClickElementByJS(How_Do_I_Know_If_I_Have_Won_You_can_also_check_our_winners_here_link, driver);
		 Thread.sleep(2000);
	}
	
	//Where_Can_I_View_My_Tickets_dropdown
	
	public boolean ValidateWhere_Can_I_View_My_Tickets_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_I_View_My_Tickets_dropdown);
	}
	
	public void ClickonWhere_Can_I_View_My_Tickets_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Where_Can_I_View_My_Tickets_dropdown, driver);
	}
	
	public boolean ValidateWhere_Can_I_View_My_Tickets_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_I_View_My_Tickets_Text_Block);
	}
	
	public boolean ValidateWhere_Can_I_View_My_Tickets_MyRaffles_link() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_I_View_My_Tickets_MyRaffles_link);
	}
	
	public void ClickonWhere_Can_I_View_My_Tickets_MyRaffles_link() throws Throwable
	{
		 Action.ClickElementByJS(Where_Can_I_View_My_Tickets_MyRaffles_link, driver);
	}
	
	//Why_should_I_Play_with_Raffolux_dropdown
	public boolean ValidateWhy_should_I_Play_with_Raffolux_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Why_should_I_Play_with_Raffolux_dropdown);
	}
	
	public void ClickonWhy_should_I_Play_with_Raffolux_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Why_should_I_Play_with_Raffolux_dropdown, driver);
	}
	
	public boolean ValidateWhy_should_I_Play_with_Raffolux_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Why_should_I_Play_with_Raffolux_Text_Block);
	}
	
	//WebElements which are present under the "Drawing the Winners" section..
	//How_Does_The_Instant_Draw_Works_dropdown
	public boolean ValidateHow_Does_The_Instant_Draw_Works_dropdown() throws Throwable
	{
		Action.scrollIntoView(driver, How_Does_The_Instant_Draw_Works_dropdown);
		return Action.isDisplayed(driver, How_Does_The_Instant_Draw_Works_dropdown);
		
	}
	
	public void ClickonHow_Does_The_Instant_Draw_Works_dropdown() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Does_The_Instant_Draw_Works_dropdown);
		 Action.ClickElementByJS(How_Does_The_Instant_Draw_Works_dropdown, driver);
		 Thread.sleep(2000);
	}
	
	public boolean ValidateHow_Does_The_Instant_Draw_Works_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Does_The_Instant_Draw_Works_Text_Block);
	}
	
	public boolean ValidateHow_Does_The_Instant_Draw_Works_Public_Registe_link() throws Throwable
	{
		return Action.isDisplayed(driver, How_Does_The_Instant_Draw_Works_Public_Registe_link);
	}
	
	public void ClickonHow_Does_The_Instant_Draw_Works_Public_Registe_link() throws Throwable
	{
		 Action.scrollIntoView(driver, How_Does_The_Instant_Draw_Works_Public_Registe_link);
		 Action.ClickElementByJS(How_Does_The_Instant_Draw_Works_Public_Registe_link, driver);
		 Thread.sleep(2000);
	}
	
	//If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown
	public boolean ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown);
	}
	public void ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_dropdown, driver);
	}
	
	public boolean ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Text_Block);
	}
	
	public boolean ValidateIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link() throws Throwable
	{
		return Action.isDisplayed(driver, If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link);
	}
	
	public void ClickonIf_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link() throws Throwable
	{
		 Action.ClickElementByJS(If_My_Ticket_Drawn_Live_How_Will_I_Find_Out_If_Im_Not_Watching_Check_The_Winners_List_Here_Link, driver);
	}
	
	//Where_Can_Watch_The_Live_Draws_dropdown
	public boolean ValidateWhere_Can_Watch_The_Live_Draws_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_Watch_The_Live_Draws_dropdown);
	}
	public void ClickonWhere_Can_Watch_The_Live_Draws_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Where_Can_Watch_The_Live_Draws_dropdown, driver);
	}
	
	public boolean ValidateWhere_Can_Watch_The_Live_Draws_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_Watch_The_Live_Draws_Text_Block);
	}
	
	public boolean ValidateWhere_Can_Watch_The_Live_Draws_Facebook_Page_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_Watch_The_Live_Draws_Facebook_Page_Link);
	}
	
	public void ClickonWhere_Can_Watch_The_Live_Draws_Facebook_Page_Link() throws Throwable
	{
		 Action.ClickElementByJS(Where_Can_Watch_The_Live_Draws_Facebook_Page_Link, driver);
	}
	
	public boolean ValidateWhere_Can_Watch_The_Live_Draws_Winners_Page_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Where_Can_Watch_The_Live_Draws_Winners_Page_Link);
	}
	
	public void ClickonWhere_Can_Watch_The_Live_Draws_Winners_Page_Link() throws Throwable
	{
		 Action.ClickElementByJS(Where_Can_Watch_The_Live_Draws_Winners_Page_Link, driver);
	}
	
	//WebElements which are present under the "Prizes" section..
	//How_Do_The_Prizes_Get_Delivered_dropdown
	public boolean ValidateHow_Do_The_Prizes_Get_Delivered_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_The_Prizes_Get_Delivered_dropdown);
	}
	public void ClickonHow_Do_The_Prizes_Get_Delivered_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(How_Do_The_Prizes_Get_Delivered_dropdown, driver);
	}
	
	public boolean ValidateHow_Do_The_Prizes_Get_Delivered_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Do_The_Prizes_Get_Delivered_Text_Block);
	}
	
	//Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown
	public boolean ValidateCan_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown);
	}
	public void ClickonCan_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Can_I_Raceive_A_Cash_Alternative_To_My_Prize_dropdown, driver);
	}
	
	public boolean ValidateCan_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Raceive_A_Cash_Alternative_To_My_Prize_Text_Block);
	}
	
	//Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown
	public boolean ValidateDo_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown);
	}
	public void ClickonDo_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_dropdown, driver);
	}
	
	public boolean ValidateDo_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Do_Holiday_And_Experience_Prizes_need_to_be_Taken_On_Specific_Dates_Text_Block);
	}
	
	//Can_I_Suggest_A_Prize_dropdown
	
	public boolean ValidateCan_I_Suggest_A_Prize_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Suggest_A_Prize_dropdown);
	}
	public void ClickonCan_I_Suggest_A_Prize_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Can_I_Suggest_A_Prize_dropdown, driver);
	}
	
	public boolean ValidateCan_I_Suggest_A_Prize_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Suggest_A_Prize_Text_Block);
	}
	
	//What_Happens_If_The_Prize_Is_Not_Claimed_dropdown
	public boolean ValidateWhat_Happens_If_The_Prize_Is_Not_Claimed_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, What_Happens_If_The_Prize_Is_Not_Claimed_dropdown);
	}
	public void ClickonWhat_Happens_If_The_Prize_Is_Not_Claimed_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(What_Happens_If_The_Prize_Is_Not_Claimed_dropdown, driver);
	}
	
	public boolean ValidateWhat_Happens_If_The_Prize_Is_Not_Claimed_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, What_Happens_If_The_Prize_Is_Not_Claimed_Text_Block);
	}
	
	//WebElements which are present under the "Charity" section..
	//How_Does_Raffolux_Do_For_Charity_dropdown
	
	public boolean ValidateHow_Does_Raffolux_Do_For_Charity_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Does_Raffolux_Do_For_Charity_dropdown);
	}
	public void ClickonHow_Does_Raffolux_Do_For_Charity_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(How_Does_Raffolux_Do_For_Charity_dropdown, driver);
	}
	
	public boolean ValidateHow_Does_Raffolux_Do_For_Charity_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Does_Raffolux_Do_For_Charity_Text_Block);
	}
	
	public boolean ValidateHow_Does_Raffolux_Do_For_Charity_Change_at_any_time_Link() throws Throwable
	{
		return Action.isDisplayed(driver, How_Does_Raffolux_Do_For_Charity_Change_at_any_time_Link);
	}
	public void ClickonHow_Does_Raffolux_Do_For_Charity_Change_at_any_time_Link() throws Throwable
	{
		 Action.ClickElementByJS(How_Does_Raffolux_Do_For_Charity_Change_at_any_time_Link, driver);
	}
	
	//What_Charities_Does_Raffolux_Supports_dropdown
	public boolean ValidateWhat_Charities_Does_Raffolux_Supports_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, What_Charities_Does_Raffolux_Supports_dropdown);
	}
	public void ClickonWhat_Charities_Does_Raffolux_Supports_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(What_Charities_Does_Raffolux_Supports_dropdown, driver);
	}
	
	public boolean ValidateWhat_Charities_Does_Raffolux_Supports_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, What_Charities_Does_Raffolux_Supports_Text_Block);
	}
	
	public boolean ValidateWhat_Charities_Does_Raffolux_Supports_You_Can_See_List_of_Charities_Here_Link() throws Throwable
	{
		return Action.isDisplayed(driver, What_Charities_Does_Raffolux_Supports_You_Can_See_List_of_Charities_Here_Link);
	}
	public void ClickonWhat_Charities_Does_Raffolux_Supports_You_Can_See_List_of_Charities_Here_Link() throws Throwable
	{
		 Action.ClickElementByJS(What_Charities_Does_Raffolux_Supports_You_Can_See_List_of_Charities_Here_Link, driver);
	}
	
	//Can_I_Change_My_Sponsored_Charity_dropdown
	
	public boolean ValidateCan_I_Change_My_Sponsored_Charity_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Change_My_Sponsored_Charity_dropdown);
	}
	public void ClickonCan_I_Change_My_Sponsored_Charity_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Can_I_Change_My_Sponsored_Charity_dropdown, driver);
	}
	
	public boolean ValidateCan_I_Change_My_Sponsored_Charity_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Change_My_Sponsored_Charity_Text_Block);
	}
	
	public boolean ValidateCan_I_Change_My_Sponsored_Charity_Here_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Change_My_Sponsored_Charity_Here_Link);
	}
	public void ClickonCan_I_Change_My_Sponsored_Charity_Here_Link() throws Throwable
	{
		 Action.ClickElementByJS(Can_I_Change_My_Sponsored_Charity_Here_Link, driver);
	}
	
	//Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown
	
	public boolean ValidateCan_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown);
	}
	public void ClickonCan_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_dropdown, driver);
	}
	
	public boolean ValidateCan_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_My_Bussiness_Or_Charity_Become_A_Raffolux_Partner_Text_Block);
	}
	
	//WebElements which are present under the "Payment" section..
	//Are_Card_Peyments_Secure_dropdown
	
	public boolean ValidateAre_Card_Peyments_Secure_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Are_Card_Peyments_Secure_dropdown);
	}
	public void ClickonAre_Card_Peyments_Secure_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Are_Card_Peyments_Secure_dropdown, driver);
	}
	
	public boolean ValidateAre_Card_Peyments_Secure_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Are_Card_Peyments_Secure_Text_Block);
	}
	
	//How_Can_I_Pay_dropdown
	public boolean ValidateHow_Can_I_Pay_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, How_Can_I_Pay_dropdown);
	}
	public void ClickonHow_Can_I_Pay_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(How_Can_I_Pay_dropdown, driver);
	}
	
	public boolean ValidateHow_Can_I_Pay_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, How_Can_I_Pay_Text_Block);
	}
	
	//Can_I_Save_Card_Details_For_Future_use_dropdown
	public boolean ValidateCan_I_Save_Card_Details_For_Future_use_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Save_Card_Details_For_Future_use_dropdown);
	}
	public void ClickonCan_I_Save_Card_Details_For_Future_use_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(Can_I_Save_Card_Details_For_Future_use_dropdown, driver);
	}
	
	public boolean ValidateCan_I_Save_Card_Details_For_Future_use_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Can_I_Save_Card_Details_For_Future_use_Text_Block);
	}
	
	//What_If_Have_Lost_My_Email_Or_Password_dropdown
	public boolean ValidateWhat_If_Have_Lost_My_Email_Or_Password_dropdown() throws Throwable
	{
		return Action.isDisplayed(driver, What_If_Have_Lost_My_Email_Or_Password_dropdown);
	}
	public void ClickonWhat_If_Have_Lost_My_Email_Or_Password_dropdown() throws Throwable
	{
		 Action.ClickElementByJS(What_If_Have_Lost_My_Email_Or_Password_dropdown, driver);
	}
	
	public boolean ValidateWhat_If_Have_Lost_My_Email_Or_Password_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, What_If_Have_Lost_My_Email_Or_Password_Text_Block);
	}
	
}

