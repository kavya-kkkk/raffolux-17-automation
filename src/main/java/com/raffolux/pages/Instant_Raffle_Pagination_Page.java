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
public class Instant_Raffle_Pagination_Page extends BaseClass
{
	
	
	@FindBy(xpath = "//*[@id=\"8254\"]/div[2]/span/a")
	WebElement Instant_Raffle_Enter_Now_Button;
	
	@FindBy(id = "all_prices_value")
	WebElement List_of_Instant_Raffle_All_Prizes;
	
	////*[@id="container"]/div/div[1]/div[6]/div/div[3]/ul/li[7]
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[6]/div/div[3]/ul/li[7]")
	WebElement Instant_Raffle_Pagination_Next_Button;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[6]/div/div[3]/ul/li[1]")
	WebElement Instant_Raffle_Pagination_Prev_Button;
	
	
	/*@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[8]")
	WebElement Instant_Raffle_Pagination_Next_Button;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[1]")
	WebElement Instant_Raffle_Pagination_Prev_Button;*/
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[2]")
	WebElement Instant_Raffle_Pagination_one_Number;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[3]")
	WebElement Instant_Raffle_Pagination_two_Number;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[4]")
	WebElement Instant_Raffle_Pagination_three_Number;
	
	//*[@id="container"]/div/div[1]/div[7]/div/div[3]/ul/li[7]
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[7]/div/div[3]/ul/li[7]")
	WebElement Instant_Raffle_Pagination_Last_Number;
	
	@FindBy(xpath = "(//span[text()='51'])[2]")
	WebElement Instant_Raffle_Pagination_Last_Number_Text;
	
	//WebElements present on each of the page
	//1st page
	
	
	
	//1st page
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[1]/div/div[2]/span")
	WebElement First_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[2]/div/div[2]/span")
	WebElement Second_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[3]/div/div[2]/span")
	WebElement Third_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[4]/div/div[2]/span")
	WebElement Fourth_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[5]/div/div[2]/span")
	WebElement Fifth_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[6]/div/div[2]/span")
	WebElement Sixth_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[7]/div/div[2]/span")
	WebElement Seventh_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[8]/div/div[2]/span")
	WebElement Eighth_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[9]/div/div[2]/span")
	WebElement Nineth_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[10]/div/div[2]/span")
	WebElement Tenth_Prize_Text_in_the_All_Prizes;
	
	//
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[11]/div/div[2]/span")
	WebElement Eleven_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[12]/div/div[2]/span")
	WebElement Twelve_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[13]/div/div[2]/span")
	WebElement Thirteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[14]/div/div[2]/span")
	WebElement Fourteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[15]/div/div[2]/span")
	WebElement Fifteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[16]/div/div[2]/span")
	WebElement Sixteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[17]/div/div[2]/span")
	WebElement Seventeen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[18]/div/div[2]/span")
	WebElement Eighteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[19]/div/div[2]/span")
	WebElement Nineteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[20]/div/div[2]/span")
	WebElement Twenty_Prize_Text_in_the_All_Prizes;
	
	//
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[21]/div/div[2]/span")
	WebElement T_one_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[22]/div/div[2]/span")
	WebElement T_two_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[23]/div/div[2]/span")
	WebElement T_three_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[24]/div/div[2]/span")
	WebElement T_four_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[25]/div/div[2]/span")
	WebElement T_Five_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[26]/div/div[2]/span")
	WebElement T_Six_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[27]/div/div[2]/span")
	WebElement T_Seven_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[28]/div/div[2]/span")
	WebElement T_Eight_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[29]/div/div[2]/span")
	WebElement T_Nine_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[30]/div/div[2]/span")
	WebElement Thirty_Prize_Text_in_the_All_Prizes;
	
	//2nd page 
	//*[@id="all_prices_value"]/li[1]/div/div[2]/span
	/*
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[1]/div/div[2]/span")
	WebElement Eleven_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[2]/div/div[2]/span")
	WebElement Twelve_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[3]/div/div[2]/span")
	WebElement Thirteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[4]/div/div[2]/span")
	WebElement Fourteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[5]/div/div[2]/span")
	WebElement Fifteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[6]/div/div[2]/span")
	WebElement Sixteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[7]/div/div[2]/span")
	WebElement Seventeen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[8]/div/div[2]/span")
	WebElement Eighteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[9]/div/div[2]/span")
	WebElement Nineteen_Prize_Text_in_the_All_Prizes;
	
	@FindBy(xpath = "//*[@id=\"all_prices_value\"]/li[10]/div/div[2]/span")
	WebElement Twenty_Prize_Text_in_the_All_Prizes;*/
	
	//WebElements present on the pagination feature
	
	
	public Instant_Raffle_Pagination_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	public String ValidateFirst_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = First_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateSecond_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Second_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateThird_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Third_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateFourth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Fourth_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateFifth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Fifth_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateSixth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Sixth_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateSeventh_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Seventh_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateEigth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Eighth_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateNineth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Nineth_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Nineth_Prize_in_the_All_Prizes);
	}
	
	public String ValidateTenth_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Tenth_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Tenth_Prize_in_the_All_Prizes);
	}
	
	//
	
	
	
	public String ValidateEleven_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Eleven_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateTwelve_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Twelve_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateThirteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Thirteen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateFourteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Fourteen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateFifteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Fifteen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateSixteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Sixteen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateSeventeen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Seventeen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateEighteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Eighteen_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateNineteen_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Nineth_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Nineth_Prize_in_the_All_Prizes);
	}
	
	public String ValidateTwenty_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Twenty_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Tenth_Prize_in_the_All_Prizes);
	}
	
	//
	
	public String ValidateT_one_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_one_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_two_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_two_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_three_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_three_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_four_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_four_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_Five_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_Five_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_Six_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_Six_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_Seven_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_Seven_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_Eight_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_Eight_Prize_Text_in_the_All_Prizes.getText();
		return text;
	}
	
	public String ValidateT_Nine_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = T_Nine_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Nineth_Prize_in_the_All_Prizes);
	}
	
	public String ValidateThirty_Prize_Text_in_the_All_Prizes() throws Throwable
	{
		String text = Thirty_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Tenth_Prize_in_the_All_Prizes);
	}
	
	//
	 public void Validate_Scroll_Page0()
	 {
		 Action.scrollIntoView(driver, First_Prize_Text_in_the_All_Prizes);
	 }
	
	 public void Validate_Scroll_Page1()
	 {
		 Action.scrollIntoView(driver, Tenth_Prize_Text_in_the_All_Prizes);
	 }
	 
	 public void Validate_Scroll_Page2()
	 {
		 Action.scrollIntoView(driver, Twenty_Prize_Text_in_the_All_Prizes);
	 }
	 
	 public void Validate_Scroll_Page3()
	 {
		 Action.scrollIntoView(driver, Thirty_Prize_Text_in_the_All_Prizes);
	 }
	 
	//
	
	public String ValidateEleventh_Prize_in_the_All_Prizes() throws Throwable
	{
		String text = Tenth_Prize_Text_in_the_All_Prizes.getText();
		return text;
		//Action.isDisplayed(driver, Tenth_Prize_in_the_All_Prizes);
	}
	
	
	public void Click_On_Enter_Now_Button() throws Throwable
	{
		Action.JSClick(driver, Instant_Raffle_Enter_Now_Button);
	}
	
	public void Scroll_Till_Pagination()
	{
		Action.scrollIntoView(driver, List_of_Instant_Raffle_All_Prizes);
	}
	
	public void Validate_List_of_Instant_Raffle_All_Prizes() throws Throwable
	{
		Action.isDisplayed(driver, List_of_Instant_Raffle_All_Prizes);
	}
	
	public boolean ValidateInstant_Raffle_Pagination_Next_Button() throws Throwable
	{
		return Action.isDisplayed(driver, Instant_Raffle_Pagination_Next_Button);
	}
	
	
	
	public void Click_On_Instant_Raffle_Pagination_Next_Button() throws Throwable
	{
		Action.JSClick(driver, Instant_Raffle_Pagination_Next_Button);
	}
	
	public void Click_On_Instant_Raffle_Pagination_Prev_Button() throws Throwable
	{
		Action.JSClick(driver, Instant_Raffle_Pagination_Prev_Button);
	}
	
	public void Click_On_Instant_Raffle_Pagination_one_Number() throws Throwable
	{
		Action.JSClick(driver, Instant_Raffle_Pagination_one_Number);
		//Action.Click(driver, Instant_Raffle_Pagination_one_Number);
	}
	
	public void Click_On_Instant_Raffle_Pagination_two_Number() throws Exception
	{
		Action.Click(driver, Instant_Raffle_Pagination_two_Number);
	}
	
	public void Click_On_Instant_Raffle_Pagination_three_Number() throws Exception
	{
		Action.Click(driver, Instant_Raffle_Pagination_three_Number);
	}
	
	
	
	
}
