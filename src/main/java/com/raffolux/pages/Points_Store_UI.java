/**
 * 
 */
package com.raffolux.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author hp
 *
 */
public class Points_Store_UI 
{
	@FindBy(xpath = "//h3[text()='Points Store']")
	WebElement Points_Store_Title_text;
	
	@FindBy(xpath = "//i[@class='fas fa-solid fa-arrow-left desk-store-hide']")
	WebElement Arrow_Symbol;
	
	@FindBy(xpath = "//img[@class='d-none d-sm-block black-logo']")
	WebElement Raffolux_Logo;
	
	public Points_Store_UI()
	{
		PageFactory.initElements(this, driver);
	}
	
	public void Validate_raffolux_Logo_font_Size()
	{
		
	}
	
	public void Validate_raffolux_Logo_Height_And_Width_()
	{
		
	}
	
	public void Validate_raffolux_Logo_Font_Color()
	{
		
	}
	
	public void Validate_raffolux_Logo_Font_Color()
	{
		
	}

}
