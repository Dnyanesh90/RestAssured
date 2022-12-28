package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo6 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		Response resp =httpRequest.request(Method.GET,"/posts/16");
		
		System.out.println(resp.getStatusCode());
		
		System.out.println(resp.getStatusLine());
		
		System.out.println(resp.getBody().asString());
	
	}

}
