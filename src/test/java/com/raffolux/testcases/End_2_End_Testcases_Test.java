/**
 * 
 */
package com.raffolux.testcases;



import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.raffolux.base.BaseClass;
import com.raffolux.pages.End_2_End_Testcases;
import com.raffolux.pages.SignUpPage;

/**
 * @author hp
 *
 */
public class End_2_End_Testcases_Test extends BaseClass
{
	End_2_End_Testcases end_2_End_Testcases;
	
	SignUpPage signUpPage;
	
	@Test
	public void Verify_By_Clicking_Raffolux_Link() throws Throwable
	{
		driver.get("https://sandbox.raffolux.com/");
		end_2_End_Testcases = indexPage.Clickon_RaffoluxLink();
	}
	
	@Test
	@Parameters({"First_Name", "Last_Name", "Email", "Country_Code", "Phone_Number", "Choose_Passward", "Confirm_Password" })
	public void Verify_Create_Account_Test(String First_Name, String Last_Name, String Email, String Country_Code, String Phone_Number,  String Choose_Passward, String Confirm_Password) throws Throwable
	{
		//driver.get("https://sandbox.raffolux.com/");
		//end_2_End_Testcases = indexPage.Clickon_RaffoluxLink();
		
		
		try
		{
			end_2_End_Testcases.Create_Account(First_Name, Last_Name, Email, Country_Code, Phone_Number, Choose_Passward, Confirm_Password);
			String ActualURL = driver.getCurrentUrl();
			Assert.assertEquals("https://sandbox.raffolux.com/", ActualURL, "User successfuilly signed_Up to the application");
			System.out.println("============================ Test Completed ===========================");
		}
		catch(Exception e)
		{
			System.out.println("==================================== Exception Alert ===================================" + e.getStackTrace());
		}
		
	}
	
	
}
