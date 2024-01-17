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
public class HomePage extends BaseClass
{
	//WebElements present on the each of the raffle
	
		@FindBy(id ="8320")
		WebElement One_Of_The_Instant_Raffle;
		
		@FindBy(xpath ="(//img[@style='margin-bottom: 15px;'])[1]")
		WebElement Megajackpot_Text_On_Raffle;
		
		@FindBy(xpath ="//h3[text()='£50,000 Audi Q3 Treasure Hunt']")
		WebElement Title_Of_One_Of_The_Instant_Raffle;
		
		@FindBy(xpath ="(//h4[@class='primary-text'])[1]")
		WebElement Entry_Prize_Of_One_Of_The_Instant_Raffle;
		
		@FindBy(xpath ="(//div[@class='progress progress-square'])[1]")
		WebElement Ticket_Sold_Progress_Bar;
		
		@FindBy(xpath ="(//div[@class='progress-bar progress-square'])[1]")
		WebElement Ticket_Sold_Progress_Bar_Of_Sold_Tickets;
		
		@FindBy(xpath ="(//p[@class='entries_sold_subtitle text-always-white'])[1]")
		WebElement Number_Of_Tickets_Sold;
		
		@FindBy(xpath ="(//a[@class='btn-home bg-special text-always-black'])[1]")
		WebElement Enter_Now_Button_One_Of_The_Instant_Raffle;
		
		//-----------------------------------------------------------------------------------------------------------
		
		@FindBy(id="raffolux-logo")
		WebElement Logo;
		
		@FindBy(xpath="//a[text()='Winners']")
		WebElement Winners_Link;
		
		@FindBy(linkText = "My tickets")
		WebElement MyRaffles_Link;
		
		@FindBy(xpath="(//a[@class='cart-notification no-hover'])[1]")
		WebElement Cart_Notifications_logo;
		
		@FindBy(xpath="(//a[@class='mr-0 no-hover-effect'])[1]")
		WebElement User_profile_Logo;
		
		/*@FindBy(linkText="Charity")
		WebElement charityLink;
		
		@FindBy(linkText="Sign in")
		WebElement SignLink;
		
		@FindBy(linkText="Join Raffolux")
		WebElement JoinRaffoluxLink;*/
		
		@FindBy(xpath="/html/body/section[1]/div/div[3]/div/a/img")
		WebElement RatingImage;
		
		@FindBy(xpath="//*[@id=\"7859\"]")
		WebElement raffel1;
		
		@FindBy(id="7808")
		WebElement raffel2;
		
		@FindBy( xpath ="//*[@id=\"siema-banner-carousel\"]/div/div[2]/a/img")
		WebElement OffersBannerScetion;
		
		@FindBy(xpath = "/html/body/div[8]/section/div/div/div/div[1]")
		WebElement RatingSection;
		
		//WebElements present on the "Rating section" ---->These testcases are still pending


		@FindBy(id = "prizes-winners")
		WebElement PrizewinnerSection;
		
		@FindBy(xpath = "//section[@class='body-bg']")
		WebElement HowRaffelsWorksSection;
		
		@FindBy(id = "category-all")
		WebElement AllCategoryOption;
		
		@FindBy(id = "category-cash")
		WebElement CashCategoryOption;
		
		@FindBy(id = "category-tech")
		WebElement TechCategoryOption;
		
		@FindBy(id = "category-holidays")
		WebElement HolidayCategoryOption;
		
		@FindBy(id = "category-other")
		WebElement OtherCategoryOption;
		
		@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[1]/a/div/div[1]/img")
		WebElement One_Of_the_RaffelFromAll;
		
		@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[3]/a/div/div[1]/img")
		WebElement One_Of_the_RaffelFromCash;
		
		@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[7]/a/div/div[1]/img")
		WebElement One_Of_the_RaffelFromTech;
		
		@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[1]/a/div/div[1]/img")
		WebElement One_Of_the_RaffelFromHoliday;
		
		@FindBy(xpath = "//*[@id=\"latest-raffles\"]/div/div/div[33]/a/div/div[1]/img")
		WebElement One_Of_the_RaffelFromOther;
		
		@FindBy(xpath = "//div[@class='css-1aasxu6 ek650k30']")
		WebElement ChatBox;
		
		// web elements
		
		@FindBy(xpath = "//div[@class='py-1 py-md-4']")
		WebElement HorizontalScrollingBanner;
		
		@FindBy(xpath = "//img[@class='mx-2 gamble-image']")
		WebElement EighteenPlusLogo;
		
		@FindBy(xpath = "//div[text()='PLEASE GAMBLE RESPONSIBLY']")
		WebElement PleaseGambleResponsiblyText;
		
		@FindBy(xpath = "//a[text()='More Info']")
		WebElement MoreInfoLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[4]/div/div/img")
		WebElement PaymentCardOptions;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[4]/div/div/a/img")
		WebElement RatingImage1;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[4]/div/div/div/a[1]/img")
		WebElement GameCareLogo;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[4]/div/div/div/a[2]/img")
		WebElement BegambleLogo;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[1]/img")
		WebElement RaffoluxFooterLogo;
		
		@FindBy(xpath = "//*[@id=\"facebook-button\"]/img")
		WebElement FacebookSocialLogo;
		
		@FindBy(xpath = "//*[@id=\"twitter-button\"]/img")
		WebElement TwitterSocialLogo;
		
		@FindBy(xpath = "//*[@id=\"instagram-button\"]/img")
		WebElement InstagramSocialLogo;
		
		@FindBy(xpath = "//*[@id=\"linkin-button\"]/img")
		WebElement LinkedInSocialLogo;
		
		@FindBy(xpath = "//*[@id=\"total-raised\"]/div/div/div/div/div[12]/a/img")
		WebElement CharityInHorScrollBanner;
		
		//Website Options -------------------------------------------------------------
		
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[1]/h4")
		WebElement FooterWebsiteoption;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[1]/ul/li[1]/a")
		WebElement FooterMyraffelsLink;
		
		@FindBy(xpath = "//a[text()='My Charity']")
		WebElement FooterCharityLink;
		
		@FindBy(xpath = "//a[text()='News & Blog']")
		WebElement FooterNewsAndBlogLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[1]/ul/li[4]/a")
		WebElement FooterAccountLink;
		
		@FindBy(xpath = "//a[text()='Responsible play']")
		WebElement FooterResponsiblePlayLink;
		
		@FindBy(xpath = "//a[text()='Winners Gallery']")
		WebElement FooterWinnersGallaeryLink;
		
		//Footer info options
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[2]/h4")
		WebElement FooterInfoOption;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[2]/ul/li[1]/a")
		WebElement FooterHelpLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[2]/ul/li[2]/a")
		WebElement FooterTermsLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[2]/ul/li[3]/a")
		WebElement FooterPrivacyLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[2]/ul/li[4]/a")
		WebElement FooterWorkwithusLink;
		
		
		//Categories options-------------------------------------------------------------------------------------
		
		@FindBy(xpath = "(//h4[@class='text-always-white'])[4]")
		WebElement FooterCategoryOption;	
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[3]/ul/li[1]/a[2]")
		WebElement FooterCashLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[3]/ul/li[2]/a")
		WebElement FooterTechLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[3]/ul/li[3]/a")
		WebElement FooterCarsLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[3]/ul/li[4]/a")
		WebElement FooterHolidaysLink;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[3]/ul/li[5]/a")
		WebElement FooterIndulenceLink;
		
		//Contact options -------------------------------------------------------------------------------------------
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/h4")
		WebElement FooterContactOption;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/ul/li[1]")
		WebElement FooterContactAdressText;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/ul/li[2]/a")
		WebElement FooterContactNumber;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/ul/li[2]/a/i")
		WebElement FooterPhoneIcon;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/ul/li[3]/a")
		WebElement FooterContactEmail;
		
		@FindBy(xpath = "//*[@id=\"footer_id\"]/div/div[5]/div[2]/div[1]/div[4]/ul/li[3]/a/i")
		WebElement FooterEmailIcon;
		
		//ChatBox webelements
		
		@FindBy(xpath = "//div[@class='lc-1iursvv edvz03i1']")
		WebElement Chat_Window;
		
		//User profile window
		
		@FindBy(xpath = "//div[@class='sidebar-menu-content']")
		WebElement User_Profile_Window;
		
		//Personal info Link in User profile
		
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		// WebElements which are present Header part after login
		
		public WinnersPage Validate_Winners_Link() throws Throwable
		{
			Action.isDisplayed(driver, Winners_Link);
			return new WinnersPage();
		}
		
		public boolean Validate_MyRaffles_Link() throws Throwable
		{
			return Action.isDisplayed(driver, MyRaffles_Link);
		}
		
		public boolean Validate_Cart_Notifications_logo() throws Throwable
		{
			return Action.isDisplayed(driver, Cart_Notifications_logo);
		}
		
		public boolean Validate_User_profile_Logo() throws Throwable
		{
			return Action.isDisplayed(driver, User_profile_Logo);
		}
		
		public boolean Mouse_Hov_Over_Winners_Link() throws Throwable
		{
			return Action.mouseHoverByJavaScript(Winners_Link);
		}
		
		public boolean Mouse_Hov_Over_MyRaffles_Link() throws Throwable
		{
			return Action.mouseHoverByJavaScript(MyRaffles_Link);
		}
		
		public WinnersPage Click_On_Winners_Link() throws Throwable
		{
			Action.Click(driver, Winners_Link);
			return new WinnersPage();
		}
		
		public MyRafflesPage2 Click_On_MyRaffles_Link() throws Throwable
		{
			Action.JSClick(driver, MyRaffles_Link);
			
			return new MyRafflesPage2();
		}
		
		public boolean Click_On_Cart_Notifications_logo() throws Throwable
		{
			return Action.Click(driver, Cart_Notifications_logo);
		}
		
		public ProfilePop_up Click_On_User_profile_Logo() throws Throwable
		{
			Action.Click(driver, User_profile_Logo);
			return new ProfilePop_up();
		}
		
		// User action methods on the webelements which are present on each of the raffle
		
		public boolean Validate_One_Of_The_Instant_Raffle() throws Throwable
		{
			return Action.isDisplayed(driver, One_Of_The_Instant_Raffle);
		}
		
		public boolean Validate_Megajackpot_Text_On_Raffle() throws Throwable
		{
			return Action.isDisplayed(driver, Megajackpot_Text_On_Raffle);
		}
		
		public String Validate_Title_Of_One_Of_The_Instant_Raffle() throws Throwable
		{
			String text = Title_Of_One_Of_The_Instant_Raffle.getText();
			
			return text;
		}
		
		public String Validate_Entry_Prize_Of_One_Of_The_Instant_Raffle() throws Throwable
		{
			String text = Entry_Prize_Of_One_Of_The_Instant_Raffle.getText();
			
			return text;
		}
		
		public boolean Validate_Ticket_Sold_Progress_Bar() throws Throwable
		{
			return Action.isDisplayed(driver, Ticket_Sold_Progress_Bar);
		}
		
		public boolean Validate_Ticket_Sold_Progress_Bar_Of_Sold_Tickets() throws Throwable
		{
			return Action.isDisplayed(driver, Ticket_Sold_Progress_Bar_Of_Sold_Tickets);
		}
		
		public String Validate_Number_Of_Tickets_Sold() throws Throwable
		{
			String text = Number_Of_Tickets_Sold.getText();
			
			return text;
		}
		
		public boolean Validate_Enter_Now_Button_One_Of_The_Instant_Raffle() throws Throwable
		{
			return Action.isDisplayed(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
		}
		
		public RafflePageAfterLogin Clickon_Enter_Now_Button_One_Of_The_Instant_Raffle() throws Throwable
		{
			Action.scrollIntoView(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
			Thread.sleep(2000);
		    Action.JSClick(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
		    
		    return new RafflePageAfterLogin();
		}
		
		// -------------------------------------------------------------------------------------------
		
		
		public String ValidateInstantRaffle() throws Throwable
		{
			Action.scrollIntoView(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
			Action.isDisplayed(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
			String RaffleText = Enter_Now_Button_One_Of_The_Instant_Raffle.getText();
			return RaffleText;
		}
		
		//------------------------------------------------------------------------
		public RafflePageBeforeLogin ClickonInstantRaffle() throws Throwable
		{
			Action.scrollIntoView(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
			Thread.sleep(2000);
			Action.JSClick(driver, Enter_Now_Button_One_Of_The_Instant_Raffle);
			
			return new RafflePageBeforeLogin();
		}
		
		public boolean ValidateLogo() throws Throwable
		{
			return Action.isDisplayed(driver, Logo);
		}
		
		/*public boolean Validate_charityLink() throws Throwable
		{
			return Action.isDisplayed(driver, charityLink);
		}
		
		public boolean Validate_SignLink() throws Throwable
		{
			return Action.isDisplayed(driver, SignLink);
		}
		
		public boolean mouseHoverOnCharityLink() throws Throwable
		{
			return Action.mouseOverElement(charityLink);
		}
		
		public boolean mouseHoverOnSigninLink() throws Throwable
		{
			return Action.mouseOverElement(SignLink);
		}
		
		public CharityPage ClickOnCharityLink() throws Throwable
		{
			Action.Click(driver, charityLink);
			return new CharityPage();
		}
		
		public SignInPage ClickOnSigninLink() throws Throwable
		{
			Action.Click(driver, SignLink);
			return new SignInPage();
		}
		
		public SignUpPage ClickonRaffoluxLink() throws Throwable
		{
			
			Action.Click(driver, JoinRaffoluxLink);
			return new SignUpPage();
		}
		
		public boolean ValidateRaffoluxLink() throws Throwable
		{
			return Action.isDisplayed(driver, JoinRaffoluxLink);
			
		}
		
		public void mouseOveronRaffoluxLink() throws Throwable
		{
			Action.mouseOverElement(JoinRaffoluxLink);	
		}*/
		
		public boolean Validate_RatingImage() throws Throwable
		{
			return Action.isDisplayed(driver, RatingImage);
		}
		
		public void ClickOnRatingImage() throws Throwable
		{
			Action.Click(driver, RatingImage);	
		}
		
		public boolean ValidateRaffel1() throws Throwable
		{
			Action.scrollIntoView(driver, raffel1);
			return Action.isDisplayed(driver, raffel1);
		}
		
		public boolean ValidateRaffel2() throws Throwable
		{
			Action.scrollIntoView(driver, OtherCategoryOption);
			return Action.isDisplayed(driver, raffel2);
		}
		
		public boolean ValidateOfferBannerSection() throws Throwable
		{
			Action.scrollIntoView(driver, OtherCategoryOption);
			return Action.isDisplayed(driver, OffersBannerScetion);
		}
		
		public boolean ValidateRatingSection() throws Throwable
		{
			Action.scrollIntoView(driver, OtherCategoryOption);
			return Action.isDisplayed(driver, RatingSection);
		}
		
		//WebElements present on the "Rating section" 
		
		
		
		public boolean ValidatePrizewinnersSection() throws Throwable
		{
			Action.scrollIntoView(driver, PrizewinnerSection);
			return Action.isDisplayed(driver, PrizewinnerSection);
		}
		
		public boolean ValidateHowRaffelsWorksSection() throws Throwable
		{
			Action.scrollIntoView(driver, HowRaffelsWorksSection);
			return Action.isDisplayed(driver, HowRaffelsWorksSection);	
		}
		
		public boolean Validate_CashCategoryOption() throws Throwable
		{
			return Action.isDisplayed(driver, CashCategoryOption);
		}
		
		public boolean Validate_TechCategoryOption() throws Throwable
		{
			return Action.isDisplayed(driver, TechCategoryOption);
		}
		
		public boolean Validate_HolidayCategoryOption() throws Throwable
		{
			return Action.isDisplayed(driver, HolidayCategoryOption);
		}
		
		public boolean Validate_OtherCategoryOption() throws Throwable
		{
			return Action.isDisplayed(driver, OtherCategoryOption);
		}
		
		public boolean Validate_AllCategoryOption() throws Throwable
		{
			return Action.isDisplayed(driver, AllCategoryOption);
		}
		
		public boolean ClickOnCashOption() throws Throwable
		{
			Action.scrollIntoView(driver, CashCategoryOption);
			return Action.JSClick(driver, CashCategoryOption);
			//Action.Click(driver, CashCategoryOption);
		}
		
		public boolean ClickOnTechOption() throws Throwable
		{
			Action.scrollIntoView(driver, TechCategoryOption);
			return Action.JSClick(driver, TechCategoryOption);
			//Action.Click(driver, TechCategoryOption);
		}
		
		public boolean ClickOnHolidayOption() throws Throwable
		{
			Action.scrollIntoView(driver, HolidayCategoryOption);
			return Action.JSClick(driver, HolidayCategoryOption);
			//Action.Click(driver, HolidayCategoryOption);
		}
		
		public boolean ClickOnOtherOption() throws Throwable
		{
			Action.scrollIntoView(driver, OtherCategoryOption);
			return Action.JSClick(driver, OtherCategoryOption);
			//Action.Click(driver, OtherCategoryOption);
		}
		
		public boolean ClickonAllOption() throws Throwable
		{
			Action.scrollIntoView(driver, AllCategoryOption);
			return Action.JSClick(driver, AllCategoryOption);
			//return Action.isDisplayed(driver, AllCategoryOption);
		}
		
		
		public void mouseHoverOnChatbox() throws Throwable
		{
			Action.scrollIntoView(driver, ChatBox);
			Action.mouseOverElement(ChatBox);
		}
		
		public void ClickOnChatbox() throws Throwable
		{
			//Action.scrollIntoView(driver, ChatBox);
			Action.JSClick(driver, ChatBox);
			Thread.sleep(2000);
			//Action.Click(driver, ChatBox);
		}
		
		public void ClickOnRatingSection() throws Throwable
		{
			Action.scrollIntoView(driver, RatingSection);
			Action.JSClick(driver, RatingSection);
			//Action.Click(driver, RatingSection);
		}
		//--------------------------------------------------------------------------------------------
		public boolean ValidateHorScrollBar() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, HorizontalScrollingBanner);
		}
		
		public boolean ValidateEighteenPlusLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, EighteenPlusLogo);
		}
		
		public boolean ValidatePleaseGambleResponsiblyText() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, PleaseGambleResponsiblyText);
		}
		
		public boolean Validate_MoreInfoLink() throws Throwable
		{
			Action.scrollPageDown(driver);
			return Action.isDisplayed(driver, MoreInfoLink);
		}
		
		public boolean ClickonMoreInfoLink() throws Throwable
		{
			Thread.sleep(2000);
			return Action.JSClick(driver, MoreInfoLink);
		}
		
		public void ValidatePaymentCardOptions() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.isDisplayed(driver, PaymentCardOptions);
		}
		
		public void ValidatefooterRatingImage1() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.isDisplayed(driver, RatingImage1);
		}
		
		public boolean ValidateRatingImage1() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, RatingImage1);
		}
		
		public void ClickonRatingImage1() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.Click(driver, RatingImage1);
		}
		
		public void ValidateGameCareLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.isDisplayed(driver, GameCareLogo);	
		}
		
		public void ClickonGameCareLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.Click(driver, GameCareLogo);
		}
		
		public void ValidateBegambleLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.isDisplayed(driver, BegambleLogo);
		}
		
		public void ClickonBegambleLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.Click(driver, BegambleLogo);
		}
		
		public boolean ValidateRaffoluxFooterLogo() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, RaffoluxFooterLogo);
		}
		
		public boolean ValidateFacebookSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, FacebookSocialLogo);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FacebookSocialLogo);
		}
		
		public void ClickonFacebookSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, FacebookSocialLogo);
			Thread.sleep(2000);
			Action.Click(driver, FacebookSocialLogo);
		}
		
		public void ClickonTwitterSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, TwitterSocialLogo);
			Thread.sleep(2000);
			Action.Click(driver, TwitterSocialLogo);
		}
		
		public boolean ValidateTwitterSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, TwitterSocialLogo);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, TwitterSocialLogo);
		}
		
		public void ClickonInstagramSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, InstagramSocialLogo);
			Thread.sleep(2000);
			Action.Click(driver, InstagramSocialLogo);
		}
		
		public boolean ValidateInstagramSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, InstagramSocialLogo);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, InstagramSocialLogo);
		}
		
		public void ClickonLinkedInSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, LinkedInSocialLogo);
			Thread.sleep(2000);
			Action.Click(driver, LinkedInSocialLogo);
		}
		
		public boolean ValidateLinkedInSocialLogo() throws Throwable
		{
			Action.scrollIntoView(driver, LinkedInSocialLogo);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, LinkedInSocialLogo);
		}
		
		
		//FooterWebsiteoption   --------------------------------------------------------------------------------
		public boolean ValidateFooterWebsiteoption() throws Throwable
		{
			Action.scrollIntoView(driver, FooterWebsiteoption);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterWebsiteoption);
		}
		
		public boolean ValidateFooterMyraffelsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterMyraffelsLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterMyraffelsLink);
		}
		
		public void ClickonFooterMyraffelsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterMyraffelsLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterMyraffelsLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterCharityLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCharityLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterCharityLink);
		}
		
		public CharityPageAfterLogin ClickonFooterCharityLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCharityLink);
			Thread.sleep(2000);
			Action.JSClick(driver, FooterCharityLink);
			return new CharityPageAfterLogin();
		}
		
		public boolean ValidateFooterNewsAndBlogLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterNewsAndBlogLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterNewsAndBlogLink);
		}
		
		public News_And_Blog_Page ClickonFooterNewsAndBlogLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterNewsAndBlogLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterNewsAndBlogLink);
			Thread.sleep(2000);
			
			return new News_And_Blog_Page();
		}
		
		public boolean ValidateFooterAccountLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterAccountLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterAccountLink);
		}
		
		public void ClickonFooterAccountLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterAccountLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterAccountLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterResponsiblePlayLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterResponsiblePlayLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterResponsiblePlayLink);
		
		}
		
		public ResponsiblePlay_And_WellBeing_Page ClickonFooterResponsiblePlayLink() throws Throwable
		{
			Action.scrollPageDown(driver);
			Thread.sleep(2000);
			Action.Click(driver, FooterResponsiblePlayLink);
			Thread.sleep(2000);
			return new ResponsiblePlay_And_WellBeing_Page();
		}
		
		public boolean ValidateFooterWinnersGallaeryLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterWinnersGallaeryLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterWinnersGallaeryLink);
		}
		
		public Winners_Gallary_Page ClickonFooterWinnersGallaeryLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterWinnersGallaeryLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterWinnersGallaeryLink);
			Thread.sleep(2000);
			return new Winners_Gallary_Page();
		}
		
		// Footer info option --------------------------------------------------------------------------------------
		
		public boolean ValidateFooterInfoOption() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterInfoOption);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterInfoOption);
			
		}
		
		public boolean ValidateFooterHelpLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterHelpLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterHelpLink);
		}
		
		public HowCanWe_Help_YouPage ClickonFooterHelpLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterHelpLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterHelpLink);
			Thread.sleep(2000);
			
			return new HowCanWe_Help_YouPage();
		}
		
		public boolean ValidateFooterTermsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterTermsLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterTermsLink);
		}
		
		public void ClickonFooterTermsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterTermsLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterTermsLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterPrivacyLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterPrivacyLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterPrivacyLink);
		}
		
		public void ClickonFooterPrivacyLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterPrivacyLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterPrivacyLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterWorkwithusLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterWorkwithusLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterWorkwithusLink);
		}
		
		public void ClickonFooterWorkwithusLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterWorkwithusLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterWorkwithusLink);
			Thread.sleep(2000);
		}
		
		// FooterCategoryOptions   ---------------------------------------------------------------------------------
		public boolean ValidateFooterCategoryOption() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCategoryOption);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterCategoryOption);
		}
		
		public boolean ValidateFooterCashLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCashLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterCashLink);
		}
		
		public void ClickonFooterCashLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCashLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterCashLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterTechLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterTechLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterTechLink);
		}
		
		public void ClickonFooterTechLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterTechLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterTechLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterCarsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCarsLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterCarsLink);
		}
		
		public void ClickonFooterCarsLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterCarsLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterCarsLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterHolidaysLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterHolidaysLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterHolidaysLink);
		}
		
		public void ClickonFooterHolidaysLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterHolidaysLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterHolidaysLink);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterIndulenceLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterIndulenceLink);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterIndulenceLink);
		}
		
		public void ClickonFooterIndulenceLink() throws Throwable
		{
			Action.scrollIntoView(driver, FooterIndulenceLink);
			Thread.sleep(2000);
			Action.Click(driver, FooterIndulenceLink);
			Thread.sleep(2000);
		}
		
		//Contact options ----------------------------------------------------------------------------
		public boolean ValidateFooterContactOption() throws Throwable
		{
			Action.scrollIntoView(driver, FooterContactOption);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterContactOption);
		}
		
		public boolean ValidateFooterContactAdressText() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterContactAdressText);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterContactAdressText);
		}
		
		public boolean ValidateFooterContactNumber() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterContactNumber);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterContactNumber);
			
		}
		
		public void ClickonFooterContactNumber() throws Throwable
		{
			Action.scrollIntoView(driver, FooterContactNumber);
			Thread.sleep(2000);
			Action.Click(driver, FooterContactNumber);
			Thread.sleep(2000);
		}
		
		public boolean ValidateFooterPhoneIcon() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterPhoneIcon);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterPhoneIcon);
			
		}
		
		/*public void ClickonFooterPhoneIcon() throws Throwable
		{
			Action.scrollIntoView(driver, FooterPhoneIcon);
			Thread.sleep(2000);
			Action.Click(driver, FooterPhoneIcon);
			Thread.sleep(2000);
		}*/
		
		public boolean ValidateFooterContactEmail() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterContactEmail);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterContactEmail);
		}
		
		public boolean ClickonFooterContactEmail() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterContactEmail);
			Thread.sleep(2000);
			return Action.Click(driver, FooterContactEmail);
			
		}
		
		public boolean ValidateFooterEmailIcon() throws Throwable
		{
			Thread.sleep(2000);
			Action.scrollIntoView(driver, FooterEmailIcon);
			Thread.sleep(2000);
			return Action.isDisplayed(driver, FooterEmailIcon);
		}
		
		/*public void ClickonFooterEmailIcon() throws Throwable
		{
			Action.scrollIntoView(driver, FooterEmailIcon);
			Thread.sleep(2000);
			Action.Click(driver, FooterEmailIcon);
			Thread.sleep(2000);
		}*/
		
		// User action methods on Chat_Window 
		public boolean Validate_Chat_Window() throws Throwable
		{
			return Action.isDisplayed(driver, Chat_Window);
		}
		
		//User action methods on User_Profile_Window
		
		public boolean Validate_User_Profile_Window() throws Throwable
		{
			return Action.isDisplayed(driver, User_Profile_Window);
		}










	}
