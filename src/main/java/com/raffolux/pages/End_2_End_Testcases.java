/**
 * 
 */
package com.raffolux.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class End_2_End_Testcases extends BaseClass
{
	//WebElements
	
	@FindBy(linkText="Join Raffolux")
	WebElement JoinRaffoluxLink;
	
	@FindBy(id = "id_first_name")
	WebElement First_Name;
	
	@FindBy(id = "id_last_name")
	WebElement Last_Name;
	
	@FindBy(id = "id_email")
	WebElement Email_Id_Textfield;
	
	@FindBy(id = "id_password1")
	WebElement Choose_Password_TextField;
	
	@FindBy(id = "id_password2")
	WebElement Confirm_Password_TextField;
	
	@FindBy(name = "contact_number_2_1")
	WebElement Contact_Number_Textfield;
	
	@FindBy(name = "contact_number_2_0")
	WebElement Country_Code_Dropdown;
	
	@FindBy(name = "marketing")
	WebElement Yes_Radio_Button;
	
	@FindBy(id = "id_marketing_1")
	WebElement No_Radio_Button;
	
	@FindBy(id = "submit-signup-btn")
	WebElement Create_Account_Button;

	//Instant raffle pagination WebElements
	
	@FindBy(xpath = "//div[@class='pagination pagination-display']")
	WebElement Pagination_Display_Section;
	
	@FindBy(xpath = "(//li[@class='btn next'])[2]")
	WebElement Pagination_Next_Button;
	
	@FindBy(xpath = "(//li[@class='btn prev'])[2]")
	WebElement Pagination_Prev_Button;
	
	
	
	//Constructor to initialize the WebElements
	
	public End_2_End_Testcases()
	{
		PageFactory.initElements(driver, this);
	}

	
	//User action methods
	public void Create_Account(String LastName, String FirstName, String Email, String Country_Code, String PhoneNumber, String ChoosePassword, String ConfirmPassword) throws Throwable
	{
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		Action.type(First_Name, FirstName);
		Thread.sleep(2000);
		Action.type(Last_Name, LastName);
		Thread.sleep(2000);
		Action.type(Email_Id_Textfield, Email);
		Thread.sleep(2000);
		Action.selectBySendkeys(Country_Code_Dropdown, Country_Code);
		Thread.sleep(2000);
		Action.type(Contact_Number_Textfield, PhoneNumber);
		Thread.sleep(2000);
		Action.scrollIntoView(driver, Choose_Password_TextField);
		Action.type(Choose_Password_TextField, ChoosePassword);
		Thread.sleep(3000);
		Action.scrollIntoView(driver, Confirm_Password_TextField);
		Action.type(Confirm_Password_TextField, ChoosePassword);
		Action.JSClick(driver, Yes_Radio_Button);
		Thread.sleep(2000);
		Action.JSClick(driver, Create_Account_Button);
		System.out.println("Successfully clicked on Create account button");
	}
}
