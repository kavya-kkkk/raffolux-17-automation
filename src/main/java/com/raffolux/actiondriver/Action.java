 /**
 * 
 */
package com.raffolux.actiondriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;


import com.aventstack.extentreports.ExtentTest;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 * " All the Element Utils are present in this Actions class "...
 *
 *
 */
public class Action extends BaseClass {
	
	
	// To write the Testcase description for each and every test script 
	public static ExtentTest Test_Description(String test_Name, String Author_Name, String Test_Category_Name, String Device_Name)
	{
		ExtentTest test = extent.createTest(test_Name).assignAuthor(Author_Name)
		.assignCategory(Test_Category_Name).assignDevice(Device_Name);
		
		return test;
	}
	
	// Take ScreenShot Method
	
	public static String CaptureScreenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(".\\resources\\homepage2 " + System.currentTimeMillis() + ".png");
		// Always end with .png in order to get the Screenshot as image
		String absolutpathlocation = destinationfile.getAbsolutePath();
		FileUtils.copyFile(srcfile, destinationfile);
		return absolutpathlocation;
	}

	//To scroll till the specified element : scrollByVisibilityOfElement
	
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	

	//To click on any of the element (Using Actions class )
	
	public static boolean Click(WebDriver ldriver, WebElement LocatorName) throws Exception {
		boolean flag = false;
		try {
			/*
			 * WebElement element = driver.findElement(locator);
			 *  JavascriptExecutor executor
			 * = (JavascriptExecutor) driver;
			 * executor.executeScript("arguments[0].click();", ele);
			 */
			Actions act = new Actions(ldriver)  ;
			act.moveToElement(LocatorName).click().build().perform();
			flag = true;

		} catch (Exception e) {
			
			System.out.println("======================= Exception ALert ================================ "+ e);
			throw e;
		} finally {
			if (flag) {
				System.out.println("Click action is performed");

			} else if (!flag) {
				System.out.println("Click action is not performed");

			}
		}
		return flag;
	}
	
	

	//To Find the element in the webpage
	
	public static boolean findElement(WebDriver ldriver, WebElement ele) throws Throwable {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			if (flag) {
				System.out.println("Successfully found element at");
			} else {
				System.out.println("Unable to found element at");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("===========================Exception Alert ========================in find element123");
			System.out.println("Unable to found element at");
		}
		return flag;
	}
	
	

	//To Check whether the element is displayed or not 
	
	public static boolean isDisplayed(WebDriver ldriver, WebElement ele) throws Throwable {
		boolean flag = false;
		flag = findElement(ldriver, ele);
		if (flag) {
			flag = ele.isDisplayed();
			if (flag) {
				System.out.println("Element is dispalyed");

			} else {
				System.out.println("Element is not dispalyed");
			}
		} else {
			System.out.println("Unable to found element at");

		}
		return flag;
	}
	
	
    //To check whether the element is selected or not
	
	public static boolean isSelected(WebDriver ldriver, WebElement ele) throws Throwable {
		boolean flag = false;
		flag = findElement(ldriver, ele);
		if (flag) {
			flag = ele.isSelected();
			if (flag) {
				System.out.println("Element is Selected");
			} else {
				System.out.println("Element is not Selected");
			}
		} else {
			System.out.println("Unable to found element at");
		}
		return flag;
	}
	
	
    //To check whether the element is Enabled or not 
	
	public static boolean isEnabled(WebDriver ldriver, WebElement ele) throws Throwable {
		boolean flag = false;
		flag = findElement(ldriver, ele);
		if (flag) {
			flag = ele.isEnabled();
			if (flag) {
				System.out.println("Element is Enabled");
			} else {
				System.out.println("Element is not Enabled");
			}
		} else {
			System.out.println("Unable to found element at");
		}
		return flag;
	}
	
	
    //To Enter input data into the text field
	
	public static boolean type(WebElement ele, String text) throws Throwable {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// Logger.info("Entered text "+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not Found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to entere value");
			}

		}
		return flag;

	}
	
	
    //To Enter Date data into the text field
	
	public static boolean type1(WebElement ele, CharSequence[] date) throws Throwable {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(date);
			// Logger.info("Entered text "+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not Found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to entere value");
			}

		}
		return flag;
	}
	
	
	//Need to be checked 

	public static boolean selectBySendkeys(WebElement ele, String value) throws Throwable {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Select value from the Dropdown");
			} else {
				System.out.println("Not Selected value from the Dropdown");
			}

		}
	}
	
	
    // To Select the element from the dropdown by "index"
	
	public static boolean selectByIndex(WebElement element, int index) throws Throwable {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
            
			flag = true;
			return true;
		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "=========================== Exception Alert ==========================");
			return false;
		} finally {
			if (flag) {
				System.out.println("Option Selected by index");
			} else {
				System.out.println("Option not Selected by index");
			}

		}
	}
	
	
	// To Select the element from the dropdown by "Value"

	public static boolean selectByValue(WebElement element, String value) throws Throwable {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByValue(value);

			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option Selected by value");
			} else {
				System.out.println("Option not Selected by value");
			}

		}
	}
	
	
	// To Select the element from the dropdown by "Visible Text"

	public static boolean selectByVisibleText(String visibletext, WebElement ele) throws Throwable {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);

			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option Selected by visibletext");
			} else {
				System.out.println("Option not Selected by visibletext ");
			}

		}
	}
	
	

	// this method not implimented completely yet
	
	public static boolean mouseHoverByJavaScript(WebElement locator) throws Throwable {
		boolean flag = false;
		return flag;
	}

	
	// To Click the element by "Java Script" 
	
	public static boolean JSClick(WebDriver driver, WebElement ele) throws Throwable {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			flag = true;

		} catch (Exception e) {
			System.out.println("======================= Exception Alert =================" + e.getStackTrace());
			
		} finally {
			if (flag) {
				System.out.println("Click action is performed");

			} else if (!flag) {
				System.out.println("Click action is not performed");
			}
		}
		return flag;
	}
	
	

	// this method not implimented completely yet
	
	public static boolean switchToFrameByIndex(int index) throws Throwable {
		boolean flag = false;
		try {
			// new WebDriverWait(driver, 15)
			flag = true;

		} catch (Exception e) {
			throw e;
		} finally {
			if (flag) {
				System.out.println("Click action is performed");
			} else if (!flag) {
				System.out.println("Click action is not performed");
			}
		}
		return flag;
	}
	
	

	//To switch from one frame to another by "IdValue"
	
	public static boolean switchToFrameById(String idValue) throws Throwable {
		boolean flag = false;
		try {

			driver.switchTo().frame(idValue);
			flag = true;
			return true;

		} catch (Exception e) {
			System.out.println("========================= Exception Alert ===========================" + e.getStackTrace());
			
			return false;
		} finally {
			if (flag) {
				System.out.println("frame with id" + idValue + "is selected");
			} else if (!flag) {
				System.out.println("frame with id" + idValue + "is not selected");
			}
		}

	}
	
	
	//To switch from one frame to another by "NameValue"

	public static boolean switchToFrameByName(String NameValue) throws Throwable {
		boolean flag = false;
		try {
			// new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(null));
			driver.switchTo().frame(NameValue);
			flag = true;
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("frame with id\"" + NameValue + "is selected");
			} else if (!flag) {
				System.out.println("frame with id\"" + NameValue + "is not selected");
			}
		}

	}
	
	
	//To switch to "Default frame"...

	public static boolean switchToDefaultFrame() throws Throwable {
		boolean flag = false;
		try {
			// new WebDriverWait(driver, 15)
			driver.switchTo().defaultContent();
			flag = true;
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				// System.out.println("frame with id\""+ NameValue +"is selected");
			} else if (!flag) {
				// System.out.println("frame with id\""+ NameValue +"is not selected");
			}
		}

	}
	
	
	//To Mouse Hover Over any of the Element
	
	public static boolean mouseOverElement(WebElement element) throws Throwable {
		boolean flag = false;
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			
			System.out.println("====================== Exception Alert =================" + e.getStackTrace());
		} finally {
			if (flag) {
				System.out.println("mouse hover action is performed");
			} else {
				System.out.println("mouse hover action is not performed");
			}

		}
		return flag; 
	}
	
	//Added by me
    
	//To Flash on any of the WebELement 
	
	public static void Flash(WebElement element, WebDriver driver) {
		String bgcolor = element.getCssValue("backgroundColor"); // Assume Green

		for (int i = 0; i < 500; i++) {
			changeColor("#000000", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	
	//To Change the colour of any of the WebElement

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	//To Draw border line to any of the WebElement

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red' ", element);
	}
	
	
	//To get the Title of the page by "Java script"

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	
	//To Click on the element by "Java Script"....

	public static void ClickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	
	//To Generate the "Alerts" by "Java Script"....

	public static void generateAlerts(WebDriver driver, String Message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + Message + "')");
	}
	
	
	
	//To Refresh the browser by "Java Script"....

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	
	//To Scroll the page till specified element by "Java Script"....

	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	//To Scroll the page till bottom by "Java Script"....

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	

}
