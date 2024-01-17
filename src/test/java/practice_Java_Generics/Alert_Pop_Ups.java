/**
 * 
 */
package practice_Java_Generics;

import org.openqa.selenium.Alert;

/**
 * @author hp
 *
 */
public class Alert_Pop_Ups 
{
	
	driver.findElement(By.id("alert-button")).click();

	// Switch to the alert
	Alert alert = driver.switchTo().alert();

	// Get the text of the alert and print it
	String alertText = alert.getText();
	//System.out.println("Alert text: " + alertText);

	// Accept the alert
	alert.accept();
	
	

}
