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
public class Winners_Gallary_Page extends BaseClass
{
	@FindBy(xpath = "//span[text()='Winners']")
	WebElement Winners_Title_Text;
	
	@FindBy(xpath = "(//i[@aria-hidden='true'])[10]")
	WebElement Winning_Cup_Symbol;
	
	@FindBy(xpath = "//div[@class='col-sm-12 infinite-item']")
	WebElement List_Of_Winners_;
	
	@FindBy(xpath = "//*[@id=\"winners\"]/div[1]/div/div/div/div[1]")
	WebElement One_Of_The_Winner_From_The_List_Of_Winners_Card;
	
	//@FindBy(xpath = "(//div[@class='modal-body text-center'])[1]")
	//WebElement Image_Of_The_Winner_Of_One_OF_The_Winner;
	
	@FindBy(xpath = "//h2[text()='Makita Cordless 4-Piece Tool Set']")
	WebElement Name_Of_The_Prize_On_One_of_The_Winners;
	
	@FindBy(xpath = "(//p[text()='Won by'])[1]")
	WebElement WonBy_Text_On_One_of_The_WinnerS;
	
	@FindBy(xpath = "(//p[text()='Winning ticket'])[1]")
	WebElement Winning_Ticket_Text_On_One_of_The_Winners;
	
	@FindBy(xpath = "//h2[text()='231']")
	WebElement Winning_Ticket_Number_On_One_of_The_Winners;
	
	@FindBy(xpath = "(//div[@class='modal-content'])[1]")
	WebElement One_Of_The_Winner_Card;
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
	WebElement One_Of_The_Winner_Card_Remove_Symbol;
	
	@FindBy(xpath = "(//div[@class='prize-winners-modal-top'])[1]")
	WebElement Image_Of__One_of_The_Winners_Card;
	
	@FindBy(xpath = "//h3[text()='Makita Cordless 4-Piece Tool Set']")
	WebElement Name_Of_One_of_The_Winning_Prize;
	
	@FindBy(xpath = "(//p[text()='won by'])[1]")
	WebElement WonBy_Text_Of_One_of_The_Winning_Prize;
	
	@FindBy(xpath = "(//div[@class='ticket-shape-outline-white'])[1]")
	WebElement Ticket_Shape_Outline_of_One_of_The_Winning_Ticket;
	
	@FindBy(xpath = "//span[text()='231']")
	WebElement Ticket_Number_of_One_of_The_Winner;
	
	@FindBy(xpath = "(//a[text()='draw details'])[1]")
	WebElement Draw_Detalis_Link_of_One_of_The_Winner;
	
	@FindBy(xpath = "(//a[@class = 'prize-winners-modal-button'])[2]")
	WebElement Winners_Gallery_Link_of_One_of_The_Winner;
	
	//WebElements which are present on the "Draw details" section
	
	@FindBy(xpath = "//h2[text()='Jane M']")
	WebElement Name_Of_The_Prize_Winner;
	
	@FindBy(xpath = "//h4[text()='Won the \"Makita Cordless 4-Piece Tool Set\" raffle with the lucky ticket number']")
	WebElement Title_Of_The_Prize;
	
	@FindBy(xpath = "//h4[text()='231']")
	WebElement Ticket_Number_Of_The_Prize_Winner;
	
	@FindBy(xpath = "//img[@width='240']")
	WebElement Image_Of_Winning_Prize;
	
	@FindBy(xpath = "//p[@class='mb-1 align-items-baseline mt-4']")
	WebElement This_Draw_Was_Provided_Verified_Text;
	
	@FindBy(xpath = "//img[@alt='Random.org Logo']")
	WebElement Random_org_Logo;
	
	@FindBy(xpath = "//a[text()='Draw details']")
	WebElement Draw_Details_Link;
	
	@FindBy(xpath = "(//div[@class='col-md-12'])[1]")
	WebElement Draw_Details_Table;
	
	@FindBy(xpath = "(//span[contains(text(),'You may also be interested in')])[1]")
	WebElement You_May_also_Be_Interested_In_Text;
	
	@FindBy(xpath = "(//div[@style='border-radius: 8px;'])[1]")
	WebElement One_Of_The_Raffle_from_You_May_also_Be_Interested_In;
	
	
	
	//Constructor inorder to initialize all the above declared webElements...
	public Winners_Gallary_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String Validate_Winners_Title_Text()
	{
		String text = Winners_Title_Text.getText();
		return text;
	}
	
	
	public boolean Validate_Winning_Cup_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, Winning_Cup_Symbol);
	}
	
	
	public boolean Validate_List_Of_Winners_() throws Throwable
	{
		return Action.isDisplayed(driver, List_Of_Winners_);
	}
	
	public void mouse_hov_Over_One_Of_The_Winner_From_The_List_Of_Winners_Card() throws Throwable
	{
		Action.mouseOverElement(One_Of_The_Winner_From_The_List_Of_Winners_Card);
	}
	
	
	public boolean Validate_One_Of_The_Winner_From_The_List_Of_Winners_() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Winner_From_The_List_Of_Winners_Card);
	}
	
	
	public void Clickon_One_Of_The_Winner_From_The_List_Of_Winners_Card() throws Throwable
	{
		Action.JSClick(driver, One_Of_The_Winner_From_The_List_Of_Winners_Card);
	}
	
	
	public String Validate_Name_Of_The_Prize_On_One_of_The_Winners()
	{
		String text = Name_Of_The_Prize_On_One_of_The_Winners.getText();
		return text;
	}
	
	
	public String Validate_WonBy_Text_On_One_of_The_WinnerS()
	{
		String text = WonBy_Text_On_One_of_The_WinnerS.getText();
		return text;
	}
	
	
	public String Validate_Winning_Ticket_Text_On_One_of_The_Winner()
	{
		String text = Winning_Ticket_Text_On_One_of_The_Winners.getText();
		return text;
	}
	
	
	public String Validate_Winning_Ticket_Number_On_One_of_The_Winners()
	{
		String text = Winning_Ticket_Number_On_One_of_The_Winners.getText();
		return text;
	}
	
	
	public boolean Validate_One_Of_The_Winner_Card() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Winner_Card);
	}
	
	
	public boolean Validate_One_Of_The_Winner_Card_Remove_Symbol() throws Throwable
	{
		return Action.isDisplayed(driver, One_Of_The_Winner_Card_Remove_Symbol);
	}
	
	
	public void Clickon_One_Of_The_Winner_Card_Remove_Symbol() throws Throwable
	{
		Action.Click(driver, One_Of_The_Winner_Card_Remove_Symbol);
	}
	
	
	public boolean Validate_Image_Of__One_of_The_Winners() throws Throwable
	{
		return Action.isDisplayed(driver, Image_Of__One_of_The_Winners_Card);
	}
	
	
	/*public boolean Validate_Image_Of__One_of_The_Winners() throws Throwable
	{
		return Action.isDisplayed(driver, Image_Of__One_of_The_Winners);
	}*/
	
	
	public String Validate_Name_Of_One_of_The_Winning_Prize()
	{
		String text = Name_Of_One_of_The_Winning_Prize.getText();
		return text;
	}
	
	
	public String Validate_WonBy_Text_Of_One_of_The_Winning_Prize()
	{
		String text = WonBy_Text_Of_One_of_The_Winning_Prize.getText();
		return text;
	}
	
	
	public boolean Validate_Ticket_Shape_Outline_of_One_of_The_Winning_Ticket() throws Throwable
	{
		return Action.isDisplayed(driver, Ticket_Shape_Outline_of_One_of_The_Winning_Ticket);
	}
	
	
	public String Validate_Ticket_Number_of_One_of_The_Winning_Prize()
	{
		String text = Ticket_Number_of_One_of_The_Winner.getText();
		return text;
	}
	
	
	public boolean Validate_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable
	{
		return Action.isDisplayed(driver, Draw_Detalis_Link_of_One_of_The_Winner);
	}
	
	
	public void Clickon_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable
	{
		Action.Click(driver, Draw_Detalis_Link_of_One_of_The_Winner);
	}
	
	
	public boolean mouse_hov_Over_Draw_Detalis_Link_of_One_of_The_Winner() throws Throwable
	{
		return Action.mouseOverElement(Draw_Detalis_Link_of_One_of_The_Winner);
	}
	
	
	public boolean Validate_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable
	{
		return Action.isDisplayed(driver, Winners_Gallery_Link_of_One_of_The_Winner);
	}
	
	
	public void Clickon_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable
	{
		Action.Click(driver, Winners_Gallery_Link_of_One_of_The_Winner);
	}
	
	
	public boolean mouse_hov_Over_Winners_Gallery_Link_of_One_of_The_Winner() throws Throwable
	{
		return Action.mouseOverElement(Winners_Gallery_Link_of_One_of_The_Winner);
	}
}
