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
public class MyCreditPage extends BaseClass
{
	@FindBy(xpath = "/html/body/div[4]/div[1]/a/i")
	WebElement Left_Arrow_Symbol;
	
	@FindBy(xpath = "//h5[text()='CREDIT BALANCE']")
	WebElement Credit_Balance_Text;
	
	@FindBy(xpath = "//p[text()='£0.00']")
	WebElement Credit_Balance_Amount;
	
	@FindBy(xpath = "//p[text()='You can earn credit through promotional codes and raffles.']")
	WebElement You_can_earn_credit_through_promotionalCodes_and_raffles_text;
	
	public MyCreditPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateLeft_Arrow_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Left_Arrow_Symbol);
	}
	
	public boolean ClickonLeft_Arrow_Symbol() throws Throwable
	{
		return Action.Click(driver, Left_Arrow_Symbol);
	}
	
	public String ValidateCredit_Balance_Text() throws Throwable
	{
		String text = Credit_Balance_Text.getText();
		return text;
	}
	
	public String ValidateCredit_Balance_Amount() throws Throwable
	{
		String text = Credit_Balance_Amount.getText();
		return text;
	}
	
	public String ValidateYou_can_earn_credit_through_promotionalCodes_and_raffles_text() throws Throwable
	{
		String text = You_can_earn_credit_through_promotionalCodes_and_raffles_text.getText();
		return text;
	}
	
}
