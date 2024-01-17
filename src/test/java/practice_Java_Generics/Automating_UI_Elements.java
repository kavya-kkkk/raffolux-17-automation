package practice_Java_Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.raffolux.actiondriver.Action;

/**
 * 
 */

/**
 * @author hp
 *
 */
public class Automating_UI_Elements {
	
		    private WebDriver driver;

		    @BeforeClass
		    public void setUp() throws Throwable {
		        FirefoxOptions options = new FirefoxOptions();
		        options.setCapability("marionette", true);
		        driver = new FirefoxDriver(options);
		        driver.get("https://raffolux.invisionapp.com/console/Raffolux-Web-ckki6uvla0d7m016mguwvb9x9/clbzcwk5c3a6401bxdk1190qc/inspect");
		        //driver.get("https://sandbox.raffolux.com/");
		        // Navigate to your login page and log in here
		       // driver.findElement(By.linkText("Sign in")).click();
		        driver.findElement(By.name("email")).sendKeys("Dharmaveera.Devaputra@rhibhus.com");
		    	//driver.findElement(By.name("username")).sendKeys("Dharmaveera.Devaputra@rhibhus.com");
		        driver.findElement(By.name("password")).sendKeys("Dharma@8103");
		    	//driver.findElement(By.name("password")).sendKeys("Dharma@8103");
		        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		    	//driver.findElement(By.xpath("//button[@class='primary-btn-18 w-100 mt-0 py-2']")).click();
		        WebElement ele = driver.findElement(By.xpath("(//i[@class='fal fa-user-circle colour-default-accent'])[2]"));
		        Action.JSClick(driver, ele);
		        WebElement ele1 = driver.findElement(By.xpath("(//div[@class='col-6 d-flex align-items-center'])[2]"));
		        Action.JSClick(driver, ele1);
		        
		    	System.out.println("Successfully Clicked on points store icon");
		    }
		    
		    @Test
		    public void Get_Ponts_Store_Font_Size()
		    {
		    	WebElement ele = driver.findElement(By.xpath("(//div[@class='col-6 d-flex align-items-center'])[2]"));
		    	String font_size = ele.getCssValue("font-size");
		    	System.out.println(" =====================  The font size of the Raffolux logo is =================== " + font_size);
		    	String expected_Font_Size = "26px";
		    	if(font_size == expected_Font_Size)
		    	{
		    	    System.out.println("Both actual and expected font_size is same");
		    	}
		    	else
		    	{
		    		System.out.println("Both actual and expected font_size is not same");
		    	}
		    }
		    
		    /*@Test
		    public void Get_Arrow_Symbol_Location()
		    {
		    	WebElement ele = driver.findElement(By.xpath("//i[@class='fas fa-solid fa-arrow-left desk-store-hide']"));
		    	Point loc = ele.getLocation();
		    	System.out.println("================ The location of the Arrow_Symbol  is ======================" + loc);
		    	int x = loc.getX();
		    	System.out.println("The Value of the  'x' is " + x);
		    	int y = loc.getY();
		    	System.out.println("The Value of the  'y' is " + y);
		    }
		    
		    @Test
		    public void Get_Join_Raffolux_Text()
		    {
		    	WebElement ele = driver.findElement(By.xpath("//a[@class='primary-btn-reg-round d-none d-sm-inline-block']"));
		    	String text = ele.getText();
		    	System.out.println("============ The Join Raffolux text is ===================" + text);
		    }*/
		    
		    
		    @Test
		    public void Get_color_of_Raffolux_Logo()
		    {
		    	WebElement ele = driver.findElement(By.xpath("(//div[@class='col-6 d-flex align-items-center'])[2]"));
		    	String color = ele.getCssValue("color");
		    	System.out.println(" ================ The color of Raffolux_Logo is  =================" + color);
		    	String expected_color = "26px";
		    	if(color == expected_color)
		    	{
		    	    System.out.println("Both actual and expected color is same");
		    	}
		    	else
		    	{
		    		System.out.println("Both actual and expected color is not same");
		    	}
		    }
		    
		    @Test
		    public void Get_Size_Of_Points_Store_text()
		    {
		    	WebElement ele = driver.findElement(By.xpath("(//div[@class='col-6 d-flex align-items-center'])[2]"));
		    	Dimension size = ele.getSize();
		    	System.out.println(" ================ The Size of Points_Store text is  =================" + size);
		    	
		    }
		    

		   /* @Test
		    public void testScript1() throws InterruptedException {
		        // Your first test script
		    	System.out.println("1St");
		    	driver.findElement(By.xpath("//*[@id=\"mainMenuContent\"]/ul/li[1]/a")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.id("raffolux-logo")).click();
		    }

		    @Test
		    public void testScript2() throws InterruptedException {
		        // Your second test script
		    	System.out.println("2nd");
		    	driver.findElement(By.xpath("//*[@id=\"mainMenuContent\"]/ul/li[2]/a")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.id("raffolux-logo")).click();
		    }

		    @Test
		    public void testScript3() throws InterruptedException {
		        // Your third test script
		    	System.out.println("3rd");
		    	driver.findElement(By.xpath("//*[@id=\"mainMenuContent\"]/ul/li[2]/a")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.id("emailAddress")).sendKeys("Dharmaveera.Devaputra@rhibhus.com");
		    	
		    }
		    
		    @Test
		    public void testScript4() throws InterruptedException {
		        // Your third test script
		    	System.out.println("4th");
		    	driver.findElement(By.id("Password")).sendKeys("Dharma@8103");
		    	
		    }*/
		    
		    

		    @AfterClass
		    public void tearDown() {
		        driver.quit();
		    }
	

}
