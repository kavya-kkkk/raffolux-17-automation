/**
 * 
 */
package practice_code;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raffolux.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class Google_Suggestions_Print extends BaseClass{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\Logo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Virat");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
		
		System.out.println("Total no of suggestions in searchbox :: ===> " +list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
