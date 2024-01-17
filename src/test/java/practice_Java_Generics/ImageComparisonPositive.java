/**
 * 
 */
package practice_Java_Generics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

/**
 * @author hp
 *
 */
public class ImageComparisonPositive 
{
	WebDriver driver;
    
    @Test
    public void imageComaparision() throws IOException
    {
        //System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
    	WebDriverManager.firefoxdriver().setup();
    	driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
         
        WebElement logoImage = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
         
        BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"\\Images\\ElementScreenshot.png"));
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImage);
        BufferedImage actualImage = logoImageScreenshot.getImage();
                 
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
        Assert.assertFalse(diff.hasDiff(),"Images are Same");
                 
        driver.quit();
    }
}
