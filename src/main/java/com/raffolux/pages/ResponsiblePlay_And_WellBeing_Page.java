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
public class ResponsiblePlay_And_WellBeing_Page extends BaseClass
{
	@FindBy(xpath = "//h1[text()='Responsible Play & Wellbeing']")
	WebElement ResponsiblePlay_And_WellBeing_Page_Title;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div")
	WebElement ResponsiblePlay_And_WellBeing_Page_Text_Block;
	
	@FindBy(xpath = "//h1[text()='Wellbeing']")
	WebElement WellBeing_Text;
	
	@FindBy(xpath = "/html/body/section/div/div[4]/div")
	WebElement WellBeing_Text_Block;
	
	@FindBy(xpath = "//a[text()='GambleAware']")
	WebElement Gamble_Aware_Link;
	
	@FindBy(xpath = "//a[text()='GamCare']")
	WebElement Gam_Care_Link;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[2]/li[1]/a")
	WebElement Support_At_Raffolux_Com_Link;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[1]/a[1]")
	WebElement Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[1]/a[2]")
	WebElement Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[2]/a")
	WebElement Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section;
	
	@FindBy(xpath = "//a[text()=' link ']")
	WebElement Gambling_Commission_Website_Link;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[5]/a[1]")
	WebElement GAMSHOT_Link1;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[5]/a[2]")
	WebElement GAMSHOT_Link2;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/div/ul[3]/li[5]/a[3]")
	WebElement GAMSHOT_Link3;
	
	@FindBy(xpath = "/html/body/header/div/div[1]/a/img")
	WebElement Gambling_Commission_Text;
	
	@FindBy(xpath = "//*[@id=\"block-begambleaware-branding\"]/a/img")
	WebElement Be_Gamble_Aware_Logo;
	
	@FindBy(xpath = "//h2[text()='Our Cookies']")
	WebElement GAMSTOP_Accept_Button;
	
	
	
	public ResponsiblePlay_And_WellBeing_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateGAMSTOP_Accept_Button() throws Throwable
	{
		return Action.isDisplayed(driver, GAMSTOP_Accept_Button);
	}
	
	public boolean ValidatePageTitle() throws Throwable
	{
		return Action.isDisplayed(driver, ResponsiblePlay_And_WellBeing_Page_Title);
	}
	
	public boolean ValidateBe_Gamble_Aware_Logo() throws Throwable
	{
		return Action.isDisplayed(driver, Be_Gamble_Aware_Logo);
	}
	
	public String ValidateResponsiblePlay_And_WellBeing_Page_Title()
	{
		String text = ResponsiblePlay_And_WellBeing_Page_Title.getText();
		return text;
	}
	
	public boolean ValidateResponsiblePlay_And_WellBeing_Page_Text_Block() throws Throwable
	{
		return Action.isDisplayed(driver, ResponsiblePlay_And_WellBeing_Page_Text_Block);
	}
	public String ValidateResponsiblePlay_And_WellBeing_Page_Text_Block1() throws Throwable
	{
		
		String text = ResponsiblePlay_And_WellBeing_Page_Text_Block.getText();
		return text;
	}
	
	public String ValidateWellBeing_Text()
	{
		String text = WellBeing_Text.getText();
		return text;
	}
	
	public boolean ValidateWellBeing_Text_Block1() throws Throwable     //To check whether WellBeing_Text_Block is displayed or not
	{
		return Action.isDisplayed(driver, WellBeing_Text_Block);
	}
	
	public String ValidateWellBeing_Text_Block()                     //To Print the WellBeing_Text_Block in the report as well console
	{
		String text = WellBeing_Text_Block.getText();
		return text;
	}
	//
	public void mouse_Hov_Over_Gamble_Aware_Link() throws Throwable
	{
		Action.mouseOverElement(Gamble_Aware_Link);
	}
	
	public boolean ValidateGamble_Aware_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Gamble_Aware_Link);
	}
	
	public void ClickonGamble_Aware_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Gamble_Aware_Link);
		Thread.sleep(2000);
		Action.JSClick(driver, Gamble_Aware_Link);
	}
	//
	public void mouse_Hov_Over_Gam_Care_Link() throws Throwable
	{
		Action.mouseOverElement(Gam_Care_Link);
	}
	
	public boolean ValidateGam_Care_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Gam_Care_Link);
	}
	
	public void ClickonGam_Care_Link() throws Throwable
	{
		Action.scrollIntoView(driver, Gam_Care_Link);
		Thread.sleep(2000);
		Action.JSClick(driver, Gam_Care_Link);
	}
	//
	
	public void mouse_Hov_Over_Support_At_Raffolux_Com_Link() throws Throwable
	{
		Action.mouseOverElement(Support_At_Raffolux_Com_Link);
	}
	
	public boolean ValidateSupport_At_Raffolux_Com_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Support_At_Raffolux_Com_Link);
	}
	
	public void ClickonSupport_At_Raffolux_Com_Link() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, Support_At_Raffolux_Com_Link);
		Thread.sleep(2000);
		Action.ClickElementByJS(Support_At_Raffolux_Com_Link, driver);
	}
	
	//
	
	public void mouse_Hov_Over_Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.mouseOverElement(Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public boolean ValidateGamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		return Action.isDisplayed(driver, Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public void ClickonGamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section);
		Thread.sleep(2000);
		Action.JSClick(driver, Gamble_Aware_link_Under_More_Actions_That_You_Can_Take_Section);
		
	}
	
	//
	
	public void mouse_Hov_Over_Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.mouseOverElement(Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public boolean ValidateGamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		return Action.isDisplayed(driver, Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public void ClickonGamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
		Thread.sleep(2000);
		Action.JSClick(driver, Gamble_Aware_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
		Thread.sleep(5000);
	}
	//Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section
	
	public void mouse_Hov_Over_Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.mouseOverElement(Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public boolean ValidateGam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		return Action.isDisplayed(driver, Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
	}
	
	public void ClickonGam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
		Thread.sleep(2000);
		Action.JSClick(driver, Gam_Care_Url_Link_Under_More_Actions_That_You_Can_Take_Section);
		Thread.sleep(5000);
	}
	
	//
	public void mouse_Hov_Over_Gambling_Commission_Website_Link() throws Throwable
	{
		Action.mouseOverElement(Gambling_Commission_Website_Link);
	}
	
	public boolean ValidateGambling_Commission_Website_Link() throws Throwable
	{
		return Action.isDisplayed(driver, Gambling_Commission_Website_Link);
	}
	
	public void ClickonGambling_Commission_Website_Link() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, Gambling_Commission_Website_Link);
		Thread.sleep(2000);
		Action.JSClick(driver, Gambling_Commission_Website_Link);
		Thread.sleep(5000);
	}
	
	public boolean ValidateGambling_Commission_Text() throws Throwable
	{
		return Action.isDisplayed(driver, Gambling_Commission_Text);
	}
	
	//Gambling_Commission_Text
	
	public void mouse_Hov_Over_GAMSHOT_Link1() throws Throwable
	{
		Action.mouseOverElement(GAMSHOT_Link1);
	}
	
	public boolean ValidateGAMSHOT_Link1() throws Throwable
	{
		return Action.isDisplayed(driver, GAMSHOT_Link1);
	}
	
	public void ClickonGAMSHOT_Link1() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, GAMSHOT_Link1);
		Thread.sleep(2000);
		Action.JSClick(driver, GAMSHOT_Link1);
	}
	//
	
	public void mouse_Hov_Over_GAMSHOT_Link2() throws Throwable
	{
		Action.mouseOverElement(GAMSHOT_Link2);
	}
	
	public boolean ValidateGAMSHOT_Link2() throws Throwable
	{
		return Action.isDisplayed(driver, GAMSHOT_Link2);
	}
	
	public void ClickonGAMSHOT_Link2() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, GAMSHOT_Link2);
		Thread.sleep(2000);
		Action.JSClick(driver, GAMSHOT_Link2);
	}
	//
	
	public void mouse_Hov_Over_GAMSHOT_Link3() throws Throwable
	{
		Action.mouseOverElement(GAMSHOT_Link3);
	}
	
	public boolean ValidateGAMSHOT_Link3() throws Throwable
	{
		return Action.isDisplayed(driver, GAMSHOT_Link3);
	}
	
	public void ClickonGAMSHOT_Link3() throws Throwable
	{
		Action.scrollByVisibilityOfElement(driver, GAMSHOT_Link3);
		Thread.sleep(2000);
		Action.JSClick(driver, GAMSHOT_Link3);
	}
	//
}
