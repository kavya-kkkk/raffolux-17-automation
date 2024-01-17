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
public class Points_Store_Page extends BaseClass
{
	@FindBy(xpath = "//h3[text()='Points Store']")
	WebElement Points_Store_Title_Text;
	
	@FindBy(xpath = "//i[@class='fas fa-solid fa-arrow-left desk-store-hide']")
	WebElement Points_Store_Arrow_Symbol_At_Top_Left;
	
	@FindBy(xpath = "//button[@class='nav-link storetab active show']")
	WebElement Store_Tab;
	
	@FindBy(xpath = "//button[@class='nav-link storetab']")
	WebElement Earned_Tab;
	
	@FindBy(xpath = "(//h2[@class='pointsHeading mb-pointsHeadingStyle'])[1]")
	WebElement You_have_raffolux_points_section_Under_Store_Tab;
	
	@FindBy(xpath = "(//h2[@class='pointsHeading mb-pointsHeadingStyle'])[2]")
	WebElement You_have_raffolux_points_section_Under_Earned_Tab;
	
	@FindBy(xpath = "(//span[@class='pointsNum'])[1]")
	WebElement No_Of_Points_In_You_have_raffolux_points_section_Under_Store_Tab;
	
	@FindBy(xpath = "(//img[@class='logo-img'])[1]")
	WebElement Raffolux_Logo_In_You_have_raffolux_points_section_Under_Store_Tab;
	
	@FindBy(xpath = "(//span[@class='pointsNum'])[1]")
	WebElement No_Of_Points_In_You_have_raffolux_points_section_Under_Earned_Tab;
	
	@FindBy(xpath = "(//span[@class='pointsNum'])[2]")
	WebElement Raffolux_Logo_In_You_have_raffolux_points_section_Under_Earned_Tab;
	
	@FindBy(xpath = "(//h5[@class='offersListHeading mb-offersHeading'])[1]")
	WebElement Latest_Offers_Text;
	
	@FindBy(xpath = "(//h5[@class='offersListHeading mb-offersHeading'])[2]")
	WebElement All_Prizes_Text;
	
	@FindBy(xpath = "(//div[@class='offPercent mb-offPercentValue'])[1]")
	WebElement Offer_Percentage_Text;
	
	@FindBy(xpath = "(//h2[@class='itemHeading mb-itemHeading'])[1]")
	WebElement Title_Of_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//p[@class='costOfItem mb-itemCost'])[1]")
	WebElement Cost_Of_Item_Of_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//img[@class='latest-logo-img'])[1]")
	WebElement Raffolux_Logo_In_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//button[@class='btn redeemBtn mb-redeemButton'])[1]")
	WebElement Redeem_Button_Of_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//img[@class='watchImage'])[1]")
	WebElement Prize_Image_Of_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//i[@class='fal fa-long-arrow-right'])[1]")
	WebElement Redeem_Arrow_Symbol_Of_One_Of_The_Latest_Offer_Prize;
	
	@FindBy(xpath = "(//p[@class='cardContent mb-cardHeading'])[1]")
	WebElement Title_Of_One_Of_The_All_Prizes_Prize;
	
	@FindBy(xpath = "(//p[@class='costOfItem mb-costOfCard itemMargin'])[1]")
	WebElement Cost_Of_Item_Of_One_Of_The_All_Prizes_Prize;
	
	@FindBy(xpath = "(//img[@class='latest-logo-img'])[1]")
	WebElement Raffolux_Logo_In_One_Of_The_All_Prizes_Prize;
	
	@FindBy(xpath = "(//img[@class='w-100'])[1]")
	WebElement Prize_Image_Of_One_Of_The_All_Prizes_Prize;
	
	public Points_Store_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Validate_Points_Store_Title_Text()
	{
		String text = Points_Store_Title_Text.getText();
		return text;
	}
	
	public boolean Validate_Points_Store_Arrow_Symbol_At_Top_Left() throws Throwable
	{
		return Action.isDisplayed(driver, Points_Store_Arrow_Symbol_At_Top_Left);
	}
	
	public void Validate_by_Clicking_Points_Store_Arrow_Symbol_At_Top_Left() throws Throwable
	{
		Action.JSClick(driver, Points_Store_Arrow_Symbol_At_Top_Left);
	}
	
	public boolean Validate_Store_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, Store_Tab);
	}
	
	public void Validate_by_Clicking_Store_Tab() throws Throwable
	{
		Action.JSClick(driver, Store_Tab);
	}
	
	public boolean Validate_Earned_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, Earned_Tab);
	}
	
	public void Validate_by_Clicking_Earned_Tab() throws Throwable
	{
		Action.JSClick(driver, Earned_Tab);
	}
	
	public boolean Validate_You_have_raffolux_points_section_Under_Store_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, You_have_raffolux_points_section_Under_Store_Tab);
	}
	
	public boolean Validate_You_have_raffolux_points_section_Under_Earned_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, You_have_raffolux_points_section_Under_Earned_Tab);
	}
	
	public boolean Validate_No_Of_Points_In_You_have_raffolux_points_section_Under_Store_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, No_Of_Points_In_You_have_raffolux_points_section_Under_Store_Tab);
	}
	
	public boolean Validate_Raffolux_Logo_In_You_have_raffolux_points_section_Under_Store_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, Raffolux_Logo_In_You_have_raffolux_points_section_Under_Store_Tab);
	}
	
	public boolean Validate_No_Of_Points_In_You_have_raffolux_points_section_Under_Earned_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, No_Of_Points_In_You_have_raffolux_points_section_Under_Earned_Tab);
	}
	
	public boolean Validate_Raffolux_Logo_In_You_have_raffolux_points_section_Under_Earned_Tab() throws Throwable
	{
		return Action.isDisplayed(driver, Raffolux_Logo_In_You_have_raffolux_points_section_Under_Earned_Tab);
	}
	
	public boolean Validate_Latest_Offers_Text() throws Throwable
	{
		return Action.isDisplayed(driver, Latest_Offers_Text);
	}
	
	public boolean Validate_All_Prizes_Text() throws Throwable
	{
		return Action.isDisplayed(driver, All_Prizes_Text);
	}
	
	public boolean Validate_Title_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		String text = Title_Of_One_Of_The_Latest_Offer_Prize.getText();
		System.out.println(text);
		return Action.isDisplayed(driver, Title_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Cost_Of_Item_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		String text = Cost_Of_Item_Of_One_Of_The_Latest_Offer_Prize.getText();
		System.out.println(text);
		return Action.isDisplayed(driver, Cost_Of_Item_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Raffolux_Logo_In_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Raffolux_Logo_In_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Redeem_Button_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Redeem_Button_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public void Validate_By_clicking_Redeem_Button_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		Action.JSClick(driver, Redeem_Button_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Prize_Image_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Prize_Image_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Redeem_Arrow_Symbol_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Redeem_Arrow_Symbol_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public void Validate_By_clicking_Redeem_Arrow_Symbol_Of_One_Of_The_Latest_Offer_Prize() throws Throwable
	{
		Action.JSClick(driver, Redeem_Arrow_Symbol_Of_One_Of_The_Latest_Offer_Prize);
	}
	
	public boolean Validate_Title_Of_One_Of_The_All_Prizes_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Title_Of_One_Of_The_All_Prizes_Prize);
	}
	
	public boolean Validate_Cost_Of_Item_Of_One_Of_The_All_Prizes_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Cost_Of_Item_Of_One_Of_The_All_Prizes_Prize);
	}
	
	public boolean Validate_Raffolux_Logo_In_One_Of_The_All_Prizes_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Raffolux_Logo_In_One_Of_The_All_Prizes_Prize);
	}
	
	public boolean Validate_Prize_Image_Of_One_Of_The_All_Prizes_Prize() throws Throwable
	{
		return Action.isDisplayed(driver, Prize_Image_Of_One_Of_The_All_Prizes_Prize);
	}

	
}
