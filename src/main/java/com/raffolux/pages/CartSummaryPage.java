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
public class CartSummaryPage extends BaseClass
{
	@FindBy(id = "raffolux-logo")
	WebElement HomePage_RaffoluxLogo;
	
	@FindBy(linkText = "Winners")
	WebElement WinnersLink;
	
	@FindBy(linkText = "My Raffles")
	WebElement Mytickets_Link;
	
	@FindBy(xpath = "(//i[@class='fal fa-shopping-cart'])[1]")
	WebElement CartNotificationLogo;
	
	@FindBy(xpath = "//*[@id=\"mainMenuContent\"]/ul/li[4]/a/i")
	WebElement ProfileLogo;
	
	@FindBy(xpath = "//div[@class='pointsClaimed']")
	WebElement Points_Wallet_On_header_part;
	
	@FindBy(xpath = "//h3[@class='bg-pale text-black py-4 m-0 cart-txt']")
	WebElement Cart_Text;
	
	@FindBy(xpath = "bg-pale text-black mb-hide")
	WebElement Summary_Text;
	
	@FindBy(xpath = "//i[@class='fas fa-arrow-left']")
	WebElement Left_Arrow_Symbol;
	
	@FindBy(xpath = "//div[@class='align-items-center text-always-black bg-accent home-timer-lower px-2']")
	WebElement Your_Cart_Will_Expiry_Text;
	
	@FindBy(xpath = "//i[@class='fas fa-alarm-exclamation pt-1 pr-2']")
	WebElement Timer_Exlamation_Symbol;
	
	@FindBy(xpath = "//h3[@class='bg-pale text-black w-100 mb-hide']")
	WebElement Your_Cart_Text;
	
	@FindBy(xpath = "//div[@class='cart_items_container col-12 ']")
	WebElement Cart_Item_Container_Or_Section;
	
	@FindBy(xpath = "(//i[@class='fal fa-times text-black mr-2'])[1]")
	WebElement Cart_Item_Container_Remove_Symbol;

	@FindBy(xpath = "//img[@class='raffle_photo ']")
	WebElement Selected_Raffle_Photo;
	
	@FindBy(xpath = "raffle_info_mob_container  pl-md-0")
	WebElement Selected_Raffle_Info;
	
	@FindBy(xpath = "//h5[@class='mb-item-title-txt mb-margin-remove']")
	WebElement Selected_Raffle_Title;
	
	@FindBy(xpath = "//div[@class='col entry-details mb-hide']")
	WebElement Selected_Raffle_Tickets_And_Price_Info;
	
	@FindBy(xpath = "(//div[@class='all_raffle_tickets_in_cart'])[1]")
	WebElement All_Raffles_Tickets_In_Cart;
	
	@FindBy(xpath = "(//button[@class='add_entry_button text-black'])[1]")
	WebElement Add_Entry_Text_Block;
	
	@FindBy(xpath = "(//i[@class='fal fa-times text-always-black'])[1]")
	WebElement Ticket_Remove_Cross_Symbol_One_Of_the_ticket;
	
	@FindBy(xpath = "(//i[@class='far fa-gift text-always-black'])[1]")
	WebElement Gift_Symnbol_On_One_Of_the_ticket;
	
	@FindBy(xpath = "//p[@class='pl-3 yellow-txt']")
	WebElement Cart_Item_total_Price;
	
	@FindBy(xpath = "//div[@class='hr-cards-wrapper']")
	WebElement Cart_Item_End_Line;
	
	@FindBy(xpath = "//div[@class='bag_total_desktop mb-bag_total_desktop w-100 new-bxs']")
	WebElement Summary_Section;
	
	@FindBy(xpath = "//div[@class='col-12']")
	WebElement Play_With_Confidence_Section_Text;
	
	@FindBy(xpath = "//div[@class='col-12 queryText']")
	WebElement Query_Text_Under_Play_With_Confidence_Section_Text;
	
	@FindBy(xpath = "//div[@class='col-12 col-md-9 my-5 text-center rated-star ml-md-3']")
	WebElement Trust_Pilot_Image;
	
	@FindBy(xpath = "//div[@class='col-8']")
	WebElement My_Cart_text_In_Summary_Section;
	
	@FindBy(xpath = "cart-raw-total-my-cart")
	WebElement Cart_Raw_Total_Price_In_Summary_Section;
	
	@FindBy(xpath = "//button[@class='btn text-black body-bg d-flex justify-content-between']")
	WebElement Promo_Code_Dropdown;
	
	@FindBy(xpath = "//i[@class='fas fa-chevron-down fa-s d-flex pt-1']")
	WebElement Promo_Code_Dropdown_Arrow_Symbol;
	
	@FindBy(xpath = "//input[@class='input-promo-box pl-2 bg-pale text-black']")
	WebElement Enter_PromoCode_textfield;
	
	@FindBy(xpath = "//button[@class='primary-btn btn-12 ml-2 text-always-blacktext-always-black mb-applyBtn-txt']")
	WebElement PromoCode_Apply_Button;
	
	@FindBy(xpath = "//div[@class='mb-cart-balanceTxt']")
	WebElement Use_Credit_Balance_Text_In_Summary_Section;
	
	@FindBy(xpath = "//div[@class='pt-1 px-2 primary-text bg-badge-credit-balance']")
	WebElement Credit_Balance_Text;
	
	@FindBy(xpath = "d-flex credit-txt")
	WebElement Use_My_Credit_Balance_For_This_Purchase_text;
	
	@FindBy(id = "use_credit_checkbox")
	WebElement Credit_CheckBox_Of_Use_My_Credit_Balance_For_This_Purchase_text;
	
	@FindBy(xpath = "//h5[@class='mb-totalTxt']")
	WebElement Total_Text_In_Summary_Section;
	
	@FindBy(xpath = "cart-raw-total")
	WebElement Cart_Raw_Total_In_Summary_Section;
	
	@FindBy(xpath = "//div[@class='earn-text hidemobile']")
	WebElement You_Will_Earn_X_No_of_Points_For_This_Purchase_Text;
	
	@FindBy(xpath = "//button[@class='primary-btn px-3 mb-checkoutBtn-txt']")
	WebElement CheckOut_Button;
	
	@FindBy(xpath = "(//div[@class='text-always-black'])[2]")
	WebElement CheckOut_Text_CheckOut_Button;
	
	@FindBy(xpath = "(//div[@class='text-always-black checkout_total_button'])[2]")
	WebElement CheckOut_Total_On_CheckOut_Button;
	
	/*@FindBy(id = "empty_bag_message")
	WebElement YourCartIsEmptyMessage;
	//-----------------------------------------------------------------------------------
	@FindBy(xpath = "//h1[text()='That voucher is not valid']")
	WebElement ThatVoucherIsNotValidText;
	
	@FindBy(xpath = "//p[text()='Try a different voucher code']")
	WebElement TryADifferentVoucherCodeText;
	
	@FindBy(xpath = "//a[text()='go back']")
	WebElement GOBackButton;*/
	
	//-------------------------------------------------------------------------------------
	
	public CartSummaryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateRaffoluxLogo() throws Throwable
	{
		Action.isDisplayed(driver, HomePage_RaffoluxLogo);
		System.out.println("Raffolux logo verified successfully -");
	}
	
	public void CliockonRaffoluxLogo() throws Throwable
	{
		Action.Click(driver, HomePage_RaffoluxLogo);
		//Assert.assertEquals("true", "false");
		System.out.println("Raffolux logo verified successfully -");
	}
	
	public void ValidateWinnersLink() throws Throwable
	{
		Action.isDisplayed(driver, WinnersLink);
		System.out.println("WinnersLink verified successfully -");
	}
	
	public void CliockonWinnersLink() throws Throwable
	{
		Action.Click(driver, WinnersLink);
		System.out.println("WinnersLink verified successfully -");
	}
	
	public void MousehovOverWinnersLink() throws Throwable
	{
		Action.mouseOverElement(WinnersLink);
		System.out.println("WinnersLink verified successfully -");
	}
	
	public void Validate_Points_Wallet_On_header_part() throws Throwable
	{
		Action.isDisplayed(driver, Points_Wallet_On_header_part);
		System.out.println("Points_Wallet_On_header_part verified successfully -");
	}
	
	public void Clickon_Points_Wallet_On_header_part() throws Throwable
	{
		Action.JSClick(driver, Points_Wallet_On_header_part);
		System.out.println("Points_Wallet_On_header_part verified successfully -");
	}
	
	public void ValidateMyRafflesLink() throws Throwable
	{
		Action.isDisplayed(driver, Mytickets_Link);
		System.out.println("Mytickets_Link verified successfully -");
	}
	
	public MyRafflesPage2 CliockonMyRafflesLink() throws Throwable
	{
		Action.JSClick(driver, Mytickets_Link);
		System.out.println("Mytickets_Link verified successfully -");
		
		return new MyRafflesPage2();
	}
	
	public void MousehovOverMyRafflesLink() throws Throwable
	{
		Action.mouseOverElement(Mytickets_Link);
		System.out.println("Mytickets_Link verified successfully -");
	}
	
	public void ValidateCartNotificationLogo() throws Throwable
	{
		Action.isDisplayed(driver, CartNotificationLogo);
		System.out.println("CartNotificationLogo verified successfully -");
	}
	
	public CartSummaryPage ClickonCartNotificationLogo() throws Throwable
	{
		Action.Click(driver, CartNotificationLogo);
		System.out.println("CartNotificationLogo verified successfully -");
		return new CartSummaryPage();
	}
	
	public void ValidateProfileLogo() throws Throwable
	{
		Action.isDisplayed(driver, ProfileLogo);
		System.out.println("ProfileLogo verified successfully -");
	}
	
	public void CliockonProfileLogo() throws Throwable
	{
		Action.Click(driver, ProfileLogo);
		Thread.sleep(2000);
		System.out.println("ProfileLogo verified successfully -");
	}
	
	public String Validate_Cart_Text() throws Throwable
	{
		String text = Cart_Text.getText();
		return text;
	}
	
	public String Validate_Summary_Text() throws Throwable
	{
		String text = Summary_Text.getText();
		return text;
	}
	
	public boolean Validate_Left_Arrow_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Left_Arrow_Symbol);
	}
	
	public boolean ClickOn_Left_Arrow_Symbol() throws Throwable
	{
		return Action.JSClick(driver, Left_Arrow_Symbol);
	}
	
	public String ValidateYourCartwillExpiryInText() throws Throwable
	{
		String text = Your_Cart_Will_Expiry_Text.getText();
		return text;
	}
	
	public boolean Validate_Timer_Exlamation_Symbol() throws Throwable
	{
		System.out.println(Timer_Exlamation_Symbol.getText());
		return Action.isDisplayed(driver, Timer_Exlamation_Symbol);
	}
	
	public boolean Validate_Cart_Item_Container_Or_Section() throws Throwable
	{
		return Action.isDisplayed(driver, Cart_Item_Container_Or_Section);
	}
	
	public boolean Validate_Cart_Item_Container_Remove_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Cart_Item_Container_Remove_Symbol);
	}
	
	public boolean Clickon_Cart_Item_Container_Remove_Symbol() throws Throwable
	{
		return Action.JSClick(driver, Cart_Item_Container_Remove_Symbol);
	}
	
	public String Validate_Your_Cart_Text() throws Throwable
	{
		String text = Your_Cart_Text.getText();
		return text;
	}
	
	public boolean Validate_Selected_Raffle_Photo() throws Throwable
	{
		return Action.isDisplayed(driver, Selected_Raffle_Photo);
	}

	public String Validate_Selected_Raffle_Title() throws Throwable
	{
		String text = Selected_Raffle_Title.getText();
		return text;
	}
	
	public boolean Validate_Selected_Raffle_Info() throws Throwable
	{
		System.out.println(Selected_Raffle_Info.getText());
		return Action.isDisplayed(driver, Selected_Raffle_Info);
	}
	
	public boolean Validate_Selected_Raffle_Tickets_And_Price_Info() throws Throwable
	{
		System.out.println(Selected_Raffle_Tickets_And_Price_Info.getText());
		return Action.isDisplayed(driver, Selected_Raffle_Tickets_And_Price_Info);
	}
	
	public boolean Validate_Ticket_Remove_Cross_Symbol_One_Of_the_ticket() throws Throwable
	{
		return Action.isDisplayed(driver, Ticket_Remove_Cross_Symbol_One_Of_the_ticket);
	}
	
	public void Clickon_Ticket_Remove_Cross_Symbol_One_Of_the_ticket() throws Throwable
	{
	    Action.JSClick(driver, Ticket_Remove_Cross_Symbol_One_Of_the_ticket);
	}
	
	public boolean Validate_Gift_Symbol_On_One_Of_the_ticket() throws Throwable
	{
		return Action.isDisplayed(driver, Gift_Symnbol_On_One_Of_the_ticket);
	}
	
	public boolean Validate_Add_Entry_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, Add_Entry_Text_Block);
	}
	
	public void Clickon_Add_Entry_Text_Block() throws Throwable
	{
		Action.JSClick(driver, Add_Entry_Text_Block);
		Thread.sleep(2000);
	}
	
	public boolean Validate_All_Raffles_Tickets_In_Cart() throws Throwable
	{
		return Action.isDisplayed(driver, All_Raffles_Tickets_In_Cart);
	}
	
	public String ValidatePricePerEachTicketEntered() throws Throwable
	{
		String text = PricePerEachTicketEntered.getText();
		//Action.isDisplayed(driver, PricePerEachTicketEntered);
		return text;
	}
	
	public String ValidateCartTotalOption() throws Throwable
	{
		String text = CartTotalOption.getText();
		//Action.isDisplayed(driver, CartTotalOption);
		return text;
	}
	
	public boolean ValidatePromoCodeButton() throws Throwable
	{
		
		return Action.isDisplayed(driver, PromoCodeButton);
	}
	
	public void ClickonPromoCodeButton() throws Throwable
	{
		
		Action.Click(driver, PromoCodeButton);
	}
	
	public boolean ValidatePromoCodeDropdownOption() throws Throwable
	{
	
		return Action.isDisplayed(driver, PromoCodeDropdownOption);
	}
	
	public void ClickonPromoCodeDropdownOption() throws Throwable
	{
		
		Action.Click(driver, PromoCodeDropdownOption);
	}
	
	public boolean ValidatepromoCodeTextBox() throws Throwable
	{
		
		return Action.isDisplayed(driver, promoCodeTextBox);
	}
	
	public boolean ValidatepromoCodeTextBoxByEnteringtheValidInput() throws Throwable  //Invalid input--------------------------------Need to Complete later
	{
		
		return Action.type(promoCodeTextBox, "123");
	}
	
	public boolean ValidatepromoCodeTextBoxByEnteringtheInValidInput() throws Throwable  //Invalid input --------------------------------Need to Complete later
	{
		
		return Action.type(promoCodeTextBox, "111");
	}
	
	public boolean ValidateThatVoucherIsNotValidText() throws Throwable  //--------------------------------Need to Complete later
	{
		
		return Action.isDisplayed(driver, TryADifferentVoucherCodeText);
	}
	
	public boolean ValidateTryADifferentVoucherCodeText() throws Throwable  //--------------------------------Need to Complete later
	{
		
		return Action.isDisplayed(driver, TryADifferentVoucherCodeText);
	}
	
	public boolean ValidateGOBackButton() throws Throwable  //--------------------------------Need to Complete later
	{
		
		return Action.isDisplayed(driver, GOBackButton);
	}
	
	public boolean ClickonGOBackButton() throws Throwable  //--------------------------------Need to Complete later
	{
		
		return Action.Click(driver, GOBackButton);
	}
	
	public boolean ValidatepromoCodeApplyButton() throws Throwable
	{
		
		return Action.isDisplayed(driver, promoCodeApplyButton);
	}
	
	public void ClickonpromoCodeApplyButton() throws Throwable
	{
		
		Action.JSClick(driver, promoCodeApplyButton);
	}
	
	
	public String ValidateTotalOptionUnderCartTotalSection() throws Throwable
	{
		String text = TotalOptionUnderCartTotalSection.getText();
		//return Action.isDisplayed(driver, TotalOptionUnderCartTotalSection);
		return text;
	}
	
	public String ValidateTotalPricePerEachTicketsOfAllTheSelectedRaffles() throws Throwable
	{
		String text = TotalPricePerEachTicketsOfAllTheSelectedRaffles.getText();
		return text;
		//Action.isDisplayed(driver, TotalPricePerEachTicketsOfAllTheSelectedRaffles);
	}
	
	public boolean ValidateCheckOutButtonOption() throws Throwable
	{
		
		return Action.isDisplayed(driver, CheckOutButtonOption);
	}
	
	public PaymentPage ClickonCheckOutButtonOption() throws Throwable
	{
		Action.JSClick(driver, CheckOutButtonOption);
		return new PaymentPage();
	}
	
	public String ValidateTotalPricePerEachTicketsOfAllTheSelectedRafflesOnCheckOutButton() throws Throwable
	{
		String text = TotalPricePerEachTicketsOfAllTheSelectedRafflesOnCheckOutButton.getText();
		//System.out.println("CheckOutButton verified successfully -");
		//Action.isDisplayed(driver, TotalPricePerEachTicketsOfAllTheSelectedRafflesOnCheckOutButton);
		return text;
	}
	
	/*public String ValidateYourCartIsEmptyMessage() throws Throwable //-----------------------------------------
	{
		String text = YourCartIsEmptyMessage.getText();
		//return Action.isDisplayed(driver, YourCartIsEmptyMessage);
		return text;
	}*/
	
	
	
	
}
