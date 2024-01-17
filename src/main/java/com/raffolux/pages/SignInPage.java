/**
 * 
 */
package com.raffolux.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class SignInPage extends BaseClass
{
	@FindBy(id = "raffolux-logo")
	WebElement RaffoluxLogo;
	
	@FindBy(linkText="Charity")
	WebElement charityLink;
	
	@FindBy(linkText="Sign in")
	WebElement SignLink;
	
	@FindBy(linkText="Join Raffolux")
	WebElement JoinRaffoluxLink;
	
	@FindBy(xpath ="//h1[text()='Sign in']")
	WebElement SignInTitle;
	
	@FindBy(xpath ="//h4[text()='Not a member? ']")
	WebElement NotAMemberText;
	
	@FindBy(linkText ="Sign up")
	WebElement SignUpLink;
	
	@FindBy(id ="emailAddress")
	WebElement Username;
	
	@FindBy(id ="Password")
	WebElement Password;
	
	@FindBy(id ="btnLogin")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//p[contains(text(),'Forgotten your password?')]")
	WebElement ForgotYourPasswordText;
	
	@FindBy(linkText ="Reset Password")
	WebElement ResetPasswordLink;
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div/div[2]/p")
	WebElement OrSignInViaText;
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div/div[2]/span[1]/a/i[2]")
	WebElement SignInThroughFacebookLogo;
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div/div[2]/span[2]/a/i[2]")
	WebElement SignInThroughTwitterLogo;
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div/div[2]/span[3]/a/i[2]")
	WebElement SignInThroughGoogleLogo;
	//Login Through Social media
	//Facebook
	
	public SignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public boolean ValidateRaffoluxLogo() throws Throwable
	{
		return Action.isDisplayed(driver, RaffoluxLogo);
	}
	
	public boolean ValidatecharityLink() throws Throwable
	{
		return Action.isDisplayed(driver, charityLink);
		
	}
	
	public boolean ValidateSignLink() throws Throwable
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
	
	public boolean ValidateRaffoluxLink() throws Throwable
	{
		return Action.isDisplayed(driver, JoinRaffoluxLink);
		
	}
	
	public boolean mouseOveronRaffoluxLink() throws Throwable
	{
		return Action.mouseOverElement(JoinRaffoluxLink);	
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
		
		Action.JSClick(driver, JoinRaffoluxLink);
		return new SignUpPage();
	}
	
	public boolean ValidateSignInTitle() throws Throwable
	{
		//System.out.println(SignInTitle.getText());
		 return Action.isDisplayed(driver, SignInTitle);
    }
	
	public boolean ValidateNotAMemberText() throws Throwable
	{
		return Action.isDisplayed(driver, NotAMemberText);
    }
	
	public boolean MousehovOverSignUpLink() throws Throwable
	{
		return Action.mouseOverElement(SignUpLink);
    }
	
	public boolean ValidateSignUpLink() throws Throwable
	{
		System.out.println(SignUpLink.getText());
		return Action.isDisplayed(driver, SignUpLink);
    }
	
	public SignUpPage ClickonSignUpLink() throws Throwable
	{
		Action.Click(driver, SignUpLink);
		return new SignUpPage();
    }
	
	public HomePage Signin(String uname, String pswd) throws Throwable
	{
		Action.type(Username, uname);
		Thread.sleep(2000);
		Action.type(Password, pswd);
		Thread.sleep(2000);
		Action.Click(driver, LoginBtn);
		
		return new HomePage();
	}
	
	public boolean ValidateForgotYourPasswordText() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Forgotten your password?')]")));
		Action.scrollIntoView(driver, ForgotYourPasswordText);
		System.out.println(ForgotYourPasswordText.getText());
		return Action.isDisplayed(driver, ForgotYourPasswordText); 
	}
	
	public boolean ValidateResetPasswordLink() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Reset Password")));
		Action.scrollIntoView(driver, ResetPasswordLink);
		return Action.isDisplayed(driver, ResetPasswordLink);
	}
	
	public boolean MousehovOverResetPasswordLink() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Reset Password")));
		Action.scrollIntoView(driver, ResetPasswordLink);
		return Action.mouseOverElement(ResetPasswordLink);
	}
	
	public void ClickonResetPasswordLink() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ResetPasswordLink));
		Action.scrollIntoView(driver, ResetPasswordLink);
		Action.Click(driver, ResetPasswordLink);
	}
	
	public boolean ValiadateOrSignInViaText() throws Throwable
	{
		System.out.println(OrSignInViaText.getText());
		return Action.isDisplayed(driver, OrSignInViaText);
	}
	
	public boolean ValidateSignInThroughFacebookLogo() throws Throwable
	{
		return Action.isDisplayed(driver, SignInThroughFacebookLogo);
	}
	
	public boolean ValidateSignInThroughTwitterLogo() throws Throwable
	{
		return Action.isDisplayed(driver, SignInThroughTwitterLogo);	
	}
	
	public boolean ValidateSignInThroughGoogleLogo() throws Throwable
	{
		return Action.isDisplayed(driver, SignInThroughGoogleLogo);
	}
	
	public void ClickonSignInThroughFacebookLogo() throws Throwable
	{
		Action.Click(driver, SignInThroughFacebookLogo);
	}
	
	public void ClickonSignInThroughTwitterLogo() throws Throwable
	{
		Action.Click(driver, SignInThroughTwitterLogo);	
	}
	
	public void ClickonSignInThroughGoogleLogo() throws Throwable
	{
		Action.Click(driver, SignInThroughGoogleLogo);
	}
	
	public void SignInThroughFacebook() throws Exception
	{
		Action.Click(driver, SignInThroughFacebookLogo);
		Thread.sleep(2000);
		
	}
	
	public void SigninThroughTwitter() throws Exception
	{
		Action.Click(driver, SignInThroughTwitterLogo);
		Thread.sleep(2000);
	}
	
	public void SigninThroughGoogle() throws Exception
	{
		Action.Click(driver, SignInThroughGoogleLogo);
		Thread.sleep(2000);
	}
	
	
	
}
