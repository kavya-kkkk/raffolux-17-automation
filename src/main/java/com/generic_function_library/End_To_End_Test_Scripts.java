/**
 * 
 */
package com.generic_function_library;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

/**
 * @author hp
 *
 */
public class End_To_End_Test_Scripts extends BaseClass{

	@Test
	public void Verify_SignUp_Or_Register_Account() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify_SignUp_Or_Register_Account").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		driver.get("https://sandbox.raffolux.com/");
		
		signUpPage = indexPage.ClickonRaffoluxLink();
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\RaffoluxProject\\SignUpdata2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int NoOfRows = sheet.getLastRowNum();
		
		System.out.println(" The NO of records in the excell sheet " + NoOfRows);
		
		
		for(int i=1; i<3; i++)
		{
			 XSSFRow current_row = sheet.getRow(i);
			 
		    String First_Name = current_row.getCell(0).getStringCellValue();
		    String Last_Name = current_row.getCell(1).getStringCellValue();
		    String Email_Id = current_row.getCell(2).getStringCellValue();
		    long Phone_Number = (long)current_row.getCell(3).getNumericCellValue();
		    String Choose_Password = current_row.getCell(4).getStringCellValue();
		    String Confirm_Password = current_row.getCell(5).getStringCellValue();
		    
		    signUpPage.CreateAccount(First_Name, Last_Name, Email_Id, String.valueOf(Phone_Number), Choose_Password, Confirm_Password);
		    String actualUrl =  driver.getCurrentUrl();
		    String expectedUrl = "https://raffolux.com/";
		    
			if(actualUrl.equals(expectedUrl))
			{
				test.pass("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
			}
			else
			{
				test.fail("actualUrl :"+ actualUrl + "is matching with the expectedUrl :"+ expectedUrl);
				test.addScreenCaptureFromPath(Action.CaptureScreenshot(driver));
			}	 
		}
}
