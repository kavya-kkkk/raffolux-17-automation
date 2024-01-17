package com.raffolux.testcases;



import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.raffolux.actiondriver.Action;
import com.raffolux.base.BaseClass;

public class Test1 extends BaseClass{
	
	
	public static void main(String []args)
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
	

	
	}


	
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

}
