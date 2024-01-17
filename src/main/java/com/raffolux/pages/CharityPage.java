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
public class CharityPage extends BaseClass
{
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div/h3/i")
	WebElement CharityRibbonLogo;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div/h3")
	WebElement TotalRaisedForCharityText;
	
	@FindBy(xpath = "//h2[@class='raised-amount text-center mob-pos-center new-title colour-default-accent']")
	WebElement TotalMoneyRaisedForCharityInPounds;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div/div/div[1]/div/a")
	WebElement OneOftheCharityOption;
	
	@FindBy(xpath = "/html/body/section[3]/div/div/div/p ")
	WebElement RaffoluxMakesDonationsToItsCharityInformationText;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div")
	WebElement ActionAidUKCharityOption;
	
	public CharityPage()
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

}
