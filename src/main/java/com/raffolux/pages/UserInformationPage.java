/**
 * 
 */
package com.raffolux.pages;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class UserInformationPage extends BaseClass
{
	
	
	@FindBy(xpath = "//*[@id=\"sms_code\"]")
	WebElement SixDigitCodeTextBox;
	
	@FindBy(xpath = "//h1[text()='User Information']")
	WebElement UserInformationTitleText;
	
	@FindBy(id = "combinedDate")
	WebElement DOBTextField;
	
	@FindBy(id = "UserEmail")
	WebElement UserEmail;
	
	@FindBy(name = "UserContactNumber_0")
	WebElement CountryCodeDropdown;
	
	@FindBy(name = "UserContactNumber_1")
	WebElement phonenumberTextField;
	
	@FindBy(linkText = "Change your password")
	WebElement ChangeYourPasswordLink;
	
	@FindBy(id = "gender")
	WebElement Genderdropdown;
	
	@FindBy(id = "region")
	WebElement Regiondropdown;
	
	@FindBy(xpath = "//*[@id=\"headingOne\"]/h5/button")
	WebElement Interestsdropdown;
	
	@FindBy(xpath = "//*[@id=\"headingTwo\"]/h5/button")
	WebElement CompetitionTypedropdown;
	
	@FindBy(xpath = "//*[@id=\"headingThree\"]/h5/button")
	WebElement OddsPreferencesdropdown;
	
	@FindBy(xpath = "//b[text()='Contact preferences']")
	WebElement ContactPreferencesOption;
	
	@FindBy(name = "CheckboxGroup1")
	WebElement ContactPreferencesCheckboxGroup1;
	
	@FindBy(name = "//*[@id=\"UpdateProfile\"]/div[7]/div/label")
	WebElement LikeToRecieveUpdatesText;
	
	@FindBy(xpath = "//button[text()='Save Changes']")
	WebElement SaveChangesButton;
	
	//Interests dropdown
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/div/input[2]")
	WebElement BagsAndWalletsCheckBox;
	
	//CompetitionType dropdown 
	@FindBy(xpath = "//*[@id=\"collapseTwo\"]/div/div/div/input[3]")
	WebElement SmallRaffles;
	
	//OddsPreferences dropdown
	@FindBy(xpath = "//*[@id=\"collapseThree\"]/div/div/div/input[1]")
	WebElement HighPrice;
	
	//The Checkbox present in the interest dropdown
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/div/input[1]")
	WebElement AudioAndSpeakersCheckbox;
	
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/div/input[11]")
	WebElement CryptoCheckbox;
	
	//The Checkbox present in the competitionType  dropdown
	@FindBy(xpath = "//*[@id=\"collapseTwo\"]/div/div/div/input[3]")
	WebElement SmallRafflesCheckBox;
	
	@FindBy(xpath = "//*[@id=\"collapseTwo\"]/div/div/div/input[1]")
	WebElement BigRafflesCheckBox;
	
	//The Checkbox present in the oddsPreferences  dropdown
	@FindBy(xpath = "//*[@id=\"collapseThree\"]/div/div/div/input[1]")
	WebElement HighPriceCheckBox;
	
	@FindBy(xpath = "//*[@id=\"collapseThree\"]/div/div/div/input[3]")
	WebElement LowPriceCheckBox;
	
	
	public UserInformationPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateSixDigitCodeTextBox() throws Throwable
	{
		return Action.isDisplayed(driver, SixDigitCodeTextBox);
	}
	
	public void ValidateSaveChanges(String DOB, String EmailId, String phoneNumber) throws Throwable
	{
		Action.type(DOBTextField, String.valueOf(DOB));
		//Action.type(DOBTextField, DOB);
		Thread.sleep(2000);
		Action.type(UserEmail, EmailId);
		Thread.sleep(2000);
		Action.selectByVisibleText("India +91", CountryCodeDropdown);
		Thread.sleep(2000);
		Action.type(phonenumberTextField, String.valueOf(phoneNumber));
		Thread.sleep(2000);
		Action.selectByIndex(Genderdropdown, 1);
		Thread.sleep(2000);
		Action.selectByIndex(Regiondropdown, 2);
		Thread.sleep(2000);
		Action.scrollIntoView(driver, Interestsdropdown);
		Action.ClickElementByJS(Interestsdropdown, driver);
		Thread.sleep(2000);
		Action.JSClick(driver, AudioAndSpeakersCheckbox);
		Action.JSClick(driver, CryptoCheckbox);
		Action.ClickElementByJS(CompetitionTypedropdown, driver);
		Thread.sleep(2000);
		Action.JSClick(driver, SmallRafflesCheckBox);
		Action.JSClick(driver, BigRafflesCheckBox);
		Action.ClickElementByJS(OddsPreferencesdropdown, driver);
		Thread.sleep(2000);
		Action.JSClick(driver, HighPriceCheckBox);
		Action.JSClick(driver, LowPriceCheckBox);
		Action.JSClick(driver, ContactPreferencesCheckboxGroup1);
		Thread.sleep(2000);
		//Action.scrollIntoView(driver, SaveChangesButton);
		Action.JSClick(driver, SaveChangesButton);
	
	}
	
	public String ValidateUserInformationTitleText()
	{
		String text = UserInformationTitleText.getText();
		return text;
	}
	
	public void ValidateDOBTextField() throws Throwable
	{
		Action.isDisplayed(driver, DOBTextField);
	}
	
	public void ValidateUserEmail() throws Throwable
	{
		Action.type(UserEmail, "wingsfire21@gmail.com");
	}
	
	public void ValidateCountryCodeDropdown() throws Throwable
	{
		Action.selectByValue(CountryCodeDropdown, "India +91");
	}
	
	public void ValidatephonenumberTextField() throws Throwable
	{
		Action.type(phonenumberTextField, "8971268103");
	}
	
	public void ValidateChangeYourPasswordLink() throws Exception
	{
		Action.Click(driver, ChangeYourPasswordLink);
	}
	
	public void ValidateGenderdropdown() throws Throwable
	{
		Action.selectByIndex(Genderdropdown, 1);
	}
	
	public void ValidateRegiondropdown() throws Throwable
	{
		Action.selectByIndex(Regiondropdown, 2);
	}
	
	public void ValidateInterestsdropdown() throws Throwable
	{
		Action.selectByVisibleText(" Bags & Wallets", BagsAndWalletsCheckBox);
	}
	
	public void ValidateCompetitionTypedropdown() throws Throwable
	{
		Action.selectByIndex(CompetitionTypedropdown, 2);
	}
	
	public void ValidateOddsPreferencesdropdown() throws Throwable
	{
		Action.selectByIndex(OddsPreferencesdropdown, 0);
	}
	
	public String ValidateContactPreferencesOption()
	{
		String text = ContactPreferencesOption.getText();
	    return text;
	}
	
	public void ValidateContactPreferencesCheckboxGroup1() throws Throwable
	{
		Action.JSClick(driver, ContactPreferencesCheckboxGroup1);
	}
	
	public String ValidateLikeToRecieveUpdatesText()
	{
		 String text = LikeToRecieveUpdatesText.getText();
	     return text;
	}
	
	public boolean ValidateSaveChangesButton() throws Throwable
	{
		return Action.isDisplayed(driver, SaveChangesButton);
	}
	
	public void ClickonSaveChangesButton() throws Throwable
	{
		Action.Click(driver, SaveChangesButton);
		//return Action.isDisplayed(driver, SaveChangesButton);
	}
	
	public void ClickonInterestsdropdownCheckboxes() throws Throwable
	{
		Action.JSClick(driver, AudioAndSpeakersCheckbox);
		Action.JSClick(driver, CryptoCheckbox);
	}
	
	
	
	public void ClickonCompetitionTypeCheckBoxs() throws Throwable
	{
		Action.JSClick(driver, SmallRafflesCheckBox);
		Action.JSClick(driver, BigRafflesCheckBox);
	}
	
	
	
	public void ClickonOddsPreferencesCheckboxes() throws Throwable
	{
		Action.JSClick(driver, HighPriceCheckBox);
		Action.JSClick(driver, LowPriceCheckBox);
	}
	
	
	
}
