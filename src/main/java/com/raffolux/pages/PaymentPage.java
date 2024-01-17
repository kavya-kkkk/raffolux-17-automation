/**
 * 
 */
package com.raffolux.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class PaymentPage extends BaseClass
{
	@FindBy(xpath = "//a[@class = 'btn-home bg-special text-always-black']")
	WebElement Instant_Raffle_Enter_Now_Button;
	
	@FindBy(xpath = "//div[@class='v-avatar d-flex mx-auto justify-space-around avatar white']")
	WebElement VivaWalletLogo;
	
	@FindBy(xpath = "//img[@alt='Gerry Lianos']")
	WebElement VivaWalletLogoText;
	
	@FindBy(xpath = "language-button")
	WebElement Language_Dropdown_Button;
	
	@FindBy(xpath = "//div[text()=' Gerry Lianos ']")             //Gerry Lianos
	WebElement MarchentNameText;
	
	@FindBy(xpath = "//div[@class='col-12 text-center non-editable-amount-info text-h5']")
	WebElement Non_EditableAmmountInfoText;
	
	@FindBy(xpath = "//span[@class='subtitle-2 order-notes']")
	WebElement Selected_TicketsList_Text;
	
	@FindBy(id = "currency-symbol")
	WebElement Currency_Symbol;
	
	@FindBy(id = "formatted-amount")
	WebElement Formatted_Amount_Of_Selected_Tickets;
	
	@FindBy(xpath = "//div[text()=' Payment code ']")
	WebElement PaymentCodeText;
	
	@FindBy(id = "order-code")
	WebElement GeneratedPaymentCode;
	
	@FindBy(xpath = "//div[text()=' Payment code expiry ']")
	WebElement PaymentCodeExpiryText;
	
	@FindBy(id = "expiration-date")
	WebElement PaymentCodeExpiryDate;
	
	@FindBy(xpath = "//span[text()='Powered by']")
	WebElement PoweredByLogo_WrapperText;
	
	@FindBy(xpath = "//span[text()=' Viva Wallet ']")
	WebElement Viva_WalletLogo_WrapperText;
	
	@FindBy(xpath = "//*[@id=\"Layer_1\"]")
	WebElement Viva_WalletLogo_Symbol;
	
	@FindBy(xpath = "//*[@id=\"g-pay-container\"]/div/button")
	WebElement GooglePayPaymentOption_Button;
	
	@FindBy(xpath = "//span[text()=' Or pay with ']")
	WebElement Or_PayWithOption_Text;
	
	@FindBy(xpath = "//*[@id=\"saved-cards-toggle\"]")
	WebElement Saved_Cards_Toggle;
	
	//WebElements on Save Cards options------------------------------------------------------------------
	
	@FindBy(xpath = "//*[@id=\"stored-card-d9df603b-9854-4fd9-a99b-9a273770b64d\"]")
	WebElement Saved_Card;
	
	@FindBy(xpath = "//*[@id=\"stored-card-name-d9df603b-9854-4fd9-a99b-9a273770b64d\"]")
	WebElement Saved_CardName_Taxt;
	
	@FindBy(xpath = "//*[@id=\"stored-card-d9df603b-9854-4fd9-a99b-9a273770b64d\"]/div[1]/div/div[2]/div/div[1]")
	WebElement Saved_HiddenCardNumber;
	
	@FindBy(xpath = "//span[text()='Expires']")
	WebElement Saved_Card_ExpiryText;
	
	@FindBy(xpath = "//span[text()=' 03/25 ']")
	WebElement Saved_Card_ExpiryDate;
	
	@FindBy(xpath = "//div[text()=' CVV Security Code ']")
	WebElement CVV_SecurityCode_Text;
	
	@FindBy(xpath = " It’s usually on the back of your card. ")
	WebElement  ItIsUsuallyonThebackOfYourCard_Text;
	
	@FindBy(xpath = "//*[@id=\"stored-card-d9df603b-9854-4fd9-a99b-9a273770b64d\"]/div[2]/div[2]/span/div")
	WebElement  CVV_TextField;
	
	//---------------------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//*[@id=\"other-card-toggle\"]")
	WebElement Other_Cards_Toggle;
	
	@FindBy(name = "emailAddress")
	WebElement EmailAddress_TextField;
	
	@FindBy(id = "emailAddress-error-message")
	WebElement EmailAddress_error_message;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[1]/span/div/div/div/div[1]/label")
	WebElement EmailAddress_LableText;
	
	@FindBy(name = "cardHolder")
	WebElement CardHolderName_TextField;
	
	@FindBy(id = "cardHolder-error-message")
	WebElement CardHolder_error_message;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[2]/span/div/div/div/div[1]/label")
	WebElement CardHolderName_LableText;
	
	@FindBy(name = "cardNumber")
	WebElement CardNumber_TextField;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[3]/span/div[1]/div/div[1]/div[1]/label")
	WebElement CardNumber_LableText;
	
	@FindBy(id = "cardNumber-error-message")
	WebElement CardNumber_error_message;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[3]/span/div[1]/div/div/div[2]/div")
	WebElement CardIcon_Container;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[3]/span/div[1]/div/div[1]/div[2]/div/button")
	WebElement ThreeDot_OptionOn_CardIcon_Container;
	
	@FindBy(name = "cardExpiration")
	WebElement Expiration_Date_TextField;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[4]/span/div/div/div[1]/div/label")
	WebElement Expiration_Date_LableText;
	
	@FindBy(id = "cardExpiration-error-message")
	WebElement cardExpiration_error_message;
	
	@FindBy(name = "cardCvv")
	WebElement Card_Cvv_TextField;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div/div[5]/span/div/div/div[1]/div/label")
	WebElement Card_Cvv_LableText;
	
	@FindBy(id = "cardCvv-error-message")
	WebElement cardCvv_error_message;
	
	@FindBy(xpath = "//div[text()='Remember this card']")
	WebElement RememberThiscard_Option;
	
	@FindBy(id = "remember-card")
	WebElement RememberThiscard_Checkbox;
	
	@FindBy(id = "pay-btn")
	WebElement Pay_Button;
	
	@FindBy(xpath = "//*[@id=\"pay-btn\"]/span/span")
	WebElement TextOn_PayButton;
	
	@FindBy(xpath = "//*[@id=\"pay-btn-currency\"]")
	WebElement Currency_SymbolOn_PayButton;
	
	@FindBy(xpath = "//*[@id=\"pay-btn-amount\"]")
	WebElement TotalAmountOn_PayButton;
	
	@FindBy(xpath = "//div[text()='Add a friendly name (optional)']")
	WebElement AddAFriendlyName_Optional_Text;
	
	@FindBy(id = "friendly-name")
	WebElement RememberThiscard_TextField;
	
	@FindBy(linkText = " Cookies ")
	WebElement FooterCookies_Option;
	  
	@FindBy(linkText = " Privacy ")
	WebElement FooterPrivacy_Option;
	  
	@FindBy(linkText = " Terms ")
	WebElement FooterTerms_Option;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/h1")
	WebElement ThankYouForYourPurchaseText;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/p[1]")
	WebElement YourPurchaseWasSuccessful;
	
	@FindBy(xpath = "//div[text()='£40,000 Instant Win Treasure Hunt (1 tickets)']")
	WebElement TitleOftheEnteredRaffle;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div")
	WebElement GeneratedTicket;
	
	@FindBy(xpath = "//a[@class='w-100 btn-home bg-special text-always-black py-2']")
	WebElement Continue_Link;

	// Google pay Payment method webElements..
	
	@FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/button")
	WebElement GooglePayButon;
	
	
	//
	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active language-menu-wrapper']")
	WebElement Language_Content_List_Menu;
	
	
	@FindBy(xpath = "//span[@class='text-uppercase ml-1']")
	WebElement Language_Name_On_The_Dropdown;
	
	
	@FindBy(xpath = "//span[text()=' Or pay with ']")
	WebElement Or_Pay_With_Text;
	
	//One of the saved card 
	
	@FindBy(xpath = "//div[@id='stored-card-cfab9e78-b453-47d1-ba27-96bf3eb944c7']")
	WebElement One_Of_The_Saved_Card;
	
	@FindBy(id = "emailAddress-error-message")
	WebElement Email_Address_Error_Message;
	
	//
	@FindBy(id = "cardHolder-error-message")
	WebElement Card_Holder_Error_Message;
	
	//WebElements which are present on the 
	
	
	@FindBy(xpath = "//h1[@class='text-center payment_title']")
	WebElement Payment_Successful_Text;
	
	
	
	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Validate_By_entering_Invalid_Email(String Invalid_Email) throws Throwable
	{
		WebElement ele1 = EmailAddress_TextField;
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Action.type(ele1, Invalid_Email);
	}
	
	public void Validate_By_entering_Invalid_CH_Name(String Invalid_CH_Name) throws Throwable
	{
		WebElement ele2 = CardHolderName_TextField;
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Action.type(ele2, String.valueOf(Invalid_CH_Name));
	}
	
	public void Validate_By_entering_Invalid_CardNumber(String Invalid_CardNumber) throws Throwable
	{
		WebElement ele3 = CardNumber_TextField;
		ele3.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele3.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Action.type(ele3, Invalid_CardNumber);
	}
	
	public void Validate_By_entering_Invalid_ExpiryDate(String Invalid_ExpiryDate) throws Throwable
	{
		WebElement ele4 = Expiration_Date_TextField;
		ele4.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele4.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Action.type(ele4, Invalid_ExpiryDate);
	}
	
	public void Validate_By_entering_Invalid_ExpiryDate(String Invalid_ExpiryDate) throws Throwable
	{
		WebElement ele4 = Expiration_Date_TextField;
		ele4.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele4.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Action.type(ele4, Invalid_ExpiryDate);
	}
	
	public void ClearTheTextField() throws InterruptedException
	{
		WebElement ele1 = EmailAddress_TextField;
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.DELETE);
		WebElement ele2 = CardHolderName_TextField;
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.DELETE);
		WebElement ele3 = CardNumber_TextField;
		ele3.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele3.sendKeys(Keys.DELETE);
		WebElement ele4 = Expiration_Date_TextField;
		ele4.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele4.sendKeys(Keys.DELETE);
	}
	
	public void MakePayment(String Email, String CardHolderName, String CardNumber, String ExpiryDate, String Cvv, String Remember_Card) throws Throwable
	{
		Action.type(EmailAddress_TextField, Email);
		Thread.sleep(2000);
		Action.type(CardHolderName_TextField, CardHolderName);
		Thread.sleep(2000);
		Action.type(CardNumber_TextField, String.valueOf(CardNumber));
		Thread.sleep(2000);
		Action.type(Expiration_Date_TextField, String.valueOf(ExpiryDate));
		Thread.sleep(2000);
		Action.type(Card_Cvv_TextField, String.valueOf(Cvv));
		Thread.sleep(2000);
		Action.Click(driver, RememberThiscard_Option);
		Thread.sleep(2000);
		Action.type(RememberThiscard_TextField, Remember_Card);
		Thread.sleep(2000);
		Action.Click(driver, Pay_Button);
	}
	
	public boolean Validate_Payment_Successful_Text_Display() throws Throwable
	{
		return Action.isDisplayed(driver, Payment_Successful_Text);
	}
	
	public String Validate_Payment_Successful_Text() throws Throwable
	{
		String text = Payment_Successful_Text.getText();
		return text;
	}
	
	public HomePage Verify_Clickingon_Continue_Link() throws Exception
	{
		Action.Click(driver, Continue_Link);
		return new HomePage();
	}
	
	public boolean ValidateGooglePayButon() throws Throwable
	{
		//Action.JSClick(driver, GooglePayButon);
		return Action.isDisplayed(driver, GooglePayButon);
	}

	public boolean ClickonGooglePayButon() throws Throwable
	{
		//Action.JSClick(driver, GooglePayButon);
		//Action.ClickElementByJS(GooglePayButon, driver);
		return Action.Click(driver, GooglePayButon);
	}
	
	//WebElements which are present on the "Payment page".
	
	public boolean ValidateVivaWalletLogo() throws Throwable
	{
		return Action.isDisplayed(driver, VivaWalletLogo);
	}
	
	public String ValidateVivaWalletLogoText() throws Throwable
	{
		String text = VivaWalletLogoText.getText();
		return text;
	}
	
	public boolean ValidateLanguage_Dropdown_Button() throws Throwable
	{
		return Action.isDisplayed(driver, Language_Dropdown_Button);
	}
	
	public void ClickonLanguage_Dropdown_Button() throws Throwable
	{
	    Action.Click(driver, Language_Dropdown_Button);
	}
	
	public boolean ValidateLanguage_Content_List_Menu() throws Throwable
	{
		return Action.isDisplayed(driver, Language_Content_List_Menu);
	}
	
	public boolean ValidateBySelectEnglishLanguageOptionFromTheDropdown() throws Throwable
	{
	   return Action.selectByVisibleText(" English ", Language_Dropdown_Button);
	}
	
	public void ValidateBySelectDutchLanguageOptionFromTheDropdown() throws Throwable
	{
	   Action.selectByVisibleText(" Dutch ", Language_Dropdown_Button);
	}
	  
	public String Validate_Language_Name_On_The_Dropdown() throws Throwable
	{
		String text = Language_Name_On_The_Dropdown.getText();
		return text;
	}
	
	public boolean ValidateOr_Pay_With_Text() throws Throwable
	{
	   return Action.isDisplayed(driver, Or_Pay_With_Text);
	}
	
	public String ValidateMarchentNameText() throws Throwable
	{
		String text = MarchentNameText.getText();
		return text;
	}
	
	public boolean ValidateNonEditableAmountInfoText() throws Throwable
	{
        return Action.isDisplayed(driver, Non_EditableAmmountInfoText);	
	}
	
	public String ValidateSelected_TicketsList_Text() throws Throwable
	{
		String text = Selected_TicketsList_Text.getText();
		return text;
	}
	
	public boolean ValidateCurrency_Symbol() throws Throwable
	{
	   return Action.isDisplayed(driver, Currency_Symbol);
	}
	
	public String ValidateFormatted_Amount_Of_Selected_Tickets() throws Throwable
	{
		String text = Formatted_Amount_Of_Selected_Tickets.getText();
		return text;
	}
	
	public String ValidatePaymentCodeText() throws Throwable
	{
		String text = PaymentCodeText.getText();
		return text;
	}
	
	public String ValidateGeneratedPaymentCode() throws Throwable
	{
		String text = GeneratedPaymentCode.getText();
		return text;
	}
	
	public String ValidatePaymentCodeExpiryText() throws Throwable
	{
		String text = PaymentCodeExpiryText.getText();
		return text;
	}
	
	public String ValidatePaymentCodeExpiryDate() throws Throwable
	{
		String text = PaymentCodeExpiryDate.getText();
		return text;
	}
	
	public String ValidatePoweredByLogo_WrapperText() throws Throwable
	{
		String text = PoweredByLogo_WrapperText.getText();
		return text;
	}
	
	public String ValidateViva_WalletLogo_WrapperText() throws Throwable
	{
		String text = Viva_WalletLogo_WrapperText.getText();
		return text;
	}
	
	public boolean ValidateViva_WalletLogo_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Viva_WalletLogo_Symbol);
	}
	
	public boolean ValidateGooglePayPaymentOption_Button() throws Throwable
	{
		return Action.isDisplayed(driver, GooglePayPaymentOption_Button);
	}
	
	public boolean ClickonGooglePayPaymentOption_Button() throws Throwable
	{
		return Action.JSClick(driver, GooglePayPaymentOption_Button);
	}
	
	//
	public String ValidateOr_PayWithOption_Text() throws Throwable
	{
		String text = Or_PayWithOption_Text.getText();
		return text;
	}
	
	public boolean ValidateSaved_Cards_Toggle() throws Throwable
	{
		return Action.isDisplayed(driver, Saved_Cards_Toggle);
	}
	
	public void ClickonSaved_Cards_Toggle() throws Throwable
	{
		Action.JSClick(driver, Saved_Cards_Toggle);
	}
	
	public boolean Validate_One_Of_The_Saved_Card() throws Throwable
	{
		return Action.JSClick(driver, One_Of_The_Saved_Card);
	}
	
	public boolean ValidateOther_Cards_Toggle() throws Throwable
	{
		return Action.isDisplayed(driver, Other_Cards_Toggle);
	}
	
	public void ClickonOther_Cards_Toggle() throws Throwable
	{
		Action.JSClick(driver, Other_Cards_Toggle);
	}
	////-------------------------------------------------------------------------------------------------------
	
	
	public boolean ValidateEmailAddress_TextField() throws Throwable
	{
        return Action.isDisplayed(driver, EmailAddress_TextField);
	}
	
	public boolean ClickonEmailAddress_TextField() throws Throwable
	{
        return Action.Click(driver, EmailAddress_TextField);
	}
	
	public boolean ValidateEmailAddress_LableText() throws Throwable
	{
        return Action.isDisplayed(driver, EmailAddress_LableText);
	}
	
	public void Validate_By_Entering_ValidInputToEmailAddress_TextField() throws Throwable
	{
        Action.type(EmailAddress_TextField, "wingsfire21@gmail.com");
	}
	
	//Invalid
	public void Validate_By_Entering_InValidInputToEmailAddress_TextField() throws Throwable
	{
        Action.type(EmailAddress_TextField, "wingsfiregmail.com");
	}
	
	//emailAddress-error-message
	
	
	public boolean Validate_Email_Address_Error_Message() throws Throwable
	{
        return Action.isDisplayed(driver, Email_Address_Error_Message);
	}
	
	public String Validate_Email_Address_Error_Message_Text() throws Throwable
	{
		String text = Email_Address_Error_Message.getText();
		return text;
	}
	
	
	//-----------------------------------------------------------------------------------------------
	
	public boolean ValidateCardHolderName_TextField() throws Throwable
	{
        return Action.isDisplayed(driver, CardHolderName_TextField);
	}
	
	public void ClickonCardHolderName_TextField() throws Throwable
	{
        Action.Click(driver, CardHolderName_TextField);
	}
	
	public boolean ValidateCardHolderName_LableText() throws Throwable
	{
        return Action.isDisplayed(driver, CardHolderName_LableText);
	}
	
	//Card_Holder_Error_Message
	public String Validate_CardHolderName_Error_Message_Text() throws Throwable
	{
		String text = Card_Holder_Error_Message.getText();
		return text;
	}
	
	public void EnterValidInputToCardHolderName_TextField() throws Throwable
	{
        Action.type(CardHolderName_TextField, "Dharmaveera");
	}
	
	public void EnterInValidInputToCardHolderName_TextField() throws Throwable
	{
        Action.type(CardHolderName_TextField, "!@#$%^&&&");
	}
	//-------------------------------------------------------------------------------------------------------
	
	public boolean ValidateCardNumber_LableText() throws Throwable
	{
        return Action.isDisplayed(driver, CardNumber_LableText);
	}
	
	public void ClickonCardNumber_TextField() throws Throwable
	{
        Action.Click(driver, CardHolderName_TextField);
	}
	
	public boolean ValidateCardNumber_TextField() throws Throwable
	{
        return Action.isDisplayed(driver, CardNumber_TextField);
	}
	
	public void EnterValidInputToCardNumber_TextField() throws Throwable
	{
        Action.type(CardNumber_TextField, "Dharmaveera");
	}
	
	public void EnterInValidInputToCardNumber_TextField() throws Throwable
	{
        Action.type(CardNumber_TextField, "!@#$%^&&&");
	}
	//-------------------------------------------------------------------------------------------------------
	
	
	//-------------------------------------------------------------------------------------------------------
	
		public boolean ValidateExpiration_Date_LableText() throws Throwable
		{
	        return Action.isDisplayed(driver, Expiration_Date_LableText);
		}
		
		public void ClickonExpiration_Date_TextField() throws Throwable
		{
	        Action.Click(driver, Expiration_Date_TextField);
		}
		
		public boolean ValidateExpiration_Date_TextField() throws Throwable
		{
	        return Action.isDisplayed(driver, Expiration_Date_TextField);
		}
		
		public void EnterValidInputToExpiration_Date_TextField() throws Throwable
		{
	        Action.type(Expiration_Date_TextField, "Dharmaveera");
		}
		
		public void EnterInValidInputToExpiration_Date_TextField() throws Throwable
		{
	        Action.type(Expiration_Date_TextField, "!@#$%^&&&");
		}
		//-------------------------------------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------------------------------------
		
			public boolean ValidateCard_Cvv_LableText() throws Throwable
			{
		        return Action.isDisplayed(driver, Card_Cvv_LableText);
			}
			
			public void ClickonCard_Cvv_TextField() throws Throwable
			{
		        Action.Click(driver, Card_Cvv_TextField);
			}
			
			public boolean ValidateCard_Cvv_TextField() throws Throwable
			{
		        return Action.isDisplayed(driver, Card_Cvv_TextField);
			}
			
			public void EnterValidInputToCard_Cvv_TextField() throws Throwable
			{
		        Action.type(Card_Cvv_TextField, "Dharmaveera");
			}
			
			public void EnterInValidInputToCard_Cvv_TextField() throws Throwable
			{
		        Action.type(Card_Cvv_TextField, "!@#$%^&&&");
			}
			//-------------------------------------------------------------------------------------------------------
			
			public boolean ValidateRememberThiscard_Option() throws Throwable
			{
		        return Action.isDisplayed(driver, RememberThiscard_Option);
			}
			
			public void ClickonRememberThiscard_Option() throws Throwable
			{
		        Action.Click(driver, RememberThiscard_Option);
			}
			
			public boolean ValidateRememberThiscard_Checkbox() throws Throwable
			{
		        return Action.isDisplayed(driver, RememberThiscard_Checkbox);
			}
			
			public String ValidateTextOn_PayButton() throws Throwable
			{
				String text = TextOn_PayButton.getText();
				return text;
			}
			
			public boolean ValidateCurrency_SymbolOn_PayButton() throws Throwable
			{
		        return Action.isDisplayed(driver, Currency_SymbolOn_PayButton);
			}
			
			public String ValidateTotalAmountOn_PayButton() throws Throwable
			{
				String text = TotalAmountOn_PayButton.getText();
				return text;
			}
			
			public String ValidateAddAFriendlyName_Optional_Text() throws Throwable
			{
				String text = AddAFriendlyName_Optional_Text.getText();
				return text;
			}
			
			public boolean ValidateRememberThiscard_TextField() throws Throwable
			{
		        return Action.isDisplayed(driver, RememberThiscard_TextField);
			}
			
			public void EnterInputToRememberThiscard_TextField() throws Throwable
			{
		        Action.type(RememberThiscard_TextField, "Fire");
			}
			
			public boolean ValidateFooterCookies_Option() throws Throwable
			{
		        return Action.isDisplayed(driver, FooterCookies_Option);
			}
			
			public void ClickonFooterCookies_Option() throws Throwable
			{
		        Action.Click(driver, FooterCookies_Option);
			}
			
			public boolean ValidateFooterPrivacy_Option() throws Throwable
			{
		        return Action.isDisplayed(driver, FooterPrivacy_Option);
			}
			
			public void ClickonFooterPrivacy_Option() throws Throwable
			{
		        Action.Click(driver, FooterPrivacy_Option);
			}
			
			public boolean ValidateFooterTerms_Option() throws Throwable
			{
		        return Action.isDisplayed(driver, FooterTerms_Option);
			}
			
			public void ClickonFooterTerms_Option() throws Throwable
			{
		        Action.Click(driver, FooterTerms_Option);
			}
			
			public void Click_on_EnterNow_Button() throws Throwable
			{
				Action.JSClick(driver, Instant_Raffle_Enter_Now_Button);
			}
			
			public boolean Validate_Pay_Button() throws Throwable
			{
				return Action.isDisplayed(driver, Pay_Button);
			}
			
			public boolean Validate_By_Clicking_Pay_Button() throws Throwable
			{
				return Action.JSClick(driver, Pay_Button);
			}
			// Here we need to return "Payment successfull" page
			
			public void Compare_Purchased_Tickets_With_Instant_Win_Tickets()
			{
				int arr[] = {13525,8829,5655,7928,1816,13875,8143,9410,1601,15635,7217,
						6350,13092,12403,12899,3524,1922,5750,1546,7952,14420,8573,
						11567,9056,11666,1788,4070,15654,9902,6869,9720,4285,9928,94,
						4814,311,12346,6856,9995,3411,710,3597,14870,11589,4944,5183,
						6103,5082,9630,53,5724,3747,2186,5810,6296,11729,3003,625,8758,
						13639,368,8092,3294,2596,14646,5454,5619,10162,12164,10950,7005,
						4367,4673,5471,6711,13435,4562,10835,5216,7095,5781,8999,10680,2736,
						10142,12553,13409,12413,12071,3840,8879,11060,3702,4560,14436,8843,15880,9533,6902,12134,
						3513,8477,9457,9412,11266,12051,13706,10650,10488,11690,1556,10827,7592,621,1388,4293,4553,
						3932,6036,6476,7431,10050,10988,11525,11392,9930,8762,3839,6065,13394,5825,811,7094,4223,4520,4172,
						6500,6913,7810,1385,3402,6273,11792,12730,2484,3355,12285,8558,11635,8146,13615,15797,3025,15352,2591,
						10675,15474,12498,10013,14794,4125,496,13981,5166,6295,7373,1266,15597,12741,12440,10844,10450,525,3450,
						450,6256,9267,13453,13866,9249,8737,5238,6043,5400,6579,7243,6222,5111,2941,2652,1297,43,199,14224,1880,
						6552,4358,10274,2626,1469,15780,5693,9408,6837,10151,3740,9183,3800,14522,11230,13758,13379,343,851,263,
						3841,4261,4882,3026,6914,8601,9675,10029,10056,9968,12330,11787,12992,15581,10098,13252,14822,1741,2692,
						1644,1686,2327,5858,12913,1477,14945,10767,15740,1655,7661,6788,6610,15085,10967,11579,5369,11360,10314,
						11324,11095,13743,14340,11768,11668,9921,4711,3010,14622,7990,1486,2149,2469,6232,8559,15367,14303,1211,
						14326,4189,14026,9126,1110,4714,3610,5203,4063,4809,6654,14880,15765,15077,15073,12189,12444,1539,732215517,
						6759,8016,15535,14692,8594,2020,5702,12026,15965,6001,252,4305,3067,11507,12411,14235,10646,2384,6694,4851,
						2072,593,813,898,3017,7093,835,1168,13295,6376,5484,6717,5503,8877,10022,9414,8949,13741,9224,11205,805,10830,
						13455,7689,15730,14647,7677,15469,15381,13350,13260,10676,10660,8984,6921,11559,9512,2268,1505,9604,10497,1017,
						7503,6248,7299,4737,7649,7845,14380,11099,12234,11152,8110,841,1907,5143,4561,13322,10268,4798,11035,727,14663,
						794,14143,14986,11818,7381,2754,597,1898,6597,13113,13054,14562,4637,379,5306,104,2666,13383,2025,3169,9762,4475,
						400,7258,13806,14974,15921,2427,14455,4234,12864,15529,12447,3970,4202,1260,11185,9977,15465,580,2296,288,1658,938,
						864,14610,12496,13413,11001,8926,5876,6183,7978,15274};    //All the instant win tickets
				int arr1[] = {15274,11792,6711,13295};
				for(int i=0; i<arr.length; i++)
				{
					for(int k=0; k<arr1.length; k++)
					{
						if(arr[i]==arr1[k])
						{
							System.out.println("================Ticket won Instant prize  ==============:"+arr[i]);
						}
						else
						{
							System.out.println("---------------Ticket not won any instant prize--------------   :"+arr[i]);
						}
					}
				}
				
			}

}
