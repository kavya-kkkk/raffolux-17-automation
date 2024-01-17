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
public class RafflePageBeforeLogin extends BaseClass
{
	@FindBy(xpath = "//img[@class= 'img-fluid mobile-span-full-vw']")
	WebElement SelectedRaffelImage;
	
	@FindBy(xpath = "//*[@id=\"mob-fullwidth\"]/div[2]/img")
	WebElement HowToPlayImage;
	
	@FindBy(xpath = "//*[@id=\"mob-fullwidth\"]/a[1]/span")
	WebElement LeftArrowSymbolOnRaffleImage;
	
	@FindBy(xpath = "//*[@id=\"mob-fullwidth\"]/a[2]/span")
	WebElement RightArrowSymbolOnRaffleImage;
	
	@FindBy(xpath = "//*[@id=\"carousel-selector-0\"]/img")
	WebElement ImageAtLeftBottomofRaffleImage;
	
	@FindBy(xpath = "//*[@id=\"carousel-selector-1\"]/img")
	WebElement ImageAtRightBottomofRaffleImage;
	
	@FindBy(xpath = "//h5[@class='mb-2 raffle-description-intro my-4']")
	WebElement AboutThePrizeText;
	
	@FindBy(xpath = "//p[@class='raffle-description-body']")
	WebElement AboutThePrizeRaffleDescription;
	
	@FindBy(xpath = "//div[contains(text(),'Details')]")
	WebElement DetailsText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[4]/div/ul")
	WebElement DetailedDescriptionOfRaffleText;
	
	@FindBy(xpath = "//span[@class='d-none d-sm-block text-left']")
	WebElement YouMayBeAlsoInterestedInText;
	
	@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[1]/a/div/div[1]/img")
	WebElement OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles;
	
	@FindBy(xpath = "//h1[contains(text(),'£40,000 Instant Win Treasure Hunt')]")
	WebElement TitleOfTheRaffle;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[1]")
	WebElement MaxTicketSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[2]")
	WebElement TotalTicketsSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[3]")
	WebElement InstantDrawDateSection;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[1]/div[2]/div")
	WebElement MaxTicketsPresent;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[2]/div[2]/div")
	WebElement TotalTicketsPresent;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[1]/div[3]/div[2]/div")
	WebElement InstantDrawDate;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[2]/div")
	WebElement SeeTermsForFreePostalEntryOption;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[2]/div/a")
	WebElement TermsLink;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[3]/div/div")
	WebElement EntryTicketPrize;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[3]")
	WebElement TotalTicketProgressBar;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[3]/div")
	WebElement TicketSoldProgressBar;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[1]")
	WebElement MinNoOfTickets;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[3]")
	WebElement MaxNoOfTickets;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[4]/div[2]")
	WebElement TotalNoOfTicketsLeft;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[1]/div[4]/div/div[1]/div")
	WebElement PercentageOfTicketsSold;
	
	@FindBy(id = "dropdownMenuButton")
	WebElement SelectDropdown;
	
	@FindBy(id = "desktop-mutation-enter")
	WebElement EnterBtn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[2]/div[2]")
	WebElement InstantDrawInformationText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/aside/div/div[2]/div[3]")
	WebElement CompetitionInformationText;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']")
	WebElement DropdownMenuShow;
	
	public RafflePageBeforeLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------------------------------------------------
	
	public boolean ValidateRaffleImage() throws Throwable
	{
		 return Action.isDisplayed(driver, SelectedRaffelImage);
	}
	
	public boolean ValidateHowToPlayImage() throws Throwable
	{
		Thread.sleep(10000);
		return Action.isDisplayed(driver, HowToPlayImage);
	}
	
	public boolean ValidateLeftArrowSymbolOnTheRaffle() throws Throwable
	{
		return Action.isDisplayed(driver, LeftArrowSymbolOnRaffleImage);
		
	}
	
	public void ClickonLeftArrowSymbolOnTheRaffle() throws Throwable
	{
		 Action.Click(driver, LeftArrowSymbolOnRaffleImage);
		//String arrorSymbol =  LeftArrowSymbolOnRaffleImage.getText();
		//return arrorSymbol;
	}
	
	public boolean ValidateRightArrowSymbolOnTheRaffle() throws Throwable
	{
		return Action.isDisplayed(driver, RightArrowSymbolOnRaffleImage);
		
	}
	
	public void ClickonRightArrowSymbolOnTheRaffle() throws Throwable
	{
		Action.Click(driver, RightArrowSymbolOnRaffleImage);
	}
	
	public boolean ValidateImageAtLeftBottomofRaffleImage() throws Throwable
	{
		return Action.isDisplayed(driver, ImageAtLeftBottomofRaffleImage);
	}
	
	public void ClickonImageAtLeftBottomofRaffleImage() throws Throwable
	{
		Action.Click(driver, ImageAtLeftBottomofRaffleImage);
	}
	
	public boolean ValidateImageAtRightBottomofRaffleImage() throws Throwable
	{
		return Action.isDisplayed(driver, ImageAtRightBottomofRaffleImage);
	}
	
	public void ClickonImageAtRightBottomofRaffleImage() throws Throwable
	{
		Action.Click(driver, ImageAtRightBottomofRaffleImage);
	}
	
	public boolean ValidateEnabilityOfImageAtRightBottomofRaffleImage() throws Throwable
	{
		return Action.isEnabled(driver, ImageAtRightBottomofRaffleImage);
	}
	
	public boolean ValidateEnabilityOfImageAtLeftBottomofRaffleImage() throws Throwable
	{
		return Action.isEnabled(driver, ImageAtLeftBottomofRaffleImage);
	}
	
	public boolean ValidateAboutThePrizeText() throws Throwable
	{
		Action.scrollIntoView(driver, AboutThePrizeText);
		System.out.println(AboutThePrizeText.getText());
		return Action.isDisplayed(driver, AboutThePrizeText);
		/*System.out.println(AboutThePrizeText.getText());
		String text = AboutThePrizeText.getText();
		return text;*/
	}
	
	public boolean ValidateAboutThePrizeRaffleDescription() throws Throwable
	{
		Action.scrollIntoView(driver, AboutThePrizeRaffleDescription);
		System.out.println(AboutThePrizeRaffleDescription.getText());
		return Action.isDisplayed(driver, AboutThePrizeRaffleDescription);
	}
	
	public boolean ValidateDetailsText() throws Throwable
	{
		System.out.println(DetailsText.getText());
		return Action.isDisplayed(driver, DetailsText);
	}
	
	public boolean ValidateDetailedDescriptionOfRaffleText() throws Throwable
	{
		System.out.println(DetailedDescriptionOfRaffleText.getText());
		return Action.isDisplayed(driver, DetailedDescriptionOfRaffleText);	
	}
	
	public boolean ValidateYouMayBeAlsoInterestedInText() throws Throwable
	{
		System.out.println(YouMayBeAlsoInterestedInText.getText());
		return Action.isDisplayed(driver, YouMayBeAlsoInterestedInText);
	}
	
	public boolean ValidateOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles() throws Throwable
	{
		System.out.println(OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles.getText());
		Thread.sleep(2000);
		return Action.isDisplayed(driver, OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles);
	}
	
	public void ClickonOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles() throws Throwable
	{
		Action.scrollIntoView(driver, OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles);
		Thread.sleep(2000);
		Action.JSClick(driver, OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles);
	}
	
	public boolean ValidateTitleOfTheRaffle() throws Throwable
	{
		System.out.println(TitleOfTheRaffle.getText());
		return Action.isDisplayed(driver, TitleOfTheRaffle);
		
	}
	
	public boolean ValidateMaxTicketSection() throws Throwable
	{
		System.out.println(MaxTicketSection.getText());
		return Action.isDisplayed(driver, MaxTicketSection);
	}
	
	public boolean ValidateTotalTicketsSection() throws Throwable
	{
		System.out.println(TotalTicketsSection.getText());
		return Action.isDisplayed(driver, TotalTicketsSection);
	}
	
	public boolean ValidateInstantDrawDateSection() throws Throwable
	{
		System.out.println(InstantDrawDateSection.getText());
		return Action.isDisplayed(driver, InstantDrawDateSection);
	}
	
	public boolean ValidateMaxTicketsPresent() throws Throwable
	{
		System.out.println(MaxTicketsPresent.getText());
		return Action.isDisplayed(driver, MaxTicketsPresent);
	}
	
	public boolean ValidateTotalTicketsPresent() throws Throwable
	{
		System.out.println(TotalTicketsPresent.getText());
		return Action.isDisplayed(driver, TotalTicketsPresent);
	}
	
	public boolean ValidateInstantDrawDate() throws Throwable
	{
		System.out.println(InstantDrawDate.getText());
		return Action.isDisplayed(driver, InstantDrawDate);
	}
	
	public boolean ValidateSeeTermsForFreePostalEntryOption() throws Throwable
	{
		System.out.println(SeeTermsForFreePostalEntryOption.getText());
		return Action.isDisplayed(driver, SeeTermsForFreePostalEntryOption);
	}
	
	public boolean ValidateTermsLink() throws Throwable
	{
		System.out.println(TermsLink.getText());
		return Action.isDisplayed(driver, TermsLink);
	}
	
	public void ClickonTermsLink() throws Throwable
	{
		Action.Click(driver, TermsLink);
	}
	
	public boolean ValidateEntryTicketPrize() throws Throwable
	{
		System.out.println(EntryTicketPrize.getText());
		return Action.isDisplayed(driver, EntryTicketPrize);
	}
	
	public boolean ValidateTotalTicketProgressBar() throws Throwable
	{
		System.out.println(TotalTicketProgressBar.getText());
		return Action.isDisplayed(driver, TotalTicketProgressBar);
	}
	
	public boolean ValidateTicketSoldProgressBar() throws Throwable
	{
		System.out.println(TicketSoldProgressBar.getText());
		return Action.isDisplayed(driver, TicketSoldProgressBar);
	}
	
	public boolean ValidateMinNoOfTickets() throws Throwable
	{
		System.out.println(MinNoOfTickets.getText());
		return Action.isDisplayed(driver, MinNoOfTickets);
	}
	
	public boolean ValidateMaxNoOfTickets() throws Throwable
	{
		System.out.println(MaxNoOfTickets.getText());
		return Action.isDisplayed(driver, MaxNoOfTickets);
	}
	
	public boolean ValidateTotalNoOfTicketsLeft() throws Throwable
	{
		System.out.println(TotalNoOfTicketsLeft.getText());
		return Action.isDisplayed(driver, TotalNoOfTicketsLeft);
	}
	
	public boolean ValidatePercentageOfTicketsSold() throws Throwable
	{
		System.out.println(PercentageOfTicketsSold.getText());
		return Action.isDisplayed(driver, PercentageOfTicketsSold);
	}
	
	public boolean ValidateSelectDropdown() throws Throwable
	{
		System.out.println(SelectDropdown.getText());
		return Action.isDisplayed(driver, SelectDropdown);
	}
	
	public void ClickonSelectDropdown() throws Throwable
	{
		Action.Click(driver, SelectDropdown);
	}
	//-------------------------imp
	public boolean ValidateDropdownMenuShow() throws Throwable
	{
		System.out.println(SelectDropdown.getText());
		return Action.isDisplayed(driver, DropdownMenuShow);
	}
	
	
	public boolean ValidateEnterBtn() throws Throwable
	{
		System.out.println(EnterBtn.getText());
		return Action.isDisplayed(driver, EnterBtn);
	}
	
	public void ClickonEnterBtn() throws Throwable
	{
		Action.JSClick(driver, EnterBtn);
	}
	
	public boolean ValidateInstantDrawInformationText() throws Throwable
	{
		System.out.println(InstantDrawInformationText.getText());
		return Action.isDisplayed(driver, InstantDrawInformationText);
	}
	
	public boolean ValidateCompetitionInformationText() throws Throwable
	{
		System.out.println(CompetitionInformationText.getText());
		return Action.isDisplayed(driver, CompetitionInformationText);
	}
	

}
