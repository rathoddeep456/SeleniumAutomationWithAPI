package stepDefinations;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APICall {
	
	public String GetMethod(String URL) {
		RestAssured.baseURI = URL ;
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"/Ahmedabad");
		String responseBody = response.getBody().asString();
		
		return responseBody;
	}

}
