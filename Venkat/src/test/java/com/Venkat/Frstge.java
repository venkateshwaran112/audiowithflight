package com.Venkat;

import javax.xml.ws.Response;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class Frstge {

	public static void main(String[] args) {
		String s="{\r\n" + 
				
				"        \"firstname\":\"venki\",\r\n" + 
				"        \"lastname\" :\"vasssssssssss\",\r\n" + 
				"        \"email\" : \"vasumuru58@gmail.com\"\r\n" + 
				"    }";
		io.restassured.response.Response res = RestAssured.given().baseUri("http://localhost:3000/").header("Content-Type", "application/json").body(s).when().post("/employees");
//		io.restassured.response.Response res = RestAssured.given().baseUri("http://localhost:3000/").when().delete("/employees");

		System.out.println(res.getStatusCode());
//	     System.out.println(res.asString());
//		RestAssured.baseURI="http://localhost:3000/";
//		RequestSpecification httpReques = RestAssured.given();
//		io.restassured.response.Response response= httpReques.get("/employees");
//		System.out.println("Response body" +response.asString());
		
	}
}
