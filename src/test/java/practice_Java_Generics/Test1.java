package practice_Java_Generics;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.SignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 extends BaseClass{
	
	SignInPage signInPage;
	HomePage homePage;
	
	
	/*@Test
	public void HandleConfirmationMesage() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the MyRafflePage2Url").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		 
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"8178\"]/div[2]/span/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"desktop-mutation-enter\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'   view cart')]")).click();
		
		 Thread.sleep(2000);
		// Alert alert = driver.switchTo().alert();
		 //alert.accept();
		 
	}
	
	/*public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		if(num%2 == 0) // Ex: 20
		{
		System.out.println("Even number "+ num);
		}
		else
		{
		System.out.println("Odd number "+ num);
		}

		}
	/*public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the student details ");
	
	System.out.println("Enter the student name"); //String
	String name = sc.next();

	System.out.println("Enter the student roll_no"); //int
	int roll_no = sc.nextInt();

	System.out.println("Enter the student Marks"); //double
	double Marks = sc.nextDouble();

	System.out.println("Enter the student Grade"); //character
	char grade = sc.next().charAt(0);

	System.out.println("Welcome to the student database   :"); 

	System.out.println("The student name is  "+ name); 
	System.out.println("The student roll_no is  " +roll_no ); 
	System.out.println("The student Marks are  " + Marks );
	System.out.println("The student Grade  is  " +grade ); 
	

	
	}*/


	
	/*@Test
	public static boolean isDisplayed(WebDriver ldriver, WebElement ele) throws Throwable
	{
		boolean flag = false;
		Action a = new Action();
		flag = a.findElement(ldriver,ele);
		if(flag)
		{
			 flag = ele.isDisplayed();
			 if(flag)
			 {
				 System.out.println("Element is dispalyed");	 
				
			 }
			 else
			 {
				 System.out.println("Element is not dispalyed");
			 }
		}
		else
		{
			System.out.println("Not Displayed");
			
		}
		return flag;
	}*/
	
	
	public static void main(String[] args) throws InterruptedException {
	     
		  WebDriverManager.chromedriver().setup();
		 
	      WebDriver driver = new ChromeDriver();
	      Thread.sleep(1000);
	      driver.manage().window().maximize();
	      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      // wait of 5 seconds
	     // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      // Keys.Chord string
	      String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	      driver.findElement(
	      By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
	      Thread.sleep(1000);
	      // hold all window handles in array list
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of parent window: " + driver.getTitle());
	      driver.quit();
	   }

}
