package com.training.restApi;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class ApiAutomation {
	
	
	String sHosturl= "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/";
	String sEPLogin = "login";
	String sEPGetData = "getdata";
	String sURI = "";
	String token;
	Response response;
	
	@Test(priority=1)
	public void login() {
		sURI=sHosturl+sEPLogin;
		System.out.println(sURI);
		RestAssured.baseURI=sURI;
		
		
		
		response =RestAssured.given().body("{}").when().contentType("application/json").post();
		System.out.println(response.asString());
		System.out.println(response.asPrettyString());
		int status = response.getStatusCode();
		System.out.println(status);
		token = response.jsonPath().get("token[0]");
		System.out.println(token);
		
	}
	
	@Test(priority=2)
	public void getData() {
		sURI=sHosturl+sEPGetData;
		RestAssured.baseURI=sURI;
		HashMap<String, String> headerData = new HashMap<String, String>();
		headerData.put("Content-Type", "application/json");
		headerData.put("token", token);
		response = RestAssured.given().headers(headerData).get();
		System.out.println(response.asPrettyString());
		
		List<Object> accountno= response.jsonPath().getList("accountno");
			
		for(Object accountnumber :accountno ) {
			System.out.println(accountnumber);
		}
		
		//String ActualaccountNum= response.jsonPath().get("accountno[0]");
		//System.out.println(ActualaccountNum);
		String expectedValue="TA-7891788";
		/*     Hardcoding 
		 *     put in the property file
		 *     excelsheet - read the excel and compare with the response
		 *     from database. 
		 *     json file 
		 * 
		 */
		response.then().body("accountno[0]", equalTo(expectedValue));
		
	}

}
