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
public class RafflePageAfterLogin extends BaseClass
{
	
	@FindBy(xpath = "//div[contains(text(),'   view cart')]")  //Copied full xpath
	WebElement View_Button_OnThe_Confirmation_Message;
	
	@FindBy(id = "raffolux-logo")
	WebElement HomePageRaffoluxLogo;
	
	@FindBy(linkText = "Winners")
	WebElement WinnersLink;
	
	@FindBy(linkText = "My Raffles")
	WebElement MyRafflesLink;
	
	//@FindBy(xpath = "//*[@id=\"mainMenuContent\"]/ul/li[3]/a/i")
	//WebElement CartNotificationLogo;
	
	@FindBy(xpath="(//a[@class='cart-notification no-hover'])[1]")
	WebElement Cart_Notifications_logo;
	
	@FindBy(xpath = "//*[@id=\"mainMenuContent\"]/ul/li[4]/a/i")
	WebElement ProfileLogo;
	
	// Above all the WebElements are present in Header part of the Raffle Page
	
	@FindBy(xpath = "//*[@id=\"7948\"]/div[2]/span/a")
	WebElement InstantRaffleEnterNowBtn;
	
	@FindBy(xpath = "//*[@id=\"mob-fullwidth\"]/div[1]/img")
	WebElement SelectedRaffelImage;
	
	@FindBy(xpath = "//img[@class='img-fluid mobile-span-full-vw']")
	WebElement Respective_Raffle_Image;
	
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
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[2]/h5")
	WebElement AboutThePrizeText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[2]/p")
	WebElement AboutThePrizeRaffleDescription;
	
	@FindBy(xpath = "//div[contains(text(),'Details')]")
	WebElement DetailsText;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[4]/div[4]/div/ul")
	WebElement DetailedDescriptionOfRaffleText;
	
	@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/h2/span[1]")
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
	
	
	public RafflePageAfterLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------------------------------------------------
	public boolean ValidateRaffoluxLogo() throws Throwable
	{
		System.out.println("Raffolux logo verified successfully -");
		return Action.isDisplayed(driver, HomePageRaffoluxLogo);
	}
	
	public void Validate_By_Cliockon_RaffoluxLogo() throws Throwable
	{
		Action.Click(driver, HomePageRaffoluxLogo);
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
	
	public void ValidateMyRafflesLink() throws Throwable
	{
		Action.isDisplayed(driver, MyRafflesLink);
		System.out.println("MyRafflesLink verified successfully -");
	}
	
	public MyRafflesPage2 CliockonMyRafflesLink() throws Throwable
	{
		Action.Click(driver, MyRafflesLink);
		System.out.println("MyRafflesLink verified successfully -");
		
		return new MyRafflesPage2();
	}
	
	public void MousehovOverMyRafflesLink() throws Throwable
	{
		Action.mouseOverElement(MyRafflesLink);
		System.out.println("MyRafflesLink verified successfully -");
	}
	
	public void ValidateCartNotificationLogo() throws Throwable
	{
		Action.isDisplayed(driver, Cart_Notifications_logo);
		System.out.println("CartNotificationLogo verified successfully -");
	}
	
	/*public CartSummaryPage CliockonCartNotificationLogo() throws Throwable
	{
		Action.Click(driver, CartNotificationLogo);
		System.out.println("CartNotificationLogo verified successfully -");
		return new CartSummaryPage();
	}*/
	
	public CartSummaryPage Click_On_Cart_Notifications_logo() throws Throwable
	{
		Action.JSClick(driver, Cart_Notifications_logo);
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
	
	//Above all are User action methods performed on the webElements which are present at Header part of the Raffle Page 
	
	public boolean Validate_Respective_Raffle_Image() throws Throwable
	{
		System.out.println("Respective_Raffle_Image verified successfully -");
		return Action.isDisplayed(driver, Respective_Raffle_Image);
	}
	
	public boolean ValidateHowToPlayImage() throws Throwable
	{
		Thread.sleep(7000);
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
		return Action.isDisplayed(driver, OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles);
	}
	
	public void ClickonOneOfTheRafflefromYouMayBeAlsoInterestedInRaffles() throws Throwable
	{
		Action.JSClick(driver, OneOfTheRafflefromYouMayBeAlsoInterestedInRaffles);
	}
	
	public boolean ValidateTitleOfTheRaffle() throws Throwable
	{
		System.out.println(TitleOfTheRaffle.getText());
		return Action.isDisplayed(driver, TitleOfTheRaffle);
	}
	
	public boolean ValidateMaxTicketSection() throws Throwable
	{
		return Action.isDisplayed(driver, MaxTicketSection);
	}
	
	public boolean ValidateTotalTicketsSection() throws Throwable
	{
		return Action.isDisplayed(driver, TotalTicketsSection);
	}
	
	public boolean ValidateInstantDrawDateSection() throws Throwable
	{
		return Action.isDisplayed(driver, InstantDrawDateSection);
	}
	
	public boolean ValidateMaxTicketsPresent() throws Throwable
	{
		return Action.isDisplayed(driver, MaxTicketsPresent);
	}
	
	public boolean ValidateTotalTicketsPresent() throws Throwable
	{
		return Action.isDisplayed(driver, TotalTicketsPresent);
	}
	
	public boolean ValidateInstantDrawDate() throws Throwable
	{
		return Action.isDisplayed(driver, InstantDrawDate);
	}
	
	public boolean ValidateSeeTermsForFreePostalEntryOption() throws Throwable
	{
		return Action.isDisplayed(driver, SeeTermsForFreePostalEntryOption);
	}
	
	public boolean ValidateTermsLink() throws Throwable
	{
		return Action.isDisplayed(driver, TermsLink);
	}
	
	public void ClickonTermsLink() throws Throwable
	{
		Action.Click(driver, TermsLink);
	}
	
	public boolean ValidateEntryTicketPrize() throws Throwable
	{
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
		return Action.isDisplayed(driver, SelectDropdown);
	}
	
	public boolean ClickonSelectDropdown() throws Throwable
	{
		return Action.Click(driver, SelectDropdown);
	}
	//-----------------------------------------------------------------
	public boolean ValidateDropdownMenuShow() throws Throwable
	{
		System.out.println(SelectDropdown.getText());
		return Action.isDisplayed(driver, DropdownMenuShow);
	}
	
	public boolean ValidateEnterBtn() throws Throwable
	{
		return Action.isDisplayed(driver, EnterBtn);
	}
	
	public boolean ClickonEnterBtn() throws Throwable
	{
		return Action.JSClick(driver, EnterBtn);
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
	
	public void SelectedTicketsFromSelectDropdown() throws Throwable
	{
		Action.selectByIndex(SelectDropdown, 5);
	}
	
}
