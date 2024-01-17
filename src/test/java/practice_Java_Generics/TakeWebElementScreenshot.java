/**
 * 
 */
package practice_Java_Generics;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

/**
 * @author hp
 *
 */
public class TakeWebElementScreenshot 
{
	public static void main(String args[]) throws Exception
	   {
		   WebDriverManager.firefoxdriver().setup();
	       WebDriver driver = new FirefoxDriver();
	  
	       driver.get("https://www.google.com/");
	       Thread.sleep(2000);
	  
	       WebElement webElement = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	  
	       Screenshot screenshot = new AShot().takeScreenshot(driver,webElement);
	       try
	       {
	    	   
		       ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"\\Images\\LogoImage.png"));
	       }
	       catch(Exception e)
	       {
	    	   System.out.println(e.getStackTrace());
	       }
	       
	  
	       Thread.sleep(2000);
	       driver.quit();
	   }
}
