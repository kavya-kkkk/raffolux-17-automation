/**
 * 
 */
package practice_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author hp
 *
 */
public class SignIn_Page 
{
	public static WebDriver driver;
	
	@FindBy(id="emailAddress")
	WebElement Email_TextField;
	
	@FindBy(id="Password")
	WebElement Password_TextField;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	public SignIn_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SignIn(String email, String pswd) throws InterruptedException
	{
		Email_TextField.sendKeys(email);
		Thread.sleep(2000);
		Password_TextField.sendKeys(pswd);
		Thread.sleep(2000);
		btnLogin.click();
	}
}
