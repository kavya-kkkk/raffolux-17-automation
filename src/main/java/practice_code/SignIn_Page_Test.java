/**
 * 
 */
package practice_code;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class SignIn_Page_Test extends SignIn_Page
{
	@BeforeTest
	public void LaunchApp() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		 
	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://raffolux.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//*[@id=\"mainMenuContent\"]/ul/li[2]/a")).click();
	}
	
	@Test
	public void SignIn_Test() throws InterruptedException
	{
		SignIn_Page sign = new SignIn_Page();
		
		sign.SignIn("Dharmaveera.Devaputra@rhibhus.com", "Dharma@8103");
				
	}

}
