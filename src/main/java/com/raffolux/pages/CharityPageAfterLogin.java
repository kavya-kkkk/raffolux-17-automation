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
public class CharityPageAfterLogin extends BaseClass
{
	@FindBy(xpath = "/html/body/section[1]/div/div/div/h3/i")
	WebElement CharityRibbonLogo;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div/h3")
	WebElement TotalRaisedForCharityText;
	
	@FindBy(xpath = "//h2[contains(text(),\" £501,339\")]")
	WebElement TotalMoneyRaisedForCharityInPounds;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div/div/div[1]/div/a")
	WebElement OneOftheCharityOption;
	
	@FindBy(xpath = "/html/body/section[3]/div/div/div/p ")
	WebElement RaffoluxMakesDonationsToItsCharityInformationText;
	
	//Webelements After clicking any one of the Charity option
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div")
	WebElement ActionAidUKCharityOption;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/a/img")
	WebElement ActionAidUKCharityOptionLogo;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/p[1]")
	WebElement ActionAidUKCharityOptionInformationText;
	
	@FindBy(xpath = "//p[text()='Would you like to choose ActionAid UK as your sponsored charity?']")
	WebElement WouldYouLikeToChooseActionAidUKAsYourSponsoredCharityText;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/form/button")
	WebElement ConfirmButton;
	
	@FindBy(xpath = "//*[@id=\"charity-300\"]/div/div/div/div/p[3]/a")
	WebElement CancelOption;
	
	//=-----------------------------------------------------------
	// WebElements After the confirming any one of the Charity option
	
	@FindBy(xpath = "//h2[text()='My Charity']")
	WebElement MyCharityTitleText;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[1]/p")
	WebElement YourCurrentCharitySponserIsText;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[1]/p/span")
	WebElement SelectedCharityName;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[2]/div[1]/div[1]/img")
	WebElement SelectedCharityLogo;
	
	@FindBy(xpath = "//p[text()='Total Donated']")
	WebElement TotalDonatedTextOption;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/h3")
	WebElement TotalDonatedMoneyInPounds;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[3]/p")
	WebElement InformationTextAboutSelectedCharity;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[3]/div[1]/a[1]/div")
	WebElement JoinSelectedCharityNewsLetterLink;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div[3]/div[1]/a[2]/div")
	WebElement ViewWebSiteLink;
	//-----------------------------------------------------------------------------------------------
	
	public CharityPageAfterLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidateCharityRibbonLogo() throws Throwable
	{
		return Action.isDisplayed(driver, CharityRibbonLogo);
	}
	
	public String ValidateTotalRaisedForCharityText()
	{
		String text = TotalRaisedForCharityText.getText();
		return text;
	}
	
	public String ValidateTotalMoneyRaisedForCharityInPounds()
	{
		String text = TotalMoneyRaisedForCharityInPounds.getText();
		return text;
	}
	
	public boolean ValidateOneOftheCharityOption() throws Throwable
	{
		return Action.isDisplayed(driver, OneOftheCharityOption);       //String text = TotalMoneyRaisedForCharityInPounds.getText(); //return text;
	}
	
	public void ValidateMouseHovOverOneOftheCharityOption() throws Throwable
	{
		Action.scrollIntoView(driver, OneOftheCharityOption);
		Thread.sleep(1000);
		//Action.drawBorder(OneOftheCharityOption, driver);
		//Thread.sleep(2000);
		Action.mouseOverElement(OneOftheCharityOption); 
	}
	
	public void ClickonOneOftheCharityOption() throws Throwable
	{
		Action.JSClick(driver, OneOftheCharityOption);
	}
	
	public boolean ValidateActionAidUKCharityOption() throws Throwable
	{
		return Action.isDisplayed(driver, ActionAidUKCharityOption);       //String text = TotalMoneyRaisedForCharityInPounds.getText(); //return text;
	}
	
	public boolean ValidateRaffoluxMakesDonationsToItsCharityInformationText() throws Throwable
	{
		String text = RaffoluxMakesDonationsToItsCharityInformationText.getText();
		System.out.println(text);
		return Action.isDisplayed(driver, RaffoluxMakesDonationsToItsCharityInformationText);
	}
	//--------------------------------------------------------------------After Selecting the charity option
	public String ValidateMyCharityTitleText() throws Throwable
	{
		String text = MyCharityTitleText.getText();
		System.out.println(text);
		return text;
	}
	
	public String ValidateYourCurrentCharitySponserIsText() throws Throwable
	{
		String text = YourCurrentCharitySponserIsText.getText();
		System.out.println(text);
		return text;
	}
	
	public String ValidateSelectedCharityName() throws Throwable
	{
		 String text = SelectedCharityName.getText();
		//return Action.isDisplayed(driver, SelectedCharityName);
		 return text;
	}
	
	public boolean ValidateSelectedCharityLogo() throws Throwable
	{
		return Action.isDisplayed(driver, SelectedCharityLogo);
	}
	
	public String ValidateTotalDonatedTextOption() throws Throwable
	{
		 String text = TotalDonatedTextOption.getText();
		 return text;	
	}
	
	public String ValidateTotalDonatedMoneyInPounds() throws Throwable
	{
		 String text = TotalDonatedMoneyInPounds.getText();
		 return text;	
	}
	
	public boolean ValidateInformationTextAboutSelectedCharity() throws Throwable
	{
		// String text = InformationTextAboutSelectedCharity.getText();
		return  Action.isDisplayed(driver, InformationTextAboutSelectedCharity);		
	}
	
	public boolean ValidateJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		return  Action.isDisplayed(driver, JoinSelectedCharityNewsLetterLink);		
	}
	
	public void MouseHovOverJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		Action.mouseOverElement(JoinSelectedCharityNewsLetterLink);
		System.out.println("Successfully mouse hovered over   :"+JoinSelectedCharityNewsLetterLink);
	}
	
	public void ClickonJoinSelectedCharityNewsLetterLink() throws Throwable
	{
		Action.JSClick(driver, JoinSelectedCharityNewsLetterLink);
		Thread.sleep(2000);
		System.out.println("Successfully clicked on   :"+JoinSelectedCharityNewsLetterLink);
	}
	
	public boolean ValidateViewWebSiteLink() throws Throwable
	{
		return  Action.isDisplayed(driver, ViewWebSiteLink);		
	}
	
	public void MouseHovOverViewWebSiteLink() throws Throwable
	{
		Action.mouseOverElement(ViewWebSiteLink);
		System.out.println("Successfully mouse hovered over   :"+ViewWebSiteLink);
	}
	
	public void ClickonViewWebSiteLink() throws Throwable
	{
		Action.JSClick(driver, ViewWebSiteLink);
		Thread.sleep(2000);
		System.out.println("Successfully clicked on   :"+ViewWebSiteLink);
	}

}
