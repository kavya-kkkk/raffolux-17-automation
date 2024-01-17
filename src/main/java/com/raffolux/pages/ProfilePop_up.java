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
public class ProfilePop_up extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div/div[1]/div/div[1]/h2")
	WebElement WelComeBackDharma_Text;
	
	@FindBy(xpath = "//div[contains(text(),' You have entries in ')]")
	WebElement You_Have_Entries_In_Text;
	
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div/div[1]/div/div[1]/a")
	WebElement Pop_Up_Closing_Option;
	
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div/div[1]/div/div[2]/a")
	WebElement _Active_Raffles;
	
	@FindBy(xpath = "//*[@id=\"menu-myraffle\"]/div")
	WebElement Myraffles_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-myraffle\"]/div/span/i")
	WebElement Myraffles_Ticket_Token;
	
	@FindBy(xpath = "//*[@id=\"menu-creditwallet\"]/div")
	WebElement MyCredit_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-creditwallet\"]/div/div/div")
	WebElement MyCredit_Balance_Text;
	
	@FindBy(xpath = "//*[@id=\"menu-creditwallet\"]/div/span/i")
	WebElement MyCredit_Symbol;
	
	@FindBy(xpath = "//*[@id=\"menu-winner\"]/div")
	WebElement Winners_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-winner\"]/div/span/i")
	WebElement Winners_Symbol;
	
	@FindBy(xpath = "//*[@id=\"menu-livedraw\"]/div")
	WebElement LiveDraws_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-livedraw\"]/div/span/i")
	WebElement LiveDraws_Symbol;
	
	@FindBy(xpath = "//*[@id=\"menu-charity\"]/div")
	WebElement Charity_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-charity\"]/div/span/i")
	WebElement Charity_Symbol;
	
	@FindBy(xpath = "//*[@id=\"toggle-theme-btn\"]/div")
	WebElement ToggleTheme_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"toggle-theme\"]")
	WebElement ToggleTheme_Symbol;
	
	@FindBy(xpath = "//*[@id=\"menu-logout\"]/div")
	WebElement Logout_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-logout\"]/div/span/i")
	WebElement Logout_Symbol;
	
	@FindBy(xpath = "//h3[text()='Account']")
	WebElement Account_Option;
	
	@FindBy(xpath = "//*[@id=\"menu-personalinfo\"]/div")
	WebElement Personal_Info_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-personalinfo\"]/div/span/i")
	WebElement Personal_Info_Symbol;
	
	@FindBy(xpath = "//h3[text()='Site information']")
	WebElement Site_Info_Option;
	
	@FindBy(xpath = "//*[@id=\"menu-help\"]/div")
	WebElement Help_And_FAQS_Slide_Bar_Menu_Link;
	
	@FindBy(xpath = "//*[@id=\"menu-help\"]/div/span/i")
	WebElement Help_And_FAQS_Symbol;
	
	@FindBy(linkText = "Terms")
	WebElement Terms_Link;
	
	@FindBy(linkText = "Privacy")
	WebElement Privacy_Link;
	
	@FindBy(linkText = "Help")
	WebElement Help_Link;
	
	@FindBy(xpath = "//*[@id=\"facebook-button-sidebar\"]/img")
	WebElement Facebook_Icon_Logo;
	
	@FindBy(xpath = "//*[@id=\"twitter-button-sidebar\"]/img")
	WebElement Twitter_Icon_Logo;
	
	@FindBy(xpath = "//*[@id=\"instagram-button-sidebar\"]/img")
	WebElement Instagram_Icon_Logo;
	
	@FindBy(xpath = "//*[@id=\"linkin-button-sidebar\"]/img")
	WebElement LinkDin_Icon_Logo;
	
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div/div[5]/a[1]/img")
	WebElement GameCare_Logo;
	
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div/div[5]/a[2]/img")
	WebElement Be_GambleAware_Logo;
	
	@FindBy(xpath = "//*[@id=\"sideNav\"]/div")
	WebElement Pop_up_window;
	
	
	public ProfilePop_up()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateProfile_Pop_up_window() throws Throwable
	{
		return Action.isDisplayed(driver, Pop_up_window);
	}
	
	public String ValiadteWelComeBackDharma_Text()
	{
		String text = WelComeBackDharma_Text.getText();
		return text;
	}
	
	public String ValiadteYou_Have_Entries_In_Text()
	{
		String text = You_Have_Entries_In_Text.getText();
		return text;
	}
	
	public boolean ValidatePop_Up_Closing_Option() throws Throwable
	{
		return Action.isDisplayed(driver, Pop_Up_Closing_Option);
	}
	
	public void ClickonPop_Up_Closing_Option() throws Throwable
	{
		Action.Click(driver, Pop_Up_Closing_Option);
		Thread.sleep(2000);
	}
	
	public boolean Validate_Active_Raffles() throws Throwable
	{
		return Action.isDisplayed(driver, _Active_Raffles);
	}
	
	public void Clickon_Active_Raffles() throws Throwable
	{
		Action.Click(driver, _Active_Raffles);
		Thread.sleep(2000);
	}
	
	public boolean ValidateMyraffles_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Myraffles_Slide_Bar_Menu_Link);
	}
	
	public void ClickonMyraffles_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, Myraffles_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
		
	}
	
	public boolean ValidateMyraffles_Ticket_Token() throws Throwable
	{
		return Action.isDisplayed(driver, Myraffles_Ticket_Token);
	}
	
	public boolean ValidateMyCredit_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, MyCredit_Slide_Bar_Menu_Link);
	}
	
	public MyCreditPage ClickonMyCredit_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, MyCredit_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
		return new MyCreditPage();
	}
	
	public boolean ValidateMyCredit_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, MyCredit_Symbol);
	}
	//-----------------------------------------------------------------
	public String ValiadteMyCredit_Balance_Text()
	{
		String text = MyCredit_Balance_Text.getText();
		return text;
	}
	
	public boolean ValidateWinners_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Winners_Slide_Bar_Menu_Link);
	}
	
	public void ClickonWinners_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, Winners_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateWinners_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Winners_Symbol);
	}
	
	public boolean ValidateLiveDraws_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, LiveDraws_Slide_Bar_Menu_Link);
	}
	
	public LiveDrawsPage ClickonLiveDraws_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, LiveDraws_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
		return new LiveDrawsPage();
	}
	
	public boolean ValidateLiveDraws_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, LiveDraws_Symbol);
	}
	
	public boolean ValidateCharity_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Charity_Slide_Bar_Menu_Link);
	}
	
	public void ClickonCharity_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, Charity_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateCharity_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Charity_Symbol);
	}
	
	public boolean ValidateToggleTheme_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, ToggleTheme_Slide_Bar_Menu_Link);
	}
	
	public void ClickonToggleThema_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, ToggleTheme_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateToggleTheme_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, ToggleTheme_Symbol);
	}
	
	public boolean ValidateLogout_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Logout_Slide_Bar_Menu_Link);
	}
	
	public void ClickonLogout_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, Logout_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateLogout_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Logout_Symbol);
	}
	
	public String ValiadteAccount_Option()
	{
		String text = Account_Option.getText();
		return text;
	}
	
	public boolean ValidatePersonal_Info_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Personal_Info_Slide_Bar_Menu_Link);
	}
	
	public UserInformationPage ClickonPersonal_Info_Slide_Bar_Menu_Link() throws Throwable
	{
		Thread.sleep(2000);
		Action.Click(driver, Personal_Info_Slide_Bar_Menu_Link);
	    return new UserInformationPage();
	}
	
	public boolean ValidatePersonal_Info_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Personal_Info_Symbol);
	}
	
	public String ValiadteSite_Info_Option()
	{
		String text = Site_Info_Option.getText();
		return text;
	}
	
	public boolean ValidateHelp_And_FAQS_Slide_Bar_Menu_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Help_And_FAQS_Slide_Bar_Menu_Link);
	}
	
	public HowCanWe_Help_YouPage ClickonHelp_And_FAQS_Slide_Bar_Menu_Link() throws Throwable
	{
		Action.Click(driver, Help_And_FAQS_Slide_Bar_Menu_Link);
		Thread.sleep(2000);
		return new HowCanWe_Help_YouPage();
	}
	
	public boolean ValidateHelp_And_FAQS_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Help_And_FAQS_Symbol);
	}
	
	public boolean ValidateTerms_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Terms_Link);
	}
	
	public void ClickonTerms_Link() throws Throwable
	{
		Action.Click(driver, Terms_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidatePrivacy_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Privacy_Link);
	}
	
	public void ClickonPrivacy_Link() throws Throwable
	{
		Action.Click(driver, Privacy_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateHelp_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Help_Link);
	}
	
	public void ClickonHelp_Link() throws Throwable
	{
		Action.Click(driver, Help_Link);
		Thread.sleep(2000);
	}
	
	public boolean ValidateFacebook_Icon_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Facebook_Icon_Logo);
	}
	
	public void ClickonFacebook_Icon_Logo() throws Throwable
	{
		Action.Click(driver, Facebook_Icon_Logo);
		Thread.sleep(2000);
	}
	
	public boolean ValidateTwitter_Icon_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Twitter_Icon_Logo);
	}
	
	public void ClickonTwitter_Icon_Logo() throws Throwable
	{
		Action.Click(driver, Twitter_Icon_Logo);
		Thread.sleep(2000);
	}
	
	public boolean ValidateInstagram_Icon_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Instagram_Icon_Logo);
	}
	
	public void ClickonInstagram_Icon_Logo() throws Throwable
	{
		Action.Click(driver, Instagram_Icon_Logo);
		Thread.sleep(2000);
	}
	
	public boolean ValidateLinkDin_Icon_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, LinkDin_Icon_Logo);
	}
	
	public void ClickonLinkDin_Icon_Logo() throws Throwable
	{
		Action.Click(driver, LinkDin_Icon_Logo);
		Thread.sleep(2000);
	}
	
	public boolean ValidateGameCare_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, GameCare_Logo);
	}
	
	public void ClickonGameCare_Logo() throws Throwable
	{
		Action.Click(driver, GameCare_Logo);
		Thread.sleep(2000);
	}
	
	public boolean ValidateBe_GambleAware_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Be_GambleAware_Logo);
	}
	
	public void ClickonBe_GambleAware_Logo() throws Throwable
	{
		Action.Click(driver, Be_GambleAware_Logo);
		Thread.sleep(2000);
	}
	
}
