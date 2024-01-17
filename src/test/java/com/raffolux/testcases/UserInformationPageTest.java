/**
 * 
 */
package com.raffolux.testcases;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.ProfilePop_up;
import com.raffolux.pages.SignInPage;
import com.raffolux.pages.UserInformationPage;

/**
 * @author hp
 *
 */
public class UserInformationPageTest extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	ProfilePop_up profilePop_up;
	UserInformationPage userInformationPage;
	
	@Test(priority = 0, enabled = true)
	public void UserInformationTest() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify the  UserInformationTest").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		 signInPage = indexPage.ClickOnSigninLink();
		 homePage = signInPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		 homePage.Click_On_User_profile_Logo();
		 userInformationPage = profilePop_up.ClickonPersonal_Info_Slide_Bar_Menu_Link();
		 
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int NoOfRows = sheet.getLastRowNum();
		
		System.out.println("The NO of records in the excell sheet " + NoOfRows);
		
		
		for(int i=1; i<=3; i++)
		{
			XSSFRow current_row = sheet.getRow(i);
			int DOB = (int)current_row.getCell(3).getNumericCellValue();
			String Email_Id = current_row.getCell(1).getStringCellValue();
			long Phone_Number = (long)current_row.getCell(2).getNumericCellValue();
		    
			/*String First_Name = current_row.getCell(0).getStringCellValue();
		    String Last_Name = current_row.getCell(1).getStringCellValue();
		    String Choose_Password = current_row.getCell(4).getStringCellValue();
		    String Confirm_Password = current_row.getCell(5).getStringCellValue();*/
			 
		     userInformationPage.ValidateSaveChanges(String.valueOf(DOB), Email_Id, String.valueOf(Phone_Number));
		    // driver.navigate().refresh();
		     String actualUrl = driver.getCurrentUrl();
		     String ExpectedUrl = "https://sandbox.raffolux.com/verify/sk0085974@gmail.com/";
		     String ExpectedUrl1 = "https://sandbox.raffolux.com/verify/rabrooh21@gmail.com/";

		     String ExpectedUrl2 = "https://sandbox.raffolux.com/verify/testraffel@gmail.com/";

		     String ExpectedUrl3 = "https://sandbox.raffolux.com/verify/wingsfire21@gmail.com/";

		     if(actualUrl.equals(ExpectedUrl) || actualUrl.equals(ExpectedUrl1) || actualUrl.equals(ExpectedUrl2) || actualUrl.equals(ExpectedUrl3))
		     {
		    	 test.pass("SixDigitCodeTextBox is successfully Displayed  :"+actualUrl);
		    	 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		     }
		     else
		     {
		    	 test.fail("SixDigitCodeTextBox is not Displayed   :"+actualUrl);
		    	 test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
		     }
		     
		}
		
	}

}
