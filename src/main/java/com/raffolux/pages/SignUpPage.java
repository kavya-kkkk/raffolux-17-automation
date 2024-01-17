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
public class SignUpPage extends BaseClass
{
	@FindBy(linkText = "Sign in") 
	WebElement SignInLink;
	
	@FindBy(id = "signup-title") 
	WebElement SignUpTitle;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[1]/h4/text()") 
	WebElement AlraedyMemberText;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[2]/div[1]/label/div/div") 
	WebElement first_nameLabelText;
	
	@FindBy(name = "first_name") 
	WebElement first_name;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[2]/div[2]/label/div/div") 
	WebElement last_nameLabelText;

	@FindBy(name = "last_name") 
	WebElement last_name;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[3]/label/div/div") 
	WebElement emailIDLabelText;
	
	@FindBy(name = "email") 
	WebElement emailID;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[4]/label/div/div") 
	WebElement PhoneNumberLabelText;
	
	@FindBy(name = "contact_number_2_0") 
	WebElement CountryCodeDropdown;
	
	@FindBy(name = "contact_number_2_1") 
	WebElement PhoneNumberTextField;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[5]/label/div/div") 
	WebElement ChoosePasswordLabelText;
	
	@FindBy(name = "password1") 
	WebElement ChoosePassword;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[6]/label/div/div") 
	WebElement ConfirmPasswordLabelText;
	
	@FindBy(name = "password2") 
	WebElement ConfirmPassword;
	
	@FindBy(name = "marketing") 
	WebElement YesRadioBtn;
	
	@FindBy(name = "marketing") 
	WebElement NoRadioBtn;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[7]/div[2]/label[1]/text()") 
	WebElement YesRadioText;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[7]/div[2]/label[2]/text()") 
	WebElement NoRadioText;
	
	@FindBy(id = "submit-signup-btn") 
	WebElement CreateAccountBtn;
	
	@FindBy(linkText = "Terms and Conditions") 
	WebElement TermsandConditionsLink;
	
	@FindBy(linkText = "Privacy Policy.") 
	WebElement PrivacyPolicyLink;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/span/text()[1]") 
	WebElement EighteenYearConfirmText;
	
	@FindBy(xpath = "//*[@id=\"captchaForm\"]/div[7]/div[1]/label/p/text()") 
	WebElement LikeToRecieveUpdatesText;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/p") 
	WebElement OrSignUpViaText;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/span[1]/a/i[2]") 
	WebElement SignUpFaceBookLogo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/span[2]/a/i[2]") 
	WebElement SignUpGoogleLogo;
	
	//----------------------------------------------------------------------------------- Constuctor in order to initialize the Webelements
	@FindBy(xpath = "//*[@id=\"mount_0_0_aF\"]/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div/span/span")
	WebElement ContinueAsDharmaveera;
	
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div")
	WebElement OneOfTheGmaelAccount;
	
	@FindBy(id = "email") 
	WebElement Username;
	
	@FindBy(id = "pass") 
	WebElement Password;
	
	@FindBy(id = "loginbutton") 
	WebElement LoginBtn;
	
	//WebElements
	
		@FindBy(id = "id_first_name")
		static
		WebElement First_Name;
		
		@FindBy(id = "id_last_name")
		static
		WebElement Last_Name;
		
		@FindBy(id = "id_email")
		static
		WebElement Email_Id_Textfield;
		
		@FindBy(name = "contact_number_2_1")
		static
		WebElement Contact_Number_Textfield;
		
		@FindBy(name = "contact_number_2_0")
		static
		WebElement Country_Code_Dropdown;
		
		@FindBy(id = "id_password1")
		static
		WebElement Choose_Password_Textfield;
		
		@FindBy(id = "id_password2")
		static
		WebElement Confirm_Password_Textfield;
		
		@FindBy(name = "marketing")
		static
		WebElement Yes_Radio_Button;
		
		@FindBy(id = "id_marketing_1")
		static
		WebElement No_Radio_Button;
		
		@FindBy(id = "submit-signup-btn")
		static
		WebElement Create_Account_Button;
		
		
		
		
		
		//Constructor to initilaize the WebElements
		
		
		
		
		
		//User action methods
		
		/*public static HomePage Create_Account() throws Throwable
		{
			Action.type(First_Name, prop.getProperty("First_Name"));
			Thread.sleep(2000);
			Action.type(Last_Name, prop.getProperty("Last_Name"));
			Thread.sleep(2000);
			Action.type(Email_Id_Textfield, prop.getProperty("Email_Id_Textfield"));
			Thread.sleep(2000);
			Action.type(Contact_Number_Textfield, prop.getProperty("Contact_Number_Textfield"));
			Thread.sleep(2000);
			Action.selectBySendkeys(Country_Code_Dropdown, prop.getProperty("Country_Code_Dropdown"));
			Thread.sleep(2000);
			Action.type(Choose_Password_Textfield, prop.getProperty("Choose_Password_Textfield"));
			Thread.sleep(2000);
			Action.type(Confirm_Password_Textfield, prop.getProperty("Confirm_Password_Textfield"));
			Thread.sleep(2000);
			Action.scrollIntoView(driver, Yes_Radio_Button);
			Thread.sleep(2000);
			Action.JSClick(driver, Yes_Radio_Button);
			Thread.sleep(2000);
			//Action.Click(driver, No_Radio_Button);
			//Thread.sleep(2000);
			Action.JSClick(driver, Create_Account_Button);
			
			return new HomePage();
		}*/
	
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateSignUpTitle() throws Throwable
	{
		return Action.isDisplayed(driver, SignUpTitle);
	}
	
	public boolean ValidateAlreadyMemberText() throws Throwable
	{
		return Action.isDisplayed(driver, AlraedyMemberText);
	}
	
	
	
	public SignInPage ClickOnSignLink() throws Throwable
	{
		Action.isDisplayed(driver, SignInLink);
		Action.mouseOverElement(SignInLink);
		Thread.sleep(2000);
		Action.Click(driver, SignInLink);
		
		return new SignInPage();
	}
	
	/*public HomePage CreateAccount(String First_Name, String Last_Name, String Email_Id, String Phone_number, String Choose_Password, String Confirm_Password) throws Throwable
	{
		Action.type(first_name, First_Name);
		Thread.sleep(2000);
		Action.type(last_name, Last_Name);
		Thread.sleep(2000);
		Action.type(emailID, Email_Id);
		Thread.sleep(2000);
		Action.selectByVisibleText("India +91", CountryCodeDropdown);
		Thread.sleep(2000);
		Action.type(PhoneNumberTextField, String.valueOf(Phone_number));
		Thread.sleep(2000);
		Action.type(ChoosePassword, Choose_Password);
		Thread.sleep(2000);
		Action.scrollIntoView(driver, ConfirmPassword);
		Thread.sleep(2000);
		Action.type(ConfirmPassword, Confirm_Password);
		Thread.sleep(2000);
		Action.Click(driver, YesRadioBtn);
		Thread.sleep(2000);
		Action.JSClick(driver, CreateAccountBtn);
		Thread.sleep(2000);
		
		return new HomePage();
	}*/
	
	public boolean ValidateTermsAndConditionsLink() throws Throwable
	{
		Action.scrollIntoView(driver, TermsandConditionsLink);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, TermsandConditionsLink);
	}
	
	public boolean Mouse_Hov_Over_TermsandConditionsLink() throws Throwable
	{
		Action.scrollIntoView(driver, TermsandConditionsLink);
		Thread.sleep(2000);
		return Action.mouseOverElement(TermsandConditionsLink);
		
	}
	
	public void ClickonTermsAndConditionsLink() throws Throwable
	{
		Action.scrollIntoView(driver, TermsandConditionsLink);
		Thread.sleep(2000);
		Action.Click(driver, TermsandConditionsLink);
	}
	
	public boolean ValidatePrivacyPolicyLink() throws Throwable
	{
		Action.scrollIntoView(driver, PrivacyPolicyLink);
	    Thread.sleep(2000);
		return Action.isDisplayed(driver, PrivacyPolicyLink);
	}
	
	public boolean Mouse_Hov_Over_PrivacyPolicyLink() throws Throwable
	{
		Action.scrollIntoView(driver, PrivacyPolicyLink);
	    Thread.sleep(2000);
		return Action.mouseOverElement(PrivacyPolicyLink);
	}
	
	public void ClickonPrivacyPolicyLink() throws Throwable
	{
		Action.scrollIntoView(driver, PrivacyPolicyLink);
	    Thread.sleep(2000);
		Action.Click(driver, PrivacyPolicyLink);
	}
	
	
	public boolean Validatefirst_nameLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, first_nameLabelText);
	}
	
	public boolean Validatelast_nameLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, last_nameLabelText);
	}
	
	public boolean ValidateemailIDLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, emailIDLabelText);
	}
	
	public boolean ValidatePhoneNumberLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, PhoneNumberLabelText);
	}
	
	public boolean ValidateChoosePasswordLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, ChoosePasswordLabelText);
	}
	
	public boolean ValidateConfirmPasswordLabelText() throws Throwable
	{
		return Action.isDisplayed(driver, ConfirmPasswordLabelText);
	}
	
	public boolean ValidateSignUpViaText() throws Throwable
	{
		return Action.isDisplayed(driver, OrSignUpViaText);
	}
	
	public boolean ValidateSignUpFaceBookLogo() throws Throwable
	{
		Action.mouseOverElement(SignUpFaceBookLogo);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, SignUpFaceBookLogo);
	}
	
	public void ClickonSignUpFaceBookLogo() throws Throwable
	{
		Action.Click(driver, SignUpFaceBookLogo);
	}
	
	public boolean ValidateSignUpGoogleLogo() throws Throwable
	{
		Action.mouseOverElement(SignUpGoogleLogo);
		Thread.sleep(2000);
		return Action.isDisplayed(driver, SignUpGoogleLogo);
	}
	
	public void ClickonSignUpGoogleLogo() throws Throwable
	{
		Action.Click(driver, SignUpGoogleLogo);
	}
	
	public boolean ValidateContinueAsDharmaveeraBtn() throws Throwable
	{
		//Action.mouseOverElement(SignUpGoogleLogo);
		//Thread.sleep(2000);
		return Action.isDisplayed(driver, ContinueAsDharmaveera);
	}
	
	public void ClickonContinueAsDharmaveeraBtn() throws Throwable
	{
		Action.Click(driver, ContinueAsDharmaveera);
	}
	
	public void ClickonTheOneOfTheEmailAccount() throws Throwable
	{
		Action.Click(driver, OneOfTheGmaelAccount);
	}
	
	public void LoginThroughFacebookSocialmedia(String Uname, String pwd) throws Throwable
	{
		Action.type(Username, Uname);
		Thread.sleep(2000);
		Action.type(Password, pwd);
		Thread.sleep(2000);
		Action.Click(driver, LoginBtn);
	}
	
}
