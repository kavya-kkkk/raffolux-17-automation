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
public class RaffelPageBeforeLogin extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/img")
	WebElement SelectedRaffelImage;
	
	@FindBy(xpath = "//h1[@style='font-size: 50px;']")
	WebElement TitleOfTheRaffel;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[1]")
	WebElement MaxTicketSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[2]")
	WebElement CashAlternativeSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[3]")
	WebElement InstantDrawSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[1]/div[2]/div")
	WebElement MaxTicketsPresent;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[2]/div[2]/div")
	WebElement CashAltAvailabilty;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[3]/div[2]/div")
	WebElement InstantDrawDate;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[2]/div")
	WebElement SeeTermsForFreeTelephoneEntryText;
	
	@FindBy(linkText = "terms")
	WebElement TermsLink;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[3]/div/div")
	WebElement EntryTicketPrice;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[3]")
	WebElement TicketsSoldProgressBar;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[1]/div")
	WebElement TicketsSoldPercentage;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[2]")
	WebElement TotalNoOfTicketsLeft;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[1]")
	WebElement MinNoOfTicketes;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[3]")
	WebElement MaxNoOfTicketes;
	
	@FindBy(id = "dropdownMenuButton")
	WebElement SelectDropDown;
	
	@FindBy(id = "desktop-mutation-enter")
	WebElement EnterBtn;
	
	@FindBy(id = "show-ticket-selector")
	WebElement SelectYourTicketsBtn;
	
	@FindBy(xpath = "//h5[contains(text(),'ABOUT THE PRIZE')]")
	WebElement AboutPrizeText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[2]/p")
	WebElement InformationTextAboutPrize;
	
	@FindBy(xpath = "//div[contains(text(),'Details')]")
	WebElement RaffelDetailsText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[4]/div/ul")
	WebElement DetailedDescriptionOfRaffel;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[2]/div[2]")
	WebElement InstantDrawInformationText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[2]/div[3]")
	WebElement AboutCompetitionInformationText;
	
	@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/h2/span[1]")
	WebElement YouMayAlsoInterestedInText;
	
	@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[1]/a/div/div[1]/img")
	WebElement OneOfTheRaffelFromYouMayAlsoInterestedIn;
	
	@FindBy(xpath = "//img[@class='d-none d-sm-block black-logo']")
	WebElement Raffolux_Logo;
	
	public RaffelPageBeforeLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateRaffolux_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Raffolux_Logo);
	}
	
	public void Validate_By_Clicking_The_Raffolux_Logo() throws Throwable
	{
		Action.JSClick(driver, Raffolux_Logo);
	}
	
	public void ValidateRaffelImage() throws Throwable
	{
		Action.isDisplayed(driver, SelectedRaffelImage);
	}
	
	public void ValidateTitleOfTheRaffel() throws Throwable
	{
		Action.isDisplayed(driver, TitleOfTheRaffel);
		System.out.println(TitleOfTheRaffel.getText());
	}
	
	public void ValidateMaxTicketSection() throws Throwable
	{
		Action.isDisplayed(driver, MaxTicketSection);
		System.out.println(MaxTicketSection.getText());
	}
	
	public void ValidateCashAlternativeSection() throws Throwable
	{
		Action.isDisplayed(driver, CashAlternativeSection);
		System.out.println(CashAlternativeSection.getText());
	}
	
	public void ValidateInstantDrawSection() throws Throwable
	{
		Action.isDisplayed(driver, InstantDrawSection);
		System.out.println(InstantDrawSection.getText());
	}
	
	public void ValidateMaxTicketsPresent() throws Throwable
	{
		Action.isDisplayed(driver, MaxTicketsPresent);
		System.out.println(MaxTicketsPresent.getText());
	}
	
	public void ValidateCashAltAvailabilty() throws Throwable
	{
		Action.isDisplayed(driver, CashAltAvailabilty);
		System.out.println(CashAltAvailabilty.getText());
	}
	
	public void ValidateInstantDrawDate() throws Throwable
	{
		Action.isDisplayed(driver, InstantDrawDate);
		System.out.println(InstantDrawDate.getText());
	}
	
	public void ValidateSeeTermsForFreeTelephoneEntryText() throws Throwable
	{
		Action.isDisplayed(driver, SeeTermsForFreeTelephoneEntryText);
		System.out.println(SeeTermsForFreeTelephoneEntryText.getText());
	}
	
	public void ValidateTermsLink() throws Throwable
	{
		Action.isDisplayed(driver, TermsLink);
		System.out.println(TermsLink.getText());
	}
	
	public void ClickonTermsLink() throws Throwable
	{
		Action.Click(driver, TermsLink);
		System.out.println(TermsLink.getText());
	}
	
	public void ValidateEntryTicketPrice() throws Throwable
	{
		Action.isDisplayed(driver, EntryTicketPrice);
		System.out.println(EntryTicketPrice.getText());
	}
	
	public void ValidateTicketsSoldProgressBar() throws Throwable
	{
		Action.isDisplayed(driver, TicketsSoldProgressBar);
		//System.out.println(EntryTicketPrice.getText());
	}
	
	public void ValidateTicketsSoldPercentage() throws Throwable
	{
		Action.isDisplayed(driver, TicketsSoldPercentage);
		System.out.println(TicketsSoldPercentage.getText());
	}

}
