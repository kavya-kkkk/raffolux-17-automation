/**
 * 
 */
package practice_Java_Generics;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


/**
 * @author hp
 *
 */

public class Api_testing 
{
	@Test
	public void testResponseCode()
	{
	    /* URL for get request: https://github.com/rest-assured/rest-assured.git */
		//Response resp = RestAssured.get("https://reqres.in/API/users?page=2");
		//Response resp = RestAssured.post("https://oxyvbaqq74.execute-api.ap-south-1.amazonaws.com/dev/myData");
		Response resp = RestAssured.get("https://api.stackexchange.com/2.3/questions?pagesize=1&order"
				+ "=desc&sort=activity&site=stackoverflow");
		
		
		System.out.println(resp.prettyPrint());
		int code = resp.getStatusCode();   //200
		System.out.println("Status code is " + code);
		//System.out.println(resp.getBody().asString());
		Assert.assertEquals(code, 200);
	}
}
