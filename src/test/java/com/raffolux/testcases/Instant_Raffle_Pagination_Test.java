/**
 * 
 */
package com.raffolux.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.raffolux.base.BaseClass;
import com.raffolux.pages.HomePage;
import com.raffolux.pages.IndexPage;
import com.raffolux.pages.SignInPage;

/**
 * @author hp
 *
 */
public class Instant_Raffle_Pagination_Test extends BaseClass
{
	SignInPage signInPage;
	HomePage homePage;
	IndexPage indexpage;
	
	/*@Test(priority = 0, description = "Clicking the Next button of the Pagination", enabled = true)
	public void Click_on_Pagination_Next_Button() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the instant raffle pagination next button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
		
		signInPage = indexPage.ClickOnSigninLink();
		signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		instant_Raffle_Pagination_Page.Click_On_Enter_Now_Button();
		instant_Raffle_Pagination_Page.Scroll_Till_Pagination();
		
		String arr[] = {"3501","128","2946","2249","1277","3212","504","1179","500","4062"};
		,"2946","1030","1179","2851","1321","3040","500",
				"1277","128","5427","1988","3607","3040","5541","1030","2249","504","6727","2946","9953","3501","3040","3212",
				"504","9972","5901","5217","3553","5524","6395",
				"1060","1503","5787","5217","2916","2262","421","5144","1084","5397","2916","4097","20",
				"1182","38","4070","5918","1075","4256","8973",
				"8833","1084","4256","8973","6685","713","7922","4105","7181","5918","6685","5918","421",
				"2916","5680","3104","4097","749","7181","6549","5447","5144","8833","8861","2307",
				"5891","6649","3724","3468","6584","3724","2965","679","2950","3223","3091",
				"2261","7825","3468","5104","6584","6649","5104","2261","2965","5371","6620","3413","3953","5891","6649","6584","314",
				"1291","2261","2965","5261","8168","6620","3413","5143","6584","1291",
				"2261","488","1830","3082","6778","456","1139","3787","6805","154","1294","5775","2963","4507",
				"1493","2685","6222","5887","5775","4507","1906","7432","6882","4037","1878","2685","1376",};*/
		
		
			
		/*instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
		Thread.sleep(2000);
		instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Prev_Button();
		Thread.sleep(3000);
		
		for(int j=0; j<500; j++)
		{
			instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
			Thread.sleep(2000);
			instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Prev_Button();
			Thread.sleep(3000);
			
		String text1 = instant_Raffle_Pagination_Page.ValidateFirst_Prize_Text_in_the_All_Prizes();
		String text2 = instant_Raffle_Pagination_Page.ValidateSecond_Prize_in_the_All_Prizes();
		String text3 = instant_Raffle_Pagination_Page.ValidateThird_Prize_in_the_All_Prizes();
		String text4 = instant_Raffle_Pagination_Page.ValidateFourth_Prize_in_the_All_Prizes();
		String text5 = instant_Raffle_Pagination_Page.ValidateFifth_Prize_in_the_All_Prizes();
		String text6 = instant_Raffle_Pagination_Page.ValidateSixth_Prize_in_the_All_Prizes();
		String text7 = instant_Raffle_Pagination_Page.ValidateSeventh_Prize_in_the_All_Prizes();
		String text8 = instant_Raffle_Pagination_Page.ValidateEigth_Prize_in_the_All_Prizes();
		String text9 = instant_Raffle_Pagination_Page.ValidateNineth_Prize_in_the_All_Prizes();
		String text10 = instant_Raffle_Pagination_Page.ValidateTenth_Prize_in_the_All_Prizes();
		
		String arr1[] = {text1,text2,text3,text4,text5,text6,text7,text8,text9,text10}; /*
		
		
		/*for(int j=0; j<10; j++)
		{
			//String text = instant_Raffle_Pagination_Page.ValidateFirst_Prize_Text_in_the_All_Prizes();
			if(text.equals(String.valueOf(arr[j])))
			{
				System.out.println(text + "===================this ticket is displayed in the first page=================");
			}
			else
			{
				System.out.println(text + "this ticket is Not displayed in the first page");
			}
		}*/
		
			
		/*for(int k=0; k<10; k++)
		{
			//String text = instant_Raffle_Pagination_Page.ValidateFirst_Prize_Text_in_the_All_Prizes();
			if(arr1[k].equals(String.valueOf(arr[j])))
			{
				System.out.println( arr1[j] + "===================this ticket is displayed in the first page=================");
			}
			else
			{
				System.out.println( arr1[j] + "this ticket is Not displayed in the first page");
			}
		}
		   instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
		}
		
		
		/*for(int i=0; i<=51; i++)
		{
			String arr[] = {"3501","128","2946","2249","1277","3212","504","1179","500","4062"};
			instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
			String text = instant_Raffle_Pagination_Page.ValidateFirst_Prize_Text_in_the_All_Prizes();
			for(int j=0; j<=10; j++)
			{
				if(text == arr[j])
				{
					System.out.println(text + "this ticket is displayed in the first page");
				}
			}
		}*/
	
	@Test(priority = 0, description = "Clicking the Next button of the Pagination", enabled = true)
	public void Click_on_Pagination_Next_Button() throws Throwable
	{
		ExtentTest test = extent.createTest("Verify by clicking the instant raffle pagination next button").assignAuthor("Dharma")
				.assignCategory("Functional testing").assignDevice("Windows");
	
		
		signInPage = indexPage.ClickOnSigninLink();
		signInPage.Signin(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		instant_Raffle_Pagination_Page.Click_On_Enter_Now_Button();
		Thread.sleep(3000);
		instant_Raffle_Pagination_Page.Scroll_Till_Pagination();
		Thread.sleep(3000);
		
		String arr[] = {"16321","23621","6420","36070","26594","38053","33026","1701","15634","27657","32223","35027","12835","21848","31977",
				"34396","39774","14438","25502","11265","25613","33145",
				"1632","29344","35488","22919","28511","32850","4522","27576"};
		 
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
		
	    boolean flag = instant_Raffle_Pagination_Page.ValidateInstant_Raffle_Pagination_Next_Button();
	    
	    if(flag == true)
	    {
		instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
		Thread.sleep(3000);
		instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Prev_Button();
		Thread.sleep(3000);
	    }
	    
		/*String arr[] = {"16321","23621","6420","36070","26594","38053","33026","1701","15634","27657","32223","35027","12835","21848","31977",
				"34396","39774","14438","25502","11265","25613","33145",
				"1632","29344","35488","22919","28511","32850","4522","27576"};*/
		
		instant_Raffle_Pagination_Page.Validate_Scroll_Page0();
		String text1 = instant_Raffle_Pagination_Page.ValidateFirst_Prize_Text_in_the_All_Prizes();
		String text2 = instant_Raffle_Pagination_Page.ValidateSecond_Prize_in_the_All_Prizes();
		String text3 = instant_Raffle_Pagination_Page.ValidateThird_Prize_in_the_All_Prizes();
		String text4 = instant_Raffle_Pagination_Page.ValidateFourth_Prize_in_the_All_Prizes();
		String text5 = instant_Raffle_Pagination_Page.ValidateFifth_Prize_in_the_All_Prizes();
		String text6 = instant_Raffle_Pagination_Page.ValidateSixth_Prize_in_the_All_Prizes();
		String text7 = instant_Raffle_Pagination_Page.ValidateSeventh_Prize_in_the_All_Prizes();
		String text8 = instant_Raffle_Pagination_Page.ValidateEigth_Prize_in_the_All_Prizes();
		String text9 = instant_Raffle_Pagination_Page.ValidateNineth_Prize_in_the_All_Prizes();
		String text10 = instant_Raffle_Pagination_Page.ValidateTenth_Prize_in_the_All_Prizes();
		instant_Raffle_Pagination_Page.Validate_Scroll_Page1();
		String text11 = instant_Raffle_Pagination_Page.ValidateEleven_Prize_Text_in_the_All_Prizes();
		String text12 = instant_Raffle_Pagination_Page.ValidateTwelve_Prize_Text_in_the_All_Prizes();
		String text13 = instant_Raffle_Pagination_Page.ValidateThirteen_Prize_Text_in_the_All_Prizes();
		String text14 = instant_Raffle_Pagination_Page.ValidateFourteen_Prize_Text_in_the_All_Prizes();
		String text15 = instant_Raffle_Pagination_Page.ValidateFifteen_Prize_Text_in_the_All_Prizes();
		instant_Raffle_Pagination_Page.Validate_Scroll_Page2();
		String text16 = instant_Raffle_Pagination_Page.ValidateSixteen_Prize_Text_in_the_All_Prizes();
		String text17 = instant_Raffle_Pagination_Page.ValidateSeventeen_Prize_Text_in_the_All_Prizes();
		String text18 = instant_Raffle_Pagination_Page.ValidateEighteen_Prize_Text_in_the_All_Prizes();
		String text19 = instant_Raffle_Pagination_Page.ValidateNineteen_Prize_Text_in_the_All_Prizes();
		String text20 = instant_Raffle_Pagination_Page.ValidateTwenty_Prize_Text_in_the_All_Prizes();
		instant_Raffle_Pagination_Page.Validate_Scroll_Page3();
		String text21 = instant_Raffle_Pagination_Page.ValidateT_one_Prize_Text_in_the_All_Prizes();
		String text22 = instant_Raffle_Pagination_Page.ValidateT_two_Prize_Text_in_the_All_Prizes();
		String text23 = instant_Raffle_Pagination_Page.ValidateT_three_Prize_Text_in_the_All_Prizes();
		String text24 = instant_Raffle_Pagination_Page.ValidateT_four_Prize_Text_in_the_All_Prizes();
		String text25 = instant_Raffle_Pagination_Page.ValidateT_Five_Prize_Text_in_the_All_Prizes();
		String text26 = instant_Raffle_Pagination_Page.ValidateT_Six_Prize_Text_in_the_All_Prizes();
		String text27 = instant_Raffle_Pagination_Page.ValidateT_Seven_Prize_Text_in_the_All_Prizes();
		String text28 = instant_Raffle_Pagination_Page.ValidateT_Eight_Prize_Text_in_the_All_Prizes();
		String text29 = instant_Raffle_Pagination_Page.ValidateT_Nine_Prize_Text_in_the_All_Prizes();
		String text30 = instant_Raffle_Pagination_Page.ValidateThirty_Prize_Text_in_the_All_Prizes();
		
		Thread.sleep(3000);
		
		String arr1[] = {text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,
				text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,
				text21,text22,text23,text24,text25,text26,text27,text28,text29,text30};
		
			
			for(int j=0; j<arr1.length; j++)
			{
				try
				{
					if(arr[i].equals(arr1[j]))
					{
						count++;
						System.out.println(arr[i]);
						System.out.println("==================================== You have woned this ticket number ==================================: "+ arr[i]);
					}
					/*else
					{
						System.out.println("You haven't woned any ticket number :"+ arr[i]);
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					System.out.println("Exception Alert");
				}
				
				
			}
			
			//instant_Raffle_Pagination_Page.Click_On_Instant_Raffle_Pagination_Next_Button();
			//Thread.sleep(3000);
		} 
		System.out.println(count);
	}
	
}




